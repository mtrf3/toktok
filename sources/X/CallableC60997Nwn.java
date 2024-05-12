package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Nwn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC60997Nwn<V> implements Callable {
    public final /* synthetic */ Activity LJLIL;

    public CallableC60997Nwn(Activity activity) {
        this.LJLIL = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        DisplayMetrics displayMetrics;
        double d;
        Rect rect;
        Rect rect2;
        int i;
        int i2;
        int i3;
        Resources resources = this.LJLIL.getResources();
        if (resources != null) {
            displayMetrics = resources.getDisplayMetrics();
        } else {
            displayMetrics = null;
        }
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (displayMetrics != null) {
            d = displayMetrics.widthPixels;
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        int LJJJJI = C17N.LJJJJI(d);
        if (displayMetrics != null) {
            d2 = displayMetrics.heightPixels;
        }
        if (LF2.LIZ(LJJJJI, C17N.LJJJJI(d2 + JF5.LIZ(this.LJLIL)))) {
            Activity activity = this.LJLIL;
            o.LJIIIZ(activity, "activity");
            int i4 = 0;
            try {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30) {
                    rect = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
                    o.LJIIIIZZ(rect, "activity.windowManager.currentWindowMetrics.bounds");
                } else if (i5 >= 29) {
                    rect = C60994Nwk.LIZ(activity);
                } else if (i5 >= 28) {
                    rect = C60993Nwj.LIZ(activity);
                } else if (i5 >= 24) {
                    rect = C60988Nwe.LIZ(activity);
                } else {
                    Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                    o.LJIIIIZZ(defaultDisplay, "defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    int i6 = point.x;
                    if (i6 == 0 || (i3 = point.y) == 0) {
                        defaultDisplay.getRectSize(rect);
                    } else {
                        rect.right = i6;
                        rect.bottom = i3;
                    }
                }
            } catch (Exception unused) {
                rect = new Rect(0, 0, 0, 0);
            }
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    rect2 = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
                    o.LJIIIIZZ(rect2, "activity.windowManager.maximumWindowMetrics.bounds");
                } else {
                    Display display = activity.getWindowManager().getDefaultDisplay();
                    o.LJIIIIZZ(display, "display");
                    Point point2 = new Point();
                    display.getRealSize(point2);
                    rect2 = new Rect(0, 0, point2.x, point2.y);
                }
            } catch (Exception unused2) {
                rect2 = new Rect(0, 0, 0, 0);
            }
            int[] LIZ = C60996Nwm.LIZ(activity);
            int LIZLLL = C53947LFf.LIZLLL();
            int LIZ2 = C53947LFf.LIZ();
            if (LIZLLL <= 0 || LIZ2 <= 0) {
                C53946LFe.LIZJ(null, null);
                LIZLLL = C53947LFf.LIZLLL();
                LIZ2 = C53947LFf.LIZ();
            }
            C188727au c188727au = new C188727au();
            Resources resources2 = activity.getResources();
            if (resources2 != null && resources2.getDimensionPixelSize(R.dimen.a8f) > 0) {
                i = 1;
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "is_sw600_checked");
            Resources resources3 = activity.getResources();
            if (resources3 != null && resources3.getDimensionPixelSize(R.dimen.a8e) > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c188727au.LIZLLL(i2, "is_large");
            if ((activity.getResources().getConfiguration().screenLayout & 15) >= 3) {
                i4 = 1;
            }
            c188727au.LIZLLL(i4, "is_tablet");
            c188727au.LIZLLL(LF2.LIZJ() ? 1 : 0, "is_tablet_online");
            c188727au.LIZLLL(rect.width(), "current_window_width");
            c188727au.LIZLLL(rect.height(), "current_window_height");
            c188727au.LIZLLL(rect2.width(), "max_window_width");
            c188727au.LIZLLL(rect2.height(), "max_window_height");
            c188727au.LJFF(ORY.LJJIZ(LIZ), "real_window_width");
            c188727au.LJFF(ORY.LJJJLL(LIZ), "real_window_height");
            c188727au.LIZLLL(JF5.LIZJ(activity), "current_activity_width");
            c188727au.LIZLLL(JF5.LIZIZ(activity), "current_activity_height");
            c188727au.LIZLLL(LIZLLL, "screen_width_dp");
            c188727au.LIZLLL(LIZ2, "screen_height_dp");
            c188727au.LIZIZ(activity.getResources().getDimension(R.dimen.a8d), "system_density");
            c188727au.LIZIZ(activity.getApplication().getResources().getDisplayMetrics().density, "density");
            c188727au.LIZLLL(C61410O8g.LIZIZ(activity), "navigation_bar_height");
            c188727au.LIZLLL(C63081OpJ.LJJJJLI(activity), "status_bar_height");
            c188727au.LIZLLL(C78886Uxe.LJJIJIIJIL(activity) ? 1 : 0, "is_multiple_window_mode");
            c188727au.LIZLLL(C78886Uxe.LJJIJIL(activity) ? 1 : 0, "is_picture_in_picture_mode");
            c188727au.LIZLLL(C78886Uxe.LJJIJLIJ(activity) ? 1 : 0, "is_landscape");
            FMX.LJIIL("tablet_screen_info", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
