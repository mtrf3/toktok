package com.ss.android.ugc.aweme.ml.infra;

import X.C46434IKg;
import X.C48044ItM;
import X.C48514J2g;
import X.C48524J2q;
import X.C48532J2y;
import X.C48551J3r;
import X.C48552J3s;
import X.C84763XOl;
import X.IFF;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import X.J4A;
import X.J4G;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictExperiment;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartPlaytimePredictServiceImpl extends SmartPlaytimePredictService implements J4G {
    public static final /* synthetic */ int LJ = 0;
    public final Map<String, C48552J3s> LIZ = new ConcurrentHashMap();
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void checkAndInit() {
        List<OnePlaytimePredictConfig> serviceList;
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        SmartPlaytimePredictConfig playtimePredictServiceConfig = SmartPlaytimePredictExperiment.INSTANCE.getPlaytimePredictServiceConfig();
        if (playtimePredictServiceConfig == null || (serviceList = playtimePredictServiceConfig.getServiceList()) == null || serviceList.isEmpty()) {
            return;
        }
        Iterator<OnePlaytimePredictConfig> it = serviceList.iterator();
        while (it.hasNext()) {
            configOneNewService(it.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void configOneNewService(OnePlaytimePredictConfig onePlaytimePredictConfig) {
        SmartSceneConfig sceneConfig;
        String scene;
        C48524J2q c48524J2q;
        if (onePlaytimePredictConfig == null || (sceneConfig = onePlaytimePredictConfig.getSceneConfig()) == null || (scene = sceneConfig.getScene()) == null || ((ConcurrentHashMap) this.LIZ).containsKey(scene)) {
            return;
        }
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.configSceneModel(scene, onePlaytimePredictConfig.getSceneConfig());
        ((ConcurrentHashMap) this.LIZ).put(scene, new C48552J3s(scene, onePlaytimePredictConfig));
        if (!this.LIZJ && onePlaytimePredictConfig.getTrigger() == 2) {
            this.LIZJ = true;
            MLCommonService.Companion.getClass();
            C46434IKg.LIZ.addCommonEventListener("play_call_playtime", this);
        } else if (!this.LIZLLL && onePlaytimePredictConfig.getTrigger() == 1) {
            this.LIZLLL = true;
            MLCommonService.Companion.getClass();
            C46434IKg.LIZ.addCommonEventListener("play_first_frame", this);
        }
        OnePlaytimePredictRealConfig realConfig = onePlaytimePredictConfig.getRealConfig();
        if (realConfig != null && (c48524J2q = C48524J2q.LJIILL.get(scene)) != null) {
            C48551J3r c48551J3r = new C48551J3r(realConfig);
            C48532J2y c48532J2y = new C48532J2y();
            c48532J2y.LIZ = realConfig.getTrackType();
            c48532J2y.LIZIZ = realConfig.getCount() + realConfig.getOffset();
            c48524J2q.LIZLLL(c48532J2y, c48551J3r);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final boolean enable(String str) {
        if (str == null || str.length() == 0 || !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return false;
        }
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.enable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void ensureEnvAvailable(String str) {
        if (str == null || str.length() == 0 || !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return;
        }
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.ensureEnvAvailable(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final boolean isEnvReady(String str) {
        if (str == null || str.length() == 0 || !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return false;
        }
        SmartMLSceneService.Companion.getClass();
        return C48514J2g.LIZ.isEnvReady(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult != null) {
            return lastSuccessRunResult.LIZIZ;
        }
        return null;
    }

    @Override // X.J4G
    public final void LIZIZ(String type, J4A j4a) {
        Aweme aweme;
        Aweme aweme2;
        o.LJIIIZ(type, "type");
        if (o.LJ(type, "play_first_frame")) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                if (((C48552J3s) entry.getValue()).LIZIZ.getTrigger() == 1) {
                    String str = (String) entry.getKey();
                    if (j4a != null) {
                        aweme2 = j4a.LIZ;
                    } else {
                        aweme2 = null;
                    }
                    predictWithAweme(str, aweme2, null, null);
                }
            }
            return;
        }
        if (o.LJ(type, "play_call_playtime")) {
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                if (((C48552J3s) entry2.getValue()).LIZIZ.getTrigger() == 2) {
                    String str2 = (String) entry2.getKey();
                    if (j4a != null) {
                        aweme = j4a.LIZ;
                    } else {
                        aweme = null;
                    }
                    predictWithAweme(str2, aweme, null, null);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final float lastPredictFloatResult(String str, float f) {
        Float f2;
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult != null && (f2 = lastSuccessRunResult.LIZJ) != null) {
            return f2.floatValue();
        }
        return f;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final String lastPredictResultLabel(String str, String str2) {
        String str3;
        SmartMLSceneService.Companion.getClass();
        C48044ItM lastSuccessRunResult = C48514J2g.LIZ.lastSuccessRunResult(str);
        if (lastSuccessRunResult == null || (str3 = lastSuccessRunResult.LIZ) == null) {
            return str2;
        }
        return str3;
    }

    public static void LIZ(String str, IFF iff, InterfaceC48512J2e interfaceC48512J2e) {
        SmartMLSceneService.Companion.getClass();
        ISmartMLSceneService iSmartMLSceneService = C48514J2g.LIZ;
        C48044ItM lastSuccessRunResult = iSmartMLSceneService.lastSuccessRunResult(str);
        if (lastSuccessRunResult != null) {
            if (interfaceC48512J2e != null) {
                interfaceC48512J2e.LIZ(true, 0, lastSuccessRunResult, iff);
            }
        } else {
            int lastRunErrorCode = iSmartMLSceneService.lastRunErrorCode(str);
            if (interfaceC48512J2e == null) {
                return;
            }
            interfaceC48512J2e.LIZ(false, lastRunErrorCode, null, iff);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final void predictWithAweme(String str, Aweme aweme, InterfaceC48512J2e interfaceC48512J2e) {
        predictWithAweme(str, aweme, null, interfaceC48512J2e);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService, com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService
    public final void predict(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
        if (str == null || str.length() == 0 || !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            if (interfaceC48512J2e != null) {
                interfaceC48512J2e.LIZ(false, -1, null, iff);
                return;
            }
            return;
        }
        C48552J3s c48552J3s = (C48552J3s) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c48552J3s == null) {
            if (interfaceC48512J2e != null) {
                interfaceC48512J2e.LIZ(false, -1, null, iff);
                return;
            }
            return;
        }
        if (C84763XOl.LJIIJJI) {
            LIZ(str, iff, interfaceC48512J2e);
            return;
        }
        if (c48552J3s.LIZIZ.getSkipCount() > 0 && c48552J3s.LIZJ < c48552J3s.LIZIZ.getSkipCount()) {
            c48552J3s.LIZJ++;
            LIZ(str, iff, interfaceC48512J2e);
            return;
        }
        if (c48552J3s.LIZIZ.getRunTimeGap() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c48552J3s.LIZLLL < c48552J3s.LIZIZ.getRunTimeGap()) {
                LIZ(str, iff, interfaceC48512J2e);
                return;
            }
            c48552J3s.LIZLLL = currentTimeMillis;
        }
        if (c48552J3s.LIZIZ.getRunFeedGap() > 0) {
            if (c48552J3s.LJ < c48552J3s.LIZIZ.getRunFeedGap()) {
                c48552J3s.LJ++;
                LIZ(str, iff, interfaceC48512J2e);
                return;
            }
            c48552J3s.LJ = 0;
        }
        c48552J3s.LJFF++;
        SmartMLSceneService.Companion.getClass();
        C48514J2g.LIZ.runDelay(str, c48552J3s.LIZIZ.getRunDelay(), iff, null, interfaceC48512J2e);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService
    public final void predictWithAweme(String str, Aweme aweme, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
        IFF iff = new IFF();
        iff.LJIIIIZZ = aweme;
        predict(str, iff, null, interfaceC48512J2e);
    }
}
