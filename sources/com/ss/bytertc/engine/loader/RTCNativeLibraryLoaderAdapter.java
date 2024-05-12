package com.ss.bytertc.engine.loader;

/* loaded from: classes33.dex */
public class RTCNativeLibraryLoaderAdapter {
    public static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public static RTCNativeLibraryLoader getRtcNativeLibraryLoader() {
        return mRtcNativeLibraryLoader;
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }
}
