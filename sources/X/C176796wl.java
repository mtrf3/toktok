package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176796wl {
    public final boolean LIZ;
    public final String LIZIZ;
    public final long LJ;
    public final InterfaceC174196sZ LJIIIIZZ;
    public final Boolean LIZJ = null;
    public int LIZLLL = 0;
    public long LJFF = 0;
    public long LJI = 0;
    public long LJII = 0;
    public boolean LJIIIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C176796wl)) {
            return false;
        }
        C176796wl c176796wl = (C176796wl) obj;
        return this.LIZ == c176796wl.LIZ && o.LJ(this.LIZIZ, c176796wl.LIZIZ) && o.LJ(this.LIZJ, c176796wl.LIZJ) && this.LIZLLL == c176796wl.LIZLLL && this.LJ == c176796wl.LJ && this.LJFF == c176796wl.LJFF && this.LJI == c176796wl.LJI && this.LJII == c176796wl.LJII && o.LJ(this.LJIIIIZZ, c176796wl.LJIIIIZZ) && this.LJIIIZ == c176796wl.LJIIIZ;
    }

    public final long LIZ() {
        long j = this.LJFF;
        long j2 = this.LJ;
        if (1 <= j2 && j2 < j) {
            return j - j2;
        }
        return -1L;
    }

    public final long LIZIZ() {
        long j = this.LJI;
        long j2 = this.LJFF;
        if (1 <= j2 && j2 < j) {
            return j - j2;
        }
        return -1L;
    }

    public final long LIZJ() {
        long j;
        long j2 = this.LJ;
        if (1 <= j2) {
            if (j2 < this.LJII) {
                j = this.LJII;
            } else if (j2 < this.LJI) {
                j = this.LJI;
            }
            return j - j2;
        }
        return -1L;
    }

    public final long LIZLLL() {
        long j = this.LJII;
        long j2 = this.LJI;
        if (1 <= j2 && j2 < j) {
            return j - j2;
        }
        return -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        String str = this.LIZIZ;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Boolean bool = this.LIZJ;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LJII, JBR.LIZJ(this.LJI, JBR.LIZJ(this.LJFF, JBR.LIZJ(this.LJ, (((i4 + hashCode2) * 31) + this.LIZLLL) * 31, 31), 31), 31), 31);
        InterfaceC174196sZ interfaceC174196sZ = this.LJIIIIZZ;
        if (interfaceC174196sZ != null) {
            i3 = interfaceC174196sZ.hashCode();
        }
        int i5 = (LIZJ + i3) * 31;
        if (!this.LJIIIZ) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TimeRecorder(isFirstShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", eventType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isLoadSuccess=");
        LIZ.append(this.LIZJ);
        LIZ.append(", loadDataCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showFragmentStartAt=");
        LIZ.append(this.LJ);
        LIZ.append(", networkStartAt=");
        LIZ.append(this.LJFF);
        LIZ.append(", networkFinishedAt=");
        LIZ.append(this.LJI);
        LIZ.append(", viewHolderFinishedAt=");
        LIZ.append(this.LJII);
        LIZ.append(", listener=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", isFirstLoad=");
        return C48339Iy7.LIZJ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C176796wl(boolean z, String str, long j, C176816wn c176816wn) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LJ = j;
        this.LJIIIIZZ = c176816wn;
    }
}
