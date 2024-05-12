package com.ss.android.ugc.aweme.wiki;

import X.C59969NgD;
import X.C76L;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes11.dex */
public interface CheckAnchorModerationService {
    public static final C59969NgD LIZ = C59969NgD.LIZ;

    @E4Q("aweme/v1/anchor/add/check/")
    C76L<CheckAnchorModerationResultResponse> postCheckAnchorReviewResult(@InterfaceC64989Pez("type") int i, @InterfaceC64989Pez("url") String str, @InterfaceC64989Pez("keyword") String str2, @InterfaceC64989Pez("language") String str3, @InterfaceC64989Pez("subtype") String str4);
}
