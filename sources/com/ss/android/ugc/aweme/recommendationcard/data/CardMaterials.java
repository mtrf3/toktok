package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CardMaterials {

    @InterfaceC65349Pkn("card_content")
    public final List<CardContent> cardContent;

    @InterfaceC65349Pkn("feed_event_card_info")
    public final FeedEventCardInfo feedEventCardInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardMaterials)) {
            return false;
        }
        CardMaterials cardMaterials = (CardMaterials) obj;
        return o.LJ(this.feedEventCardInfo, cardMaterials.feedEventCardInfo) && o.LJ(this.cardContent, cardMaterials.cardContent);
    }

    public final int hashCode() {
        FeedEventCardInfo feedEventCardInfo = this.feedEventCardInfo;
        int hashCode = (feedEventCardInfo == null ? 0 : feedEventCardInfo.hashCode()) * 31;
        List<CardContent> list = this.cardContent;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardMaterials(feedEventCardInfo=");
        LIZ.append(this.feedEventCardInfo);
        LIZ.append(", cardContent=");
        return C1NE.LIZIZ(LIZ, this.cardContent, ')', LIZ);
    }

    public CardMaterials(FeedEventCardInfo feedEventCardInfo, List<CardContent> list) {
        this.feedEventCardInfo = feedEventCardInfo;
        this.cardContent = list;
    }
}
