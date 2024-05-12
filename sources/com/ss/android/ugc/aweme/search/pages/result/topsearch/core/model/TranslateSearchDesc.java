package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TranslateSearchDesc {

    @InterfaceC65349Pkn("origin_language")
    public final String originLanguage;

    @InterfaceC65349Pkn("search_desc")
    public final String searchDesc;

    /* JADX WARN: Multi-variable type inference failed */
    public TranslateSearchDesc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateSearchDesc)) {
            return false;
        }
        TranslateSearchDesc translateSearchDesc = (TranslateSearchDesc) obj;
        return o.LJ(this.searchDesc, translateSearchDesc.searchDesc) && o.LJ(this.originLanguage, translateSearchDesc.originLanguage);
    }

    public final int hashCode() {
        String str = this.searchDesc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originLanguage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TranslateSearchDesc(searchDesc=");
        LIZ.append(this.searchDesc);
        LIZ.append(", originLanguage=");
        return q.LIZIZ(LIZ, this.originLanguage, ')', LIZ);
    }

    public TranslateSearchDesc(String str, String str2) {
        this.searchDesc = str;
        this.originLanguage = str2;
    }

    public /* synthetic */ TranslateSearchDesc(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
