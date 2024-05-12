package com.ss.android.ugc.aweme.ecommerce.base.osp.starter;

import X.C07670Rv;
import X.C78983UzD;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class OrderSubmitEnterParams {

    @InterfaceC65349Pkn("asyncBillFetch")
    public final Boolean asyncBillFetch;

    @InterfaceC65349Pkn("billInfo")
    public final BillInfoResponse billInfoResp;

    @InterfaceC65349Pkn("biz_type")
    public final Integer bizType;

    @InterfaceC65349Pkn("buy_type")
    public final int buyType;

    @InterfaceC65349Pkn("chain_key")
    public final String chainKey;

    @InterfaceC65349Pkn("combined_area")
    public final List<Region> combinedArea;

    @InterfaceC65349Pkn("pdp_from")
    public final String pdpFrom;

    @InterfaceC65349Pkn("pipo_bnpl_selected_tenure")
    public final String pipoBnplSelectedTenure;

    @InterfaceC65349Pkn("postponeBillFetch")
    public Boolean postponeBillFetch;

    @InterfaceC65349Pkn("repo_id")
    public final String repoId;

    @InterfaceC65349Pkn("requestParams")
    public final OrderSubmitRequestParam requestParams;

    @InterfaceC65349Pkn("trackParams")
    public final HashMap<String, Object> trackParams;

    @InterfaceC65349Pkn("voucherTypeId")
    public final String voucherTypeId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderSubmitEnterParams copy$default(OrderSubmitEnterParams orderSubmitEnterParams, OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List list, String str, HashMap hashMap, String str2, int i, Boolean bool, String str3, Boolean bool2, String str4, Integer num, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            orderSubmitRequestParam = orderSubmitEnterParams.requestParams;
        }
        if ((i2 & 2) != 0) {
            billInfoResponse = orderSubmitEnterParams.billInfoResp;
        }
        if ((i2 & 4) != 0) {
            list = orderSubmitEnterParams.combinedArea;
        }
        if ((i2 & 8) != 0) {
            str = orderSubmitEnterParams.chainKey;
        }
        if ((i2 & 16) != 0) {
            hashMap = orderSubmitEnterParams.trackParams;
        }
        if ((i2 & 32) != 0) {
            str2 = orderSubmitEnterParams.repoId;
        }
        if ((i2 & 64) != 0) {
            i = orderSubmitEnterParams.buyType;
        }
        if ((i2 & 128) != 0) {
            bool = orderSubmitEnterParams.asyncBillFetch;
        }
        if ((i2 & 256) != 0) {
            str3 = orderSubmitEnterParams.pdpFrom;
        }
        if ((i2 & 512) != 0) {
            bool2 = orderSubmitEnterParams.postponeBillFetch;
        }
        if ((i2 & 1024) != 0) {
            str4 = orderSubmitEnterParams.voucherTypeId;
        }
        if ((i2 & 2048) != 0) {
            num = orderSubmitEnterParams.bizType;
        }
        if ((i2 & 4096) != 0) {
            str5 = orderSubmitEnterParams.pipoBnplSelectedTenure;
        }
        return orderSubmitEnterParams.copy(orderSubmitRequestParam, billInfoResponse, list, str, hashMap, str2, i, bool, str3, bool2, str4, num, str5);
    }

    public final OrderSubmitEnterParams copy(OrderSubmitRequestParam requestParams, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> hashMap, String str2, int i, Boolean bool, String str3, Boolean bool2, String str4, Integer num, String str5) {
        o.LJIIIZ(requestParams, "requestParams");
        return new OrderSubmitEnterParams(requestParams, billInfoResponse, list, str, hashMap, str2, i, bool, str3, bool2, str4, num, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitEnterParams)) {
            return false;
        }
        OrderSubmitEnterParams orderSubmitEnterParams = (OrderSubmitEnterParams) obj;
        return o.LJ(this.requestParams, orderSubmitEnterParams.requestParams) && o.LJ(this.billInfoResp, orderSubmitEnterParams.billInfoResp) && o.LJ(this.combinedArea, orderSubmitEnterParams.combinedArea) && o.LJ(this.chainKey, orderSubmitEnterParams.chainKey) && o.LJ(this.trackParams, orderSubmitEnterParams.trackParams) && o.LJ(this.repoId, orderSubmitEnterParams.repoId) && this.buyType == orderSubmitEnterParams.buyType && o.LJ(this.asyncBillFetch, orderSubmitEnterParams.asyncBillFetch) && o.LJ(this.pdpFrom, orderSubmitEnterParams.pdpFrom) && o.LJ(this.postponeBillFetch, orderSubmitEnterParams.postponeBillFetch) && o.LJ(this.voucherTypeId, orderSubmitEnterParams.voucherTypeId) && o.LJ(this.bizType, orderSubmitEnterParams.bizType) && o.LJ(this.pipoBnplSelectedTenure, orderSubmitEnterParams.pipoBnplSelectedTenure);
    }

    public int hashCode() {
        int hashCode = this.requestParams.hashCode() * 31;
        BillInfoResponse billInfoResponse = this.billInfoResp;
        int hashCode2 = (hashCode + (billInfoResponse == null ? 0 : billInfoResponse.hashCode())) * 31;
        List<Region> list = this.combinedArea;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.chainKey;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        HashMap<String, Object> hashMap = this.trackParams;
        int hashCode5 = (hashCode4 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str2 = this.repoId;
        int hashCode6 = (((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.buyType) * 31;
        Boolean bool = this.asyncBillFetch;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.pdpFrom;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.postponeBillFetch;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.voucherTypeId;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.bizType;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.pipoBnplSelectedTenure;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OrderSubmitEnterParams(requestParams=");
        sb.append(this.requestParams);
        sb.append(", billInfoResp=");
        sb.append(this.billInfoResp);
        sb.append(", combinedArea=");
        sb.append(this.combinedArea);
        sb.append(", chainKey=");
        sb.append(this.chainKey);
        sb.append(", trackParams=");
        sb.append(this.trackParams);
        sb.append(", repoId=");
        sb.append(this.repoId);
        sb.append(", buyType=");
        sb.append(this.buyType);
        sb.append(", asyncBillFetch=");
        sb.append(this.asyncBillFetch);
        sb.append(", pdpFrom=");
        sb.append(this.pdpFrom);
        sb.append(", postponeBillFetch=");
        sb.append(this.postponeBillFetch);
        sb.append(", voucherTypeId=");
        sb.append(this.voucherTypeId);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", pipoBnplSelectedTenure=");
        return C07670Rv.LIZIZ(sb, this.pipoBnplSelectedTenure, ')');
    }

    public final Boolean getAsyncBillFetch() {
        return this.asyncBillFetch;
    }

    public final BillInfoResponse getBillInfoResp() {
        return this.billInfoResp;
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final List<Region> getCombinedArea() {
        return this.combinedArea;
    }

    public final String getPdpFrom() {
        return this.pdpFrom;
    }

    public final String getPipoBnplSelectedTenure() {
        return this.pipoBnplSelectedTenure;
    }

    public final Boolean getPostponeBillFetch() {
        return this.postponeBillFetch;
    }

    public final String getRepoId() {
        return this.repoId;
    }

    public final OrderSubmitRequestParam getRequestParams() {
        return this.requestParams;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public final String getVoucherTypeId() {
        return this.voucherTypeId;
    }

    public final void setPostponeBillFetch(Boolean bool) {
        this.postponeBillFetch = bool;
    }

    public OrderSubmitEnterParams(OrderSubmitRequestParam requestParams, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> hashMap, String str2, int i, Boolean bool, String str3, Boolean bool2, String str4, Integer num, String str5) {
        o.LJIIIZ(requestParams, "requestParams");
        this.requestParams = requestParams;
        this.billInfoResp = billInfoResponse;
        this.combinedArea = list;
        this.chainKey = str;
        this.trackParams = hashMap;
        this.repoId = str2;
        this.buyType = i;
        this.asyncBillFetch = bool;
        this.pdpFrom = str3;
        this.postponeBillFetch = bool2;
        this.voucherTypeId = str4;
        this.bizType = num;
        this.pipoBnplSelectedTenure = str5;
        if (str == null || str.length() == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("chainKey get null init, OrderSubmitEnterParams: ");
            LIZ.append(this);
            C78983UzD.LJIIZILJ(new RuntimeException(X1D.LIZIZ(LIZ)));
        }
    }

    public /* synthetic */ OrderSubmitEnterParams(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List list, String str, HashMap hashMap, String str2, int i, Boolean bool, String str3, Boolean bool2, String str4, Integer num, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orderSubmitRequestParam, (i2 & 2) != 0 ? null : billInfoResponse, (i2 & 4) != 0 ? null : list, str, (i2 & 16) != 0 ? null : hashMap, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : num, (i2 & 4096) == 0 ? str5 : null);
    }
}
