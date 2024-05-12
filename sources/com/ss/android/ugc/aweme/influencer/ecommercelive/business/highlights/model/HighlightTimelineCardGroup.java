package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HighlightTimelineCardGroup implements Serializable {

    @InterfaceC65349Pkn("date")
    public final String date;

    @InterfaceC65349Pkn("cards")
    public final List<HighlightCard> timelineCards;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightTimelineCardGroup copy$default(HighlightTimelineCardGroup highlightTimelineCardGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightTimelineCardGroup.date;
        }
        if ((i & 2) != 0) {
            list = highlightTimelineCardGroup.timelineCards;
        }
        return highlightTimelineCardGroup.copy(str, list);
    }

    public final HighlightTimelineCardGroup copy(String str, List<HighlightCard> list) {
        return new HighlightTimelineCardGroup(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightTimelineCardGroup)) {
            return false;
        }
        HighlightTimelineCardGroup highlightTimelineCardGroup = (HighlightTimelineCardGroup) obj;
        return o.LJ(this.date, highlightTimelineCardGroup.date) && o.LJ(this.timelineCards, highlightTimelineCardGroup.timelineCards);
    }

    public int hashCode() {
        String str = this.date;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<HighlightCard> list = this.timelineCards;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightTimelineCardGroup(date=");
        LIZ.append(this.date);
        LIZ.append(", timelineCards=");
        return C1NE.LIZIZ(LIZ, this.timelineCards, ')', LIZ);
    }

    public final String getDate() {
        return this.date;
    }

    public final List<HighlightCard> getTimelineCards() {
        return this.timelineCards;
    }

    public HighlightTimelineCardGroup(String str, List<HighlightCard> list) {
        this.date = str;
        this.timelineCards = list;
    }
}
