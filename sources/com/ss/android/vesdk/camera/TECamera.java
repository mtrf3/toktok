package com.ss.android.vesdk.camera;

import X.C01R;
import X.C169706lK;
import X.C63897P5x;
import X.C63898P5y;
import X.C63899P5z;
import X.C84133X0f;
import X.EnumC63901P6b;
import X.InterfaceC63916P6q;
import X.P3Y;
import X.P4Q;
import X.P62;
import X.P6C;
import X.P6E;
import X.P6N;
import X.P6O;
import X.P6P;
import X.P6Q;
import X.P6R;
import X.P6S;
import X.P6T;
import X.P6V;
import X.P6Z;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Rational;
import com.ss.android.medialib.camera.ImageFrame;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.utils.TEFrameUtils;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class TECamera {
    public boolean isFirstOpen;
    public TECameraFrameSetting mCameraFrameSetting;
    public P6Q mCameraPreview;
    public VECameraSettings mCameraSetting;
    public boolean mCanDropFrame;
    public InterfaceC63916P6q mCaptureListener;
    public P6O mCapturePipeline;
    public final C169706lK<P6O> mCapturePipelines;
    public int mDropFrame;
    public boolean mEnableNotify;
    public volatile long mHandle;
    public boolean mHasFirstFrameCaptured;
    public P6T mOnCameraInfoListener;
    public boolean mPreventTextureRender;
    public SurfaceTexture mSurfaceTexture;
    public final C63897P5x mTextureHolder;
    public int mUseFront;
    public boolean mbCanReleaseSurfaceTexture;
    public int originFacing;
    public int originFrameHeight;
    public int originFrameWidth;

    private native long nativeCameraCreate();

    private native void nativeCameraDestroy(long j);

    private native int nativeCameraParam(long j, TECameraFrameSetting tECameraFrameSetting);

    private native int nativeInit(long j);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:6:0x0019, B:8:0x001e, B:10:0x0026, B:25:0x0030, B:27:0x003e, B:12:0x005b, B:14:0x005f, B:19:0x0063, B:21:0x0067, B:30:0x0045, B:32:0x004d, B:35:0x0054), top: B:2:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int getNextFrame() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.graphics.SurfaceTexture r1 = r4.mSurfaceTexture     // Catch: java.lang.Throwable -> L72
            X.P6O r0 = r4.mCapturePipeline     // Catch: java.lang.Throwable -> L72
            android.graphics.SurfaceTexture r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L72
            if (r1 == r0) goto L19
            java.lang.String r1 = "TECamera"
            java.lang.String r0 = "getNextFrame, mSurfaceTexture is different from mCapturePipeline's surfaceTexture."
            X.P4Q.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L72
            X.P6O r1 = r4.mCapturePipeline     // Catch: java.lang.Throwable -> L72
            android.graphics.SurfaceTexture r0 = r4.mSurfaceTexture     // Catch: java.lang.Throwable -> L72
            r1.LIZJ(r0)     // Catch: java.lang.Throwable -> L72
        L19:
            com.ss.android.vesdk.VECameraSettings r0 = r4.mCameraSetting     // Catch: java.lang.Throwable -> L72
            r3 = 0
            if (r0 == 0) goto L4d
            com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r1 = r0.getOutputMode()     // Catch: java.lang.Throwable -> L72
            com.ss.android.vesdk.VECameraSettings$CAMERA_OUTPUT_MODE r0 = com.ss.android.vesdk.VECameraSettings.CAMERA_OUTPUT_MODE.FRAME     // Catch: java.lang.Throwable -> L72
            if (r1 != r0) goto L4d
            com.ss.android.vesdk.VECameraSettings r0 = r4.mCameraSetting     // Catch: java.lang.Throwable -> L72
            com.ss.android.vesdk.VECameraSettings$CAMERA_TYPE r1 = r0.getCameraType()     // Catch: java.lang.Throwable -> L72
            com.ss.android.vesdk.VECameraSettings$CAMERA_TYPE r0 = com.ss.android.vesdk.VECameraSettings.CAMERA_TYPE.TYPE1     // Catch: java.lang.Throwable -> L72
            if (r1 != r0) goto L5b
            com.ss.android.vesdk.VECameraSettings r0 = r4.mCameraSetting     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L72
            android.os.Bundle r1 = r0.getExtParameters()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L72
            java.lang.String r0 = "forceRunUpdateTexImg"
            boolean r0 = r1.getBoolean(r0, r3)     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L72
            if (r0 == 0) goto L5b
            X.P5x r0 = r4.mTextureHolder     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L72
            r0.LJ()     // Catch: java.lang.Exception -> L44 java.lang.Throwable -> L72
            goto L5b
        L44:
            r2 = move-exception
            java.lang.String r1 = "TECamera"
            java.lang.String r0 = "CAMERA_COST updateTexImage error: "
            X.P4Q.LIZLLL(r1, r0, r2)     // Catch: java.lang.Throwable -> L72
            goto L5b
        L4d:
            X.P5x r0 = r4.mTextureHolder     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L72
            r0.LJ()     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L72
            goto L5b
        L53:
            r2 = move-exception
            java.lang.String r1 = "TECamera"
            java.lang.String r0 = "CAMERA_COST updateTexImage error: "
            X.P4Q.LIZLLL(r1, r0, r2)     // Catch: java.lang.Throwable -> L72
        L5b:
            boolean r0 = r4.mPreventTextureRender     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L63
            boolean r0 = r4.mCanDropFrame     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L70
        L63:
            boolean r0 = r4.mCanDropFrame     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L6e
            java.lang.String r1 = "TECamera"
            java.lang.String r0 = "can drop frame"
            X.P4Q.LJII(r1, r0)     // Catch: java.lang.Throwable -> L72
        L6e:
            r3 = -1000(0xfffffffffffffc18, float:NaN)
        L70:
            monitor-exit(r4)
            return r3
        L72:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.camera.TECamera.getNextFrame():int");
    }

    public native void nativeExtFrameDataAttached(long j, Object obj);

    public native int nativeNotifyCameraFrameAvailable(long j, int i);

    private void updatePipelineTextureId() {
        P6O p6o = this.mCapturePipeline;
        if (p6o instanceof P6P) {
            int i = this.mTextureHolder.LIZ;
            ((P6P) p6o).LJI = i;
            P6Q p6q = this.mCameraPreview;
            if (p6q != null) {
                p6q.LJIIIIZZ(i);
            }
        }
    }

    public void createOESTextureIfNeed() {
        C63897P5x c63897P5x = this.mTextureHolder;
        c63897P5x.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createOESTextureIfNeed, mSurfaceTextureStatus = ");
        LIZ.append(c63897P5x.LIZLLL);
        LIZ.append(", mSurfaceTextureID = ");
        C01R.LIZJ(LIZ, c63897P5x.LIZ, LIZ, "TextureHolder");
        if (c63897P5x.LIZLLL == 1 && c63897P5x.LIZ == 0) {
            c63897P5x.LIZ = P62.LIZ();
            updatePipelineTextureId();
        }
    }

    public long getTexImageTimeDelay() {
        TECameraFrameSetting tECameraFrameSetting = this.mCameraFrameSetting;
        if (tECameraFrameSetting != null && !tECameraFrameSetting.isDependSurfaceTimestamp()) {
            return (System.nanoTime() - this.mCameraFrameSetting.getTimestampInNS()) / 1000;
        }
        return (long) (((System.nanoTime() / 1000000.0d) - this.mTextureHolder.LIZJ()) * 1000.0d);
    }

    public void release() {
        P4Q.LJFF("TECamera", "release...");
        P6Q p6q = this.mCameraPreview;
        if ((p6q instanceof C84133X0f) && !this.mbCanReleaseSurfaceTexture) {
            ((C84133X0f) p6q).LJLLI.needToReleaseSurfaceTexture(true);
        }
        this.mTextureHolder.LIZLLL(this.mbCanReleaseSurfaceTexture);
        this.mCapturePipelines.LJ(this.mCapturePipeline);
    }

    public TECamera() {
        this.mTextureHolder = new C63897P5x();
        this.mCapturePipelines = new C169706lK<>();
        this.mCameraPreview = null;
        this.isFirstOpen = true;
        this.mDropFrame = -1;
        this.mEnableNotify = true;
        this.mHasFirstFrameCaptured = false;
        this.mbCanReleaseSurfaceTexture = true;
        this.mCanDropFrame = false;
        this.mCaptureListener = new P6N(this);
        this.mHandle = nativeCameraCreate();
    }

    public void destroy() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroy, mHandle=");
        LIZ.append(this.mHandle);
        P4Q.LJFF("TECamera", X1D.LIZIZ(LIZ));
        if (this.mHandle != 0) {
            nativeCameraDestroy(this.mHandle);
            this.mHandle = 0L;
            this.mCaptureListener = null;
            this.mOnCameraInfoListener = null;
        }
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public C169706lK<P6O> getCapturePipelines() {
        return this.mCapturePipelines;
    }

    public TECamera(long j) {
        this.mTextureHolder = new C63897P5x();
        this.mCapturePipelines = new C169706lK<>();
        this.mCameraPreview = null;
        this.isFirstOpen = true;
        this.mDropFrame = -1;
        this.mEnableNotify = true;
        this.mHasFirstFrameCaptured = false;
        this.mbCanReleaseSurfaceTexture = true;
        this.mCanDropFrame = false;
        this.mCaptureListener = new P6N(this);
        this.mHandle = j;
        if (nativeInit(this.mHandle) != 0) {
            this.mHandle = 0L;
        }
    }

    public void preventTextureRender(boolean z) {
        this.mPreventTextureRender = z;
    }

    public void setCameraParams(P6E p6e) {
        P3Y p3y = p6e.LJII;
        int i = p3y.LIZLLL;
        EnumC63901P6b enumC63901P6b = p3y.LIZIZ;
        if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES) {
            if (p6e.LIZLLL() == 0 && this.mTextureHolder.LIZ != 0) {
                updatePipelineTextureId();
                int i2 = this.mTextureHolder.LIZ;
                P3Y p3y2 = p6e.LJII;
                if (p3y2 instanceof P6C) {
                    ((P6C) p3y2).LJFF = i2;
                }
            }
            int LIZLLL = p6e.LIZLLL();
            int ordinal = this.mCameraSetting.getOutputMode().ordinal();
            TEFrameSizei tEFrameSizei = p6e.LJII.LIZ;
            TECameraFrameSetting tECameraFrameSetting = new TECameraFrameSetting(LIZLLL, ordinal, tEFrameSizei.width, tEFrameSizei.height, i, p6e.LIZIZ(), this.mUseFront, p6e.LJII.LIZIZ.ordinal(), 0);
            this.mCameraFrameSetting = tECameraFrameSetting;
            tECameraFrameSetting.setDependSurfaceTimestamp(p6e.LJ);
            this.mCameraFrameSetting.setEnableMatchFrameHandleFps(p6e.LJFF);
            this.mCameraFrameSetting.setTimestampInNS(p6e.LIZJ);
            P6S p6s = p6e.LIZLLL;
            if (p6s != null) {
                TECameraFrameSetting tECameraFrameSetting2 = this.mCameraFrameSetting;
                HashMap<String, Integer> hashMap = new HashMap<>();
                TotalCaptureResult totalCaptureResult = p6s.LIZ;
                if (totalCaptureResult != null) {
                    Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                    if (l != null) {
                        hashMap.put("exposuretime", Integer.valueOf(new Rational((int) (l.longValue() / 1000000), 1000).intValue()));
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Integer num = (Integer) p6s.LIZ.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                        Integer num2 = (Integer) p6s.LIZ.get(CaptureResult.SENSOR_SENSITIVITY);
                        if (num2 != null && num != null) {
                            hashMap.put("iso", Integer.valueOf((num.intValue() * num2.intValue()) / 100));
                        }
                        int i3 = p6s.LIZIZ;
                        if (i3 != -1) {
                            hashMap.put("maxiso", Integer.valueOf(i3));
                        }
                        int i4 = p6s.LIZJ;
                        if (i4 != -1) {
                            hashMap.put("minIso", Integer.valueOf(i4));
                        }
                    }
                }
                hashMap.put("aeState", Integer.valueOf(p6s.LIZLLL));
                tECameraFrameSetting2.setMetadata(hashMap);
            }
        } else if (p3y.LIZJ == 3) {
            ImageFrame TEImageFrame2ImageFrame = TEFrameUtils.TEImageFrame2ImageFrame(p6e);
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 3, 3);
            ByteBuffer[] byteBufferArr = new ByteBuffer[3];
            new P6V(TEImageFrame2ImageFrame).LIZ(iArr, byteBufferArr);
            VECameraSettings vECameraSettings = this.mCameraSetting;
            if (vECameraSettings == null || vECameraSettings.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                this.mCameraFrameSetting = new TECameraFrameSetting(this.mCameraSetting.getOutputMode().ordinal(), TEImageFrame2ImageFrame.getWidth(), TEImageFrame2ImageFrame.getHeight(), i, this.mUseFront, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], EnumC63901P6b.PIXEL_FORMAT_YUV420P.ordinal());
            } else if (this.mCameraSetting.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                this.mCameraFrameSetting = new TECameraFrameSetting(this.mTextureHolder.LIZ, this.mCameraSetting.getOutputMode().ordinal(), TEImageFrame2ImageFrame.getWidth(), TEImageFrame2ImageFrame.getHeight(), i, p6e.LIZIZ(), this.mUseFront, byteBufferArr[0], iArr[0], byteBufferArr[1], iArr[1], byteBufferArr[2], iArr[2], EnumC63901P6b.PIXEL_FORMAT_YUV420P.ordinal());
            }
        } else if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_NV21 || enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_JPEG) {
            VECameraSettings vECameraSettings2 = this.mCameraSetting;
            if (vECameraSettings2 == null || vECameraSettings2.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                int ordinal2 = this.mCameraSetting.getOutputMode().ordinal();
                TEFrameSizei tEFrameSizei2 = p6e.LJII.LIZ;
                this.mCameraFrameSetting = new TECameraFrameSetting(ordinal2, tEFrameSizei2.width, tEFrameSizei2.height, i, this.mUseFront, p6e.LIZ(), p6e.LJII.LIZIZ.ordinal());
            } else if (this.mCameraSetting.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
                int i5 = this.mTextureHolder.LIZ;
                int ordinal3 = this.mCameraSetting.getOutputMode().ordinal();
                TEFrameSizei tEFrameSizei3 = p6e.LJII.LIZ;
                this.mCameraFrameSetting = new TECameraFrameSetting(i5, ordinal3, tEFrameSizei3.width, tEFrameSizei3.height, i, p6e.LIZIZ(), this.mUseFront, p6e.LIZ(), p6e.LJII.LIZIZ.ordinal());
            }
        } else if (enumC63901P6b == EnumC63901P6b.PIXEL_FORMAT_ARGB8) {
            VECameraSettings vECameraSettings3 = this.mCameraSetting;
            if (vECameraSettings3 == null || vECameraSettings3.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
                byte[] LIZ = p6e.LIZ();
                int capacity = ByteBuffer.wrap(p6e.LIZ()).capacity();
                TEFrameSizei tEFrameSizei4 = p6e.LJII.LIZ;
                TECameraFrameSetting tECameraFrameSetting3 = new TECameraFrameSetting(LIZ, capacity, tEFrameSizei4.width, tEFrameSizei4.height, i, P6Z.TEPixFmt_ARGB8.ordinal());
                this.mCameraFrameSetting = tECameraFrameSetting3;
                tECameraFrameSetting3.setCameraOutPutMode(this.mCameraSetting.getOutputMode().ordinal());
            }
        } else {
            P4Q.LIZJ("TECamera", "Not support now!!");
        }
        if (this.mHandle != 0) {
            nativeCameraParam(this.mHandle, this.mCameraFrameSetting);
        }
    }

    public void setEnableCameraNotify(boolean z) {
        VEConfigCenter.getInstance().getValue("ve_titan_release_block_time_real", -1);
        this.mEnableNotify = z;
    }

    public void setOnCameraInfoListener(P6T p6t) {
        this.mOnCameraInfoListener = p6t;
    }

    public int startCameraPreview(P6Q p6q) {
        P6O p6o;
        TEFrameSizei tEFrameSizei;
        if (p6q != null) {
            VESize LJI = p6q.LJI();
            Iterator<P6O> it = this.mCapturePipelines.LIZJ().iterator();
            while (true) {
                if (it.hasNext()) {
                    p6o = it.next();
                    if (p6o != null && p6o.LIZLLL) {
                        break;
                    }
                } else {
                    p6o = null;
                    break;
                }
            }
            if (LJI != null && p6o != null && (tEFrameSizei = p6o.LIZIZ) != null) {
                tEFrameSizei.width = LJI.width;
                tEFrameSizei.height = LJI.height;
            }
            return p6q.LJIILLIIL(this.mCapturePipelines);
        }
        return 0;
    }

    public C169706lK<P6O> createCapturePipeline(P6Q p6q, boolean z) {
        setEnableCameraNotify(true);
        VECameraSettings LLJJJJLIIL = p6q.LLJJJJLIIL();
        this.mCameraSetting = LLJJJJLIIL;
        if (LLJJJJLIIL == null) {
            P4Q.LIZJ("TECamera", "mCameraSetting is null.");
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createCapturePipeline, enableDetach = ");
        LIZ.append(z);
        P4Q.LJFF("TECamera", X1D.LIZIZ(LIZ));
        this.mCameraPreview = p6q;
        C63897P5x c63897P5x = this.mTextureHolder;
        synchronized (c63897P5x) {
            if (z) {
                c63897P5x.LIZ = 0;
                if (Build.VERSION.SDK_INT >= 26) {
                    c63897P5x.LIZIZ = new C63898P5y();
                } else {
                    C63898P5y c63898P5y = new C63898P5y(0);
                    c63897P5x.LIZIZ = c63898P5y;
                    c63898P5y.detachFromGLContext();
                }
                c63897P5x.LIZLLL = 1;
            } else {
                c63897P5x.LIZ = P62.LIZ();
                c63897P5x.LIZIZ = new C63898P5y(c63897P5x.LIZ);
                c63897P5x.LIZLLL = 0;
            }
            c63897P5x.LIZIZ.setOnFrameAvailableListener(new C63899P5z(c63897P5x));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("createSurfaceTexture SurfaceTextureID = ");
            LIZ2.append(c63897P5x.LIZ);
            LIZ2.append(", detachSurfaceTexture = ");
            LIZ2.append(z);
            P4Q.LJFF("TextureHolder", X1D.LIZIZ(LIZ2));
        }
        this.mSurfaceTexture = this.mTextureHolder.LIZIZ;
        VECameraSettings.CAMERA_OUTPUT_MODE outputMode = this.mCameraSetting.getOutputMode();
        VECameraSettings.CAMERA_OUTPUT_MODE camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        if (outputMode == camera_output_mode && this.mCameraSetting.isVESetCameraTwoOutputMode()) {
            P4Q.LJFF("TECamera", "VE Set Camera Two output mode.");
            this.mCameraSetting.setOutPutMode(VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME);
        }
        if (this.mCameraSetting.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.FRAME) {
            if (this.mCameraSetting.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE1) {
                this.mCapturePipeline = new P6R(0, this.mTextureHolder.LIZIZ, new TEFrameSizei(p6q.LJI().width, p6q.LJI().height), this.mCaptureListener);
            } else {
                this.mCameraSetting.setOutPutMode(camera_output_mode);
            }
        }
        if (this.mCameraSetting.getOutputMode() == camera_output_mode) {
            TEFrameSizei tEFrameSizei = new TEFrameSizei(p6q.LJI().width, p6q.LJI().height);
            InterfaceC63916P6q interfaceC63916P6q = this.mCaptureListener;
            C63897P5x c63897P5x2 = this.mTextureHolder;
            this.mCapturePipeline = new P6P(c63897P5x2.LIZ, c63897P5x2.LIZIZ, tEFrameSizei, interfaceC63916P6q);
        } else if (this.mCameraSetting.getOutputMode() == VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE_FRAME) {
            this.mCapturePipeline = new P6R(1, this.mTextureHolder.LIZIZ, new TEFrameSizei(p6q.LJI().width, p6q.LJI().height), this.mCaptureListener);
        }
        this.mCapturePipelines.LIZIZ();
        this.mCapturePipelines.LIZ(this.mCapturePipeline);
        return this.mCapturePipelines;
    }

    public int start(P6Q p6q, boolean z) {
        P4Q.LJFF("TECamera", "start");
        createCapturePipeline(p6q, z);
        if (this.mCameraSetting == null) {
            P4Q.LIZJ("TECamera", "mCameraSetting is null.");
            return -100;
        }
        return startCameraPreview(p6q);
    }
}
