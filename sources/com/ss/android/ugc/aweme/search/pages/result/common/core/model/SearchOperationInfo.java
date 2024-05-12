package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchOperationInfo implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("live_room")
    public Aweme aweme;

    @InterfaceC65349Pkn("activity")
    public SearchOperation operation;

    public int hashCode() {
        int i;
        int hashCode = this.operation.hashCode() * 31;
        Aweme aweme = this.aweme;
        if (aweme != null) {
            i = aweme.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final SearchOperation getOperation() {
        return this.operation;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(SearchOperationInfo.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchOperationInfo");
        SearchOperationInfo searchOperationInfo = (SearchOperationInfo) obj;
        if (o.LJ(this.operation, searchOperationInfo.operation) && o.LJ(this.aweme, searchOperationInfo.aweme)) {
            return true;
        }
        return false;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setOperation(SearchOperation searchOperation) {
        o.LJIIIZ(searchOperation, "<set-?>");
        this.operation = searchOperation;
    }

    public SearchOperationInfo(SearchOperation operation, Aweme aweme) {
        o.LJIIIZ(operation, "operation");
        this.operation = operation;
        this.aweme = aweme;
    }
}
