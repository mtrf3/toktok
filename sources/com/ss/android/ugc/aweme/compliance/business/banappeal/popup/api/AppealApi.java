package com.ss.android.ugc.aweme.compliance.business.banappeal.popup.api;

import X.AbstractC73672Svk;
import X.C54931Lh9;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.compliance.api.model.AccountBannedDetail;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse;

/* loaded from: classes10.dex */
public interface AppealApi {
    public static final C54931Lh9 LIZ = C54931Lh9.LIZ;

    @E4Q("/aweme/v1/data/user/info/request/list/")
    AbstractC73672Svk<String> apiUserInfo(@InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("cursor") int i2);

    @E4Q("/aweme/v2/appeal/status/")
    AbstractC73672Svk<AppealStatusResponse> getUserAppealStatus(@InterfaceC64989Pez("object_type") String str, @InterfaceC64989Pez("object_id") String str2, @InterfaceC64989Pez("source") int i);

    @E4Q("/tiktok/account/ban/detail/get/v1/")
    AbstractC73672Svk<AccountBannedDetail> syncAccountBannedDetails();
}
