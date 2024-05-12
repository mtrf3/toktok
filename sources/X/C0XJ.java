package X;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.0XJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XJ {
    public static final void LIZ(Paint paint, CharSequence text, int i, int i2, Rect rect) {
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(rect, "rect");
        paint.getTextBounds(text, i, i2, rect);
    }
}
