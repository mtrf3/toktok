package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4Q2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Q2 {
    public static C4R2 LIZ(ViewGroup parent, SharePanelViewModel viewModel, boolean z, int i, int i2, int i3, boolean z2) {
        View LIZIZ;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(viewModel, "viewModel");
        if (z2) {
            LIZIZ = C1FL.LIZIZ(parent, R.layout.b65, parent, false, "from(parent.context)\n   …_vertical, parent, false)");
        } else {
            LIZIZ = C1FL.LIZIZ(parent, R.layout.b64, parent, false, "from(parent.context)\n   …_to_story, parent, false)");
            View findViewById = LIZIZ.findViewById(R.id.dc_);
            if (z) {
                LIZIZ.getLayoutParams().width = i;
                int dimensionPixelOffset = parent.getResources().getDimensionPixelOffset(R.dimen.v0);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.width = dimensionPixelOffset;
                layoutParams.height = dimensionPixelOffset;
            }
            TuxTextView tuxTextView = (TuxTextView) LIZIZ.findViewById(R.id.mo6);
            tuxTextView.setMaxLines(i2);
            tuxTextView.setTextColorRes(i3);
        }
        return new C4R2(LIZIZ, viewModel, z2);
    }
}
