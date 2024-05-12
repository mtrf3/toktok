package com.ss.android.ugc.aweme.nows.feed.common;

import X.AbstractC73638SvC;
import X.C7NP;
import X.E8M;
import X.InterfaceC195727mC;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface MarkReadApi {
    public static final C7NP LIZ = C7NP.LIZ;

    @E8M("/tiktok/v1/now/mark_read")
    AbstractC73638SvC<BaseResponse> markRead(@InterfaceC195727mC MarkReadRequestPayload markReadRequestPayload);
}
