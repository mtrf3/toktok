package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BalanceStruct {
    public BalanceStructExtra exchangeInfo;

    @InterfaceC65349Pkn("balance")
    public final UserBalance userBalance;

    @InterfaceC65349Pkn("valid_user")
    public final boolean validUser;

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceStruct() {
        this(null, false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BalanceStruct copy$default(BalanceStruct balanceStruct, UserBalance userBalance, boolean z, BalanceStructExtra balanceStructExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            userBalance = balanceStruct.userBalance;
        }
        if ((i & 2) != 0) {
            z = balanceStruct.validUser;
        }
        if ((i & 4) != 0) {
            balanceStructExtra = balanceStruct.exchangeInfo;
        }
        return balanceStruct.copy(userBalance, z, balanceStructExtra);
    }

    public final BalanceStruct copy(UserBalance userBalance, boolean z, BalanceStructExtra balanceStructExtra) {
        return new BalanceStruct(userBalance, z, balanceStructExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceStruct)) {
            return false;
        }
        BalanceStruct balanceStruct = (BalanceStruct) obj;
        return o.LJ(this.userBalance, balanceStruct.userBalance) && this.validUser == balanceStruct.validUser && o.LJ(this.exchangeInfo, balanceStruct.exchangeInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        UserBalance userBalance = this.userBalance;
        int hashCode = (userBalance == null ? 0 : userBalance.hashCode()) * 31;
        boolean z = this.validUser;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        BalanceStructExtra balanceStructExtra = this.exchangeInfo;
        return i2 + (balanceStructExtra != null ? balanceStructExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BalanceStruct(userBalance=");
        LIZ.append(this.userBalance);
        LIZ.append(", validUser=");
        LIZ.append(this.validUser);
        LIZ.append(", exchangeInfo=");
        LIZ.append(this.exchangeInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final BalanceStructExtra getExchangeInfo() {
        return this.exchangeInfo;
    }

    public final UserBalance getUserBalance() {
        return this.userBalance;
    }

    public final boolean getValidUser() {
        return this.validUser;
    }

    public final void setExchangeInfo(BalanceStructExtra balanceStructExtra) {
        this.exchangeInfo = balanceStructExtra;
    }

    public BalanceStruct(UserBalance userBalance, boolean z, BalanceStructExtra balanceStructExtra) {
        this.userBalance = userBalance;
        this.validUser = z;
        this.exchangeInfo = balanceStructExtra;
    }

    public /* synthetic */ BalanceStruct(UserBalance userBalance, boolean z, BalanceStructExtra balanceStructExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userBalance, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : balanceStructExtra);
    }
}
