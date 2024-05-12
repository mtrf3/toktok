package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes13.dex */
public final class CountDownStickerResponse extends BaseResponse {

    @InterfaceC65349Pkn("is_subscribed")
    public final boolean subscribeState;

    public CountDownStickerResponse(boolean z) {
        this.subscribeState = z;
    }
}
