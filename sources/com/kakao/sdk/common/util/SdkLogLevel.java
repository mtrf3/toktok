package com.kakao.sdk.common.util;

import X.V0N;

/* loaded from: classes12.dex */
public enum SdkLogLevel {
    V(0, "[💬]"),
    D(1, "[ℹ️]"),
    I(2, "[🔬]"),
    W(3, "[⚠️]"),
    E(4, "[‼️]");

    public final int level;
    public final String symbol;

    public static SdkLogLevel valueOf(String str) {
        return (SdkLogLevel) V0N.LJJJ(SdkLogLevel.class, str);
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    SdkLogLevel(int i, String str) {
        this.level = i;
        this.symbol = str;
    }
}
