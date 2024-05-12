package com.ss.android.ugc.aweme.search.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchWidgetModel extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final List<SearchWidgetTypeBean> data;

    @InterfaceC65349Pkn("log_id")
    public final String logId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchWidgetModel copy$default(SearchWidgetModel searchWidgetModel, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchWidgetModel.data;
        }
        if ((i & 2) != 0) {
            str = searchWidgetModel.logId;
        }
        return searchWidgetModel.copy(list, str);
    }

    public final SearchWidgetModel copy(List<SearchWidgetTypeBean> list, String logId) {
        o.LJIIIZ(logId, "logId");
        return new SearchWidgetModel(list, logId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchWidgetModel)) {
            return false;
        }
        SearchWidgetModel searchWidgetModel = (SearchWidgetModel) obj;
        return o.LJ(this.data, searchWidgetModel.data) && o.LJ(this.logId, searchWidgetModel.logId);
    }

    public int hashCode() {
        List<SearchWidgetTypeBean> list = this.data;
        return this.logId.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String getFirstGroupId() {
        boolean z;
        SearchWidgetTypeBean searchWidgetTypeBean;
        List<SearchWidgetSuggestWord> words;
        List<SearchWidgetTypeBean> list = this.data;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (words = (searchWidgetTypeBean = (SearchWidgetTypeBean) ListProtector.get(this.data, 0)).getWords()) == null || words.isEmpty()) {
            return "";
        }
        return ((SearchWidgetSuggestWord) ListProtector.get(searchWidgetTypeBean.getWords(), 0)).getGroupId();
    }

    public final String getFirstGuessWord() {
        boolean z;
        SearchWidgetTypeBean searchWidgetTypeBean;
        List<SearchWidgetSuggestWord> words;
        List<SearchWidgetTypeBean> list = this.data;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (words = (searchWidgetTypeBean = (SearchWidgetTypeBean) ListProtector.get(this.data, 0)).getWords()) == null || words.isEmpty()) {
            return "";
        }
        return ((SearchWidgetSuggestWord) ListProtector.get(searchWidgetTypeBean.getWords(), 0)).getWord();
    }

    public final SearchWidgetSuggestWord[] getSuggestWords() {
        boolean z;
        List<SearchWidgetSuggestWord> words;
        List<SearchWidgetSuggestWord> subList;
        List<SearchWidgetTypeBean> list = this.data;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (words = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).getWords()) == null || words.isEmpty()) {
            return null;
        }
        List<SearchWidgetSuggestWord> words2 = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).getWords();
        if (words2 == null || words2.size() < 8) {
            List<SearchWidgetSuggestWord> words3 = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).getWords();
            if (words3 == null) {
                return null;
            }
            return (SearchWidgetSuggestWord[]) words3.toArray(new SearchWidgetSuggestWord[0]);
        }
        List<SearchWidgetSuggestWord> words4 = ((SearchWidgetTypeBean) ListProtector.get(this.data, 0)).getWords();
        if (words4 == null || (subList = words4.subList(0, 8)) == null) {
            return null;
        }
        return (SearchWidgetSuggestWord[]) subList.toArray(new SearchWidgetSuggestWord[0]);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchWidgetModel(data=");
        LIZ.append(this.data);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public final List<SearchWidgetTypeBean> getData() {
        return this.data;
    }

    public final String getLogId() {
        return this.logId;
    }

    public SearchWidgetModel(List<SearchWidgetTypeBean> list, String logId) {
        o.LJIIIZ(logId, "logId");
        this.data = list;
        this.logId = logId;
    }
}
