package X;

import android.os.Build;

/* renamed from: X.0VP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VP {
    public static final C0VP LJIIIIZZ = new C0VP(new C0VO());
    public C0VX LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public C0VR LJII;

    public final int hashCode() {
        int hashCode = ((((((((this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZJ ? 1 : 0)) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31;
        long j = this.LJFF;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.LJI;
        return this.LJII.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public C0VP() {
        this.LIZ = C0VX.NOT_REQUIRED;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = new C0VR();
    }

    public C0VP(C0VO c0vo) {
        this.LIZ = C0VX.NOT_REQUIRED;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = new C0VR();
        this.LIZIZ = false;
        int i = Build.VERSION.SDK_INT;
        this.LIZJ = false;
        this.LIZ = c0vo.LIZ;
        this.LIZLLL = false;
        this.LJ = false;
        if (i >= 24) {
            this.LJII = c0vo.LIZLLL;
            this.LJFF = c0vo.LIZIZ;
            this.LJI = c0vo.LIZJ;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0VP.class != obj.getClass()) {
            return false;
        }
        C0VP c0vp = (C0VP) obj;
        if (this.LIZIZ != c0vp.LIZIZ || this.LIZJ != c0vp.LIZJ || this.LIZLLL != c0vp.LIZLLL || this.LJ != c0vp.LJ || this.LJFF != c0vp.LJFF || this.LJI != c0vp.LJI || this.LIZ != c0vp.LIZ) {
            return false;
        }
        return this.LJII.equals(c0vp.LJII);
    }

    public C0VP(C0VP c0vp) {
        this.LIZ = C0VX.NOT_REQUIRED;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = new C0VR();
        this.LIZIZ = c0vp.LIZIZ;
        this.LIZJ = c0vp.LIZJ;
        this.LIZ = c0vp.LIZ;
        this.LIZLLL = c0vp.LIZLLL;
        this.LJ = c0vp.LJ;
        this.LJII = c0vp.LJII;
    }
}
