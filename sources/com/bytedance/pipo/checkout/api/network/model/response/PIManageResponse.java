package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.InterfaceC92088a56;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIManageResponse implements InterfaceC92088a56 {

    @InterfaceC65349Pkn("error_code")
    public String errorCode;

    @InterfaceC65349Pkn("error_message")
    public String errorMessage;

    @InterfaceC65349Pkn("result_code")
    public String resultCode;

    /* JADX WARN: Multi-variable type inference failed */
    public PIManageResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PIManageResponse copy$default(PIManageResponse pIManageResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pIManageResponse.getErrorCode();
        }
        if ((i & 2) != 0) {
            str2 = pIManageResponse.getErrorMessage();
        }
        if ((i & 4) != 0) {
            str3 = pIManageResponse.getResultCode();
        }
        return pIManageResponse.copy(str, str2, str3);
    }

    public final String component1() {
        return getErrorCode();
    }

    public final String component2() {
        return getErrorMessage();
    }

    public final String component3() {
        return getResultCode();
    }

    public final PIManageResponse copy(String str, String str2, String str3) {
        return new PIManageResponse(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIManageResponse)) {
            return false;
        }
        PIManageResponse pIManageResponse = (PIManageResponse) obj;
        return o.LJ(getErrorCode(), pIManageResponse.getErrorCode()) && o.LJ(getErrorMessage(), pIManageResponse.getErrorMessage()) && o.LJ(getResultCode(), pIManageResponse.getResultCode());
    }

    public int hashCode() {
        return ((((getErrorCode() == null ? 0 : getErrorCode().hashCode()) * 31) + (getErrorMessage() == null ? 0 : getErrorMessage().hashCode())) * 31) + (getResultCode() != null ? getResultCode().hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PIManageResponse(errorCode=");
        LIZ.append((Object) getErrorCode());
        LIZ.append(", errorMessage=");
        LIZ.append((Object) getErrorMessage());
        LIZ.append(", resultCode=");
        LIZ.append((Object) getResultCode());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public PIManageResponse(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.resultCode = str3;
    }

    public /* synthetic */ PIManageResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
