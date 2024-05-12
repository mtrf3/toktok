package X;

import Y.ARunnableS16S1000000_11;
import Y.ARunnableS47S0100000_11;
import Y.IDRunnableS85S0100000;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class PFC extends AbstractC06100Lu implements InterfaceC06110Lv {
    public static PFC LJLJLLL;
    public static InterfaceC64123PEp LJLL;
    public static long LJLLI;
    public static boolean LJLLILLLL;
    public static boolean LJLLJ;
    public static boolean LJLLL;
    public static volatile boolean LJLLLL;
    public static volatile boolean LJLLLLLL;
    public static final HashMap<String, String> LJLZ = new HashMap<>();
    public C25490zJ LJLILLLLZI;
    public volatile String LJLJI;
    public final long[] LJLJJI = new long[3];
    public volatile long LJLJJL;
    public PFD LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    public final synchronized void LJIILL() {
        if (this.LJLJL) {
            return;
        }
        if (LJLLJ && LJLLILLLL) {
            C36381bm.LJIL.LIZLLL(this);
            this.LJLJL = true;
        }
    }

    public final void LJIILIIL() {
        if (LJLLLLLL) {
            return;
        }
        synchronized (C06120Lw.class) {
            ((ArrayList) C06120Lw.LIZ).add(this);
        }
        LJLLLLLL = true;
    }

    public PFC(boolean z) {
        if (!z) {
            LJIILIIL();
        }
        if (LJLJLLL == null) {
            LJLJLLL = this;
        }
    }

    public static void LJIILJJIL(long j) {
        if (j < 70) {
            j = 1000;
        }
        LJLLI = j;
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIIZZ(String str) {
        this.LJLIL = true;
        C25500zK.LJIILLIIL = 0;
        C25500zK.LIZLLL(1048574, PFB.LIZIZ);
        if (PFB.LIZIZ - this.LJLJJL > 300) {
            this.LJLJJL = PFB.LIZIZ;
            this.LJLILLLLZI = C25500zK.LJ(0L, "EvilMethodTracer#dispatchBegin");
        }
        this.LJLJI = str;
    }

    @Override // X.InterfaceC06110Lv
    public final synchronized void LJ(boolean z, long j, boolean z2) {
        if (!C36381bm.LJIL.LJIJJLI) {
            return;
        }
        LJIILJJIL(j);
        this.LJLJLJ = false;
        LJLLJ = z;
        LJLLL = z2;
        if (z) {
            PAK.LIZ.post(new ARunnableS47S0100000_11(this, 116));
            C25500zK.LJI();
        } else {
            PAK.LIZ.post(new ARunnableS47S0100000_11(this, 117));
            C25500zK.LJII();
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        String LIZIZ;
        this.LJLIL = false;
        C25500zK.LJFF(1048574, PFB.LIZIZ);
        PFD pfd = this.LJLJJLL;
        if (pfd != null) {
            pfd.LJLILLLLZI = z;
            pfd.LJLIL = C36381bm.LJIL.LIZIZ.LIZIZ();
            F9U.LIZ.LIZJ(this.LJLJJLL);
            this.LJLJJLL = null;
        }
        if (C25500zK.LIZ >= 2) {
            int i = C25500zK.LJIILLIIL;
            C36411bp[] c36411bpArr = new C36411bp[i];
            System.arraycopy(C25500zK.LJIILL, 0, c36411bpArr, 0, i);
            long j5 = j3 - j;
            if (j5 >= LJLLI) {
                InterfaceC64123PEp interfaceC64123PEp = LJLL;
                if (interfaceC64123PEp != null) {
                    C44061oA c44061oA = ((PEU) interfaceC64123PEp).LIZ;
                    c44061oA.getClass();
                    C36381bm.LJIL.LJIILIIL.LIZ(new IDRunnableS85S0100000(c44061oA, j5, z, 109));
                }
                F9U.LIZ.LIZJ(new ARunnableS16S1000000_11("evil_method_begin", 4));
                C25490zJ c25490zJ = this.LJLILLLLZI;
                int i2 = C25500zK.LJ - 1;
                if (c25490zJ != null && C25500zK.LIZ != -3) {
                    long[] jArr = new long[0];
                    try {
                        jArr = C25500zK.LIZ(c25490zJ.LIZ - 1, i2);
                    } catch (OutOfMemoryError unused) {
                    }
                    if (jArr != null && jArr.length != 0) {
                        System.arraycopy(this.LJLJJI, 0, new long[3], 0, 3);
                        String LIZIZ2 = C06140Ly.LIZIZ();
                        if (TextUtils.isEmpty(LIZIZ2)) {
                            LIZIZ = ActivityLifeObserver.getInstance().getTopActivityClassName();
                        } else {
                            StringBuilder LIZJ = b1.LIZJ(LIZIZ2, ",");
                            LIZJ.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
                            LIZIZ = X1D.LIZIZ(LIZJ);
                        }
                        String str = this.LJLJI;
                        ActivityLifeObserver.getInstance().isForeground();
                        this.LJLJJLL = new PFD(LIZIZ, jArr, j4 - j2, j5, j3, str, System.currentTimeMillis(), C64125PEr.LIZLLL().LJ(), c36411bpArr, this.LJLJLJ, LJLZ);
                        return;
                    }
                }
                F9U.LIZ.LIZJ(new ARunnableS16S1000000_11("evil_method_data_null", 4));
            }
        }
    }
}
