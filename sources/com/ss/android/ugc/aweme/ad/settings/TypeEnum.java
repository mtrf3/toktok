package com.ss.android.ugc.aweme.ad.settings;

import X.C59428NUa;
import X.V0N;

/* loaded from: classes11.dex */
public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);

    public static final C59428NUa Companion = new C59428NUa();
    public final int type;

    public static TypeEnum valueOf(String str) {
        return (TypeEnum) V0N.LJJJ(TypeEnum.class, str);
    }

    public final int getType() {
        return this.type;
    }

    public static final boolean isRegex(int i) {
        Companion.getClass();
        if (i == REGEX_MATCHES.getType() || i == REGEX_CONTAINS_MATCH_IN.getType()) {
            return true;
        }
        return false;
    }

    TypeEnum(int i) {
        this.type = i;
    }
}
