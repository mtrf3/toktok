package com.ss.android.ugc.aweme.shortvideo.model;

import X.V0N;

/* loaded from: classes8.dex */
public enum BehaviorType {
    START("ST"),
    SUCCESS("SU"),
    FAILED("FA"),
    CANCEL("CC"),
    EVENT("EV");

    public final String simpleName;

    public static BehaviorType valueOf(String str) {
        return (BehaviorType) V0N.LJJJ(BehaviorType.class, str);
    }

    public final String getSimpleName() {
        return this.simpleName;
    }

    BehaviorType(String str) {
        this.simpleName = str;
    }
}
