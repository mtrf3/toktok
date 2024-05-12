package com.ss.android.ugc.aweme.ml.har;

import X.C16880lQ;
import X.C25620zW;
import X.C35718E0c;
import X.C39216FaG;
import X.C46434IKg;
import X.C47399Iix;
import X.C47400Iiy;
import X.C84763XOl;
import X.EF7;
import X.FMX;
import X.FQL;
import X.J3U;
import X.J43;
import X.J4A;
import X.J4G;
import X.J4J;
import X.J4K;
import X.J4L;
import X.J4N;
import X.J4O;
import X.J4T;
import X.J4V;
import X.J4Y;
import X.J53;
import X.J6U;
import X.UC7;
import X.V0N;
import X.V0Q;
import X.WM7;
import X.X1D;
import Y.ARunnableS27S0200000_8;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.SmartHARExperiment;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SmartHARServiceImpl extends SmartHARService implements J4Y, J4G {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public int LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public SmartHARExperiment.SmartHarModel LJIIJ;
    public J43 LJIIJJI;
    public final int LJFF = 8;
    public final int LJII = 5;
    public int LJIIL = -999;
    public final ArrayList<FQL> LJIILIIL = new ArrayList<>();

    public final void LIZJ() {
        int i;
        long j;
        boolean z;
        long j2;
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        J43 j43 = this.LJIIJJI;
        SmartHARExperiment.SmartHarModel smartHarModel = this.LJIIJ;
        if (enable() && j43 != null && smartHarModel != null) {
            SmartHARService.Companion.getClass();
            J6U.LIZ = SmartHARService.debug;
            C47399Iix.LIZ = true;
            V0N.LJLJJI = C39216FaG.LIZ;
            C84763XOl.LJI().LJJJJZI(J4N.LJLIL);
            C35718E0c c35718E0c = new C35718E0c();
            c35718E0c.LIZIZ = smartHarModel.getOptSensorRegister();
            c35718E0c.LIZ = smartHarModel.getRunContinuesGapMs();
            Context LIZIZ = EF7.LIZIZ();
            J4J j4j = J4V.LIZ;
            if (j4j.LIZIZ) {
                j4j.LIZLLL.LIZ = System.currentTimeMillis();
            }
            J4K j4k = J4T.LIZ;
            j4k.getClass();
            if (J6U.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("HARService.init begin config:");
                LIZ.append(c35718E0c);
                LIZ.append(" engine:");
                LIZ.append(j43);
                LIZ.append(" hasInit:");
                LIZ.append(j4k.LJIILIIL);
                LIZ.append(" lastInitErrCode:");
                LIZ.append(j4k.LJIILJJIL);
                X1D.LIZIZ(LIZ);
            }
            if (j4k.LJIILIIL) {
                i = j4k.LJIILJJIL;
            } else {
                try {
                    long j3 = 0;
                    if (J6U.LIZ) {
                        j = System.currentTimeMillis();
                    } else {
                        j = 0;
                    }
                    j4k.LJIILIIL = true;
                    j4k.LJ = c35718E0c;
                    j4k.LIZLLL = j43;
                    J4L j4l = new J4L();
                    j4k.LJIIL = j4l;
                    int LIZLLL = j4l.LIZLLL(LIZIZ);
                    J4L j4l2 = j4k.LJIIL;
                    if (j4l2.LJLILLLLZI && j4l2.LJLJI == 0) {
                        z = true;
                        if (J6U.LIZ) {
                            j2 = System.currentTimeMillis();
                        } else {
                            j2 = 0;
                        }
                        j4k.LJIIIZ = new Handler(C16880lQ.LLJJJJ());
                        HandlerThread handlerThread = new HandlerThread("har-service");
                        j4k.LJIIJ = handlerThread;
                        handlerThread.start();
                        j4k.LJIIJJI = new Handler(j4k.LJIIJ.getLooper());
                        if (J6U.LIZ) {
                            long currentTimeMillis = System.currentTimeMillis() - j2;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("HARService.init create handler cost:");
                            LIZ2.append(currentTimeMillis);
                            X1D.LIZIZ(LIZ2);
                        }
                        j4k.LJIIL.LJLLI = j4k.LJIJI;
                        if (J6U.LIZ) {
                            j3 = System.currentTimeMillis();
                        }
                        j4k.LIZLLL.init(LIZIZ);
                        if (J6U.LIZ) {
                            long currentTimeMillis2 = System.currentTimeMillis() - j3;
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("HARService.init engine init cost:");
                            LIZ3.append(currentTimeMillis2);
                            X1D.LIZIZ(LIZ3);
                        }
                        j4k.LJIILJJIL = 0;
                    } else {
                        z = false;
                        j4k.LJIILJJIL = LIZLLL;
                    }
                    if (J6U.LIZ) {
                        long currentTimeMillis3 = System.currentTimeMillis() - j;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("HARService.init end cost:");
                        LIZ4.append(currentTimeMillis3);
                        LIZ4.append(" lastInitErrCode:");
                        LIZ4.append(j4k.LJIILJJIL);
                        LIZ4.append(" sensor.enable:");
                        LIZ4.append(z);
                        X1D.LIZIZ(LIZ4);
                    }
                } catch (Throwable unused) {
                    j4k.LJIILJJIL = -4;
                    try {
                        j4k.LJIIL();
                        synchronized (j4k.LJFF) {
                            j4k.LJFF.clear();
                            Handler handler = j4k.LJIIJJI;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                                j4k.LJIIJJI = null;
                            }
                            Handler handler2 = j4k.LJIIIZ;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                                j4k.LJIIIZ = null;
                            }
                            J4L j4l3 = j4k.LJIIL;
                            if (j4l3 != null) {
                                j4l3.LJFF();
                                j4k.LJIIL = null;
                            }
                            J4O j4o = j4k.LIZLLL;
                            if (j4o != null) {
                                j4o.unInit();
                                j4k.LIZLLL = null;
                            }
                            HandlerThread handlerThread2 = j4k.LJIIJ;
                            if (handlerThread2 != null) {
                                handlerThread2.quitSafely();
                                j4k.LJIIJ = null;
                            }
                            j4k.LJ = null;
                            j4k.LJIILIIL = false;
                            j4k.LJIILJJIL = -999;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                i = j4k.LJIILJJIL;
            }
            this.LJIIL = i;
            J4T.LIZ.LJIILLIIL = smartHarModel.getUseSmooth();
            J4J j4j2 = J4V.LIZ;
            int i2 = this.LJIIL;
            if (j4j2.LIZIZ) {
                j4j2.LIZLLL.LIZIZ = System.currentTimeMillis();
                int i3 = (int) (-1);
                j4j2.LJ = i3;
                j4j2.LJFF = i3;
                j4j2.LJI = i2;
                if (V0Q.Default.nextFloat() < J53.LIZJ) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(WM7.SCENE_SERVICE, j4j2.LIZ);
                        jSONObject.put("sdk_duration", Float.valueOf(j4j2.LIZLLL.LIZ()));
                        jSONObject.put("download_cost", j4j2.LJ);
                        jSONObject.put("model_cost", j4j2.LJFF);
                        jSONObject.put("sdk_success", j4j2.LJI);
                    } catch (JSONException unused3) {
                    }
                    FMX.LJIILJJIL("ml_scene_init", jSONObject);
                }
            }
            J4T.LIZ.LIZ(this);
            SmartHARService.Companion.getClass();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final void checkAndInit() {
        float f;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        String str = null;
        if (!SmartHARExperiment.LIZ) {
            SmartHARExperiment.LIZIZ = (SmartHARExperiment.SmartHarModel) i0.LJ(true, "smart_har_ml", 31744, SmartHARExperiment.SmartHarModel.class, null);
            SmartHARExperiment.LIZ = true;
        }
        SmartHARExperiment.SmartHarModel smartHarModel = SmartHARExperiment.LIZIZ;
        if (smartHarModel == null) {
            return;
        }
        this.LJIIJ = smartHarModel;
        MLCommonService.Companion.getClass();
        C46434IKg.LIZ.addCommonEventListener("play_first_frame", this);
        J4J j4j = J4V.LIZ;
        j4j.LIZIZ = J53.LIZ("har_android");
        SmartHARExperiment.SmartHarModel smartHarModel2 = this.LJIIJ;
        if (smartHarModel2 != null) {
            f = smartHarModel2.getReportTrackRate();
        } else {
            f = 0.0f;
        }
        j4j.LIZJ = f;
        SmartHARExperiment.SmartHarModel smartHarModel3 = this.LJIIJ;
        if (smartHarModel3 != null) {
            str = smartHarModel3.getMlSdkPackageUrl();
        }
        if (!TextUtils.isEmpty(str)) {
            this.LJIIJJI = new J43(this.LJIIJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final boolean enable() {
        SmartHARExperiment.SmartHarModel smartHarModel = this.LJIIJ;
        if (smartHarModel != null) {
            return smartHarModel.getEnable();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final Map<String, Float> getLastResult() {
        Map<String, Float> LJFF = J4T.LIZ.LJFF();
        SmartHARService.Companion.getClass();
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final int getLastStatus() {
        int i;
        J4K j4k = J4T.LIZ;
        j4k.getClass();
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.getLastIntStatus result:");
            LIZ.append(j4k.LJI);
            X1D.LIZIZ(LIZ);
        }
        C47400Iiy c47400Iiy = j4k.LJI;
        if (c47400Iiy != null) {
            i = c47400Iiy.LIZ;
        } else {
            i = 0;
        }
        SmartHARService.Companion.getClass();
        return i;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final void addPredictListener(FQL fql) {
        SmartHARService.Companion.getClass();
        if (fql != null) {
            synchronized (this.LJIILIIL) {
                if (!this.LJIILIIL.contains(fql)) {
                    this.LJIILIIL.add(fql);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final String intStatusToName(int i) {
        return intStringStatusToName(String.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final String intStringStatusToName(String status) {
        o.LJIIIZ(status, "status");
        return C47399Iix.LIZJ(status);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final void removePredictListener(FQL fql) {
        SmartHARService.Companion.getClass();
        if (fql != null) {
            synchronized (this.LJIILIIL) {
                if (this.LJIILIIL.contains(fql)) {
                    this.LJIILIIL.remove(fql);
                }
            }
        }
    }

    @Override // X.J4G
    public final void LIZIZ(String type, J4A j4a) {
        String str;
        String str2;
        Aweme aweme;
        User author;
        Aweme aweme2;
        o.LJIIIZ(type, "type");
        SmartHARService.Companion.getClass();
        String str3 = null;
        if (SmartHARService.debug) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onEvent type:", type, " aweme:");
            if (j4a != null && (aweme2 = j4a.LIZ) != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            LIZIZ.append(str);
            LIZIZ.append('-');
            if (j4a != null && (aweme = j4a.LIZ) != null && (author = aweme.getAuthor()) != null) {
                str2 = author.getNickname();
            } else {
                str2 = null;
            }
            LIZIZ.append(str2);
            X1D.LIZIZ(LIZIZ);
        }
        if (o.LJ(type, "play_first_frame") && j4a != null) {
            Aweme aweme3 = j4a.LIZ;
            if (aweme3 != null) {
                str3 = aweme3.getAid();
            }
            triggerSmartHarPredict(str3, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final int getLastRangeMostStatus(int i, boolean z) {
        List<C47400Iiy> LJI = J4T.LIZ.LJI(i, z);
        int i2 = 0;
        if (LJI != null && !LJI.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = LJI.size();
            while (i2 < size) {
                Map<String, Float> map = ((C47400Iiy) ListProtector.get(LJI, i2)).LIZLLL;
                if (map != null) {
                    for (Map.Entry<String, Float> entry : map.entrySet()) {
                        if (entry != null) {
                            float floatValue = entry.getValue().floatValue();
                            Float f = (Float) hashMap.get(entry.getKey());
                            if (f != null) {
                                floatValue += f.floatValue();
                            }
                            hashMap.put(entry.getKey(), Float.valueOf(floatValue));
                        }
                    }
                }
                i2++;
            }
            i2 = C47399Iix.LIZIZ(C47399Iix.LIZ(hashMap));
        }
        if (J6U.LIZ) {
            UC7.LIZLLL("HARService.getLastRangeMostIntStatus status:", i2);
        }
        SmartHARService.Companion.getClass();
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final List<Integer> getLastRangeStatus(int i, boolean z) {
        ArrayList arrayList;
        List<C47400Iiy> LJI = J4T.LIZ.LJI(i, z);
        if (LJI != null && !LJI.isEmpty()) {
            arrayList = new ArrayList();
            int size = LJI.size();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(Integer.valueOf(((C47400Iiy) ListProtector.get(LJI, i2)).LIZ));
                if (i2 < size - 1) {
                    i2++;
                }
            }
        } else {
            arrayList = null;
        }
        if (J6U.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HARService.getLastRangeStatus out:");
            LIZ.append(arrayList);
            X1D.LIZIZ(LIZ);
        }
        SmartHARService.Companion.getClass();
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final boolean triggerSmartHarPredict(String str, boolean z) {
        boolean z2;
        SmartHARExperiment.SmartHarModel smartHarModel = this.LJIIJ;
        SmartHARService.Companion.getClass();
        if (SmartHARService.debug) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("triggerSmartHarPredict enable:");
            if (smartHarModel != null) {
                z2 = smartHarModel.getEnable();
            } else {
                z2 = false;
            }
            LIZ.append(z2);
            LIZ.append(" aid");
            LIZ.append(str);
            LIZ.append(" envNotReadyTimes:");
            LIZ.append(this.LJ);
            LIZ.append(" runFailTimes:");
            LIZ.append(this.LJI);
            LIZ.append(" skipTimes:");
            LIZ.append(this.LIZ);
            LIZ.append(" skipFeedCount:");
            LIZ.append(this.LIZLLL);
            LIZ.append(" isRunning:");
            LIZ.append(this.LIZIZ);
            X1D.LIZIZ(LIZ);
        }
        if (!enable() || smartHarModel == null || ((str == null && !z) || this.LJ >= this.LJFF || this.LJI >= this.LJII || C84763XOl.LJIIJJI)) {
            return false;
        }
        if (!z) {
            if (smartHarModel.getSkipCount() > 0 && this.LIZ < smartHarModel.getSkipCount()) {
                this.LIZ++;
                return false;
            }
            if (smartHarModel.getRunTimeGap() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.LIZJ < smartHarModel.getRunTimeGap()) {
                    return false;
                }
                this.LIZJ = currentTimeMillis;
            }
            if (smartHarModel.getRunFeedGap() > 0) {
                if (this.LIZLLL < smartHarModel.getRunFeedGap()) {
                    this.LIZLLL++;
                    return false;
                }
                this.LIZLLL = 0;
            }
        }
        if (smartHarModel.getRunMode() == 0) {
            J4K j4k = J4T.LIZ;
            j4k.getClass();
            if (J6U.LIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("HARService.isPredicting:");
                LIZ2.append(j4k.LIZ);
                LIZ2.append(" oncePredicting:");
                LIZ2.append(j4k.LIZJ);
                X1D.LIZIZ(LIZ2);
            }
            if (j4k.LIZ || j4k.LIZJ) {
                return true;
            }
        }
        if (this.LIZIZ) {
            return true;
        }
        this.LIZIZ = true;
        J3U.LIZJ(smartHarModel.getRunDelay(), new ARunnableS27S0200000_8(smartHarModel, this, 23));
        return true;
    }

    @Override // X.J4Y
    public final void LIZ(Map map, int i, boolean z) {
        int i2;
        SmartHARService.Companion.getClass();
        if (z) {
            i2 = C47399Iix.LIZIZ(C47399Iix.LIZ(map));
            J4V.LIZ.LIZ(i, i2, map);
        } else {
            J4V.LIZ.LIZ(i, -2, map);
            i2 = 0;
        }
        if (!this.LJIILIIL.isEmpty()) {
            synchronized (this.LJIILIIL) {
                int size = this.LJIILIIL.size();
                for (int i3 = 0; i3 < size; i3++) {
                    FQL fql = this.LJIILIIL.get(i3);
                    o.LJIIIIZZ(fql, "predictListeners[i]");
                    fql.LIZ(map, i2, z);
                }
            }
        }
    }
}
