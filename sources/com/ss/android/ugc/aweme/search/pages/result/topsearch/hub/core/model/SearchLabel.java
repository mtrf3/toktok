package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchLabel {

    @InterfaceC65349Pkn("jump_query")
    public final String jumpQuery;

    @InterfaceC65349Pkn("label_id")
    public final String labelId;

    @InterfaceC65349Pkn("label_text")
    public final String labelText;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchLabel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLabel)) {
            return false;
        }
        SearchLabel searchLabel = (SearchLabel) obj;
        return o.LJ(this.labelId, searchLabel.labelId) && o.LJ(this.labelText, searchLabel.labelText) && o.LJ(this.jumpQuery, searchLabel.jumpQuery);
    }

    public final int hashCode() {
        String str = this.labelId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.labelText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jumpQuery;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchLabel(labelId=");
        LIZ.append(this.labelId);
        LIZ.append(", labelText=");
        LIZ.append(this.labelText);
        LIZ.append(", jumpQuery=");
        return q.LIZIZ(LIZ, this.jumpQuery, ')', LIZ);
    }

    public SearchLabel(String str, String str2, String str3) {
        this.labelId = str;
        this.labelText = str2;
        this.jumpQuery = str3;
    }

    public /* synthetic */ SearchLabel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
