package com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchPreciseAd implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("aweme_info")
    public final List<Aweme> awemeCards;

    @InterfaceC65349Pkn("precise_ad_info")
    public final PreciseAdInfo preciseAdInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchPreciseAd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchPreciseAd copy$default(SearchPreciseAd searchPreciseAd, PreciseAdInfo preciseAdInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            preciseAdInfo = searchPreciseAd.preciseAdInfo;
        }
        if ((i & 2) != 0) {
            list = searchPreciseAd.awemeCards;
        }
        return searchPreciseAd.copy(preciseAdInfo, list);
    }

    public final SearchPreciseAd copy(PreciseAdInfo preciseAdInfo, List<? extends Aweme> list) {
        return new SearchPreciseAd(preciseAdInfo, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchPreciseAd)) {
            return false;
        }
        SearchPreciseAd searchPreciseAd = (SearchPreciseAd) obj;
        return o.LJ(this.preciseAdInfo, searchPreciseAd.preciseAdInfo) && o.LJ(this.awemeCards, searchPreciseAd.awemeCards);
    }

    public int hashCode() {
        PreciseAdInfo preciseAdInfo = this.preciseAdInfo;
        int hashCode = (preciseAdInfo == null ? 0 : preciseAdInfo.hashCode()) * 31;
        List<Aweme> list = this.awemeCards;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchPreciseAd(preciseAdInfo=");
        LIZ.append(this.preciseAdInfo);
        LIZ.append(", awemeCards=");
        return C1NE.LIZIZ(LIZ, this.awemeCards, ')', LIZ);
    }

    public final List<Aweme> getAwemeCards() {
        return this.awemeCards;
    }

    public final PreciseAdInfo getPreciseAdInfo() {
        return this.preciseAdInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchPreciseAd(PreciseAdInfo preciseAdInfo, List<? extends Aweme> list) {
        this.preciseAdInfo = preciseAdInfo;
        this.awemeCards = list;
    }

    public /* synthetic */ SearchPreciseAd(PreciseAdInfo preciseAdInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : preciseAdInfo, (i & 2) != 0 ? null : list);
    }
}
