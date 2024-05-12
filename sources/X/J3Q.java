package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J3Q extends AbstractC48510J2c implements InterfaceC48527J2t {
    public static final J3Q LIZIZ = new J3Q();
    public static Boolean LIZJ = Boolean.FALSE;
    public static AbstractC48510J2c LIZLLL;
    public static SmartPrerenderConfig LJ;
    public static int LJFF;

    @Override // X.AbstractC48510J2c
    public final C47333Iht LJFF() {
        return null;
    }

    public J3Q() {
        super(SmartPrerenderExperiment.SCENE);
    }

    @Override // X.AbstractC48510J2c
    public final boolean LIZLLL() {
        if (LJ != null) {
            return !r0.getDisable();
        }
        return false;
    }

    @Override // X.AbstractC48510J2c
    public final void LJI() {
        AbstractC48510J2c abstractC48510J2c = LIZLLL;
        if (abstractC48510J2c != null) {
            abstractC48510J2c.LJI();
        }
    }

    public final void LJIIIZ() {
        C48524J2q c48524J2q;
        int i;
        Boolean bool = LIZJ;
        if (bool != null) {
            bool.booleanValue();
            LIZJ = Boolean.TRUE;
            SmartPrerenderConfig config = SmartPrerenderExperiment.INSTANCE.getConfig();
            if (config == null) {
                return;
            }
            LJ = config;
            C46687ITz c46687ITz = IE2.LIZ;
            if (c46687ITz == null) {
                c46687ITz = IFR.LIZ;
            }
            AbstractC48510J2c LIZ = c46687ITz.LIZ(SmartPrerenderExperiment.SCENE);
            if (LIZ == null) {
                return;
            }
            LIZLLL = LIZ;
            C47663InD c47663InD = new C47663InD(SmartPrerenderExperiment.SCENE);
            c47663InD.LIZLLL = LJ;
            LIZ.LIZJ(c47663InD);
            SmartPrerenderConfig smartPrerenderConfig = LJ;
            if (smartPrerenderConfig != null && smartPrerenderConfig.enableMonitor && (c48524J2q = C48524J2q.LJIILL.get(SmartPrerenderExperiment.SCENE)) != null) {
                C48532J2y c48532J2y = new C48532J2y();
                SmartPrerenderConfig smartPrerenderConfig2 = LJ;
                if (smartPrerenderConfig2 != null) {
                    i = smartPrerenderConfig2.waitCountForMonitor;
                } else {
                    i = 3;
                }
                c48532J2y.LIZIZ = i;
                c48532J2y.LIZ = 103;
                c48524J2q.LIZLLL(c48532J2y, this);
            }
        }
    }

    @Override // X.AbstractC48510J2c
    public final C47333Iht LJIIIIZZ(C47322Ihi c47322Ihi) {
        SmartPrerenderConfig smartPrerenderConfig;
        C47333Iht LJIIIIZZ;
        if (LIZLLL() && (smartPrerenderConfig = LJ) != null && c47322Ihi != null && C78880UxY.LJIL(c47322Ihi) != null) {
            if (smartPrerenderConfig.getSkipCount() > 0 && LJFF < smartPrerenderConfig.getSkipCount()) {
                int i = LJFF + 1;
                LJFF = i;
                if (i + 1 >= smartPrerenderConfig.getSkipCount()) {
                    LJI();
                }
                return null;
            }
            AbstractC48510J2c abstractC48510J2c = LIZLLL;
            if (abstractC48510J2c != null && (LJIIIIZZ = abstractC48510J2c.LJIIIIZZ(c47322Ihi)) != null) {
                LJIIIIZZ.LIZ();
                return LJIIIIZZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC48527J2t
    public final boolean LIZ(JSONObject json, C47322Ihi input) {
        String aid;
        C48618J6g LIZ;
        String str;
        o.LJIIIZ(input, "input");
        o.LJIIIZ(json, "json");
        SmartPrerenderConfig smartPrerenderConfig = LJ;
        if (smartPrerenderConfig != null) {
            long j = smartPrerenderConfig.timeThreshold;
            Aweme LJIL = C78880UxY.LJIL(input);
            if (LJIL == null || (aid = LJIL.getAid()) == null || (LIZ = J3S.LIZ.LIZ(aid)) == null) {
                return true;
            }
            try {
                if (LIZ.LJIIIIZZ.get() > j) {
                    str = "gt";
                } else {
                    str = "lt";
                }
                json.put("ss_result", str);
                return false;
            } catch (Throwable th) {
                C78983UzD.LJIJ(th, "SmartPrerenderException");
            }
        }
        return true;
    }
}
