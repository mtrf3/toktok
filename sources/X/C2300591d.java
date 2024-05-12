package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.91d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2300591d {
    public int LIZ;
    public int LIZIZ;

    public static void LIZ(int i, int i2, View view) {
        FrameLayout.LayoutParams layoutParams;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams.width == i2 && marginLayoutParams.height == i) {
            return;
        }
        marginLayoutParams.width = i2;
        marginLayoutParams.height = i;
        view.setLayoutParams(marginLayoutParams);
        view.setRotation(0.0f);
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams3) == null) {
            return;
        }
        layoutParams.gravity = 17;
    }
}
