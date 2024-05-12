package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207148Ba implements InterfaceC208718Hb<C207148Ba, C59992Xb> {
    public final C206898Ab LJLIL;
    public final C8HZ<C59992Xb> LJLILLLLZI;

    public C207148Ba() {
        this(0);
    }

    public final int hashCode() {
        int hashCode;
        C206898Ab c206898Ab = this.LJLIL;
        if (c206898Ab == null) {
            hashCode = 0;
        } else {
            hashCode = c206898Ab.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C59992Xb> getListItemState() {
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
        LIZ.append("LiveDualFeedState(externalRefreshedTriggered=");
        LIZ.append(this.LJLIL);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C59992Xb> getListState() {
        return this.LJLILLLLZI;
    }

    public /* synthetic */ C207148Ba(int i) {
        this(null, new C8HZ(null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C207148Ba)) {
            return false;
        }
        C207148Ba c207148Ba = (C207148Ba) obj;
        if (o.LJ(this.LJLIL, c207148Ba.LJLIL) && o.LJ(this.LJLILLLLZI, c207148Ba.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C207148Ba(C206898Ab c206898Ab, C8HZ<C59992Xb> listState) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = c206898Ab;
        this.LJLILLLLZI = listState;
    }
}
