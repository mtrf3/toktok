package com.ss.android.ugc.aweme.live.notification.repository;

import X.AbstractC73672Svk;
import X.C40084FoG;
import X.E4Q;
import X.E4T;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64989Pez;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* loaded from: classes5.dex */
public final class NotificationNudgeApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes5.dex */
    public interface RealApi {
        @E4Q("/webcast/nudge/get_nudge_info")
        AbstractC73672Svk<NudgeInfoResponse> getNudgeInfo(@InterfaceC64989Pez("anchor_id") String str);

        @InterfaceC195757mF
        @E4T("/webcast/nudge/nudge_anchor")
        AbstractC73672Svk<BaseResponse> nudgeAnchor(@InterfaceC64985Pev("anchor_id") String str);
    }

    public static RealApi LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LiveOuterService.LJJJLL().LJJIJIL().getClass();
        LIZ2.append(Live.getLiveDomain());
        return (RealApi) C40084FoG.LIZIZ(X1D.LIZIZ(LIZ2)).LIZ.LIZ(RealApi.class);
    }
}
