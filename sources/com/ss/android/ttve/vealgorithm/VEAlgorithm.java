package com.ss.android.ttve.vealgorithm;

import X.InterfaceC87315YOp;
import X.InterfaceC87317YOr;
import X.P4Q;
import X.Q7K;
import X.X1D;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmResult;
import com.ss.android.ttve.vealgorithm.params.VEAlgorithmType;

/* loaded from: classes16.dex */
public class VEAlgorithm {
    public InterfaceC87315YOp mErrorListener;
    public long mHandle;
    public InterfaceC87317YOr mListener;

    public native int nativeAlgorithmCancel(long j);

    public native long nativeAlgorithmCreate(Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetRandomResult(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public native int nativeAlgorithmStart(long j);

    public void nativeCallback_onError(int i, String str) {
    }

    public void nativeCallback_onProcess(float f, boolean z) {
    }

    public native int nativeupdateAlgorithmParam(long j, Object obj);

    public void setErrorListener(InterfaceC87315YOp interfaceC87315YOp) {
    }

    public void setProcessListener(InterfaceC87317YOr interfaceC87317YOr) {
    }

    public int cancel() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAlgorithmCancel(j);
    }

    public int destroy() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        int nativeAlgorithmDestroy = nativeAlgorithmDestroy(j);
        this.mHandle = 0L;
        return nativeAlgorithmDestroy;
    }

    public void finalize() {
        if (this.mHandle != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("not destroy algorithm object:");
            LIZ.append(this.mHandle);
            P4Q.LIZJ("VEAlgorithm", X1D.LIZIZ(LIZ));
        }
    }

    public VEAlgorithmResult getResult() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return (VEAlgorithmResult) nativeAlgorithmGetResult(j);
    }

    public int start() {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAlgorithmStart(j);
    }

    public int init(VEAlgorithmParam vEAlgorithmParam) {
        int i = vEAlgorithmParam.type;
        if (i == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            Q7K.LJ("invalid algorithm type:", i, "VEAlgorithm");
            return -100;
        }
        long nativeAlgorithmCreate = nativeAlgorithmCreate(vEAlgorithmParam);
        this.mHandle = nativeAlgorithmCreate;
        if (nativeAlgorithmCreate == 0) {
            P4Q.LIZJ("VEAlgorithm", "nativeAlgorithmCreate failed!");
            return -1;
        }
        return 0;
    }

    public int updateParams(VEAlgorithmParam vEAlgorithmParam) {
        int i = vEAlgorithmParam.type;
        if (i == VEAlgorithmType.VE_ALGORITHM_TYPE_INVALID) {
            Q7K.LJ("invalid algorithm type:", i, "VEAlgorithm");
            return -100;
        }
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        int nativeupdateAlgorithmParam = nativeupdateAlgorithmParam(j, vEAlgorithmParam);
        if (nativeupdateAlgorithmParam != 0) {
            Q7K.LJ("nativeupdateAlgorithmParam failed! ret: ", nativeupdateAlgorithmParam, "VEAlgorithm");
            return nativeupdateAlgorithmParam;
        }
        return 0;
    }
}
