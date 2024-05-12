package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SingleResourceRefreshResp {

    @InterfaceC65349Pkn("fallback_icon_type")
    public final Integer fallbackIconType;

    @InterfaceC65349Pkn("public_resource_id")
    public final Long resId;

    @InterfaceC65349Pkn("ttl")
    public final Long ttl;

    @InterfaceC65349Pkn("resource_urls")
    public final List<String> urlList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleResourceRefreshResp)) {
            return false;
        }
        SingleResourceRefreshResp singleResourceRefreshResp = (SingleResourceRefreshResp) obj;
        return o.LJ(this.urlList, singleResourceRefreshResp.urlList) && o.LJ(this.resId, singleResourceRefreshResp.resId) && o.LJ(this.ttl, singleResourceRefreshResp.ttl) && o.LJ(this.fallbackIconType, singleResourceRefreshResp.fallbackIconType);
    }

    public final int hashCode() {
        List<String> list = this.urlList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.resId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.ttl;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.fallbackIconType;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleResourceRefreshResp(urlList=");
        LIZ.append(this.urlList);
        LIZ.append(", resId=");
        LIZ.append(this.resId);
        LIZ.append(", ttl=");
        LIZ.append(this.ttl);
        LIZ.append(", fallbackIconType=");
        return s0.LIZJ(LIZ, this.fallbackIconType, ')', LIZ);
    }

    public SingleResourceRefreshResp(List<String> list, Long l, Long l2, Integer num) {
        this.urlList = list;
        this.resId = l;
        this.ttl = l2;
        this.fallbackIconType = num;
    }
}
