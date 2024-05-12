package com.ss.android.ugc.aweme.captionsheet.ui;

import X.AEY;
import X.AI2;
import X.AnonymousClass064;
import X.AnonymousClass391;
import X.C018905p;
import X.C16880lQ;
import X.C25846ACk;
import X.C26338AVi;
import X.C32151Nz;
import X.C7MY;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.TuxCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SubtitleIconCell extends TuxCell<C25846ACk, AI2> {
    public LinearLayout LJLILLLLZI;
    public TuxIconView LJLJI;

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell
    public final View L(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View L = super.L(parent);
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(9)));
        tuxIconView.setTintColor(R.attr.gv);
        this.LJLJI = tuxIconView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.addView(this.LJLJI);
        this.LJLILLLLZI = linearLayout;
        return L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final AI2 N(Context context) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        AI2 ai2 = new AI2(context);
        C25846ACk c25846ACk = (C25846ACk) getItem();
        if (c25846ACk != null) {
            onCheckedChangeListener = c25846ACk.LLFFF;
        } else {
            onCheckedChangeListener = null;
        }
        ai2.LJIILL(onCheckedChangeListener);
        ai2.LJIILJJIL(new AqS154S0100000_4(this, 1070));
        return ai2;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C25846ACk t) {
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        AEY aey = (AEY) this.LJLIL;
        if (aey != null) {
            aey.LJIILIIL(t.LJZI);
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (t.LLF) {
            LinearLayout linearLayout = this.LJLILLLLZI;
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.b86);
                linearLayout.setVisibility(0);
                o.LJIIIIZZ(constraintLayout, "constraintLayout");
                if (constraintLayout.indexOfChild(linearLayout) == -1) {
                    linearLayout.setLayoutParams(new C018905p(-2, -2));
                    TuxIconView tuxIconView = this.LJLJI;
                    if (tuxIconView != null) {
                        Integer LIZJ = AnonymousClass391.LIZJ(4);
                        int paddingTop = this.itemView.findViewById(R.id.b85).findViewById(R.id.ks_).getPaddingTop();
                        View findViewById = this.itemView.findViewById(R.id.b85).findViewById(R.id.ks_);
                        o.LJIIIIZZ(findViewById, "itemView.cell.subtitle_tv");
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams2 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        if (marginLayoutParams != null) {
                            i3 = marginLayoutParams.topMargin;
                        } else {
                            i3 = 0;
                        }
                        Integer valueOf = Integer.valueOf(paddingTop + i3);
                        int paddingBottom = this.itemView.findViewById(R.id.b85).findViewById(R.id.ks_).getPaddingBottom();
                        View findViewById2 = this.itemView.findViewById(R.id.b85).findViewById(R.id.ks_);
                        o.LJIIIIZZ(findViewById2, "itemView.cell.subtitle_tv");
                        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                            layoutParams3 = null;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        if (marginLayoutParams2 != null) {
                            i4 = marginLayoutParams2.bottomMargin;
                        } else {
                            i4 = 0;
                        }
                        C26338AVi.LJIIIZ(tuxIconView, LIZJ, valueOf, null, Integer.valueOf(paddingBottom + i4), 20);
                    }
                    linearLayout.setGravity(8388611);
                    linearLayout.setId(View.generateViewId());
                    constraintLayout.addView(linearLayout);
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    anonymousClass064.LJII(constraintLayout);
                    anonymousClass064.LJIIIIZZ(linearLayout.getId(), 3, this.itemView.findViewById(R.id.ks_).getId(), 3);
                    anonymousClass064.LJIIIIZZ(linearLayout.getId(), 4, this.itemView.findViewById(R.id.ks_).getId(), 4);
                    anonymousClass064.LJIIIIZZ(linearLayout.getId(), 6, this.itemView.findViewById(R.id.ks_).getId(), 7);
                    anonymousClass064.LJIIIIZZ(this.itemView.findViewById(R.id.ks_).getId(), 7, linearLayout.getId(), 6);
                    anonymousClass064.LJIIIIZZ(linearLayout.getId(), 7, 0, 7);
                    anonymousClass064.LJIIL(linearLayout.getId(), 0);
                    anonymousClass064.LJIILL(linearLayout.getId()).LIZLLL.LJJJIL = 1.0f;
                    anonymousClass064.LJIJJ(0.0f, linearLayout.getId());
                    anonymousClass064.LJIILL(linearLayout.getId()).LIZLLL.LJJJJLI = C7MY.LIZIZ(9);
                    anonymousClass064.LJIIL(this.itemView.findViewById(R.id.ks_).getId(), 0);
                    anonymousClass064.LJIILL(this.itemView.findViewById(R.id.ks_).getId()).LIZLLL.LJJJIL = 0.0f;
                    anonymousClass064.LIZIZ(constraintLayout);
                }
            }
        } else {
            LinearLayout linearLayout2 = this.LJLILLLLZI;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.b85).findViewById(R.id.ks_), t.LLFF);
        TuxIconView tuxIconView2 = this.LJLJI;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, t.LLFF);
        }
        if (t.LLFF != null) {
            View onBindItemView$lambda$1$lambda$0 = this.itemView.findViewById(R.id.b85).findViewById(R.id.ks_);
            o.LJIIIIZZ(onBindItemView$lambda$1$lambda$0, "onBindItemView$lambda$1$lambda$0");
            ViewGroup.LayoutParams layoutParams4 = onBindItemView$lambda$1$lambda$0.getLayoutParams();
            if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams4 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            if (marginLayoutParams3 != null) {
                i = marginLayoutParams3.topMargin;
            } else {
                i = 0;
            }
            Integer valueOf2 = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams5 = onBindItemView$lambda$1$lambda$0.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = layoutParams5;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams4 != null) {
                i2 = marginLayoutParams4.bottomMargin;
            } else {
                i2 = 0;
            }
            C26338AVi.LJIIIZ(onBindItemView$lambda$1$lambda$0, null, valueOf2, null, Integer.valueOf(i2), 21);
            C26338AVi.LJI(onBindItemView$lambda$1$lambda$0, null, 0, null, 0, false, 21);
        }
    }
}
