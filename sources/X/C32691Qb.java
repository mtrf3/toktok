package X;

/* renamed from: X.1Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32691Qb extends AbstractC11740d8 {
    public final long LIZIZ;

    public final int hashCode() {
        return C61876OQe.LIZJ(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SolidColor(value=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LIZIZ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C32691Qb(long j) {
        this.LIZIZ = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C32691Qb) && C11850dJ.LIZJ(this.LIZIZ, ((C32691Qb) obj).LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC11740d8
    public final void LIZ(float f, long j, InterfaceC11550cp interfaceC11550cp) {
        long LIZIZ;
        interfaceC11550cp.setAlpha(1.0f);
        if (f == 1.0f) {
            LIZIZ = this.LIZIZ;
        } else {
            long j2 = this.LIZIZ;
            LIZIZ = C11850dJ.LIZIZ(j2, C11850dJ.LIZLLL(j2) * f);
        }
        interfaceC11550cp.LIZLLL(LIZIZ);
        if (interfaceC11550cp.LJIIIIZZ() != null) {
            interfaceC11550cp.LJIIJ(null);
        }
    }
}
