package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C51053K1x;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.ORZ;
import X.X1D;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSceneInfo {

    @InterfaceC65349Pkn("card_consumption")
    public final Map<String, CardConsumption> cardConsumptionMap;

    @InterfaceC65349Pkn("channel")
    public final String channel;

    @InterfaceC65349Pkn("query")
    public final String query;

    @InterfaceC65349Pkn("search_id")
    public final String searchId;

    @InterfaceC65349Pkn("source")
    public final String source;

    @InterfaceC65349Pkn("timestamp")
    public final Long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchSceneInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSceneInfo)) {
            return false;
        }
        SearchSceneInfo searchSceneInfo = (SearchSceneInfo) obj;
        return o.LJ(this.searchId, searchSceneInfo.searchId) && o.LJ(this.query, searchSceneInfo.query) && o.LJ(this.channel, searchSceneInfo.channel) && o.LJ(this.source, searchSceneInfo.source) && o.LJ(this.timestamp, searchSceneInfo.timestamp) && o.LJ(this.cardConsumptionMap, searchSceneInfo.cardConsumptionMap);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.query, this.searchId.hashCode() * 31, 31);
        String str = this.channel;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.source;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this.timestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return this.cardConsumptionMap.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        String LLD = ORZ.LLD(this.cardConsumptionMap.entrySet(), "\n", null, null, C51053K1x.LJLIL, 30);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[searchId:");
        LIZ.append(this.searchId);
        LIZ.append(", query:");
        LIZ.append(this.query);
        LIZ.append(", channel:");
        LIZ.append(this.channel);
        LIZ.append(", source:");
        LIZ.append(this.source);
        LIZ.append(", timestamp:");
        LIZ.append(this.timestamp);
        LIZ.append(", cardConsumptionMap.size:");
        LIZ.append(this.cardConsumptionMap.size());
        LIZ.append("\n cardConsumptionMap:\n{");
        LIZ.append(LLD);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public SearchSceneInfo(String searchId, String query, String str, String str2, Long l, Map<String, CardConsumption> cardConsumptionMap) {
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(query, "query");
        o.LJIIIZ(cardConsumptionMap, "cardConsumptionMap");
        this.searchId = searchId;
        this.query = query;
        this.channel = str;
        this.source = str2;
        this.timestamp = l;
        this.cardConsumptionMap = cardConsumptionMap;
    }

    public /* synthetic */ SearchSceneInfo(String str, String str2, String str3, String str4, Long l, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? l : null, (i & 32) != 0 ? new ConcurrentHashMap() : map);
    }
}
