package com.ss.android.ugc.aweme.notification.followrequest.api;

import X.AbstractC36908Ee8;
import X.C46104I7o;
import X.C73320Sq4;
import X.C73561Stx;
import X.C76L;
import X.E4Q;
import X.E4T;
import X.FGR;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.M57;
import Y.ACallableS7S1000000_9;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import java.util.concurrent.ExecutionException;

/* loaded from: classes10.dex */
public final class FollowRequestApiManager {
    public static final FollowRequestApi LIZ = (FollowRequestApi) C46104I7o.LJIIZILJ(M57.LIZ, FollowRequestApi.class);

    /* loaded from: classes10.dex */
    public interface FollowRequestApi {
        @InterfaceC195787mI
        @E4T("/aweme/v1/commit/follow/request/approve/")
        C76L<ApproveResponse> approveRequest(@InterfaceC64987Pex("from_user_id") String str, @InterfaceC64987Pex("approve_from") int i);

        @E4Q("/aweme/v1/user/following/request/list/")
        C76L<FollowRequestResponse> fetchFollowRequestList(@InterfaceC64989Pez("max_time") long j, @InterfaceC64989Pez("min_time") long j2, @InterfaceC64989Pez("count") int i);

        @InterfaceC195787mI
        @E4T("/aweme/v1/commit/follow/request/reject/")
        C76L<RejectResponse> rejectRequest(@InterfaceC64987Pex("from_user_id") String str);
    }

    public static C73561Stx LIZIZ() {
        C76L<FollowRequestResponse> fetchFollowRequestList = LIZ.fetchFollowRequestList(System.currentTimeMillis() / 1000, 1L, 0);
        C73320Sq4.LIZ(fetchFollowRequestList, "future is null");
        return new C73561Stx(fetchFollowRequestList);
    }

    public static void LIZJ(WeakHandler weakHandler, String str) {
        FGR.LIZIZ().LIZ(weakHandler, new ACallableS7S1000000_9(str, 0), 2);
    }

    public static FollowRequestResponse LIZ(int i, long j, long j2) {
        try {
            return LIZ.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e) {
            throw AbstractC36908Ee8.getCompatibleException(e);
        }
    }
}
