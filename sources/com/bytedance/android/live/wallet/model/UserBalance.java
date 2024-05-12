package com.bytedance.android.live.wallet.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class UserBalance extends F9E {

    @InterfaceC65349Pkn("balance")
    public long balance;

    @InterfaceC65349Pkn("country_code")
    public final String countryCode;

    @InterfaceC65349Pkn("currency_type")
    public final String currencyType;

    /* JADX WARN: Multi-variable type inference failed */
    public UserBalance() {
        this(null, 0 == true ? 1 : 0, 0L, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserBalance copy$default(UserBalance userBalance, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userBalance.currencyType;
        }
        if ((i & 2) != 0) {
            str2 = userBalance.countryCode;
        }
        if ((i & 4) != 0) {
            j = userBalance.balance;
        }
        return userBalance.copy(str, str2, j);
    }

    public final UserBalance copy(String currencyType, String countryCode, long j) {
        o.LJIIIZ(currencyType, "currencyType");
        o.LJIIIZ(countryCode, "countryCode");
        return new UserBalance(currencyType, countryCode, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.currencyType, this.countryCode, Long.valueOf(this.balance)};
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrencyType() {
        return this.currencyType;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public UserBalance(String currencyType, String countryCode, long j) {
        o.LJIIIZ(currencyType, "currencyType");
        o.LJIIIZ(countryCode, "countryCode");
        this.currencyType = currencyType;
        this.countryCode = countryCode;
        this.balance = j;
    }

    public /* synthetic */ UserBalance(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j);
    }
}
