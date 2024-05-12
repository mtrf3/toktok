package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSet implements Serializable {

    @InterfaceC65349Pkn("sticker_set_metadata")
    public final StickerSetInfo info;

    @InterfaceC65349Pkn("stickers")
    public final List<SetSticker> stickers;

    /* JADX WARN: Multi-variable type inference failed */
    public StickerSet() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerSet copy$default(StickerSet stickerSet, StickerSetInfo stickerSetInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stickerSetInfo = stickerSet.info;
        }
        if ((i & 2) != 0) {
            list = stickerSet.stickers;
        }
        return stickerSet.copy(stickerSetInfo, list);
    }

    public final StickerSet copy(StickerSetInfo stickerSetInfo, List<SetSticker> list) {
        return new StickerSet(stickerSetInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSet)) {
            return false;
        }
        StickerSet stickerSet = (StickerSet) obj;
        return o.LJ(this.info, stickerSet.info) && o.LJ(this.stickers, stickerSet.stickers);
    }

    public int hashCode() {
        StickerSetInfo stickerSetInfo = this.info;
        int hashCode = (stickerSetInfo == null ? 0 : stickerSetInfo.hashCode()) * 31;
        List<SetSticker> list = this.stickers;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerSet(info=");
        LIZ.append(this.info);
        LIZ.append(", stickers=");
        return C1NE.LIZIZ(LIZ, this.stickers, ')', LIZ);
    }

    public final StickerSetInfo getInfo() {
        return this.info;
    }

    public final List<SetSticker> getStickers() {
        return this.stickers;
    }

    public StickerSet(StickerSetInfo stickerSetInfo, List<SetSticker> list) {
        this.info = stickerSetInfo;
        this.stickers = list;
    }

    public /* synthetic */ StickerSet(StickerSetInfo stickerSetInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stickerSetInfo, (i & 2) != 0 ? null : list);
    }
}
