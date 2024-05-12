package com.ss.android.ugc.profile.platform.business.navbar.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.NudgeGuideInfo;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class NavBarBellData extends BizBaseData {

    @InterfaceC65349Pkn("follow_status")
    public Integer followStatus;

    @InterfaceC65349Pkn("follow_toast_type")
    public Integer followToastType;

    @InterfaceC65349Pkn("live_push_notification_status")
    public Integer livePushNotificationStatus;

    @InterfaceC65349Pkn("nudge_guide_info")
    public NudgeGuideInfo nudgeGuideInfo;

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowToastType() {
        return this.followToastType;
    }

    public final Integer getLivePushNotificationStatus() {
        return this.livePushNotificationStatus;
    }

    public final NudgeGuideInfo getNudgeGuideInfo() {
        return this.nudgeGuideInfo;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setFollowToastType(Integer num) {
        this.followToastType = num;
    }

    public final void setLivePushNotificationStatus(Integer num) {
        this.livePushNotificationStatus = num;
    }

    public final void setNudgeGuideInfo(NudgeGuideInfo nudgeGuideInfo) {
        this.nudgeGuideInfo = nudgeGuideInfo;
    }
}
