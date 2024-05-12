package X;

import android.view.View;
import com.bytedance.router.SmartRouter;

/* loaded from: classes5.dex */
public final class AAG implements View.OnClickListener {
    public static final AAG LJLIL = new AAG();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SmartRouter.buildRoute(view.getContext(), "//friends/invite").open();
        FMX.LJIIL("invite_friends", C51029K0z.LJJIIZI(new OSZ("enter_from", "homepage_friends")));
    }
}
