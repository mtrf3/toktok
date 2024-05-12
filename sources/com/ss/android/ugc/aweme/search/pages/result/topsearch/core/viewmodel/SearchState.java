package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel;

import X.C50031JkJ;
import X.C74002T2o;
import X.F9E;
import X.InterfaceC61312at;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SearchState extends F9E implements InterfaceC61312at {
    public static final int $stable = 8;
    public final ListState listState;
    public final C50031JkJ searchParam;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchState copy$default(SearchState searchState, ListState listState, C50031JkJ c50031JkJ, int i, Object obj) {
        if ((i & 1) != 0) {
            listState = searchState.listState;
        }
        if ((i & 2) != 0) {
            c50031JkJ = searchState.searchParam;
        }
        return searchState.copy(listState, c50031JkJ);
    }

    public final SearchState copy(ListState listState, C50031JkJ searchParam) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(searchParam, "searchParam");
        return new SearchState(listState, searchParam);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.listState, this.searchParam};
    }

    public final ListState getListState() {
        return this.listState;
    }

    public final C50031JkJ getSearchParam() {
        return this.searchParam;
    }

    public SearchState(ListState listState, C50031JkJ searchParam) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(searchParam, "searchParam");
        this.listState = listState;
        this.searchParam = searchParam;
    }

    public /* synthetic */ SearchState(ListState listState, C50031JkJ c50031JkJ, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ListState(new C74002T2o(0), null, null, null, null, 30, null) : listState, (i & 2) != 0 ? new C50031JkJ("", null, null, 0, 0, null, null, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3) : c50031JkJ);
    }
}
