package X;

import Y.ACallableS5S1000000_6;
import com.ss.android.ugc.aweme.setting.services.StorageServiceImpl;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5U {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final C38399F5f LIZLLL;
    public final C38401F5h LJ;
    public final C37097EhB LJFF;
    public boolean LJI;
    public volatile AbstractC37134Ehm LJII;
    public volatile int LJIIIIZZ;

    public final void LIZLLL() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unbind: ");
        AbstractC37134Ehm abstractC37134Ehm = this.LJII;
        if (abstractC37134Ehm == null || (str = abstractC37134Ehm.LIZ) == null) {
            str = "null";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        this.LIZLLL.LIZ();
        this.LJI = false;
        this.LJII = null;
        F5V LIZLLL = F5V.LIZLLL();
        synchronized (LIZLLL) {
            LIZLLL.LJLJL = System.currentTimeMillis();
            LIZLLL.LJLJJLL = null;
        }
        LIZLLL.LJIIL();
    }

    public F5U(String moduleName) {
        o.LJIIIZ(moduleName, "moduleName");
        this.LIZ = moduleName;
        this.LIZIZ = -1;
        this.LIZJ = 8;
        this.LIZLLL = new C38399F5f(new F5Z(this));
        this.LJ = new C38401F5h();
        this.LJFF = new C37097EhB(this);
        this.LJIIIIZZ = -1;
    }

    public final void LIZ(AbstractC37134Ehm abstractC37134Ehm) {
        AbstractC37134Ehm abstractC37134Ehm2 = this.LJII;
        if (abstractC37134Ehm2 == null) {
            LIZIZ(abstractC37134Ehm);
        } else {
            int i = abstractC37134Ehm.LJIIIIZZ;
            int i2 = abstractC37134Ehm2.LJIIIIZZ;
            if (i >= i2) {
                abstractC37134Ehm2.LIZ(11, i2);
                abstractC37134Ehm2.LJI = abstractC37134Ehm.LJI;
                abstractC37134Ehm2.LJFF = abstractC37134Ehm.LJFF;
                abstractC37134Ehm2.LIZLLL = abstractC37134Ehm.LIZLLL;
            }
        }
        C38401F5h.LIZ(0, this.LJII);
    }

    public final void LIZIZ(AbstractC37134Ehm abstractC37134Ehm) {
        Object obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cur: ");
        AbstractC37134Ehm abstractC37134Ehm2 = this.LJII;
        if (abstractC37134Ehm2 == null || (obj = abstractC37134Ehm2.LJIIIZ) == null) {
            obj = "null";
        }
        LIZ.append(obj);
        LIZ.append(" -> bind: ");
        LIZ.append(abstractC37134Ehm.LIZ);
        X1D.LIZIZ(LIZ);
        abstractC37134Ehm.LJI(F5Y.PENDING);
        this.LJII = abstractC37134Ehm;
        this.LJIIIIZZ = this.LIZIZ;
    }

    public final synchronized void LIZJ(C37100EhE c37100EhE) {
        int i;
        String str;
        Object obj;
        long j;
        AbstractC37134Ehm abstractC37134Ehm = this.LJII;
        if (abstractC37134Ehm == null) {
            return;
        }
        int i2 = abstractC37134Ehm.LJIIIIZZ;
        if (c37100EhE.LIZJ == 2) {
            long j2 = this.LIZLLL.LIZLLL;
            if (j2 > 0) {
                j = System.currentTimeMillis() - j2;
            } else {
                j = -1;
            }
            c37100EhE.LJFF = j;
        }
        C37099EhD.LIZJ(abstractC37134Ehm, this.LJIIIIZZ, c37100EhE);
        C37098EhC.LIZ(abstractC37134Ehm, this.LJIIIIZZ, c37100EhE);
        long j3 = c37100EhE.LJ;
        if (j3 > 0) {
            abstractC37134Ehm.LJIIJJI = j3;
        }
        long j4 = c37100EhE.LIZLLL;
        if (j4 > 0) {
            abstractC37134Ehm.LJIIJ = j4;
        }
        F5V LIZLLL = F5V.LIZLLL();
        int i3 = 0;
        int i4 = 9;
        switch (c37100EhE.LIZJ) {
            case 0:
                abstractC37134Ehm.LJI(F5Y.UNKNOWN);
                this.LJIIIIZZ = 0;
                break;
            case 1:
                if (this.LJIIIIZZ != 1) {
                    C38401F5h.LIZ(0, abstractC37134Ehm);
                }
                abstractC37134Ehm.LJI(F5Y.PENDING);
                this.LJIIIIZZ = 1;
                break;
            case 2:
                if (this.LJIIIIZZ != 2) {
                    C38399F5f c38399F5f = this.LIZLLL;
                    c38399F5f.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    c38399F5f.LIZLLL = currentTimeMillis;
                    c38399F5f.LIZJ = currentTimeMillis;
                    if (abstractC37134Ehm.LJI.LIZLLL) {
                        C38399F5f c38399F5f2 = this.LIZLLL;
                        PthreadTimer pthreadTimer = c38399F5f2.LIZIZ;
                        if (pthreadTimer != null) {
                            pthreadTimer.cancel();
                        }
                        PthreadTimer pthreadTimer2 = new PthreadTimer("DownloadTimeoutDetector");
                        c38399F5f2.LIZIZ = pthreadTimer2;
                        pthreadTimer2.schedule(new C38397F5d(c38399F5f2), 0L, F5T.LIZJ / 10);
                    }
                }
                C38399F5f c38399F5f3 = this.LIZLLL;
                c38399F5f3.getClass();
                c38399F5f3.LIZJ = System.currentTimeMillis();
                C38401F5h.LIZ(1, abstractC37134Ehm);
                abstractC37134Ehm.LJI(F5Y.RUNNING);
                this.LJIIIIZZ = 2;
                break;
            case 3:
                abstractC37134Ehm.LJI(F5Y.DOWNLOADED);
                this.LJIIIIZZ = 3;
                abstractC37134Ehm.LIZ(12, abstractC37134Ehm.LJIIIIZZ);
                if (abstractC37134Ehm.LJI.LIZIZ) {
                    LIZLLL.LJIIIZ(abstractC37134Ehm);
                    break;
                }
                break;
            case 4:
                if (this.LJIIIIZZ != 4) {
                    if (abstractC37134Ehm.LJI.LIZLLL) {
                        this.LIZLLL.LIZ();
                    }
                    C38399F5f c38399F5f4 = this.LIZLLL;
                    c38399F5f4.getClass();
                    c38399F5f4.LIZJ = System.currentTimeMillis();
                }
                C38401F5h.LIZ(2, abstractC37134Ehm);
                abstractC37134Ehm.LJI(F5Y.RUNNING);
                this.LJIIIIZZ = 4;
                break;
            case 5:
                if (this.LJIIIIZZ != 5) {
                    abstractC37134Ehm.LIZIZ(0);
                }
                abstractC37134Ehm.LJI(F5Y.SUCCEEDED);
                this.LJIIIIZZ = 5;
                LIZLLL.LJIIIIZZ(this.LIZ);
                break;
            case 6:
                if (this.LJIIIIZZ != 6) {
                    if (!abstractC37134Ehm.LJFF) {
                        int i5 = c37100EhE.LJI;
                        if (i5 == -10) {
                            if (StorageServiceImpl.LIZLLL().LIZ() != 0 && C38400F5g.LIZ(c37100EhE.LIZLLL)) {
                                java.util.Map<String, Object> map = c37100EhE.LJIIIZ;
                                if (map == null || (obj = map.get("reject_clean_dialog")) == null) {
                                    obj = Boolean.FALSE;
                                }
                                if (!o.LJ(obj, Boolean.TRUE)) {
                                    C10K.LIZIZ(FJV.LJLIL, C10K.LJIIIIZZ, null);
                                    return;
                                }
                            }
                            if (abstractC37134Ehm.LJ) {
                                C38405F5l.LIZ(R.string.jul);
                            }
                        } else if (i5 == -14) {
                            if (abstractC37134Ehm.LJ) {
                                C38405F5l.LIZ(R.string.jug);
                            }
                        } else if (abstractC37134Ehm.LJ) {
                            F6E f6e = abstractC37134Ehm.LJII;
                            if (f6e != null && (str = f6e.LIZIZ) != null) {
                                C10K.LIZIZ(new GV5(str, i3), C10K.LJIIIIZZ, null);
                            } else {
                                C38405F5l.LIZ(R.string.gqk);
                            }
                        }
                    }
                    abstractC37134Ehm.LIZ(c37100EhE.LJI, i2);
                    if (abstractC37134Ehm.LJI.LIZIZ && ((i = c37100EhE.LJI) == -100 || (i != -15 && i != -14 && i != -5 && i != -2 && i != 0))) {
                        LIZLLL.LJIIIZ(abstractC37134Ehm);
                    }
                }
                abstractC37134Ehm.LJI(F5Y.FAILED);
                this.LJIIIIZZ = 6;
                break;
            case 7:
                if (this.LJIIIIZZ != 7) {
                    if (abstractC37134Ehm.LJIIIZ == F5Y.TIMEOUT) {
                        if (abstractC37134Ehm.LJI.LIZLLL && !this.LJI) {
                            abstractC37134Ehm.LJI(F5Y.PENDING);
                            if (LIZLLL.LIZJ(abstractC37134Ehm)) {
                                this.LJI = true;
                                return;
                            }
                            LIZLLL.LJIIJJI(abstractC37134Ehm, F5T.LIZ);
                        }
                        if (!abstractC37134Ehm.LJFF && abstractC37134Ehm.LJ) {
                            C38405F5l.LIZ(R.string.ieo);
                        }
                    } else {
                        if (this.LJIIIIZZ != 8 && abstractC37134Ehm.LJI.LIZJ) {
                            LIZLLL.LJIIJJI(abstractC37134Ehm, F5T.LIZ);
                        }
                        i4 = 10;
                    }
                    abstractC37134Ehm.LIZ(i4, i2);
                }
                abstractC37134Ehm.LJI(F5Y.CANCELED);
                this.LJIIIIZZ = 7;
                break;
            case 8:
                abstractC37134Ehm.LJI(F5Y.RUNNING);
                this.LJIIIIZZ = 8;
                this.LIZLLL.LIZ();
                if (abstractC37134Ehm.LJI.LIZ) {
                    C10K.LIZIZ(new ACallableS5S1000000_6(this.LIZ, 3), C10K.LJIIIIZZ, null);
                    return;
                } else {
                    LIZLLL.getClass();
                    F5V.LIZ(abstractC37134Ehm);
                    break;
                }
            case 9:
                abstractC37134Ehm.LJI(F5Y.RUNNING);
                this.LJIIIIZZ = 9;
                break;
        }
        if (abstractC37134Ehm.LJIIIZ.isFinished()) {
            C38401F5h.LIZ(3, abstractC37134Ehm);
            LIZLLL();
        }
    }
}
