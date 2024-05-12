package com.ss.android.vesdk;

import X.C16880lQ;
import X.C65429Pm5;
import X.C7MY;
import X.EnumC79157V4v;
import X.EnumC84137X0j;
import X.EnumC84138X0k;
import X.P4Q;
import X.V0N;
import X.VKA;
import X.X1D;
import Y.IDCreatorS54S0000000_11;
import Y.IDCreatorS56S0000000_14;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEConfigCenter;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VECameraSettings implements Parcelable {
    public int[] CameraHWLevelAndroid2TE;
    public int[] CameraHWLevelTE2Android;
    public boolean mBindSurfaceLifecycleToCamera;
    public int mCamera2RetryCnt;
    public boolean mCameraAntiShake;
    public CAMERA_FACING_ID mCameraFacing;
    public EnumC84137X0j mCameraFrameRateStrategy;
    public CAMERA_MODE_TYPE mCameraMode;
    public boolean mCameraPreviewIndependent;
    public HashMap<VKA, Cert> mCameraPrivacyCertMap;
    public CAMERA_TYPE mCameraType;
    public float mCameraZoomLimitFactor;
    public CAMERA_CAPTURE_FLASH_STRATEGY mCaptureFlashStrategy;
    public boolean mCaptureHdr;
    public VESize mCaptureSize;
    public CAMERA_TYPE mConfigCameraType;
    public CAMERA_TYPE mDefaultCameraTypeInNewCameraStrategy;
    public float mDefaultZoomRatio;
    public boolean mDefaultZoomUsingZoomV2;
    public boolean mEnableBackGroundStrategy;
    public boolean mEnableFallback;
    public boolean mEnableForceRestartWhenCameraError;
    public int mEnableGcForCameraMetadataThreshold;
    public boolean mEnableManualReleaseCaptureResult;
    public boolean mEnableMonitorRuntimeInfo;
    public boolean mEnableOpenCamera1Crs;
    public boolean mEnableOpenCamera1Opt;
    public boolean mEnablePreviewTemplate;
    public boolean mEnablePreviewingFallback;
    public boolean mEnableRecord60Fps;
    public boolean mEnableRecordStream;
    public boolean mEnableRefactorFocusAndMeter;
    public boolean mEnableSurfaceSharing;
    public boolean mEnableVBoost;
    public boolean mEnableWideFOV;
    public boolean mEnableYuvBufferCapture;
    public boolean mEnableZsl;
    public Bundle mExtParameters;
    public EnumC84138X0k mFaceAEStrategy;
    public int mFocusTimeoutMS;
    public int mFps;
    public int mFpsMaxLimit;
    public int[] mFpsRange;
    public CAMERA_HW_LEVEL mHwLevel;
    public boolean mIsCameraOpenCloseSync;
    public boolean mIsForceCloseCamera;
    public boolean mIsUseHint;
    public boolean mIsUseNewCameraTypeStrategy;
    public int mMaxWidth;
    public float mMaxWidthTakePictureSizeAccuracy;
    public boolean mOptCameraSceneFps;
    public byte mOptionFlags;
    public CAMERA_OUTPUT_MODE mOutputMode;
    public boolean mPreferOpenCameraByCameraId;
    public VESize mPreviewSize;
    public String mRecordStreamFolderPath;
    public int mRetryCnt;
    public int mRetryStartPreviewCnt;
    public long mRuntimeInfoMonitorPeriod;
    public String mSceneMode;
    public String mStrCameraHardwareID;
    public boolean mUseMaxWidthTakePicture;
    public boolean mUseSyncModeOnCamera2;
    public int mVBoostTimeoutMS;
    public boolean mVESetCameraTwoOutputMode;
    public boolean mbDontUseVendorCamera;
    public boolean mbDualCameraExpansionScheme;
    public static final String TAG = C16880lQ.LJLLJ(VECameraSettings.class);
    public static final String[] sCameraSceneMode = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};
    public static final Parcelable.Creator<VECameraSettings> CREATOR = new IDCreatorS56S0000000_14(23);

    /* loaded from: classes15.dex */
    public enum CAMERA_FACING_ID implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_TELEPHOTO,
        FACING_3RD,
        FACING_REAR_MAIN_REAR_WIDE,
        FACING_REAR_MAIN_REAR_TELE,
        FACING_REAR_MAIN_FRONT_MAIN;

        public static final Parcelable.Creator<CAMERA_FACING_ID> CREATOR = new IDCreatorS56S0000000_14(18);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean isBidirectional() {
            if (this == FACING_REAR_MAIN_FRONT_MAIN) {
                return true;
            }
            return false;
        }

        public static CAMERA_FACING_ID valueOf(String str) {
            return (CAMERA_FACING_ID) V0N.LJJJ(CAMERA_FACING_ID.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes15.dex */
    public static class Builder {
        public VECameraSettings mExportCameraSettings;

        public Builder overrideWithCloudConfig() {
            return this;
        }

        public Builder() {
            this.mExportCameraSettings = new VECameraSettings();
        }

        public VECameraSettings build() {
            return this.mExportCameraSettings;
        }

        public Builder(VECameraSettings vECameraSettings) {
            this.mExportCameraSettings = vECameraSettings;
        }

        public Builder bindSurfaceLifecycleToCamera(boolean z) {
            this.mExportCameraSettings.mBindSurfaceLifecycleToCamera = z;
            return this;
        }

        public Builder enableCameraPreviewIndependent(boolean z) {
            this.mExportCameraSettings.mCameraPreviewIndependent = z;
            return this;
        }

        public Builder enableForceRestartWhenCameraError(boolean z) {
            this.mExportCameraSettings.mEnableForceRestartWhenCameraError = z;
            return this;
        }

        public Builder enableFrontFacingVideoContinueFocus(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enableFrontFacingVideoContinueFocus", z);
            return this;
        }

        public Builder enablePreviewingFallback(boolean z) {
            this.mExportCameraSettings.mEnablePreviewingFallback = z;
            return this;
        }

        public Builder enableRecord60Fps(boolean z) {
            this.mExportCameraSettings.mEnableRecord60Fps = z;
            return this;
        }

        public Builder enableRecordStream(boolean z) {
            this.mExportCameraSettings.mEnableRecordStream = z;
            return this;
        }

        public Builder enableRefactorFocusAndMeter(boolean z) {
            this.mExportCameraSettings.mEnableRefactorFocusAndMeter = z;
            return this;
        }

        public Builder enableRetryOpenCamera(boolean z) {
            int i;
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            vECameraSettings.mRetryCnt = i;
            return this;
        }

        public Builder enableShutterSound(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enableShutterSound", z);
            return this;
        }

        public Builder enableSwitchFlashSleepToTakeEffect(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enableSwitchFlashSleepToTakeEffect", z);
            return this;
        }

        public Builder enableYuvBufferCapture(boolean z) {
            this.mExportCameraSettings.mEnableYuvBufferCapture = z;
            return this;
        }

        public Builder forceRunUpdateTexImg(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("forceRunUpdateTexImg", z);
            return this;
        }

        public Builder setCamera2RetryCnt(int i) {
            this.mExportCameraSettings.mCamera2RetryCnt = i;
            return this;
        }

        public Builder setCameraAiNightVideo(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_ai_night_video", z);
            return this;
        }

        public Builder setCameraAntiShake(boolean z) {
            this.mExportCameraSettings.mCameraAntiShake = z;
            return this;
        }

        public Builder setCameraFacing(CAMERA_FACING_ID camera_facing_id) {
            this.mExportCameraSettings.mStrCameraHardwareID = VEConfigCenter.getInstance().getValue("wide_camera_id", "-1");
            this.mExportCameraSettings.mCameraFacing = camera_facing_id;
            return this;
        }

        public Builder setCameraModeType(CAMERA_MODE_TYPE camera_mode_type) {
            this.mExportCameraSettings.mCameraMode = camera_mode_type;
            return this;
        }

        public Builder setCameraPrivacyCertMap(HashMap<VKA, Cert> hashMap) {
            this.mExportCameraSettings.mCameraPrivacyCertMap = hashMap;
            return this;
        }

        public Builder setCameraSuperAntiShake(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_super_Stabilization", z);
            return this;
        }

        public Builder setCameraType(CAMERA_TYPE camera_type) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mCameraType = camera_type;
            vECameraSettings.mIsUseNewCameraTypeStrategy = false;
            return this;
        }

        public Builder setCameraVideoAntiShake(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_video_stabilization", z);
            return this;
        }

        public Builder setCameraVideoHDR(boolean z) {
            this.mExportCameraSettings.mExtParameters.putBoolean("enable_video_hdr", z);
            return this;
        }

        public Builder setCameraZoomLimitFactor(float f) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.mExportCameraSettings.mCameraZoomLimitFactor = f;
            return this;
        }

        public Builder setCaptureFlashStrategy(CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy) {
            this.mExportCameraSettings.mCaptureFlashStrategy = camera_capture_flash_strategy;
            return this;
        }

        public Builder setDefaultCameraTypeInNewCameraTypeStrategy(CAMERA_TYPE camera_type) {
            this.mExportCameraSettings.mDefaultCameraTypeInNewCameraStrategy = camera_type;
            return this;
        }

        public Builder setDefaultZoomRatio(float f) {
            this.mExportCameraSettings.mDefaultZoomRatio = f;
            return this;
        }

        public Builder setDefaultZoomUsingZoomV2(boolean z) {
            this.mExportCameraSettings.mDefaultZoomUsingZoomV2 = z;
            return this;
        }

        public Builder setDontUseVendorCameraType(boolean z) {
            this.mExportCameraSettings.mbDontUseVendorCamera = z;
            return this;
        }

        public Builder setDualCameraExtensionScheme(boolean z) {
            this.mExportCameraSettings.mbDualCameraExpansionScheme = z;
            return this;
        }

        public Builder setEnableFallback(boolean z) {
            this.mExportCameraSettings.mEnableFallback = z;
            return this;
        }

        public Builder setEnableMonitorRuntimeInfo(boolean z) {
            this.mExportCameraSettings.mEnableMonitorRuntimeInfo = z;
            return this;
        }

        public Builder setEnableSurfaceSharing(boolean z) {
            this.mExportCameraSettings.mEnableSurfaceSharing = z;
            return this;
        }

        public Builder setEnableZsl(boolean z) {
            this.mExportCameraSettings.mEnableZsl = z;
            return this;
        }

        public Builder setExtParameters(Bundle bundle) {
            this.mExportCameraSettings.mExtParameters = bundle;
            return this;
        }

        public Builder setFps(int i) {
            this.mExportCameraSettings.mFps = i;
            return this;
        }

        public Builder setFpsMaxLimit(int i) {
            if (i < 30) {
                i = 30;
            }
            this.mExportCameraSettings.mFpsMaxLimit = i;
            return this;
        }

        public Builder setFpsRange(int[] iArr) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mFpsRange = iArr;
            vECameraSettings.mCameraFrameRateStrategy = EnumC84137X0j.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            return this;
        }

        public Builder setHwLevel(CAMERA_HW_LEVEL camera_hw_level) {
            this.mExportCameraSettings.mHwLevel = camera_hw_level;
            return this;
        }

        public Builder setIsUseNewCameraTypeStrategy(boolean z) {
            this.mExportCameraSettings.mIsUseNewCameraTypeStrategy = z;
            return this;
        }

        public Builder setMaxWidth(int i) {
            this.mExportCameraSettings.mMaxWidth = i;
            return this;
        }

        public Builder setMaxWidthTakePictureSizeAccuracy(float f) {
            this.mExportCameraSettings.mMaxWidthTakePictureSizeAccuracy = f;
            return this;
        }

        public Builder setMonitorRuntimeInfoPeriod(long j) {
            this.mExportCameraSettings.mRuntimeInfoMonitorPeriod = j;
            return this;
        }

        public Builder setOptionFlag(byte b) {
            this.mExportCameraSettings.mOptionFlags = b;
            return this;
        }

        public Builder setOutPutMode(CAMERA_OUTPUT_MODE camera_output_mode) {
            this.mExportCameraSettings.mOutputMode = camera_output_mode;
            if (C65429Pm5.LJFF("ve_enable_titan_nv21_buffer_render_chain", false)) {
                this.mExportCameraSettings.mOutputMode = CAMERA_OUTPUT_MODE.FRAME;
            }
            return this;
        }

        public Builder setPreferOpenCameraByCameraId(boolean z) {
            this.mExportCameraSettings.mPreferOpenCameraByCameraId = z;
            return this;
        }

        public Builder setRecordStreamFolderPath(String str) {
            this.mExportCameraSettings.mRecordStreamFolderPath = str;
            return this;
        }

        public Builder setRetryCnt(int i) {
            this.mExportCameraSettings.mRetryCnt = i;
            return this;
        }

        public Builder setRetryStartPreviewCnt(int i) {
            this.mExportCameraSettings.mRetryStartPreviewCnt = i;
            return this;
        }

        public Builder setSceneMode(String str) {
            this.mExportCameraSettings.mSceneMode = str;
            return this;
        }

        public Builder setUseMaxWidthTakePicture(boolean z) {
            this.mExportCameraSettings.mUseMaxWidthTakePicture = z;
            return this;
        }

        public Builder setUseSyncModeOnCamera2(boolean z) {
            this.mExportCameraSettings.mUseSyncModeOnCamera2 = z;
            return this;
        }

        public Builder setCameraFacing(CAMERA_FACING_ID camera_facing_id, String str) {
            VECameraSettings vECameraSettings = this.mExportCameraSettings;
            vECameraSettings.mCameraFacing = camera_facing_id;
            vECameraSettings.mStrCameraHardwareID = str;
            return this;
        }

        public Builder setCaptureSize(int i, int i2) {
            this.mExportCameraSettings.mCaptureSize = new VESize(i, i2);
            return this;
        }

        public Builder setPreviewSize(int i, int i2) {
            this.mExportCameraSettings.mPreviewSize = new VESize(i, i2);
            return this;
        }
    }

    public static EnumC79157V4v getCameraOutputAndUpdateStrategy() {
        EnumC79157V4v enumC79157V4v = EnumC79157V4v.STRATEGY_DEFAULT;
        int value = VEConfigCenter.getInstance().getValue("ve_camera_output_and_update_strategy", 0);
        if (value == 1) {
            enumC79157V4v = EnumC79157V4v.STRATEGY_ONETHREAD_ONEOUT;
        } else if (value == 2) {
            enumC79157V4v = EnumC79157V4v.STRATEGY_ONETHREAD_TWOOUT;
        } else if (value == 3) {
            enumC79157V4v = EnumC79157V4v.STRATEGY_TWOTHREAD_ONEOUT;
        } else if (value == 4) {
            enumC79157V4v = EnumC79157V4v.STRATEGY_TWOTHREAD_TWOOUT;
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ve_camera_output_and_update_strategy: ");
        LIZ.append(value);
        LIZ.append(", enum:");
        LIZ.append(enumC79157V4v);
        P4Q.LJFF(str, X1D.LIZIZ(LIZ));
        return enumC79157V4v;
    }

    public EnumC84137X0j getCameraFrameRateStrategy() {
        EnumC84137X0j enumC84137X0j = this.mCameraFrameRateStrategy;
        EnumC84137X0j enumC84137X0j2 = EnumC84137X0j.DYNAMIC_FRAMERATE;
        if (enumC84137X0j == enumC84137X0j2) {
            Integer valueOf = Integer.valueOf(VEConfigCenter.getInstance().getValue("frame_rate_strategy", 0));
            if (valueOf.intValue() == 1) {
                this.mCameraFrameRateStrategy = EnumC84137X0j.FIXED_FRAMERATE_FOR_ALL;
            } else if (valueOf.intValue() == 2) {
                this.mCameraFrameRateStrategy = EnumC84137X0j.FIXED_FRAMERATE_FOR_REAR;
            } else if (valueOf.intValue() == 3) {
                this.mCameraFrameRateStrategy = EnumC84137X0j.DYNAMIC_FRAMERATE_WITHOUT_SELECT;
            } else {
                this.mCameraFrameRateStrategy = enumC84137X0j2;
            }
        }
        return this.mCameraFrameRateStrategy;
    }

    public CAMERA_TYPE getCameraType() {
        if (!this.mIsUseNewCameraTypeStrategy) {
            return this.mCameraType;
        }
        if (this.mConfigCameraType == CAMERA_TYPE.NULL) {
            this.mConfigCameraType = getCameraTypeFromConfigCenter(this.mDefaultCameraTypeInNewCameraStrategy, this.mbDontUseVendorCamera);
        }
        return this.mConfigCameraType;
    }

    public boolean getDualCameraExtensionScheme() {
        if (!this.mbDualCameraExpansionScheme) {
            this.mbDualCameraExpansionScheme = C65429Pm5.LJFF("ve_dual_camera_expansion_scheme", false);
        }
        return this.mbDualCameraExpansionScheme;
    }

    public int getFpsMaxLimit() {
        VEConfigCenter.ValuePkt value;
        if (this.mFpsMaxLimit == 30 && (value = VEConfigCenter.getInstance().getValue("ve_camera_fps_max")) != null && (value.getValue() instanceof Integer)) {
            this.mFpsMaxLimit = ((Integer) value.getValue()).intValue();
        }
        return this.mFpsMaxLimit;
    }

    public int[] getFpsRange() {
        int value;
        if (this.mCameraFrameRateStrategy != EnumC84137X0j.DYNAMIC_FRAMERATE_WITHOUT_SELECT && this.mFpsRange[0] == 7 && (value = VEConfigCenter.getInstance().getValue("ve_camera_fps_range", 7)) != 0) {
            this.mFpsRange[0] = value;
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Camera FpsRange:[");
        LIZ.append(this.mFpsRange[0]);
        LIZ.append(", ");
        LIZ.append(this.mFpsRange[1]);
        LIZ.append("]");
        P4Q.LJFF(str, X1D.LIZIZ(LIZ));
        return this.mFpsRange;
    }

    public boolean isEnableCameraFpsDoubleCheckInImageMode() {
        return C65429Pm5.LJFF("ve_enable_camera_fps_double_check_in_image_mode", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (X.C65429Pm5.LJFF("ve_enable_refactor_camera_focus", false) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isEnableRefactorFocusAndMeter() {
        /*
            r2 = this;
            boolean r0 = r2.mEnableRefactorFocusAndMeter
            if (r0 != 0) goto Ld
            java.lang.String r0 = "ve_enable_refactor_camera_focus"
            r1 = 0
            boolean r0 = X.C65429Pm5.LJFF(r0, r1)
            if (r0 == 0) goto Le
        Ld:
            r1 = 1
        Le:
            r2.mEnableRefactorFocusAndMeter = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VECameraSettings.isEnableRefactorFocusAndMeter():boolean");
    }

    public boolean isEnableYuvBufferCapture() {
        VEConfigCenter.ValuePkt value;
        if (!this.mEnableYuvBufferCapture && (value = VEConfigCenter.getInstance().getValue("ve_enable_yuv_buffer_capture")) != null && value.getValue() != null && (value.getValue() instanceof Boolean) && ((Boolean) value.getValue()).booleanValue()) {
            this.mEnableYuvBufferCapture = true;
        }
        return this.mEnableYuvBufferCapture;
    }

    public boolean isOptCameraSceneFps() {
        if (!this.mOptCameraSceneFps && !C65429Pm5.LJFF("ve_camera_scene_diff_fps_opt", false)) {
            return false;
        }
        return true;
    }

    public VECameraSettings() {
        this.CameraHWLevelTE2Android = new int[]{2, 0, 1, 3};
        this.CameraHWLevelAndroid2TE = new int[]{1, 2, 0, 3};
        this.mFps = 30;
        this.mPreviewSize = new VESize(720, 1280);
        this.mFpsRange = new int[]{7, 30};
        this.mHwLevel = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        CAMERA_TYPE camera_type = CAMERA_TYPE.TYPE1;
        this.mCameraType = camera_type;
        this.mConfigCameraType = CAMERA_TYPE.NULL;
        this.mIsUseNewCameraTypeStrategy = false;
        this.mDefaultCameraTypeInNewCameraStrategy = CAMERA_TYPE.TYPE2;
        this.mbDontUseVendorCamera = false;
        CAMERA_FACING_ID camera_facing_id = CAMERA_FACING_ID.FACING_FRONT;
        this.mCameraFacing = camera_facing_id;
        this.mStrCameraHardwareID = "-1";
        this.mSceneMode = "auto";
        this.mCameraAntiShake = false;
        this.mbDualCameraExpansionScheme = false;
        this.mCameraFrameRateStrategy = EnumC84137X0j.DYNAMIC_FRAMERATE;
        this.mFaceAEStrategy = EnumC84138X0k.DISABLE_FACEAE;
        this.mEnableWideFOV = false;
        this.mIsUseHint = false;
        this.mEnableSurfaceSharing = false;
        this.mIsCameraOpenCloseSync = true;
        this.mIsForceCloseCamera = false;
        this.mEnableVBoost = false;
        this.mVBoostTimeoutMS = 50;
        this.mFocusTimeoutMS = 2500;
        this.mEnableGcForCameraMetadataThreshold = 0;
        this.mFpsMaxLimit = 30;
        this.mOptCameraSceneFps = false;
        this.mEnableYuvBufferCapture = false;
        this.mUseMaxWidthTakePicture = false;
        this.mMaxWidthTakePictureSizeAccuracy = 0.0f;
        this.mMaxWidth = 0;
        this.mEnablePreviewTemplate = false;
        this.mOptionFlags = (byte) 1;
        this.mCaptureSize = new VESize(-1, -1);
        this.mOutputMode = CAMERA_OUTPUT_MODE.SURFACE;
        this.mEnableFallback = true;
        this.mCameraMode = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.mUseSyncModeOnCamera2 = false;
        this.mCameraZoomLimitFactor = -1.0f;
        this.mEnableZsl = false;
        this.mEnableManualReleaseCaptureResult = true;
        this.mRetryCnt = 0;
        this.mRetryStartPreviewCnt = 0;
        this.mEnableRecordStream = false;
        this.mEnableRecord60Fps = false;
        this.mRecordStreamFolderPath = "";
        this.mCamera2RetryCnt = 1;
        this.mCaptureFlashStrategy = CAMERA_CAPTURE_FLASH_STRATEGY.FlashOnSimulatedStrategy;
        this.mCameraPreviewIndependent = false;
        this.mPreferOpenCameraByCameraId = false;
        this.mEnablePreviewingFallback = false;
        this.mEnableBackGroundStrategy = false;
        this.mEnableOpenCamera1Opt = false;
        this.mEnableOpenCamera1Crs = false;
        this.mEnableRefactorFocusAndMeter = false;
        this.mEnableForceRestartWhenCameraError = false;
        this.mBindSurfaceLifecycleToCamera = false;
        this.mEnableMonitorRuntimeInfo = false;
        this.mRuntimeInfoMonitorPeriod = 5000L;
        this.mCameraPrivacyCertMap = null;
        this.mVESetCameraTwoOutputMode = false;
        this.mDefaultZoomRatio = 1.0f;
        this.mDefaultZoomUsingZoomV2 = true;
        this.mCameraType = camera_type;
        this.mCameraFacing = camera_facing_id;
        this.mFps = 30;
        VESize vESize = this.mPreviewSize;
        vESize.width = 720;
        vESize.height = 1280;
        this.mExtParameters = new Bundle();
    }

    public boolean getCameraCaptureHdrFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_camera_capture_hdr");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            return ((Boolean) value.getValue()).booleanValue();
        }
        return false;
    }

    public int getCameraCaptureMFNRFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("key_camera_capture_mfnr");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Integer)) {
            return ((Integer) value.getValue()).intValue();
        }
        return 0;
    }

    public EnumC84138X0k getCameraFaceDetect() {
        int value = VEConfigCenter.getInstance().getValue("ve_enable_face_detection", 0);
        if (value == 1) {
            this.mFaceAEStrategy = EnumC84138X0k.ENABLE_FACEAE_FOR_FRONT;
        } else if (value == 2) {
            this.mFaceAEStrategy = EnumC84138X0k.ENABLE_FACEAE_FOR_REAR;
        } else if (value == 3) {
            this.mFaceAEStrategy = EnumC84138X0k.ENABLE_FACEAE_FOR_ALL;
        }
        this.mExtParameters.putInt("useCameraFaceDetect", this.mFaceAEStrategy.ordinal());
        String str = TAG;
        StringBuilder LJ = C7MY.LJ("faceae strategy: ", value, ", enum:");
        LJ.append(this.mFaceAEStrategy);
        P4Q.LJFF(str, X1D.LIZIZ(LJ));
        return this.mFaceAEStrategy;
    }

    public boolean getCameraHdrDisableFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_disable_camera_hdr");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            return ((Boolean) value.getValue()).booleanValue();
        }
        return false;
    }

    public boolean getCameraNoiseReduceFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_camera_noise_reduce");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            return ((Boolean) value.getValue()).booleanValue();
        }
        return false;
    }

    public boolean getCameraRDHWRecordDisableFromCenter() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_camera_disable_rdhw_record");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            return ((Boolean) value.getValue()).booleanValue();
        }
        return false;
    }

    public boolean getCameraVideoModeTemplate() {
        boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_enable_camera_preview_template", this.mEnablePreviewTemplate).booleanValue();
        this.mEnablePreviewTemplate = booleanValue;
        this.mExtParameters.putBoolean("enablePreviewTemplate", booleanValue);
        return this.mEnablePreviewTemplate;
    }

    public int getEnableGcForCameraMetadataThreshold() {
        int value = VEConfigCenter.getInstance().getValue("ve_enable_gc_for_camera_metadata", 0);
        this.mEnableGcForCameraMetadataThreshold = value;
        return value;
    }

    public boolean getEnableSurfaceSharing() {
        boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_camera_enable_surface_sharing", this.mEnableSurfaceSharing).booleanValue();
        this.mEnableSurfaceSharing = booleanValue;
        return booleanValue;
    }

    public boolean getEnableVBoost() {
        boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_enable_vboost", this.mEnableVBoost).booleanValue();
        this.mEnableVBoost = booleanValue;
        return booleanValue;
    }

    public int getFocusTimeout() {
        int value = VEConfigCenter.getInstance().getValue("ve_camera_focus_timeout", 2500);
        this.mFocusTimeoutMS = value;
        return value;
    }

    public boolean getIsCameraOpenCloseSync() {
        boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_camera_open_close_sync", this.mIsCameraOpenCloseSync).booleanValue();
        this.mIsCameraOpenCloseSync = booleanValue;
        return booleanValue;
    }

    public boolean getIsForceCloseCamera() {
        boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_force_close_camera_when_timeout", this.mIsForceCloseCamera).booleanValue();
        this.mIsForceCloseCamera = booleanValue;
        return booleanValue;
    }

    public boolean getIsUseHint() {
        boolean booleanValue = VEConfigCenter.getInstance().getValue("is_use_setrecordinghint", this.mIsUseHint).booleanValue();
        this.mIsUseHint = booleanValue;
        return booleanValue;
    }

    public boolean getMetadataConfig() {
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_camera_metadata");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            return ((Boolean) value.getValue()).booleanValue();
        }
        return false;
    }

    public int getRetryCnt() {
        int value = VEConfigCenter.getInstance().getValue("ve_retry_count", 0);
        if (value != 0) {
            this.mRetryCnt = value;
        }
        return this.mRetryCnt;
    }

    public int getVBoostTimeout() {
        int value = VEConfigCenter.getInstance().getValue("ve_vboost_timeout", LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        this.mVBoostTimeoutMS = value;
        return value;
    }

    public boolean getWideFOV() {
        this.mEnableWideFOV = VEConfigCenter.getInstance().getValue("ve_enable_wide_fov_for_samsung", this.mEnableWideFOV).booleanValue();
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getWideFOV: ");
        LIZ.append(this.mEnableWideFOV);
        P4Q.LIZ(str, X1D.LIZIZ(LIZ));
        return this.mEnableWideFOV;
    }

    public int getmRetryStartPreviewCnt() {
        int value = VEConfigCenter.getInstance().getValue("ve_retry_start_preview_count", 0);
        if (value != 0) {
            this.mRetryStartPreviewCnt = value;
        }
        return this.mRetryStartPreviewCnt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (X.C65429Pm5.LJFF("ve_set_camera_two_output", false) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isVESetCameraTwoOutputMode() {
        /*
            r2 = this;
            X.V4v r1 = getCameraOutputAndUpdateStrategy()
            X.V4v r0 = X.EnumC79157V4v.STRATEGY_ONETHREAD_TWOOUT
            if (r1 == r0) goto L15
            X.V4v r0 = X.EnumC79157V4v.STRATEGY_TWOTHREAD_TWOOUT
            if (r1 == r0) goto L15
            java.lang.String r0 = "ve_set_camera_two_output"
            r1 = 0
            boolean r0 = X.C65429Pm5.LJFF(r0, r1)
            if (r0 == 0) goto L16
        L15:
            r1 = 1
        L16:
            r2.mVESetCameraTwoOutputMode = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VECameraSettings.isVESetCameraTwoOutputMode():boolean");
    }

    public CAMERA_MODE_TYPE getCamera2OutputMode() {
        return this.mCameraMode;
    }

    public int getCamera2RetryCnt() {
        return this.mCamera2RetryCnt;
    }

    public boolean getCameraAntiShake() {
        return this.mCameraAntiShake;
    }

    public CAMERA_FACING_ID getCameraFacing() {
        return this.mCameraFacing;
    }

    public String getCameraHardwareID() {
        return this.mStrCameraHardwareID;
    }

    public HashMap<VKA, Cert> getCameraPrivacyCertMap() {
        return this.mCameraPrivacyCertMap;
    }

    public float getCameraZoomLimitFactor() {
        return this.mCameraZoomLimitFactor;
    }

    public CAMERA_CAPTURE_FLASH_STRATEGY getCaptureFlashStrategy() {
        return this.mCaptureFlashStrategy;
    }

    public VESize getCaptureSize() {
        return this.mCaptureSize;
    }

    public float getDefaultZoomRatio() {
        return this.mDefaultZoomRatio;
    }

    public boolean getDefaultZoomUsingZoomV2() {
        return this.mDefaultZoomUsingZoomV2;
    }

    public boolean getDontUseVendorCamera() {
        return this.mbDontUseVendorCamera;
    }

    public boolean getEnableFallback() {
        return this.mEnableFallback;
    }

    public boolean getEnableManualReleaseCaptureResult() {
        return this.mEnableManualReleaseCaptureResult;
    }

    public boolean getEnableRecord60Fps() {
        return this.mEnableRecord60Fps;
    }

    public boolean getEnableRecordStream() {
        return this.mEnableRecordStream;
    }

    public boolean getEnableZsl() {
        return this.mEnableZsl;
    }

    public Bundle getExtParameters() {
        return this.mExtParameters;
    }

    public int getFps() {
        return this.mFps;
    }

    public CAMERA_HW_LEVEL getHwLevel() {
        return this.mHwLevel;
    }

    public boolean getIsUseNewCameraTypeStrategy() {
        return this.mIsUseNewCameraTypeStrategy;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public float getMaxWidthTakePictureSizeAccuracy() {
        return this.mMaxWidthTakePictureSizeAccuracy;
    }

    public long getMonitorRuntimeInfoPeriod() {
        return this.mRuntimeInfoMonitorPeriod;
    }

    public byte getOptionFlag() {
        return this.mOptionFlags;
    }

    public CAMERA_OUTPUT_MODE getOutputMode() {
        return this.mOutputMode;
    }

    public VESize getPreviewSize() {
        return this.mPreviewSize;
    }

    public String getRecordStreamFolderPath() {
        return this.mRecordStreamFolderPath;
    }

    public String getSceneMode() {
        return this.mSceneMode;
    }

    public boolean isBindSurfaceLifecycleToCamera() {
        return this.mBindSurfaceLifecycleToCamera;
    }

    public boolean isCameraPreviewIndependent() {
        return this.mCameraPreviewIndependent;
    }

    public boolean isEnableBackGroundStrategy() {
        return this.mEnableBackGroundStrategy;
    }

    public boolean isEnableForceRestartWhenCameraError() {
        return this.mEnableForceRestartWhenCameraError;
    }

    public boolean isEnableMonitorRuntimeInfo() {
        return this.mEnableMonitorRuntimeInfo;
    }

    public boolean isEnableOpenCamera1Crs() {
        return this.mEnableOpenCamera1Crs;
    }

    public boolean isEnableOpenCamera1Opt() {
        return this.mEnableOpenCamera1Opt;
    }

    public boolean isEnablePreviewingFallback() {
        return this.mEnablePreviewingFallback;
    }

    public boolean isPreferOpenCameraByCameraId() {
        return this.mPreferOpenCameraByCameraId;
    }

    public boolean isSyncModeOnCamera2() {
        return this.mUseSyncModeOnCamera2;
    }

    public boolean isUseMaxWidthTakePicture() {
        return this.mUseMaxWidthTakePicture;
    }

    /* loaded from: classes15.dex */
    public enum CAMERA_CAPTURE_FLASH_STRATEGY implements Parcelable {
        PreAndMainStrategy,
        TorchFakeStrategy,
        FlashOnRealStrategy,
        FlashOnSimulatedStrategy;

        public static final Parcelable.Creator<CAMERA_CAPTURE_FLASH_STRATEGY> CREATOR = new IDCreatorS56S0000000_14(17);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_CAPTURE_FLASH_STRATEGY valueOf(String str) {
            return (CAMERA_CAPTURE_FLASH_STRATEGY) V0N.LJJJ(CAMERA_CAPTURE_FLASH_STRATEGY.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes15.dex */
    public enum CAMERA_FLASH_MODE implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;

        public static final Parcelable.Creator<CAMERA_FLASH_MODE> CREATOR = new IDCreatorS56S0000000_14(19);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_FLASH_MODE valueOf(String str) {
            return (CAMERA_FLASH_MODE) V0N.LJJJ(CAMERA_FLASH_MODE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes15.dex */
    public enum CAMERA_HW_LEVEL implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;

        public static final Parcelable.Creator<CAMERA_HW_LEVEL> CREATOR = new IDCreatorS56S0000000_14(20);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_HW_LEVEL valueOf(String str) {
            return (CAMERA_HW_LEVEL) V0N.LJJJ(CAMERA_HW_LEVEL.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes15.dex */
    public enum CAMERA_MODE_TYPE implements Parcelable {
        VIDEO_MODE,
        IMAGE_MODE,
        AR_MODE;

        public static final Parcelable.Creator<CAMERA_MODE_TYPE> CREATOR = new IDCreatorS56S0000000_14(21);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_MODE_TYPE valueOf(String str) {
            return (CAMERA_MODE_TYPE) V0N.LJJJ(CAMERA_MODE_TYPE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes12.dex */
    public enum CAMERA_OUTPUT_MODE implements Parcelable {
        SURFACE,
        FRAME,
        SURFACE_FRAME,
        TWO_SURFACES;

        public static final Parcelable.Creator<CAMERA_OUTPUT_MODE> CREATOR = new IDCreatorS54S0000000_11(64);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_OUTPUT_MODE valueOf(String str) {
            return (CAMERA_OUTPUT_MODE) V0N.LJJJ(CAMERA_OUTPUT_MODE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    /* loaded from: classes15.dex */
    public enum CAMERA_TYPE implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_OGXM,
        TYPE_GNOB_MEDIA,
        TYPE_CamKit,
        TYPE_BEWO,
        TYPE_GNOB_Unit,
        TYPE_OGXM_V2,
        TYPE_GNOB,
        TYPE_VENDOR_RDHW,
        TYPE_VENDOR_GNOB;

        public static final Parcelable.Creator<CAMERA_TYPE> CREATOR = new IDCreatorS56S0000000_14(22);

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public static CAMERA_TYPE valueOf(String str) {
            return (CAMERA_TYPE) V0N.LJJJ(CAMERA_TYPE.class, str);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public VECameraSettings(Parcel parcel) {
        CAMERA_HW_LEVEL camera_hw_level;
        CAMERA_TYPE camera_type;
        CAMERA_TYPE camera_type2;
        boolean z;
        boolean z2;
        CAMERA_FACING_ID camera_facing_id;
        boolean z3;
        EnumC84137X0j enumC84137X0j;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        CAMERA_OUTPUT_MODE camera_output_mode;
        boolean z11;
        CAMERA_MODE_TYPE camera_mode_type;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        this.CameraHWLevelTE2Android = new int[]{2, 0, 1, 3};
        this.CameraHWLevelAndroid2TE = new int[]{1, 2, 0, 3};
        this.mFps = 30;
        this.mPreviewSize = new VESize(720, 1280);
        this.mFpsRange = new int[]{7, 30};
        this.mHwLevel = CAMERA_HW_LEVEL.CAMERA_HW_LEVEL_LEGACY;
        this.mCameraType = CAMERA_TYPE.TYPE1;
        this.mConfigCameraType = CAMERA_TYPE.NULL;
        this.mIsUseNewCameraTypeStrategy = false;
        this.mDefaultCameraTypeInNewCameraStrategy = CAMERA_TYPE.TYPE2;
        this.mbDontUseVendorCamera = false;
        this.mCameraFacing = CAMERA_FACING_ID.FACING_FRONT;
        this.mStrCameraHardwareID = "-1";
        this.mSceneMode = "auto";
        this.mCameraAntiShake = false;
        this.mbDualCameraExpansionScheme = false;
        this.mCameraFrameRateStrategy = EnumC84137X0j.DYNAMIC_FRAMERATE;
        this.mFaceAEStrategy = EnumC84138X0k.DISABLE_FACEAE;
        this.mEnableWideFOV = false;
        this.mIsUseHint = false;
        this.mEnableSurfaceSharing = false;
        this.mIsCameraOpenCloseSync = true;
        this.mIsForceCloseCamera = false;
        this.mEnableVBoost = false;
        this.mVBoostTimeoutMS = 50;
        this.mFocusTimeoutMS = 2500;
        this.mEnableGcForCameraMetadataThreshold = 0;
        this.mFpsMaxLimit = 30;
        this.mOptCameraSceneFps = false;
        this.mEnableYuvBufferCapture = false;
        this.mUseMaxWidthTakePicture = false;
        this.mMaxWidthTakePictureSizeAccuracy = 0.0f;
        this.mMaxWidth = 0;
        this.mEnablePreviewTemplate = false;
        this.mOptionFlags = (byte) 1;
        this.mCaptureSize = new VESize(-1, -1);
        this.mOutputMode = CAMERA_OUTPUT_MODE.SURFACE;
        this.mEnableFallback = true;
        this.mCameraMode = CAMERA_MODE_TYPE.VIDEO_MODE;
        this.mUseSyncModeOnCamera2 = false;
        this.mCameraZoomLimitFactor = -1.0f;
        this.mEnableZsl = false;
        this.mEnableManualReleaseCaptureResult = true;
        this.mRetryCnt = 0;
        this.mRetryStartPreviewCnt = 0;
        this.mEnableRecordStream = false;
        this.mEnableRecord60Fps = false;
        this.mRecordStreamFolderPath = "";
        this.mCamera2RetryCnt = 1;
        this.mCaptureFlashStrategy = CAMERA_CAPTURE_FLASH_STRATEGY.FlashOnSimulatedStrategy;
        this.mCameraPreviewIndependent = false;
        this.mPreferOpenCameraByCameraId = false;
        this.mEnablePreviewingFallback = false;
        this.mEnableBackGroundStrategy = false;
        this.mEnableOpenCamera1Opt = false;
        this.mEnableOpenCamera1Crs = false;
        this.mEnableRefactorFocusAndMeter = false;
        this.mEnableForceRestartWhenCameraError = false;
        this.mBindSurfaceLifecycleToCamera = false;
        this.mEnableMonitorRuntimeInfo = false;
        this.mRuntimeInfoMonitorPeriod = 5000L;
        this.mCameraPrivacyCertMap = null;
        this.mVESetCameraTwoOutputMode = false;
        this.mDefaultZoomRatio = 1.0f;
        this.mDefaultZoomUsingZoomV2 = true;
        this.CameraHWLevelTE2Android = parcel.createIntArray();
        this.CameraHWLevelAndroid2TE = parcel.createIntArray();
        this.mFps = parcel.readInt();
        this.mPreviewSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.mFpsRange = parcel.createIntArray();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            camera_hw_level = null;
        } else {
            camera_hw_level = CAMERA_HW_LEVEL.values()[readInt];
        }
        this.mHwLevel = camera_hw_level;
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            camera_type = null;
        } else {
            camera_type = CAMERA_TYPE.values()[readInt2];
        }
        this.mCameraType = camera_type;
        int readInt3 = parcel.readInt();
        if (readInt3 == -1) {
            camera_type2 = null;
        } else {
            camera_type2 = CAMERA_TYPE.values()[readInt3];
        }
        this.mConfigCameraType = camera_type2;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsUseNewCameraTypeStrategy = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mbDontUseVendorCamera = z2;
        int readInt4 = parcel.readInt();
        if (readInt4 == -1) {
            camera_facing_id = null;
        } else {
            camera_facing_id = CAMERA_FACING_ID.values()[readInt4];
        }
        this.mCameraFacing = camera_facing_id;
        this.mStrCameraHardwareID = parcel.readString();
        this.mSceneMode = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mCameraAntiShake = z3;
        int readInt5 = parcel.readInt();
        if (readInt5 == -1) {
            enumC84137X0j = null;
        } else {
            enumC84137X0j = EnumC84137X0j.values()[readInt5];
        }
        this.mCameraFrameRateStrategy = enumC84137X0j;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mEnableWideFOV = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.mIsUseHint = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mEnableSurfaceSharing = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.mIsCameraOpenCloseSync = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsForceCloseCamera = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mEnableVBoost = z9;
        this.mVBoostTimeoutMS = parcel.readInt();
        this.mFocusTimeoutMS = parcel.readInt();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mUseMaxWidthTakePicture = z10;
        this.mMaxWidth = parcel.readInt();
        this.mOptionFlags = parcel.readByte();
        this.mCaptureSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        int readInt6 = parcel.readInt();
        if (readInt6 == -1) {
            camera_output_mode = null;
        } else {
            camera_output_mode = CAMERA_OUTPUT_MODE.values()[readInt6];
        }
        this.mOutputMode = camera_output_mode;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.mEnableFallback = z11;
        int readInt7 = parcel.readInt();
        if (readInt7 == -1) {
            camera_mode_type = null;
        } else {
            camera_mode_type = CAMERA_MODE_TYPE.values()[readInt7];
        }
        this.mCameraMode = camera_mode_type;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.mUseSyncModeOnCamera2 = z12;
        this.mCameraZoomLimitFactor = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.mEnableZsl = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.mEnableManualReleaseCaptureResult = z14;
        this.mRetryCnt = parcel.readInt();
        this.mRetryStartPreviewCnt = parcel.readInt();
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.mEnableRecordStream = z15;
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.mEnableRecord60Fps = z16;
        this.mRecordStreamFolderPath = parcel.readString();
        this.mCamera2RetryCnt = parcel.readInt();
        this.mExtParameters = parcel.readBundle();
        int readInt8 = parcel.readInt();
        this.mCaptureFlashStrategy = readInt8 != -1 ? CAMERA_CAPTURE_FLASH_STRATEGY.values()[readInt8] : null;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.mCameraPreviewIndependent = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.mEnablePreviewingFallback = z18;
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.mEnableRefactorFocusAndMeter = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.mPreferOpenCameraByCameraId = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.mEnableForceRestartWhenCameraError = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.mBindSurfaceLifecycleToCamera = z22;
        this.mEnableYuvBufferCapture = parcel.readByte() != 0;
        this.mMaxWidthTakePictureSizeAccuracy = parcel.readFloat();
        this.mDefaultZoomRatio = parcel.readFloat();
        this.mDefaultZoomUsingZoomV2 = parcel.readBoolean();
    }

    public static CAMERA_TYPE cameraTypeConverter(int i) {
        if (i != 2) {
            switch (i) {
                case 6:
                    return CAMERA_TYPE.TYPE_GNOB;
                case 7:
                    return CAMERA_TYPE.TYPE_VENDOR_RDHW;
                case 8:
                    return CAMERA_TYPE.TYPE_VENDOR_GNOB;
                case 9:
                    return CAMERA_TYPE.TYPE_OGXM_V2;
                default:
                    return CAMERA_TYPE.TYPE2;
            }
        }
        return CAMERA_TYPE.TYPE_GNOB_MEDIA;
    }

    public void enableManualReleaseCaptureResult(boolean z) {
        this.mEnableManualReleaseCaptureResult = z;
    }

    public void setCameraAntiShake(boolean z) {
        this.mCameraAntiShake = z;
    }

    public void setCameraFacing(CAMERA_FACING_ID camera_facing_id) {
        this.mCameraFacing = camera_facing_id;
    }

    public void setCameraType(CAMERA_TYPE camera_type) {
        this.mCameraType = camera_type;
    }

    public void setConfigCameraType(CAMERA_TYPE camera_type) {
        this.mConfigCameraType = camera_type;
    }

    public void setEnableFallback(boolean z) {
        this.mEnableFallback = z;
    }

    public void setEnableRecord60Fps(boolean z) {
        this.mEnableRecord60Fps = z;
    }

    public void setEnableRecordStream(boolean z) {
        this.mEnableRecordStream = z;
    }

    public void setEnableZsl(boolean z) {
        this.mEnableZsl = z;
    }

    public void setFps(int i) {
        this.mFps = i;
    }

    public void setFpsRange(int[] iArr) {
        this.mFpsRange = iArr;
    }

    public void setHwLevel(CAMERA_HW_LEVEL camera_hw_level) {
        this.mHwLevel = camera_hw_level;
    }

    public void setOptionFlag(byte b) {
        this.mOptionFlags = b;
    }

    public void setOutPutMode(CAMERA_OUTPUT_MODE camera_output_mode) {
        this.mOutputMode = camera_output_mode;
    }

    public void setRecordStreamFolderPath(String str) {
        this.mRecordStreamFolderPath = str;
    }

    public void setSceneMode(String str) {
        this.mSceneMode = str;
    }

    public /* synthetic */ VECameraSettings(IDCreatorS56S0000000_14 iDCreatorS56S0000000_14) {
        this();
    }

    public static CAMERA_TYPE getCameraTypeFromConfigCenter(CAMERA_TYPE camera_type, boolean z) {
        int i;
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_camera_type");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Integer)) {
            i = ((Integer) value.getValue()).intValue();
            if (i == 0 || z) {
                VEConfigCenter.ValuePkt value2 = VEConfigCenter.getInstance().getValue("ve_is_in_camera2_blocklist");
                if (value2 != null && value2.getValue() != null && (value2.getValue() instanceof Boolean)) {
                    if (((Boolean) value2.getValue()).booleanValue()) {
                        camera_type = CAMERA_TYPE.TYPE1;
                    } else {
                        camera_type = CAMERA_TYPE.TYPE2;
                    }
                }
            } else {
                camera_type = cameraTypeConverter(i);
            }
        } else {
            i = -1;
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCameraTypeFromConfigCenter, cameraType = ");
        LIZ.append(i);
        LIZ.append(", realCameraType = ");
        LIZ.append(camera_type);
        P4Q.LJFF(str, X1D.LIZIZ(LIZ));
        return camera_type;
    }

    public void setPreviewSize(int i, int i2) {
        this.mPreviewSize = new VESize(i, i2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        int ordinal2;
        int ordinal3;
        int ordinal4;
        int ordinal5;
        int ordinal6;
        int ordinal7;
        parcel.writeIntArray(this.CameraHWLevelTE2Android);
        parcel.writeIntArray(this.CameraHWLevelAndroid2TE);
        parcel.writeInt(this.mFps);
        parcel.writeParcelable(this.mPreviewSize, i);
        parcel.writeIntArray(this.mFpsRange);
        CAMERA_HW_LEVEL camera_hw_level = this.mHwLevel;
        int i2 = -1;
        if (camera_hw_level == null) {
            ordinal = -1;
        } else {
            ordinal = camera_hw_level.ordinal();
        }
        parcel.writeInt(ordinal);
        CAMERA_TYPE camera_type = this.mCameraType;
        if (camera_type == null) {
            ordinal2 = -1;
        } else {
            ordinal2 = camera_type.ordinal();
        }
        parcel.writeInt(ordinal2);
        CAMERA_TYPE camera_type2 = this.mConfigCameraType;
        if (camera_type2 == null) {
            ordinal3 = -1;
        } else {
            ordinal3 = camera_type2.ordinal();
        }
        parcel.writeInt(ordinal3);
        parcel.writeByte(this.mIsUseNewCameraTypeStrategy ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mbDontUseVendorCamera ? (byte) 1 : (byte) 0);
        CAMERA_FACING_ID camera_facing_id = this.mCameraFacing;
        if (camera_facing_id == null) {
            ordinal4 = -1;
        } else {
            ordinal4 = camera_facing_id.ordinal();
        }
        parcel.writeInt(ordinal4);
        parcel.writeString(this.mStrCameraHardwareID);
        parcel.writeString(this.mSceneMode);
        parcel.writeByte(this.mCameraAntiShake ? (byte) 1 : (byte) 0);
        EnumC84137X0j enumC84137X0j = this.mCameraFrameRateStrategy;
        if (enumC84137X0j == null) {
            ordinal5 = -1;
        } else {
            ordinal5 = enumC84137X0j.ordinal();
        }
        parcel.writeInt(ordinal5);
        parcel.writeByte(this.mEnableWideFOV ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsUseHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableSurfaceSharing ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsCameraOpenCloseSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsForceCloseCamera ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableVBoost ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mVBoostTimeoutMS);
        parcel.writeInt(this.mFocusTimeoutMS);
        parcel.writeByte(this.mUseMaxWidthTakePicture ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mMaxWidth);
        parcel.writeByte(this.mOptionFlags);
        parcel.writeParcelable(this.mCaptureSize, i);
        CAMERA_OUTPUT_MODE camera_output_mode = this.mOutputMode;
        if (camera_output_mode == null) {
            ordinal6 = -1;
        } else {
            ordinal6 = camera_output_mode.ordinal();
        }
        parcel.writeInt(ordinal6);
        parcel.writeByte(this.mEnableFallback ? (byte) 1 : (byte) 0);
        CAMERA_MODE_TYPE camera_mode_type = this.mCameraMode;
        if (camera_mode_type == null) {
            ordinal7 = -1;
        } else {
            ordinal7 = camera_mode_type.ordinal();
        }
        parcel.writeInt(ordinal7);
        parcel.writeByte(this.mUseSyncModeOnCamera2 ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.mCameraZoomLimitFactor);
        parcel.writeByte(this.mEnableZsl ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableManualReleaseCaptureResult ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mRetryCnt);
        parcel.writeInt(this.mRetryStartPreviewCnt);
        parcel.writeByte(this.mEnableRecordStream ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableRecord60Fps ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mRecordStreamFolderPath);
        parcel.writeInt(this.mCamera2RetryCnt);
        parcel.writeBundle(this.mExtParameters);
        CAMERA_CAPTURE_FLASH_STRATEGY camera_capture_flash_strategy = this.mCaptureFlashStrategy;
        if (camera_capture_flash_strategy != null) {
            i2 = camera_capture_flash_strategy.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeByte(this.mCameraPreviewIndependent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnablePreviewingFallback ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableRefactorFocusAndMeter ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mPreferOpenCameraByCameraId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableForceRestartWhenCameraError ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mBindSurfaceLifecycleToCamera ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mEnableYuvBufferCapture ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.mMaxWidthTakePictureSizeAccuracy);
        parcel.writeFloat(this.mDefaultZoomRatio);
        parcel.writeBoolean(this.mDefaultZoomUsingZoomV2);
    }
}
