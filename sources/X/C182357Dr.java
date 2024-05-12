package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182357Dr implements InterfaceC208718Hb<C182357Dr, C7F4> {
    public final C8HZ<C7F4> LJLIL;

    public C182357Dr() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C7F4> getListItemState() {
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
        LIZ.append("StoryArchState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C7F4> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C182357Dr(int i) {
        this((C8HZ<C7F4>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C182357Dr) && o.LJ(this.LJLIL, ((C182357Dr) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C182357Dr(C8HZ<C7F4> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}
