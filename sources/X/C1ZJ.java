package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ZJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZJ implements InterfaceC21340sc {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final int hashCode() {
        return C61876OQe.LIZJ(this.LIZLLL) + C06540Nm.LIZ(this.LIZJ, C06540Nm.LIZ(this.LIZIZ, C61876OQe.LIZJ(this.LIZ) * 31, 31), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C65352Pkq.LIZ(C1ZJ.class), C65352Pkq.LIZ(obj.getClass()))) {
            return false;
        }
        C1ZJ c1zj = (C1ZJ) obj;
        if (C11850dJ.LIZJ(this.LIZ, c1zj.LIZ) && C11850dJ.LIZJ(this.LIZIZ, c1zj.LIZIZ) && C11850dJ.LIZJ(this.LIZJ, c1zj.LIZJ) && C11850dJ.LIZJ(this.LIZLLL, c1zj.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21340sc
    public final InterfaceC35811ar LIZ(boolean z, InterfaceC24520xk interfaceC24520xk) {
        long j;
        interfaceC24520xk.LJJIIJ(-2133647540);
        if (z) {
            j = this.LIZIZ;
        } else {
            j = this.LIZLLL;
        }
        InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(new C11850dJ(j), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return LJJJJIZL;
    }

    @Override // X.InterfaceC21340sc
    public final InterfaceC35811ar LIZIZ(boolean z, InterfaceC24520xk interfaceC24520xk) {
        long j;
        interfaceC24520xk.LJJIIJ(-655254499);
        if (z) {
            j = this.LIZ;
        } else {
            j = this.LIZJ;
        }
        InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(new C11850dJ(j), interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return LJJJJIZL;
    }

    public C1ZJ(long j, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
    }
}
