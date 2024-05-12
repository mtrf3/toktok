package com.ss.android.ugc.aweme.topic.book.favorite.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BookCollectionListResponse extends BaseResponse {

    @InterfaceC65349Pkn("book_list")
    public final List<TopicRawInfo> bookList;

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    /* JADX WARN: Multi-variable type inference failed */
    public BookCollectionListResponse() {
        this(null, 0L, false, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BookCollectionListResponse) {
            return C78966Uyw.LJIIIZ(((BookCollectionListResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.bookList, Long.valueOf(this.cursor), Boolean.valueOf(this.hasMore)};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("BookCollectionListResponse:%s,%s,%s", getObjects());
    }

    public BookCollectionListResponse(List<TopicRawInfo> bookList, long j, boolean z) {
        o.LJIIIZ(bookList, "bookList");
        this.bookList = bookList;
        this.cursor = j;
        this.hasMore = z;
    }

    public /* synthetic */ BookCollectionListResponse(List list, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z);
    }
}
