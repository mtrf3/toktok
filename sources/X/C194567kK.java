package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194567kK implements InterfaceC208718Hb<C194567kK, InterfaceC194547kI> {
    public final C8HZ<InterfaceC194547kI> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;

    public C194567kK() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31) + this.LJLJJI) * 31;
        boolean z = this.LJLJJL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @Override // X.InterfaceC2064888m
    public final List<InterfaceC194547kI> getListItemState() {
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
        LIZ.append("NowOtherCollectionState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", nowSize=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", localTotalCount=");
        LIZ.append(this.LJLJI);
        LIZ.append(", selectionPageIndex=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", userRowVisible=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC194547kI> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C194567kK(int i) {
        this(new C8HZ(null, null, 15), 0, 0, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C194567kK)) {
            return false;
        }
        C194567kK c194567kK = (C194567kK) obj;
        if (o.LJ(this.LJLIL, c194567kK.LJLIL) && this.LJLILLLLZI == c194567kK.LJLILLLLZI && this.LJLJI == c194567kK.LJLJI && this.LJLJJI == c194567kK.LJLJJI && this.LJLJJL == c194567kK.LJLJJL) {
            return true;
        }
        return false;
    }

    public C194567kK(C8HZ<InterfaceC194547kI> listState, int i, int i2, int i3, boolean z) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = z;
    }

    public static C194567kK LIZ(C194567kK c194567kK, C8HZ c8hz, int i, int i2, int i3, boolean z, int i4) {
        boolean z2 = z;
        int i5 = i3;
        int i6 = i2;
        C8HZ listState = c8hz;
        int i7 = i;
        if ((i4 & 1) != 0) {
            listState = c194567kK.LJLIL;
        }
        if ((i4 & 2) != 0) {
            i7 = c194567kK.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            i6 = c194567kK.LJLJI;
        }
        if ((i4 & 8) != 0) {
            i5 = c194567kK.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            z2 = c194567kK.LJLJJL;
        }
        c194567kK.getClass();
        o.LJIIIZ(listState, "listState");
        return new C194567kK(listState, i7, i6, i5, z2);
    }
}
