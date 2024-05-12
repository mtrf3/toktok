package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes2.dex */
public interface VGGifterPanelService {
    @E4Q("/tiktok/v1/gift/gifter_list/")
    AbstractC73672Svk<GiftListPanelResponse> getGifterPanel(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("gift_id") Long l, @InterfaceC64989Pez("cursor") Long l2);
}
