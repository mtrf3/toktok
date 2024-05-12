package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BGB implements InterfaceC16710l9 {
    public final /* synthetic */ C2A7 LIZ;

    public BGB(C2A7 c2a7) {
        this.LIZ = c2a7;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View v, C16800lI c16800lI) {
        int LIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(v, "v");
        if (c16800lI.LIZ.LJIIIZ().LIZLLL > 0) {
            LIZ = C15380j0.LIZ(12.0f);
        } else {
            LIZ = C15380j0.LIZ(28.0f);
        }
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            C2A7 c2a7 = this.LIZ;
            marginLayoutParams.bottomMargin = LIZ;
            c2a7.setLayoutParams(marginLayoutParams);
        }
        return c16800lI;
    }
}
