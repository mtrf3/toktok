package com.byted.cast.sdk;

import X.InterfaceC65349Pkn;
import X.V0N;
import X.X1D;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.RTCSetting;

/* loaded from: classes29.dex */
public class RTCVideoProfile implements Cloneable {

    @InterfaceC65349Pkn("setCaptureType")
    public int mCaptureType;

    @InterfaceC65349Pkn("castContext")
    public ContextManager.CastContext mCastContext;

    @InterfaceC65349Pkn("fixedResolution")
    public boolean mIsFixedResolution;

    @InterfaceC65349Pkn("ltr")
    public boolean mIsLtrEnabled;

    @InterfaceC65349Pkn("logger")
    public CastLogger mLogger;

    @InterfaceC65349Pkn("cameraFacingId")
    public CAMERA_FACING_ID mCameraFacingId = CAMERA_FACING_ID.CAMERA_FACING_FRONT;

    @InterfaceC65349Pkn("cameraPreviewMode")
    public CAMERA_PREVIEW_MODE mCameraPreviewMode = CAMERA_PREVIEW_MODE.FULL;

    @InterfaceC65349Pkn("codecId")
    public RTCSetting.VCODEC_ID mCodecId = RTCSetting.VCODEC_ID.H265;

    @InterfaceC65349Pkn("bitrateMode")
    public RTCSetting.BITRATE_MODE mBitrateMode = RTCSetting.BITRATE_MODE.BITRATE_MODE_VBR;

    @InterfaceC65349Pkn("bitrate")
    public int mBitrate = 350;

    @InterfaceC65349Pkn("maxBitrate")
    public int mMaxBitrate = 600;

    @InterfaceC65349Pkn("cameraPreviewWidth")
    public int mCameraPreviewWidth = 848;

    @InterfaceC65349Pkn("cameraPreviewHeight")
    public int mCameraPreviewHeight = 480;

    @InterfaceC65349Pkn("cameraPreviewFps")
    public int mCameraPreviewFps = 20;

    @InterfaceC65349Pkn("autoPublish")
    public boolean mIsAutoPublish = true;

    @InterfaceC65349Pkn("isEnabled")
    public boolean mIsEnabled = true;

    @InterfaceC65349Pkn("layers")
    public int mLayers = 1;

    @InterfaceC65349Pkn("codecWidth")
    public int mCodecWidth = 1280;

    @InterfaceC65349Pkn("codecHeight")
    public int mCodecHeight = 720;

    public boolean isAutoPublish() {
        if (this.mIsEnabled && this.mIsAutoPublish) {
            return true;
        }
        return false;
    }

