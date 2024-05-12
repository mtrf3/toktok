package com.ss.android.ugc.aweme.money.growth;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GoogleCampaignInfo extends F9E {

    @InterfaceC65349Pkn("campaign")
    public final String campaign;

    @InterfaceC65349Pkn("campaign_id")
    public final String campaignId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.campaignId, this.campaign};
    }

    public GoogleCampaignInfo(String campaignId, String campaign) {
        o.LJIIIZ(campaignId, "campaignId");
        o.LJIIIZ(campaign, "campaign");
        this.campaignId = campaignId;
        this.campaign = campaign;
    }
}
