package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C223338pd;
import X.C32151Nz;
import X.C7MY;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DefaultFavoriteLoadingFooterCell extends PowerLoadingCell {
    public ViewGroup LJLIL;
    public C223338pd LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = 0;
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setVisibility(8);
            C223338pd c223338pd = this.LJLILLLLZI;
            if (c223338pd != null) {
                c223338pd.LIZJ();
                return;
            } else {
                o.LJIJI("dualBall");
                throw null;
            }
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = C7MY.LIZIZ(36);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setVisibility(0);
            C223338pd c223338pd = this.LJLILLLLZI;
            if (c223338pd != null) {
                c223338pd.LIZIZ();
                return;
            } else {
                o.LJIJI("dualBall");
                throw null;
            }
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        M();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        RelativeLayout relativeLayout = new RelativeLayout(parent.getContext());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.LJLIL = relativeLayout;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        C223338pd c223338pd = new C223338pd(context, null, 6);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(36)));
        layoutParams.addRule(13);
        c223338pd.setLayoutParams(layoutParams);
        this.LJLILLLLZI = c223338pd;
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            viewGroup.addView(c223338pd);
            ViewGroup viewGroup2 = this.LJLIL;
            if (viewGroup2 != null) {
                return viewGroup2;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
