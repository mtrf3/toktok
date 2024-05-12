package com.ss.android.ugc.aweme.topic.search.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchTopicResponse extends BaseResponse {

    @InterfaceC65349Pkn("sug_list")
    public final List<SugStruct> sugList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchTopicResponse) && o.LJ(this.sugList, ((SearchTopicResponse) obj).sugList);
    }

    public final int hashCode() {
        List<SugStruct> list = this.sugList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchTopicResponse(sugList=");
        return C1NE.LIZIZ(LIZ, this.sugList, ')', LIZ);
    }

    public SearchTopicResponse(List<SugStruct> list) {
        this.sugList = list;
    }
}
