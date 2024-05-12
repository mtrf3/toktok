package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LTT {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        boolean hasPermanentMenuKey = ViewConfiguration.get(ctx).hasPermanentMenuKey();
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
        boolean deviceHasKey2 = KeyCharacterMap.deviceHasKey(3);
        if (hasPermanentMenuKey || (deviceHasKey && deviceHasKey2)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Activity activity) {
        int height;
        o.LJIIIZ(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        o.LJIIIIZZ(decorView, "activity.window.decorView");
        int[] iArr = new int[2];
        decorView.getLocationOnScreen(iArr);
        int height2 = decorView.getHeight() + iArr[1];
        View findViewById = decorView.findViewById(R.id.content);
        if (findViewById == null) {
            height = 0;
        } else {
            int[] iArr2 = new int[2];
            findViewById.getLocationOnScreen(iArr2);
            height = findViewById.getHeight() + iArr2[1];
        }
        if (height2 != height) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "<this>");
        Window window = activity.getWindow();
        if (window != null) {
            LJFF(window, -16777216, false);
        }
    }

    public static final void LIZLLL(Window window) {
        LJFF(window, -16777216, false);
    }

    public static final void LJ(Activity activity) {
        o.LJIIIZ(activity, "<this>");
        Window window = activity.getWindow();
        if (window != null) {
            LJFF(window, -1, true);
        }
    }

    public static void LJFF(Window window, int i, boolean z) {
        int i2;
        if (Build.VERSION.SDK_INT >= 26) {
            window.setNavigationBarColor(i);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z) {
                window.clearFlags(134217728);
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                i2 = systemUiVisibility | 16;
            } else {
                i2 = systemUiVisibility & (-17);
            }
            if (i2 != systemUiVisibility) {
                window.getDecorView().setSystemUiVisibility(i2);
            }
        }
    }
}
