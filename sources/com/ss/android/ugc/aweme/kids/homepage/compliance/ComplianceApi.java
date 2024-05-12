package com.ss.android.ugc.aweme.kids.homepage.compliance;

import X.AbstractC73672Svk;
import X.E8L;
import X.J8Q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.kids.common.response.KidsSettings;

/* loaded from: classes9.dex */
public interface ComplianceApi {
    public static final J8Q LIZ = J8Q.LIZ;

    @E8L("/tiktok/v1/kids/check/in/")
    AbstractC73672Svk<BaseResponse> checkIn();

    @E8L("/tiktok/v1/kids/settings/")
    AbstractC73672Svk<KidsSettings> getKidsSettings();
}
