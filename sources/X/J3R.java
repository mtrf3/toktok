package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.SmartMusicDetailPreloadExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartMusicDetailPreloadSceneConfig;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class J3R extends AbstractC48510J2c implements InterfaceC48527J2t {
    public static final J3R LIZIZ = new J3R();
    public static boolean LIZJ;
    public static SmartMusicDetailPreloadSceneConfig LIZLLL;
    public static AbstractC48510J2c LJ;
    public static int LJFF;

    @Override // X.AbstractC48510J2c
    public final C47333Iht LJFF() {
        return null;
    }

    public J3R() {
        super(SmartMusicDetailPreloadExperiment.SCENE);
    }

    @Override // X.AbstractC48510J2c
    public final boolean LIZLLL() {
        if (LIZLLL != null) {
            return !r0.getDisable();
        }
        return false;
    }

    @Override // X.AbstractC48510J2c
    public final void LJI() {
        AbstractC48510J2c abstractC48510J2c = LJ;
        if (abstractC48510J2c != null) {
            abstractC48510J2c.LJI();
        }
    }

    public final void LJIIIZ() {
        int i;
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        SmartMusicDetailPreloadSceneConfig config = SmartMusicDetailPreloadExperiment.INSTANCE.getConfig();
        if (config == null) {
            return;
        }
        LIZLLL = config;
        String scene = config.getScene();
        if (scene == null) {
            scene = SmartMusicDetailPreloadExperiment.SCENE;
        }
        C46687ITz c46687ITz = IE2.LIZ;
        if (c46687ITz == null) {
            c46687ITz = IFR.LIZ;
        }
        AbstractC48510J2c LIZ = c46687ITz.LIZ(scene);
        if (LIZ == null) {
            return;
        }
        LJ = LIZ;
        C47663InD c47663InD = new C47663InD(scene);
        c47663InD.LIZLLL = LIZLLL;
        AbstractC48510J2c abstractC48510J2c = LJ;
        if (abstractC48510J2c != null) {
            abstractC48510J2c.LIZJ(c47663InD);
        }
        C48524J2q c48524J2q = C48524J2q.LJIILL.get(scene);
        if (c48524J2q != null) {
            C48532J2y c48532J2y = new C48532J2y();
            SmartMusicDetailPreloadSceneConfig smartMusicDetailPreloadSceneConfig = LIZLLL;
            if (smartMusicDetailPreloadSceneConfig != null) {
                i = smartMusicDetailPreloadSceneConfig.waitCountForReal;
            } else {
                i = 2;
            }
            c48532J2y.LIZIZ = i;
            c48532J2y.LIZ = 103;
            c48524J2q.LIZLLL(c48532J2y, this);
        }
    }

    @Override // X.AbstractC48510J2c
    public final C47333Iht LJIIIIZZ(C47322Ihi c47322Ihi) {
        SmartMusicDetailPreloadSceneConfig smartMusicDetailPreloadSceneConfig;
        AbstractC48510J2c abstractC48510J2c;
        if (!LIZLLL() || (smartMusicDetailPreloadSceneConfig = LIZLLL) == null || (abstractC48510J2c = LJ) == null || c47322Ihi == null) {
            return null;
        }
        if (smartMusicDetailPreloadSceneConfig.getSkipCount() > 0 && LJFF < smartMusicDetailPreloadSceneConfig.getSkipCount()) {
            int i = LJFF + 1;
            LJFF = i;
            if (i == smartMusicDetailPreloadSceneConfig.getSkipCount()) {
                LJI();
            }
            return null;
        }
        return abstractC48510J2c.LJIIIIZZ(c47322Ihi);
    }

    @Override // X.InterfaceC48527J2t
    public final boolean LIZ(JSONObject json, C47322Ihi input) {
        String str;
        C48618J6g LIZ;
        String str2;
        o.LJIIIZ(input, "input");
        o.LJIIIZ(json, "json");
        Aweme LJIL = C78880UxY.LJIL(input);
        if (LJIL != null) {
            str = LJIL.getAid();
        } else {
            str = null;
        }
        if (str == null || (LIZ = J3S.LIZ.LIZ(str)) == null) {
            return true;
        }
        try {
            if (LIZ.LJI.intValue() > 0) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            json.put("ss_result", str2);
            return false;
        } catch (Throwable th) {
            C78983UzD.LJIJ(th, "musicDetailPreload");
            return true;
        }
    }
}
