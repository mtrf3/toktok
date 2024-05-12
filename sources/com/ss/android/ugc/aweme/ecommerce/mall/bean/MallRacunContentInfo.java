package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallRacunContentInfo {

    @InterfaceC65349Pkn("feed_list")
    public final List<MallFeed> feed;

    @InterfaceC65349Pkn("feed_type_map")
    public final Map<String, Integer> feedTypeMap;

    @InterfaceC65349Pkn("live_inner_request_from")
    public final String liveInnerRequestFrom;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallRacunContentInfo copy$default(MallRacunContentInfo mallRacunContentInfo, Map map, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = mallRacunContentInfo.feedTypeMap;
        }
        if ((i & 2) != 0) {
            list = mallRacunContentInfo.feed;
        }
        if ((i & 4) != 0) {
            str = mallRacunContentInfo.liveInnerRequestFrom;
        }
        return mallRacunContentInfo.copy(map, list, str);
    }

    public final MallRacunContentInfo copy(Map<String, Integer> map, List<MallFeed> list, String str) {
        return new MallRacunContentInfo(map, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallRacunContentInfo)) {
            return false;
        }
        MallRacunContentInfo mallRacunContentInfo = (MallRacunContentInfo) obj;
        return o.LJ(this.feedTypeMap, mallRacunContentInfo.feedTypeMap) && o.LJ(this.feed, mallRacunContentInfo.feed) && o.LJ(this.liveInnerRequestFrom, mallRacunContentInfo.liveInnerRequestFrom);
    }

    public int hashCode() {
        Map<String, Integer> map = this.feedTypeMap;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<MallFeed> list = this.feed;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.liveInnerRequestFrom;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallRacunContentInfo(feedTypeMap=");
        LIZ.append(this.feedTypeMap);
        LIZ.append(", feed=");
        LIZ.append(this.feed);
        LIZ.append(", liveInnerRequestFrom=");
        return q.LIZIZ(LIZ, this.liveInnerRequestFrom, ')', LIZ);
    }

    public final List<MallFeed> getFeed() {
        return this.feed;
    }

    public final Map<String, Integer> getFeedTypeMap() {
        return this.feedTypeMap;
    }

    public final String getLiveInnerRequestFrom() {
        return this.liveInnerRequestFrom;
    }

    public MallRacunContentInfo(Map<String, Integer> map, List<MallFeed> list, String str) {
        this.feedTypeMap = map;
        this.feed = list;
        this.liveInnerRequestFrom = str;
    }
}
