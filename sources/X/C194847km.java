package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194847km implements InterfaceC208718Hb<C194847km, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final List<String> LJLILLLLZI;
    public final AbstractC194637kR LJLJI;
    public final C43I<Integer> LJLJJI;

    public C194847km() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        List<String> list = this.LJLILLLLZI;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode3 = (this.LJLJI.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        C43I<Integer> c43i = this.LJLJJI;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<InterfaceC57784Mm4> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public final AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowDistributionFeedListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", insertUserIds=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", nowPostState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", vmToastStrIdEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C194847km(int i) {
        this(new C8HZ(null, null, 15), null, C194627kQ.LIZ, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194847km)) {
            return false;
        }
        C194847km c194847km = (C194847km) obj;
        if (o.LJ(this.LJLIL, c194847km.LJLIL) && o.LJ(this.LJLILLLLZI, c194847km.LJLILLLLZI) && o.LJ(this.LJLJI, c194847km.LJLJI) && o.LJ(this.LJLJJI, c194847km.LJLJJI)) {
            return true;
        }
        return false;
    }

    public C194847km(C8HZ<InterfaceC57784Mm4> listState, List<String> list, AbstractC194637kR nowPostState, C43I<Integer> c43i) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(nowPostState, "nowPostState");
        this.LJLIL = listState;
        this.LJLILLLLZI = list;
        this.LJLJI = nowPostState;
        this.LJLJJI = c43i;
    }

    public static C194847km LIZ(C194847km c194847km, C8HZ listState, List list, AbstractC194637kR nowPostState, C43I c43i, int i) {
        if ((i & 1) != 0) {
            listState = c194847km.LJLIL;
        }
        if ((i & 2) != 0) {
            list = c194847km.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            nowPostState = c194847km.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i = c194847km.LJLJJI;
        }
        c194847km.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(nowPostState, "nowPostState");
        return new C194847km(listState, list, nowPostState, c43i);
    }
}
