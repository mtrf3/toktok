package com.ss.android.ugc.aweme.panel.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommentStickerPanelResponse {

    @InterfaceC65349Pkn("collection")
    public final List<CommentStickerPanelData> collection;

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentStickerPanelResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentStickerPanelResponse)) {
            return false;
        }
        CommentStickerPanelResponse commentStickerPanelResponse = (CommentStickerPanelResponse) obj;
        return o.LJ(this.statusCode, commentStickerPanelResponse.statusCode) && o.LJ(this.collection, commentStickerPanelResponse.collection);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<CommentStickerPanelData> list = this.collection;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentStickerPanelResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", collection=");
        return C1NE.LIZIZ(LIZ, this.collection, ')', LIZ);
    }

    public CommentStickerPanelResponse(Integer num, List<CommentStickerPanelData> list) {
        this.statusCode = num;
        this.collection = list;
    }

    public /* synthetic */ CommentStickerPanelResponse(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