    public boolean isSimulcastEnabled() {
        if (this.mLayers > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RTCVideoProfile m60clone() {
        try {
            return (RTCVideoProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCVideoProfile{mCameraFacingId=");
        LIZ.append(this.mCameraFacingId);
        LIZ.append(", mCameraPreviewMode=");
        LIZ.append(this.mCameraPreviewMode);
        LIZ.append(", mCodecId=");
        LIZ.append(this.mCodecId);
        LIZ.append(", mBitrateMode=");
        LIZ.append(this.mBitrateMode);
        LIZ.append(", mBitrate=");
        LIZ.append(this.mBitrate);
        LIZ.append(", mMaxBitrate=");
        LIZ.append(this.mMaxBitrate);
        LIZ.append(", mCameraPreviewWidth=");
        LIZ.append(this.mCameraPreviewWidth);
        LIZ.append(", mCameraPreviewHeight=");
        LIZ.append(this.mCameraPreviewHeight);
        LIZ.append(", mCameraPreviewFps=");
        LIZ.append(this.mCameraPreviewFps);
        LIZ.append(", mIsFixedResolution=");
        LIZ.append(this.mIsFixedResolution);
        LIZ.append(", mIsLtrEnabled=");
        LIZ.append(this.mIsLtrEnabled);
        LIZ.append(", mIsAutoPublish=");
        LIZ.append(this.mIsAutoPublish);
        LIZ.append(", mIsEnabled=");
        LIZ.append(this.mIsEnabled);
        LIZ.append(", mLayers=");
        LIZ.append(this.mLayers);
        LIZ.append(", mCodecWidth=");
        LIZ.append(this.mCodecWidth);
        LIZ.append(", mCodecHeight=");
        LIZ.append(this.mCodecHeight);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public int getBitrate() {
        return this.mBitrate;
    }

    public RTCSetting.BITRATE_MODE getBitrateMode() {
        return this.mBitrateMode;
    }

    public CAMERA_FACING_ID getCameraId() {
        return this.mCameraFacingId;
    }

    public int getCameraPreviewFps() {
        return this.mCameraPreviewFps;
    }

    public int getCameraPreviewHeight() {
        return this.mCameraPreviewHeight;
    }

    public CAMERA_PREVIEW_MODE getCameraPreviewMode() {
        return this.mCameraPreviewMode;
    }

    public int getCameraPreviewWidth() {
        return this.mCameraPreviewWidth;
    }

    public int getCaptureType() {
        return this.mCaptureType;
    }

    public int getCodecHeight() {
        return this.mCodecHeight;
    }

    public RTCSetting.VCODEC_ID getCodecId() {
        return this.mCodecId;
    }

    public int getCodecWidth() {
        return this.mCodecWidth;
    }

    public int getLayers() {
        return this.mLayers;
    }

    public int getMaxBitrate() {
        return this.mMaxBitrate;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isFixedResolution() {
        return this.mIsFixedResolution;
    }

    public boolean isLtrEnabled() {
        return this.mIsLtrEnabled;
    }

    /* loaded from: classes29.dex */
    public enum CAMERA_FACING_ID {
        CAMERA_FACING_BACK,
        CAMERA_FACING_FRONT;

        public static CAMERA_FACING_ID valueOf(String str) {
            return (CAMERA_FACING_ID) V0N.LJJJ(CAMERA_FACING_ID.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum CAMERA_PREVIEW_MODE {
        FIT,
        FULL;

        public static CAMERA_PREVIEW_MODE valueOf(String str) {
            return (CAMERA_PREVIEW_MODE) V0N.LJJJ(CAMERA_PREVIEW_MODE.class, str);
        }
    }

    public RTCVideoProfile(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public RTCVideoProfile setBitrateMode(RTCSetting.BITRATE_MODE bitrate_mode) {
        this.mBitrateMode = bitrate_mode;
        return this;
    }

    public RTCVideoProfile setCameraId(CAMERA_FACING_ID camera_facing_id) {
        this.mCameraFacingId = camera_facing_id;
        return this;
    }

    public RTCVideoProfile setCameraPreviewFps(int i) {
        this.mCameraPreviewFps = i;
        return this;
    }

    public RTCVideoProfile setCameraPreviewMode(CAMERA_PREVIEW_MODE camera_preview_mode) {
        this.mCameraPreviewMode = camera_preview_mode;
        return this;
    }

    public void setCaptureType(int i) {
        this.mCaptureType = i;
    }

    public RTCVideoProfile setCodecId(RTCSetting.VCODEC_ID vcodec_id) {
        this.mCodecId = vcodec_id;
        return this;
    }

    public RTCVideoProfile setEnabled(boolean z) {
        this.mIsEnabled = z;
        if (!z) {
            this.mIsAutoPublish = false;
        }
        return this;
    }

    public RTCVideoProfile setFixedResolution(boolean z) {
        this.mIsFixedResolution = z;
        return this;
    }

    public RTCVideoProfile setIsAutoPublish(boolean z) {
        this.mIsAutoPublish = z;
        return this;
    }

    public RTCVideoProfile setIsLtrEnabled(boolean z) {
        this.mIsLtrEnabled = z;
        return this;
    }

    public RTCVideoProfile setIsSimulcastEnabled(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        this.mLayers = i;
        return this;
    }

    public RTCVideoProfile setBitrate(int i, int i2) {
        this.mBitrate = i;
        this.mMaxBitrate = i2;
        return this;
    }

    public RTCVideoProfile setCameraPreviewSize(int i, int i2) {
        this.mCameraPreviewWidth = i;
        this.mCameraPreviewHeight = i2;
        return this;
    }

    public void setCodecSize(int i, int i2) {
        this.mCodecWidth = i;
        this.mCodecHeight = i2;
    }
}
