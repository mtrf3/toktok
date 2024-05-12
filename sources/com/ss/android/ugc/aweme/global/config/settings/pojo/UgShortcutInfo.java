package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class UgShortcutInfo {

    @InterfaceC65349Pkn("h5_link")
    public String h5Link;

    @InterfaceC65349Pkn("money_symbol")
    public String moneySymbol;

    @InterfaceC65349Pkn("will_get_most")
    public String willGetMost;

    @InterfaceC65349Pkn("withdrawal_req_interval")
    public int withdrawalReqInterval;

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getMoneySymbol() {
        String str = this.moneySymbol;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getWillGetMost() {
        String str = this.willGetMost;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public int getWithdrawalReqInterval() {
        return this.withdrawalReqInterval;
    }
}
