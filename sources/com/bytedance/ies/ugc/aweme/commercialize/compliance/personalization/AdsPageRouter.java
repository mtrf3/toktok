package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C41290GIk;
import X.C59895Nf1;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import yq4.a;

/* loaded from: classes8.dex */
public final class AdsPageRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String str2;
        String str3;
        Integer subscriptionMode;
        Integer subscriptionStatus;
        if (context == null) {
            return Boolean.FALSE;
        }
        AdFreeSubscription adFreeSubscription = null;
        if (bundle != null) {
            str2 = bundle.getString("enter_from", "privacy_and_safety_settings");
        } else {
            str2 = null;
        }
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            adFreeSubscription = LIZIZ.getSubscription();
        }
        if (!a.LJIIJ().LJJI() || adFreeSubscription == null || (subscriptionMode = adFreeSubscription.getSubscriptionMode()) == null || subscriptionMode.intValue() != 1 || (subscriptionStatus = adFreeSubscription.getSubscriptionStatus()) == null || subscriptionStatus.intValue() != 2) {
            str3 = "//commercialize/compliance/personalization/ads_page";
        } else {
            str3 = "//commercialize/compliance/subscription/subscription_ads_page";
        }
        C59895Nf1.LIZLLL(context, str3, "enter_from", str2);
        return Boolean.TRUE;
    }
}
