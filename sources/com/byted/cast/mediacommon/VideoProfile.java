package com.byted.cast.mediacommon;

import X.InterfaceC65349Pkn;
import X.V0N;
import android.os.Build;
import com.byted.cast.mediacommon.MediaSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Map;

/* loaded from: classes29.dex */
public class VideoProfile implements Cloneable {

    @InterfaceC65349Pkn("resize")
    public boolean mNeedResize;

    @InterfaceC65349Pkn("startCert")
    public Object mStartCert;

    @InterfaceC65349Pkn("stopCert")
    public Object mStopCert;

    @InterfaceC65349Pkn("MediaCodecFormat")
    public Map<String, Integer> mediaFormatConfig;

    @InterfaceC65349Pkn("enableModifyFps")
    public boolean modifyFps;

    @InterfaceC65349Pkn("VirtualDisplayWidth")
    public int mVirtualDisplayWidth = 1920;

    @InterfaceC65349Pkn("VirtualDisplayHeight")
    public int mVirtualDisplayHeight = 1080;

    @InterfaceC65349Pkn("width")
    public int mWidth = 1920;

    @InterfaceC65349Pkn("height")
    public int mHeight = 1080;

    @InterfaceC65349Pkn("dpi")
    public int mDpi = 480;

    @InterfaceC65349Pkn("codecId")
    public MediaSetting.VCODEC_ID mCodecId = MediaSetting.VCODEC_ID.H264;

    @InterfaceC65349Pkn("bitrateMode")
    public MediaSetting.BITRATE_MODE mBitrateMode = MediaSetting.BITRATE_MODE.BITRATE_MODE_ABR;

    @InterfaceC65349Pkn("sourceType")
    public MediaSetting.VIDEO_SOURCE_TYPE mSourceType = MediaSetting.VIDEO_SOURCE_TYPE.SCREEN;

    @InterfaceC65349Pkn("bitrate")
    public int mBitrate = 16000;

    @InterfaceC65349Pkn("maxBitrate")
    public int mMaxBitrate = 19200;

    @InterfaceC65349Pkn("mFps")
    public int mFps = 30;

    @InterfaceC65349Pkn("mVirtualDisplayFlag")
    public int mVirtualDisplayFlag = 16;

    @InterfaceC65349Pkn("mVirtualDisplayName")
    public String mVirtualDisplayName = "VirtualDisplay-Recorder";

    @InterfaceC65349Pkn("interval")
    public int I_FRAME_INTERVAL = 3;

    @InterfaceC65349Pkn("camera")
    public int cameraInfo = 1;

    @InterfaceC65349Pkn("fixedResolution")
    public boolean mIsFixedResolution = true;

    @InterfaceC65349Pkn("sccType")
    public SCC_TYPE mSccType = SCC_TYPE.NONE;

    @InterfaceC65349Pkn("isEnabled")
    public boolean mIsEnabled = true;

    @InterfaceC65349Pkn("enableSetMaxFps")
    public boolean setMaxFps = true;

    @InterfaceC65349Pkn("enableOpenGL")
    public boolean enableOpenGL = true;

    @InterfaceC65349Pkn("projectMode")
    public PROJECTION_MODE mProjectionMode = PROJECTION_MODE.PHONE_MIRROR;
    public AVSYNC_TYPE mAVSyncType = AVSYNC_TYPE.SYNC_LOW_LATENCY;
    public MediaSetting.STREAM_TYPE mStreamType = MediaSetting.STREAM_TYPE.STREAM_ES;

