package com.ss.android.ttvecamera.cameraalgorithm;

import X.C16880lQ;
import X.C63920P6u;
import X.C63922P6w;
import X.EnumC63901P6b;
import X.InterfaceC63917P6r;
import X.InterfaceC63918P6s;
import X.InterfaceC63919P6t;
import X.P3Y;
import X.P6E;
import X.YQ5;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ttvecamera.TEFrameSizei;

/* loaded from: classes12.dex */
public class TECameraAlgorithmInterface {
    public static String TAG = "TECameraAlgorithmInterface";
    public boolean isInited;
    public YQ5 mCamera;
    public TECameraFrameSetting mCameraFrameSetting;
    public InterfaceC63918P6s mErrorListener;
    public long mHandle;
    public InterfaceC63917P6r mLensCallback;
    public InterfaceC63919P6t mListener;
    public float[] mMVPMatrix = new float[16];

    public native int nativeAddCameraAlgorithm(long j, Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public void nativeCallback_onError(int i, String str) {
    }

    public void nativeCallback_onProcess(float f, boolean z) {
    }

    public native long nativeInit();

    public native TECameraAlgoResult nativeProcessAlgorithm(long j, Object obj);

    public native int nativeRemoveCameraAlgorithm(long j, int i);

    public native int nativeUpdateCameraAlgorithmParam(long j, Object obj);

    public void setErrorListener(InterfaceC63918P6s interfaceC63918P6s) {
    }

    public void setProcessListener(InterfaceC63919P6t interfaceC63919P6t) {
    }

    static {
        C16880lQ.LLJJJIL("ttvesdk");
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

    public C63920P6u getResult() {
        long j = this.mHandle;
        if (j == 0) {
            return null;
        }
        return (C63920P6u) nativeAlgorithmGetResult(j);
    }

    public int init() {
        if (!this.isInited) {
            long nativeInit = nativeInit();
            this.mHandle = nativeInit;
            if (nativeInit == 0) {
                C63922P6w.LIZIZ(TAG, "nativeAlgorithmCreate failed!");
                return -1;
            }
            return 0;
        }
        C63922P6w.LJ(TAG, "algorithmInterface is inited!");
        return 0;
    }

    public TECameraAlgorithmInterface(YQ5 yq5) {
        this.mCamera = yq5;
    }

    public int addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeAddCameraAlgorithm(j, tECameraAlgorithmParam);
    }

    public P6E processAlgorithm(P6E p6e) {
        if (p6e.LJII.LIZIZ == EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES) {
            int LIZLLL = p6e.LIZLLL();
            P3Y p3y = p6e.LJII;
            TEFrameSizei tEFrameSizei = p3y.LIZ;
            int i = tEFrameSizei.width;
            int i2 = tEFrameSizei.height;
            int i3 = p3y.LIZLLL;
            float[] LIZIZ = p6e.LIZIZ();
            P3Y p3y2 = p6e.LJII;
            this.mCameraFrameSetting = new TECameraFrameSetting(LIZLLL, 0, i, i2, i3, LIZIZ, p3y2.LJ, p3y2.LIZIZ.ordinal(), 0);
        }
        TECameraAlgoResult nativeProcessAlgorithm = nativeProcessAlgorithm(this.mHandle, this.mCameraFrameSetting);
        if (nativeProcessAlgorithm != null) {
            P6E p6e2 = new P6E(nativeProcessAlgorithm.width, nativeProcessAlgorithm.height, 0L);
            p6e2.LJFF(nativeProcessAlgorithm.texID, 0, this.mMVPMatrix, EnumC63901P6b.PIXEL_FORMAT_OpenGL_RGBA8, this.mCamera.LJII);
            return p6e2;
        }
        return null;
    }

    public int removeCameraAlgorithm(int i) {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeRemoveCameraAlgorithm(j, i);
    }

    public void setLensCallback(InterfaceC63917P6r interfaceC63917P6r) {
        this.mLensCallback = interfaceC63917P6r;
    }

    public int updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        long j = this.mHandle;
        if (j == 0) {
            return -112;
        }
        return nativeUpdateCameraAlgorithmParam(j, tECameraAlgorithmParam);
    }

    public void nativeCallback_onLensError(int i, int i2, String str) {
        InterfaceC63917P6r interfaceC63917P6r = this.mLensCallback;
        if (interfaceC63917P6r != null) {
            interfaceC63917P6r.onError(i, i2, str);
        }
    }

    public void nativeCallback_onLensSuccess(int i, float f, int i2) {
        InterfaceC63917P6r interfaceC63917P6r = this.mLensCallback;
        if (interfaceC63917P6r != null) {
            interfaceC63917P6r.onSuccess(i, f, i2);
        }
    }

    /* loaded from: classes12.dex */
    public static class TECameraAlgoResult {
        public int format;
        public int height;
        public int texID;
        public int width;

        public TECameraAlgoResult(int i, int i2, int i3, int i4) {
            this.texID = i;
            this.format = i2;
            this.width = i3;
            this.height = i4;
        }
    }

    public void nativeCallback_onLensInfo(int i, int i2, int i3, String str) {
        InterfaceC63917P6r interfaceC63917P6r = this.mLensCallback;
        if (interfaceC63917P6r != null) {
            interfaceC63917P6r.onInfo(i, i2, i3, str);
        }
    }
}
