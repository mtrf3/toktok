package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C224868s6;
import X.C81156VtA;
import Y.ACListenerS21S0101000_2;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public class MusicFeedPanel extends ShootFeedPanel {
    public static final /* synthetic */ int LLJZ = 0;
    public View LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public View LLJLL;
    public TextView LLJLLIL;
    public View LLJLLL;

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final void LLIIL(View view) {
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final int LLIILII() {
        return R.string.tie;
    }

    public final void LLILIL() {
        View view = this.LLJLIL;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    public final void LLILII() {
        if (getCurrentAweme() != null && getCurrentAweme().getCcTemplateInfo() != null) {
            C224868s6.LIZ(getContext(), getCurrentAweme(), getPreviousPage(), getFromGroupId());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel, com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel
    public final void onPageSelected() {
        View view;
        super.onPageSelected();
        if (getCurrentAweme() != null && getCurrentAweme().getAwemeType() == 65) {
            LLILIL();
            TextView textView = this.LLJLLIL;
            if (textView != null) {
                textView.setText(getContext().getString(R.string.tij));
            }
        } else if (getCurrentAweme() != null && getCurrentAweme().getCcTemplateInfo() != null && getCurrentAweme().getCcTemplateInfo().isTemplateBottomStyleSingleBtn()) {
            LLILIL();
            TextView textView2 = this.LLJLLIL;
            if (textView2 != null) {
                textView2.setText(getContext().getString(R.string.ciu));
            }
        } else {
            View view2 = this.LLJLIL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            TuxIconView tuxIconView = this.LLJLILLLLZIIL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
            }
            View view4 = this.LLJLL;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.LLJLLL;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            if (getCurrentAweme() != null && C224868s6.LIZJ(getCurrentAweme()) && getCurrentAweme().getCcTemplateInfo() != null && getCurrentAweme().getCcTemplateInfo().isTemplateBottomStyleDoubleBtn()) {
                TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                }
                View view6 = this.LLJLL;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                View view7 = this.LLJLLL;
                if (view7 != null) {
                    view7.setVisibility(0);
                }
            }
        }
        if (((getCurrentAweme() != null && getCurrentAweme().getAwemeType() == 65) || C224868s6.LIZJ(getCurrentAweme())) && (view = this.LLJLIL) != null) {
            view.post(new ARunnableS45S0100000_9(this, 23));
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.ShootFeedPanel
    public final View LLIILZL(RelativeLayout relativeLayout) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.alp, relativeLayout, false);
        TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.gt3);
        this.LLJLILLLLZIIL = tuxIconView;
        tuxIconView.setVisibility(0);
        this.LLJLL = LLLLIILL.findViewById(R.id.gea);
        View findViewById = LLLLIILL.findViewById(R.id.ap7);
        this.LLJLIL = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(1, this, 9), findViewById);
        }
        this.LLJLLIL = (TextView) LLLLIILL.findViewById(R.id.b80);
        this.LLJLLL = LLLLIILL.findViewById(R.id.ge_);
        if (LLLLIILL.findViewById(R.id.gef) != null) {
            LLIL((C81156VtA) LLLLIILL.findViewById(R.id.gef), getContext().getString(R.string.ciu));
        }
        View view = this.LLJLLL;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(0, this, 1), view);
            this.LLJLLL.setVisibility(8);
        }
        return LLLLIILL;
    }
}
