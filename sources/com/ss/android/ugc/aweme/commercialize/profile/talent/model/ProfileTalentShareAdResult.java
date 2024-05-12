package com.ss.android.ugc.aweme.commercialize.profile.talent.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileTalentShareAdResult extends BaseResponse {

    @InterfaceC65349Pkn("ad_gap")
    public final int adGap;

    @InterfaceC65349Pkn("profile_ads")
    public final List<ProfileAdData> profileAds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileTalentShareAdResult) {
            return C78966Uyw.LJIIIZ(((ProfileTalentShareAdResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.adGap), this.profileAds};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("ProfileTalentShareAdResult:%s,%s", getObjects());
    }

    public ProfileTalentShareAdResult(int i, List<ProfileAdData> profileAds) {
        o.LJIIIZ(profileAds, "profileAds");
        this.adGap = i;
        this.profileAds = profileAds;
    }
}
