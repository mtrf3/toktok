package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class SuperEntranceConfig {

    @InterfaceC65349Pkn("valid_times")
    public List<ValidTimesConfig> validTimes = new ArrayList();

    @InterfaceC65349Pkn("video_url")
    public String videoUrl = "";

    @InterfaceC65349Pkn("video_md5")
    public String videoMd5 = "";

    @InterfaceC65349Pkn("loop_video_url")
    public String loopVideoUrl = "";

    @InterfaceC65349Pkn("loop_video_md5")
    public String loopVideoMd5 = "";

    @InterfaceC65349Pkn("effect_id")
    public String effectId = "";

    @InterfaceC65349Pkn("plus_icon_url")
    public String plusIconUrl = "";

    @InterfaceC65349Pkn("plus_icon_md5")
    public String plusIconMd5 = "";

    @InterfaceC65349Pkn("effect_ids")
    public List<String> effectIds = new ArrayList();

    @InterfaceC65349Pkn("video_back_img_url")
    public String videoBackImgUrl = "";

    @InterfaceC65349Pkn("video_back_img_md5")
    public String videoBackImgMd5 = "";

    @InterfaceC65349Pkn("try_tip")
    public String tryTip = "";

    @InterfaceC65349Pkn("effect_tip")
    public String effectTip = "";

    public String getEffectId() {
        return this.effectId;
    }

    public List<String> getEffectIds() {
        return this.effectIds;
    }

    public String getEffectTip() {
        return this.effectTip;
    }

    public String getLoopVideoMd5() {
        return this.loopVideoMd5;
    }

    public String getLoopVideoUrl() {
        return this.loopVideoUrl;
    }

    public String getPlusIconMd5() {
        return this.plusIconMd5;
    }

    public String getPlusIconUrl() {
        return this.plusIconUrl;
    }

    public String getTryTip() {
        return this.tryTip;
    }

    public List<ValidTimesConfig> getValidTimes() {
        return this.validTimes;
    }

    public String getVideoBackImgMd5() {
        return this.videoBackImgMd5;
    }

    public String getVideoBackImgUrl() {
        return this.videoBackImgUrl;
    }

    public String getVideoMd5() {
        return this.videoMd5;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }
}
