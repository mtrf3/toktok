package com.ss.android.ugc.aweme.ecommercebase.pagesource;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PageSourceInfo {

    @InterfaceC65349Pkn("ec_head")
    public final PageSource ecHead;

    @InterfaceC65349Pkn("page_source_list")
    public final List<PageSource> sourcePageList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageSourceInfo)) {
            return false;
        }
        PageSourceInfo pageSourceInfo = (PageSourceInfo) obj;
        return o.LJ(this.sourcePageList, pageSourceInfo.sourcePageList) && o.LJ(this.ecHead, pageSourceInfo.ecHead);
    }

    public final int hashCode() {
        int hashCode = this.sourcePageList.hashCode() * 31;
        PageSource pageSource = this.ecHead;
        return hashCode + (pageSource == null ? 0 : pageSource.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageSourceInfo(sourcePageList=");
        LIZ.append(this.sourcePageList);
        LIZ.append(", ecHead=");
        LIZ.append(this.ecHead);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PageSourceInfo(List<PageSource> sourcePageList, PageSource pageSource) {
        o.LJIIIZ(sourcePageList, "sourcePageList");
        this.sourcePageList = sourcePageList;
        this.ecHead = pageSource;
    }
}
