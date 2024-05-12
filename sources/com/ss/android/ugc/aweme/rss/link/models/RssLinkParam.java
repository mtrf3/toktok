package com.ss.android.ugc.aweme.rss.link.models;

import X.A77;
import X.F9E;
import X.InterfaceC87283bg;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RssLinkParam extends F9E implements IRouteArg, InterfaceC87283bg {
    public static final Parcelable.Creator<RssLinkParam> CREATOR = new A77();
    public final String enterFrom;
    public String rssFeedUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public RssLinkParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static RssLinkParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("rss_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("rss_url"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_from")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        return new RssLinkParam(str, str2, i, defaultConstructorMarker);
    }

    public static /* synthetic */ RssLinkParam copy$default(RssLinkParam rssLinkParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rssLinkParam.rssFeedUrl;
        }
        if ((i & 2) != 0) {
            str2 = rssLinkParam.enterFrom;
        }
        return rssLinkParam.copy(str, str2);
    }

    public final RssLinkParam copy(String rssFeedUrl, String enterFrom) {
        o.LJIIIZ(rssFeedUrl, "rssFeedUrl");
        o.LJIIIZ(enterFrom, "enterFrom");
        return new RssLinkParam(rssFeedUrl, enterFrom);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.rssFeedUrl, this.enterFrom};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.rssFeedUrl);
        out.writeString(this.enterFrom);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getRssFeedUrl() {
        return this.rssFeedUrl;
    }

    public final void setRssFeedUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.rssFeedUrl = str;
    }

    public RssLinkParam(String rssFeedUrl, String enterFrom) {
        o.LJIIIZ(rssFeedUrl, "rssFeedUrl");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.rssFeedUrl = rssFeedUrl;
        this.enterFrom = enterFrom;
    }

    public /* synthetic */ RssLinkParam(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
