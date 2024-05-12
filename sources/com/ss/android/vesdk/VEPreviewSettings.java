package com.ss.android.vesdk;

import X.C01R;
import X.C65429Pm5;
import X.EnumC46476ILw;
import X.EnumC46477ILx;
import X.EnumC79157V4v;
import X.X1D;
import com.ss.android.vesdk.VEConfigCenter;

/* loaded from: classes14.dex */
public class VEPreviewSettings {
    public boolean mBlockRenderExit;
    public VESize mCanvasSize;
    public int mCaptureRenderFinalWidth;
    public boolean mCheckStatusWhenStopPreview;
    public boolean mDisableEffectInternalSetting;
    public VEDisplaySettings mDisplaySettings;
    public long mEffectAlgorithmRequirement;
    public boolean mEnable3buffer;
    public boolean mEnableDestroyEffectInStopPreview;
    public boolean mEnableEGLImage;
    public boolean mEnableEffectRT;
    public boolean mEnableMakeUpBackground;
    public boolean mEnablePreloadEffectRes;
    public boolean mOptFirstFrame;
    public int mOptFirstFrameBypassEffectFrameCnt;
    public boolean mSwitchEffectInGLTask;
    public VESize mRenderSize = new VESize(720, 1280);
    public boolean mEnableAudioRecord = false;
    public boolean mIsAsyncDetection = false;
    public boolean mAudioPreStartEnable = false;
    public boolean mEnableNewEffectAlgorithmAsync = false;
    public boolean mCameraFrameUpdateIndependentThread = false;
    public int maxCountOfBufCache = 30;
    public boolean mDisEnableEffectWhenNoUsed = false;
    public boolean mTitanAutoTestLogEnable = false;
    public int mFirstNFrameIntervalsAverageCnt = 5;
    public EnumC46476ILw mContentType = EnumC46476ILw.RecordFullContent;
    public boolean mEnableDynamicRecordContentType = false;
    public boolean mEnableLens = false;
    public int mCaptureRenderMaxWidth = Integer.MAX_VALUE;
    public boolean mIsSyncCapture = false;
    public boolean mRecordEffectContentHighSpeed = false;
    public boolean mNeedPostProcess = true;
    public EnumC46477ILx graphType = EnumC46477ILx.LV_GRAPH_TYPE;
    public boolean mEnableEffectAmazingEngine = true;
    public boolean mEnable2DEngineEffect = true;
    public boolean mFollowShotIndependentThread = false;
    public boolean mForceSetFollowShotIndependentThread = false;
    public boolean mEnableRenderLayer = false;
    public boolean mEnableModelHotUpdate = false;
    public boolean mEnableAudioDecodeTimeOpt = false;
    public boolean mForceDecodeTimeOpt = false;
    public boolean mVideoDecodeUseSetMultiTrackStatus = true;
    public boolean mEnableRenderThreadSelfDrive = false;
    public int mRenderThreadSelfDriveConfig = 0;
    public boolean forceRenderThreadSelfDriveConfig = false;

    /* loaded from: classes14.dex */
    public static class Builder {
        public VEPreviewSettings mExportPreviewSettings;

        public Builder() {
            VEPreviewSettings vEPreviewSettings = new VEPreviewSettings();
            this.mExportPreviewSettings = vEPreviewSettings;
            vEPreviewSettings.maxCountOfBufCache = 3;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AB maxCountOfBufCache: ");
            C01R.LIZJ(LIZ, this.mExportPreviewSettings.maxCountOfBufCache, LIZ, "VEPreviewSettings");
        }

        public VEPreviewSettings build() {
            return this.mExportPreviewSettings;
        }

        public Builder(VEPreviewSettings vEPreviewSettings) {
            this.mExportPreviewSettings = vEPreviewSettings;
        }

        public Builder blockRenderExit(boolean z) {
            this.mExportPreviewSettings.mBlockRenderExit = z;
            return this;
        }

        public Builder disableEffectInternalSetting(boolean z) {
            this.mExportPreviewSettings.mDisableEffectInternalSetting = z;
            return this;
        }

        public Builder enable2DEngineEffect(boolean z) {
            this.mExportPreviewSettings.mEnable2DEngineEffect = z;
            return this;
        }

        public Builder enable3buffer(boolean z) {
            this.mExportPreviewSettings.mEnable3buffer = z;
            return this;
        }

