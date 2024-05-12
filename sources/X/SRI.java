package X;

import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SRI implements InterfaceC208718Hb<SRI, C9QW> {
    public final C8HZ<C9QW> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public SRI() {
        this(0);
    }

    public final int hashCode() {
        return (((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31) + this.LJLJI;
    }

    @Override // X.InterfaceC2064888m
    public final List<C9QW> getListItemState() {
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
        LIZ.append("VideoListState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", position=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", loadingTimeOver=");
        return b0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C9QW> getListState() {
        return this.LJLIL;
    }

    public /* synthetic */ SRI(int i) {
        this(new C8HZ(null, null, 15), 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRI)) {
            return false;
        }
        SRI sri = (SRI) obj;
        if (o.LJ(this.LJLIL, sri.LJLIL) && this.LJLILLLLZI == sri.LJLILLLLZI && this.LJLJI == sri.LJLJI) {
            return true;
        }
        return false;
    }

    public SRI(C8HZ<C9QW> listState, int i, int i2) {
        o.LJIIIZ(listState, "listState");
        this.LJLIL = listState;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    public static SRI LIZ(SRI sri, C8HZ listState, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            listState = sri.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i3 = sri.LJLILLLLZI;
        } else {
            i3 = 0;
        }
        if ((i2 & 4) != 0) {
            i = sri.LJLJI;
        }
        sri.getClass();
        o.LJIIIZ(listState, "listState");
        return new SRI(listState, i3, i);
    }
}
