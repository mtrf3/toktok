package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BalanceStructExtra {

    @InterfaceC65349Pkn("base_package")
    public BasePackage basePackage;

    @InterfaceC65349Pkn("coins")
    public long coins;

    @InterfaceC65349Pkn("currency_info")
    public CurrencyInfo currencyInfo;

    @InterfaceC65349Pkn("local_currency_info")
    public CurrencyInfo localCurrencyInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceStructExtra() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 15, 0 == true ? 1 : 0);
    }

    public final boolean isLocal() {
        BasePackage basePackage;
        CurrencyInfo currencyInfo = this.localCurrencyInfo;
        if (currencyInfo != null) {
            o.LJI(currencyInfo);
            if (!o.LJ(currencyInfo.getSymbol(), "") && (basePackage = this.basePackage) != null) {
                o.LJI(basePackage);
                if (basePackage.getLocalPrice() != 0) {
                    BasePackage basePackage2 = this.basePackage;
                    o.LJI(basePackage2);
                    if (basePackage2.getLocalDot() != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final BasePackage getBasePackage() {
        return this.basePackage;
    }

    public final long getCoins() {
        return this.coins;
    }

    public final CurrencyInfo getCurrencyInfo() {
        return this.currencyInfo;
    }

    public final CurrencyInfo getLocalCurrencyInfo() {
        return this.localCurrencyInfo;
    }

    public final void setBasePackage(BasePackage basePackage) {
        this.basePackage = basePackage;
    }

    public final void setCoins(long j) {
        this.coins = j;
    }

    public final void setCurrencyInfo(CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public final void setLocalCurrencyInfo(CurrencyInfo currencyInfo) {
        this.localCurrencyInfo = currencyInfo;
    }

    public BalanceStructExtra(CurrencyInfo currencyInfo, CurrencyInfo currencyInfo2, BasePackage basePackage, long j) {
        this.currencyInfo = currencyInfo;
        this.localCurrencyInfo = currencyInfo2;
        this.basePackage = basePackage;
        this.coins = j;
    }

    public /* synthetic */ BalanceStructExtra(CurrencyInfo currencyInfo, CurrencyInfo currencyInfo2, BasePackage basePackage, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : currencyInfo, (i & 2) != 0 ? null : currencyInfo2, (i & 4) == 0 ? basePackage : null, (i & 8) != 0 ? 0L : j);
    }
}
