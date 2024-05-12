package com.bytedance.android.livesdk.impl.revenue.portal.request;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8L;
import X.EnumC29608Bjg;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import webcast.api.envelope.PortalListResponse;

/* loaded from: classes6.dex */
public interface PortalApi {
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/portal/list/")
    AbstractC73638SvC<C28467BFf<PortalListResponse.ResponseData>> getPortalList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2);
}
