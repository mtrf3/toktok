package com.bytedance.android.live.annotation;

import X.V0N;

/* loaded from: classes.dex */
public enum ScopeValue {
    BANNER("banner"),
    BARRAGE("barrage"),
    BROADCAST("broadcast"),
    COMMENT("comment"),
    DECORATION("decoration"),
    FEED("feed"),
    GIFT("gift"),
    HYBRID("hybrid"),
    LINKMIC("linkmic"),
    MESSAGE("message"),
    PUBLICSCREEN("publicscreen"),
    PULLSTREAM("pullstream"),
    RANK("rank"),
    ROOMFUNCTION("roomfunction"),
    SLOT("slot"),
    WALLET("wallet"),
    WATCHLIVE("watchlive"),
    PERFORMANCE("performance"),
    SUBSCRIPTION("subscription"),
    OTHER("other");

    public String name;

    public String getName() {
        return this.name;
    }

    public static ScopeValue valueOf(String str) {
        return (ScopeValue) V0N.LJJJ(ScopeValue.class, str);
    }

    ScopeValue(String str) {
        this.name = str;
    }
}
