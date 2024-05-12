package com.ttnet.org.chromium.base.library_loader;

import X.C38643FEp;
import X.C78897Uxp;
import com.ttnet.org.chromium.base.library_loader.Linker;

/* loaded from: classes7.dex */
public class ModernLinkerJni {
    public static native int nativeGetRelroSharingResult();

    public static native boolean nativeLoadLibrary(String str, Linker.LibInfo libInfo, boolean z);

    public static native boolean nativeUseRelros(long j, Linker.LibInfo libInfo);

    public static void reportDlopenExtTime(long j) {
        C38643FEp.LIZ.LIZIZ(2, C78897Uxp.LJIIJ(j), "ChromiumAndroidLinker.ModernLinkerDlopenExtTime", C78897Uxp.LJIIJ(1L), C78897Uxp.LJIIJ(10000L), 50);
    }

    public static void reportIteratePhdrTime(long j) {
        C38643FEp.LIZ.LIZIZ(2, C78897Uxp.LJIIJ(j), "ChromiumAndroidLinker.ModernLinkerIteratePhdrTime", C78897Uxp.LJIIJ(1L), C78897Uxp.LJIIJ(10000L), 50);
    }
}
