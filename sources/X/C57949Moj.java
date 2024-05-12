package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Moj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57949Moj implements InterfaceC208718Hb<C57949Moj, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final List<InterfaceC57784Mm4> LJLILLLLZI;
    public final boolean LJLJI;
    public final C43I<Integer> LJLJJI;

    public C57949Moj() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        List<InterfaceC57784Mm4> list = this.LJLILLLLZI;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        boolean z = this.LJLJI;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        C43I<Integer> c43i = this.LJLJJI;
        if (c43i != null) {
            i = c43i.hashCode();
        }
        return i4 + i;
    }

    public final boolean LIZIZ() {
        if (C208708Ha.LIZJ(this) instanceof C33X) {
            C223208pQ LIZ = C208708Ha.LIZLLL(this).LIZ();
            if (LIZ != null && LIZ.LJLILLLLZI) {
                return true;
            }
        } else {
            C223208pQ LIZ2 = C208708Ha.LIZJ(this).LIZ();
            if (LIZ2 != null && LIZ2.LJLILLLLZI) {
                return true;
            }
        }
        return false;
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
        LIZ.append("UserCardListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", items=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sourceSetup=");
        LIZ.append(this.LJLJI);
        LIZ.append(", toast=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C57949Moj(int i) {
        this(new C8HZ(null, null, 15), null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57949Moj)) {
            return false;
        }
        C57949Moj c57949Moj = (C57949Moj) obj;
        if (o.LJ(this.LJLIL, c57949Moj.LJLIL) && o.LJ(this.LJLILLLLZI, c57949Moj.LJLILLLLZI) && this.LJLJI == c57949Moj.LJLJI && o.LJ(this.LJLJJI, c57949Moj.LJLJJI)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57949Moj(C8HZ<InterfaceC57784Mm4> listState, List<? extends InterfaceC57784Mm4> list, boolean z, C43I<Integer> c43i) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = list;
        this.LJLJI = z;
        this.LJLJJI = c43i;
    }

    public static C57949Moj LIZ(C57949Moj c57949Moj, C8HZ listState, List list, boolean z, C43I c43i, int i) {
        if ((i & 1) != 0) {
            listState = c57949Moj.LJLIL;
        }
        if ((i & 2) != 0) {
            list = c57949Moj.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c57949Moj.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i = c57949Moj.LJLJJI;
        }
        c57949Moj.getClass();
        o.LJIIIZ(listState, "listState");
        return new C57949Moj(listState, list, z, c43i);
    }
}
