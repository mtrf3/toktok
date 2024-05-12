package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186897Vd implements InterfaceC208718Hb<C186897Vd, AnonymousClass886> {
    public final C8HZ<AnonymousClass886> LJLIL;
    public final C43I<Integer> LJLILLLLZI;

    public C186897Vd() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LJLIL.hashCode() * 31;
        C43I<Integer> c43i = this.LJLILLLLZI;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // X.InterfaceC2064888m
    public final List<AnonymousClass886> getListItemState() {
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
        LIZ.append("PlaylistCollectionState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", scrollToPositionEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<AnonymousClass886> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C186897Vd(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C186897Vd)) {
            return false;
        }
        C186897Vd c186897Vd = (C186897Vd) obj;
        if (o.LJ(this.LJLIL, c186897Vd.LJLIL) && o.LJ(this.LJLILLLLZI, c186897Vd.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C186897Vd(C43I c43i, C8HZ listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = c43i;
    }
}
