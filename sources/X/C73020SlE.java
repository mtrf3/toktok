package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.o;

/* renamed from: X.SlE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73020SlE {
    public static final ThreadLocal<Matrix> LIZ = new ThreadLocal<>();
    public static final ThreadLocal<RectF> LIZIZ = new ThreadLocal<>();

    public static void LIZ(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            LIZ(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r2.getScrollX(), -r2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        o.LJIIIIZZ(matrix2, "view.matrix");
        if (!matrix2.isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
