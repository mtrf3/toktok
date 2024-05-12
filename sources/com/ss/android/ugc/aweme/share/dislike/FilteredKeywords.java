package com.ss.android.ugc.aweme.share.dislike;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilteredKeywords extends BaseResponse {

    @InterfaceC65349Pkn("word_count")
    public final int counts;

    @InterfaceC65349Pkn("word_list")
    public final List<Keyword> list;

    public FilteredKeywords() {
        this(0, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilteredKeywords copy$default(FilteredKeywords filteredKeywords, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = filteredKeywords.counts;
        }
        if ((i2 & 2) != 0) {
            list = filteredKeywords.list;
        }
        return filteredKeywords.copy(i, list);
    }

    private Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.counts), this.list};
    }

    public final FilteredKeywords copy(int i, List<Keyword> list) {
        o.LJIIIZ(list, "list");
        return new FilteredKeywords(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilteredKeywords) {
            return C78966Uyw.LJIIIZ(((FilteredKeywords) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("FilteredKeywords:%s,%s", getObjects());
    }

    public final int getCounts() {
        return this.counts;
    }

    public final List<Keyword> getList() {
        return this.list;
    }

    public FilteredKeywords(int i, List<Keyword> list) {
        o.LJIIIZ(list, "list");
        this.counts = i;
        this.list = list;
    }

    public FilteredKeywords(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
