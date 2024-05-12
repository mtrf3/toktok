package com.ss.android.ugc.aweme.shoutouts;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ShoutoutPrice implements Serializable {

    @InterfaceC65349Pkn("buyer_payment")
    public MoneyDes buyerMoneyDes;

    @InterfaceC65349Pkn("coin")
    public int coin;

    @InterfaceC65349Pkn("creator_earning")
    public MoneyDes moneyDes;

    public final MoneyDes getBuyerMoneyDes() {
        return this.buyerMoneyDes;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final MoneyDes getMoneyDes() {
        return this.moneyDes;
    }

    public final void setBuyerMoneyDes(MoneyDes moneyDes) {
        this.buyerMoneyDes = moneyDes;
    }

    public final void setCoin(int i) {
        this.coin = i;
    }

    public final void setMoneyDes(MoneyDes moneyDes) {
        this.moneyDes = moneyDes;
    }
}
