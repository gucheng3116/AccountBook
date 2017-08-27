package com.github.airsaid.accountbook.mvp.account;

import com.github.airsaid.accountbook.base.BasePresenter;
import com.github.airsaid.accountbook.base.BaseView;
import com.github.airsaid.accountbook.data.Account;
import com.github.airsaid.accountbook.data.Error;
import com.github.airsaid.accountbook.data.User;

/**
 * @author Airsaid
 * @github https://github.com/airsaid
 * @date 2017/4/1
 * @desc 记账契约类，用于统一约定接口。
 */
public interface AccountContract {

    interface View extends BaseView<Presenter>{
        void save();
        void saveSuccess();
        void saveFail(Error e);
        void selectCost();
        void selectIncome();
        void showSelectDateDialog();
        void showInputMoneyDialog();
    }

    interface Presenter extends BasePresenter{
        void saveAccount(User user, Account account);
    }

}
