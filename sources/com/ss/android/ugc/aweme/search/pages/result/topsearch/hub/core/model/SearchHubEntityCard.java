package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchHubEntityCard {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("style_type")
    public final int styleType;

    @InterfaceC65349Pkn("top_card_info")
    public final EntityCardTitle topCardInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchHubEntityCard() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHubEntityCard)) {
            return false;
        }
        SearchHubEntityCard searchHubEntityCard = (SearchHubEntityCard) obj;
        return this.styleType == searchHubEntityCard.styleType && o.LJ(this.topCardInfo, searchHubEntityCard.topCardInfo);
    }

    public final int hashCode() {
        int i = this.styleType * 31;
        EntityCardTitle entityCardTitle = this.topCardInfo;
        return i + (entityCardTitle == null ? 0 : entityCardTitle.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SearchHubEntityCard(styleType=");
        LIZ2.append(this.styleType);
        LIZ2.append(", topCardInfo=");
        LIZ2.append(this.topCardInfo);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public SearchHubEntityCard(int i, EntityCardTitle entityCardTitle) {
        this.styleType = i;
        this.topCardInfo = entityCardTitle;
    }

    public /* synthetic */ SearchHubEntityCard(int i, EntityCardTitle entityCardTitle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : entityCardTitle);
    }
}
