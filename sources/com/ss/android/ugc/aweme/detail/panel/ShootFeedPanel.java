package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C201667vm;
import X.C220858ld;
import X.C27740Aue;
import X.C57092Lx;
import X.C61447O9r;
import X.C81156VtA;
import X.C8HI;
import X.KL2;
import X.QD3;
import X.ViewTreeObserverOnGlobalLayoutListenerC56416MCe;
import Y.ACListenerS21S0101000_2;
import Y.ARunnableS3S0301000_2;
import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public abstract class ShootFeedPanel extends DetailFragmentPanel {
    public static final /* synthetic */ int LLJL = 0;
    public View LLJJJIL;
    public RelativeLayout LLJJJJ;
    public boolean LLJJJJJIL;
    public Drawable LLJJJJLIIL;
    public Drawable LLJJL;
    public View LLJJLIIIJLLLLLLLZ;

    public abstract void LLIIL(View view);

    public abstract int LLIILII();

    public abstract View LLIILZL(RelativeLayout relativeLayout);

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public void q1() {
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLJJJJ != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView().findViewById(R.id.aoo);
        if (viewGroup == null) {
            viewGroup = (ViewGroup) getFragment().getView();
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.LLJJJJ = relativeLayout;
        viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        View LLIILZL = LLIILZL(this.LLJJJJ);
        this.LLJJJIL = LLIILZL;
        View findViewById = LLIILZL.findViewById(R.id.ap4);
        this.LLJJLIIIJLLLLLLLZ = findViewById;
        if (findViewById != null) {
            TextView textView = (TextView) findViewById.findViewById(R.id.irx);
            if (textView != null) {
                textView.setText(LLIILII());
                findViewById.post(new ARunnableS3S0301000_2(0, this, findViewById, textView, 0));
            }
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(2, this, 2), this.LLJJLIIIJLLLLLLLZ);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.LLJJJJ.addView(this.LLJJJIL, layoutParams);
        View view = new View(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) KL2.LIZJ(getContext(), 12.0f));
        layoutParams2.addRule(6, this.LLJJJIL.getId());
        this.LLJJJJ.addView(view, layoutParams2);
    }

    public final void LLIIJLIL() {
        if (C220858ld.LJIIIIZZ(getCurrentAweme())) {
            C27740Aue.LJIIIZ(4, this.LLJJJIL);
        } else {
            C27740Aue.LJIIIZ(0, this.LLJJJIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void hideTopAndBottomBarWhenMask() {
        super.hideTopAndBottomBarWhenMask();
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.AbstractC51687KQh
    public void initPanel() {
        super.initPanel();
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC61452O9w
    public void onAdapterFinish() {
        super.onAdapterFinish();
        View view = this.LLJJJIL;
        if (view != null) {
            view.getContext();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LLJJJIL.getLayoutParams();
            int i = C61447O9r.LJIILJJIL;
            C61447O9r c61447O9r = C57092Lx.LIZ;
            c61447O9r.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                i = LIZ;
            }
            layoutParams.height = i;
            this.LLJJJIL.setLayoutParams(layoutParams);
            if (!c61447O9r.LJFF) {
                this.LLJJJJJIL = true;
                View view2 = this.LLJJJIL;
                View findViewById = view2.findViewById(R.id.d7n);
                View findViewById2 = view2.findViewById(R.id.d8g);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public void onPageSelected() {
        super.onPageSelected();
        LLIIJLIL();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel
    @QD3
    public void onCancelVideoCoverMaskEvent(C201667vm c201667vm) {
        C27740Aue.LJIIIZ(0, this.LLJJJIL);
    }

    public final void LLIL(C81156VtA c81156VtA, String str) {
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            c81156VtA.getPaint().setTypeface(LIZLLL);
        }
        c81156VtA.setText(str);
        c81156VtA.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC56416MCe(this, c81156VtA, str));
    }
}
