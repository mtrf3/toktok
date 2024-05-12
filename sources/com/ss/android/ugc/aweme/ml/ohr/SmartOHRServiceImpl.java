package com.ss.android.ugc.aweme.ml.ohr;

import X.C16880lQ;
import X.C48518J2k;
import X.FKM;
import X.FMX;
import X.FQG;
import X.FQH;
import X.FQM;
import X.FQN;
import X.HG3;
import X.InterfaceC38870FNi;
import X.J3U;
import X.J3Y;
import X.J41;
import X.J51;
import X.J53;
import X.J5S;
import X.J5U;
import X.J6C;
import X.J6D;
import X.J6E;
import X.J6F;
import X.J6G;
import X.J6H;
import X.J6I;
import X.J6J;
import X.J6K;
import X.J6L;
import X.V0Q;
import X.WM7;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.ml.ab.SmartOHRExperiment$SmartOhrModel;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SmartOHRServiceImpl implements SmartOHRService, FQH {
    public static final /* synthetic */ int LIZLLL = 0;
    public volatile boolean LIZIZ;
    public final J6F LIZ = new J6F();
    public final Map<J6L, J6H> LIZJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final InterfaceC38870FNi getLastPredictResult() {
        FQN fqn = this.LIZ.LJI;
        if (fqn == null) {
            return null;
        }
        return new FQM(fqn);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final J5S getLastSlideSpeedFeature() {
        Float f;
        Float f2;
        Float f3;
        J6G j6g = this.LIZ.LJIIIZ;
        if (j6g != null) {
            f = Float.valueOf(j6g.LJLJI);
        } else {
            f = null;
        }
        J6G j6g2 = this.LIZ.LJIIIZ;
        if (j6g2 != null) {
            f2 = Float.valueOf(j6g2.LJLIL);
        } else {
            f2 = null;
        }
        J6G j6g3 = this.LIZ.LJIIIZ;
        if (j6g3 != null) {
            f3 = Float.valueOf(j6g3.LJLILLLLZI);
        } else {
            f3 = null;
        }
        if (f == null || f2 == null || f3 == null) {
            return null;
        }
        return new J5S(f.floatValue(), f2.floatValue(), f3.floatValue());
    }

    @Override // X.FQH
    public final void initialize() {
        J5U j41;
        if (this.LIZIZ) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!HG3.LJLILLLLZI) {
            SmartOHRExperiment$SmartOhrModel smartOHRExperiment$SmartOhrModel = (SmartOHRExperiment$SmartOhrModel) i0.LJ(true, "smart_ohr_service", 31744, SmartOHRExperiment$SmartOhrModel.class, null);
            HG3.LJLJI = smartOHRExperiment$SmartOhrModel;
            if (smartOHRExperiment$SmartOhrModel != null) {
                HG3.LJLJJI = smartOHRExperiment$SmartOhrModel.minInterval;
            }
            HG3.LJLILLLLZI = true;
        }
        SmartOHRExperiment$SmartOhrModel smartOHRExperiment$SmartOhrModel2 = HG3.LJLJI;
        if (smartOHRExperiment$SmartOhrModel2 == null || !smartOHRExperiment$SmartOhrModel2.enabled) {
            return;
        }
        J51.LIZ = J53.LIZ("ohr_android");
        J51.LIZIZ = smartOHRExperiment$SmartOhrModel2.reportSampleRate;
        int i = smartOHRExperiment$SmartOhrModel2.engine;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            String str = smartOHRExperiment$SmartOhrModel2.model;
            o.LJIIIIZZ(str, "exprConfig.model");
            j41 = new C48518J2k(str);
        } else {
            String str2 = smartOHRExperiment$SmartOhrModel2.model;
            o.LJIIIIZZ(str2, "exprConfig.model");
            j41 = new J41(str2);
        }
        J6J j6j = new J6J(j41);
        J6I j6i = new J6I(j6j);
        if (J51.LIZ) {
            j6i.LIZ = new J6K();
        }
        j6i.LIZJ = smartOHRExperiment$SmartOhrModel2.sampleCount;
        j6i.LIZIZ = smartOHRExperiment$SmartOhrModel2.minInterval;
        J6F j6f = this.LIZ;
        AwemeHostApplication LIZ = FKM.LIZ();
        o.LJI(LIZ);
        j6f.getClass();
        if (!j6f.LIZIZ) {
            j6f.LJFF = j6i;
            J5U createEngine = j6j.createEngine();
            j6f.LIZ = createEngine;
            if (createEngine != null) {
                createEngine.LIZIZ = new J6E(j6f);
                try {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    Object LLILL = C16880lQ.LLILL(LIZ, "window");
                    if (LLILL != null) {
                        ((WindowManager) LLILL).getDefaultDisplay().getMetrics(displayMetrics);
                        j6f.LJIILJJIL = displayMetrics.widthPixels;
                        j6f.LJIILL = displayMetrics.heightPixels;
                        j6f.LJIILLIIL = displayMetrics.density;
                        j6f.LIZIZ = true;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
                    }
                } catch (Exception unused) {
                    J3Y.LIZIZ().LIZIZ("ohr", "failed to retrieve the DisplayMetrics");
                }
            } else {
                o.LJIJI("ohrEngine");
                throw null;
            }
        }
        if (J51.LIZ) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (J51.LIZ && V0Q.Default.nextFloat() < J53.LIZJ) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(WM7.SCENE_SERVICE, "ohr_android");
                jSONObject.put("sdk_duration", uptimeMillis2);
                FMX.LJIILJJIL("ml_scene_init", jSONObject);
            }
        }
        this.LIZIZ = true;
    }

    @Override // X.FQH
    public final void shutdown() {
        J6F j6f = this.LIZ;
        if (!j6f.LIZIZ) {
            return;
        }
        j6f.LIZJ.post(new ARunnableS44S0100000_8(j6f, 96));
        J6D j6d = j6f.LIZ;
        if (j6d != null) {
            j6d.stop();
        } else {
            o.LJIJI("ohrEngine");
            throw null;
        }
    }

    @Override // X.FQH
    public final void startup() {
        J6F j6f = this.LIZ;
        if (!j6f.LIZIZ) {
            return;
        }
        J6D j6d = j6f.LIZ;
        if (j6d != null) {
            j6d.start();
            j6f.LIZJ.post(new ARunnableS44S0100000_8(j6f, 97));
        } else {
            o.LJIJI("ohrEngine");
            throw null;
        }
    }

    @Override // X.FQH
    public final void feedMotionEvent(MotionEvent ev) {
        long j;
        int i;
        o.LJIIIZ(ev, "ev");
        J6F j6f = this.LIZ;
        j6f.getClass();
        if (!j6f.LIZIZ) {
            return;
        }
        if (ev.getPointerCount() > 1) {
            j6f.LJII = null;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - j6f.LJIIIIZZ;
        J6I j6i = j6f.LJFF;
        if (j6i != null) {
            j = j6i.LIZIZ;
        } else {
            j = 5000;
        }
        if (j2 < j) {
            return;
        }
        if (ev.getAction() == 0) {
            j6f.LJII = new LinkedList();
            float x = ev.getX();
            float y = ev.getY();
            j6f.LJIIJ = SystemClock.elapsedRealtime();
            j6f.LJIIJJI = x;
            j6f.LJIIL = y;
        }
        List<J6C> list = j6f.LJII;
        if (list == null) {
            return;
        }
        int historySize = ev.getHistorySize();
        for (int i2 = 0; i2 < historySize; i2++) {
            ((LinkedList) list).add(new J6C(ev.getHistoricalEventTime(i2), ev.getHistoricalX(i2), ev.getHistoricalY(i2)));
        }
        LinkedList linkedList = (LinkedList) list;
        linkedList.add(new J6C(ev.getEventTime(), ev.getX(), ev.getY()));
        if (ev.getAction() != 1) {
            return;
        }
        int size = linkedList.size();
        J6I j6i2 = j6f.LJFF;
        if (j6i2 != null) {
            i = j6i2.LIZJ;
        } else {
            i = 9;
        }
        if (size < i) {
            return;
        }
        float x2 = ev.getX();
        float y2 = ev.getY();
        float f = x2 - j6f.LJIIJJI;
        float f2 = y2 - j6f.LJIIL;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - j6f.LJIIJ;
        if (elapsedRealtime2 > 10) {
            float f3 = 1000;
            float f4 = (float) elapsedRealtime2;
            j6f.LJIIIZ = new J6G(Math.abs((f * f3) / f4), Math.abs((f2 * f3) / f4), Math.abs((((float) Math.sqrt((f2 * f2) + (f * f))) * f3) / f4));
        }
        j6f.LJIIIIZZ = elapsedRealtime;
        J3U.LIZJ(100L, new ARunnableS27S0200000_8(list, j6f, 61));
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final boolean registerOHRServiceObserver(J6L observer) {
        o.LJIIIZ(observer, "observer");
        if (this.LIZJ.containsKey(observer)) {
            return true;
        }
        J6H j6h = new J6H((FQG) observer);
        this.LIZJ.put(observer, j6h);
        J6F j6f = this.LIZ;
        j6f.getClass();
        ((CopyOnWriteArrayList) j6f.LIZLLL.LJLIL).add(j6h);
        return true;
    }
}
