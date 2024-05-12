package com.ss.android.ugc.aweme.ecommercebase.pagesource;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PageSource {

    @InterfaceC65349Pkn("extra")
    public Map<String, String> extra;

    @InterfaceC65349Pkn("page_name")
    public final String pageName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageSource)) {
            return false;
        }
        PageSource pageSource = (PageSource) obj;
        return o.LJ(this.pageName, pageSource.pageName) && o.LJ(this.extra, pageSource.extra);
    }

    public final int hashCode() {
        int hashCode = this.pageName.hashCode() * 31;
        Map<String, String> map = this.extra;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageSource(pageName=");
        LIZ.append(this.pageName);
        LIZ.append(", extra=");
        return C15890jp.LIZ(LIZ, this.extra, ')', LIZ);
    }

    public PageSource(String pageName, Map<String, String> map) {
        o.LJIIIZ(pageName, "pageName");
        this.pageName = pageName;
        this.extra = map;
    }

    public /* synthetic */ PageSource(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map);
    }
}
