package com.ss.android.ugc.profile.platform.business.header.business.cta.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.List;

/* loaded from: classes5.dex */
public final class SocialInteractionData extends BizBaseData {

    @InterfaceC65349Pkn("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;

    @InterfaceC65349Pkn("show_messaging_entrance_on_profile")
    public boolean isShowMessageEntrance;

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final boolean isShowMessageEntrance() {
        return this.isShowMessageEntrance;
    }

    public final void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public final void setShowMessageEntrance(boolean z) {
        this.isShowMessageEntrance = z;
    }
}
