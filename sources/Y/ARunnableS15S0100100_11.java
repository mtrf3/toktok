package Y;

import J.N;
import X.C09900aA;
import X.C0H1;
import X.C64088PDg;
import X.C64089PDh;
import X.C64101PDt;
import X.C64375POh;
import X.C67031QSl;
import X.C67032QSm;
import X.C67035QSp;
import X.HandlerThreadC36428ERk;
import X.InterfaceC64383POp;
import X.InterfaceC67030QSk;
import X.InterfaceC67072QUa;
import X.InterfaceC88472Yns;
import X.PC4;
import X.PDY;
import X.PDZ;
import X.PIB;
import X.PIE;
import X.QI3;
import X.QIS;
import X.QIX;
import X.QL4;
import X.QU5;
import X.V10;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.sync.SyncSDK;
import com.ttnet.org.chromium.base.JavaHandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS15S0100100_11 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

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
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        int i;
        try {
            ((InterfaceC88472Yns) this.l0).invoke(Long.valueOf(this.j1));
            if (C64375POh.LJI) {
                int size = C64375POh.LIZJ.size();
                Integer num = C64375POh.LIZIZ().logMaxSpanCount;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = LiveChatShowDelayForHotLiveSetting.DEFAULT;
                }
                if (size <= i) {
                    return;
                }
                C64375POh.LJI = false;
                InterfaceC64383POp interfaceC64383POp = C64375POh.LJFF;
                if (interfaceC64383POp == null) {
                    return;
                }
                interfaceC64383POp.LIZ();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:41|(12:78|79|44|(1:46)(1:77)|47|(1:49)|50|51|(1:75)(1:55)|56|57|(5:59|(1:61)(2:67|68)|62|(1:64)(1:66)|65))|43|44|(0)(0)|47|(0)|50|51|(1:53)|75|56|57|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0294 A[Catch: JSONException -> 0x0329, all -> 0x03f5, TRY_LEAVE, TryCatch #5 {JSONException -> 0x0329, blocks: (B:39:0x01d2, B:41:0x01f6, B:44:0x021e, B:47:0x022e, B:49:0x0294, B:56:0x02f0, B:82:0x021a), top: B:38:0x01d2, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0343 A[Catch: all -> 0x03f5, TryCatch #3 {all -> 0x03f5, blocks: (B:3:0x001b, B:5:0x002a, B:11:0x0034, B:15:0x005a, B:19:0x0079, B:21:0x008b, B:23:0x00da, B:25:0x013e, B:28:0x0171, B:30:0x0179, B:31:0x0185, B:34:0x01b6, B:39:0x01d2, B:41:0x01f6, B:44:0x021e, B:47:0x022e, B:49:0x0294, B:56:0x02f0, B:57:0x033d, B:59:0x0343, B:62:0x037f, B:65:0x038d, B:68:0x0371, B:71:0x037c, B:79:0x020f, B:82:0x021a, B:85:0x032a, B:86:0x03a2, B:8:0x03c3), top: B:2:0x001b, inners: #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS15S0100100_11.LIZ$2():void");
    }

    public final void LIZ$3() {
        ConcurrentHashMap<Long, InterfaceC67030QSk> concurrentHashMap = C67035QSp.LIZLLL;
        if (concurrentHashMap.containsKey(Long.valueOf(this.j1))) {
            return;
        }
        C67031QSl c67031QSl = new C67031QSl(this.j1);
        ((ArrayList) c67031QSl.LIZIZ).add((InterfaceC67072QUa) this.l0);
        C67032QSm LIZ = c67031QSl.LIZ();
        Long valueOf = Long.valueOf(this.j1);
        InterfaceC67030QSk registerBusiness = SyncSDK.registerBusiness(LIZ);
        o.LJIIIIZZ(registerBusiness, "registerBusiness(syncBiz)");
        concurrentHashMap.put(valueOf, registerBusiness);
    }

    public final void LIZ$4() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("looper_monitor", this.j1);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("is_main_process", ((C64101PDt) this.l0).LIZ.LJLZ);
            C09900aA.LJI("apm_cost", jSONObject2, jSONObject, null);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ$5() {
        if (!((QL4) this.l0).LIZIZ) {
            QIX qix = ((QL4) this.l0).LJIIIZ.LJJIZ;
            List<String> list = QL4.LJIIL;
            qix.LJIJI(0, list, "[Task] onTaskResume", new Object[0]);
            ((QL4) this.l0).LIZIZ = true;
            QL4 ql4 = (QL4) this.l0;
            if (ql4.LIZJ) {
                ql4.LIZ = true;
                QIS qis = ql4.LJ;
                long j = 0;
                if (qis == null) {
                    ql4.LJIIIZ.LJJIZ.LJIJI(0, list, "[Task] pure bg launch , so create a new task session", new Object[0]);
                    QL4 ql42 = (QL4) this.l0;
                    long j2 = this.j1;
                    QI3 qi3 = ql42.LJIIIZ;
                    if (qi3.LJIILIIL != null) {
                        j = qi3.LJIILIIL.LJLLI.LJFF.incrementAndGet();
                    }
                    ql42.LJ = new QIS(j2, j);
                    ((QL4) this.l0).LJI.LIZ();
                    QL4 ql43 = (QL4) this.l0;
                    ql43.LIZIZ(ql43.LJ.LIZIZ);
                    return;
                }
                long j3 = this.j1 - qis.LJI;
                if (j3 <= LivePlayEnforceIntervalSetting.DEFAULT) {
                    QIX qix2 = ql4.LJIIIZ.LJJIZ;
                    StringBuilder LIZJ = V10.LIZJ("[Task] task time diff ", j3, " , is less than ");
                    qix2.LJIJI(0, list, C0H1.LIZJ(LIZJ, LivePlayEnforceIntervalSetting.DEFAULT, " so , merge in previous session", LIZJ), new Object[0]);
                    HandlerThreadC36428ERk.LIZIZ().LIZJ().removeCallbacks(((QL4) this.l0).LJIIJ);
                    QL4 ql44 = (QL4) this.l0;
                    QIS qis2 = ql44.LJ;
                    qis2.LJII += j3;
                    qis2.LJI = this.j1;
                    ql44.LJI.LIZLLL(qis2);
                    QL4 ql45 = (QL4) this.l0;
                    ql45.LIZIZ(ql45.LJ.LIZIZ);
                    return;
                }
                QIX qix3 = ql4.LJIIIZ.LJJIZ;
                StringBuilder LIZJ2 = V10.LIZJ("[Task] task time diff ", j3, " , is bigger than ");
                qix3.LJIJI(0, list, C0H1.LIZJ(LIZJ2, LivePlayEnforceIntervalSetting.DEFAULT, " so close current session and create new session", LIZJ2), new Object[0]);
                HandlerThreadC36428ERk.LIZIZ().LIZJ().removeCallbacks(((QL4) this.l0).LJIIJ);
                ((QL4) this.l0).LJIIJ.run();
                QL4 ql46 = (QL4) this.l0;
                long j4 = this.j1;
                QI3 qi32 = ql46.LJIIIZ;
                if (qi32.LJIILIIL != null) {
                    j = qi32.LJIILIIL.LJLLI.LJFF.incrementAndGet();
                }
                ql46.LJ = new QIS(j4, j);
                ((QL4) this.l0).LJI.LIZ();
                QL4 ql47 = (QL4) this.l0;
                ql47.LIZIZ(ql47.LJ.LIZIZ);
            }
        }
    }

    public final void LIZ$6() {
        if (((QL4) this.l0).LIZIZ) {
            QIX qix = ((QL4) this.l0).LJIIIZ.LJJIZ;
            List<String> list = QL4.LJIIL;
            qix.LJIJI(0, list, "[Task] onTaskPause", new Object[0]);
            ((QL4) this.l0).LIZIZ = false;
            QL4 ql4 = (QL4) this.l0;
            if (ql4.LIZJ) {
                if (ql4.LJ != null) {
                    ql4.LJIIIZ.LJJIZ.LJIJI(0, list, "[Task] wait 15000 to close current session", new Object[0]);
                    ((QL4) this.l0).LJ.LJI = this.j1;
                    HandlerThreadC36428ERk LIZIZ = HandlerThreadC36428ERk.LIZIZ();
                    ARunnableS47S0100000_11 aRunnableS47S0100000_11 = ((QL4) this.l0).LJIIJ;
                    if (aRunnableS47S0100000_11 != null) {
                        LIZIZ.LIZJ().removeCallbacks(aRunnableS47S0100000_11);
                        LIZIZ.LIZJ().postDelayed(aRunnableS47S0100000_11, LivePlayEnforceIntervalSetting.DEFAULT);
                    } else {
                        LIZIZ.getClass();
                    }
                    QL4 ql42 = (QL4) this.l0;
                    ql42.LJI.LIZLLL(ql42.LJ);
                    ((QL4) this.l0).LIZ().removeMessages(1);
                    return;
                }
                ql4.LJIIIZ.LJJIZ.LJIIIIZZ(0, list, "[Task] onTaskPause when bg, but no session available", new Object[0]);
            }
        }
    }

    public final void LIZ$0() {
        PIB pib = ((PIE) this.l0).LJ;
        long j = this.j1;
        if (!pib.LJI.get()) {
            pib.LJI.set(true);
            try {
                try {
                    pib.LIZ();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("start_timestamp", pib.LIZ);
                    jSONObject.put("finish_timestamp", j);
                    jSONObject.put("is_finished", 1);
                    jSONObject.put("report_mode", 1);
                    jSONObject.put("insert_mode", 2);
                    jSONObject.put("log_type", "tracer");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trace_type", pib.LIZJ.LIZIZ);
                    jSONObject.put("movingline", jSONObject2);
                    pib.LIZJ(jSONObject, false);
                    Map<String, String> map = pib.LIZIZ;
                    if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
                        jSONObject.put("tags", new JSONObject(pib.LIZIZ));
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    Iterator it = ((CopyOnWriteArrayList) pib.LJ).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((JSONObject) it.next());
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(new JSONObject().put("wrapper_array_data", jSONArray));
                    LIZ.append("");
                    X1D.LIZIZ(LIZ);
                    JSONObject put = new JSONObject().put("wrapper_array_data", jSONArray);
                    PDY pdy = PDY.LIZJ;
                    PIE pie = pib.LIZJ;
                    if (pdy.LIZ(pie.LIZ, pie.LJFF)) {
                        PC4 pc4 = new PC4(put);
                        PDZ pdz = pdy.LIZ;
                        if (pdz != null) {
                            C64375POh.LJI(new AqS142S0200000_11(pdz.LIZ, pc4, 5));
                        }
                    } else {
                        C64089PDh LJIIJ = C64089PDh.LJIIJ();
                        PIE pie2 = pib.LIZJ;
                        LJIIJ.LIZLLL(new C64088PDg(pie2.LIZ, put, pie2.LJFF));
                    }
                } catch (JSONException e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("error when BatchTracing end trace: ");
                    LIZ2.append(e.getLocalizedMessage());
                    X1D.LIZIZ(LIZ2);
                }
            } finally {
                ((CopyOnWriteArrayList) pib.LJ).clear();
            }
        }
        ((PIE) this.l0).LJ = null;
    }

    public static final void run$0(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            ((QU5) aRunnableS15S0100100_11.l0).LJLILLLLZI.LIZ(aRunnableS15S0100100_11.j1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            ((JavaHandlerThread) aRunnableS15S0100100_11.l0).LIZ.quit();
            N.MSKUcgE4(aRunnableS15S0100100_11.j1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS15S0100100_11 aRunnableS15S0100100_11) {
        boolean LIZ;
        try {
            aRunnableS15S0100100_11.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS15S0100100_11(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
