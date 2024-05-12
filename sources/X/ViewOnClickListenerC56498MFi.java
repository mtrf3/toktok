package X;

import android.view.View;

/* renamed from: X.MFi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56498MFi implements View.OnClickListener {
    public static final ViewOnClickListenerC56498MFi LJLIL = new ViewOnClickListenerC56498MFi();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", "click");
        c188727au.LJIIIZ("optimize_type", "find_friends");
        FMX.LJIIL("optimize_profile", c188727au.LIZ);
    }
}
