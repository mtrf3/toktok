package com.ss.android.ugc.aweme.emoji.stickerstore.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SaveVideoStickerResponse extends BaseResponse {

    @InterfaceC65349Pkn("video_sticker")
    public final VideoSticker videoSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public SaveVideoStickerResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SaveVideoStickerResponse copy$default(SaveVideoStickerResponse saveVideoStickerResponse, VideoSticker videoSticker, int i, Object obj) {
        if ((i & 1) != 0) {
            videoSticker = saveVideoStickerResponse.videoSticker;
        }
        return saveVideoStickerResponse.copy(videoSticker);
    }

    public final SaveVideoStickerResponse copy(VideoSticker videoSticker) {
        return new SaveVideoStickerResponse(videoSticker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveVideoStickerResponse) && o.LJ(this.videoSticker, ((SaveVideoStickerResponse) obj).videoSticker);
    }

    public int hashCode() {
        VideoSticker videoSticker = this.videoSticker;
        if (videoSticker == null) {
            return 0;
        }
        return videoSticker.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SaveVideoStickerResponse(videoSticker=");
        LIZ.append(this.videoSticker);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final VideoSticker getVideoSticker() {
        return this.videoSticker;
    }

    public SaveVideoStickerResponse(VideoSticker videoSticker) {
        this.videoSticker = videoSticker;
    }

    public /* synthetic */ SaveVideoStickerResponse(VideoSticker videoSticker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoSticker);
    }
}
