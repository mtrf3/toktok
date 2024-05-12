package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AvailableWaysResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final TwoSvUserData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ AvailableWaysResponse copy$default(AvailableWaysResponse availableWaysResponse, String str, TwoSvUserData twoSvUserData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableWaysResponse.message;
        }
        if ((i & 2) != 0) {
            twoSvUserData = availableWaysResponse.data;
        }
        return availableWaysResponse.copy(str, twoSvUserData);
    }

    public final AvailableWaysResponse copy(String str, TwoSvUserData twoSvUserData) {
        return new AvailableWaysResponse(str, twoSvUserData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableWaysResponse)) {
            return false;
        }
        AvailableWaysResponse availableWaysResponse = (AvailableWaysResponse) obj;
        return o.LJ(this.message, availableWaysResponse.message) && o.LJ(this.data, availableWaysResponse.data);
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TwoSvUserData twoSvUserData = this.data;
        return hashCode + (twoSvUserData != null ? twoSvUserData.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvailableWaysResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final TwoSvUserData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public AvailableWaysResponse(String str, TwoSvUserData twoSvUserData) {
        this.message = str;
        this.data = twoSvUserData;
    }
}
