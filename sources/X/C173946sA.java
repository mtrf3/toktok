package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6sA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173946sA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C72434Sbm c72434Sbm, C72434Sbm c72434Sbm2, TextView textView) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_heart_grid;
        c2068389v.LJ = Integer.valueOf(R.attr.eg);
        Context context = c72434Sbm.getContext();
        o.LJIIIIZZ(context, "avatar1.context");
        c72434Sbm.setImageDrawable(c2068389v.LIZ(context));
        c72434Sbm2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((C018905p) layoutParams).leftToRight = R.id.abi;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((C018905p) layoutParams2).startToEnd = R.id.abi;
    }
}
