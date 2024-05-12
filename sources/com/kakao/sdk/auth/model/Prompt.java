package com.kakao.sdk.auth.model;

import X.InterfaceC65349Pkn;
import X.V0N;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public enum Prompt {
    LOGIN,
    SIGNUP,
    CERT,
    UNIFY_DAUM;

    public static Prompt valueOf(String str) {
        return (Prompt) V0N.LJJJ(Prompt.class, str);
    }

    public final String getValue() {
        Annotation annotation = Prompt.class.getField(name()).getAnnotation(InterfaceC65349Pkn.class);
        o.LJI(annotation);
        return ((InterfaceC65349Pkn) annotation).value();
    }
}
