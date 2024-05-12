package com.ss.android.ugc.aweme.comment.commentlist.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommentBatchDeleteResponse extends BaseResponse {

    @InterfaceC65349Pkn("failed_cids")
    public final String failedCids;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentBatchDeleteResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommentBatchDeleteResponse) && o.LJ(this.failedCids, ((CommentBatchDeleteResponse) obj).failedCids);
    }

    public final int hashCode() {
        String str = this.failedCids;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentBatchDeleteResponse(failedCids=");
        return q.LIZIZ(LIZ, this.failedCids, ')', LIZ);
    }

    public CommentBatchDeleteResponse(String str) {
        this.failedCids = str;
    }

    public /* synthetic */ CommentBatchDeleteResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
