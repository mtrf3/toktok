package com.ss.android.ugc.aweme.search;

import X.C1HQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TrendingEventModel implements Serializable {

    @InterfaceC65349Pkn("hotlink")
    public String coverUrl;

    @InterfaceC65349Pkn("event_id")
    public String eventId;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("heat_value")
    public Long heatValue;

    @InterfaceC65349Pkn("icon_type")
    public final int iconType;

    @InterfaceC65349Pkn("online_time")
    public final String onlineTime;

    @InterfaceC65349Pkn("rank_text")
    public String rankText;

    @InterfaceC65349Pkn("region")
    public String region;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("event_name")
    public String trendingName;

    public static /* synthetic */ void getIconType$annotations() {
    }

    public final Map<String, String> getExtraMap() {
        C1HQ c1hq = new C1HQ();
        try {
            HashMap map = (HashMap) new Gson().LJI(this.extra, HashMap.class);
            o.LJIIIIZZ(map, "map");
            for (Map.Entry entry : map.entrySet()) {
                c1hq.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return c1hq;
        } catch (Exception unused) {
            return new C1HQ();
        }
    }

    public final String getType() {
        int i = this.iconType;
        if (i != 1) {
            if (i != 2) {
                return LiveGiftNewGifterBadgeSetting.DEFAULT;
            }
            return "up";
        }
        return "hot";
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("event_id:");
        LIZ.append(this.eventId);
        LIZ.append(" event_name:");
        LIZ.append(this.trendingName);
        return X1D.LIZIZ(LIZ);
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Long getHeatValue() {
        return this.heatValue;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final String getOnlineTime() {
        return this.onlineTime;
    }

    public final String getRankText() {
        return this.rankText;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTrendingName() {
        return this.trendingName;
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHeatValue(Long l) {
        this.heatValue = l;
    }

    public final void setRankText(String str) {
        this.rankText = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setTrendingName(String str) {
        this.trendingName = str;
    }
}
