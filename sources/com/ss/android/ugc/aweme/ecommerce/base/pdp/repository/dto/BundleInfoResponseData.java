package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BundleInfoResponseData {

    @InterfaceC65349Pkn("bundle_info_list")
    public final List<BundleInfo> bundleInfoList;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleInfoResponseData)) {
            return false;
        }
        BundleInfoResponseData bundleInfoResponseData = (BundleInfoResponseData) obj;
        return o.LJ(this.bundleInfoList, bundleInfoResponseData.bundleInfoList) && o.LJ(this.requestId, bundleInfoResponseData.requestId);
    }

    public final int hashCode() {
        List<BundleInfo> list = this.bundleInfoList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.requestId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleInfoResponseData(bundleInfoList=");
        LIZ.append(this.bundleInfoList);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.requestId, ')', LIZ);
    }

    public BundleInfoResponseData(List<BundleInfo> list, String str) {
        this.bundleInfoList = list;
        this.requestId = str;
    }
}
