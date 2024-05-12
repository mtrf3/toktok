package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BusinessLinksLiveLinkPin extends F9E {

    @InterfaceC65349Pkn("action_type")
    public final String actionType;

    @InterfaceC65349Pkn("card_data")
    public final CardData cardData;

    @InterfaceC65349Pkn("count")
    public final int count;

    @InterfaceC65349Pkn("live_status")
    public final String liveStatus;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.actionType, this.liveStatus, Integer.valueOf(this.count), this.cardData};
    }

    public BusinessLinksLiveLinkPin(String actionType, String liveStatus, int i, CardData cardData) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(liveStatus, "liveStatus");
        o.LJIIIZ(cardData, "cardData");
        this.actionType = actionType;
        this.liveStatus = liveStatus;
        this.count = i;
        this.cardData = cardData;
    }
}
