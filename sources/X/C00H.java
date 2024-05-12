package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.00H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00H {
    public static final ThreadLocal<Matrix> LIZ = new ThreadLocal<>();
    public static final ThreadLocal<RectF> LIZIZ = new ThreadLocal<>();

    public static void LIZ(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            LIZ(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r2.getScrollX(), -r2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
