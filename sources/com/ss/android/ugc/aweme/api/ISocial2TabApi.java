package com.ss.android.ugc.aweme.api;

import X.AbstractC73672Svk;
import X.E6L;
import X.E8M;
import X.InterfaceC27211Am7;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;

/* loaded from: classes7.dex */
public interface ISocial2TabApi {
    @E6L(3)
    @E8M("/tiktok/v1/friends/new_content/multi")
    AbstractC73672Svk<NewContentResponse> requestRedDot(@InterfaceC27211Am7 MultiRedDotRequest multiRedDotRequest);

    @E6L(3)
    @E8M("/tiktok/v1/friends/new_content/multi")
    AbstractC73672Svk<NewContentResponse> requestRedDotEnhanceQuery(@InterfaceC64989Pez("friends_tab_cold_start") int i, @InterfaceC27211Am7 MultiRedDotRequest multiRedDotRequest);
}
