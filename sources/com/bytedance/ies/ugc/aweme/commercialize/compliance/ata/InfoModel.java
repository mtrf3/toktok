package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class InfoModel extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("country")
    public final String countryText;

    @InterfaceC65349Pkn("funding_party")
    public final FundingParty fundingParty;

    @InterfaceC65349Pkn("geo")
    public final String geoText;

    @InterfaceC65349Pkn("show_customer_audience")
    public final Boolean showCustomerAudience;

    @InterfaceC65349Pkn("show_lookalike_audience")
    public final Boolean showLookalikeAudience;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final String getCountryText() {
        return this.countryText;
    }

    public final FundingParty getFundingParty() {
        return this.fundingParty;
    }

    public final String getGeoText() {
        return this.geoText;
    }

    public final Boolean getShowCustomerAudience() {
        return this.showCustomerAudience;
    }

    public final Boolean getShowLookalikeAudience() {
        return this.showLookalikeAudience;
    }

    public InfoModel(String str, String str2, Boolean bool, Boolean bool2, FundingParty fundingParty) {
        this.geoText = str;
        this.countryText = str2;
        this.showLookalikeAudience = bool;
        this.showCustomerAudience = bool2;
        this.fundingParty = fundingParty;
    }

    public /* synthetic */ InfoModel(String str, String str2, Boolean bool, Boolean bool2, FundingParty fundingParty, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? Boolean.FALSE : bool2, (i & 16) == 0 ? fundingParty : null);
    }
}
