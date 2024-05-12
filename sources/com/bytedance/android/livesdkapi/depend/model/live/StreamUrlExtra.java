package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;

/* loaded from: classes6.dex */
public class StreamUrlExtra {

    @InterfaceC65349Pkn("anchor_interact_profile")
    public int anchorInteractProfile;

    @InterfaceC65349Pkn("audience_interact_profile")
    public int audienceInteractProfile;

    @InterfaceC65349Pkn("bitrate_adapt_strategy")
    public int bitrateAdaptStrategy;

    @InterfaceC65349Pkn("bytevc1_enable")
    public boolean enableByteVC1;

    @InterfaceC65349Pkn("hardware_encode")
    public boolean hardwareEncode;

    @InterfaceC65349Pkn("roi")
    public boolean isRoi;

    @InterfaceC65349Pkn("sw_roi")
    public boolean isSwRoi;

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

    public final int LIZ() {
        if (this.height == 0) {
            this.height = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        }
        return this.height;
    }

    public final int LIZIZ() {
        if (this.maxBitrate == 0) {
            if (this.defaultBitrate == 0) {
                this.defaultBitrate = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            }
            int i = this.defaultBitrate * 2;
            if (this.minBitrate == 0) {
                this.minBitrate = 200;
            }
            this.maxBitrate = i - this.minBitrate;
        }
        return this.maxBitrate;
    }

    public final int LIZJ() {
        if (this.width == 0) {
            this.width = 360;
        }
        return this.width;
    }

    /* loaded from: classes6.dex */
    public static class SrConfig {

        @InterfaceC65349Pkn("antialiasing")
        public boolean antiAlias;

        @InterfaceC65349Pkn("enable")
        public boolean enabled;

        @InterfaceC65349Pkn("strength")
        public int strength;

        public SrConfig() {
            this(false, false, 0);
        }

        public SrConfig(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i;
        }
    }
}
