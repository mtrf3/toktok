package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class ShopLiveInfo {

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("stream_data")
    public final String streamData;

    @InterfaceC65349Pkn("upcoming_start_time")
    public final long upcomingStartTime;

    public ShopLiveInfo(String str, long j, String str2) {
        this.roomId = str;
        this.upcomingStartTime = j;
        this.streamData = str2;
    }

    public /* synthetic */ ShopLiveInfo(String str, long j, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2);
    }
}
