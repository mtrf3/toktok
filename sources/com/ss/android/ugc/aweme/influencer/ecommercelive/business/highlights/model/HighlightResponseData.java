package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HighlightResponseData implements Serializable {

    @InterfaceC65349Pkn("new_user_guide")
    public final HighlightNewUserGuide newUserGuide;

    @InterfaceC65349Pkn("offset")
    public final Integer offset;

    @InterfaceC65349Pkn("highlight_timeline")
    public final List<HighlightTimelineCardGroup> timeline;

    @InterfaceC65349Pkn("highlight_top")
    public final HighlightCard topHighlights;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightResponseData copy$default(HighlightResponseData highlightResponseData, HighlightNewUserGuide highlightNewUserGuide, HighlightCard highlightCard, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            highlightNewUserGuide = highlightResponseData.newUserGuide;
        }
        if ((i & 2) != 0) {
            highlightCard = highlightResponseData.topHighlights;
        }
        if ((i & 4) != 0) {
            list = highlightResponseData.timeline;
        }
        if ((i & 8) != 0) {
            num = highlightResponseData.offset;
        }
        return highlightResponseData.copy(highlightNewUserGuide, highlightCard, list, num);
    }

    public final HighlightResponseData copy(HighlightNewUserGuide highlightNewUserGuide, HighlightCard highlightCard, List<HighlightTimelineCardGroup> list, Integer num) {
        return new HighlightResponseData(highlightNewUserGuide, highlightCard, list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightResponseData)) {
            return false;
        }
        HighlightResponseData highlightResponseData = (HighlightResponseData) obj;
        return o.LJ(this.newUserGuide, highlightResponseData.newUserGuide) && o.LJ(this.topHighlights, highlightResponseData.topHighlights) && o.LJ(this.timeline, highlightResponseData.timeline) && o.LJ(this.offset, highlightResponseData.offset);
    }

    public int hashCode() {
        HighlightNewUserGuide highlightNewUserGuide = this.newUserGuide;
        int hashCode = (highlightNewUserGuide == null ? 0 : highlightNewUserGuide.hashCode()) * 31;
        HighlightCard highlightCard = this.topHighlights;
        int hashCode2 = (hashCode + (highlightCard == null ? 0 : highlightCard.hashCode())) * 31;
        List<HighlightTimelineCardGroup> list = this.timeline;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.offset;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightResponseData(newUserGuide=");
        LIZ.append(this.newUserGuide);
        LIZ.append(", topHighlights=");
        LIZ.append(this.topHighlights);
        LIZ.append(", timeline=");
        LIZ.append(this.timeline);
        LIZ.append(", offset=");
        return s0.LIZJ(LIZ, this.offset, ')', LIZ);
    }

    public final HighlightNewUserGuide getNewUserGuide() {
        return this.newUserGuide;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final List<HighlightTimelineCardGroup> getTimeline() {
        return this.timeline;
    }

    public final HighlightCard getTopHighlights() {
        return this.topHighlights;
    }

    public HighlightResponseData(HighlightNewUserGuide highlightNewUserGuide, HighlightCard highlightCard, List<HighlightTimelineCardGroup> list, Integer num) {
        this.newUserGuide = highlightNewUserGuide;
        this.topHighlights = highlightCard;
        this.timeline = list;
        this.offset = num;
    }
}
