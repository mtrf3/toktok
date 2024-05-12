package com.ss.android.ugc.effectmanager;

/* loaded from: classes16.dex */
public class DownloadableModelLibraryLoader {
    public static final DownloadableModelLibraryLoader INSTANCE = new DownloadableModelLibraryLoader();
    public static volatile boolean hasLoadedLibrary;

    public final void loadLibrary() {
        if (hasLoadedLibrary) {
            return;
        }
        synchronized (this) {
            if (!hasLoadedLibrary) {
                DownloadableModelSupport.sLibraryLoader.loadLibrary("oldep");
                hasLoadedLibrary = true;
            }
        }
    }
}
