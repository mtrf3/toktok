package com.ss.android.ugc.aweme.shoutouts;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class MoneyDes implements Serializable {

    @InterfaceC65349Pkn("currency_character")
    public String currencyCharacter;

    @InterfaceC65349Pkn("currency_name")
    public String currencyName;

    @InterfaceC65349Pkn("money")
    public int money;

    @InterfaceC65349Pkn("money_str")
    public String moneyStr;

    public final String getCurrencyCharacter() {
        return this.currencyCharacter;
    }

    public final String getCurrencyName() {
        return this.currencyName;
    }

    public final int getMoney() {
        return this.money;
    }

    public final String getMoneyStr() {
        return this.moneyStr;
    }

    public final void setCurrencyCharacter(String str) {
        this.currencyCharacter = str;
    }

    public final void setCurrencyName(String str) {
        this.currencyName = str;
    }

    public final void setMoney(int i) {
        this.money = i;
    }

    public final void setMoneyStr(String str) {
        this.moneyStr = str;
    }
}
