package com.ss.android.ugc.aweme.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendAnalyticsEventData {

    @InterfaceC65349Pkn("base_url")
    public final String baseUrl;

    @InterfaceC65349Pkn("whitelist_path")
    public final List<String> whiteList;

    /* JADX WARN: Multi-variable type inference failed */
    public SendAnalyticsEventData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendAnalyticsEventData)) {
            return false;
        }
        SendAnalyticsEventData sendAnalyticsEventData = (SendAnalyticsEventData) obj;
        return o.LJ(this.baseUrl, sendAnalyticsEventData.baseUrl) && o.LJ(this.whiteList, sendAnalyticsEventData.whiteList);
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        List<String> list = this.whiteList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendAnalyticsEventData(baseUrl=");
        LIZ.append(this.baseUrl);
        LIZ.append(", whiteList=");
        return C1NE.LIZIZ(LIZ, this.whiteList, ')', LIZ);
    }

    public SendAnalyticsEventData(String baseUrl, List<String> list) {
        o.LJIIIZ(baseUrl, "baseUrl");
        this.baseUrl = baseUrl;
        this.whiteList = list;
    }

    public /* synthetic */ SendAnalyticsEventData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }
}
