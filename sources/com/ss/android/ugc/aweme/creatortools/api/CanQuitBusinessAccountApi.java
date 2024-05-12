package com.ss.android.ugc.aweme.creatortools.api;

import X.AbstractC73672Svk;
import X.C7C6;
import X.E4Q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes4.dex */
public interface CanQuitBusinessAccountApi {
    public static final C7C6 LIZ = C7C6.LIZ;

    @E4Q("/aweme/v1/ad/ba/quitcheck/")
    AbstractC73672Svk<BaseResponse> check();
}
