package com.ss.videoarch.strategy.utils.smartStrategy;

import X.C79346VCc;
import com.ss.videoarch.strategy.NativeObject;

/* loaded from: classes15.dex */
public class PitayaBridge extends NativeObject {
    private native void nativeSetObject();

    public PitayaBridge() {
        if (C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableNativeStrategyCenter == 1) {
            nativeSetObject();
        }
    }
}
