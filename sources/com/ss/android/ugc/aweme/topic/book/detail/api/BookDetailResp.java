package com.ss.android.ugc.aweme.topic.book.detail.api;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookDetailResp extends BaseResponse {

    @InterfaceC65349Pkn("topic_detail")
    public final BookDetail detail;

    @InterfaceC65349Pkn("is_collected")
    public boolean isCollected;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BookDetailResp) {
            return C78966Uyw.LJIIIZ(((BookDetailResp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isCollected), this.detail};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("BookDetailResp:%s,%s", getObjects());
    }

    public BookDetailResp(boolean z, BookDetail detail) {
        o.LJIIIZ(detail, "detail");
        this.isCollected = z;
        this.detail = detail;
    }

    public /* synthetic */ BookDetailResp(boolean z, BookDetail bookDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, bookDetail);
    }
}
