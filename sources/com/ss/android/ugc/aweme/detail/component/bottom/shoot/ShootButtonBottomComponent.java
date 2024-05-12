package com.ss.android.ugc.aweme.detail.component.bottom.shoot;

import X.C16880lQ;
import X.C47261Igj;
import X.C55096Ljo;
import X.C57092Lx;
import X.C62814Ol0;
import X.C81156VtA;
import X.C8HI;
import X.MET;
import X.MEX;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS13S0300000_2;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class ShootButtonBottomComponent extends BasePanelComponent implements IDetailBottomProtocol {
    public boolean LJLIL;
    public Drawable LJLILLLLZI;
    public Drawable LJLJI;
    public View LJLJJI;
    public View LJLJJL;

    public void A3(View view) {
    }

    public abstract View C3(ViewGroup viewGroup);

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void h1() {
        if (!C57092Lx.LIZ.LJFF) {
            this.LJLIL = true;
            View view = this.LJLJJL;
            if (view == null) {
                return;
            }
            View findViewById = view.findViewById(R.id.d7n);
            View findViewById2 = view.findViewById(R.id.d8g);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (findViewById2 == null) {
                return;
            }
            findViewById2.setVisibility(8);
        }
    }

    public abstract void v3(View view);

    public abstract int x3();

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public void onCreate() {
        super.onCreate();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), IDetailBottomProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View K2(ViewGroup viewGroup) {
        View C3 = C3(viewGroup);
        this.LJLJJL = C3;
        if (C3 == null) {
            return null;
        }
        View findViewById = C3.findViewById(R.id.ap4);
        this.LJLJJI = findViewById;
        if (findViewById != null) {
            A3(findViewById);
            View view = this.LJLJJI;
            o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) view;
            TextView textView = (TextView) viewGroup2.findViewById(R.id.irx);
            if (textView != null) {
                textView.setText(x3());
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService();
                if (!MEX.LIZIZ()) {
                    viewGroup2.post(new ARunnableS13S0300000_2(viewGroup2, textView, this, 17));
                }
            }
            View view2 = this.LJLJJI;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 14), view2);
            }
        }
        return this.LJLJJL;
    }

    public final void E3(C81156VtA c81156VtA, String str) {
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            c81156VtA.getPaint().setTypeface(LIZLLL);
        }
        c81156VtA.setText(str);
        c81156VtA.getViewTreeObserver().addOnGlobalLayoutListener(new MET(c81156VtA, str, this));
    }
}
