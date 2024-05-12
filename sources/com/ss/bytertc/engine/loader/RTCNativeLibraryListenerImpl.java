package com.ss.bytertc.engine.loader;

import X.X1D;
import com.ss.bytertc.engine.utils.LogUtil;

/* loaded from: classes33.dex */
public class RTCNativeLibraryListenerImpl implements RTCNativeLibraryLoaderListener {
    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadAlready(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadAlready : ");
        LIZ.append(str);
        LogUtil.i("RtcNativeLibraryLoaderListener", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadError(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadError : ");
        LIZ.append(str);
        LogUtil.i("RtcNativeLibraryLoaderListener", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener
    public void onLoadSuccess(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess : ");
        LIZ.append(str);
        LogUtil.i("RtcNativeLibraryLoaderListener", X1D.LIZIZ(LIZ));
    }
}
