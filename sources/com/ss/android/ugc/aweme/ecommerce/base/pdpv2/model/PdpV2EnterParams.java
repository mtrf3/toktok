package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model;

import X.F9E;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SemiPdpRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto.SourceInfo;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpV2EnterParams extends F9E implements Serializable {
    public final long enterTimeStamp;
    public final boolean fullScreen;
    public final int pdpPageType;
    public final String preTrackNodeId;
    public final HashMap<String, Object> requestParams;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PdpV2EnterParams copy$default(PdpV2EnterParams pdpV2EnterParams, HashMap hashMap, int i, boolean z, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hashMap = pdpV2EnterParams.requestParams;
        }
        if ((i2 & 2) != 0) {
            i = pdpV2EnterParams.pdpPageType;
        }
        if ((i2 & 4) != 0) {
            z = pdpV2EnterParams.fullScreen;
        }
        if ((i2 & 8) != 0) {
            str = pdpV2EnterParams.preTrackNodeId;
        }
        if ((i2 & 16) != 0) {
            j = pdpV2EnterParams.enterTimeStamp;
        }
        return pdpV2EnterParams.copy(hashMap, i, z, str, j);
    }

    public final PdpV2EnterParams copy(HashMap<String, Object> requestParams, int i, boolean z, String preTrackNodeId, long j) {
        o.LJIIIZ(requestParams, "requestParams");
        o.LJIIIZ(preTrackNodeId, "preTrackNodeId");
        return new PdpV2EnterParams(requestParams, i, z, preTrackNodeId, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.requestParams, Integer.valueOf(this.pdpPageType), Boolean.valueOf(this.fullScreen), this.preTrackNodeId, Long.valueOf(this.enterTimeStamp)};
    }

    public final String getCatalogId() {
        String str;
        try {
            Object obj = this.requestParams.get("catalog_id");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getProductId() {
        try {
            Object obj = this.requestParams.get("product_id");
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getSellerSecUid() {
        String str;
        try {
            Object obj = this.requestParams.get("seller_sec_uid");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final SemiPdpRequest getRequest() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String productId = getProductId();
        Object obj = this.requestParams.get("catalog_id");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str7 = "";
        if (str == null) {
            str = "";
        }
        Object obj2 = this.requestParams.get("seller_sec_uid");
        if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
            str2 = "";
        }
        Object obj3 = this.requestParams.get("source_page");
        if (!(obj3 instanceof String) || (str3 = (String) obj3) == null) {
            str3 = "";
        }
        Object obj4 = this.requestParams.get("first_source_page");
        if (!(obj4 instanceof String) || (str4 = (String) obj4) == null) {
            str4 = "";
        }
        Object obj5 = this.requestParams.get("author_id");
        if (!(obj5 instanceof String) || (str5 = (String) obj5) == null) {
            str5 = "";
        }
        Object obj6 = this.requestParams.get("source_content_id");
        if ((obj6 instanceof String) && (str6 = (String) obj6) != null) {
            str7 = str6;
        }
        return new SemiPdpRequest(str, productId, str2, new SourceInfo(str3, str4, str5, str7), null, false, 48, null);
    }

    public final long getEnterTimeStamp() {
        return this.enterTimeStamp;
    }

    public final boolean getFullScreen() {
        return this.fullScreen;
    }

    public final int getPdpPageType() {
        return this.pdpPageType;
    }

    public final String getPreTrackNodeId() {
        return this.preTrackNodeId;
    }

    public final HashMap<String, Object> getRequestParams() {
        return this.requestParams;
    }

    public PdpV2EnterParams(HashMap<String, Object> requestParams, int i, boolean z, String preTrackNodeId, long j) {
        o.LJIIIZ(requestParams, "requestParams");
        o.LJIIIZ(preTrackNodeId, "preTrackNodeId");
        this.requestParams = requestParams;
        this.pdpPageType = i;
        this.fullScreen = z;
        this.preTrackNodeId = preTrackNodeId;
        this.enterTimeStamp = j;
    }

    public /* synthetic */ PdpV2EnterParams(HashMap hashMap, int i, boolean z, String str, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new HashMap() : hashMap, i, (i2 & 4) != 0 ? false : z, str, j);
    }
}
