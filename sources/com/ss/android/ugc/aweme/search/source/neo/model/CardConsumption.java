package com.ss.android.ugc.aweme.search.source.neo.model;

import X.InterfaceC65349Pkn;
import X.OQY;
import X.X1D;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class CardConsumption {

    @InterfaceC65349Pkn("act")
    public final Set<String> actSet;

    @InterfaceC65349Pkn("doc_rank")
    public final String docRank;

    @InterfaceC65349Pkn("inner_play_time")
    public final Long innerPlayTime;

    @InterfaceC65349Pkn("list_item_id")
    public final String listItemId;

    @InterfaceC65349Pkn("music_play_time")
    public final Long musicPlayTime;

    @InterfaceC65349Pkn("outer_play_time")
    public final Long outerPlayTime;

    @InterfaceC65349Pkn("product_id")
    public final Set<String> productIdList;

    @InterfaceC65349Pkn("search_result_id")
    public final String searchResultId;

    @InterfaceC65349Pkn("timestamp")
    public final Long timestamp;

    @InterfaceC65349Pkn("token_type")
    public final String tokenType;

    public CardConsumption() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardConsumption)) {
            return false;
        }
        CardConsumption cardConsumption = (CardConsumption) obj;
        return o.LJ(this.searchResultId, cardConsumption.searchResultId) && o.LJ(this.listItemId, cardConsumption.listItemId) && o.LJ(this.tokenType, cardConsumption.tokenType) && o.LJ(this.innerPlayTime, cardConsumption.innerPlayTime) && o.LJ(this.outerPlayTime, cardConsumption.outerPlayTime) && o.LJ(this.productIdList, cardConsumption.productIdList) && o.LJ(this.docRank, cardConsumption.docRank) && o.LJ(this.musicPlayTime, cardConsumption.musicPlayTime) && o.LJ(this.timestamp, cardConsumption.timestamp) && o.LJ(this.actSet, cardConsumption.actSet);
    }

    public final int hashCode() {
        int hashCode = this.searchResultId.hashCode() * 31;
        String str = this.listItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tokenType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.innerPlayTime;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.outerPlayTime;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Set<String> set = this.productIdList;
        int hashCode6 = (hashCode5 + (set == null ? 0 : set.hashCode())) * 31;
        String str3 = this.docRank;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.musicPlayTime;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.timestamp;
        return this.actSet.hashCode() + ((hashCode8 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[searchResultId:");
        LIZ.append(this.searchResultId);
        LIZ.append(", listItemId:");
        LIZ.append(this.listItemId);
        LIZ.append(", tokenType:");
        LIZ.append(this.tokenType);
        LIZ.append(", innerPlayTime:");
        LIZ.append(this.innerPlayTime);
        LIZ.append(", outerPlayTime:");
        LIZ.append(this.outerPlayTime);
        LIZ.append(", productIdList:");
        LIZ.append(this.productIdList);
        LIZ.append(", docRank:");
        LIZ.append(this.docRank);
        LIZ.append(", musicPlayTime:");
        LIZ.append(this.musicPlayTime);
        LIZ.append(", timestamp:");
        LIZ.append(this.timestamp);
        LIZ.append(" actSet:");
        LIZ.append(this.actSet);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public CardConsumption(String searchResultId, String str, String str2, Long l, Long l2, Set<String> set, String str3, Long l3, Long l4, Set<String> actSet) {
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(actSet, "actSet");
        this.searchResultId = searchResultId;
        this.listItemId = str;
        this.tokenType = str2;
        this.innerPlayTime = l;
        this.outerPlayTime = l2;
        this.productIdList = set;
        this.docRank = str3;
        this.musicPlayTime = l3;
        this.timestamp = l4;
        this.actSet = actSet;
    }

    public CardConsumption(String str, String str2, String str3, Long l, Long l2, Set set, String str4, Long l3, Long l4, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : set, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : l3, (i & 256) == 0 ? l4 : null, (i & 512) != 0 ? OQY.INSTANCE : set2);
    }

    public static CardConsumption LIZ(CardConsumption cardConsumption, String str, String str2, String str3, Long l, Long l2, Set set, String str4, Long l3, Long l4, Set set2, int i) {
        Set actSet = set2;
        Long l5 = l4;
        Long l6 = l3;
        String str5 = str4;
        String str6 = str2;
        String searchResultId = str;
        String str7 = str3;
        Long l7 = l;
        Long l8 = l2;
        Set set3 = set;
        if ((i & 1) != 0) {
            searchResultId = cardConsumption.searchResultId;
        }
        if ((i & 2) != 0) {
            str6 = cardConsumption.listItemId;
        }
        if ((i & 4) != 0) {
            str7 = cardConsumption.tokenType;
        }
        if ((i & 8) != 0) {
            l7 = cardConsumption.innerPlayTime;
        }
        if ((i & 16) != 0) {
            l8 = cardConsumption.outerPlayTime;
        }
        if ((i & 32) != 0) {
            set3 = cardConsumption.productIdList;
        }
        if ((i & 64) != 0) {
            str5 = cardConsumption.docRank;
        }
        if ((i & 128) != 0) {
            l6 = cardConsumption.musicPlayTime;
        }
        if ((i & 256) != 0) {
            l5 = cardConsumption.timestamp;
        }
        if ((i & 512) != 0) {
            actSet = cardConsumption.actSet;
        }
        o.LJIIIZ(searchResultId, "searchResultId");
        o.LJIIIZ(actSet, "actSet");
        return new CardConsumption(searchResultId, str6, str7, l7, l8, set3, str5, l6, l5, actSet);
    }
}
