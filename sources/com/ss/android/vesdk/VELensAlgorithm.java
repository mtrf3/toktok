package com.ss.android.vesdk;

import X.InterfaceC87316YOq;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensResults;
import com.ss.android.ttve.nativePort.TELensAlgorithm;

/* loaded from: classes17.dex */
public class VELensAlgorithm {
    public TELensAlgorithm mLensHandle = new TELensAlgorithm();

    public int destroy() {
        return this.mLensHandle.LIZ();
    }

    public int init() {
        return this.mLensHandle.LIZJ();
    }

    public VEBaseLensResults getAlgorithmResults(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, InterfaceC87316YOq interfaceC87316YOq) {
        VELensCallBacks vELensCallBacks = new VELensCallBacks();
        vELensCallBacks.setmLensStateListener(interfaceC87316YOq);
        return this.mLensHandle.LIZIZ(vEBaseLensAlgorithmConfig, vELensCallBacks);
    }
}
