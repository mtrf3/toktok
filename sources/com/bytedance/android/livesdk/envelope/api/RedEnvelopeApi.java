package com.bytedance.android.livesdk.envelope.api;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;

/* loaded from: classes6.dex */
public interface RedEnvelopeApi {
    @E8L("/webcast/envelope/list/")
    AbstractC73638SvC<C28467BFf<RedEnvelopeListResponse>> getRedEnvelopList(@InterfaceC64986Pew("room_id") String str);

    @E8M("/webcast/envelope/list/")
    AbstractC73638SvC<C28467BFf<RedEnvelopeListResponse>> getRedEnvelopListV2(@InterfaceC64986Pew("room_id") String str);
}
