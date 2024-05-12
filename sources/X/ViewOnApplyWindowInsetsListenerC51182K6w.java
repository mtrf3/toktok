package X;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import kotlin.jvm.internal.o;

/* renamed from: X.K6w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnApplyWindowInsetsListenerC51182K6w implements View.OnApplyWindowInsetsListener {
    public static final ViewOnApplyWindowInsetsListenerC51182K6w LIZ = new ViewOnApplyWindowInsetsListenerC51182K6w();

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        o.LJIIIIZZ(insets, "windowInsets.getInsets(W…Insets.Type.systemBars())");
        if (view.getPaddingBottom() != insets.bottom) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
        }
        return windowInsets;
    }
}
