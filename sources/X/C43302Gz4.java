package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.Gz4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43302Gz4 {
    public static final /* synthetic */ int LIZ = 0;

    public static FrameLayout.LayoutParams LIZIZ(Context context, int i, float f) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        float LIZLLL = (C81184Vtc.LIZLLL(context) - i) - C81184Vtc.LJFF(context);
        float min = Math.min(f, 0.8f * LIZLLL);
        layoutParams.height = (int) min;
        layoutParams.width = (int) (0.75f * min);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) ((LIZLLL - min) * 0.25f);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams LIZ(Context context, View view, int i, float f) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        float LIZLLL = (C81184Vtc.LIZLLL(context) - i) - C81184Vtc.LJFF(context);
        float min = Math.min(f, 0.8f * LIZLLL);
        float f2 = (LIZLLL - min) * 0.25f;
        float f3 = min / f;
        view.setScaleX(f3);
        view.setScaleY(f3);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) f2;
        return layoutParams;
    }
}
