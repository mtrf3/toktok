package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class UgAwemeActivitySetting {

    @InterfaceC65349Pkn("activity_end_time")
    public Long activityEndTime;

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("activity_start_time")
    public Long activityStartTime;

    @InterfaceC65349Pkn("activity_tasks")
    public List<UgActivityTasks> activityTasks = new ArrayList();

    @InterfaceC65349Pkn("channel_popup")
    public UgChannelPopup channelPopup;

    @InterfaceC65349Pkn("is_new_user")
    public Boolean isNewUser;

    @InterfaceC65349Pkn("login_banner")
    public UgLoginBanner loginBanner;

    @InterfaceC65349Pkn("new_feed_pendant")
    public UgNewFeedPendant newFeedPendant;

    @InterfaceC65349Pkn("overall_switch")
    public Boolean overallSwitch;

    @InterfaceC65349Pkn("pendant_version")
    public Integer pendantVersion;

    @InterfaceC65349Pkn("profile_activity_button")
    public UgProfileActivityButton profileActivityButton;

    @InterfaceC65349Pkn("profile_activity_icon")
    public UgProfileActivityIcon profileActivityIcon;

    @InterfaceC65349Pkn("profile_tab_guide")
    public UgProfileTabGuide profileTabGuide;

    @InterfaceC65349Pkn("shortcut_info")
    public UgShortcutInfo shortcutInfo;

    @InterfaceC65349Pkn("feed_bottom_notice_bar")
    public UgFeedBottomNoticeBar ugFeedBottomNoticeBar;

    @InterfaceC65349Pkn("touchpoint_upload_switch")
    public boolean uploadSwitch;

    @InterfaceC65349Pkn("use_touchpoint_widget")
    public boolean useTouchPointWidget;

    @InterfaceC65349Pkn("use_touch_points")
    public boolean useTouchPoints;

    public Long getActivityEndTime() {
        Long l = this.activityEndTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public String getActivityId() {
        String str = this.activityId;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Long getActivityStartTime() {
        Long l = this.activityStartTime;
        if (l != null) {
            return l;
        }
        throw new C158056If();
    }

    public UgChannelPopup getChannelPopup() {
        UgChannelPopup ugChannelPopup = this.channelPopup;
        if (ugChannelPopup != null) {
            return ugChannelPopup;
        }
        throw new C158056If();
    }

    public Boolean getIsNewUser() {
        Boolean bool = this.isNewUser;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public UgLoginBanner getLoginBanner() {
        UgLoginBanner ugLoginBanner = this.loginBanner;
        if (ugLoginBanner != null) {
            return ugLoginBanner;
        }
        throw new C158056If();
    }

    public UgNewFeedPendant getNewFeedPendant() {
        UgNewFeedPendant ugNewFeedPendant = this.newFeedPendant;
        if (ugNewFeedPendant != null) {
            return ugNewFeedPendant;
        }
        throw new C158056If();
    }

    public Boolean getOverallSwitch() {
        Boolean bool = this.overallSwitch;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getPendantVersion() {
        Integer num = this.pendantVersion;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public UgProfileActivityButton getProfileActivityButton() {
        UgProfileActivityButton ugProfileActivityButton = this.profileActivityButton;
        if (ugProfileActivityButton != null) {
            return ugProfileActivityButton;
        }
        throw new C158056If();
    }

    public UgProfileActivityIcon getProfileActivityIcon() {
        UgProfileActivityIcon ugProfileActivityIcon = this.profileActivityIcon;
        if (ugProfileActivityIcon != null) {
            return ugProfileActivityIcon;
        }
        throw new C158056If();
    }

    public UgProfileTabGuide getProfileTabGuide() {
        UgProfileTabGuide ugProfileTabGuide = this.profileTabGuide;
        if (ugProfileTabGuide != null) {
            return ugProfileTabGuide;
        }
        throw new C158056If();
    }

    public UgShortcutInfo getShortcutInfo() {
        UgShortcutInfo ugShortcutInfo = this.shortcutInfo;
        if (ugShortcutInfo != null) {
            return ugShortcutInfo;
        }
        throw new C158056If();
    }

    public List<UgActivityTasks> getActivityTasks() {
        return this.activityTasks;
    }

    public UgFeedBottomNoticeBar getUgFeedBottomNoticeBar() {
        return this.ugFeedBottomNoticeBar;
    }

    public boolean isUploadSwitch() {
        return this.uploadSwitch;
    }

    public boolean isUseTouchPointWidget() {
        return this.useTouchPointWidget;
    }

    public boolean isUseTouchPoints() {
        return this.useTouchPoints;
    }

    public void setUgFeedBottomNoticeBar(UgFeedBottomNoticeBar ugFeedBottomNoticeBar) {
        this.ugFeedBottomNoticeBar = ugFeedBottomNoticeBar;
    }

    public void setUploadSwitch(boolean z) {
        this.uploadSwitch = z;
    }

    public void setUseTouchPointWidget(boolean z) {
        this.useTouchPointWidget = z;
    }

    public void setUseTouchPoints(boolean z) {
        this.useTouchPoints = z;
    }
}
