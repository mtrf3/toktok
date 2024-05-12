package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CurrencyInfo {

    @InterfaceC65349Pkn("code")
    public String code;

    @InterfaceC65349Pkn("keep_dot")
    public int keepDot;

    @InterfaceC65349Pkn("symbol")
    public String symbol;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInfo() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final String getCode() {
        return this.code;
    }

    public final int getKeepDot() {
        return this.keepDot;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final void setCode(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.code = str;
    }

    public final void setKeepDot(int i) {
        this.keepDot = i;
    }

    public final void setSymbol(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.symbol = str;
    }

    public CurrencyInfo(String code, int i, String symbol) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(symbol, "symbol");
        this.code = code;
        this.keepDot = i;
        this.symbol = symbol;
    }

    public /* synthetic */ CurrencyInfo(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
