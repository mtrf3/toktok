package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GJT implements IAbnormalExitLogService {
    public static final GJT LIZ = new GJT();

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogShow() {
        String LIZ2 = C78857UxB.LJJIIZ().LIZ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("last_status", LIZ2);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            c145995oB.LIZLLL("exit_reason", C39163FYp.LIZJ(LJIIIIZZ));
            c145995oB.LIZ(C39163FYp.LJ ? 1 : 0, "is_out_app_share");
            c145995oB.LIZIZ(System.currentTimeMillis() - C39163FYp.LJ(LJIIIIZZ), "interval_from_exit_app");
        }
        FMX.LJIIL("continue_popup_show", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logAppAbnormalExit() {
        C41025G8f.LIZ("story").LJ();
        C78857UxB.LJJIIZ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogClick(boolean z) {
        String str;
        String LIZ2 = C78857UxB.LJJIIZ().LIZ();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("last_status", LIZ2);
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        c145995oB.LIZLLL("click_position", str);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            c145995oB.LIZIZ(System.currentTimeMillis() - C39163FYp.LJ(LJIIIIZZ), "interval_from_exit_app");
        }
        FMX.LJIIL("continue_popup_click", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService
    public final void logRestoreDialogDismiss(String dismissType) {
        o.LJIIIZ(dismissType, "dismissType");
        C145995oB c145995oB = new C145995oB();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            c145995oB.LIZIZ(System.currentTimeMillis() - C39163FYp.LJ(LJIIIIZZ), "interval_from_exit_app");
            c145995oB.LIZLLL("dismiss_type", dismissType);
            c145995oB.LIZLLL("exit_reason", C39163FYp.LIZJ(LJIIIIZZ));
        }
        FMX.LJIIL("continue_popup_dismiss", c145995oB.LIZ);
    }
}
