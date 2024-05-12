package com.ss.android.ugc.aweme.comment.gift.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftResponse extends BaseResponse {

    @InterfaceC65349Pkn("cpc_prompt_data")
    public final CPCPromptData cpcPromptData;

    @InterfaceC65349Pkn("data")
    public final GiftResult giftPageList;

    public static /* synthetic */ GiftResponse copy$default(GiftResponse giftResponse, GiftResult giftResult, CPCPromptData cPCPromptData, int i, Object obj) {
        if ((i & 1) != 0) {
            giftResult = giftResponse.giftPageList;
        }
        if ((i & 2) != 0) {
            cPCPromptData = giftResponse.cpcPromptData;
        }
        return giftResponse.copy(giftResult, cPCPromptData);
    }

    public final GiftResponse copy(GiftResult giftResult, CPCPromptData cPCPromptData) {
        return new GiftResponse(giftResult, cPCPromptData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftResponse)) {
            return false;
        }
        GiftResponse giftResponse = (GiftResponse) obj;
        return o.LJ(this.giftPageList, giftResponse.giftPageList) && o.LJ(this.cpcPromptData, giftResponse.cpcPromptData);
    }

    public int hashCode() {
        GiftResult giftResult = this.giftPageList;
        int hashCode = (giftResult == null ? 0 : giftResult.hashCode()) * 31;
        CPCPromptData cPCPromptData = this.cpcPromptData;
        return hashCode + (cPCPromptData != null ? cPCPromptData.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftResponse(giftPageList=");
        LIZ.append(this.giftPageList);
        LIZ.append(", cpcPromptData=");
        LIZ.append(this.cpcPromptData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final CPCPromptData getCpcPromptData() {
        return this.cpcPromptData;
    }

    public final GiftResult getGiftPageList() {
        return this.giftPageList;
    }

    public GiftResponse(GiftResult giftResult, CPCPromptData cPCPromptData) {
        this.giftPageList = giftResult;
        this.cpcPromptData = cPCPromptData;
    }
}
