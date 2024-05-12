package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FavStickerStruct implements Serializable {

    @InterfaceC65349Pkn("sticker")
    public final SetSticker setSticker;

    @InterfaceC65349Pkn("sticker_type")
    public final Integer stickerType;

    @InterfaceC65349Pkn("video_sticker")
    public final VideoSticker videoSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public FavStickerStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FavStickerStruct copy$default(FavStickerStruct favStickerStruct, Integer num, SetSticker setSticker, VideoSticker videoSticker, int i, Object obj) {
        if ((i & 1) != 0) {
            num = favStickerStruct.stickerType;
        }
        if ((i & 2) != 0) {
            setSticker = favStickerStruct.setSticker;
        }
        if ((i & 4) != 0) {
            videoSticker = favStickerStruct.videoSticker;
        }
        return favStickerStruct.copy(num, setSticker, videoSticker);
    }

    public final FavStickerStruct copy(Integer num, SetSticker setSticker, VideoSticker videoSticker) {
        return new FavStickerStruct(num, setSticker, videoSticker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavStickerStruct)) {
            return false;
        }
        FavStickerStruct favStickerStruct = (FavStickerStruct) obj;
        return o.LJ(this.stickerType, favStickerStruct.stickerType) && o.LJ(this.setSticker, favStickerStruct.setSticker) && o.LJ(this.videoSticker, favStickerStruct.videoSticker);
    }

    public int hashCode() {
        Integer num = this.stickerType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        SetSticker setSticker = this.setSticker;
        int hashCode2 = (hashCode + (setSticker == null ? 0 : setSticker.hashCode())) * 31;
        VideoSticker videoSticker = this.videoSticker;
        return hashCode2 + (videoSticker != null ? videoSticker.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavStickerStruct(stickerType=");
        LIZ.append(this.stickerType);
        LIZ.append(", setSticker=");
        LIZ.append(this.setSticker);
        LIZ.append(", videoSticker=");
        LIZ.append(this.videoSticker);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final SetSticker getSetSticker() {
        return this.setSticker;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final VideoSticker getVideoSticker() {
        return this.videoSticker;
    }

    public FavStickerStruct(Integer num, SetSticker setSticker, VideoSticker videoSticker) {
        this.stickerType = num;
        this.setSticker = setSticker;
        this.videoSticker = videoSticker;
    }

    public /* synthetic */ FavStickerStruct(Integer num, SetSticker setSticker, VideoSticker videoSticker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : setSticker, (i & 4) != 0 ? null : videoSticker);
    }
}
