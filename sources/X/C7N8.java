package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7N8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7N8 implements InterfaceC208718Hb<C7N8, InterfaceC57784Mm4> {
    public final C8HZ<InterfaceC57784Mm4> LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    public C7N8() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LJ = (C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31) + this.LJLJI) * 31;
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
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
        LIZ.append("NowDetailListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", aid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", awemeType=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isVideo=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C7N8(int i) {
        this(new C8HZ(null, null, 15), "", 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7N8)) {
            return false;
        }
        C7N8 c7n8 = (C7N8) obj;
        if (o.LJ(this.LJLIL, c7n8.LJLIL) && o.LJ(this.LJLILLLLZI, c7n8.LJLILLLLZI) && this.LJLJI == c7n8.LJLJI && this.LJLJJI == c7n8.LJLJJI) {
            return true;
        }
        return false;
    }

    public C7N8(C8HZ<InterfaceC57784Mm4> listState, String aid, int i, boolean z) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(aid, "aid");
        this.LJLIL = listState;
        this.LJLILLLLZI = aid;
        this.LJLJI = i;
        this.LJLJJI = z;
    }

    public static C7N8 LIZ(C7N8 c7n8, C8HZ listState, String aid, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            listState = c7n8.LJLIL;
        }
        if ((i2 & 2) != 0) {
            aid = c7n8.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            i = c7n8.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z = c7n8.LJLJJI;
        }
        c7n8.getClass();
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(aid, "aid");
        return new C7N8(listState, aid, i, z);
    }
}
