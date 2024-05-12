package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CountDownStickerDetailResponse extends BaseResponse {

    @InterfaceC65349Pkn("sticker_detail")
    public final CountDownStickerStruct stickerDetail;

    public CountDownStickerDetailResponse(CountDownStickerStruct stickerDetail) {
        o.LJIIIZ(stickerDetail, "stickerDetail");
        this.stickerDetail = stickerDetail;
    }
}
