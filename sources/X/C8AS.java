package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8AS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8AS implements InterfaceC208718Hb<C8AS, C2050482y> {
    public final C43I<C76800UCe> LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final C206898Ab LJLJI;
    public final C8HZ<C2050482y> LJLJJI;

    public C8AS() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        C43I<C76800UCe> c43i = this.LJLIL;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = hashCode * 31;
        C43I<C76800UCe> c43i2 = this.LJLILLLLZI;
        if (c43i2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c43i2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C206898Ab c206898Ab = this.LJLJI;
        if (c206898Ab != null) {
            i = c206898Ab.hashCode();
        }
        return this.LJLJJI.hashCode() + ((i3 + i) * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C2050482y> getListItemState() {
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
        LIZ.append("ExploreFeedState(emptyNoticeEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", refreshFinishEvent=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", externalRefreshedTriggered=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C2050482y> getListState() {
        return this.LJLJJI;
    }

    public /* synthetic */ C8AS(int i) {
        this(null, null, null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8AS)) {
            return false;
        }
        C8AS c8as = (C8AS) obj;
        if (o.LJ(this.LJLIL, c8as.LJLIL) && o.LJ(this.LJLILLLLZI, c8as.LJLILLLLZI) && o.LJ(this.LJLJI, c8as.LJLJI) && o.LJ(this.LJLJJI, c8as.LJLJJI)) {
            return true;
        }
        return false;
    }

    public C8AS(C43I<C76800UCe> c43i, C43I<C76800UCe> c43i2, C206898Ab c206898Ab, C8HZ<C2050482y> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
        this.LJLJI = c206898Ab;
        this.LJLJJI = listState;
    }

    public static C8AS LIZ(C8AS c8as, C43I c43i, C43I c43i2, C206898Ab c206898Ab, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            c43i = c8as.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i2 = c8as.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c206898Ab = c8as.LJLJI;
        }
        if ((i & 8) != 0) {
            listState = c8as.LJLJJI;
        }
        c8as.getClass();
        o.LJIIIZ(listState, "listState");
        return new C8AS(c43i, c43i2, c206898Ab, listState);
    }
}
