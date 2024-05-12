package Y;

import X.AbstractC66014PvW;
import X.C16880lQ;
import X.HandlerThreadC36423ERf;
import X.HandlerThreadC36428ERk;
import X.QG8;
import X.QGE;
import X.QGG;
import X.QGH;
import X.QI3;
import X.QIS;
import X.QIX;
import X.QL4;
import X.QO4;
import X.W58;
import X.W5O;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS7S1100100_11 implements Runnable {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        QGE qge = (QGE) this.l1;
        String str = this.s0;
        long j = this.j2;
        QGH remove = qge.LIZ.remove(str);
        if (remove == null) {
            return;
        }
        if (QGG.LJ) {
            AbstractC66014PvW.LIZ("Fresco", C16880lQ.LLLZI(null, "time %d: onRequestCancellation: {requestId: %s, elapsedTime: %d ms}", new Object[]{Long.valueOf(j), str, Long.valueOf(QGE.LJIILJJIL(j, Long.valueOf(remove.LIZ)))}));
        }
        JSONObject jSONObject = remove.LIZJ;
        try {
            jSONObject.put("load_status", "cancel");
            jSONObject.put("duration", QGE.LJIILJJIL(j, Long.valueOf(remove.LIZ)));
            jSONObject.put("timestamp", Long.valueOf(remove.LIZ));
            synchronized (QG8.LIZ()) {
            }
            jSONObject.put("retry_open", 0);
        } catch (JSONException e) {
            W58.LJIIIZ("FrescoTraceListener", e, "", new Object[0]);
        }
        QGE.LJIILLIIL(null, str, remove.LIZLLL, jSONObject, false, jSONObject.optBoolean("is_request_network", false), true);
        QGE.LJIJJ(jSONObject);
    }

    public final void LIZ$1() {
        QO4 qo4 = (QO4) this.l1;
        if (qo4.LIZIZ) {
            qo4.LIZIZ = false;
            HandlerThreadC36423ERf LIZJ = HandlerThreadC36423ERf.LIZJ();
            LIZJ.LIZLLL().removeCallbacks(((QO4) this.l1).LJIIIZ);
            HandlerThreadC36423ERf LIZJ2 = HandlerThreadC36423ERf.LIZJ();
            LIZJ2.LIZLLL().removeCallbacks(((QO4) this.l1).LJIIIIZZ);
            ((QO4) this.l1).LIZ().removeMessages(1);
            ((QO4) this.l1).LJFF.LIZ();
            QO4 qo42 = (QO4) this.l1;
            if (qo42.LIZ) {
                if (this.j2 - qo42.LIZJ <= 30000) {
                    ((ArrayList) qo42.LJI).clear();
                    ((QO4) this.l1).LIZLLL = null;
                } else {
                    if (qo42.LIZLLL != null) {
                        qo42.getClass();
                        QO4 qo43 = (QO4) this.l1;
                        qo43.LJFF.LIZIZ(qo43.LIZLLL);
                        ((QO4) this.l1).LIZLLL = null;
                    }
                    ((QO4) this.l1).LJIIIZ.run();
                }
            }
            QO4 qo44 = (QO4) this.l1;
            qo44.LIZ = false;
            ((ArrayList) qo44.LJI).clear();
            qo44.LJII = false;
        }
    }

    public final void LIZ$2() {
        QO4 qo4 = (QO4) this.l1;
        if (!qo4.LIZIZ) {
            qo4.LIZ = false;
            ((ArrayList) qo4.LJI).clear();
            qo4.LJII = false;
            HandlerThreadC36423ERf LIZJ = HandlerThreadC36423ERf.LIZJ();
            ARunnableS47S0100000_11 aRunnableS47S0100000_11 = ((QO4) this.l1).LJIIIZ;
            if (aRunnableS47S0100000_11 != null) {
                LIZJ.LIZLLL().removeCallbacks(aRunnableS47S0100000_11);
                LIZJ.LIZLLL().postDelayed(aRunnableS47S0100000_11, 30010L);
            } else {
                LIZJ.getClass();
            }
            QO4 qo42 = (QO4) this.l1;
            qo42.LIZJ = this.j2;
            qo42.LIZIZ = true;
            qo42.getClass();
        }
    }

    public final void LIZ$3() {
        QIX qix = ((QL4) this.l1).LJIIIZ.LJJIZ;
        List<String> list = QL4.LJIIL;
        qix.LJIJI(0, list, "[Task] onExitBg", new Object[0]);
        QL4 ql4 = (QL4) this.l1;
        if (ql4.LIZJ) {
            ql4.LIZJ = false;
            HandlerThreadC36428ERk LIZIZ = HandlerThreadC36428ERk.LIZIZ();
            LIZIZ.LIZJ().removeCallbacks(((QL4) this.l1).LJIIJJI);
            HandlerThreadC36428ERk LIZIZ2 = HandlerThreadC36428ERk.LIZIZ();
            LIZIZ2.LIZJ().removeCallbacks(((QL4) this.l1).LJIIJ);
            ((QL4) this.l1).LIZ().removeMessages(1);
            ((QL4) this.l1).LJI.LIZ();
            QL4 ql42 = (QL4) this.l1;
            if (ql42.LIZ) {
                if (this.j2 - ql42.LIZLLL <= 30000) {
                    ql42.LJIIIZ.LJJIZ.LJIJI(0, list, "[Task] time diff is less than 30000 , so clear current session", new Object[0]);
                    ((ArrayList) ((QL4) this.l1).LJII).clear();
                    ((QL4) this.l1).LJ = null;
                } else {
                    if (ql42.LJ != null) {
                        ql42.LJIIIZ.LJJIZ.LJIJI(0, list, "[Task] close current session", new Object[0]);
                        if (((QL4) this.l1).LIZIZ) {
                            QIS qis = ((QL4) this.l1).LJ;
                            String str = this.s0;
                            qis.LJ = true;
                            qis.LJFF = str;
                            qis.LJI = this.j2;
                        }
                        QL4 ql43 = (QL4) this.l1;
                        ql43.LJI.LIZJ(ql43.LJ);
                        ((QL4) this.l1).LJ = null;
                    }
                    ((QL4) this.l1).LJIIJJI.run();
                }
            }
            QL4 ql44 = (QL4) this.l1;
            ql44.LIZ = false;
            ((ArrayList) ql44.LJII).clear();
            ql44.LJIIIIZZ = false;
        }
    }

    public final void LIZ$4() {
        long incrementAndGet;
        QIX qix = ((QL4) this.l1).LJIIIZ.LJJIZ;
        List<String> list = QL4.LJIIL;
        qix.LJIJI(0, list, "[Task] onEnterBg", new Object[0]);
        QL4 ql4 = (QL4) this.l1;
        if (!ql4.LIZJ) {
            ql4.LIZ = false;
            ((ArrayList) ql4.LJII).clear();
            ql4.LJIIIIZZ = false;
            HandlerThreadC36428ERk LIZIZ = HandlerThreadC36428ERk.LIZIZ();
            ARunnableS47S0100000_11 aRunnableS47S0100000_11 = ((QL4) this.l1).LJIIJJI;
            if (aRunnableS47S0100000_11 != null) {
                LIZIZ.LIZJ().removeCallbacks(aRunnableS47S0100000_11);
                LIZIZ.LIZJ().postDelayed(aRunnableS47S0100000_11, 30010L);
            } else {
                LIZIZ.getClass();
            }
            QL4 ql42 = (QL4) this.l1;
            ql42.LIZLLL = this.j2;
            ql42.LIZJ = true;
            if (ql42.LIZIZ) {
                QL4 ql43 = (QL4) this.l1;
                ql43.LIZ = true;
                if (ql43.LJ != null) {
                    ql43.LJIIIZ.LJJIZ.LJIIIIZZ(0, list, "[Task] enter bg , bug there is already a bg task is running", new Object[0]);
                }
                ((QL4) this.l1).LJIIIZ.LJJIZ.LJIJI(0, list, "[Task] task is running , so create a new task session", new Object[0]);
                QL4 ql44 = (QL4) this.l1;
                long j = this.j2;
                QI3 qi3 = ql44.LJIIIZ;
                if (qi3.LJIILIIL == null) {
                    incrementAndGet = 0;
                } else {
                    incrementAndGet = qi3.LJIILIIL.LJLLI.LJFF.incrementAndGet();
                }
                ql44.LJ = new QIS(j, incrementAndGet);
                QL4 ql45 = (QL4) this.l1;
                QIS qis = ql45.LJ;
                String str = this.s0;
                qis.LIZJ = true;
                qis.LIZLLL = str;
                ql45.LIZIZ(qis.LIZIZ);
            }
        }
    }

    public static final void run$0(ARunnableS7S1100100_11 aRunnableS7S1100100_11) {
        boolean LIZ;
        try {
            aRunnableS7S1100100_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S1100100_11 aRunnableS7S1100100_11) {
        boolean LIZ;
        try {
            QGE qge = (QGE) aRunnableS7S1100100_11.l1;
            String str = aRunnableS7S1100100_11.s0;
            long j = aRunnableS7S1100100_11.j2;
            QGH qgh = qge.LIZ.get(str);
            if (qgh != null && qgh.LJ) {
                qgh.LJ = false;
                JSONObject jSONObject = qgh.LIZJ;
                if (jSONObject != null) {
                    try {
                        jSONObject.put("first_intermediate_result", QGE.LJIILJJIL(j, Long.valueOf(qgh.LIZ)));
                    } catch (JSONException unused) {
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S1100100_11 aRunnableS7S1100100_11) {
        boolean LIZ;
        try {
            aRunnableS7S1100100_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S1100100_11 aRunnableS7S1100100_11) {
        boolean LIZ;
        try {
            aRunnableS7S1100100_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S1100100_11 aRunnableS7S1100100_11) {
        boolean LIZ;
        try {
            aRunnableS7S1100100_11.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S1100100_11 aRunnableS7S1100100_11) {
        boolean LIZ;
        try {
            aRunnableS7S1100100_11.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S1100100_11(Object obj, String str, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.j2 = j;
    }

    public ARunnableS7S1100100_11(QGE qge, W5O w5o, String str, boolean z, long j, int i) {
        this.$t = i;
        this.l1 = qge;
        this.s0 = str;
        this.j2 = j;
    }
}
