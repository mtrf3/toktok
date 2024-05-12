package X;

import com.ss.android.ugc.aweme.experiment.EffectPanelRedesignConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.95m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2311895m {
    public static final EffectPanelRedesignConfig LIZ = new EffectPanelRedesignConfig(false, false, false, false, false, 31, null);
    public static final EffectPanelRedesignConfig LIZIZ;
    public static final EffectPanelRedesignConfig LIZJ;
    public static final EffectPanelRedesignConfig LIZLLL;
    public static final EffectPanelRedesignConfig LJ;
    public static final EffectPanelRedesignConfig LJFF;

    static {
        new EffectPanelRedesignConfig(true, false, false, false, false);
        LIZIZ = new EffectPanelRedesignConfig(true, true, false, true, false);
        LIZJ = new EffectPanelRedesignConfig(true, false, true, true, false);
        LIZLLL = new EffectPanelRedesignConfig(true, false, false, false, true);
        LJ = new EffectPanelRedesignConfig(true, true, false, true, true);
        LJFF = new EffectPanelRedesignConfig(true, false, true, true, true);
    }

    public static final EffectPanelRedesignConfig LIZ() {
        EffectPanelRedesignConfig effectPanelRedesignConfig;
        FFL LJIIIZ = FFL.LJIIIZ();
        EffectPanelRedesignConfig effectPanelRedesignConfig2 = LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "effect_panel_redesign", 31744, EffectPanelRedesignConfig.class, effectPanelRedesignConfig2);
        if (!(LJIJ instanceof EffectPanelRedesignConfig) || (effectPanelRedesignConfig = (EffectPanelRedesignConfig) LJIJ) == null) {
            return effectPanelRedesignConfig2;
        }
        return effectPanelRedesignConfig;
    }

    public static final boolean LIZIZ() {
        EffectPanelRedesignConfig LIZ2 = LIZ();
        if (o.LJ(LIZ2, LIZIZ) || o.LJ(LIZ2, LIZJ) || o.LJ(LIZ2, LJ) || o.LJ(LIZ2, LJFF)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ() {
        EffectPanelRedesignConfig LIZ2 = LIZ();
        if (o.LJ(LIZ2, LIZIZ) || o.LJ(LIZ2, LJ)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        EffectPanelRedesignConfig LIZ2 = LIZ();
        if (o.LJ(LIZ2, LIZLLL) || o.LJ(LIZ2, LJ) || o.LJ(LIZ2, LJFF)) {
            return true;
        }
        return false;
    }

    public static final boolean LJ() {
        return !o.LJ(LIZ(), LIZ);
    }
}
