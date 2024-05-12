package X;

import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242649fg implements InterfaceC208718Hb<C242649fg, InterfaceC57784Mm4> {
    public final AbstractC72932td<Boolean> LJLIL;
    public final C8HZ<InterfaceC57784Mm4> LJLILLLLZI;
    public final Integer LJLJI;

    public C242649fg() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        Integer num = this.LJLJI;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
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
        LIZ.append("HighlightsState(isEmptyList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", downloadProgress=");
        return s0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C242649fg(int i) {
        this(C33X.LIZ, new C8HZ(null, null, 15), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C242649fg)) {
            return false;
        }
        C242649fg c242649fg = (C242649fg) obj;
        if (o.LJ(this.LJLIL, c242649fg.LJLIL) && o.LJ(this.LJLILLLLZI, c242649fg.LJLILLLLZI) && o.LJ(this.LJLJI, c242649fg.LJLJI)) {
            return true;
        }
        return false;
    }

    public C242649fg(AbstractC72932td<Boolean> isEmptyList, C8HZ<InterfaceC57784Mm4> listState, Integer num) {
        o.LJIIIZ(isEmptyList, "isEmptyList");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = isEmptyList;
        this.LJLILLLLZI = listState;
        this.LJLJI = num;
    }

    public static C242649fg LIZ(C242649fg c242649fg, AbstractC72932td isEmptyList, C8HZ listState, Integer num, int i) {
        if ((i & 1) != 0) {
            isEmptyList = c242649fg.LJLIL;
        }
        if ((i & 2) != 0) {
            listState = c242649fg.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            num = c242649fg.LJLJI;
        }
        c242649fg.getClass();
        o.LJIIIZ(isEmptyList, "isEmptyList");
        o.LJIIIZ(listState, "listState");
        return new C242649fg(isEmptyList, listState, num);
    }
}
