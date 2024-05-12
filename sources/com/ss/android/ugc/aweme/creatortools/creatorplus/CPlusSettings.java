package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CPlusSettings extends F9E {

    @InterfaceC65349Pkn("creator_plus_should_show")
    public final boolean allowCreatorPlus;

    @InterfaceC65349Pkn("creator_plus_congrats_url")
    public final String creatorPlusCongratsURL;

    @InterfaceC65349Pkn("creator_plus_opt_in_url")
    public final String creatorPlusOptInURL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.allowCreatorPlus), this.creatorPlusOptInURL, this.creatorPlusCongratsURL};
    }

    public CPlusSettings(boolean z, String creatorPlusOptInURL, String creatorPlusCongratsURL) {
        o.LJIIIZ(creatorPlusOptInURL, "creatorPlusOptInURL");
        o.LJIIIZ(creatorPlusCongratsURL, "creatorPlusCongratsURL");
        this.allowCreatorPlus = z;
        this.creatorPlusOptInURL = creatorPlusOptInURL;
        this.creatorPlusCongratsURL = creatorPlusCongratsURL;
    }
}
