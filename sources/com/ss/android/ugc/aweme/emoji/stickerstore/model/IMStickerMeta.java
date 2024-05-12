package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMStickerMeta implements Serializable {

    @InterfaceC65349Pkn("size")
    public final Integer size;

    @InterfaceC65349Pkn("stickers")
    public final List<SetSticker> stickers;

    /* JADX WARN: Multi-variable type inference failed */
    public IMStickerMeta() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IMStickerMeta copy$default(IMStickerMeta iMStickerMeta, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iMStickerMeta.stickers;
        }
        if ((i & 2) != 0) {
            num = iMStickerMeta.size;
        }
        return iMStickerMeta.copy(list, num);
    }

    public final IMStickerMeta copy(List<SetSticker> list, Integer num) {
        return new IMStickerMeta(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMStickerMeta)) {
            return false;
        }
        IMStickerMeta iMStickerMeta = (IMStickerMeta) obj;
        return o.LJ(this.stickers, iMStickerMeta.stickers) && o.LJ(this.size, iMStickerMeta.size);
    }

    public int hashCode() {
        List<SetSticker> list = this.stickers;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.size;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMStickerMeta(stickers=");
        LIZ.append(this.stickers);
        LIZ.append(", size=");
        return s0.LIZJ(LIZ, this.size, ')', LIZ);
    }

    public final Integer getSize() {
        return this.size;
    }

    public final List<SetSticker> getStickers() {
        return this.stickers;
    }

    public IMStickerMeta(List<SetSticker> list, Integer num) {
        this.stickers = list;
        this.size = num;
    }

    public /* synthetic */ IMStickerMeta(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
