package com.orbu.core.api;

import X.V0N;

/* loaded from: classes15.dex */
public enum TTKOrbuState {
    PRE_ACTIVE,
    ENABLE,
    DISABLE;

    public static TTKOrbuState valueOf(String str) {
        return (TTKOrbuState) V0N.LJJJ(TTKOrbuState.class, str);
    }
}
