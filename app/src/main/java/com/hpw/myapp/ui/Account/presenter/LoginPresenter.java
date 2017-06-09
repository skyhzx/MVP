package com.hpw.myapp.ui.Account.presenter;

import com.hpw.myapp.ui.Account.contract.UserContract;

/**
 * Created by Administrator on 2017/6/7.
 */

public class LoginPresenter extends UserContract.UserLoginPresenter {
    @Override
    public void login(String userAccount, String userPassword) {
        mRxManager.add(mModel.loginMethod(userAccount,userPassword).subscribe(
                themeChildListBean -> mView.showContent(themeChildListBean),
                e -> mView.showError("数据加载失败ヽ(≧Д≦)ノ")
        ));
    }

    @Override
    public void onStart() {

    }
}
