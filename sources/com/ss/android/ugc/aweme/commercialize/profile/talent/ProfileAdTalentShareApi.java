package com.ss.android.ugc.aweme.commercialize.profile.talent;

import X.C55705Ltd;
import X.C76L;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileTalentShareAdResult;

/* loaded from: classes10.dex */
public interface ProfileAdTalentShareApi {
    public static final C55705Ltd LIZ = C55705Ltd.LIZ;

    @E8L("/aweme/v1/commerce/profile/ad/")
    C76L<ProfileTalentShareAdResult> getTalentProfileAd(@InterfaceC64986Pew("sec_uid") String str, @InterfaceC64986Pew("item_ids") String str2, @InterfaceC64986Pew("index") int i, @InterfaceC64986Pew("source") int i2, @InterfaceC64986Pew("last_ad_show_gap") Integer num);
}
