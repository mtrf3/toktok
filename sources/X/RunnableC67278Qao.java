package X;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;

/* renamed from: X.Qao, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67278Qao implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C67280Qaq LJLJJLL;

    public RunnableC67278Qao(C67280Qaq c67280Qaq, int i, String str, Object obj, Object obj2, Object obj3) {
        this.LJLJJLL = c67280Qaq;
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = obj;
        this.LJLJJI = obj2;
        this.LJLJJL = obj3;
    }

    public final void LIZ() {
        boolean z;
        C67274Qak LJIILLIIL = this.LJLJJLL.LIZ.LJIILLIIL();
        if (LJIILLIIL.LIZIZ) {
            C67280Qaq c67280Qaq = this.LJLJJLL;
            if (c67280Qaq.LIZJ == 0) {
                C68034Qn0 c68034Qn0 = c67280Qaq.LIZ.LJI;
                if (c68034Qn0.LIZLLL == null) {
                    synchronized (c68034Qn0) {
                        if (c68034Qn0.LIZLLL == null) {
                            ApplicationInfo applicationInfo = c68034Qn0.LIZ.LIZ.getApplicationInfo();
                            String LIZ = C38768FJk.LIZ();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str != null && str.equals(LIZ)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c68034Qn0.LIZLLL = Boolean.valueOf(z);
                            }
                            if (c68034Qn0.LIZLLL == null) {
                                c68034Qn0.LIZLLL = Boolean.TRUE;
                                c68034Qn0.LIZ.LIZJ().LJFF.LIZ("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (c68034Qn0.LIZLLL.booleanValue()) {
                    C67280Qaq c67280Qaq2 = this.LJLJJLL;
                    c67280Qaq2.LIZ.getClass();
                    c67280Qaq2.LIZJ = 'C';
                } else {
                    C67280Qaq c67280Qaq3 = this.LJLJJLL;
                    c67280Qaq3.LIZ.getClass();
                    c67280Qaq3.LIZJ = 'c';
                }
            }
            C67280Qaq c67280Qaq4 = this.LJLJJLL;
            if (c67280Qaq4.LIZLLL < 0) {
                c67280Qaq4.LIZ.LJI.LJIIJ();
                c67280Qaq4.LIZLLL = 64000L;
            }
            char charAt = "01VDIWEA?".charAt(this.LJLIL);
            C67280Qaq c67280Qaq5 = this.LJLJJLL;
            char c = c67280Qaq5.LIZJ;
            long j = c67280Qaq5.LIZLLL;
            String LJIIJ = C67280Qaq.LJIIJ(true, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
            StringBuilder sb = new StringBuilder("2");
            sb.append(charAt);
            sb.append(c);
            sb.append(j);
            String LIZIZ = AnonymousClass073.LIZIZ(sb, ":", LJIIJ);
            if (LIZIZ.length() > 1024) {
                LIZIZ = this.LJLILLLLZI.substring(0, 1024);
            }
            C67279Qap c67279Qap = LJIILLIIL.LIZLLL;
            if (c67279Qap != null) {
                c67279Qap.LJ.LJFF();
                if (c67279Qap.LJ.LJIIJ().getLong(c67279Qap.LIZ, 0L) == 0) {
                    c67279Qap.LIZ();
                }
                if (LIZIZ == null) {
                    LIZIZ = "";
                }
                long j2 = c67279Qap.LJ.LJIIJ().getLong(c67279Qap.LIZIZ, 0L);
                if (j2 <= 0) {
                    SharedPreferences.Editor edit = c67279Qap.LJ.LJIIJ().edit();
                    edit.putString(c67279Qap.LIZJ, LIZIZ);
                    edit.putLong(c67279Qap.LIZIZ, 1L);
                    edit.apply();
                    return;
                }
                long nextLong = c67279Qap.LJ.LIZ.LJIL().LJIILJJIL().nextLong();
                long j3 = j2 + 1;
                long j4 = Long.MAX_VALUE / j3;
                SharedPreferences.Editor edit2 = c67279Qap.LJ.LJIIJ().edit();
                if ((Long.MAX_VALUE & nextLong) < j4) {
                    edit2.putString(c67279Qap.LIZJ, LIZIZ);
                }
                edit2.putLong(c67279Qap.LIZIZ, j3);
                edit2.apply();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
