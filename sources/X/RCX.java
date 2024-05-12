package X;

import Y.ACListenerS31S0100000_11;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RCX extends DialogInterfaceC39771hF {
    public static boolean LJLJJLL;
    public static RCX LJLJL;
    public final Activity LJLJJI;
    public final boolean LJLJJL;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "androidx/appcompat/app/AlertDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-3030215059706131235")).LIZ) {
            super.show();
        }
        LJLJJLL = true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        LJLJJLL = false;
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        LJLJJLL = false;
        LJLJL = null;
    }

    @Override // X.DialogInterfaceC39771hF, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.m9, getLayoutInflater(), null);
        if (LLLZIIL != null) {
            C16880lQ.LJIJI((TextView) LLLZIIL.findViewById(R.id.mpl), new ACListenerS31S0100000_11(this, 17));
            C16880lQ.LJIJI((TextView) LLLZIIL.findViewById(R.id.mcb), new ACListenerS31S0100000_11(this, 18));
            TextView textView = (TextView) LLLZIIL.findViewById(R.id.mo6);
            TextView textView2 = (TextView) LLLZIIL.findViewById(R.id.m2v);
            TextView textView3 = (TextView) LLLZIIL.findViewById(R.id.mcb);
            textView.setText(this.LJLJJI.getString(R.string.h2t));
            StringBuilder LIZ = X1D.LIZ();
            Activity activity = this.LJLJJI;
            Object[] objArr = new Object[1];
            String str = "";
            String string = UserStore.LIZLLL.getString("mandatory_2sv_nudge_period", "");
            if (string != null) {
                str = string;
            }
            objArr[0] = str;
            LIZ.append(activity.getString(R.string.h2o, objArr));
            LIZ.append("\n\n");
            LIZ.append(this.LJLJJI.getString(R.string.h2p));
            textView2.setText(X1D.LIZIZ(LIZ));
            if (this.LJLJJL) {
                textView2.setText(this.LJLJJI.getString(R.string.h2q));
                textView3.setText(this.LJLJJI.getString(R.string.h2r));
            }
        }
        setContentView(LLLZIIL);
        UserStore.LJ.putLong("last_show_hpas_dialog_time", System.currentTimeMillis()).apply();
        setCanceledOnTouchOutside(false);
        setCancelable(!this.LJLJJL);
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZJ("enter_from", C16880lQ.LLJJIJIIJIL(this.LJLJJI.getIntent(), "enter_from"));
        if (this.LJLJJL) {
            FMX.LJIIL("show_twosv_mandatory_popup", c35936E8m.LIZ);
        } else {
            FMX.LJIIL("show_twosv_nudge_popup", c35936E8m.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCX(ActivityC45651qj context, boolean z) {
        super(context, R.style.a4v);
        o.LJIIIZ(context, "context");
        this.LJLJJI = context;
        this.LJLJJL = z;
    }
}
