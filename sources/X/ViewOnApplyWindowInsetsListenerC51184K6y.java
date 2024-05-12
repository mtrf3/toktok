package X;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import kotlin.jvm.internal.o;

/* renamed from: X.K6y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnApplyWindowInsetsListenerC51184K6y implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ ViewGroup LIZ;

    public ViewOnApplyWindowInsetsListenerC51184K6y(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        o.LJIIIIZZ(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        ATO.LIZ = insets2.bottom;
        return this.LIZ.onApplyWindowInsets(insets);
    }
}
