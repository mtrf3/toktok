package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.MFh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56497MFh implements View.OnClickListener {
    public static final ViewOnClickListenerC56497MFh LJLIL = new ViewOnClickListenerC56497MFh();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActivityC45651qj LJ = C1DG.LJ(view, "it.context");
        if (LJ != null) {
            LJ.getSupportFragmentManager();
        }
        new Bundle().putString("show_type", "show_type_profile_post_guide");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("optimize_type", "edit_profile");
        FMX.LJIIL("optimize_profile", c188727au.LIZ);
    }
}
