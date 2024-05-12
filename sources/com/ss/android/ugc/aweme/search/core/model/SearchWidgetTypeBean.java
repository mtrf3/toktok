package com.ss.android.ugc.aweme.search.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchWidgetTypeBean implements Serializable {

    @InterfaceC65349Pkn("words")
    public final List<SearchWidgetSuggestWord> words;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchWidgetTypeBean copy$default(SearchWidgetTypeBean searchWidgetTypeBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchWidgetTypeBean.words;
        }
        return searchWidgetTypeBean.copy(list);
    }

    public final SearchWidgetTypeBean copy(List<SearchWidgetSuggestWord> list) {
        return new SearchWidgetTypeBean(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchWidgetTypeBean) && o.LJ(this.words, ((SearchWidgetTypeBean) obj).words);
    }

    public int hashCode() {
        List<SearchWidgetSuggestWord> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchWidgetTypeBean(words=");
        return C1NE.LIZIZ(LIZ, this.words, ')', LIZ);
    }

    public final List<SearchWidgetSuggestWord> getWords() {
        return this.words;
    }

    public SearchWidgetTypeBean(List<SearchWidgetSuggestWord> list) {
        this.words = list;
    }
}
