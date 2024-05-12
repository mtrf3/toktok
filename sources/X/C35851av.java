package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35851av<N> implements InterfaceC24420xa<N> {
    public final InterfaceC24420xa<N> LIZ;
    public final int LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC24420xa
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC24420xa
    public final /* synthetic */ void LJFF() {
    }

    @Override // X.InterfaceC24420xa
    public final N LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.InterfaceC24420xa
    public final void LJIIIIZZ() {
        int i = this.LIZJ;
        if (i > 0) {
            this.LIZJ = i - 1;
            this.LIZ.LJIIIIZZ();
        } else {
            "OffsetApplier up called with no corresponding down".toString();
            C24780yA.LIZJ("OffsetApplier up called with no corresponding down");
            throw null;
        }
    }

    @Override // X.InterfaceC24420xa
    public final void clear() {
        "Clear is not valid on OffsetApplier".toString();
        C24780yA.LIZJ("Clear is not valid on OffsetApplier");
        throw null;
    }

    @Override // X.InterfaceC24420xa
    public final void LIZLLL(N n2) {
        this.LIZJ++;
        this.LIZ.LIZLLL(n2);
    }

    public C35851av(InterfaceC24420xa<N> applier, int i) {
        o.LJIIIZ(applier, "applier");
        this.LIZ = applier;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC24420xa
    public final void LIZJ(int i, N n2) {
        int i2;
        InterfaceC24420xa<N> interfaceC24420xa = this.LIZ;
        if (this.LIZJ == 0) {
            i2 = this.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC24420xa.LIZJ(i + i2, n2);
    }

    @Override // X.InterfaceC24420xa
    public final void LJ(int i, int i2) {
        int i3;
        InterfaceC24420xa<N> interfaceC24420xa = this.LIZ;
        if (this.LIZJ == 0) {
            i3 = this.LIZIZ;
        } else {
            i3 = 0;
        }
        interfaceC24420xa.LJ(i + i3, i2);
    }

    @Override // X.InterfaceC24420xa
    public final void LJII(int i, N n2) {
        int i2;
        InterfaceC24420xa<N> interfaceC24420xa = this.LIZ;
        if (this.LIZJ == 0) {
            i2 = this.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC24420xa.LJII(i + i2, n2);
    }

    @Override // X.InterfaceC24420xa
    public final void LJI(int i, int i2, int i3) {
        int i4;
        if (this.LIZJ == 0) {
            i4 = this.LIZIZ;
        } else {
            i4 = 0;
        }
        this.LIZ.LJI(i + i4, i2 + i4, i3);
    }
}
