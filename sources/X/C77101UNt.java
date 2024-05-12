package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.microsoft.device.display.DisplayMask;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UNt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77101UNt {
    public static int LIZ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            Object LLILL = C16880lQ.LLILL(context, "window");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
            return ((WindowManager) LLILL).getDefaultDisplay().getRotation();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    public static Rect LIZIZ(Context context) {
        DisplayMask fromResourcesRectApproximation;
        o.LJIIIZ(context, "context");
        if (LJ(context) && (fromResourcesRectApproximation = DisplayMask.fromResourcesRectApproximation(context)) != null) {
            List<Rect> boundingRectsForRotation = fromResourcesRectApproximation.getBoundingRectsForRotation(LIZ(context));
            if (boundingRectsForRotation.size() == 0) {
                return new Rect(0, 0, 0, 0);
            }
            return (Rect) ListProtector.get(boundingRectsForRotation, 0);
        }
        return null;
    }

    public static List LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect LIZIZ = LIZIZ(context);
        Rect LIZLLL = LIZLLL(context);
        if (LIZIZ != null) {
            if (LIZIZ.left > 0) {
                rect.left = 0;
                rect.right = LIZIZ.left;
                rect.top = 0;
                rect.bottom = LIZLLL.bottom;
                rect2.left = LIZIZ.right;
                rect2.right = LIZLLL.right;
                rect2.top = 0;
                rect2.bottom = LIZLLL.bottom;
            } else {
                rect.left = 0;
                rect.right = LIZLLL.right;
                rect.top = 0;
                rect.bottom = LIZIZ.top;
                rect2.left = 0;
                rect2.right = LIZLLL.right;
                rect2.top = LIZIZ.bottom;
                rect2.bottom = LIZLLL.bottom;
            }
        }
        if (!rect.isEmpty() && !rect2.isEmpty()) {
            return C47261Igj.LJJIJIIJI(rect, rect2);
        }
        return null;
    }

    public static Rect LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        Rect rect = new Rect();
        Object LLILL = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) LLILL).getDefaultDisplay().getRectSize(rect);
        return rect;
    }

    public static boolean LJ(Context context) {
        Boolean bool;
        boolean z;
        o.LJIIIZ(context, "context");
        if (C77102UNu.LIZ == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    z = packageManager.hasSystemFeature("com.microsoft.device.display.displaymask");
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } catch (Exception unused) {
                bool = Boolean.FALSE;
            }
            C77102UNu.LIZ = bool;
        }
        Boolean bool2 = C77102UNu.LIZ;
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }

    public static boolean LJFF(Context context) {
        o.LJIIIZ(context, "context");
        Rect LIZIZ = LIZIZ(context);
        Rect LIZLLL = LIZLLL(context);
        if (LIZIZ != null && LIZLLL.width() > 0 && LIZLLL.height() > 0) {
            return LIZIZ.intersect(LIZLLL);
        }
        return false;
    }
}
