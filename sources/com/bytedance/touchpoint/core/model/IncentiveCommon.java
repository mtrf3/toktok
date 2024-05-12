package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class IncentiveCommon extends C95U {

    @InterfaceC65349Pkn("age_gate_popup_view")
    public final AgeGatePopup ageGatePopup;

    @InterfaceC65349Pkn("notification_name")
    public final String notificationName;

    @InterfaceC65349Pkn("now_need_retry")
    public final Boolean nowFeedRetry;

    @InterfaceC65349Pkn("now_inviter_code")
    public final String nowInviterCode;

    @InterfaceC65349Pkn("share_panel_info")
    public final SharePanelData sharePanelData;

    /* JADX WARN: Multi-variable type inference failed */
    public IncentiveCommon() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final Object[] LIZIZ() {
        return new Object[]{this.nowFeedRetry, this.notificationName, this.nowInviterCode, this.ageGatePopup, this.sharePanelData};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IncentiveCommon) {
            return C78966Uyw.LJIIIZ(((IncentiveCommon) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("IncentiveCommon:%s,%s,%s,%s,%s", LIZIZ());
    }

    public IncentiveCommon(Boolean bool, String str, String str2, AgeGatePopup ageGatePopup, SharePanelData sharePanelData) {
        this.nowFeedRetry = bool;
        this.notificationName = str;
        this.nowInviterCode = str2;
        this.ageGatePopup = ageGatePopup;
        this.sharePanelData = sharePanelData;
    }

    public /* synthetic */ IncentiveCommon(Boolean bool, String str, String str2, AgeGatePopup ageGatePopup, SharePanelData sharePanelData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : ageGatePopup, (i & 16) == 0 ? sharePanelData : null);
    }
}
