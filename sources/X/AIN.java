package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AIN implements InterfaceC16710l9 {
    public static final AIN LIZ = new AIN();

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View v, C16800lI c16800lI) {
        o.LJIIIZ(v, "v");
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).topMargin = c16800lI.LIZ(7).LIZIZ;
        return c16800lI;
    }
}
