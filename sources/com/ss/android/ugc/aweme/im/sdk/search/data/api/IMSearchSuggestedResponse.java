package com.ss.android.ugc.aweme.im.sdk.search.data.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMSearchSuggestedResponse extends BaseResponse {

    @InterfaceC65349Pkn("doc_list")
    public final List<SearchDoc> docList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMSearchSuggestedResponse) && o.LJ(this.docList, ((IMSearchSuggestedResponse) obj).docList);
    }

    public final int hashCode() {
        List<SearchDoc> list = this.docList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMSearchSuggestedResponse(docList=");
        return C1NE.LIZIZ(LIZ, this.docList, ')', LIZ);
    }

    public IMSearchSuggestedResponse(List<SearchDoc> list) {
        this.docList = list;
    }
}
