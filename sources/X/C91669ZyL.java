package X;

/* renamed from: X.ZyL, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91669ZyL {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91669ZyL)) {
            return false;
        }
        C91669ZyL c91669ZyL = (C91669ZyL) obj;
        return C11850dJ.LIZJ(this.LIZ, c91669ZyL.LIZ) && C11850dJ.LIZJ(this.LIZIZ, c91669ZyL.LIZIZ) && C11850dJ.LIZJ(this.LIZJ, c91669ZyL.LIZJ) && C11850dJ.LIZJ(this.LIZLLL, c91669ZyL.LIZLLL) && C11850dJ.LIZJ(this.LJ, c91669ZyL.LJ) && C11850dJ.LIZJ(this.LJFF, c91669ZyL.LJFF) && C11850dJ.LIZJ(this.LJI, c91669ZyL.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipoThemeConfiguration(primaryColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LIZ));
        LIZ.append(", primaryBackgroundColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LIZIZ));
        LIZ.append(", primaryTextColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LIZJ));
        LIZ.append(", errorColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LIZLLL));
        LIZ.append(", dropdownItemTappedBackgroundColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LJ));
        LIZ.append(", tagBackgroundColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LJFF));
        LIZ.append(", tagInvalidBackgroundColor=");
        LIZ.append((Object) C11850dJ.LJIIIIZZ(this.LJI));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return (((((((((((C61876OQe.LIZJ(this.LIZ) * 31) + C61876OQe.LIZJ(this.LIZIZ)) * 31) + C61876OQe.LIZJ(this.LIZJ)) * 31) + C61876OQe.LIZJ(this.LIZLLL)) * 31) + C61876OQe.LIZJ(this.LJ)) * 31) + C61876OQe.LIZJ(this.LJFF)) * 31) + C61876OQe.LIZJ(this.LJI);
    }

    public C91669ZyL(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
        this.LJ = j5;
        this.LJFF = j6;
        this.LJI = j7;
    }
}
