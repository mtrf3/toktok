package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchExtraTabInfo {

    @InterfaceC65349Pkn("default_tab")
    public final Integer defaultTab;

    @InterfaceC65349Pkn("tab_type")
    public final Integer tabType;

    @InterfaceC65349Pkn("token_type")
    public final String tokenType;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchExtraTabInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchExtraTabInfo)) {
            return false;
        }
        SearchExtraTabInfo searchExtraTabInfo = (SearchExtraTabInfo) obj;
        return o.LJ(this.defaultTab, searchExtraTabInfo.defaultTab) && o.LJ(this.tabType, searchExtraTabInfo.tabType) && o.LJ(this.tokenType, searchExtraTabInfo.tokenType);
    }

    public final int hashCode() {
        Integer num = this.defaultTab;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.tabType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.tokenType;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchExtraTabInfo(defaultTab=");
        LIZ.append(this.defaultTab);
        LIZ.append(", tabType=");
        LIZ.append(this.tabType);
        LIZ.append(", tokenType=");
        return q.LIZIZ(LIZ, this.tokenType, ')', LIZ);
    }

    public SearchExtraTabInfo(Integer num, Integer num2, String str) {
        this.defaultTab = num;
        this.tabType = num2;
        this.tokenType = str;
    }

    public /* synthetic */ SearchExtraTabInfo(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str);
    }
}
