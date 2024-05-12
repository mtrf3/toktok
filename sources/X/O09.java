package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O09 {
    public static final void LIZ(Window window) {
        if (Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(-1);
            View decorView = window.getDecorView();
            o.LJIIIIZZ(decorView, "window.decorView");
            int systemUiVisibility = decorView.getSystemUiVisibility();
            window.clearFlags(134217728);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            int i = systemUiVisibility | 16;
            if (i != systemUiVisibility) {
                View decorView2 = window.getDecorView();
                o.LJIIIIZZ(decorView2, "window.decorView");
                decorView2.setSystemUiVisibility(i);
            }
        }
    }
}
