package com.ss.android.ugc.aweme.emoji.stickerstore.model;

import X.C32V;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SetSticker implements C32V, Serializable {

    @InterfaceC65349Pkn("animated_urls")
    public final StickerUrlStruct animateUrl;

    @InterfaceC65349Pkn("creator_uid")
    public final Long authorUid;

    @InterfaceC65349Pkn("display_order")
    public final Integer displayOrder;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("set_id")
    public final Long setId;

    @InterfaceC65349Pkn("static_urls")
    public final StickerUrlStruct staticUrl;

    @InterfaceC65349Pkn("id")
    public final Long stickerId;

    @InterfaceC65349Pkn("sticker_type")
    public final Integer stickerType;

    /* JADX WARN: Multi-variable type inference failed */
    public SetSticker() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SetSticker copy$default(SetSticker setSticker, Long l, String str, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num, Long l2, Long l3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = setSticker.stickerId;
        }
        if ((i & 2) != 0) {
            str = setSticker.name;
        }
        if ((i & 4) != 0) {
            stickerUrlStruct = setSticker.staticUrl;
        }
        if ((i & 8) != 0) {
            stickerUrlStruct2 = setSticker.animateUrl;
        }
        if ((i & 16) != 0) {
            num = setSticker.displayOrder;
        }
        if ((i & 32) != 0) {
            l2 = setSticker.setId;
        }
        if ((i & 64) != 0) {
            l3 = setSticker.authorUid;
        }
        if ((i & 128) != 0) {
            num2 = setSticker.stickerType;
        }
        return setSticker.copy(l, str, stickerUrlStruct, stickerUrlStruct2, num, l2, l3, num2);
    }

    public final SetSticker copy(Long l, String str, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num, Long l2, Long l3, Integer num2) {
        return new SetSticker(l, str, stickerUrlStruct, stickerUrlStruct2, num, l2, l3, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSticker)) {
            return false;
        }
        SetSticker setSticker = (SetSticker) obj;
        return o.LJ(this.stickerId, setSticker.stickerId) && o.LJ(this.name, setSticker.name) && o.LJ(this.staticUrl, setSticker.staticUrl) && o.LJ(this.animateUrl, setSticker.animateUrl) && o.LJ(this.displayOrder, setSticker.displayOrder) && o.LJ(this.setId, setSticker.setId) && o.LJ(this.authorUid, setSticker.authorUid) && o.LJ(this.stickerType, setSticker.stickerType);
    }

    public int hashCode() {
        Long l = this.stickerId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct = this.staticUrl;
        int hashCode3 = (hashCode2 + (stickerUrlStruct == null ? 0 : stickerUrlStruct.hashCode())) * 31;
        StickerUrlStruct stickerUrlStruct2 = this.animateUrl;
        int hashCode4 = (hashCode3 + (stickerUrlStruct2 == null ? 0 : stickerUrlStruct2.hashCode())) * 31;
        Integer num = this.displayOrder;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.setId;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.authorUid;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.stickerType;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SetSticker(stickerId=");
        LIZ.append(this.stickerId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", staticUrl=");
        LIZ.append(this.staticUrl);
        LIZ.append(", animateUrl=");
        LIZ.append(this.animateUrl);
        LIZ.append(", displayOrder=");
        LIZ.append(this.displayOrder);
        LIZ.append(", setId=");
        LIZ.append(this.setId);
        LIZ.append(", authorUid=");
        LIZ.append(this.authorUid);
        LIZ.append(", stickerType=");
        return s0.LIZJ(LIZ, this.stickerType, ')', LIZ);
    }

    public final StickerUrlStruct getAnimateUrl() {
        return this.animateUrl;
    }

    public final Long getAuthorUid() {
        return this.authorUid;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getSetId() {
        return this.setId;
    }

    public final StickerUrlStruct getStaticUrl() {
        return this.staticUrl;
    }

    public final Long getStickerId() {
        return this.stickerId;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public SetSticker(Long l, String str, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num, Long l2, Long l3, Integer num2) {
        this.stickerId = l;
        this.name = str;
        this.staticUrl = stickerUrlStruct;
        this.animateUrl = stickerUrlStruct2;
        this.displayOrder = num;
        this.setId = l2;
        this.authorUid = l3;
        this.stickerType = num2;
    }

    public /* synthetic */ SetSticker(Long l, String str, StickerUrlStruct stickerUrlStruct, StickerUrlStruct stickerUrlStruct2, Integer num, Long l2, Long l3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : stickerUrlStruct, (i & 8) != 0 ? null : stickerUrlStruct2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3, (i & 128) == 0 ? num2 : null);
    }
}
