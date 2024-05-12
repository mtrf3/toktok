package com.bytedance.android.live.broadcast.tns.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.TnsPiracyInfoRequest;
import webcast.api.game.TnsPiracyInfoResponse;

/* loaded from: classes.dex */
public interface TnsPiracyApi {
    @E8L("/webcast/game/basic/create_info/")
    AbstractC73672Svk<C28467BFf<CreateInfoResponse.ResponseData>> getPreviewGameCreateInfo();

    @E8M("/webcast/game/tns/piracy_info/")
    @EKC({"content-type: application/json"})
    AbstractC73672Svk<C28467BFf<TnsPiracyInfoResponse>> reportTnsPiracySignal(@InterfaceC195727mC TnsPiracyInfoRequest tnsPiracyInfoRequest);
}
