package com.ss.android.ugc.aweme.commercialize.profile.talent.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfileAdData extends F9E {

    @InterfaceC65349Pkn("aweme_info")
    public final Aweme aweme;

    @InterfaceC65349Pkn("previous_item_id")
    public final String previousItemId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.previousItemId, this.aweme};
    }

    public ProfileAdData(String previousItemId, Aweme aweme) {
        o.LJIIIZ(previousItemId, "previousItemId");
        o.LJIIIZ(aweme, "aweme");
        this.previousItemId = previousItemId;
        this.aweme = aweme;
    }
}
