package com.ss.android.ugc.aweme.compliance.protection.common.api;

import X.AbstractC73672Svk;
import X.C53829LAr;
import X.E4Q;
import com.ss.android.ugc.aweme.compliance.protection.common.model.ProtectionApiResponse;

/* loaded from: classes10.dex */
public interface ProtectionApi {
    public static final C53829LAr LIZ = C53829LAr.LIZ;

    @E4Q("/tiktok/v1/compliance/guadig/settings/")
    AbstractC73672Svk<ProtectionApiResponse> getProtectionSettings();
}
