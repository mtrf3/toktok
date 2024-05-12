package com.ss.android.ugc.aweme.offlinemode.api;

import X.C116964iS;
import X.C221108m2;
import X.C62822Ol8;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.RQ2;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes2.dex */
public final class OfflineModeApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C116964iS.LJLIL);

    /* loaded from: classes2.dex */
    public interface OfflineModeApiDefinition {
        @E8L("/tiktok/feed/offline/v2")
        InterfaceC37276Ek4<ComposePbAndJson<RQ2, FeedItemList>> offlineFeedList(@InterfaceC64986Pew("pull_type") int i, @InterfaceC64986Pew("count") int i2);

        @E8L("/tiktok/inspect/item/v1")
        InterfaceC37276Ek4<InspectItemResponse> verifyAids(@InterfaceC64986Pew("item_ids") String str);
    }
}
