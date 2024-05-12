package com.bytedance.android.livesdk.chatroom.utils;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LastLiveActionInfo {

    @InterfaceC65349Pkn("author_id")
    public Long authorId;

    @InterfaceC65349Pkn("current_product_id")
    public Long currentProductId;

    @InterfaceC65349Pkn("duration")
    public Long duration;

    @InterfaceC65349Pkn("entrance")
    public String entrance;

    @InterfaceC65349Pkn("is_ecom")
    public Long isEcom;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    /* JADX WARN: Multi-variable type inference failed */
    public LastLiveActionInfo() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public LastLiveActionInfo(long j, String entrance, Long l, Long l2, Long l3, Long l4) {
        o.LJIIIZ(entrance, "entrance");
        this.roomId = j;
        this.entrance = entrance;
        this.authorId = l;
        this.currentProductId = l2;
        this.isEcom = l3;
        this.duration = l4;
    }

    public /* synthetic */ LastLiveActionInfo(long j, String str, Long l, Long l2, Long l3, Long l4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) == 0 ? l4 : null);
    }
}
