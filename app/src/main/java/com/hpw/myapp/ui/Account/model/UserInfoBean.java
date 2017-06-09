package com.hpw.myapp.ui.Account.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/6/7.
 */

public class UserInfoBean implements Parcelable {

    private String userId;
    private String nickname;
    private int have_shop;
    private String token;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHave_shop() {
        return have_shop;
    }

    public void setHave_shop(int have_shop) {
        this.have_shop = have_shop;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userId);
        dest.writeString(this.nickname);
        dest.writeInt(this.have_shop);
        dest.writeString(this.token);
    }

    public UserInfoBean() {
    }

    protected UserInfoBean(Parcel in) {
        this.userId = in.readString();
        this.nickname = in.readString();
        this.have_shop = in.readInt();
        this.token = in.readString();
    }

    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() {
        @Override
        public UserInfoBean createFromParcel(Parcel source) {
            return new UserInfoBean(source);
        }

        @Override
        public UserInfoBean[] newArray(int size) {
            return new UserInfoBean[size];
        }
    };
}
