package com.bytedance.vcloud.abrmodule;

import X.C16880lQ;

/* loaded from: classes9.dex */
public class ABRJniLoader {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    public static LibraryLoaderProxy mLibraryLoader;

    public static synchronized boolean loadLibrary() {
        synchronized (ABRJniLoader.class) {
            try {
                if (!isLibraryLoaded) {
                    LibraryLoaderProxy libraryLoaderProxy = mLibraryLoader;
                    if (libraryLoaderProxy == null) {
                        libraryLoaderProxy = new DefaultLoader();
                    }
                    isLibraryLoaded = libraryLoaderProxy.loadLibrary("abrmodule");
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

        @Override // com.bytedance.vcloud.abrmodule.LibraryLoaderProxy
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
