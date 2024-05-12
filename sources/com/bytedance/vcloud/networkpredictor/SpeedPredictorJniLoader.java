package com.bytedance.vcloud.networkpredictor;

import X.C16880lQ;

/* loaded from: classes9.dex */
public class SpeedPredictorJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    public static LibraryLoaderProxy mLibraryLoader;

    public static synchronized boolean loadLibrary() {
        synchronized (SpeedPredictorJniLoader.class) {
            try {
                if (!isLibraryLoaded) {
                    LibraryLoaderProxy libraryLoaderProxy = mLibraryLoader;
                    if (libraryLoaderProxy == null) {
                        libraryLoaderProxy = new DefaultLoader();
                    }
                    isLibraryLoaded = libraryLoaderProxy.loadLibrary("networkpredictor");
                }
            } finally {
                return isLibraryLoaded;
            }
        }
        return isLibraryLoaded;
    }

    /* loaded from: classes9.dex */
    public static class DefaultLoader implements LibraryLoaderProxy {
        public DefaultLoader() {
        }

        @Override // com.bytedance.vcloud.networkpredictor.LibraryLoaderProxy
        public boolean loadLibrary(String str) {
            try {
                C16880lQ.LLJJJIL(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public static void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        mLibraryLoader = libraryLoaderProxy;
    }
}
