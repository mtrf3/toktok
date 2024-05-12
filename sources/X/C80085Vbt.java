package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Vbt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80085Vbt extends C1C9 {
    public C80085Vbt(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return (25.0f / displayMetrics.densityDpi) * 2;
    }

    @Override // X.C1C9
    public final int LJIIIIZZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        C0A2 c0a2 = this.LIZJ;
        if (c0a2 == null || !c0a2.LJIJJLI()) {
            return 0;
        }
        int paddingRight = ((c0a2.LJLLLL - c0a2.getPaddingRight()) - c0a2.getPaddingLeft()) / 2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        int marginEnd = marginLayoutParams.getMarginEnd() + c0a2.LJJJJLI(view);
        int LJJJJJ = c0a2.LJJJJJ(view) - marginLayoutParams.getMarginStart();
        return paddingRight - (((marginEnd - LJJJJJ) / 2) + LJJJJJ);
    }
}
