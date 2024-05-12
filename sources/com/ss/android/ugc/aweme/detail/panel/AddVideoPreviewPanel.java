package com.ss.android.ugc.aweme.detail.panel;

import X.C110614Vt;
import X.C16880lQ;
import X.C42053Gev;
import X.C61328O5c;
import X.C8IC;
import X.HG3;
import X.RBX;
import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddVideoPreviewPanel extends ShootFeedPanel {
    public final String LLJLIL;
    public final String LLJLILLLLZIIL;
    public RelativeLayout LLJLL;
    public View LLJLLIL;
    public C8IC LLJLLL;
    public final String LLJZ = ((RBX) HG3.LJIILL()).getCurUserId();

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.ipo;
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        View view;
        ViewGroup viewGroup;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLJLL != null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) getFragment().getView();
        if (viewGroup2 != null) {
            view = viewGroup2.findViewById(R.id.f_e);
        } else {
            view = null;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        if (viewGroup2 != null) {
            viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.dmh);
        } else {
            viewGroup = null;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.al3, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…w_top, parentView, false)");
        this.LLJLLIL = LLLLIILL;
        if (viewGroup != null) {
            viewGroup.addView(LLLLIILL);
        }
        this.LLJLL = new RelativeLayout(getContext());
        o.LJI(viewGroup2);
        viewGroup2.addView(this.LLJLL, new ViewGroup.LayoutParams(-1, -1));
        View LLIILZL = LLIILZL(this.LLJLL);
        this.LLJJJIL = LLIILZL;
        ViewGroup viewGroup3 = (ViewGroup) LLIILZL.findViewById(R.id.ap4);
        if (viewGroup3 != null) {
            C16880lQ.LJIIL(viewGroup3, new ACListenerS23S0100000_3(this, 35));
            if (AVExternalServiceImpl.LIZ().anchorService().newRoundCornerUXOptimization()) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
                c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                Context context = viewGroup3.getContext();
                o.LJIIIIZZ(context, "it.context");
                viewGroup3.setBackground(c110614Vt.LIZ(context));
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        RelativeLayout relativeLayout = this.LLJLL;
        if (relativeLayout != null) {
            relativeLayout.addView(this.LLJJJIL, layoutParams);
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        C8IC c8ic = new C8IC(context2, null, 6);
        c8ic.setMessage(R.string.rjz);
        c8ic.setVisibility(8);
        this.LLJLLL = c8ic;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        RelativeLayout relativeLayout2 = this.LLJLL;
        if (relativeLayout2 != null) {
            relativeLayout2.addView(this.LLJLLL, layoutParams2);
        }
        C42053Gev.LIZIZ.LJIIL(this.LLJLIL);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
        C8IC c8ic = this.LLJLLL;
        if (c8ic != null && c8ic.getVisibility() == 0) {
            return;
        }
        C42053Gev c42053Gev = C42053Gev.LIZIZ;
        c42053Gev.LJI();
        if (!this.LLJZ.equals(this.LLJLILLLLZIIL) && this.activity != null) {
            C8IC c8ic2 = this.LLJLLL;
            if (c8ic2 != null) {
                c8ic2.setVisibility(0);
            }
            Activity activity = this.activity;
            String aid = LJJLIL();
            o.LJIIIIZZ(aid, "aid");
            c42053Gev.LIZ.LJIIIIZZ(activity, aid);
            return;
        }
        Activity activity2 = this.activity;
        if (activity2 != null) {
            activity2.setResult(-1);
        }
        Activity activity3 = this.activity;
        if (activity3 == null) {
            return;
        }
        activity3.finish();
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.aln, relativeLayout, false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(ge…out(), parentView, false)");
        return LLLLIILL;
    }

    public AddVideoPreviewPanel(String str, String str2) {
        this.LLJLIL = str;
        this.LLJLILLLLZIIL = str2;
    }
}
