package com.ss.android.ugc.aweme.rss.api.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetRssFeedResponse {

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    @InterfaceC65349Pkn("rss_feed")
    public final RssFeed rssFeed;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRssFeedResponse)) {
            return false;
        }
        GetRssFeedResponse getRssFeedResponse = (GetRssFeedResponse) obj;
        return this.statusCode == getRssFeedResponse.statusCode && o.LJ(this.msg, getRssFeedResponse.msg) && o.LJ(this.rssFeed, getRssFeedResponse.rssFeed) && o.LJ(this.nextPageToken, getRssFeedResponse.nextPageToken);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        RssFeed rssFeed = this.rssFeed;
        int hashCode2 = (hashCode + (rssFeed == null ? 0 : rssFeed.hashCode())) * 31;
        String str2 = this.nextPageToken;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetRssFeedResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", rssFeed=");
        LIZ.append(this.rssFeed);
        LIZ.append(", nextPageToken=");
        return q.LIZIZ(LIZ, this.nextPageToken, ')', LIZ);
    }

    public GetRssFeedResponse(int i, String str, RssFeed rssFeed, String str2) {
        this.statusCode = i;
        this.msg = str;
        this.rssFeed = rssFeed;
        this.nextPageToken = str2;
    }
}
