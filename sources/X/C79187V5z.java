package X;

import kotlin.jvm.internal.o;

/* renamed from: X.V5z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79187V5z {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;
    public final C0SX LJIIIIZZ;
    public final C0SX LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79187V5z)) {
            return false;
        }
        C79187V5z c79187V5z = (C79187V5z) obj;
        return C11850dJ.LIZJ(this.LIZ, c79187V5z.LIZ) && C11850dJ.LIZJ(this.LIZIZ, c79187V5z.LIZIZ) && C11850dJ.LIZJ(this.LIZJ, c79187V5z.LIZJ) && Float.compare(this.LIZLLL, c79187V5z.LIZLLL) == 0 && Float.compare(this.LJ, c79187V5z.LJ) == 0 && C11850dJ.LIZJ(this.LJFF, c79187V5z.LJFF) && C11850dJ.LIZJ(this.LJI, c79187V5z.LJI) && C11850dJ.LIZJ(this.LJII, c79187V5z.LJII) && o.LJ(this.LJIIIIZZ, c79187V5z.LJIIIIZZ) && o.LJ(this.LJIIIZ, c79187V5z.LJIIIZ) && C11850dJ.LIZJ(this.LJIIJ, c79187V5z.LJIIJ) && C11850dJ.LIZJ(this.LJIIJJI, c79187V5z.LJIIJJI);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C06540Nm.LIZ(this.LJII, C06540Nm.LIZ(this.LJI, C06540Nm.LIZ(this.LJFF, C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, C06540Nm.LIZ(this.LIZJ, C06540Nm.LIZ(this.LIZIZ, C61876OQe.LIZJ(this.LIZ) * 31, 31), 31), 31), 31), 31), 31), 31);
        C0SX c0sx = this.LJIIIIZZ;
        int i = 0;
        if (c0sx == null) {
            hashCode = 0;
        } else {
            hashCode = c0sx.hashCode();
        }
        int i2 = (LIZ + hashCode) * 31;
        C0SX c0sx2 = this.LJIIIZ;
        if (c0sx2 != null) {
            i = c0sx2.hashCode();
        }
        return C61876OQe.LIZJ(this.LJIIJJI) + C06540Nm.LIZ(this.LJIIJ, (i2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TuxButtonVariantScheme(textColor=");
        C78920UyC.LJ(this.LIZ, sb, ", backgroundColor=");
        C78920UyC.LJ(this.LIZIZ, sb, ", contentColor=");
        C78920UyC.LJ(this.LIZJ, sb, ", alpha=");
        sb.append(this.LIZLLL);
        sb.append(", disabledAlpha=");
        sb.append(this.LJ);
        sb.append(", iconTintColor=");
        C78920UyC.LJ(this.LJFF, sb, ", disabledTintColor=");
        C78920UyC.LJ(this.LJI, sb, ", disabledTextColor=");
        C78920UyC.LJ(this.LJII, sb, ", stroke=");
        sb.append(this.LJIIIIZZ);
        sb.append(", disabledStroke=");
        sb.append(this.LJIIIZ);
        sb.append(", disabledBackgroundColor=");
        C78920UyC.LJ(this.LJIIJ, sb, ", disableContentColor=");
        sb.append((Object) C11850dJ.LJIIIIZZ(this.LJIIJJI));
        sb.append(')');
        return sb.toString();
    }

    public C79187V5z(long j, long j2, long j3, float f, long j4, long j5, long j6, C0SX c0sx, C0SX c0sx2, long j7, long j8, int i) {
        long j9 = j6;
        long j10 = j5;
        long j11 = j8;
        long j12 = j7;
        C0SX c0sx3 = c0sx;
        C0SX c0sx4 = c0sx2;
        float f2 = (i & 16) != 0 ? 1.0f : f;
        j10 = (i & 64) != 0 ? j4 : j10;
        j9 = (i & 128) != 0 ? j : j9;
        c0sx3 = (i & 256) != 0 ? null : c0sx3;
        c0sx4 = (i & 512) != 0 ? c0sx3 : c0sx4;
        j12 = (i & 1024) != 0 ? j2 : j12;
        j11 = (i & 2048) != 0 ? j3 : j11;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = 1.0f;
        this.LJ = f2;
        this.LJFF = j4;
        this.LJI = j10;
        this.LJII = j9;
        this.LJIIIIZZ = c0sx3;
        this.LJIIIZ = c0sx4;
        this.LJIIJ = j12;
        this.LJIIJJI = j11;
    }
}
