package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.AdvancedFeatureBaseData;

/* loaded from: classes5.dex */
public final class GetQuoteData extends AdvancedFeatureBaseData {

    @InterfaceC65349Pkn("leads_gen")
    public LeadsGenModel leadsGen;

    public final LeadsGenModel getLeadsGen() {
        return this.leadsGen;
    }

    public final void setLeadsGen(LeadsGenModel leadsGenModel) {
        this.leadsGen = leadsGenModel;
    }
}
