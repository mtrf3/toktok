package com.ss.android.ugc.aweme.relation.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LinkPrivacyPopupStatusResponse extends BaseResponse {

    @InterfaceC65349Pkn("is_displayed_before")
    public boolean isDisplayedBefore;

    @InterfaceC65349Pkn("link_sug_switch_status")
    public Boolean linkSugSwitchStatus;

    @InterfaceC65349Pkn("should_display")
    public boolean shouldDisplay;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkPrivacyPopupStatusResponse)) {
            return false;
        }
        LinkPrivacyPopupStatusResponse linkPrivacyPopupStatusResponse = (LinkPrivacyPopupStatusResponse) obj;
        return this.shouldDisplay == linkPrivacyPopupStatusResponse.shouldDisplay && o.LJ(this.linkSugSwitchStatus, linkPrivacyPopupStatusResponse.linkSugSwitchStatus) && this.isDisplayedBefore == linkPrivacyPopupStatusResponse.isDisplayedBefore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.shouldDisplay;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.linkSugSwitchStatus;
        return ((i + (bool == null ? 0 : bool.hashCode())) * 31) + (this.isDisplayedBefore ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkPrivacyPopupStatusResponse(shouldDisplay=");
        LIZ.append(this.shouldDisplay);
        LIZ.append(", linkSugSwitchStatus=");
        LIZ.append(this.linkSugSwitchStatus);
        LIZ.append(", isDisplayedBefore=");
        return C48339Iy7.LIZJ(LIZ, this.isDisplayedBefore, ')', LIZ);
    }

    public LinkPrivacyPopupStatusResponse(boolean z, Boolean bool, boolean z2) {
        this.shouldDisplay = z;
        this.linkSugSwitchStatus = bool;
        this.isDisplayedBefore = z2;
    }
}
