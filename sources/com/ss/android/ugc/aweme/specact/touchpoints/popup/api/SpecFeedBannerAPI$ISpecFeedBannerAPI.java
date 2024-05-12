package com.ss.android.ugc.aweme.specact.touchpoints.popup.api;

import X.C10K;
import X.E8M;
import X.InterfaceC195747mE;
import X.InterfaceC64986Pew;

/* loaded from: classes5.dex */
public interface SpecFeedBannerAPI$ISpecFeedBannerAPI {
    @E8M
    C10K<String> confirmAgeGate(@InterfaceC195747mE String str);

    @E8M("/tiktok/incentive/v1/notification/action")
    C10K<String> requestOnNotificationAction(@InterfaceC64986Pew("notification_id") String str, @InterfaceC64986Pew("notification_action_type") int i, @InterfaceC64986Pew("notification_classification") String str2, @InterfaceC64986Pew("notification_material_id") String str3, @InterfaceC64986Pew("notification_multi_show_count") int i2);
}
