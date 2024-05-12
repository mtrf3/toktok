package X;

import Y.ARunnableS30S0200000_11;
import Y.IDRunnableS29S0200000;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PH4 {
    public static boolean LJIILIIL;
    public final String LIZ;
    public volatile boolean LIZIZ;
    public PH7 LIZJ;
    public PH6 LIZLLL;
    public final PH3 LJ;
    public PH5 LJFF;
    public LinkedList<Integer> LJI;
    public final HashMap<String, String> LJII;
    public final boolean LJIIIIZZ;
    public final JSONObject LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIL;

    public PH4() {
        throw null;
    }

    public final synchronized void LJ() {
        PH3 ph3 = this.LJ;
        if (ph3 != null) {
            ph3.LIZLLL();
        } else {
            LIZ();
            C06140Ly.LIZJ(this.LIZ);
        }
    }

    public final void LIZ() {
        int i;
        if (!this.LIZIZ) {
            return;
        }
        long j = this.LJIIJJI - this.LJIIJ;
        if (j > 0 && (i = this.LJIIL) > 1) {
            long j2 = ((((i - 1) * 1000) * 1000) * 1000) / j;
            PH7 ph7 = this.LIZJ;
            if (ph7 != null) {
                ph7.LIZLLL(j2);
            }
            C64185PGz c64185PGz = PH2.LIZ;
            HashMap<String, String> hashMap = this.LJII;
            c64185PGz.getClass();
            F9U.LIZ.LIZJ(new PH0(c64185PGz, this.LIZ, hashMap, (float) j2));
        }
        if (this.LJFF != null) {
            C16880lQ.LLIIIJ().removeFrameCallback(this.LJFF);
        }
        synchronized (this) {
            if (!this.LJI.isEmpty()) {
                LinkedList<Integer> linkedList = this.LJI;
                this.LJI = new LinkedList<>();
                F9U.LIZ.LIZJ(new ARunnableS30S0200000_11(this, linkedList, 30));
            }
        }
        this.LIZIZ = false;
    }

    public final boolean LIZIZ() {
        if (C09970aH.LJIJI && (C64099PDr.LIZIZ("fps_drop", this.LIZ) || C64099PDr.LIZIZ("fps", this.LIZ))) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        PH3 ph3 = this.LJ;
        if (ph3 != null) {
            if (ph3.LIZIZ) {
                return;
            }
            if (!ph3.LJIIIZ && !ph3.LIZJ()) {
                return;
            }
            C36381bm c36381bm = C36381bm.LJIL;
            if (!c36381bm.LJIJ) {
                c36381bm.LIZLLL(PH3.LJIIL);
            }
            if (PH3.LJIIL != null) {
                ph3.LIZIZ = true;
                C44061oA c44061oA = PH3.LJIIL;
                c44061oA.getClass();
                c36381bm.LJIILIIL.LIZ(new IDRunnableS29S0200000(ph3, c44061oA, 42));
            }
            C06140Ly.LIZ(ph3.LIZ);
            SystemClock.uptimeMillis();
            ph3.LIZIZ = true;
            return;
        }
        if (this.LIZIZ) {
            return;
        }
        if (!this.LJIIIIZZ && !LIZIZ()) {
            return;
        }
        synchronized (this) {
            this.LJI.clear();
        }
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = 0;
        this.LJFF = new PH5(this);
        try {
            C16880lQ.LLIIIJ().postFrameCallback(this.LJFF);
        } catch (Exception unused) {
            this.LIZIZ = false;
            this.LJIIJ = -1L;
            this.LJIIJJI = -1L;
            this.LJIIL = 0;
            this.LJFF = null;
        }
        C06140Ly.LIZ(this.LIZ);
        this.LIZIZ = true;
    }

    public final void LIZJ(PH7 ph7) {
        PH3 ph3 = this.LJ;
        if (ph3 != null) {
            ph3.LIZLLL = ph7;
        }
        this.LIZJ = ph7;
    }

    public PH4(String str, boolean z) {
        this.LJII = new HashMap<>();
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = 0;
        this.LJIIIZ = null;
        if (LJIILIIL) {
            this.LJ = new PH3(str, z);
            return;
        }
        this.LIZ = str;
        this.LJIIIIZZ = z;
        this.LJI = new LinkedList<>();
    }
}
