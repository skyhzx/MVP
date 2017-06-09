package com.hpw.myapp.ui.Account.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.hpw.mvpframe.base.CoreBaseActivity;
import com.hpw.myapp.R;
import com.hpw.myapp.ui.Account.contract.UserContract;
import com.hpw.myapp.ui.Account.model.UserInfoBean;
import com.hpw.myapp.ui.Account.model.UserModel;
import com.hpw.myapp.ui.Account.presenter.LoginPresenter;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/6/7.
 */

public class LoginActivity extends CoreBaseActivity<LoginPresenter, UserModel> implements UserContract.UserLoginView ,View.OnClickListener{
    @BindView(R.id.save)
    TextView save;

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(getContext(),msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showContent(UserInfoBean info) {
        Toast.makeText(getContext(), info.getToken() + "gfgdfgfg", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getLayoutId() {
        return R.layout.login_layout;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        save.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if(v==save){
            mPresenter.login("15918508578","12345678");
        }
    }
}