    public String toString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VideoProfile m57clone() {
        try {
            return (VideoProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public AVSYNC_TYPE getAVSyncType() {
        return this.mAVSyncType;
    }

    public int getBitrate() {
        return this.mBitrate;
    }

    public MediaSetting.BITRATE_MODE getBitrateMode() {
        return this.mBitrateMode;
    }

    public int getCameraInfo() {
        return this.cameraInfo;
    }

    public MediaSetting.VCODEC_ID getCodecId() {
        return this.mCodecId;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getFps() {
        return this.mFps;
    }

    public int getFrameInterval() {
        return this.I_FRAME_INTERVAL;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getMaxBitrate() {
        return this.mMaxBitrate;
    }

    public Map<String, Integer> getMediaFormat() {
        return this.mediaFormatConfig;
    }

    public PROJECTION_MODE getProjectionMode() {
        return this.mProjectionMode;
    }

    public SCC_TYPE getSccType() {
        return this.mSccType;
    }

    public MediaSetting.VIDEO_SOURCE_TYPE getSourceType() {
        return this.mSourceType;
    }

    public MediaSetting.STREAM_TYPE getStreamType() {
        return this.mStreamType;
    }

    public int getVirtualDisplayFlag() {
        return this.mVirtualDisplayFlag;
    }

    public int getVirtualDisplayHeight() {
        return this.mVirtualDisplayHeight;
    }

    public String getVirtualDisplayName() {
        return this.mVirtualDisplayName;
    }

    public int getVirtualDisplayWidth() {
        return this.mVirtualDisplayWidth;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isEnableModifyFps() {
        return this.modifyFps;
    }

    public boolean isEnableSetMaxFps() {
        return this.setMaxFps;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isFixedResolution() {
        return this.mIsFixedResolution;
    }

    public boolean isNeedResize() {
        return this.mNeedResize;
    }

    public boolean isOpenGlEnable() {
        return this.enableOpenGL;
    }

    /* loaded from: classes29.dex */
    public enum AVSYNC_TYPE {
        SYNC_LOW_LATENCY,
        SYNC_NORMAL;

        public static AVSYNC_TYPE valueOf(String str) {
            return (AVSYNC_TYPE) V0N.LJJJ(AVSYNC_TYPE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum PROJECTION_MODE {
        TNT_DESKTOP,
        PHONE_MIRROR;

        public static PROJECTION_MODE valueOf(String str) {
            return (PROJECTION_MODE) V0N.LJJJ(PROJECTION_MODE.class, str);
        }
    }

    /* loaded from: classes29.dex */
    public enum SCC_TYPE {
        NONE,
        COMPATIBLE,
        FULL_FEATURE;

        public static SCC_TYPE valueOf(String str) {
            return (SCC_TYPE) V0N.LJJJ(SCC_TYPE.class, str);
        }
    }

    public void enableModifyFps(boolean z) {
        this.modifyFps = z;
    }

    public void enableOpenGL(boolean z) {
        this.enableOpenGL = z;
    }

    public void enableSetMaxFps(boolean z) {
        this.setMaxFps = z;
    }

    public void setCameraInfo(int i) {
        this.cameraInfo = i;
    }

    public VideoProfile setCodecId(MediaSetting.VCODEC_ID vcodec_id) {
        this.mCodecId = vcodec_id;
        return this;
    }

    public VideoProfile setDpi(int i) {
        this.mDpi = i;
        return this;
    }

    public VideoProfile setEnabled(boolean z) {
        this.mIsEnabled = z;
        return this;
    }

    public VideoProfile setFixedResolution(boolean z) {
        this.mIsFixedResolution = z;
        return this;
    }

    public void setFps(int i) {
        this.mFps = i;
    }

    public void setFrameInterval(int i) {
        this.I_FRAME_INTERVAL = i;
    }

    public boolean setMediaFormat(Map<String, Integer> map) {
        this.mediaFormatConfig = map;
        if (Build.VERSION.SDK_INT <= 21) {
            return false;
        }
        if (map != null && map.containsKey("bitrate-mode")) {
            int intValue = map.get("bitrate-mode").intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    this.mBitrateMode = MediaSetting.BITRATE_MODE.BITRATE_MODE_ABR;
                } else {
                    this.mBitrateMode = MediaSetting.BITRATE_MODE.BITRATE_MODE_CBR;
                }
            } else {
                this.mBitrateMode = MediaSetting.BITRATE_MODE.BITRATE_MODE_VBR;
            }
        }
        return true;
    }

    public void setNeedResize(boolean z) {
        this.mNeedResize = z;
    }

    public void setProjectionMode(PROJECTION_MODE projection_mode) {
        this.mProjectionMode = projection_mode;
    }

    public VideoProfile setSccType(SCC_TYPE scc_type) {
        this.mSccType = scc_type;
        return this;
    }

    public void setSourceType(MediaSetting.VIDEO_SOURCE_TYPE video_source_type) {
        this.mSourceType = video_source_type;
    }

    public void setVirtualDisplayFlag(int i) {
        this.mVirtualDisplayFlag = i;
    }

    public void setVirtualDisplayName(String str) {
        this.mVirtualDisplayName = str;
    }

    public VideoProfile setBitrate(int i, int i2) {
        this.mBitrate = i;
        this.mMaxBitrate = i2;
        return this;
    }

    public VideoProfile setResolution(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        return this;
    }

    public void setVirtualDisplayWH(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.mVirtualDisplayWidth = i;
            this.mVirtualDisplayHeight = i2;
        }
    }
}
