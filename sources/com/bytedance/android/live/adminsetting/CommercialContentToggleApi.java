package com.bytedance.android.live.adminsetting;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.chatroom.model.QueryCommercialContentToggleResponse;

/* loaded from: classes.dex */
public interface CommercialContentToggleApi {
    @E8L("/webcast/room/query_commercial_content_toggle/")
    AbstractC73672Svk<C28467BFf<QueryCommercialContentToggleResponse.Data>> queryCommercialContentToggle(@InterfaceC64986Pew("room_id") long j);
}
