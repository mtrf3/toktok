package com.ss.android.ugc.aweme.profile.api;

import X.AbstractC73672Svk;
import X.C244129i4;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public interface ProfileAdvancedFeaturesOrderUpdateAPI {
    public static final C244129i4 LIZ = C244129i4.LIZ;

    @E8M("/tiktok/user/setting/advance_feature/order/update/v1")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse> updateAdvancedFeaturesOrder(@InterfaceC64985Pev("advance_feature_item_order") String str);
}
