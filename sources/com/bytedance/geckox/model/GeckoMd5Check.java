package com.bytedance.geckox.model;

import X.F9E;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class GeckoMd5Check extends F9E {
    public final String md5;

    public static /* synthetic */ GeckoMd5Check copy$default(GeckoMd5Check geckoMd5Check, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geckoMd5Check.md5;
        }
        return geckoMd5Check.copy(str);
    }

    public final GeckoMd5Check copy(String md5) {
        o.LJIIJ(md5, "md5");
        return new GeckoMd5Check(md5);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.md5};
    }

    public final String getMd5() {
        return this.md5;
    }

    public GeckoMd5Check(String md5) {
        o.LJIIJ(md5, "md5");
        this.md5 = md5;
    }
}
