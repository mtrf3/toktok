package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class WikiResource {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("image")
    public final String image;

    @InterfaceC65349Pkn("url")
    public final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public WikiResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WikiResource)) {
            return false;
        }
        WikiResource wikiResource = (WikiResource) obj;
        return o.LJ(this.id, wikiResource.id) && o.LJ(this.image, wikiResource.image) && o.LJ(this.url, wikiResource.url);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.image;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WikiResource(id=");
        LIZ.append(this.id);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.url, ')', LIZ);
    }

    public WikiResource(String id, String str, String str2) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.image = str;
        this.url = str2;
    }

    public /* synthetic */ WikiResource(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
