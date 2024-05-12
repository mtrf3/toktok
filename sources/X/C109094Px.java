package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Px, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109094Px {
    public static C57367MfL LIZ(ViewGroup parent, SharePanelViewModel viewModel, C4OT c4ot, boolean z) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b9w, parent, false);
        if (z) {
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, 16);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C57367MfL(itemView, viewModel, c4ot);
    }
}
