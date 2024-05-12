package com.ss.android.ugc.aweme.badge;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditProfileBadgeResponse extends BaseResponse {

    @InterfaceC65349Pkn("campaign_detail")
    public final EditProfileBadgeCampaignModel campaignDetail;

    @InterfaceC65349Pkn("profile_badges")
    public final List<EditProfileBadgeModel> profileBadges;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileBadgeResponse)) {
            return false;
        }
        EditProfileBadgeResponse editProfileBadgeResponse = (EditProfileBadgeResponse) obj;
        return o.LJ(this.campaignDetail, editProfileBadgeResponse.campaignDetail) && o.LJ(this.profileBadges, editProfileBadgeResponse.profileBadges);
    }

    public final int hashCode() {
        EditProfileBadgeCampaignModel editProfileBadgeCampaignModel = this.campaignDetail;
        int hashCode = (editProfileBadgeCampaignModel == null ? 0 : editProfileBadgeCampaignModel.hashCode()) * 31;
        List<EditProfileBadgeModel> list = this.profileBadges;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditProfileBadgeResponse(campaignDetail=");
        LIZ.append(this.campaignDetail);
        LIZ.append(", profileBadges=");
        return C1NE.LIZIZ(LIZ, this.profileBadges, ')', LIZ);
    }

    public EditProfileBadgeResponse(EditProfileBadgeCampaignModel editProfileBadgeCampaignModel, List<EditProfileBadgeModel> list) {
        this.campaignDetail = editProfileBadgeCampaignModel;
        this.profileBadges = list;
    }
}
