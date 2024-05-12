package com.bytedance.geckox.model;

import X.F9E;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GeckoManifest extends F9E {
    public final Map<String, GeckoMd5Check> files;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeckoManifest copy$default(GeckoManifest geckoManifest, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = geckoManifest.files;
        }
        return geckoManifest.copy(map);
    }

    public final GeckoManifest copy(Map<String, GeckoMd5Check> files) {
        o.LJIIJ(files, "files");
        return new GeckoManifest(files);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.files};
    }

    public final Map<String, GeckoMd5Check> getFiles() {
        return this.files;
    }

    public GeckoManifest(Map<String, GeckoMd5Check> files) {
        o.LJIIJ(files, "files");
        this.files = files;
    }
}
