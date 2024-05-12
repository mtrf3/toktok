package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.AdvancedFeatureBaseData;

/* loaded from: classes5.dex */
public final class SupportingData extends AdvancedFeatureBaseData {

    @InterfaceC65349Pkn("supporting_ngo")
    public ProfileNgoStruct supportedNonprofit;

    public final ProfileNgoStruct getSupportedNonprofit() {
        return this.supportedNonprofit;
    }

    public final void setSupportedNonprofit(ProfileNgoStruct profileNgoStruct) {
        this.supportedNonprofit = profileNgoStruct;
    }
}
