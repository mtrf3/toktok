package com.ss.android.ugc.aweme.ecommerce.core.strategy;

import X.C26555AbX;
import X.HH1;
import X.WM7;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BizIdentity {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String getUniqueKey() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append('-');
        LIZ.append(this.LIZIZ);
        LIZ.append('-');
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizIdentity(String scene, C26555AbX env) {
        this(scene, env.LIZ, env.LIZIZ);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(env, "env");
    }

    public BizIdentity(String str, String str2, String str3) {
        HH1.LIZ(str, WM7.SCENE_SERVICE, str2, "bizName", str3, "market");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
