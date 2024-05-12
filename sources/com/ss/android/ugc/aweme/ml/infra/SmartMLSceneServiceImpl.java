package com.ss.android.ugc.aweme.ml.infra;

import X.AbstractC48510J2c;
import X.AbstractC48521J2n;
import X.C35750E1i;
import X.C46687ITz;
import X.C47333Iht;
import X.C47663InD;
import X.C48044ItM;
import X.C48509J2b;
import X.C48511J2d;
import X.IE2;
import X.IFF;
import X.IFR;
import X.InterfaceC48512J2e;
import X.InterfaceC48513J2f;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class SmartMLSceneServiceImpl extends SmartMLSceneService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, C48511J2d> LIZ = new ConcurrentHashMap();

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean enable(String str) {
        C48511J2d c48511J2d;
        AbstractC48510J2c abstractC48510J2c;
        if (str == null || str.length() == 0 || (c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC48510J2c = c48511J2d.LIZ) == null) {
            return false;
        }
        return abstractC48510J2c.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void ensureEnvAvailable(String str) {
        C48511J2d c48511J2d;
        AbstractC48510J2c abstractC48510J2c;
        if (str == null || str.length() == 0 || (c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC48510J2c = c48511J2d.LIZ) == null) {
            return;
        }
        abstractC48510J2c.LJI();
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public final AbstractC48521J2n getSmartRunner(String str) {
        C48511J2d c48511J2d;
        Object obj;
        C35750E1i LIZIZ2;
        if (str == null || str.length() == 0 || (c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str)) == null) {
            return null;
        }
        AbstractC48510J2c abstractC48510J2c = c48511J2d.LIZ;
        if (abstractC48510J2c != null && (LIZIZ2 = abstractC48510J2c.LIZIZ()) != null) {
            obj = LIZIZ2.LIZ("result");
        } else {
            obj = null;
        }
        if (!(obj instanceof AbstractC48521J2n)) {
            return null;
        }
        return (AbstractC48521J2n) obj;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final boolean isEnvReady(String str) {
        C48511J2d c48511J2d;
        AbstractC48510J2c abstractC48510J2c;
        if (str == null || str.length() == 0 || (c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC48510J2c = c48511J2d.LIZ) == null) {
            return false;
        }
        return abstractC48510J2c.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final int lastRunErrorCode(String str) {
        C48511J2d c48511J2d;
        AbstractC48510J2c abstractC48510J2c;
        C47333Iht LJFF;
        if (str == null || str.length() == 0 || (c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str)) == null || (abstractC48510J2c = c48511J2d.LIZ) == null || (LJFF = abstractC48510J2c.LJFF()) == null) {
            return -100;
        }
        return LJFF.LJ;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final C48044ItM lastSuccessRunResult(String str) {
        C48511J2d c48511J2d;
        if (str == null || str.length() == 0 || (c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str)) == null) {
            return null;
        }
        return c48511J2d.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void configSceneModel(String str, SmartSceneConfig smartSceneConfig) {
        if (str == null || str.length() == 0 || smartSceneConfig == null || !TextUtils.equals(str, smartSceneConfig.getScene()) || ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return;
        }
        C46687ITz c46687ITz = IE2.LIZ;
        if (c46687ITz == null) {
            c46687ITz = IFR.LIZ;
        }
        AbstractC48510J2c LIZ = c46687ITz.LIZ(str);
        if (LIZ != null) {
            C47663InD c47663InD = new C47663InD(str);
            c47663InD.LIZLLL = smartSceneConfig;
            LIZ.LIZJ(c47663InD);
        }
        ((ConcurrentHashMap) this.LIZ).put(str, new C48511J2d(LIZ));
    }

    public static Map LIZ(boolean z, int i, C48044ItM c48044ItM) {
        HashMap hashMap = new HashMap();
        hashMap.put("success", Boolean.valueOf(z));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (c48044ItM != null && z) {
            Float f = c48044ItM.LIZJ;
            if (f != null) {
                hashMap.put("value", Float.valueOf(f.floatValue()));
            }
            String str = c48044ItM.LIZ;
            if (str != null) {
                hashMap.put("label", str);
            }
            Map<String, Float> map = c48044ItM.LIZIZ;
            if (map != null) {
                hashMap.put("probMap", map);
            }
        }
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService
    public final Map<String, Object> runSync(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f) {
        AbstractC48510J2c abstractC48510J2c;
        if (str == null || str.length() == 0) {
            return LIZ(false, -1, null);
        }
        C48511J2d c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c48511J2d == null || (abstractC48510J2c = c48511J2d.LIZ) == null) {
            return LIZ(false, -1, null);
        }
        C47333Iht LJIIIIZZ = abstractC48510J2c.LJIIIIZZ(iff);
        if (LJIIIIZZ != null) {
            C48044ItM c48044ItM = new C48044ItM();
            c48044ItM.LIZ = LJIIIIZZ.LIZ;
            c48044ItM.LIZIZ = LJIIIIZZ.LIZIZ;
            c48044ItM.LIZJ = LJIIIIZZ.LIZJ;
            c48044ItM.LIZLLL = LJIIIIZZ.LIZLLL;
            if (c48044ItM.LIZ()) {
                c48511J2d.LIZIZ = c48044ItM;
            }
            return LIZ(LJIIIIZZ.LIZ(), LJIIIIZZ.LJ, c48044ItM);
        }
        return LIZ(false, -5, null);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void run(String str, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
        runDelay(str, 0L, iff, null, interfaceC48512J2e);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.SmartMLSceneService, com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService
    public final void runDelay(String str, long j, IFF iff, InterfaceC48513J2f interfaceC48513J2f, InterfaceC48512J2e interfaceC48512J2e) {
        AbstractC48510J2c abstractC48510J2c;
        if (str == null || str.length() == 0) {
            if (interfaceC48512J2e != null) {
                interfaceC48512J2e.LIZ(false, -1, null, iff);
                return;
            }
            return;
        }
        C48511J2d c48511J2d = (C48511J2d) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c48511J2d == null || (abstractC48510J2c = c48511J2d.LIZ) == null) {
            if (interfaceC48512J2e != null) {
                interfaceC48512J2e.LIZ(false, -1, null, iff);
                return;
            }
            return;
        }
        abstractC48510J2c.LJII(j, iff, new C48509J2b(c48511J2d, interfaceC48512J2e, iff));
    }
}
