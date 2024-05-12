package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108934Ph {
    public static C108904Pe LIZ(ViewGroup parent, SharePanelViewModel viewModel, C4OT c4ot, boolean z, boolean z2) {
        View findViewById;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b9y, parent, false);
        if (z2) {
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, 16);
            View findViewById2 = itemView.findViewById(R.id.gw7);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
            findViewById2.setLayoutParams(marginLayoutParams);
        }
        if (!z && (findViewById = itemView.findViewById(R.id.eg9)) != null) {
            findViewById.setVisibility(8);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C108904Pe(itemView, viewModel, c4ot);
    }
}
