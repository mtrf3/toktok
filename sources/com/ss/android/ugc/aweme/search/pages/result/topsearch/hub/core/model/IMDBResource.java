package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IMDBResource {

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn("detail_url")
    public final String detailUrl;

    @InterfaceC65349Pkn("id")
    public final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public IMDBResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMDBResource)) {
            return false;
        }
        IMDBResource iMDBResource = (IMDBResource) obj;
        return o.LJ(this.id, iMDBResource.id) && o.LJ(this.cover, iMDBResource.cover) && o.LJ(this.detailUrl, iMDBResource.detailUrl);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        UrlModel urlModel = this.cover;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.detailUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMDBResource(id=");
        LIZ.append(this.id);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", detailUrl=");
        return q.LIZIZ(LIZ, this.detailUrl, ')', LIZ);
    }

    public IMDBResource(String id, UrlModel urlModel, String str) {
        o.LJIIIZ(id, "id");
        this.id = id;
        this.cover = urlModel;
        this.detailUrl = str;
    }

    public /* synthetic */ IMDBResource(String str, UrlModel urlModel, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : urlModel, (i & 4) != 0 ? null : str2);
    }
}
