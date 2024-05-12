package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A9f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25763A9f implements G27 {
    public final /* synthetic */ C25765A9h LJLIL;

    public C25763A9f(C25765A9h c25765A9h) {
        this.LJLIL = c25765A9h;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        CustomDialogFragment customDialogFragment;
        Dialog dialog;
        C25765A9h c25765A9h;
        CustomDialogFragment customDialogFragment2;
        Dialog dialog2;
        Window window;
        WindowManager.LayoutParams attributes;
        o.LJIIIZ(newConfig, "newConfig");
        if (activity != null && (customDialogFragment = this.LJLIL.LJLLILLLL) != null && (dialog = customDialogFragment.getDialog()) != null && dialog.isShowing() && (customDialogFragment2 = (c25765A9h = this.LJLIL).LJLLILLLL) != null && (dialog2 = customDialogFragment2.getDialog()) != null && (window = dialog2.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            int i = attributes.height;
            int LIZ = C25764A9g.LIZ(activity);
            if (i > LIZ) {
                CustomDialogFragment customDialogFragment3 = c25765A9h.LJLLILLLL;
                if (customDialogFragment3 != null) {
                    customDialogFragment3.vl(new AqS29S0001000_4(LIZ, 21));
                }
                C25765A9h.LJIIIIZZ(c25765A9h, c25765A9h.LIZLLL().getPowerList(), LIZ, 0, null, 12);
            }
            c25765A9h.LJLLLL = LIZ;
        }
    }
}
