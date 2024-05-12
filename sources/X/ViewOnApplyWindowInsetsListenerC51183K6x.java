package X;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.jvm.internal.o;

/* renamed from: X.K6x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnApplyWindowInsetsListenerC51183K6x implements View.OnApplyWindowInsetsListener {
    public static final ViewOnApplyWindowInsetsListenerC51183K6x LIZ = new ViewOnApplyWindowInsetsListenerC51183K6x();

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        o.LJIIIIZZ(insets, "windowInsets.getInsets(W…Insets.Type.systemBars())");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = insets.left;
            marginLayoutParams.topMargin = insets.top;
            marginLayoutParams.rightMargin = insets.right;
            view.setLayoutParams(marginLayoutParams);
            return windowInsets;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
