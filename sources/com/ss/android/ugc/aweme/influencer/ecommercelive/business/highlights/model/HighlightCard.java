package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.model;

import X.InterfaceC57784Mm4;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HighlightCard implements Serializable, InterfaceC57784Mm4 {
    public final String groupDate;

    @InterfaceC65349Pkn("items")
    public final List<HighlightCellItem> highlightItems;
    public final Boolean isTopHighlight;
    public final Integer offset;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HighlightCard copy$default(HighlightCard highlightCard, String str, List list, Boolean bool, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightCard.title;
        }
        if ((i & 2) != 0) {
            list = highlightCard.highlightItems;
        }
        if ((i & 4) != 0) {
            bool = highlightCard.isTopHighlight;
        }
        if ((i & 8) != 0) {
            str2 = highlightCard.groupDate;
        }
        if ((i & 16) != 0) {
            num = highlightCard.offset;
        }
        return highlightCard.copy(str, list, bool, str2, num);
    }

    public final HighlightCard copy(String str, List<HighlightCellItem> list, Boolean bool, String str2, Integer num) {
        return new HighlightCard(str, list, bool, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightCard)) {
            return false;
        }
        HighlightCard highlightCard = (HighlightCard) obj;
        return o.LJ(this.title, highlightCard.title) && o.LJ(this.highlightItems, highlightCard.highlightItems) && o.LJ(this.isTopHighlight, highlightCard.isTopHighlight) && o.LJ(this.groupDate, highlightCard.groupDate) && o.LJ(this.offset, highlightCard.offset);
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<HighlightCellItem> list = this.highlightItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isTopHighlight;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.groupDate;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.offset;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightCard(title=");
        LIZ.append(this.title);
        LIZ.append(", highlightItems=");
        LIZ.append(this.highlightItems);
        LIZ.append(", isTopHighlight=");
        LIZ.append(this.isTopHighlight);
        LIZ.append(", groupDate=");
        LIZ.append(this.groupDate);
        LIZ.append(", offset=");
        return s0.LIZJ(LIZ, this.offset, ')', LIZ);
    }

    public final String getGroupDate() {
        return this.groupDate;
    }

    public final List<HighlightCellItem> getHighlightItems() {
        return this.highlightItems;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Boolean isTopHighlight() {
        return this.isTopHighlight;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public Object getChangePayload(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return null;
    }

    public HighlightCard(String str, List<HighlightCellItem> list, Boolean bool, String str2, Integer num) {
        this.title = str;
        this.highlightItems = list;
        this.isTopHighlight = bool;
        this.groupDate = str2;
        this.offset = num;
    }

    public /* synthetic */ HighlightCard(String str, List list, Boolean bool, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? num : null);
    }
}
