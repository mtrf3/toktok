package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RedirectDetails {

    @InterfaceC65349Pkn("body")
    public Map<String, String> body;

    @InterfaceC65349Pkn("header")
    public Map<String, String> header;

    @InterfaceC65349Pkn("method")
    public String method;

    @InterfaceC65349Pkn("url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public RedirectDetails() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RedirectDetails copy$default(RedirectDetails redirectDetails, Map map, Map map2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = redirectDetails.body;
        }
        if ((i & 2) != 0) {
            map2 = redirectDetails.header;
        }
        if ((i & 4) != 0) {
            str = redirectDetails.method;
        }
        if ((i & 8) != 0) {
            str2 = redirectDetails.url;
        }
        return redirectDetails.copy(map, map2, str, str2);
    }

    public final RedirectDetails copy(Map<String, String> map, Map<String, String> map2, String str, String str2) {
        return new RedirectDetails(map, map2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectDetails)) {
            return false;
        }
        RedirectDetails redirectDetails = (RedirectDetails) obj;
        return o.LJ(this.body, redirectDetails.body) && o.LJ(this.header, redirectDetails.header) && o.LJ(this.method, redirectDetails.method) && o.LJ(this.url, redirectDetails.url);
    }

    public int hashCode() {
        Map<String, String> map = this.body;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.header;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.method;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RedirectDetails(body=");
        LIZ.append(this.body);
        LIZ.append(", header=");
        LIZ.append(this.header);
        LIZ.append(", method=");
        LIZ.append((Object) this.method);
        LIZ.append(", url=");
        LIZ.append((Object) this.url);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Map<String, String> getBody() {
        return this.body;
    }

    public final Map<String, String> getHeader() {
        return this.header;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setBody(Map<String, String> map) {
        this.body = map;
    }

    public final void setHeader(Map<String, String> map) {
        this.header = map;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public RedirectDetails(Map<String, String> map, Map<String, String> map2, String str, String str2) {
        this.body = map;
        this.header = map2;
        this.method = str;
        this.url = str2;
    }

    public /* synthetic */ RedirectDetails(Map map, Map map2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
