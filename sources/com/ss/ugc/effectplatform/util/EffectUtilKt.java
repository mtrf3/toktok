package com.ss.ugc.effectplatform.util;

import X.X97;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EffectUtilKt {
    public static final native boolean nativeCheckEffectChildrenFile(String str);

    public static final boolean LIZ(String effectUnzipPath) {
        o.LJIIJ(effectUnzipPath, "effectUnzipPath");
        X97.LIZJ.LIZ();
        return nativeCheckEffectChildrenFile(effectUnzipPath);
    }
}
