package com.ss.android.ugc.gamora.recorder.navi.service;

import X.AbstractC73672Svk;
import X.C36393EQb;
import X.E8L;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCandidatesResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviListResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolveEffectsResponse;

/* loaded from: classes7.dex */
public interface NaviVideoCreationService {
    public static final C36393EQb LIZ = C36393EQb.LIZ;

    @E8L("/tiktok/v1/navi/candidates/")
    AbstractC73672Svk<ProfileNaviCandidatesResponse> getCandidateList(@InterfaceC64989Pez("transparent_candidates_required") boolean z, @InterfaceC64989Pez("scenario") int i, @InterfaceC64989Pez("panel") String str);

    @E8L("/tiktok/v1/navi/list/")
    AbstractC73672Svk<ProfileNaviListResponse> getNaviList(@InterfaceC64989Pez("offset") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("panel") String str);

    @E8L("/tiktok/v1/navi/resolve/effects/")
    AbstractC73672Svk<ResolveEffectsResponse> resolveEffects(@InterfaceC64989Pez("panel") String str, @InterfaceC64989Pez("paths") String str2);
}
