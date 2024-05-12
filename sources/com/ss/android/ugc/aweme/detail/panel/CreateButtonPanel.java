package com.ss.android.ugc.aweme.detail.panel;

import X.C16880lQ;
import X.C61447O9r;
import X.KL2;
import Y.ACListenerS29S0101000_12;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* loaded from: classes4.dex */
public abstract class CreateButtonPanel extends DetailFragmentPanel {
    public static final /* synthetic */ int LLJJJJJIL = 0;
    public View LLJJJIL;
    public RelativeLayout LLJJJJ;

    public abstract void LLIIJLIL(View view);

    public abstract View LLIIL(RelativeLayout relativeLayout);

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomLegacyAbility
    public final void q1() {
        View findViewById;
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing() || getFragment() == null || this.LLJJJJ != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getFragment().getView();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.LLJJJJ = relativeLayout;
        viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        View LLIIL = LLIIL(this.LLJJJJ);
        this.LLJJJIL = LLIIL;
        if (LLIIL != null && (findViewById = LLIIL.findViewById(R.id.ap4)) != null) {
            C16880lQ.LJIIJ(new ACListenerS29S0101000_12(0, this, 0), findViewById);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.LLJJJJ.addView(this.LLJJJIL, layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel, com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel, X.InterfaceC61452O9w
    public final void onAdapterFinish() {
        super.onAdapterFinish();
        View view = this.LLJJJIL;
        if (view != null) {
            Context context = view.getContext();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LLJJJIL.getLayoutParams();
            int i = C61447O9r.LJIILJJIL;
            if (i == 0) {
                i = (int) KL2.LIZJ(context, 58.0f);
            }
            layoutParams.height = i;
            this.LLJJJIL.setLayoutParams(layoutParams);
        }
    }
}
