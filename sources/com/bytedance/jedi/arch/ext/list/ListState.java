package com.bytedance.jedi.arch.ext.list;

import X.AbstractC26082ALm;
import X.C26092ALw;
import X.C61878OQg;
import X.C70839Rr9;
import X.C70840RrA;
import X.F9E;
import X.InterfaceC61312at;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ListState extends F9E implements InterfaceC61312at {
    public final C70840RrA isEmpty;
    public final List<Object> list;
    public final AbstractC26082ALm<List<Object>> loadMore;
    public final C70839Rr9 payload;
    public final AbstractC26082ALm<List<Object>> refresh;

    public static /* synthetic */ ListState copy$default(ListState listState, C70839Rr9 c70839Rr9, List list, AbstractC26082ALm abstractC26082ALm, AbstractC26082ALm abstractC26082ALm2, C70840RrA c70840RrA, int i, Object obj) {
        if ((i & 1) != 0) {
            c70839Rr9 = listState.payload;
        }
        if ((i & 2) != 0) {
            list = listState.list;
        }
        if ((i & 4) != 0) {
            abstractC26082ALm = listState.refresh;
        }
        if ((i & 8) != 0) {
            abstractC26082ALm2 = listState.loadMore;
        }
        if ((i & 16) != 0) {
            c70840RrA = listState.isEmpty;
        }
        return listState.copy(c70839Rr9, list, abstractC26082ALm, abstractC26082ALm2, c70840RrA);
    }

    public final ListState copy(C70839Rr9 payload, List list, AbstractC26082ALm refresh, AbstractC26082ALm loadMore, C70840RrA isEmpty) {
        o.LJIIJ(payload, "payload");
        o.LJIIJ(list, "list");
        o.LJIIJ(refresh, "refresh");
        o.LJIIJ(loadMore, "loadMore");
        o.LJIIJ(isEmpty, "isEmpty");
        return new ListState(payload, list, refresh, loadMore, isEmpty);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.payload, this.list, this.refresh, this.loadMore, this.isEmpty};
    }

    public final C70840RrA getHasMore() {
        return this.payload.LIZ;
    }

    public final List<Object> getList() {
        return this.list;
    }

    public final AbstractC26082ALm<List<Object>> getLoadMore() {
        return this.loadMore;
    }

    public final C70839Rr9 getPayload() {
        return this.payload;
    }

    public final AbstractC26082ALm<List<Object>> getRefresh() {
        return this.refresh;
    }

    public final C70840RrA isEmpty() {
        return this.isEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListState(C70839Rr9 payload, List<Object> list, AbstractC26082ALm<? extends List<Object>> refresh, AbstractC26082ALm<? extends List<Object>> loadMore, C70840RrA isEmpty) {
        o.LJIIJ(payload, "payload");
        o.LJIIJ(list, "list");
        o.LJIIJ(refresh, "refresh");
        o.LJIIJ(loadMore, "loadMore");
        o.LJIIJ(isEmpty, "isEmpty");
        this.payload = payload;
        this.list = list;
        this.refresh = refresh;
        this.loadMore = loadMore;
        this.isEmpty = isEmpty;
    }

    public ListState(C70839Rr9 c70839Rr9, List list, AbstractC26082ALm abstractC26082ALm, AbstractC26082ALm abstractC26082ALm2, C70840RrA c70840RrA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c70839Rr9, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? C26092ALw.LIZ : abstractC26082ALm, (i & 8) != 0 ? C26092ALw.LIZ : abstractC26082ALm2, (i & 16) != 0 ? new C70840RrA(false) : c70840RrA);
    }
}
