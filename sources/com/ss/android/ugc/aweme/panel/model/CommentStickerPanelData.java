package com.ss.android.ugc.aweme.panel.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommentStickerPanelData {

    @InterfaceC65349Pkn("comment_list")
    public final List<CommentStickerForPanel> commentStickerPanelList;

    @InterfaceC65349Pkn("count")
    public final Integer count;

    @InterfaceC65349Pkn("cursor")
    public final Integer cursor;

    @InterfaceC65349Pkn("has_more")
    public final Integer hasMore;

    @InterfaceC65349Pkn("type")
    public final Integer tabType;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentStickerPanelData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentStickerPanelData)) {
            return false;
        }
        CommentStickerPanelData commentStickerPanelData = (CommentStickerPanelData) obj;
        return o.LJ(this.commentStickerPanelList, commentStickerPanelData.commentStickerPanelList) && o.LJ(this.cursor, commentStickerPanelData.cursor) && o.LJ(this.hasMore, commentStickerPanelData.hasMore) && o.LJ(this.count, commentStickerPanelData.count) && o.LJ(this.tabType, commentStickerPanelData.tabType);
    }

    public final int hashCode() {
        List<CommentStickerForPanel> list = this.commentStickerPanelList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.cursor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hasMore;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.count;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.tabType;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentStickerPanelData(commentStickerPanelList=");
        LIZ.append(this.commentStickerPanelList);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", count=");
        LIZ.append(this.count);
        LIZ.append(", tabType=");
        return s0.LIZJ(LIZ, this.tabType, ')', LIZ);
    }

    public CommentStickerPanelData(List<CommentStickerForPanel> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this.commentStickerPanelList = list;
        this.cursor = num;
        this.hasMore = num2;
        this.count = num3;
        this.tabType = num4;
    }

    public /* synthetic */ CommentStickerPanelData(List list, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) == 0 ? num4 : null);
    }
}
