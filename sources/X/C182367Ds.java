package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182367Ds implements InterfaceC208718Hb<C182367Ds, C57712Mku> {
    public final C8HZ<C57712Mku> LJLIL;

    public C182367Ds() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C57712Mku> getListItemState() {
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
        LIZ.append("RecUserVideoListState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C57712Mku> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C182367Ds(int i) {
        this((C8HZ<C57712Mku>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C182367Ds) && o.LJ(this.LJLIL, ((C182367Ds) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C182367Ds(C8HZ<C57712Mku> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}
