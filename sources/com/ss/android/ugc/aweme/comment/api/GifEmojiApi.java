package com.ss.android.ugc.aweme.comment.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.TCG;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.GifEmojiResponse;

/* loaded from: classes13.dex */
public interface GifEmojiApi {
    public static final TCG LIZ = TCG.LIZ;

    @E4Q("aweme/v1/im/resources/sticker/collect/")
    AbstractC73672Svk<BaseResponse> collectGifEmoji(@InterfaceC64989Pez("action") int i, @InterfaceC64989Pez("sticker_ids") String str, @InterfaceC64989Pez("sticker_source") int i2);

    @E4Q("aweme/v1/im/resources/emoticon/search/")
    AbstractC73672Svk<GifEmojiResponse> searchGifEmoji(@InterfaceC64989Pez("keyword") String str, @InterfaceC64989Pez("cursor") int i, @InterfaceC64989Pez("source") String str2, @InterfaceC64989Pez("group_id") String str3);
}
