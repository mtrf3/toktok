package X;

import android.graphics.Color;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* renamed from: X.948, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass948 {
    public static boolean LIZ = true;

    public static void LIZ(View view) {
        if (view == null) {
            return;
        }
        int ceil = ((int) Math.ceil(255 * 0.18f)) << 24;
        int max = Math.max(8, 4);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        int[] iArr = new int[max];
        int alpha = Color.alpha(ceil);
        for (int i = 0; i < max; i++) {
            iArr[i] = (((int) (alpha * Math.max(0.0f, Math.min(1.0f, (float) Math.pow((i * 1.0f) / (max - 1), 3.0d))))) << 24) | (16777215 & ceil);
        }
        paintDrawable.setShaderFactory(new DI1(0.0f, 0.0f, 0.0f, 1.0f, iArr));
        view.setBackgroundDrawable(paintDrawable);
    }
}
