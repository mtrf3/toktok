package com.ss.android.ugc.effectmanager.knadapt;

import X.X96;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KNLibraryLoader implements X96 {
    public final DownloadableModelSupportLibraryLoader oldLibraryLoader;

    public KNLibraryLoader(DownloadableModelSupportLibraryLoader oldLibraryLoader) {
        o.LJIIJ(oldLibraryLoader, "oldLibraryLoader");
        this.oldLibraryLoader = oldLibraryLoader;
    }

    @Override // X.X96
    public void loadLibrary(String soName) {
        o.LJIIJ(soName, "soName");
        this.oldLibraryLoader.loadLibrary(soName);
    }
}
