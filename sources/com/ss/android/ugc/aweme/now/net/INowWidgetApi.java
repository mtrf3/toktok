package com.ss.android.ugc.aweme.now.net;

import X.AbstractC73638SvC;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.ss.android.ugc.aweme.now.model.NowBatchReactionResponse;
import com.ss.android.ugc.aweme.now.model.NowWidgetFeedResponse;

/* loaded from: classes2.dex */
public interface INowWidgetApi {
    @E8M("/tiktok/video/batch/like/list/v1")
    @InterfaceC195757mF
    AbstractC73638SvC<NowBatchReactionResponse> fetchBatchReactionList(@InterfaceC64985Pev("aweme_ids") String str, @InterfaceC64985Pev("count") int i, @InterfaceC64985Pev("filter_default_avatar") boolean z, @InterfaceC64985Pev("order") int i2, @InterfaceC64985Pev("set_top_if_visitor_liked") boolean z2, @InterfaceC64985Pev("extra") String str2, @InterfaceC64985Pev("scenario") int i3);

    @E8L("/tiktok/v1/now/widget/feed")
    AbstractC73638SvC<NowWidgetFeedResponse> fetchNowWidgetFeedInfoRx();
}
