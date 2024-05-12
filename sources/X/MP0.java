package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class MP0 implements InterfaceC226988vW {
    public final /* synthetic */ C56747MOx LIZ;

    @Override // X.InterfaceC226988vW
    public final void LIZ() {
        this.LIZ.LIZIZ();
        if (this.LIZ.LIZLLL == MPS.Follow) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "follow");
            FMX.LJIIL("notification_setting_alert_close", c188727au.LIZ);
        } else {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "message");
            FMX.LJIIL("notification_setting_alert_close", c188727au2.LIZ);
        }
    }

    @Override // X.InterfaceC226988vW
    public final void LIZIZ() {
        this.LIZ.LIZ.setVisibility(8);
        C56747MOx c56747MOx = this.LIZ;
        Context context = c56747MOx.LIZIZ;
        MR6 mr6 = c56747MOx.LIZJ;
        if (mr6 != null) {
            try {
                mr6.LIZIZ(context);
            } catch (Exception unused) {
                C16880lQ.LIZJ(c56747MOx.LIZIZ, new Intent("android.settings.SETTINGS"));
            }
        }
        if (this.LIZ.LIZLLL == MPS.Follow) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "follow");
            FMX.LJIIL("notification_setting_alert_click", c188727au.LIZ);
        } else {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "message");
            FMX.LJIIL("notification_setting_alert_click", c188727au2.LIZ);
        }
    }

    public MP0(C56747MOx c56747MOx) {
        this.LIZ = c56747MOx;
    }
}
