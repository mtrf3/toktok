package com.ss.android.ugc.feed.platform.container.info;

import X.C221108m2;
import X.C32151Nz;
import X.C33Q;
import X.C47959Irz;
import X.C62822Ol8;
import X.C8OO;
import X.C8OP;
import X.C8OQ;
import X.C8OR;
import X.C8OS;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ConstraintSizeVM extends FeedBaseViewModel<C8OS> {
    public static final C62822Ol8 LJLL = C221108m2.LIZIZ(C8OO.LJLIL);
    public static final C62822Ol8 LJLLI = C221108m2.LIZIZ(C8OP.LJLIL);
    public static final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C8OQ.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C8OR.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C33Q() { // from class: X.8OS
        };
    }

    public final int mv0() {
        return ((Number) this.LJLJLLL.getValue()).intValue();
    }

    public final void kv0(ViewGroup view) {
        o.LJIIIZ(view, "view");
        View findViewById = view.findViewById(R.id.adr);
        if (findViewById != null) {
            findViewById.setPaddingRelative(mv0(), findViewById.getPaddingTop(), findViewById.getPaddingEnd(), findViewById.getPaddingBottom());
            findViewById.setPaddingRelative(findViewById.getPaddingStart(), findViewById.getPaddingTop(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(100)), findViewById.getPaddingBottom());
        }
    }

    public final int lv0(boolean z) {
        if (z) {
            return mv0() * 2;
        }
        return C47959Irz.LIZJ(100, mv0());
    }

    public static void nv0(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int marginStart = marginLayoutParams.getMarginStart();
                int i3 = marginLayoutParams.topMargin;
                int marginEnd = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i3;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = i2;
            }
        }
    }
}
