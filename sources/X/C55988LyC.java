package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LyC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55988LyC implements InterfaceC208718Hb<C55988LyC, C50389Jq5> {
    public final C8HZ<C50389Jq5> LJLIL;
    public final AbstractC72932td<C49323JXj> LJLILLLLZI;
    public final AbstractC72932td<Object> LJLJI;

    public C55988LyC() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<C50389Jq5> getListItemState() {
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
        LIZ.append("SearchTabHorizontalState(listState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", horizontalData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", panelState=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<C50389Jq5> getListState() {
        return this.LJLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C55988LyC(int r4) {
        /*
            r3 = this;
            X.8HZ r2 = new X.8HZ
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            X.33X r0 = X.C33X.LIZ
            r3.<init>(r0, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55988LyC.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55988LyC)) {
            return false;
        }
        C55988LyC c55988LyC = (C55988LyC) obj;
        if (o.LJ(this.LJLIL, c55988LyC.LJLIL) && o.LJ(this.LJLILLLLZI, c55988LyC.LJLILLLLZI) && o.LJ(this.LJLJI, c55988LyC.LJLJI)) {
            return true;
        }
        return false;
    }

    public C55988LyC(AbstractC72932td horizontalData, AbstractC72932td panelState, C8HZ listState) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(horizontalData, "horizontalData");
        o.LJIIIZ(panelState, "panelState");
        this.LJLIL = listState;
        this.LJLILLLLZI = horizontalData;
        this.LJLJI = panelState;
    }
}
