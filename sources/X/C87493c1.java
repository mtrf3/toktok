package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87493c1 implements InterfaceC208718Hb<C87493c1, C87123bQ> {
    public final C8HZ<C87123bQ> LJLIL;

    public C87493c1() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // X.InterfaceC2064888m
    public final List<C87123bQ> getListItemState() {
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
        LIZ.append("VideoStickerNotificationUserState(listState=");
        return FT5.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C87123bQ> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ C87493c1(int i) {
        this((C8HZ<C87123bQ>) new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C87493c1) && o.LJ(this.LJLIL, ((C87493c1) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public C87493c1(C8HZ<C87123bQ> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
    }
}
