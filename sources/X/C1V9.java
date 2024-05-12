package X;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1V9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1V9 extends AbstractC20690rZ {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public long LJI;
    public final AtomicBoolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;

    public C1V9() {
        this(0);
    }

    public static long LIZLLL(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return -1L;
        }
        return j2 - j;
    }

    @Override // X.AbstractC20690rZ
    public final void LIZ() {
        this.LJII.compareAndSet(true, false);
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = null;
        this.LJFF = null;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
    }

    @Override // X.AbstractC20690rZ
    public final boolean LIZJ() {
        return this.LJII.get();
    }

    @Override // X.AbstractC20690rZ
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C1V9(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = null;
        this.LJFF = null;
        this.LJI = elapsedRealtime;
        this.LJII = atomicBoolean;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
    }

    public static void LJ(C1V9 c1v9, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7 = str5;
        String str8 = str6;
        String str9 = null;
        if ((i & 16) != 0) {
            str7 = null;
        }
        if ((i & 32) != 0) {
            str8 = null;
        }
        if ((i & 64) != 0) {
            str9 = "";
        }
        C43588H8u.LIZLLL(str2, "repoName", str3, "repoType", str4, "repoPath", str9, "thread");
        c1v9.LJII.set(true);
        c1v9.LIZ = str;
        c1v9.LIZIZ = str2;
        c1v9.LIZJ = str3;
        c1v9.LIZLLL = str4;
        c1v9.LJ = str7;
        c1v9.LJFF = str8;
        c1v9.LJI = SystemClock.elapsedRealtime();
    }
}
