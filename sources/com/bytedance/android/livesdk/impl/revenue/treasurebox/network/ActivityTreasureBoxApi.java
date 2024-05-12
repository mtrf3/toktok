package com.bytedance.android.livesdk.impl.revenue.treasurebox.network;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import webcast.api.envelope.RevenuePermissionResponse;

/* loaded from: classes6.dex */
public interface ActivityTreasureBoxApi {
    @E8L("/webcast/envelope/list/")
    AbstractC73638SvC<C28467BFf<RedEnvelopeListResponse>> getRedEnvelopList(@InterfaceC64986Pew("room_id") String str);

    @E8M("/webcast/envelope/list/")
    AbstractC73638SvC<C28467BFf<RedEnvelopeListResponse>> getRedEnvelopListV2(@InterfaceC64986Pew("room_id") String str);

    @E8M("/webcast/revenue/permission/")
    AbstractC73638SvC<C28467BFf<RevenuePermissionResponse.ResponseData>> getRedEnvelopePermission(@InterfaceC64986Pew("need_bizs") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("sec_anchor_id") String str);
}
