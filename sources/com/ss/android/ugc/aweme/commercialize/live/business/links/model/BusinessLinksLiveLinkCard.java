package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BusinessLinksLiveLinkCard extends F9E {

    @InterfaceC65349Pkn("action_type")
    public final String actionType;

    @InterfaceC65349Pkn("link_id")
    public final String linkId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.actionType, this.linkId};
    }

    public BusinessLinksLiveLinkCard(String actionType, String linkId) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(linkId, "linkId");
        this.actionType = actionType;
        this.linkId = linkId;
    }
}
