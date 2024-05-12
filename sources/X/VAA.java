package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class VAA {
    public static Integer LIZLLL;
    public final WeakReference<View> LIZ;
    public final List<UHU> LIZIZ = new ArrayList();
    public VAB LIZJ;

    public final View LJ() {
        return this.LIZ.get();
    }

    public final void LIZ() {
        View LJ = LJ();
        if (LJ != null) {
            ViewTreeObserver viewTreeObserver = LJ.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.LIZJ);
            }
        }
        this.LIZJ = null;
        ((ArrayList) this.LIZIZ).clear();
    }

    public VAA(View view) {
        this.LIZ = new WeakReference<>(view);
    }

    public static int LIZJ(View view) {
        int i;
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return LIZIZ(view, view.getHeight(), i, paddingBottom);
    }

    public static int LIZLLL(View view) {
        int i;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return LIZIZ(view, view.getWidth(), i, paddingRight);
    }

    public static int LIZIZ(View view, int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (!view.isLayoutRequested() && i2 == -2) {
            Context context = view.getContext();
            if (LIZLLL == null) {
                WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
                windowManager.getClass();
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                LIZLLL = Integer.valueOf(Math.max(point.x, point.y));
            }
            return LIZLLL.intValue();
        }
        return 0;
    }
}
