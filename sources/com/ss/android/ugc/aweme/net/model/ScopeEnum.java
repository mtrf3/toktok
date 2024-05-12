package com.ss.android.ugc.aweme.net.model;

import X.C58729N3d;
import X.V0N;

/* loaded from: classes11.dex */
public enum ScopeEnum {
    ALL(0),
    LOCAL_TEST(1),
    IN_HOUSE(2),
    OFFLINE(3),
    ONLINE(4);

    public static final C58729N3d Companion = new C58729N3d();
    public final int scope;

    public static final boolean isValidScope(int i) {
        Companion.getClass();
        return C58729N3d.LIZ(i);
    }

    public static ScopeEnum valueOf(String str) {
        return (ScopeEnum) V0N.LJJJ(ScopeEnum.class, str);
    }

    public final int getScope() {
        return this.scope;
    }

    ScopeEnum(int i) {
        this.scope = i;
    }
}
