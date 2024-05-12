package com.bytedance.android.livesdk.feed.tab.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.feed.ItemTabExtra;
import com.bytedance.android.livesdk.model.ItemTab;

/* loaded from: classes6.dex */
public interface FeedTabApi {
    @E8L("/webcast/tab/")
    AbstractC73672Svk<BaseListResponse<ItemTab, ItemTabExtra>> queryTab(@InterfaceC64986Pew("live_entrance") int i);
}
