package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import X.AbstractC73672Svk;
import X.C86002Xp8;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.CountDownStickerDetailResponse;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.CountDownStickerResponse;

/* loaded from: classes16.dex */
public interface CountDownStickerApi {
    public static final C86002Xp8 LIZ = C86002Xp8.LIZ;

    @E4Q("tiktok/v1/sticker/countdown/detail/")
    AbstractC73672Svk<CountDownStickerDetailResponse> getDetail(@InterfaceC64989Pez("item_id") String str);

    @InterfaceC195787mI
    @E4T("tiktok/v1/sticker/countdown/reminder/")
    AbstractC73672Svk<CountDownStickerResponse> subscribe(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("countdown_time") long j, @InterfaceC64987Pex("action") int i);
}
