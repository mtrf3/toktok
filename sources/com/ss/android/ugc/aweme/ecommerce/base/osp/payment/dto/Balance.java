package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Balance {

    @InterfaceC65349Pkn("balance")
    public final String balance;

    @InterfaceC65349Pkn("balance_code")
    public final BalanceCode balanceCode;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_token")
    public final String paymentMethodToken;

    public static /* synthetic */ Balance copy$default(Balance balance, String str, String str2, BalanceCode balanceCode, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = balance.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str2 = balance.paymentMethodToken;
        }
        if ((i & 4) != 0) {
            balanceCode = balance.balanceCode;
        }
        if ((i & 8) != 0) {
            str3 = balance.balance;
        }
        return balance.copy(str, str2, balanceCode, str3);
    }

    public final Balance copy(String str, String str2, BalanceCode balanceCode, String str3) {
        return new Balance(str, str2, balanceCode, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) obj;
        return o.LJ(this.paymentMethodId, balance.paymentMethodId) && o.LJ(this.paymentMethodToken, balance.paymentMethodToken) && this.balanceCode == balance.balanceCode && o.LJ(this.balance, balance.balance);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethodToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BalanceCode balanceCode = this.balanceCode;
        int hashCode3 = (hashCode2 + (balanceCode == null ? 0 : balanceCode.hashCode())) * 31;
        String str3 = this.balance;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Balance(paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", paymentMethodToken=");
        LIZ.append(this.paymentMethodToken);
        LIZ.append(", balanceCode=");
        LIZ.append(this.balanceCode);
        LIZ.append(", balance=");
        return q.LIZIZ(LIZ, this.balance, ')', LIZ);
    }

    public final String getBalance() {
        return this.balance;
    }

    public final BalanceCode getBalanceCode() {
        return this.balanceCode;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public Balance(String str, String str2, BalanceCode balanceCode, String str3) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.balanceCode = balanceCode;
        this.balance = str3;
    }
}
