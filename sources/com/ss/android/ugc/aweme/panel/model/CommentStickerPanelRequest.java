package com.ss.android.ugc.aweme.panel.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommentStickerPanelRequest {

    @InterfaceC65349Pkn("count")
    public final Integer count;

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentStickerPanelRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentStickerPanelRequest)) {
            return false;
        }
        CommentStickerPanelRequest commentStickerPanelRequest = (CommentStickerPanelRequest) obj;
        return o.LJ(this.cursor, commentStickerPanelRequest.cursor) && o.LJ(this.count, commentStickerPanelRequest.count) && o.LJ(this.type, commentStickerPanelRequest.type);
    }

    public final int hashCode() {
        Integer num = this.cursor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.count;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.type;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentStickerPanelRequest(cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public CommentStickerPanelRequest(Integer num, Integer num2, Integer num3) {
        this.cursor = num;
        this.count = num2;
        this.type = num3;
    }

    public /* synthetic */ CommentStickerPanelRequest(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
