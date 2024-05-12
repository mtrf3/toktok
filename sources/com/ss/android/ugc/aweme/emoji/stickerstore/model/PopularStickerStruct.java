package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopularStickerStruct implements Serializable {

    @InterfaceC65349Pkn("sticker")
    public final SetSticker setSticker;

    @InterfaceC65349Pkn("sticker_type")
    public final Integer stickerType;

    @InterfaceC65349Pkn("video_sticker")
    public final VideoSticker videoSticker;

    /* JADX WARN: Multi-variable type inference failed */
    public PopularStickerStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PopularStickerStruct copy$default(PopularStickerStruct popularStickerStruct, Integer num, SetSticker setSticker, VideoSticker videoSticker, int i, Object obj) {
        if ((i & 1) != 0) {
            num = popularStickerStruct.stickerType;
        }
        if ((i & 2) != 0) {
            setSticker = popularStickerStruct.setSticker;
        }
        if ((i & 4) != 0) {
            videoSticker = popularStickerStruct.videoSticker;
        }
        return popularStickerStruct.copy(num, setSticker, videoSticker);
    }

    public final PopularStickerStruct copy(Integer num, SetSticker setSticker, VideoSticker videoSticker) {
        return new PopularStickerStruct(num, setSticker, videoSticker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopularStickerStruct)) {
            return false;
        }
        PopularStickerStruct popularStickerStruct = (PopularStickerStruct) obj;
        return o.LJ(this.stickerType, popularStickerStruct.stickerType) && o.LJ(this.setSticker, popularStickerStruct.setSticker) && o.LJ(this.videoSticker, popularStickerStruct.videoSticker);
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
        LIZ.append("PopularStickerStruct(stickerType=");
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

    public PopularStickerStruct(Integer num, SetSticker setSticker, VideoSticker videoSticker) {
        this.stickerType = num;
        this.setSticker = setSticker;
        this.videoSticker = videoSticker;
    }

    public /* synthetic */ PopularStickerStruct(Integer num, SetSticker setSticker, VideoSticker videoSticker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : setSticker, (i & 4) != 0 ? null : videoSticker);
    }
}
