package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import defpackage.b0;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class LiveStreamUrlExtra implements Serializable {

    @InterfaceC65349Pkn("anchor_interact_profile")
    public int anchorInteractProfile;

    @InterfaceC65349Pkn("audience_interact_profile")
    public int audienceInteractProfile;

    @InterfaceC65349Pkn("bitrate_adapt_strategy")
    public int bitrateAdaptStrategy;

    @InterfaceC65349Pkn("hardware_encode")
    public boolean hardwareEncode;

    @InterfaceC65349Pkn("roi")
    public boolean isRoi;

    @InterfaceC65349Pkn("sw_roi")
    public boolean isSwRoi;
    public int previewHeight;
    public int previewWidth;

    @InterfaceC65349Pkn("super_resolution")
    public SrConfig srConfig;

    @InterfaceC65349Pkn("ngb_push_url")
    public String ngbPushUrl = "";

    @InterfaceC65349Pkn("ngb_push_url_postfix")
    public String ngbPushUrlPrefix = "";

    @InterfaceC65349Pkn("height")
    public int height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;

    @InterfaceC65349Pkn("width")
    public int width = 360;

    @InterfaceC65349Pkn("min_bitrate")
    public int minBitrate = 200;

    @InterfaceC65349Pkn("default_bitrate")
    public int defaultBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;

    @InterfaceC65349Pkn("max_bitrate")
    public int maxBitrate = 800;

    @InterfaceC65349Pkn("video_profile")
    public int profile = 1;

    @InterfaceC65349Pkn("fps")
    public int fps = 15;

    @InterfaceC65349Pkn("gop_sec")
    public float gopSec = 2.0f;

    @InterfaceC65349Pkn("bframe_enable")
    public boolean enableBFrame = true;

    /* loaded from: classes6.dex */
    public static class SrConfig implements Serializable {

        @InterfaceC65349Pkn("antialiasing")
        public boolean antiAlias;

        @InterfaceC65349Pkn("enable")
        public boolean enabled;

        @InterfaceC65349Pkn("strength")
        public int strength;

        public SrConfig() {
            this(false, false, 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SrConfig{enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", antiAlias=");
            LIZ.append(this.antiAlias);
            LIZ.append(", strength=");
            return b0.LIZJ(LIZ, this.strength, '}', LIZ);
        }

        public SrConfig(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i;
        }
    }

    public int getDefaultBitrate() {
        if (this.defaultBitrate == 0) {
            this.defaultBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        return this.defaultBitrate;
    }

    public int getFPS() {
        if (this.fps == 0) {
            this.fps = 15;
        }
        return this.fps;
    }

    public int getHeight() {
        if (this.height == 0) {
            this.height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        }
        return this.height;
    }

    public int getMaxBitrate() {
        if (this.maxBitrate == 0) {
            this.maxBitrate = (getDefaultBitrate() * 2) - getMinBitrate();
        }
        return this.maxBitrate;
    }

    public int getMinBitrate() {
        if (this.minBitrate == 0) {
            this.minBitrate = 200;
        }
        return this.minBitrate;
    }

    public int getPreviewHeight() {
        int i = this.previewHeight;
        if (i == 0) {
            return 1280;
        }
        return i;
    }

    public int getPreviewWidth() {
        int i = this.previewWidth;
        if (i == 0) {
            return 720;
        }
        return i;
    }

    public int getWidth() {
        if (this.width == 0) {
            this.width = 360;
        }
        return this.width;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveStreamUrlExtra{ngbPushUrl='");
        Q89.LIZIZ(LIZ, this.ngbPushUrl, '\'', ", ngbPushUrlPrefix='");
        Q89.LIZIZ(LIZ, this.ngbPushUrlPrefix, '\'', ", height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", minBitrate=");
        LIZ.append(this.minBitrate);
        LIZ.append(", defaultBitrate=");
        LIZ.append(this.defaultBitrate);
        LIZ.append(", maxBitrate=");
        LIZ.append(this.maxBitrate);
        LIZ.append(", profile=");
        LIZ.append(this.profile);
        LIZ.append(", hardwareEncode=");
        LIZ.append(this.hardwareEncode);
        LIZ.append(", bitrateAdaptStrategy=");
        LIZ.append(this.bitrateAdaptStrategy);
        LIZ.append(", fps=");
        LIZ.append(this.fps);
        LIZ.append(", anchorInteractProfile=");
        LIZ.append(this.anchorInteractProfile);
        LIZ.append(", audienceInteractProfile=");
        LIZ.append(this.audienceInteractProfile);
        LIZ.append(", srConfig=");
        LIZ.append(this.srConfig);
        LIZ.append(", gopSec=");
        LIZ.append(this.gopSec);
        LIZ.append(", enableBFrame=");
        LIZ.append(this.enableBFrame);
        LIZ.append(", isRoi=");
        LIZ.append(this.isRoi);
        LIZ.append(", isSwRoi=");
        LIZ.append(this.isSwRoi);
        LIZ.append(", previewWidth=");
        LIZ.append(this.previewWidth);
        LIZ.append(", previewHeight=");
        return b0.LIZJ(LIZ, this.previewHeight, '}', LIZ);
    }

    public int getAnchorInteractProfile() {
        return this.anchorInteractProfile;
    }

    public int getAudienceInteractProfile() {
        return this.audienceInteractProfile;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public float getGopSec() {
        return this.gopSec;
    }

    public String getNgbPushUrl() {
        return this.ngbPushUrl;
    }

    public String getNgbPushUrlPrefix() {
        return this.ngbPushUrlPrefix;
    }

    public int getProfile() {
        return this.profile;
    }

    public SrConfig getSrConfig() {
        return this.srConfig;
    }

    public boolean isEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean isHardwareEncode() {
        return this.hardwareEncode;
    }

    public boolean isRoi() {
        return this.isRoi;
    }

    public boolean isSwRoi() {
        return this.isSwRoi;
    }

    public void setAnchorInteractProfile(int i) {
        this.anchorInteractProfile = i;
    }

    public void setAudienceInteractProfile(int i) {
        this.audienceInteractProfile = i;
    }

    @InterfaceC65349Pkn("bitrate_adapt_strategy")
    public void setBitrateAdaptStrategy(int i) {
        this.bitrateAdaptStrategy = i;
    }

    public void setDefaultBitrate(int i) {
        this.defaultBitrate = i;
    }

    @InterfaceC65349Pkn("bframe_enable")
    public void setEnableBFrame(boolean z) {
        this.enableBFrame = z;
    }

    public void setFPS(int i) {
        this.fps = i;
    }

    @InterfaceC65349Pkn("gop_sec")
    public void setGopSec(float f) {
        this.gopSec = f;
    }

    public void setHardwareEncode(boolean z) {
        this.hardwareEncode = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMaxBitrate(int i) {
        this.maxBitrate = i;
    }

    public void setMinBitrate(int i) {
        this.minBitrate = i;
    }

    public void setNgbPushUrl(String str) {
        this.ngbPushUrl = str;
    }

    public void setNgbPushUrlPrefix(String str) {
        this.ngbPushUrlPrefix = str;
    }

    public void setProfile(int i) {
        this.profile = i;
    }

    @InterfaceC65349Pkn("roi")
    public void setRoi(boolean z) {
        this.isRoi = z;
    }

    public void setSrConfig(SrConfig srConfig) {
        this.srConfig = srConfig;
    }

    @InterfaceC65349Pkn("sw_roi")
    public void setSwRoi(boolean z) {
        this.isSwRoi = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
