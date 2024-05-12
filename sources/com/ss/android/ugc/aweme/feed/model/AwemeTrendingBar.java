package com.ss.android.ugc.aweme.feed.model;

import X.C1HQ;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AwemeTrendingBar extends F9E implements Serializable {

    @InterfaceC65349Pkn("display")
    public String display;

    @InterfaceC65349Pkn("event_keyword")
    public String eventKeyword;

    @InterfaceC65349Pkn("event_keyword_id")
    public long eventKeywordId;

    @InterfaceC65349Pkn("event_tracking_param")
    public String eventTrackingParam;

    @InterfaceC65349Pkn("icon_url")
    public UrlModel iconUrl;

    @InterfaceC65349Pkn("schema")
    public String schema;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeTrendingBar() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AwemeTrendingBar copy$default(AwemeTrendingBar awemeTrendingBar, UrlModel urlModel, String str, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = awemeTrendingBar.iconUrl;
        }
        if ((i & 2) != 0) {
            str = awemeTrendingBar.display;
        }
        if ((i & 4) != 0) {
            str2 = awemeTrendingBar.schema;
        }
        if ((i & 8) != 0) {
            j = awemeTrendingBar.eventKeywordId;
        }
        if ((i & 16) != 0) {
            str3 = awemeTrendingBar.eventKeyword;
        }
        if ((i & 32) != 0) {
            str4 = awemeTrendingBar.eventTrackingParam;
        }
        return awemeTrendingBar.copy(urlModel, str, str2, j, str3, str4);
    }

    public final AwemeTrendingBar copy(UrlModel iconUrl, String display, String schema, long j, String eventKeyword, String eventTrackingParam) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(display, "display");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(eventKeyword, "eventKeyword");
        o.LJIIIZ(eventTrackingParam, "eventTrackingParam");
        return new AwemeTrendingBar(iconUrl, display, schema, j, eventKeyword, eventTrackingParam);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.iconUrl, this.display, this.schema, Long.valueOf(this.eventKeywordId), this.eventKeyword, this.eventTrackingParam};
    }

    public final Map<String, String> getTrackMap() {
        C1HQ c1hq = new C1HQ();
        try {
            HashMap map = (HashMap) new Gson().LJI(this.eventTrackingParam, HashMap.class);
            o.LJIIIIZZ(map, "map");
            for (Map.Entry entry : map.entrySet()) {
                c1hq.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return c1hq;
        } catch (Exception unused) {
            return new C1HQ();
        }
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getEventKeyword() {
        return this.eventKeyword;
    }

    public final long getEventKeywordId() {
        return this.eventKeywordId;
    }

    public final String getEventTrackingParam() {
        return this.eventTrackingParam;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setDisplay(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.display = str;
    }

    public final void setEventKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.eventKeyword = str;
    }

    public final void setEventKeywordId(long j) {
        this.eventKeywordId = j;
    }

    public final void setEventTrackingParam(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.eventTrackingParam = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "<set-?>");
        this.iconUrl = urlModel;
    }

    public final void setSchema(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.schema = str;
    }

    public AwemeTrendingBar(UrlModel iconUrl, String display, String schema, long j, String eventKeyword, String eventTrackingParam) {
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(display, "display");
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(eventKeyword, "eventKeyword");
        o.LJIIIZ(eventTrackingParam, "eventTrackingParam");
        this.iconUrl = iconUrl;
        this.display = display;
        this.schema = schema;
        this.eventKeywordId = j;
        this.eventKeyword = eventKeyword;
        this.eventTrackingParam = eventTrackingParam;
    }

    public /* synthetic */ AwemeTrendingBar(UrlModel urlModel, String str, String str2, long j, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UrlModel() : urlModel, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
