package com.ss.bytertc.engine.loader;

/* loaded from: classes33.dex */
public interface RTCNativeLibraryLoaderListener {
    void onLoadAlready(String str);

    void onLoadError(String str);

    void onLoadSuccess(String str);
}
