package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.InterfaceC65349Pkn;
import X.JQF;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardInfo implements JQF {
    public final int LIZ = -1;

    @InterfaceC65349Pkn("ala_src")
    public String alasrc;

    @InterfaceC65349Pkn("doc_id")
    public String docId;

    @InterfaceC65349Pkn("sounds_list_type")
    public int soundsListType;

    public final int hashCode() {
        int i;
        int i2;
        String str = this.docId;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.alasrc;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        return ((i3 + i2) * 31 * 31 * 31) + this.LIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(SearchCardInfo.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo");
        SearchCardInfo searchCardInfo = (SearchCardInfo) obj;
        if (o.LJ(this.docId, searchCardInfo.docId) && o.LJ(this.alasrc, searchCardInfo.alasrc) && this.LIZ == searchCardInfo.LIZ) {
            return true;
        }
        return false;
    }
}
