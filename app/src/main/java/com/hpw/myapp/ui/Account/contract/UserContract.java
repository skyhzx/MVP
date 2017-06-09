package com.hpw.myapp.ui.Account.contract;

import com.hpw.mvpframe.base.CoreBaseModel;
import com.hpw.mvpframe.base.CoreBasePresenter;
import com.hpw.mvpframe.base.CoreBaseView;
import com.hpw.myapp.ui.Account.model.UserInfoBean;

import rx.Observable;

/**
 * Created by Administrator on 2017/6/7.
 */

public interface UserContract {
    abstract  class UserLoginPresenter extends CoreBasePresenter<LoginModel,UserLoginView>{
        public abstract void login(String userAccount,String userPassword);
    }

    interface LoginModel extends CoreBaseModel {
        Observable<UserInfoBean> loginMethod(String userAccount,String password);
    }

    interface  UserLoginView  extends CoreBaseView{
        void showContent(UserInfoBean info);
    }
}
