package com.ss.android.ugc.aweme.topic.book.detail.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BookVideosResp extends BaseResponse {

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemeList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("page_extra")
    public final String pageExtra;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookVideosResp)) {
            return false;
        }
        BookVideosResp bookVideosResp = (BookVideosResp) obj;
        return o.LJ(this.awemeList, bookVideosResp.awemeList) && this.hasMore == bookVideosResp.hasMore && o.LJ(this.pageExtra, bookVideosResp.pageExtra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<Aweme> list = this.awemeList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.pageExtra.hashCode() + ((hashCode + i) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BookVideosResp(awemeList=");
        LIZ.append(this.awemeList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", pageExtra=");
        return q.LIZIZ(LIZ, this.pageExtra, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BookVideosResp(List<? extends Aweme> list, boolean z, String pageExtra) {
        o.LJIIIZ(pageExtra, "pageExtra");
        this.awemeList = list;
        this.hasMore = z;
        this.pageExtra = pageExtra;
    }
}
