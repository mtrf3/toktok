package com.byted.cast.sdk;

import X.InterfaceC65349Pkn;
import X.V0N;
import android.os.Build;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.RTCSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Map;

/* loaded from: classes29.dex */
public class RTCScreenProfile implements Cloneable {

    @InterfaceC65349Pkn("castContext")
    public ContextManager.CastContext mCastContext;

    @InterfaceC65349Pkn("height")
    public int mHeight;

    @InterfaceC65349Pkn("logger")
    public CastLogger mLogger;

    @InterfaceC65349Pkn("width")
    public int mWidth;

    @InterfaceC65349Pkn("MediaCodecFormat")
    public Map<String, Integer> mediaFormatConfig;

    @InterfaceC65349Pkn("dpi")
    public int mDpi = 480;

    @InterfaceC65349Pkn("codecId")
    public RTCSetting.VCODEC_ID mCodecId = RTCSetting.VCODEC_ID.H264;

    @InterfaceC65349Pkn("bitrateMode")
    public RTCSetting.BITRATE_MODE mBitrateMode = RTCSetting.BITRATE_MODE.BITRATE_MODE_ABR;

    @InterfaceC65349Pkn("bitrate")
    public int mBitrate = 16000;

    @InterfaceC65349Pkn("maxBitrate")
    public int mMaxBitrate = 19200;

    @InterfaceC65349Pkn("mFps")
    public int mFps = 60;

    @InterfaceC65349Pkn("fixedResolution")
    public boolean mIsFixedResolution = true;

    @InterfaceC65349Pkn("sccType")
    public SCC_TYPE mSccType = SCC_TYPE.NONE;

    @InterfaceC65349Pkn("isEnabled")
    public boolean mIsEnabled = true;

    @InterfaceC65349Pkn("projectMode")
    public PROJECTION_MODE mProjectionMode = PROJECTION_MODE.PHONE_MIRROR;

    @InterfaceC65349Pkn("virtualDisplayFlag")
    public int virtualDisplayFlag = 1;

    @InterfaceC65349Pkn("virtualDisplayName")
    public String virtualDisplayName = "";

    public String toString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public RTCScreenProfile m59clone() {
        try {
            return (RTCScreenProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getBitrate() {
        return this.mBitrate;
    }

    public RTCSetting.BITRATE_MODE getBitrateMode() {
        return this.mBitrateMode;
    }

    public RTCSetting.VCODEC_ID getCodecId() {
        return this.mCodecId;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getFps() {
        return this.mFps;
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

    public int getVirtualDisplayFlag() {
        return this.virtualDisplayFlag;
    }

    public String getVirtualDisplayName() {
        return this.virtualDisplayName;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isFixedResolution() {
        return this.mIsFixedResolution;
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

    public RTCScreenProfile(ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
    }

    public RTCScreenProfile setCodecId(RTCSetting.VCODEC_ID vcodec_id) {
        this.mCodecId = vcodec_id;
        return this;
    }

    public RTCScreenProfile setDpi(int i) {
        this.mDpi = i;
        return this;
    }

    public RTCScreenProfile setEnabled(boolean z) {
        this.mIsEnabled = z;
        return this;
    }

    public RTCScreenProfile setFixedResolution(boolean z) {
        this.mIsFixedResolution = z;
        return this;
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
                    this.mBitrateMode = RTCSetting.BITRATE_MODE.BITRATE_MODE_ABR;
                } else {
                    this.mBitrateMode = RTCSetting.BITRATE_MODE.BITRATE_MODE_CBR;
                }
            } else {
                this.mBitrateMode = RTCSetting.BITRATE_MODE.BITRATE_MODE_VBR;
            }
        }
        return true;
    }

    public void setProjectionMode(PROJECTION_MODE projection_mode) {
        this.mProjectionMode = projection_mode;
    }

    public RTCScreenProfile setSccType(SCC_TYPE scc_type) {
        this.mSccType = scc_type;
        return this;
    }

    public void setVirtualDisplayFlag(int i) {
        this.virtualDisplayFlag = i;
    }

    public void setVirtualDisplayName(String str) {
        this.virtualDisplayName = str;
    }

    public void setmFps(int i) {
        this.mFps = i;
    }

    public RTCScreenProfile setBitrate(int i, int i2) {
        this.mBitrate = i;
        this.mMaxBitrate = i2;
        return this;
    }

    public RTCScreenProfile setResolution(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        return this;
    }
}
