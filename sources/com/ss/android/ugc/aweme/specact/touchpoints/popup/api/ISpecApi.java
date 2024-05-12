package com.ss.android.ugc.aweme.specact.touchpoints.popup.api;

import X.C10K;
import X.C247759nv;
import X.C76L;
import X.E8M;
import X.InterfaceC64986Pew;

/* loaded from: classes5.dex */
public interface ISpecApi {
    public static final C247759nv LIZ = C247759nv.LIZ;

    @E8M("/tiktok/incentive/v1/ttn_feature/task/done/post_invite_code")
    C76L<Object> postInviterCode(@InterfaceC64986Pew("inviter_code") String str);

    @E8M("/tiktok/touchpoint/platform/touchpoint/show/v1/")
    C10K<String> requestTouchPointShow(@InterfaceC64986Pew("touchpoint_id") int i, @InterfaceC64986Pew("launch_plan_id") int i2);

    @E8M("/tiktok/incentive/v1/inviter_code/update")
    C10K<String> updateInviterCode(@InterfaceC64986Pew("inviter_code") String str);
}
