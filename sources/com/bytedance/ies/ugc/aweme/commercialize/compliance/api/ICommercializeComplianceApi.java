package com.bytedance.ies.ugc.aweme.commercialize.compliance.api;

import X.E8L;
import X.E8M;
import X.GKJ;
import X.InterfaceC195787mI;
import X.InterfaceC37276Ek4;
import X.InterfaceC64987Pex;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.Advertiser;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.InfoModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model.InferenceCategory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AgeGateResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ClearHistory;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.CommercialComplianceSettings;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes8.dex */
public interface ICommercializeComplianceApi {
    public static final GKJ LIZ = GKJ.LIZ;

    @E8M("/tiktok/v1/csp/clear_activity")
    InterfaceC37276Ek4<ClearHistory> clearHistory();

    @InterfaceC195787mI
    @E8M("/tiktok/v1/csp/ata/info")
    InterfaceC37276Ek4<InfoModel> getATAInfo(@InterfaceC64987Pex("geo_name_id") String str, @InterfaceC64987Pex("country_code") String str2, @InterfaceC64987Pex("audience_tag_ids") String str3, @InterfaceC64987Pex("adv_id") String str4);

    @E8M("/tiktok/v1/csp/adv/list")
    InterfaceC37276Ek4<Advertiser> getAdvertiserList();

    @E8M("/tiktok/v1/csp/ads_compliance_settings")
    InterfaceC37276Ek4<CommercialComplianceSettings> getCommercialComplianceSettings();

    @E8L("/tiktok/v1/csp/subscription/subscription_status")
    InterfaceC37276Ek4<SubscriptionStatusResponse> getSubscriptionStatus();

    @E8L("/aweme/v1/pers/ad/interests/")
    InterfaceC37276Ek4<InferenceCategory> getUserLabelList();

    @InterfaceC195787mI
    @E8M("/tiktok/v1/csp/subscription/exp_register")
    InterfaceC37276Ek4<AgeGateResponse> registerUserForExp(@InterfaceC64987Pex("sku_id") String str);

    @InterfaceC195787mI
    @E8M("/tiktok/v1/csp/adv/optout")
    InterfaceC37276Ek4<BaseResponse> setAdvertiser(@InterfaceC64987Pex("adv_id") String str, @InterfaceC64987Pex("enable") String str2);

    @InterfaceC195787mI
    @E8M("/tiktok/v1/csp/subscription/ad_choice")
    InterfaceC37276Ek4<BaseResponse> setSubscriptionUserChoice(@InterfaceC64987Pex("ad_choice") Integer num, @InterfaceC64987Pex("choice_source") Integer num2, @InterfaceC64987Pex("free_trial_pop_up_seen") Boolean bool, @InterfaceC64987Pex("subscription_cancellation_pop_up_seen") Boolean bool2, @InterfaceC64987Pex("sku_id") String str);

    @InterfaceC195787mI
    @E8M("/aweme/v1/cmpl/set/settings/")
    InterfaceC37276Ek4<BaseResponse> setUserLabel(@InterfaceC64987Pex("settings") String str);
}