        public Builder enableAudioDecodeTimeOpt(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mForceDecodeTimeOpt = true;
            vEPreviewSettings.mEnableAudioDecodeTimeOpt = z;
            return this;
        }

        public Builder enableAudioPreStart(boolean z) {
            this.mExportPreviewSettings.mAudioPreStartEnable = z;
            return this;
        }

        public Builder enableAudioRecord(boolean z) {
            this.mExportPreviewSettings.mEnableAudioRecord = z;
            return this;
        }

        public Builder enableCheckStatusWhenStopPreview(boolean z) {
            this.mExportPreviewSettings.mCheckStatusWhenStopPreview = z;
            return this;
        }

        public Builder enableDestroyEffectInStopPreview(boolean z) {
            this.mExportPreviewSettings.mEnableDestroyEffectInStopPreview = z;
            return this;
        }

        public Builder enableDynamicRecordContentType(boolean z) {
            this.mExportPreviewSettings.mEnableDynamicRecordContentType = z;
            return this;
        }

        public Builder enableEGLImage(boolean z) {
            this.mExportPreviewSettings.mEnableEGLImage = z;
            return this;
        }

        public Builder enableEffectAmazingEngine(boolean z) {
            this.mExportPreviewSettings.mEnableEffectAmazingEngine = z;
            return this;
        }

        public Builder enableEffectRT(boolean z) {
            this.mExportPreviewSettings.mEnableEffectRT = z;
            return this;
        }

        public Builder enableFollowShotIndependentThread(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mForceSetFollowShotIndependentThread = true;
            vEPreviewSettings.mFollowShotIndependentThread = z;
            return this;
        }

        public Builder enableLens(boolean z) {
            this.mExportPreviewSettings.mEnableLens = z;
            return this;
        }

        public Builder enableMakeUpBackground(boolean z) {
            this.mExportPreviewSettings.mEnableMakeUpBackground = z;
            return this;
        }

        public Builder enableModelHotUpdate(boolean z) {
            this.mExportPreviewSettings.mEnableModelHotUpdate = z;
            return this;
        }

        public Builder enablePreloadEffectRes(boolean z) {
            this.mExportPreviewSettings.mEnablePreloadEffectRes = z;
            return this;
        }

        public Builder enableRecordEffectContentHighSpeed(boolean z) {
            this.mExportPreviewSettings.mRecordEffectContentHighSpeed = z;
            return this;
        }

        public Builder enableRenderLayer(boolean z) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mEnableRenderLayer = z;
            if (z) {
                vEPreviewSettings.mEnableModelHotUpdate = true;
            }
            return this;
        }

        public Builder enableRenderThreadSelfDrive(boolean z) {
            this.mExportPreviewSettings.mEnableRenderThreadSelfDrive = z;
            return this;
        }

        public Builder enableSyncCapture(boolean z) {
            this.mExportPreviewSettings.mIsSyncCapture = z;
            return this;
        }

        public Builder firstNFrameIntervalsAverageCnt(int i) {
            this.mExportPreviewSettings.mFirstNFrameIntervalsAverageCnt = i;
            return this;
        }

        public Builder optFirstFrame(boolean z) {
            this.mExportPreviewSettings.mOptFirstFrame = z;
            return this;
        }

        public Builder setAsyncDetection(boolean z) {
            this.mExportPreviewSettings.mIsAsyncDetection = z;
            return this;
        }

        public Builder setCameraUpdateIndependentThread(boolean z) {
            this.mExportPreviewSettings.mCameraFrameUpdateIndependentThread = z;
            return this;
        }

        public Builder setCaptureRenderFinalWidth(int i) {
            this.mExportPreviewSettings.mCaptureRenderFinalWidth = i;
            return this;
        }

        public Builder setCaptureRenderMaxWidth(int i) {
            this.mExportPreviewSettings.mCaptureRenderMaxWidth = i;
            return this;
        }

        public Builder setDisEnableEffectWhenNoUsed(boolean z) {
            this.mExportPreviewSettings.mDisEnableEffectWhenNoUsed = z;
            return this;
        }

        public Builder setDisplaySettings(VEDisplaySettings vEDisplaySettings) {
            this.mExportPreviewSettings.mDisplaySettings = vEDisplaySettings;
            return this;
        }

        public Builder setEffectAlgorithmRequirement(long j) {
            this.mExportPreviewSettings.mEffectAlgorithmRequirement = j;
            return this;
        }

