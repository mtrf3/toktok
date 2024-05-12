package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88773e5 implements InterfaceC208718Hb<C88773e5, C59072Tn> {
    public final C8HZ<C59072Tn> LJLIL;

    public C88773e5() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C59072Tn> getListItemState() {
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
        LIZ.append("AvatarEntryState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C59072Tn> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C88773e5(int i) {
        this((C8HZ<C59072Tn>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C88773e5) && o.LJ(this.LJLIL, ((C88773e5) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C88773e5(C8HZ<C59072Tn> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}
