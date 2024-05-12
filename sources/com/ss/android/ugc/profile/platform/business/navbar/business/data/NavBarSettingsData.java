package com.ss.android.ugc.profile.platform.business.navbar.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class NavBarSettingsData extends BizBaseData {

    @InterfaceC65349Pkn("is_potential_ba")
    public Boolean isPotentialBA;

    @InterfaceC65349Pkn("pro_account_update_notification_status")
    public Integer proAccountUpdateNotificationStatus;

    public final Integer getProAccountUpdateNotificationStatus() {
        return this.proAccountUpdateNotificationStatus;
    }

    public final Boolean isPotentialBA() {
        return this.isPotentialBA;
    }

    public final void setPotentialBA(Boolean bool) {
        this.isPotentialBA = bool;
    }

    public final void setProAccountUpdateNotificationStatus(Integer num) {
        this.proAccountUpdateNotificationStatus = num;
    }
}
