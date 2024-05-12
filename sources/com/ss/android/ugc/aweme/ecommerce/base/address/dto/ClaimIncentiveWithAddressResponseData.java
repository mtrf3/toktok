package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ClaimIncentiveWithAddressResponseData {

    @InterfaceC65349Pkn("notice_dialog")
    public final NoticeDialogMessage noticeDialogMessage;

    @InterfaceC65349Pkn("result_code")
    public final Integer resultCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimIncentiveWithAddressResponseData)) {
            return false;
        }
        ClaimIncentiveWithAddressResponseData claimIncentiveWithAddressResponseData = (ClaimIncentiveWithAddressResponseData) obj;
        return o.LJ(this.resultCode, claimIncentiveWithAddressResponseData.resultCode) && o.LJ(this.noticeDialogMessage, claimIncentiveWithAddressResponseData.noticeDialogMessage);
    }

    public final int hashCode() {
        Integer num = this.resultCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        NoticeDialogMessage noticeDialogMessage = this.noticeDialogMessage;
        return hashCode + (noticeDialogMessage != null ? noticeDialogMessage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClaimIncentiveWithAddressResponseData(resultCode=");
        LIZ.append(this.resultCode);
        LIZ.append(", noticeDialogMessage=");
        LIZ.append(this.noticeDialogMessage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ClaimIncentiveWithAddressResponseData(Integer num, NoticeDialogMessage noticeDialogMessage) {
        this.resultCode = num;
        this.noticeDialogMessage = noticeDialogMessage;
    }
}
