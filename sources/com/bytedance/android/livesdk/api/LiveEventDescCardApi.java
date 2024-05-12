package com.bytedance.android.livesdk.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface LiveEventDescCardApi {
    @E8L("https://api.tiktokv.com/tiktok/event/list/v1")
    AbstractC73672Svk<LiveEventResponse> getAnchorSelectionResponse(@InterfaceC64986Pew("host_user_id") String str, @InterfaceC64986Pew("query_type") int i, @InterfaceC64986Pew("offset") int i2, @InterfaceC64986Pew("count") int i3, @InterfaceC64986Pew("room_start_time") int i4, @InterfaceC64986Pew("room_id") String str2);
}
