package X;

import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.15J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15J {
    public final C15G LIZ;
    public final View LIZIZ;

    public C15J(C15G c15g, View view, Window window) {
        this.LIZ = c15g;
        this.LIZIZ = view;
        if (view != null) {
            view.setFitsSystemWindows(true);
            C0P1.LIZIZ(view, new C38941fu(this));
        }
        if (window != null) {
            C0P2.LIZ(window);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(-1);
        }
    }
}
