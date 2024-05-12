package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.abtest.SharePanelContactStrategyModel;

/* renamed from: X.3Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80893Fl {
    public static final SharePanelContactStrategyModel LIZ = new SharePanelContactStrategyModel();

    public static int LIZ() {
        SharePanelContactStrategyModel LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            return 15;
        }
        return LIZIZ.displayCount;
    }

    public static final SharePanelContactStrategyModel LIZIZ() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            SharePanelContactStrategyModel sharePanelContactStrategyModel = LIZ;
            LJIIIZ.getClass();
            return (SharePanelContactStrategyModel) FFL.LJIJ(true, "share_panel_contact_display_strategy", 31744, SharePanelContactStrategyModel.class, sharePanelContactStrategyModel);
        } catch (Throwable unused) {
            return LIZ;
        }
    }
}
