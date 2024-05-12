package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48361v6<T> implements InterfaceC41451jx<T> {
    public final int LIZ;
    public final int LIZIZ;
    public final InterfaceC07020Pi LIZJ;

    public C48361v6() {
        this(0, (InterfaceC07020Pi) null, 7);
    }

    public final int hashCode() {
        return ((this.LIZJ.hashCode() + (this.LIZ * 31)) * 31) + this.LIZIZ;
    }

    @Override // X.C0Q2
    public final C0QF LIZ(C0QC converter) {
        o.LJIIIZ(converter, "converter");
        return new C41441jw(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C48361v6)) {
            return false;
        }
        C48361v6 c48361v6 = (C48361v6) obj;
        if (c48361v6.LIZ != this.LIZ || c48361v6.LIZIZ != this.LIZIZ || !o.LJ(c48361v6.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC41451jx, X.C0Q2
    public final C1J0 LIZ(C0QC converter) {
        o.LJIIIZ(converter, "converter");
        return new C41441jw(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public /* synthetic */ C48361v6(int i, InterfaceC07020Pi interfaceC07020Pi, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? C07040Pk.LIZ : interfaceC07020Pi);
    }

    public C48361v6(int i, int i2, InterfaceC07020Pi easing) {
        o.LJIIIZ(easing, "easing");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = easing;
    }
}
