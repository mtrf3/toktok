package com.ss.bytertc.engine.loader;

import X.C16880lQ;

/* loaded from: classes33.dex */
public class RTCNativeLibraryLoaderImpl implements RTCNativeLibraryLoader {
    @Override // com.ss.bytertc.engine.loader.RTCNativeLibraryLoader
    public boolean load(String str) {
        try {
            C16880lQ.LLJJJIL(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }
}
