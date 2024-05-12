package com.ss.android.ugc.aweme.trending.ui.billboardpage.list;

import X.C1HQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.q;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingBillboardModel {

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("heat_value")
    public final String heatValue;

    @InterfaceC65349Pkn("hotlink")
    public final String hotLink;

    @InterfaceC65349Pkn("icon_type")
    public final Integer iconType;

    @InterfaceC65349Pkn("rank_text")
    public final String rankText;

    @InterfaceC65349Pkn("event_id")
    public final String trendingId;

    @InterfaceC65349Pkn("event_name")
    public final String trendingName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingBillboardModel)) {
            return false;
        }
        TrendingBillboardModel trendingBillboardModel = (TrendingBillboardModel) obj;
        return o.LJ(this.trendingId, trendingBillboardModel.trendingId) && o.LJ(this.trendingName, trendingBillboardModel.trendingName) && o.LJ(this.iconType, trendingBillboardModel.iconType) && o.LJ(this.rankText, trendingBillboardModel.rankText) && o.LJ(this.heatValue, trendingBillboardModel.heatValue) && o.LJ(this.hotLink, trendingBillboardModel.hotLink) && o.LJ(this.extra, trendingBillboardModel.extra);
    }

    public final int hashCode() {
        String str = this.trendingId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.trendingName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.iconType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.rankText;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.heatValue;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hotLink;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extra;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final C1HQ LIZ() {
        C1HQ c1hq = new C1HQ();
        try {
            HashMap map = (HashMap) GsonHolder.LIZLLL().LIZ().LJI(this.extra, HashMap.class);
            o.LJIIIIZZ(map, "map");
            for (Map.Entry entry : map.entrySet()) {
                c1hq.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return c1hq;
        } catch (Exception unused) {
            return new C1HQ();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrendingBillboardModel(trendingId=");
        LIZ.append(this.trendingId);
        LIZ.append(", trendingName=");
        LIZ.append(this.trendingName);
        LIZ.append(", iconType=");
        LIZ.append(this.iconType);
        LIZ.append(", rankText=");
        LIZ.append(this.rankText);
        LIZ.append(", heatValue=");
        LIZ.append(this.heatValue);
        LIZ.append(", hotLink=");
        LIZ.append(this.hotLink);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.extra, ')', LIZ);
    }

    public TrendingBillboardModel(String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
        this.trendingId = str;
        this.trendingName = str2;
        this.iconType = num;
        this.rankText = str3;
        this.heatValue = str4;
        this.hotLink = str5;
        this.extra = str6;
    }
}
