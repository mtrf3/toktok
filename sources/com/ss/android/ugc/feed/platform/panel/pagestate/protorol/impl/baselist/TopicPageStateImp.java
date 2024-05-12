package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.baselist;

import X.C2K0;
import X.C73305Spp;
import X.MG5;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class TopicPageStateImp extends PageStateCommonComponent {
    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    public TopicPageStateImp() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public final void A3() {
        C73305Spp c73305Spp = this.LJLJJLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
            c73305Spp.LJFF();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility
    public final void Ic0(Exception exc) {
        x3(MG5.DEFAULT, exc);
    }
}
