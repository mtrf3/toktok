package com.ttnet.org.chromium.base.library_loader;

import com.ttnet.org.chromium.base.library_loader.Linker;

/* loaded from: classes7.dex */
public class LinkerJni {
    public static native void nativeFindMemoryRegionAtRandomAddress(Linker.LibInfo libInfo, boolean z);

    public static native boolean nativeFindRegionReservedByWebViewZygote(Linker.LibInfo libInfo);

    public static native void nativeReserveMemoryForLibrary(Linker.LibInfo libInfo);
}
