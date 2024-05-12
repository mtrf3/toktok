package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109104Py {
    public static C109114Pz LIZ(ViewGroup parent, SharePanelViewModel viewModel, boolean z) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b9x, parent, false);
        if (z) {
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, 16);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C109114Pz(itemView, viewModel);
    }
}
