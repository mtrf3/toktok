package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CollectionLive {

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("doc_id")
    public final Long docId;

    @InterfaceC65349Pkn("is_more")
    public final Boolean isMore;

    @InterfaceC65349Pkn("lives")
    public final List<Aweme> lives;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionLive() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionLive)) {
            return false;
        }
        CollectionLive collectionLive = (CollectionLive) obj;
        return o.LJ(this.lives, collectionLive.lives) && o.LJ(this.docId, collectionLive.docId) && o.LJ(this.isMore, collectionLive.isMore) && o.LJ(this.cursor, collectionLive.cursor);
    }

    public final int hashCode() {
        List<Aweme> list = this.lives;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.docId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isMore;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.cursor;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectionLive(lives=");
        LIZ.append(this.lives);
        LIZ.append(", docId=");
        LIZ.append(this.docId);
        LIZ.append(", isMore=");
        LIZ.append(this.isMore);
        LIZ.append(", cursor=");
        return JBR.LJ(LIZ, this.cursor, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionLive(List<? extends Aweme> list, Long l, Boolean bool, Long l2) {
        this.lives = list;
        this.docId = l;
        this.isMore = bool;
        this.cursor = l2;
    }

    public /* synthetic */ CollectionLive(List list, Long l, Boolean bool, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? 0L : l, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? null : l2);
    }
}
