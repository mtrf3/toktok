package com.ss.android.ugc.aweme.shortcut.datasource.setting;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class FissionWithdrawalNum extends F9E {

    @InterfaceC65349Pkn("cash_amount")
    public final long amount;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.amount)};
    }

    public FissionWithdrawalNum(long j) {
        this.amount = j;
    }
}
