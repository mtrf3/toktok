package com.ss.android.ugc.aweme.compliance.business.filtervideo.model;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilteredKeywordsModel extends BaseResponse {

    @InterfaceC65349Pkn("word_count")
    public final int counts;

    @InterfaceC65349Pkn("word_list")
    public final List<Keyword> list;

    public FilteredKeywordsModel() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilteredKeywordsModel) {
            return C78966Uyw.LJIIIZ(((FilteredKeywordsModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.counts), this.list};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("FilteredKeywordsModel:%s,%s", getObjects());
    }

    public FilteredKeywordsModel(int i, List<Keyword> list) {
        o.LJIIIZ(list, "list");
        this.counts = i;
        this.list = list;
    }

    public FilteredKeywordsModel(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
