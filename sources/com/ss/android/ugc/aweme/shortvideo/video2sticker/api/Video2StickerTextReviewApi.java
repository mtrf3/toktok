package com.ss.android.ugc.aweme.shortvideo.video2sticker.api;

import X.E4Q;
import X.InterfaceC37276Ek4;
import X.InterfaceC64989Pez;

/* loaded from: classes7.dex */
public interface Video2StickerTextReviewApi {
    @E4Q("/tiktok/v1/im/video2sticker/text_review/")
    InterfaceC37276Ek4<Video2StickerTextReviewResponse> video2StickerTextReview(@InterfaceC64989Pez("text") String str);
}
