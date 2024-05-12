package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class UgNewFeedPendant {

    @InterfaceC65349Pkn("cap_color1")
    public String capsuleBackgroundColor;

    @InterfaceC65349Pkn("cap_color2")
    public String capsuleParallelogramColor;

    @InterfaceC65349Pkn("clock_color")
    public String clockColor;

    @InterfaceC65349Pkn("disappear_after")
    public Integer disappearAfter;

    @InterfaceC65349Pkn("dismiss_after")
    public Integer dismissAfter;

    @InterfaceC65349Pkn("frequent_limit")
    public UgFrequentLimit frequentLimit;

    @InterfaceC65349Pkn("h5_link")
    public String h5Link;

    @InterfaceC65349Pkn("k_capsule")
    public Boolean kCapsule;

    @InterfaceC65349Pkn("lottie_file_md5")
    public String lottieFileMd5;

    @InterfaceC65349Pkn("mini_pendant_closable")
    public Boolean miniPendantClosable;

    @InterfaceC65349Pkn("mini_pendant_switchable")
    public Boolean miniPendantSwitchable;

    @InterfaceC65349Pkn("text_color")
    public String newDayColor;

    @InterfaceC65349Pkn("new_user")
    public UgNewUser newUser;

    @InterfaceC65349Pkn("promotion_hashtag_ids")
    public List<String> promotionIds;

    @InterfaceC65349Pkn("router_url")
    public String routerUrl;

    @InterfaceC65349Pkn("second_h5_link")
    public String secondH5Link;

    @InterfaceC65349Pkn("show_in_follow")
    public Boolean showInFollow;

    @InterfaceC65349Pkn("show_times")
    public Integer showTimes;

    @InterfaceC65349Pkn("teenager_mode_enable")
    public Boolean teenagerModeEnable;

    @InterfaceC65349Pkn("right_color")
    public String tickColor;

    @InterfaceC65349Pkn("text")
    public String tickText;

    @InterfaceC65349Pkn("timer_link")
    public String timerLink;

    @InterfaceC65349Pkn("clock_lottie_file_md5")
    public String timerLottieFileMd5;

    @InterfaceC65349Pkn("use_origin_pendant")
    public Boolean useOriginPendant;

    @InterfaceC65349Pkn("user_limit")
    public UgUserLimit userLimit;

    @InterfaceC65349Pkn("resource_url")
    public List<UrlModel> resourceUrl = new ArrayList();

    @InterfaceC65349Pkn("pendant_type")
    public Integer pendantType = 0;

    @InterfaceC65349Pkn("clock_lottie_file_zip")
    public List<String> timerLottieFileZip = new ArrayList();

    @InterfaceC65349Pkn("bar_color")
    public List<String> barColor = new ArrayList();

    @InterfaceC65349Pkn("bg_color")
    public List<String> bgColor = new ArrayList();

    @InterfaceC65349Pkn("lottie_file_zip")
    public List<String> lottieFileZip = new ArrayList();

    @InterfaceC65349Pkn("fragment_lottie_frame_list")
    public List<Integer> fragmentLottieFrameList = new ArrayList();

    @InterfaceC65349Pkn("big_png_fragments_urls")
    public List<String> bigPngFragmentsUrls = new ArrayList();

    @InterfaceC65349Pkn("small_png_fragments_urls")
    public List<String> smallPngFragmentsUrls = new ArrayList();

    @InterfaceC65349Pkn("k_capsule_content")
    public List<String> kCapsuleContent = new ArrayList();

    @InterfaceC65349Pkn("capsule_color")
    public List<String> capsuleColor = new ArrayList();

    @InterfaceC65349Pkn("expanded_pendant_frame_list")
    public List<Integer> expandedPendantFrameList = new ArrayList();

    @InterfaceC65349Pkn("folded_pendant_frame_list")
    public List<Integer> foldedPendantFrameList = new ArrayList();

    @InterfaceC65349Pkn("second_lottie_time")
    public List<IntArray> secondLottieTime = new ArrayList();

    public Integer getDisappearAfter() {
        Integer num = this.disappearAfter;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public UgFrequentLimit getFrequentLimit() {
        UgFrequentLimit ugFrequentLimit = this.frequentLimit;
        if (ugFrequentLimit != null) {
            return ugFrequentLimit;
        }
        throw new C158056If();
    }

    public String getH5Link() {
        String str = this.h5Link;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getKCapsule() {
        Boolean bool = this.kCapsule;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public String getLottieFileMd5() {
        String str = this.lottieFileMd5;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getMiniPendantClosable() {
        Boolean bool = this.miniPendantClosable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getMiniPendantSwitchable() {
        Boolean bool = this.miniPendantSwitchable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public UgNewUser getNewUser() {
        UgNewUser ugNewUser = this.newUser;
        if (ugNewUser != null) {
            return ugNewUser;
        }
        throw new C158056If();
    }

    public Integer getPendantType() {
        Integer num = this.pendantType;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getSecondH5Link() {
        String str = this.secondH5Link;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getShowInFollow() {
        Boolean bool = this.showInFollow;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getShowTimes() {
        Integer num = this.showTimes;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getTeenagerModeEnable() {
        Boolean bool = this.teenagerModeEnable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public UgUserLimit getUserLimit() {
        UgUserLimit ugUserLimit = this.userLimit;
        if (ugUserLimit != null) {
            return ugUserLimit;
        }
        throw new C158056If();
    }

    public List<String> getBarColor() {
        return this.barColor;
    }

    public List<String> getBgColor() {
        return this.bgColor;
    }

    public List<String> getBigPngFragmentsUrls() {
        return this.bigPngFragmentsUrls;
    }

    public String getCapsuleBackgroundColor() {
        return this.capsuleBackgroundColor;
    }

    public List<String> getCapsuleColor() {
        return this.capsuleColor;
    }

    public String getCapsuleParallelogramColor() {
        return this.capsuleParallelogramColor;
    }

    public String getClockColor() {
        return this.clockColor;
    }

    public Integer getDismissAfter() {
        return this.dismissAfter;
    }

    public List<Integer> getExpandedPendantFrameList() {
        return this.expandedPendantFrameList;
    }

    public List<Integer> getFoldedPendantFrameList() {
        return this.foldedPendantFrameList;
    }

    public List<Integer> getFragmentLottieFrameList() {
        return this.fragmentLottieFrameList;
    }

    public List<String> getKCapsuleContent() {
        return this.kCapsuleContent;
    }

    public List<String> getLottieFileZip() {
        return this.lottieFileZip;
    }

    public String getNewDayColor() {
        return this.newDayColor;
    }

    public List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public List<UrlModel> getResourceUrl() {
        return this.resourceUrl;
    }

    public String getRouterUrl() {
        return this.routerUrl;
    }

    public List<IntArray> getSecondLottieTime() {
        return this.secondLottieTime;
    }

    public List<String> getSmallPngFragmentsUrls() {
        return this.smallPngFragmentsUrls;
    }

    public String getTickColor() {
        return this.tickColor;
    }

    public String getTickText() {
        return this.tickText;
    }

    public String getTimerLink() {
        return this.timerLink;
    }

    public String getTimerLottieFileMd5() {
        return this.timerLottieFileMd5;
    }

    public List<String> getTimerLottieFileZip() {
        return this.timerLottieFileZip;
    }

    public Boolean getUseOriginPendant() {
        return this.useOriginPendant;
    }

    public void setBarColor(List<String> list) {
        this.barColor = list;
    }

    public void setBgColor(List<String> list) {
        this.bgColor = list;
    }

    public void setCapsuleBackgroundColor(String str) {
        this.capsuleBackgroundColor = str;
    }

    public void setCapsuleParallelogramColor(String str) {
        this.capsuleParallelogramColor = str;
    }

    public void setClockColor(String str) {
        this.clockColor = str;
    }

    public void setDismissAfter(Integer num) {
        this.dismissAfter = num;
    }

    public void setNewDayColor(String str) {
        this.newDayColor = str;
    }

    public void setPromotionIds(List<String> list) {
        this.promotionIds = list;
    }

    public void setRouterUrl(String str) {
        this.routerUrl = str;
    }

    public void setTickColor(String str) {
        this.tickColor = str;
    }

    public void setTickText(String str) {
        this.tickText = str;
    }

    public void setTimerLink(String str) {
        this.timerLink = str;
    }

    public void setTimerLottieFileMd5(String str) {
        this.timerLottieFileMd5 = str;
    }

    public void setTimerLottieFileZip(List<String> list) {
        this.timerLottieFileZip = list;
    }

    public void setUseOriginPendant(Boolean bool) {
        this.useOriginPendant = bool;
    }
}
