package X;

import android.view.View;
import android.view.WindowInsets;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.VmD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnApplyWindowInsetsListenerC80725VmD implements View.OnApplyWindowInsetsListener {
    public static final ViewOnApplyWindowInsetsListenerC80725VmD LIZ = new ViewOnApplyWindowInsetsListenerC80725VmD();

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
        boolean z;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(insets, "insets");
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z2 = true;
        if (insets.getSystemWindowInsetTop() > 0) {
            z = true;
        } else {
            z = false;
        }
        drawerLayout.LLF = insets;
        drawerLayout.LLFF = z;
        if (z || drawerLayout.getBackground() != null) {
            z2 = false;
        }
        drawerLayout.setWillNotDraw(z2);
        drawerLayout.requestLayout();
        return insets.consumeSystemWindowInsets();
    }
}
