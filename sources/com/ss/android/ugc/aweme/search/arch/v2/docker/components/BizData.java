package com.ss.android.ugc.aweme.search.arch.v2.docker.components;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class BizData {

    @InterfaceC65349Pkn("query_correct_info")
    public final QueryCorrectComponentInfo queryCorrectInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BizData) && o.LJ(this.queryCorrectInfo, ((BizData) obj).queryCorrectInfo);
    }

    public final int hashCode() {
        QueryCorrectComponentInfo queryCorrectComponentInfo = this.queryCorrectInfo;
        if (queryCorrectComponentInfo == null) {
            return 0;
        }
        return queryCorrectComponentInfo.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BizData(queryCorrectInfo=");
        LIZ.append(this.queryCorrectInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public BizData(QueryCorrectComponentInfo queryCorrectComponentInfo) {
        this.queryCorrectInfo = queryCorrectComponentInfo;
    }
}
