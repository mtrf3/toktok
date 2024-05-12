package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SlidePageItem extends F9E {

    @InterfaceC65349Pkn("first_slide_popup")
    public final int firstSlidePopup;

    @InterfaceC65349Pkn("landing_page")
    public final String landingPage;

    @InterfaceC65349Pkn("scope")
    public final int scope;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.landingPage, Integer.valueOf(this.scope), Integer.valueOf(this.firstSlidePopup)};
    }

    public SlidePageItem(String landingPage, int i, int i2) {
        o.LJIIIZ(landingPage, "landingPage");
        this.landingPage = landingPage;
        this.scope = i;
        this.firstSlidePopup = i2;
    }
}
