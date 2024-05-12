package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109084Pw {
    public static C109054Pt LIZ(ViewGroup parent, SharePanelViewModel sharePanelViewModel, boolean z) {
        o.LJIIIZ(parent, "parent");
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b9z, parent, false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create(): itemView = ");
        LIZ.append(itemView);
        C34B.LIZIZ("LongPressShareListMoreContactViewHolder", X1D.LIZIZ(LIZ));
        if (z) {
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJIIIZ(itemView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, 16);
        }
        o.LJIIIIZZ(itemView, "itemView");
        return new C109054Pt(itemView, sharePanelViewModel);
    }
}
