package com.bytedance.android.livesdk.hashtag;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.livesdk.model.Hashtag;
import webcast.api.game.SearchTagResponse;

/* loaded from: classes6.dex */
public interface HashtagApi {
    @InterfaceC65131PhH(EnumC29608Bjg.BROADCAST)
    @E8L("/webcast/room/hashtag/list/")
    AbstractC73672Svk<C28467BFf<HashtagResponse>> fetchHashtagList();

    @E8M("/webcast/game/tag/search/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<SearchTagResponse.ResponseData>> searchGameTag(@InterfaceC64985Pev("user_id") String str, @InterfaceC64985Pev("search_id") String str2, @InterfaceC64985Pev("query_string") String str3, @InterfaceC64985Pev("lan") String str4, @InterfaceC64985Pev("country") String str5, @InterfaceC64985Pev("need_detail") Boolean bool, @InterfaceC64985Pev("offset") Integer num, @InterfaceC64985Pev("limit") Integer num2);

    @E8M("/webcast/game/tag/record_search/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> sendTagRecord(@InterfaceC64985Pev("user_id") String str, @InterfaceC64985Pev("room_id") String str2, @InterfaceC64985Pev("search_text") String str3, @InterfaceC64985Pev("game_tag_id") Long l);

    @E8M("/webcast/room/hashtag/set/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Hashtag>> setHashtag(@InterfaceC64985Pev("room_id") Long l, @InterfaceC64985Pev("anchor_id") Long l2, @InterfaceC64985Pev("hashtag_id") Long l3, @InterfaceC64985Pev("game_tag_id") Long l4);
}
