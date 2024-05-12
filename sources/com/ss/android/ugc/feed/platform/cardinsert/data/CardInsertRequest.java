package com.ss.android.ugc.feed.platform.cardinsert.data;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CardInsertRequest {

    @InterfaceC65349Pkn("current_flow_index")
    public final int cardType;

    @InterfaceC65349Pkn("insert_cards")
    public final List<CardTypeRequest> insertCards;

    /* JADX WARN: Multi-variable type inference failed */
    public CardInsertRequest() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public CardInsertRequest(int i, List<CardTypeRequest> list) {
        this.cardType = i;
        this.insertCards = list;
    }

    public /* synthetic */ CardInsertRequest(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
    }
}
