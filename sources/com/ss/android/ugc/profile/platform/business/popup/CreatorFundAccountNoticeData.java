package com.ss.android.ugc.profile.platform.business.popup;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.CreatorFundBannerSetting;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* loaded from: classes5.dex */
public final class CreatorFundAccountNoticeData extends BizBaseData {

    @InterfaceC65349Pkn("creator_fund_info_struct")
    public CreatorFundBannerSetting creatorFundBannerSetting;

    public final CreatorFundBannerSetting getCreatorFundBannerSetting() {
        return this.creatorFundBannerSetting;
    }

    public final void setCreatorFundBannerSetting(CreatorFundBannerSetting creatorFundBannerSetting) {
        this.creatorFundBannerSetting = creatorFundBannerSetting;
    }
}
