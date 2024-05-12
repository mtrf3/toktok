package X;

import android.view.View;
import com.bytedance.router.SmartRouter;

/* renamed from: X.L6w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC53730L6w implements View.OnClickListener {
    public static final ViewOnClickListenerC53730L6w LJLIL = new ViewOnClickListenerC53730L6w();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SmartRouter.buildRoute(view.getContext(), "//account/setting").open();
    }
}
