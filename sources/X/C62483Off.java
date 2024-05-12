package X;

import com.ss.android.ugc.aweme.share.base.experiment.ActionUIConfig;

/* renamed from: X.Off, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62483Off {
    public static final ActionUIConfig LIZ = new ActionUIConfig(0, 0, 0, 0, 0, 0, 0, false, 255, null);

    public static ActionUIConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        ActionUIConfig actionUIConfig = LIZ;
        LJIIIZ.getClass();
        ActionUIConfig actionUIConfig2 = (ActionUIConfig) FFL.LJIJ(true, "unifying_panel_action", 31744, ActionUIConfig.class, actionUIConfig);
        if (actionUIConfig2 == null) {
            return actionUIConfig;
        }
        return actionUIConfig2;
    }

    public static final C99Y LIZIZ() {
        if (LIZ().getFillModeInShare() > 0 || LIZ().getFillModeInLongPress() > 0) {
            return C99Y.SOLID;
        }
        return C99Y.HOLLOW;
    }

    public static EnumC62492Ofo LIZJ() {
        int orientation = LIZ().getOrientation();
        EnumC62492Ofo enumC62492Ofo = EnumC62492Ofo.VERTICAL;
        if (orientation == enumC62492Ofo.ordinal()) {
            return enumC62492Ofo;
        }
        return EnumC62492Ofo.HORIZONTAL;
    }
}