        public Builder setGraphMode(EnumC46477ILx enumC46477ILx) {
            this.mExportPreviewSettings.graphType = enumC46477ILx;
            return this;
        }

        public Builder setMaxCountOfBufCache(int i) {
            this.mExportPreviewSettings.maxCountOfBufCache = i;
            return this;
        }

        public Builder setNeedPostProcess(boolean z) {
            this.mExportPreviewSettings.mNeedPostProcess = z;
            return this;
        }

        public Builder setNewEffectAlgorithmAsync(boolean z) {
            this.mExportPreviewSettings.mEnableNewEffectAlgorithmAsync = z;
            return this;
        }

        public Builder setRecordContentType(EnumC46476ILw enumC46476ILw) {
            this.mExportPreviewSettings.mContentType = enumC46476ILw;
            return this;
        }

        public Builder setRenderSize(VESize vESize) {
            this.mExportPreviewSettings.mRenderSize = vESize;
            return this;
        }

        public Builder setRenderThreadSelfDriveConfig(int i) {
            VEPreviewSettings vEPreviewSettings = this.mExportPreviewSettings;
            vEPreviewSettings.mRenderThreadSelfDriveConfig = i;
            vEPreviewSettings.forceRenderThreadSelfDriveConfig = true;
            return this;
        }

        public Builder setTitanAutoTestLogEnbale(boolean z) {
            this.mExportPreviewSettings.mTitanAutoTestLogEnable = z;
            return this;
        }

        public Builder setVideoDecodeUseSetMultiTrackStatus(boolean z) {
            this.mExportPreviewSettings.mVideoDecodeUseSetMultiTrackStatus = z;
            return this;
        }

