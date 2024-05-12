package com.ss.ttlivestreamer.livestreamv2.capture;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class CameraUtils {
    public static final List<CameraSize> mFacingCameraSizeList = new ArrayList();
    public static final List<CameraSize> mBackingCameraSizeList = new ArrayList();
    public static boolean mGotCameraSizeList = false;
    public static final List<CameraSize> COMMON_CAMERA_SIZE_LIST = Arrays.asList(new CameraSize(320, 240), new CameraSize(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT, 480), new CameraSize(1280, 720));

    /* loaded from: classes12.dex */
    public static class CameraSize {
        public final int height;
        public final int width;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CameraSize{width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(" aspect= ");
            LIZ.append((this.width * 1.0f) / this.height);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public CameraSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    /* loaded from: classes12.dex */
    public static class CameraSizeSet {
        public CameraSize commonSize;
        public CameraSize matchSize;
        public CameraSize originSize;
        public CameraSize properSize;
        public CameraSize similarSize;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CameraSizeSet{originSize=");
            LIZ.append(this.originSize);
            LIZ.append(", properSize=");
            LIZ.append(this.properSize);
            LIZ.append(", similarSize=");
            LIZ.append(this.similarSize);
            LIZ.append(", commonSize=");
            LIZ.append(this.commonSize);
            LIZ.append(", matchSize=");
            LIZ.append(this.matchSize);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    public static void clearRecords() {
        CameraRecord.clearCameraFps();
        CameraRecord.clearExposureTime();
    }

    public static synchronized void getCameraResolutionList(Context context) {
        synchronized (CameraUtils.class) {
            if (!mGotCameraSizeList) {
                CameraManager cameraManager = (CameraManager) C16880lQ.LLILL(context, "camera");
                try {
                    getCameraResolutionWithCameraId(cameraManager, 0, mFacingCameraSizeList);
                    getCameraResolutionWithCameraId(cameraManager, 1, mBackingCameraSizeList);
                    mGotCameraSizeList = true;
                } catch (Exception e) {
                    mGotCameraSizeList = false;
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public static CameraSize flipIfNeed(CameraSize cameraSize, boolean z) {
        if (z) {
            return new CameraSize(cameraSize.height, cameraSize.width);
        }
        return new CameraSize(cameraSize.width, cameraSize.height);
    }

    public static CameraSize getOriginCaptureSize(int i, int i2) {
        boolean z;
        CameraSize cameraSize;
        if (i < i2) {
            z = true;
            int i3 = i ^ i2;
            i2 ^= i3;
            i = i3 ^ i2;
        } else {
            z = false;
        }
        if (i <= 1280 && i2 <= 720) {
            if (z) {
                cameraSize = new CameraSize(720, 1280);
            } else {
                cameraSize = new CameraSize(1280, 720);
            }
            return cameraSize;
        }
        if (z) {
            return new CameraSize(1080, 1920);
        }
        return new CameraSize(1920, 1080);
    }

    public static boolean isResolutionInList(CameraSize cameraSize, List<CameraSize> list) {
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                CameraSize cameraSize2 = (CameraSize) ListProtector.get(list, i);
                if (cameraSize.width == cameraSize2.width && cameraSize.height == cameraSize2.height) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean canUse(int i, int i2, CameraSize cameraSize) {
        if (cameraSize.width / i >= 2 || cameraSize.height / i2 >= 2) {
            return false;
        }
        return true;
    }

    public static void getCameraResolutionWithCameraId(CameraManager cameraManager, int i, List<CameraSize> list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(i);
        for (Size size : ((StreamConfigurationMap) cameraManager.getCameraCharacteristics(X1D.LIZIZ(LIZ)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)) {
            list.add(new CameraSize(size.getWidth(), size.getHeight()));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cameraid:");
            LIZ2.append(i);
            LIZ2.append(", Width: ");
            LIZ2.append(size.getWidth());
            LIZ2.append(", Height: ");
            LIZ2.append(size.getHeight());
            AVLog.e("CameraResolution", X1D.LIZIZ(LIZ2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r2 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r5 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getRecommendLinkMicFps(com.ss.ttlivestreamer.livestreamv2.core.LiveCore r11, int r12, int r13) {
        /*
            double r9 = com.ss.ttlivestreamer.livestreamv2.capture.CameraRecord.getAvgFps()
            long r7 = com.ss.ttlivestreamer.livestreamv2.capture.CameraRecord.getAvgExposureTime()
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r0
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r0 = r11.getBuilder()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.getSdkSetting()
            int r0 = r0.linkmicNormalLiveMinFps
            if (r0 <= 0) goto L9c
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r0 = r11.getBuilder()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.getSdkSetting()
            int r6 = r0.linkmicNormalLiveMinFps
        L22:
            double r1 = (double) r6
            r4 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L9a
            r5 = 1
        L29:
            r0 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L98
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0 / r6
            long r1 = (long) r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L98
            r2 = 1
        L38:
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r0 = r11.getBuilder()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.getSdkSetting()
            int r1 = r0.lightCheckStrategy
            if (r1 == 0) goto L83
            if (r1 == r4) goto L86
            r0 = 2
            if (r1 == r0) goto L7c
        L49:
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r0 = r11.getBuilder()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase$VideoCaptureParams r0 = r0.getVideoCaptureParams()
            int r1 = r0.minFps
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r0 = r11.getBuilder()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase$VideoCaptureParams r0 = r0.getVideoCaptureParams()
            int r3 = r0.fps
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r0 = r11.getBuilder()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.getSdkSetting()
            int r0 = r0.darkSyncMinEnable
            if (r0 != r4) goto L9e
            if (r13 <= r1) goto L9e
            android.util.Pair r2 = new android.util.Pair
            if (r1 != 0) goto L70
            r1 = 7
        L70:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r2.<init>(r1, r0)
            return r2
        L7c:
            if (r3 <= 0) goto L83
            if (r5 == 0) goto L49
            if (r2 == 0) goto L49
            goto L8a
        L83:
            if (r5 == 0) goto L49
            goto L8a
        L86:
            if (r5 != 0) goto L8a
            if (r2 == 0) goto L49
        L8a:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r2.<init>(r1, r0)
            return r2
        L98:
            r2 = 0
            goto L38
        L9a:
            r5 = 0
            goto L29
        L9c:
            r6 = r12
            goto L22
        L9e:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.capture.CameraUtils.getRecommendLinkMicFps(com.ss.ttlivestreamer.livestreamv2.core.LiveCore, int, int):android.util.Pair");
    }

    public static CameraSizeSet getCameraResult(Context context, int i, int i2, boolean z) {
        boolean z2;
        CameraSize cameraSize;
        List<CameraSize> list;
        CameraSize cameraSize2;
        CameraSize cameraSize3;
        if (!mGotCameraSizeList) {
            getCameraResolutionList(context);
        }
        if (i < i2) {
            z2 = true;
            int i3 = i ^ i2;
            i2 ^= i3;
            i = i3 ^ i2;
        } else {
            z2 = false;
        }
        if (i <= 1280 && i2 <= 720) {
            if (z2) {
                cameraSize = new CameraSize(720, 1280);
            } else {
                cameraSize = new CameraSize(1280, 720);
            }
        } else if (z2) {
            cameraSize = new CameraSize(1080, 1920);
        } else {
            cameraSize = new CameraSize(1920, 1080);
        }
        CameraSize cameraSize4 = null;
        if (i == 1920 && i2 == 1088) {
            cameraSize = new CameraSize(1920, 1080);
            cameraSize3 = null;
            cameraSize2 = null;
        } else {
            if (z) {
                list = mFacingCameraSizeList;
            } else {
                list = mBackingCameraSizeList;
            }
            CameraSize cameraSize5 = null;
            cameraSize2 = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                CameraSize cameraSize6 = (CameraSize) ListProtector.get(list, size);
                int i4 = cameraSize6.width;
                int i5 = cameraSize6.height;
                if (i4 < i5) {
                    AVLog.iow("CameraUtils", C16880lQ.LLLZ("camera list invalid. temp=[%d,%d], why?", new Object[]{Integer.valueOf(i4), Integer.valueOf(cameraSize6.height)}));
                } else if (i4 >= i && i5 >= i2) {
                    if (i4 == i || i5 == i2) {
                        cameraSize2 = flipIfNeed(cameraSize6, z2);
                    }
                    if (cameraSize4 == null && isResolutionInList(cameraSize6, COMMON_CAMERA_SIZE_LIST)) {
                        cameraSize4 = flipIfNeed(cameraSize6, z2);
                    }
                    if (cameraSize5 == null) {
                        cameraSize5 = flipIfNeed(cameraSize6, z2);
                    }
                }
            }
            cameraSize3 = cameraSize4;
            cameraSize4 = cameraSize5;
        }
        CameraSizeSet cameraSizeSet = new CameraSizeSet();
        cameraSizeSet.originSize = cameraSize;
        cameraSizeSet.similarSize = cameraSize4;
        cameraSizeSet.commonSize = cameraSize3;
        cameraSizeSet.matchSize = cameraSize2;
        return cameraSizeSet;
    }

    public static CameraSize pickBest(Context context, int i, int i2, boolean z) {
        CameraSizeSet cameraResult = getCameraResult(context, i, i2, z);
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        CameraSize cameraSize = cameraResult.commonSize;
        if (cameraSize != null && canUse(max, min, cameraSize)) {
            return cameraResult.commonSize;
        }
        return new CameraSize(1280, 720);
    }
}
