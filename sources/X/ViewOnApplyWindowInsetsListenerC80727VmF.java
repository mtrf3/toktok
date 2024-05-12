package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: X.VmF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnApplyWindowInsetsListenerC80727VmF implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return WindowInsets.CONSUMED;
        }
        if (i2 >= 28) {
            return windowInsets.consumeSystemWindowInsets().consumeDisplayCutout();
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
