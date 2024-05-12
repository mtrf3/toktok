package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VVR extends C1C9 {
    public VVR(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return (25.0f / displayMetrics.densityDpi) * 2;
    }

    @Override // X.C1C9
    public final int LJIIIIZZ(int i, View view) {
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 != null && c0a2.LJIJJLI()) {
            o.LJI(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int LJJJJJ = c0a2.LJJJJJ(view) - marginLayoutParams.leftMargin;
                int LJJJJLI = c0a2.LJJJJLI(view) + marginLayoutParams.rightMargin;
                int paddingLeft = c0a2.getPaddingLeft();
                return (((((c0a2.LJLLLL - c0a2.getPaddingRight()) - paddingLeft) / 2) + paddingLeft) - ((LJJJJLI - LJJJJJ) / 2)) - LJJJJJ;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        return 0;
    }
}
