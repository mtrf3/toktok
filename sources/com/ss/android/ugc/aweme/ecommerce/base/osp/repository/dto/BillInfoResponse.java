package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BillInfoResponse extends Response<BillInfoData> implements Serializable {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isValid() {
        T t;
        BillInfoData billInfoData;
        if (!isCodeOK() || (t = this.data) == 0) {
            return false;
        }
        if ((t instanceof BillInfoData) && (billInfoData = (BillInfoData) t) != null && billInfoData.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BillInfoResponse mergeChunk(BillInfoResponse other) {
        BillInfoData billInfoData;
        o.LJIIIZ(other, "other");
        int i = this.code;
        String str = this.message;
        BillInfoData billInfoData2 = (BillInfoData) this.data;
        if (billInfoData2 != null) {
            billInfoData = billInfoData2.mergeChunk((BillInfoData) other.data);
        } else {
            billInfoData = null;
        }
        return new BillInfoResponse(i, str, billInfoData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BillInfoResponse merge(BillInfoResponse other, BillInfoRequest request) {
        BillInfoData billInfoData;
        o.LJIIIZ(other, "other");
        o.LJIIIZ(request, "request");
        int i = this.code;
        String str = this.message;
        BillInfoData billInfoData2 = (BillInfoData) this.data;
        if (billInfoData2 != null) {
            billInfoData = billInfoData2.merge((BillInfoData) other.data, request);
        } else {
            billInfoData = null;
        }
        return new BillInfoResponse(i, str, billInfoData);
    }

    public BillInfoResponse(int i, String str, BillInfoData billInfoData) {
        super(i, str, billInfoData, null, 8, null);
    }
}
