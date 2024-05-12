package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes2.dex */
public interface VGGETSupporterPanelService {
    @E4Q("/tiktok/v1/gift/supporter_panel/")
    AbstractC73672Svk<GiftSupporterPanelResponse> getSupporterPanel(@InterfaceC64989Pez("aweme_id") String str);
}
