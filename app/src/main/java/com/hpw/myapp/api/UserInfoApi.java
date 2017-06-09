package com.hpw.myapp.api;

import com.hpw.myapp.ui.Account.model.UserInfoBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2017/6/7.
 */

public interface UserInfoApi  {
    @FormUrlEncoded
    @POST("/api/api160/User/userLogin")
    Observable<UserInfoBean> loginMethod(@Field("userAccout")String account, @Field("userPassword")String userPassword);
}
