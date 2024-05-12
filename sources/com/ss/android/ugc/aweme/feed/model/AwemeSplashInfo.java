package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.O1A;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class AwemeSplashInfo implements Serializable {
    public transient boolean adCardShownOnce;
    public String anchorId;

    @InterfaceC65349Pkn("awesome_splash_id")
    public String awesomeSplashId;
    public transient boolean contextTrackSent;

    @InterfaceC65349Pkn("disable_hotstart_show")
    public boolean disableHotStartShow;

    @InterfaceC65349Pkn("enable_splash_open")
    public boolean enableSplashOpen;

    @InterfaceC65349Pkn("end_time")
    public int endTime;

    @InterfaceC65349Pkn("enter_app_text")
    public String enterAppText;
    public transient boolean hasUpdateLiving;

    @InterfaceC65349Pkn("hot_show_type")
    public int hotShowType;

    @InterfaceC65349Pkn("is_invalid_ad")
    public boolean isInvalidAd;

    @O1A(deserialize = false, serialize = false)
    public transient boolean isShown;

    @InterfaceC65349Pkn("label_info")
    public LabelInfo labelInfo;

    @InterfaceC65349Pkn("logo_color")
    public int logoColor;

    @InterfaceC65349Pkn("predownload_text")
    public String predownloadText;

    @InterfaceC65349Pkn("preload_type")
    public int preloadType;

    @InterfaceC65349Pkn("show_live_info")
    public int showLiveInfo;

    @InterfaceC65349Pkn("skip_info")
    public SkipInfo skipInfo;

    @InterfaceC65349Pkn("splash_button_text")
    public String splashButtonText;

    @InterfaceC65349Pkn("splash_feed_type")
    public int splashFeedType;

    @InterfaceC65349Pkn("splash_show_time")
    public float splashShowTime = 3000.0f;

    @InterfaceC65349Pkn("start_time")
    public int startTime;

    @InterfaceC65349Pkn("swipe_up_delay")
    public long swipeUpDelay;

    @InterfaceC65349Pkn("swipe_up_type")
    public int swipeUpType;
    public transient TopViewLiveInfo topViewLiveInfo;

    /* loaded from: classes11.dex */
    public class SkipInfo implements Serializable {

        @InterfaceC65349Pkn("background_color")
        public String backgroundColor;

        @InterfaceC65349Pkn("button_extra_style")
        public int buttonExtraStyle;

        @InterfaceC65349Pkn("countdown_unit")
        public String countdownUnit;

        @InterfaceC65349Pkn("countdown_enable")
        public int countdown_enable;

        @InterfaceC65349Pkn("height_extra_size")
        public int heightExtraSize;

        @InterfaceC65349Pkn("position")
        public int position;

        @InterfaceC65349Pkn("text")
        public String text;

        @InterfaceC65349Pkn("text_color")
        public String textColor;

        @InterfaceC65349Pkn("width_extra_size")
        public int widthExtraSize;

        public boolean isCountdown_enable() {
            if (this.countdown_enable == 1) {
                return true;
            }
            return false;
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getButtonExtraStyle() {
            return this.buttonExtraStyle;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }

        public SkipInfo() {
        }
    }

    /* loaded from: classes11.dex */
    public class LabelInfo implements Serializable {

        @InterfaceC65349Pkn("background_color")
        public String backgroundColor;

        @InterfaceC65349Pkn("position")
        public int position;

        @InterfaceC65349Pkn("text")
        public String text;

        @InterfaceC65349Pkn("text_color")
        public String textColor;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public LabelInfo() {
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public String getEnterAppText() {
        return this.enterAppText;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public int getLogoColor() {
        return this.logoColor;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public int getShowLiveInfo() {
        return this.showLiveInfo;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public String getSplashButtonText() {
        return this.splashButtonText;
    }

    public int getSplashFeedType() {
        return this.splashFeedType;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public long getSwipeUpDelay() {
        return this.swipeUpDelay;
    }

    public int getSwipeUpType() {
        return this.swipeUpType;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setHotShowType(int i) {
        this.hotShowType = i;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setLogoColor(int i) {
        this.logoColor = i;
    }

    public void setPreloadType(int i) {
        this.preloadType = i;
    }

    public void setShowLiveInfo(int i) {
        this.showLiveInfo = i;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSplashButtonText(String str) {
        this.splashButtonText = str;
    }

    public void setSplashFeedType(int i) {
        this.splashFeedType = i;
    }

    public void setSplashShowTime(float f) {
        this.splashShowTime = f;
    }

    public void setStartTime(int i) {
        this.startTime = i;
    }
}
