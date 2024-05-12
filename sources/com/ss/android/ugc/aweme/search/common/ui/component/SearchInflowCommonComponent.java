package com.ss.android.ugc.aweme.search.common.ui.component;

import X.C221108m2;
import X.C221138m5;
import X.C2S6;
import X.C49366JZa;
import X.C49629Jdp;
import X.C51781KTx;
import X.C5H3;
import X.C62822Ol8;
import X.EnumC221088m0;
import X.JAK;
import X.JZV;
import X.KU4;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS64S0110000_8;

/* loaded from: classes9.dex */
public final class SearchInflowCommonComponent extends BasePanelComponent {
    public final C5H3 LJLIL;
    public boolean LJLILLLLZI;
    public final C49366JZa LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchInflowCommonComponent() {
        C62822Ol8 c62822Ol8;
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS158S0100000_8((KU4) this, 143), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS64S0110000_8(false, (KU4) this, 0));
        }
        this.LJLIL = c62822Ol8;
        this.LJLILLLLZI = true;
        this.LJLJI = new C49366JZa(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (JZV.LIZ(C2S6.LIZ(getContext()))) {
            C49629Jdp.LIZ.storeBoolean("has_entered_search_inner_flow", true);
        }
    }

    @Override // X.C8W0
    public final void onStart() {
        IViewPagerComponentAbility viewPagerComponentAbility;
        super.onStart();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.getValue();
        if (iFeedPanelPlatformAbility != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null) {
            viewPagerComponentAbility.De0(this.LJLJI);
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        IViewPagerComponentAbility viewPagerComponentAbility;
        super.onStop();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLIL.getValue();
        if (iFeedPanelPlatformAbility != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null) {
            viewPagerComponentAbility.Cp(this.LJLJI);
        }
    }
}
