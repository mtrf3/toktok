package com.ss.android.ugc.aweme.rss.api.models;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetRssUserResponse {

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    @InterfaceC65349Pkn("rss_feeds")
    public final List<Rss> rssFeed;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRssUserResponse)) {
            return false;
        }
        GetRssUserResponse getRssUserResponse = (GetRssUserResponse) obj;
        return this.statusCode == getRssUserResponse.statusCode && o.LJ(this.msg, getRssUserResponse.msg) && o.LJ(this.rssFeed, getRssUserResponse.rssFeed);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.msg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<Rss> list = this.rssFeed;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetRssUserResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", rssFeed=");
        return C1NE.LIZIZ(LIZ, this.rssFeed, ')', LIZ);
    }

    public GetRssUserResponse(int i, String str, List<Rss> list) {
        this.statusCode = i;
        this.msg = str;
        this.rssFeed = list;
    }
}
