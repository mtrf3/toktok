package com.ss.android.ttvecamera;

import X.C01R;
import X.C03880Dg;
import X.C39519Ff9;
import X.C63824P3c;
import X.C63915P6p;
import X.C63922P6w;
import X.C63923P6x;
import X.C65300Pk0;
import X.C84134X0g;
import X.C84143X0p;
import X.C84151X0x;
import X.C87365YQn;
import X.C87367YQp;
import X.EnumC84152X0y;
import X.InterfaceC63852P4e;
import X.InterfaceC63917P6r;
import X.InterfaceC63921P6v;
import X.InterfaceC84019WyF;
import X.InterfaceC84050Wyk;
import X.InterfaceC84144X0q;
import X.InterfaceC84145X0r;
import X.InterfaceC84146X0s;
import X.InterfaceC84147X0t;
import X.InterfaceC84148X0u;
import X.InterfaceC84149X0v;
import X.InterfaceC84150X0w;
import X.InterfaceC87361YQj;
import X.InterfaceC87368YQq;
import X.InterfaceC87369YQr;
import X.InterfaceC87374YQw;
import X.P3H;
import X.P3Q;
import X.P6E;
import X.P7T;
import X.P9I;
import X.PDF;
import X.PZA;
import X.X1D;
import X.YR0;
import X.YR1;
import X.YR2;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class TECameraCapture {
    public InterfaceC84050Wyk mCameraFpsConfigCallback;
    public YR1 mCameraObserver;
    public C84134X0g mCameraSettings;
    public PDF mPictureSizeCallback;
    public P3Q mPreviewSizeCallback = null;
    public Map<String, Bundle> mAllDevicesFeatures = new HashMap();

    public static int com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ttvecamera_TECameraCapture_connect(TECameraCapture tECameraCapture, C84134X0g c84134X0g, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100801, "com/ss/android/ttvecamera/TECameraCapture", "connect", tECameraCapture, new Object[]{c84134X0g, cert}, "int", new C65300Pk0(false, "(Lcom/ss/android/ttvecamera/TECameraSettings;Lcom/bytedance/bpea/basics/Cert;)I", "-4638015418949401066"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.connect(c84134X0g, cert);
    }

    public static int com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ttvecamera_TECameraCapture_disConnect(TECameraCapture tECameraCapture, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100803, "com/ss/android/ttvecamera/TECameraCapture", "disConnect", tECameraCapture, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "-4638015418949401066"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.disConnect(cert);
    }

    public static int com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ttvecamera_TECameraCapture_disConnect(TECameraCapture tECameraCapture, boolean z, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100803, "com/ss/android/ttvecamera/TECameraCapture", "disConnect", tECameraCapture, new Object[]{Boolean.valueOf(z), cert}, "int", new C65300Pk0(false, "(ZLcom/bytedance/bpea/basics/Cert;)I", "-4638015418949401066"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.disConnect(z, cert);
    }

    public static int convertFacing(int i) {
        return i == 0 ? 1 : 0;
    }

    public static void fillCameraFeatures(Context context, int i, Bundle bundle) {
    }

    public static boolean fillDeviceFeatures(Context context, int i, Bundle bundle) {
        return false;
    }

    public static boolean isCameraSupport(Context context, int i) {
        return true;
    }

    public void changeCaptureFormat() {
    }

    public int disConnect() {
        return com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ttvecamera_TECameraCapture_disConnect(this, null);
    }

    public int stop() {
        return stop(false);
    }

    private List<TEFrameSizei> getSupportedPictureSizes() {
        return EnumC84152X0y.INSTANCE.getSupportedPictureSizes(this);
    }

    private List<TEFrameSizei> getSupportedPreviewSizes() {
        return EnumC84152X0y.INSTANCE.getSupportedPreviewSizes(this);
    }

    public int abortSession() {
        return EnumC84152X0y.INSTANCE.abortSession(this);
    }

    public int cancelFocus() {
        return EnumC84152X0y.INSTANCE.cancelFocus(this);
    }

    public void downExposureCompensation() {
        EnumC84152X0y.INSTANCE.downExposureCompensation(this);
    }

    public int enableCaf() {
        return EnumC84152X0y.INSTANCE.enableCaf(this);
    }

    public int[] getCameraCaptureSize() {
        return EnumC84152X0y.INSTANCE.getCameraCaptureSize();
    }

    public C63824P3c getCameraECInfo() {
        return EnumC84152X0y.INSTANCE.getCameraECInfo(this);
    }

    public int getCameraState() {
        return EnumC84152X0y.INSTANCE.getCameraState();
    }

    public int getExposureCompensation() {
        return EnumC84152X0y.INSTANCE.getExposureCompensation(this);
    }

    public int getFlashMode() {
        return EnumC84152X0y.INSTANCE.getFlashMode(this);
    }

    public int[] getPictureSize() {
        return EnumC84152X0y.INSTANCE.getPictureSize(this);
    }

    public int[] getPreviewFps() {
        return EnumC84152X0y.INSTANCE.getPreviewFps();
    }

    public boolean isAutoExposureLockSupported() {
        return EnumC84152X0y.INSTANCE.isAutoExposureLockSupported(this);
    }

    public boolean isAutoFocuseLockSupported() {
        return EnumC84152X0y.INSTANCE.isAutoFocusLockSupported(this);
    }

    public boolean isCameraSwitchState() {
        return EnumC84152X0y.INSTANCE.isCameraSwitchState();
    }

    public boolean isSupportWhileBalance() {
        return EnumC84152X0y.INSTANCE.isSupportWhileBalance(this);
    }

    public boolean isSupportedExposureCompensation() {
        return EnumC84152X0y.INSTANCE.isSupportedExposureCompensation(this);
    }

    public boolean isTorchSupported() {
        return EnumC84152X0y.INSTANCE.isTorchSupported(this);
    }

    public int removeCameraProvider() {
        return EnumC84152X0y.INSTANCE.removeCameraProvider(this);
    }

    public int start() {
        return EnumC84152X0y.INSTANCE.start(this);
    }

    public int startRecording() {
        return EnumC84152X0y.INSTANCE.startRecording();
    }

    public int stopRecording() {
        return EnumC84152X0y.INSTANCE.stopRecording();
    }

    public void upExposureCompensation() {
        EnumC84152X0y.INSTANCE.upExposureCompensation(this);
    }

    public TECameraCapture(YR1 yr1) {
        this.mCameraObserver = YR2.LIZ();
        this.mCameraObserver = yr1;
    }

    public static void registerException(InterfaceC87369YQr interfaceC87369YQr) {
        WeakReference<InterfaceC87369YQr> weakReference;
        if (interfaceC87369YQr == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(interfaceC87369YQr);
        }
        C87365YQn.LIZ = weakReference;
    }

    public static void registerMonitor(InterfaceC87368YQq interfaceC87368YQq) {
        C87367YQp.LIZ = interfaceC87368YQq;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        EnumC84152X0y.INSTANCE.addCameraAlgorithm(tECameraAlgorithmParam);
    }

    public int addCameraProvider(C63915P6p c63915P6p) {
        return EnumC84152X0y.INSTANCE.addCameraProvider(this, c63915P6p);
    }

    public void changeAppLifeCycle(boolean z) {
        EnumC84152X0y.INSTANCE.appLifeCycleChanged(z);
    }

    public int changeCurrentControlCam(int i) {
        return EnumC84152X0y.INSTANCE.changeCurrentControlCam(this, i);
    }

    public int connect(C84134X0g c84134X0g) {
        return com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ttvecamera_TECameraCapture_connect(this, c84134X0g, null);
    }

    public int disConnect(Cert cert) {
        EnumC84152X0y enumC84152X0y = EnumC84152X0y.INSTANCE;
        enumC84152X0y.registerFpsConfigListener(null);
        return enumC84152X0y.disConnect(this, cert);
    }

    public void enableMulticamZoom(boolean z) {
        EnumC84152X0y.INSTANCE.enableMulticamZoom(this, z);
    }

    public int focusAtPoint(C84151X0x c84151X0x) {
        c84151X0x.getClass();
        c84151X0x.LJFF = System.currentTimeMillis();
        return EnumC84152X0y.INSTANCE.focusAtPoint(this, c84151X0x);
    }

    public float[] getApertureRange(InterfaceC84144X0q interfaceC84144X0q) {
        return EnumC84152X0y.INSTANCE.getApertureRange(this, interfaceC84144X0q);
    }

    public long getAvgExpTime(boolean z) {
        return EnumC84152X0y.INSTANCE.getAvgExpTime(z);
    }

    public JSONObject getCameraCapabilitiesForBytebench(InterfaceC84145X0r interfaceC84145X0r) {
        return EnumC84152X0y.INSTANCE.getCameraCapbilitiesForBytebench(this, interfaceC84145X0r);
    }

    public int getCameraState(boolean z) {
        return EnumC84152X0y.INSTANCE.getCameraState(z);
    }

    public float[] getFOV(InterfaceC84019WyF interfaceC84019WyF) {
        return EnumC84152X0y.INSTANCE.getFOV(this, interfaceC84019WyF);
    }

    public int getISO(P3H p3h) {
        return EnumC84152X0y.INSTANCE.getISO(this, p3h);
    }

    public int[] getISORange(InterfaceC63852P4e interfaceC63852P4e) {
        return EnumC84152X0y.INSTANCE.getISORange(this, interfaceC63852P4e);
    }

    public float getManualFocusAbility(InterfaceC84147X0t interfaceC84147X0t) {
        return EnumC84152X0y.INSTANCE.getManualFocusAbility(this, interfaceC84147X0t);
    }

    public long[] getShutterTimeRange(InterfaceC84150X0w interfaceC84150X0w) {
        return EnumC84152X0y.INSTANCE.getShutterTimeRange(this, interfaceC84150X0w);
    }

    public boolean isARCoreSupported(Context context) {
        return P9I.LIZIZ(2, context).LJII();
    }

    public void needToReleaseSurfaceTexture(boolean z) {
        EnumC84152X0y.INSTANCE.needToReleaseSurfaceTexture(z);
    }

    public void notifyHostForegroundVisible(boolean z) {
        EnumC84152X0y.INSTANCE.notifyHostForegroundVisible(this, z);
    }

    public void process(C84143X0p c84143X0p) {
        EnumC84152X0y.INSTANCE.process(this, c84143X0p);
    }

    public P6E processAlgorithm(P6E p6e) {
        return EnumC84152X0y.INSTANCE.processAlgorithm(p6e);
    }

    public void queryFeatures(Bundle bundle) {
        C84134X0g c84134X0g = this.mCameraSettings;
        if (c84134X0g == null) {
            C63922P6w.LIZIZ("TECameraCapture", "query features failed, maybe not connet");
        } else {
            queryFeatures(c84134X0g.LLIIIILZ, bundle);
        }
    }

    public float queryShaderZoomAbility(InterfaceC84149X0v interfaceC84149X0v) {
        return EnumC84152X0y.INSTANCE.queryShaderZoomStep(this, interfaceC84149X0v);
    }

    public void registerFpsConfigListener(InterfaceC84050Wyk interfaceC84050Wyk) {
        this.mCameraFpsConfigCallback = interfaceC84050Wyk;
    }

    public void registerPreviewListener(P3Q p3q) {
        this.mPreviewSizeCallback = p3q;
    }

    public void removeCameraAlgorithm(int i) {
        EnumC84152X0y.INSTANCE.removeCameraAlgorithm(i);
    }

    public void setAperture(float f) {
        EnumC84152X0y.INSTANCE.setAperture(this, f);
    }

    public void setAutoExposureLock(boolean z) {
        EnumC84152X0y.INSTANCE.setAutoExposureLock(this, z);
    }

    public void setAutoFocusLock(boolean z) {
        EnumC84152X0y.INSTANCE.setAutoFocusLock(this, z);
    }

    public void setDeviceRotation(int i) {
        EnumC84152X0y.INSTANCE.setDeviceRotation(i);
    }

    public void setExposureCompensation(int i) {
        EnumC84152X0y.INSTANCE.setExposureCompensation(this, i);
    }

    public void setFeatureParameters(Bundle bundle) {
        EnumC84152X0y.INSTANCE.setFeatureParameters(this, bundle);
    }

    public void setISO(int i) {
        EnumC84152X0y.INSTANCE.setISO(this, i);
    }

    public void setLensCallback(InterfaceC63917P6r interfaceC63917P6r) {
        EnumC84152X0y.INSTANCE.setLensCallback(interfaceC63917P6r);
    }

    public void setManualFocusDistance(float f) {
        EnumC84152X0y.INSTANCE.setManualFocusDistance(this, f);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        EnumC84152X0y.INSTANCE.setPreviewFpsRange(tEFrameRateRange);
    }

    public void setPreviewFpsRangeWhenRunning(TEFrameRateRange tEFrameRateRange) {
        EnumC84152X0y.INSTANCE.setPreviewFpsRangeWhenRunning(tEFrameRateRange);
    }

    public void setSATZoomCallback(InterfaceC84148X0u interfaceC84148X0u) {
        EnumC84152X0y.INSTANCE.setSATZoomCallback(interfaceC84148X0u);
    }

    public void setSceneMode(int i) {
        EnumC84152X0y.INSTANCE.setSceneMode(this, i);
    }

    public void setShutterTime(long j) {
        EnumC84152X0y.INSTANCE.setShutterTime(this, j);
    }

    public int stop(boolean z) {
        return EnumC84152X0y.INSTANCE.stop(this, z);
    }

    public int stopZoom(InterfaceC87361YQj interfaceC87361YQj) {
        return EnumC84152X0y.INSTANCE.stopZoom(this, interfaceC87361YQj);
    }

    public int switchCamera(int i) {
        return switchCamera(i, (Cert) null);
    }

    public int switchFlashMode(int i) {
        return EnumC84152X0y.INSTANCE.switchFlashMode(this, i);
    }

    public int takePicture(PZA pza) {
        return EnumC84152X0y.INSTANCE.takePicture(this, pza);
    }

    public int toggleTorch(boolean z) {
        return EnumC84152X0y.INSTANCE.toggleTorch(this, z);
    }

    public void updateAllCameraFeatures(Bundle bundle) {
        C84134X0g c84134X0g = this.mCameraSettings;
        if (c84134X0g != null) {
            updateAllCameraFeatures(c84134X0g.LJLILLLLZI, bundle);
            Map<String, Bundle> map = this.mAllDevicesFeatures;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mCameraSettings.LJLILLLLZI);
            LIZ.append("_");
            LIZ.append(this.mCameraSettings.LJLJJI);
            if (map.containsKey(X1D.LIZIZ(LIZ))) {
                Map<String, Bundle> map2 = this.mAllDevicesFeatures;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.mCameraSettings.LJLILLLLZI);
                LIZ2.append("_");
                LIZ2.append(this.mCameraSettings.LJLJJI);
                Bundle bundle2 = map2.get(X1D.LIZIZ(LIZ2));
                if (bundle2 != null) {
                    bundle2.putAll(bundle);
                    return;
                }
                return;
            }
            Map<String, Bundle> map3 = this.mAllDevicesFeatures;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.mCameraSettings.LJLILLLLZI);
            LIZ3.append("_");
            LIZ3.append(this.mCameraSettings.LJLJJI);
            map3.put(X1D.LIZIZ(LIZ3), bundle);
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        EnumC84152X0y.INSTANCE.updateCameraAlgorithmParam(tECameraAlgorithmParam);
    }

    public void updateCameraProvider(C63915P6p c63915P6p) {
        EnumC84152X0y.INSTANCE.updateCameraProvider(this, c63915P6p);
    }

    public void updateTextureId(int i) {
        EnumC84152X0y.INSTANCE.updateTextureId(i);
    }

    public int disConnect(boolean z) {
        return com_ss_android_ttvecamera_TECameraCapture_com_ss_android_ttvecamera_TECameraCapture_disConnect(this, z, null);
    }

    public int switchCamera(C84134X0g c84134X0g) {
        return switchCamera(c84134X0g, (Cert) null);
    }

    public TECameraCapture(YR1 yr1, PDF pdf) {
        this.mCameraObserver = YR2.LIZ();
        this.mCameraObserver = yr1;
        this.mPictureSizeCallback = pdf;
        synchronized (P7T.class) {
            P7T.LIZ = false;
        }
    }

    public static void registerLogOutput(byte b, InterfaceC63921P6v interfaceC63921P6v) {
        if (interfaceC63921P6v != null) {
            C63922P6w.LIZJ = interfaceC63921P6v;
        } else {
            C63922P6w.LIZJ = new C63923P6x();
        }
        C63922P6w.LIZ = i0.LJFF("VESDK", "-");
        C63922P6w.LIZIZ = b;
    }

    private void updateAllCameraFeatures(int i, Bundle bundle) {
        int i2;
        int i3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateAllCameraFeatures with camera type: ");
        LIZ.append(i);
        C63922P6w.LIZLLL("TECameraCapture", X1D.LIZIZ(LIZ));
        Bundle bundle2 = new Bundle();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.mCameraSettings.LJLILLLLZI);
        LIZ2.append("_");
        LIZ2.append(this.mCameraSettings.LJLJJI);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        boolean z = false;
        if (11 == i) {
            bundle2.putInt("device_support_ai_night_video", 0);
        } else if (10 == i) {
            bundle2.putBoolean("device_should_use_shader_zoom", false);
        } else if (2 == i) {
            bundle2.putBoolean("device_support_multicamera_zoom", false);
        }
        bundle2.putInt("device_support_wide_angle_mode", 0);
        queryFeatures(LIZIZ, bundle2);
        if (11 == i) {
            int i4 = bundle2.getInt("device_support_ai_night_video");
            int i5 = bundle.getInt("device_support_ai_night_video");
            if (i4 > 0 && i5 > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            bundle.putInt("device_support_ai_night_video", i3);
        }
        int i6 = bundle2.getInt("device_support_wide_angle_mode");
        int i7 = bundle.getInt("device_support_wide_angle_mode");
        if (i6 > 0 && i7 > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        bundle.putInt("device_support_wide_angle_mode", i2);
        if (10 == i) {
            bundle.putBoolean("device_should_use_shader_zoom", bundle2.getBoolean("device_should_use_shader_zoom"));
        } else if (2 == i) {
            boolean z2 = bundle2.getBoolean("device_support_multicamera_zoom");
            boolean z3 = bundle.getBoolean("device_support_multicamera_zoom");
            if (z2 && z3) {
                z = true;
            }
            bundle.putBoolean("device_support_multicamera_zoom", z);
        }
        List<TEFrameSizei> supportedPreviewSizes = getSupportedPreviewSizes();
        List<TEFrameSizei> supportedPictureSizes = getSupportedPictureSizes();
        if (supportedPreviewSizes != null) {
            bundle.putParcelableArrayList("support_preview_sizes", (ArrayList) supportedPreviewSizes);
        }
        if (supportedPictureSizes != null) {
            bundle.putParcelableArrayList("support_picture_sizes", (ArrayList) supportedPictureSizes);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateAllCameraFeatures, feature bundle = ");
        LIZ3.append(bundle);
        C63922P6w.LIZLLL("TECameraCapture", X1D.LIZIZ(LIZ3));
    }

    public int captureBurst(InterfaceC84146X0s interfaceC84146X0s, YR0 yr0) {
        return EnumC84152X0y.INSTANCE.captureBurst(this, interfaceC84146X0s, yr0);
    }

    public void changeRecorderState(int i, InterfaceC87374YQw interfaceC87374YQw) {
        EnumC84152X0y.INSTANCE.changeRecorderState(this, i, interfaceC87374YQw);
    }

    public int connect(C84134X0g c84134X0g, Cert cert) {
        EnumC84152X0y enumC84152X0y = EnumC84152X0y.INSTANCE;
        enumC84152X0y.registerFpsConfigListener(this.mCameraFpsConfigCallback);
        enumC84152X0y.registerPreviewSizeListener(this.mPreviewSizeCallback);
        int connect = enumC84152X0y.connect(this, this.mCameraObserver, c84134X0g, this.mPictureSizeCallback, cert);
        if (connect == 0) {
            this.mCameraSettings = c84134X0g;
        }
        return connect;
    }

    public int disConnect(boolean z, Cert cert) {
        EnumC84152X0y enumC84152X0y = EnumC84152X0y.INSTANCE;
        enumC84152X0y.registerFpsConfigListener(null);
        return enumC84152X0y.disConnect(this, z, cert);
    }

    public TEFrameSizei getBestPreviewSize(float f, TEFrameSizei tEFrameSizei) {
        return EnumC84152X0y.INSTANCE.getBestPreviewSize(this, f, tEFrameSizei);
    }

    public synchronized void getCameraAllFeatures(Context context, Bundle bundle) {
        if (this.mCameraSettings != null) {
            Map<String, Bundle> map = this.mAllDevicesFeatures;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mCameraSettings.LJLILLLLZI);
            LIZ.append("_");
            LIZ.append(this.mCameraSettings.LJLJJI);
            if (map.containsKey(X1D.LIZIZ(LIZ))) {
                Map<String, Bundle> map2 = this.mAllDevicesFeatures;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.mCameraSettings.LJLILLLLZI);
                LIZ2.append("_");
                LIZ2.append(this.mCameraSettings.LJLJJI);
                Bundle bundle2 = map2.get(X1D.LIZIZ(LIZ2));
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
            } else {
                getCameraAllFeatures(context, this.mCameraSettings.LJLILLLLZI, bundle);
                Map<String, Bundle> map3 = this.mAllDevicesFeatures;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this.mCameraSettings.LJLILLLLZI);
                LIZ3.append("_");
                LIZ3.append(this.mCameraSettings.LJLJJI);
                map3.put(X1D.LIZIZ(LIZ3), bundle);
            }
        }
    }

    public void queryFeatures(String str, Bundle bundle) {
        EnumC84152X0y.INSTANCE.queryFeatures(str, bundle);
    }

    public int queryZoomAbility(InterfaceC87361YQj interfaceC87361YQj, boolean z) {
        return EnumC84152X0y.INSTANCE.queryZoomAbility(this, interfaceC87361YQj, z);
    }

    public void setPictureSize(int i, int i2) {
        EnumC84152X0y.INSTANCE.setPictureSize(this, i, i2);
    }

    public void setWhileBalance(boolean z, String str) {
        EnumC84152X0y.INSTANCE.setWhileBalance(this, z, str);
    }

    public int start(SurfaceTexture surfaceTexture, int i) {
        C63922P6w.LIZIZ("TECameraCapture", "Do not use this interface!!");
        return start();
    }

    public int startZoom(float f, InterfaceC87361YQj interfaceC87361YQj) {
        return EnumC84152X0y.INSTANCE.startZoom(this, f, interfaceC87361YQj);
    }

    public int switchCamera(C84134X0g c84134X0g, Cert cert) {
        int switchCamera = EnumC84152X0y.INSTANCE.switchCamera(this, c84134X0g, cert);
        if (switchCamera == 0) {
            this.mCameraSettings = c84134X0g;
        }
        return switchCamera;
    }

    public int switchCameraMode(int i, C84134X0g c84134X0g) {
        if (c84134X0g != null) {
            this.mCameraSettings = c84134X0g;
        }
        return EnumC84152X0y.INSTANCE.switchCameraMode(this, i);
    }

    public int zoomV2(float f, InterfaceC87361YQj interfaceC87361YQj) {
        return EnumC84152X0y.INSTANCE.zoomV2(this, f, interfaceC87361YQj);
    }

    public int switchCamera(int i, Cert cert) {
        return EnumC84152X0y.INSTANCE.switchCamera(this, i, cert);
    }

    private void getCameraAllFeatures(Context context, int i, Bundle bundle) {
        if (10 == i) {
            Bundle LIZ = C01R.LIZ("device_should_use_shader_zoom", false);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.mCameraSettings.LJLILLLLZI);
            LIZ2.append("_");
            LIZ2.append(this.mCameraSettings.LJLJJI);
            queryFeatures(X1D.LIZIZ(LIZ2), LIZ);
            bundle.putBoolean("device_should_use_shader_zoom", LIZ.getBoolean("device_should_use_shader_zoom"));
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getCameraAllFeatures, type = ");
        LIZ3.append(i);
        LIZ3.append(", features = ");
        LIZ3.append(bundle);
        C63922P6w.LIZLLL("TECameraCapture", X1D.LIZIZ(LIZ3));
    }

    public static void queryDeviceFeatures(Context context, int i, Bundle bundle) {
        if (isCameraSupport(context, i) && fillDeviceFeatures(context, i, bundle)) {
            fillCameraFeatures(context, i, bundle);
        }
    }

    public int takePicture(int i, int i2, PZA pza) {
        return EnumC84152X0y.INSTANCE.takePicture(this, i, i2, pza);
    }

    public int focusAtPoint(int i, int i2, float f, int i3, int i4) {
        return focusAtPoint(new C84151X0x(i, i2, i3, i4, f));
    }
}
