package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.CleanUpPushPermissionConfig;

/* renamed from: X.MOx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56747MOx {
    public static int LJ = 3;
    public static int LJFF = 15;
    public final ViewOnClickListenerC226978vV LIZ;
    public final Context LIZIZ;
    public final MR6 LIZJ;
    public MPS LIZLLL = MPS.Message;

    public final void LIZ() {
        boolean z;
        if (this.LIZIZ == null || this.LIZ == null || this.LIZJ == null) {
            return;
        }
        C62822Ol8 c62822Ol8 = C97843si.LIZIZ;
        boolean z2 = true;
        if (((CleanUpPushPermissionConfig) c62822Ol8.getValue()).group != 4 && ((CleanUpPushPermissionConfig) c62822Ol8.getValue()).group != 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.LIZJ.LIZJ(this.LIZIZ)) {
                if (System.currentTimeMillis() - C38776FJs.LJIIL().LIZIZ(this.LIZIZ, "key_cross_push_notification_guide") <= LJFF * 86400000) {
                    z2 = false;
                }
                if (C97843si.LIZ()) {
                    if (C97653sP.LIZ() && z2) {
                        this.LIZ.setVisibility(0);
                        return;
                    } else {
                        this.LIZ.setVisibility(8);
                        return;
                    }
                }
                if (z2 && C38776FJs.LJIIL().LIZIZ(this.LIZIZ, "key_times_push_notification_guide") < LJ) {
                    this.LIZ.setVisibility(0);
                    if (this.LIZLLL == MPS.Follow) {
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "follow");
                        FMX.LJIIL("notification_setting_alert_show", c188727au.LIZ);
                        return;
                    } else {
                        C188727au c188727au2 = new C188727au();
                        c188727au2.LJIIIZ("enter_from", "message");
                        FMX.LJIIL("notification_setting_alert_show", c188727au2.LIZ);
                        return;
                    }
                }
                this.LIZ.setVisibility(8);
                return;
            }
            this.LIZ.setVisibility(8);
            return;
        }
        this.LIZ.setVisibility(8);
    }

    public final void LIZIZ() {
        ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = this.LIZ;
        if (viewOnClickListenerC226978vV != null && viewOnClickListenerC226978vV.getVisibility() == 0) {
            this.LIZ.setVisibility(8);
            if (C97843si.LIZ()) {
                C97653sP.LIZ.storeLong("key_unified_push_permission", System.currentTimeMillis());
            }
            C38776FJs.LJIIL().LJIIIZ(this.LIZIZ, "key_cross_push_notification_guide", Long.valueOf(System.currentTimeMillis()).longValue());
            C38776FJs.LJIIL().LJIIIZ(this.LIZIZ, "key_times_push_notification_guide", Long.valueOf(C38776FJs.LJIIL().LIZIZ(this.LIZIZ, "key_times_push_notification_guide") + 1).longValue());
        }
    }

    public C56747MOx(ViewOnClickListenerC226978vV viewOnClickListenerC226978vV, MR6 mr6) {
        this.LIZ = viewOnClickListenerC226978vV;
        viewOnClickListenerC226978vV.setVisibility(8);
        this.LIZJ = mr6;
        Context context = viewOnClickListenerC226978vV.getContext();
        this.LIZIZ = context;
        if (context != null) {
            viewOnClickListenerC226978vV.setOnInternalClickListener(new MP0(this));
        }
        try {
            C2YJ c2yj = C2YJ.LIZIZ;
            LJ = c2yj.LIZ.getPushGuideInfo().getCloseCountLimit().intValue();
            LJFF = c2yj.LIZ.getPushGuideInfo().getShowupInterval().intValue();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            LJ = 3;
            LJFF = 15;
        }
    }
}
