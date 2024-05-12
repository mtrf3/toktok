package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4PY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PY {
    public static C108994Pn LIZ(ViewGroup parent, SharePanelViewModel viewModel, boolean z, int i, boolean z2, boolean z3, int i2, boolean z4, int i3) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b61, parent, false);
        if (i <= 0) {
            o.LJIIIIZZ(itemView, "itemView");
            return new C108994Pn(itemView, viewModel, z, C108994Pn.LJLZ, z2, z3, i2, z4, i3);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C108994Pn(itemView, viewModel, z, i, z2, z3, i2, z4, i3);
    }
}
