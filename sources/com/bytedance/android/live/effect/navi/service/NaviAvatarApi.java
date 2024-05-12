package com.bytedance.android.live.effect.navi.service;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.effect.navi.model.ProfileNaviCandidatesResponse;
import com.bytedance.android.live.effect.navi.model.ProfileNaviListResponse;

/* loaded from: classes.dex */
public interface NaviAvatarApi {
    @E8L("/tiktok/v1/navi/candidates/")
    AbstractC73672Svk<ProfileNaviCandidatesResponse> getCandidateList(@InterfaceC64986Pew("transparent_candidates_required") boolean z, @InterfaceC64986Pew("scenario") int i);

    @E8L("/tiktok/v1/navi/list/")
    AbstractC73672Svk<ProfileNaviListResponse> getNaviList(@InterfaceC64986Pew("offset") int i, @InterfaceC64986Pew("count") int i2);
}
