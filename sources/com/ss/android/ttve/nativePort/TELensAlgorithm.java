package com.ss.android.ttve.nativePort;

import X.V2B;
import com.ss.android.ttve.lensAlgorithm.VEBaseLensAlgorithmConfig;
import com.ss.android.ttve.lensAlgorithm.videoStable.VELensVideoStabResults;
import com.ss.android.ttve.lensAlgorithm.videoStable.VEVideoStabConfig;
import com.ss.android.vesdk.VELensCallBacks;

/* loaded from: classes17.dex */
public class TELensAlgorithm {
    public long LIZ;

    private native long nativeCreateLensEngine();

    private native int nativeDestroyLensEngine(long j);

    private native VELensVideoStabResults nativeGetVideoStabResult(long j, Object obj, VEVideoStabConfig vEVideoStabConfig);

    public final synchronized int LIZ() {
        long j = this.LIZ;
        if (j <= 0) {
            return -112;
        }
        int nativeDestroyLensEngine = nativeDestroyLensEngine(j);
        this.LIZ = 0L;
        return nativeDestroyLensEngine;
    }

    public final synchronized int LIZJ() {
        if (this.LIZ > 0) {
            V2B.LJII("TELensAlgorithm");
        }
        long nativeCreateLensEngine = nativeCreateLensEngine();
        this.LIZ = nativeCreateLensEngine;
        if (nativeCreateLensEngine <= 0) {
            return -112;
        }
        return 0;
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public final VELensVideoStabResults LIZIZ(VEBaseLensAlgorithmConfig vEBaseLensAlgorithmConfig, VELensCallBacks vELensCallBacks) {
        long j = this.LIZ;
        if (j <= 0 || vEBaseLensAlgorithmConfig.algorithmFlag != 16) {
            return null;
        }
        return nativeGetVideoStabResult(j, vELensCallBacks, (VEVideoStabConfig) vEBaseLensAlgorithmConfig);
    }
}