        public Builder switchEffectInGLTask(boolean z) {
            this.mExportPreviewSettings.mSwitchEffectInGLTask = z;
            return this;
        }
    }

    public boolean getAudioDecodeTimeOpt() {
        if (this.mForceDecodeTimeOpt) {
            return this.mEnableAudioDecodeTimeOpt;
        }
        return C65429Pm5.LJFF("ve_enanle_titan_audio_decode_time_opt", false);
    }

    public int getRecordContentType() {
        return this.mContentType.ordinal();
    }

    public boolean is3bufferEnable() {
        if (C65429Pm5.LJFF("ve_enable_three_buffer", false)) {
            this.mEnable3buffer = true;
        }
        return this.mEnable3buffer;
    }

    public boolean isAsyncDetection() {
        if (C65429Pm5.LJFF("ve_async_detection", true)) {
            this.mIsAsyncDetection = true;
        }
        return this.mIsAsyncDetection;
    }

    public boolean isEffectInternalSettingDisabled() {
        if (C65429Pm5.LJFF("ve_disable_effect_internal_setting", false)) {
            this.mDisableEffectInternalSetting = true;
        }
        return this.mDisableEffectInternalSetting;
    }

    public boolean isEnableNewEffectAlgorithmAsync() {
        if (C65429Pm5.LJFF("ve_new_effect_algorithm_async", false)) {
            this.mEnableNewEffectAlgorithmAsync = true;
        }
        return this.mEnableNewEffectAlgorithmAsync;
    }

    public boolean isEnablePassEffectWhenNoEffectFilter() {
        return C65429Pm5.LJFF("ve_enable_pass_effect_when_no_effect_filter", false);
    }

    public boolean isEnableTitanAudioOpt() {
        return C65429Pm5.LJFF("ve_titan_audio_opt", false);
    }

    public boolean isEnableTitanAutoTestLog() {
        if (C65429Pm5.LJFF("ve_enable_titan_auto_test_log", false)) {
            this.mTitanAutoTestLogEnable = true;
        }
        return this.mTitanAutoTestLogEnable;
    }

    public boolean isFollowShotIndependentThread() {
        if (this.mForceSetFollowShotIndependentThread) {
            return this.mFollowShotIndependentThread;
        }
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_titan_follow_shot_independent_thread");
        if (value != null && value.getValue() != null && (value.getValue() instanceof Boolean)) {
            this.mFollowShotIndependentThread = ((Boolean) value.getValue()).booleanValue();
        }
        return this.mFollowShotIndependentThread;
    }

    public boolean isOptFirstFrame() {
        if (C65429Pm5.LJFF("ve_opt_first_frame", false)) {
            this.mOptFirstFrame = true;
        }
        return this.mOptFirstFrame;
    }

    public boolean isPreloadEffectResEnabled() {
        if (C65429Pm5.LJFF("ve_enable_preload_effect_res", false)) {
            this.mEnablePreloadEffectRes = true;
        }
        return this.mEnablePreloadEffectRes;
    }

    public int getHwDecodeConfig() {
        return VEConfigCenter.getInstance().getValue("ve_enable_record_hw_decode", 0);
    }

    public boolean isEnableCameraFrameUpdateIndependentThread() {
        EnumC79157V4v cameraOutputAndUpdateStrategy = VECameraSettings.getCameraOutputAndUpdateStrategy();
        if (C65429Pm5.LJFF("ve_camera_frame_update_independent_thread", false)) {
            this.mCameraFrameUpdateIndependentThread = true;
        } else if (cameraOutputAndUpdateStrategy == EnumC79157V4v.STRATEGY_TWOTHREAD_ONEOUT || cameraOutputAndUpdateStrategy == EnumC79157V4v.STRATEGY_TWOTHREAD_TWOOUT) {
            this.mCameraFrameUpdateIndependentThread = true;
        }
        return this.mCameraFrameUpdateIndependentThread;
    }

    public boolean checkStatusWhenStopPreview() {
        return this.mCheckStatusWhenStopPreview;
    }

    public VESize getCanvasSize() {
        return this.mCanvasSize;
    }

    public int getCaptureRenderFinalWidth() {
        return this.mCaptureRenderFinalWidth;
    }

    public int getCaptureRenderMaxWidth() {
        return this.mCaptureRenderMaxWidth;
    }

    public boolean getDisEnableEffectWhenNoUsed() {
        return this.mDisEnableEffectWhenNoUsed;
    }

    public VEDisplaySettings getDisplaySettings() {
        return this.mDisplaySettings;
    }

    public long getEffectAlgorithmRequirement() {
        return this.mEffectAlgorithmRequirement;
    }

    public boolean getEnableLens() {
        return this.mEnableLens;
    }

    public int getFirstNFrameIntervalsAverageCnt() {
        return this.mFirstNFrameIntervalsAverageCnt;
    }

    public boolean getForceRenderThreadSelfDriveConfig() {
        return this.forceRenderThreadSelfDriveConfig;
    }

    public EnumC46477ILx getGraphType() {
        return this.graphType;
    }

    public int getMaxCountOfBufCache() {
        return this.maxCountOfBufCache;
    }

    public VESize getRenderSize() {
        return this.mRenderSize;
    }

    public int getRenderThreadSelfDriveConfig() {
        return this.mRenderThreadSelfDriveConfig;
    }

    public boolean isAudioPreStartEnable() {
        return this.mAudioPreStartEnable;
    }

    public boolean isAudioRecordEnabled() {
        return this.mEnableAudioRecord;
    }

    public boolean isBlockRenderExit() {
        return this.mBlockRenderExit;
    }

    public boolean isEGLImageEnable() {
        return this.mEnableEGLImage;
    }

    public boolean isEffectRTEnable() {
        return this.mEnableEffectRT;
    }

    public boolean isEnable2DEngineEffect() {
        return this.mEnable2DEngineEffect;
    }

    public boolean isEnableDestroyEffectInStopPreview() {
        return this.mEnableDestroyEffectInStopPreview;
    }

    public boolean isEnableDynamicRecordContentType() {
        return this.mEnableDynamicRecordContentType;
    }

    public boolean isEnableEffectAmazingEngine() {
        return this.mEnableEffectAmazingEngine;
    }

    public boolean isEnableModelHotUpdate() {
        return this.mEnableModelHotUpdate;
    }

    public boolean isEnableRenderLayer() {
        return this.mEnableRenderLayer;
    }

    public boolean isEnableRenderThreadSelfDrive() {
        return this.mEnableRenderThreadSelfDrive;
    }

    public boolean isMakeUpBackgroundEnable() {
        return this.mEnableMakeUpBackground;
    }

    public boolean isRecordEffectContentHighSpeed() {
        return this.mRecordEffectContentHighSpeed;
    }

    public boolean isSwitchEffectInGLTask() {
        return this.mSwitchEffectInGLTask;
    }

    public boolean isSyncCapture() {
        return this.mIsSyncCapture;
    }

    public boolean isVideoDecodeUseSetMultiTrackStatus() {
        return this.mVideoDecodeUseSetMultiTrackStatus;
    }

    public boolean needPostProcess() {
        return this.mNeedPostProcess;
    }
}
