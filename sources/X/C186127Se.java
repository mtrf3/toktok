package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186127Se implements InterfaceC208718Hb<C186127Se, C186177Sj> {
    public final C8HZ<C186177Sj> LJLIL;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C186177Sj> getListItemState() {
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
        LIZ.append("TopicReviewListState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C186177Sj> getListState() {
        return this.LJLIL;
    }

    public C186127Se(C8HZ<C186177Sj> c8hz) {
        this.LJLIL = c8hz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C186127Se) && o.LJ(this.LJLIL, ((C186127Se) obj).LJLIL)) {
            return true;
        }
        return false;
    }
}
