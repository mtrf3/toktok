package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist;

import X.C221108m2;
import X.C252529vc;
import X.C2K0;
import X.C62822Ol8;
import X.C73305Spp;
import X.C8IC;
import X.InterfaceC73307Spr;
import X.MG5;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist.FYPPageStateImp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class FYPPageStateImp extends PageStateCommonComponent {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public View LJLLI;
    public final C252529vc LJLLILLLL;

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.9vc] */
    public FYPPageStateImp() {
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 915));
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 916));
        this.LJLLILLLL = new InterfaceC73307Spr() { // from class: X.9vc
            @Override // X.InterfaceC73307Spr
            public final void hide() {
                C223338pd c223338pd;
                View view = FYPPageStateImp.this.LJLLI;
                if (view != null) {
                    view.setVisibility(4);
                }
                View view2 = FYPPageStateImp.this.LJLLI;
                if ((view2 instanceof C223338pd) && (c223338pd = (C223338pd) view2) != null) {
                    c223338pd.LIZJ();
                }
            }

            @Override // X.InterfaceC73307Spr
            public final void show() {
                C223338pd c223338pd;
                View view = FYPPageStateImp.this.LJLLI;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = FYPPageStateImp.this.LJLLI;
                if ((view2 instanceof C223338pd) && (c223338pd = (C223338pd) view2) != null) {
                    c223338pd.LIZIZ();
                }
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final void A3() {
        C8IC c8ic;
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            if (this.LJLL.isInitialized() && (c8ic = (C8IC) this.LJLL.getValue()) != null) {
                c8ic.setVisibility(8);
            }
            this.LJLLI = (View) this.LJLJLLL.getValue();
            c73305Spp.LJFF();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Ic0(Exception exc) {
        x3(MG5.RECOMMEND_FEED, exc);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        super.LJJJJI(view, bundle);
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.LIZIZ(this.LJLLILLLL);
        }
    }

    public final void C3(int i, int i2, View view) {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            view.setId(R.id.lv5);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
            if (view.getParent() == null) {
                c73305Spp.addView(view);
            }
        }
    }
}
