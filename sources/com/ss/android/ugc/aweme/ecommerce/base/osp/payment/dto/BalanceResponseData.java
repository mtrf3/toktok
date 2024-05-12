package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BalanceResponseData {

    @InterfaceC65349Pkn("balances")
    public final List<Balance> balances;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BalanceResponseData copy$default(BalanceResponseData balanceResponseData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = balanceResponseData.balances;
        }
        return balanceResponseData.copy(list);
    }

    public final BalanceResponseData copy(List<Balance> list) {
        return new BalanceResponseData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceResponseData) && o.LJ(this.balances, ((BalanceResponseData) obj).balances);
    }

    public int hashCode() {
        List<Balance> list = this.balances;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BalanceResponseData(balances=");
        return C1NE.LIZIZ(LIZ, this.balances, ')', LIZ);
    }

    public final List<Balance> getBalances() {
        return this.balances;
    }

    public BalanceResponseData(List<Balance> list) {
        this.balances = list;
    }
}
