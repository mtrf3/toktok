package X;

import com.ss.android.ugc.aweme.experiment.CreateTabRedesign;

/* renamed from: X.95o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312095o {
    public static final CreateTabRedesign LIZ = new CreateTabRedesign(0, false, 3, null);

    public static final CreateTabRedesign LIZ() {
        CreateTabRedesign createTabRedesign;
        FFL LJIIIZ = FFL.LJIIIZ();
        CreateTabRedesign createTabRedesign2 = LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "create_tab_redesign", 31744, CreateTabRedesign.class, createTabRedesign2);
        if (!(LJIJ instanceof CreateTabRedesign) || (createTabRedesign = (CreateTabRedesign) LJIJ) == null) {
            return createTabRedesign2;
        }
        return createTabRedesign;
    }

    public static final boolean LIZIZ() {
        if (LIZ().getCreatePanelGridSpanCount() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ() {
        if (LIZ().getCreatePanelGridSpanCount() == 5) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        return LIZ().getCreatePanelAddEffectName();
    }
}
