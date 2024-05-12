package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity) {
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
            try {
                Context LLLLJ = C16880lQ.LLLLJ(activity);
                o.LJFF(LLLLJ, "it.applicationContext");
                Class<?> loadClass = LLLLJ.getClassLoader().loadClass("android.os.SystemProperties");
                Object invoke = loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0);
                if (invoke != null) {
                    if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                        try {
                            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(activity.getWindow(), 768);
                            return;
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public static void LIZIZ(Activity activity, int i) {
        activity.getWindow().addFlags(67108864);
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, activity.getResources().getDimensionPixelSize(activity.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
        view.setBackgroundColor(i);
        Window window = activity.getWindow();
        o.LJFF(window, "activity.window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ((ViewGroup) decorView).addView(view);
            View findViewById = activity.findViewById(R.id.bst);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                if (childAt != null) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    viewGroup2.setFitsSystemWindows(true);
                    viewGroup2.setClipToPadding(true);
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
