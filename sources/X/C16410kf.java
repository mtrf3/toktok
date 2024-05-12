package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: X.0kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16410kf {
    public static View.AccessibilityDelegate LIZ(View view) {
        return view.getAccessibilityDelegate();
    }

    public static List<Rect> LIZIZ(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void LIZLLL(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static void LIZJ(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }
}
