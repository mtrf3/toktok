package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class BusinessLinksCardList extends F9E implements Serializable {

    @InterfaceC65349Pkn("card_list")
    public final List<ActiveCard> cardList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BusinessLinksCardList copy$default(BusinessLinksCardList businessLinksCardList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = businessLinksCardList.cardList;
        }
        return businessLinksCardList.copy(list);
    }

    public final BusinessLinksCardList copy(List<ActiveCard> cardList) {
        o.LJIIIZ(cardList, "cardList");
        return new BusinessLinksCardList(cardList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.cardList};
    }

    public final List<ActiveCard> getCardList() {
        return this.cardList;
    }

    public BusinessLinksCardList(List<ActiveCard> cardList) {
        o.LJIIIZ(cardList, "cardList");
        this.cardList = cardList;
    }
}
