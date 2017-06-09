package com.hpw.myapp.ui.Account.model;

import com.hpw.mvpframe.data.net.RxService;
import com.hpw.mvpframe.utils.helper.RxUtil;
import com.hpw.myapp.api.UserInfoApi;
import com.hpw.myapp.ui.Account.contract.UserContract;

import rx.Observable;

/**
 * Created by Administrator on 2017/6/7.
 */

public class UserModel implements UserContract.LoginModel {
    @Override
    public Observable<UserInfoBean> loginMethod(String userAccount, String password) {
        return RxService.createApi(UserInfoApi.class).loginMethod(userAccount,password).compose(RxUtil.rxSchedulerHelper());
    }
}
