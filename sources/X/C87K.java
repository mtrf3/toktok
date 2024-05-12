package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.87K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87K extends RecyclerView.ViewHolder {
    public final C5H3 LJLIL;

    public final View L() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-more>(...)");
        return (View) value;
    }

    public C87K(View view, boolean z) {
        super(view);
        int i;
        int i2;
        int i3;
        int i4;
        this.LJLIL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS153S0100000_3(view, 1759));
        if (z) {
            if (L().getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams = L().getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = C278817o.LIZ(18.0f);
                layoutParams2.height = C278817o.LIZ(18.0f);
            }
            View L = L();
            ViewGroup.LayoutParams layoutParams3 = L().getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams3);
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            Integer LIZIZ = C65429Pm5.LIZIZ(13.0f);
            ViewGroup.LayoutParams layoutParams4 = L().getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams4);
            } else {
                i2 = 0;
            }
            C26338AVi.LJI(L, valueOf, LIZIZ, Integer.valueOf(i2), C65429Pm5.LIZIZ(13.0f), false, 16);
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                i3 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams5);
            } else {
                i3 = 0;
            }
            Integer valueOf2 = Integer.valueOf(i3);
            ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams6 instanceof ViewGroup.MarginLayoutParams ? layoutParams6 : null);
            if (marginLayoutParams != null) {
                i4 = marginLayoutParams.topMargin;
            } else {
                i4 = 0;
            }
            Integer valueOf3 = Integer.valueOf(i4);
            ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            C26338AVi.LJI(view, valueOf2, valueOf3, Integer.valueOf(layoutParams7 instanceof ViewGroup.MarginLayoutParams ? C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams7) : 0), C65429Pm5.LIZIZ(12.0f), false, 16);
        }
    }
}
