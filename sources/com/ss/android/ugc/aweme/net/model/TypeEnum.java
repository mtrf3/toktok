package com.ss.android.ugc.aweme.net.model;

import X.PYF;
import X.V0N;

/* loaded from: classes12.dex */
public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);

    public static final PYF Companion = new PYF();
    public final int type;

    public static final boolean isRegex(int i) {
        Companion.getClass();
        return PYF.LIZ(i);
    }

    public static TypeEnum valueOf(String str) {
        return (TypeEnum) V0N.LJJJ(TypeEnum.class, str);
    }

    public final int getType() {
        return this.type;
    }

    TypeEnum(int i) {
        this.type = i;
    }
}
