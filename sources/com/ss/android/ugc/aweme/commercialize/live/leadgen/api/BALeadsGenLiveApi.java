package com.ss.android.ugc.aweme.commercialize.live.leadgen.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenCountResponse;

/* loaded from: classes11.dex */
public interface BALeadsGenLiveApi {
    @E8M("/aweme/v1/ad/ba/leadsgen/live/clear/")
    AbstractC73638SvC<BaseResponse> clearLeadsGen();

    @E8L("/aweme/v1/ad/ba/leadsgen/live/count/")
    AbstractC73672Svk<BALeadsGenCountResponse> getLeadsGenAddCount(@InterfaceC64986Pew("room_id") long j);
}
