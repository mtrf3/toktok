package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BundleDealRequest {

    @InterfaceC65349Pkn("kol_id")
    public final String KolId;

    @InterfaceC65349Pkn("bundle_id_list")
    public final List<String> bundleIdList;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("parent_product_id")
    public final String parentProductId;

    @InterfaceC65349Pkn("selected_address_id")
    public final String selectedAddressId;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    @InterfaceC65349Pkn("traffic_source")
    public final Integer trafficSource;

    @InterfaceC65349Pkn("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleDealRequest)) {
            return false;
        }
        BundleDealRequest bundleDealRequest = (BundleDealRequest) obj;
        return o.LJ(this.bundleIdList, bundleDealRequest.bundleIdList) && o.LJ(this.sellerId, bundleDealRequest.sellerId) && o.LJ(this.chainKey, bundleDealRequest.chainKey) && o.LJ(this.KolId, bundleDealRequest.KolId) && o.LJ(this.trafficSource, bundleDealRequest.trafficSource) && o.LJ(this.trafficSourceList, bundleDealRequest.trafficSourceList) && o.LJ(this.selectedAddressId, bundleDealRequest.selectedAddressId) && o.LJ(this.parentProductId, bundleDealRequest.parentProductId);
    }

    public final int hashCode() {
        List<String> list = this.bundleIdList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.sellerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chainKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.KolId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.trafficSource;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.trafficSourceList;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.selectedAddressId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parentProductId;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleDealRequest(bundleIdList=");
        LIZ.append(this.bundleIdList);
        LIZ.append(", sellerId=");
        LIZ.append(this.sellerId);
        LIZ.append(", chainKey=");
        LIZ.append(this.chainKey);
        LIZ.append(", KolId=");
        LIZ.append(this.KolId);
        LIZ.append(", trafficSource=");
        LIZ.append(this.trafficSource);
        LIZ.append(", trafficSourceList=");
        LIZ.append(this.trafficSourceList);
        LIZ.append(", selectedAddressId=");
        LIZ.append(this.selectedAddressId);
        LIZ.append(", parentProductId=");
        return q.LIZIZ(LIZ, this.parentProductId, ')', LIZ);
    }

    public BundleDealRequest(List<String> list, String str, String str2, String str3, Integer num, List<Integer> list2, String str4, String str5) {
        this.bundleIdList = list;
        this.sellerId = str;
        this.chainKey = str2;
        this.KolId = str3;
        this.trafficSource = num;
        this.trafficSourceList = list2;
        this.selectedAddressId = str4;
        this.parentProductId = str5;
    }
}
