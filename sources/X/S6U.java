package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S6U implements InterfaceC208718Hb<S6U, InterfaceC57784Mm4> {
    public final AbstractC72932td<Boolean> LJLIL;
    public final AbstractC72932td<Boolean> LJLILLLLZI;
    public final C8HZ<InterfaceC57784Mm4> LJLJI;

    public S6U() {
        this(0);
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    @Override // X.InterfaceC2064888m
    public final List<InterfaceC57784Mm4> getListItemState() {
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
        LIZ.append("TemplatesState(useEffectStatus=");
        LIZ.append(this.LJLIL);
        LIZ.append(", cancelDisplayStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", listState=");
        return FT5.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    @Override // X.InterfaceC2064788l
    public final C8HZ<InterfaceC57784Mm4> getListState() {
        return this.LJLJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ S6U(int r5) {
        /*
            r4 = this;
            X.33X r3 = X.C33X.LIZ
            X.8HZ r2 = new X.8HZ
            r1 = 15
            r0 = 0
            r2.<init>(r0, r0, r1)
            r4.<init>(r3, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S6U.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S6U)) {
            return false;
        }
        S6U s6u = (S6U) obj;
        if (o.LJ(this.LJLIL, s6u.LJLIL) && o.LJ(this.LJLILLLLZI, s6u.LJLILLLLZI) && o.LJ(this.LJLJI, s6u.LJLJI)) {
            return true;
        }
        return false;
    }

    public S6U(AbstractC72932td<Boolean> useEffectStatus, AbstractC72932td<Boolean> cancelDisplayStatus, C8HZ<InterfaceC57784Mm4> listState) {
        o.LJIIIZ(useEffectStatus, "useEffectStatus");
        o.LJIIIZ(cancelDisplayStatus, "cancelDisplayStatus");
        o.LJIIIZ(listState, "listState");
        this.LJLIL = useEffectStatus;
        this.LJLILLLLZI = cancelDisplayStatus;
        this.LJLJI = listState;
    }

    public static S6U LIZ(S6U s6u, AbstractC72932td useEffectStatus, AbstractC72932td cancelDisplayStatus, C8HZ listState, int i) {
        if ((i & 1) != 0) {
            useEffectStatus = s6u.LJLIL;
        }
        if ((i & 2) != 0) {
            cancelDisplayStatus = s6u.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            listState = s6u.LJLJI;
        }
        s6u.getClass();
        o.LJIIIZ(useEffectStatus, "useEffectStatus");
        o.LJIIIZ(cancelDisplayStatus, "cancelDisplayStatus");
        o.LJIIIZ(listState, "listState");
        return new S6U(useEffectStatus, cancelDisplayStatus, listState);
    }
}
