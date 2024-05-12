package com.ss.android.ugc.aweme.api;

import X.C10K;
import X.E4Q;
import X.EDK;
import X.InterfaceC64989Pez;

/* loaded from: classes8.dex */
public interface AnchorAutoSelectionService {
    public static final EDK LIZ = EDK.LIZ;

    @E4Q("/tiktok/v1/anchor/auto/selection/")
    C10K<AnchorAutoSelectionResponse> getAnchorAutoSelectionResponse(@InterfaceC64989Pez("open_platform_client_key") String str, @InterfaceC64989Pez("open_platform_extra") String str2, @InterfaceC64989Pez("anchor_source_type") String str3, @InterfaceC64989Pez("add_from") Integer num, @InterfaceC64989Pez("open_platform_share_id") String str4);
}
