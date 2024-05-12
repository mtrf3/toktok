package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* renamed from: X.20s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C515820s extends AbstractC42751m3 {
    public C515820s(C1O4 c1o4) {
        super(C12960f6.LJFF, c1o4);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C006900z c006900z) {
        C006900z dialogStatus = c006900z;
        o.LJIIIZ(dialogStatus, "dialogStatus");
        LiveGiftTrayPublicScreenTranslateSetting liveGiftTrayPublicScreenTranslateSetting = LiveGiftTrayPublicScreenTranslateSetting.INSTANCE;
        if (liveGiftTrayPublicScreenTranslateSetting.canCommonWidgetsAlphaXfer(dialogStatus.LIZ.LIZLLL)) {
            if (dialogStatus.LIZ.LIZ) {
                ConstraintProperty LIZIZ = LIZIZ();
                if (LIZIZ != null && LIZIZ.visibility() == 8) {
                    return;
                }
                ConstraintProperty LIZIZ2 = LIZIZ();
                if (LIZIZ2 != null) {
                    LIZIZ2.visibility(8);
                }
                ConstraintProperty LIZIZ3 = LIZIZ();
                if (LIZIZ3 == null) {
                    return;
                }
                LIZIZ3.alpha(0.0f);
                return;
            }
            C29602Bja c29602Bja = dialogStatus.LIZIZ;
            if (c29602Bja == null) {
                ConstraintProperty LIZIZ4 = LIZIZ();
                if (LIZIZ4 != null) {
                    LIZIZ4.visibility(0);
                }
                ConstraintProperty LIZIZ5 = LIZIZ();
                if (LIZIZ5 == null) {
                    return;
                }
                LIZIZ5.alpha(1.0f);
                return;
            }
            if (liveGiftTrayPublicScreenTranslateSetting.canCommonWidgetsAlphaXfer(c29602Bja.LIZLLL)) {
                return;
            }
            ConstraintProperty LIZIZ6 = LIZIZ();
            if (LIZIZ6 != null) {
                LIZIZ6.visibility(0);
            }
            ConstraintProperty LIZIZ7 = LIZIZ();
            if (LIZIZ7 == null) {
                return;
            }
            LIZIZ7.alpha(1.0f);
        }
    }
}
