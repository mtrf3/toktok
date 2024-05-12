package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C65889PtV;
import X.C65891PtX;
import X.HG3;
import X.RAH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDCListenerS163S0100000_11 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS163S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS163S0100000_11 iDCListenerS163S0100000_11, DialogInterface dialogInterface, int i) {
        ((RAH) iDCListenerS163S0100000_11.l0).LIZIZ("go_back");
        ActivityC45651qj mo49getActivity = ((RAH) iDCListenerS163S0100000_11.l0).LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
    }

    public static final void onClick$1(IDCListenerS163S0100000_11 iDCListenerS163S0100000_11, DialogInterface dialogInterface, int i) {
        DeviceAuthDialog this$0 = (DeviceAuthDialog) iDCListenerS163S0100000_11.l0;
        o.LJIIIZ(this$0, "this$0");
        View wl = this$0.wl(false);
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.setContentView(wl);
        }
        LoginClient.Request request = this$0.LJLLI;
        if (request == null) {
            return;
        }
        this$0.Jl(request);
    }

    public static final void onClick$2(IDCListenerS163S0100000_11 iDCListenerS163S0100000_11, DialogInterface dialogInterface, int i) {
        ((LoginManager) iDCListenerS163S0100000_11.l0).LIZLLL();
    }

    public static final void onClick$3(IDCListenerS163S0100000_11 iDCListenerS163S0100000_11, DialogInterface dialogInterface, int i) {
        HG3.LJIIIIZZ().logout("expired_logout", "sdk_expired_logout");
        ((C65889PtV) iDCListenerS163S0100000_11.l0).LIZJ.set(false);
    }

    public static final void onClick$4(IDCListenerS163S0100000_11 iDCListenerS163S0100000_11, DialogInterface dialogInterface, int i) {
        ((C65889PtV) iDCListenerS163S0100000_11.l0).LIZJ.set(false);
    }

    public static final void onClick$5(IDCListenerS163S0100000_11 iDCListenerS163S0100000_11, DialogInterface dialogInterface, int i) {
        HG3.LJIIIIZZ().logout("expired_logout", "sdk_expired_logout", C16880lQ.LLJJIJI(((LogoutDialogActivity) iDCListenerS163S0100000_11.l0).getIntent()), C65891PtX.LIZ);
        dialogInterface.dismiss();
        ((LogoutDialogActivity) iDCListenerS163S0100000_11.l0).finish();
        ((LogoutDialogActivity) iDCListenerS163S0100000_11.l0).overridePendingTransition(0, 0);
    }
}
