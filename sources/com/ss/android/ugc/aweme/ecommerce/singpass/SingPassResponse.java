package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingPassResponse {

    @InterfaceC65349Pkn("error_info")
    public final Error errorInfo;

    @InterfaceC65349Pkn("singpass_user_info")
    public final PersonInfo personInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingPassResponse)) {
            return false;
        }
        SingPassResponse singPassResponse = (SingPassResponse) obj;
        return o.LJ(this.personInfo, singPassResponse.personInfo) && o.LJ(this.errorInfo, singPassResponse.errorInfo);
    }

    public final int hashCode() {
        PersonInfo personInfo = this.personInfo;
        int hashCode = (personInfo == null ? 0 : personInfo.hashCode()) * 31;
        Error error = this.errorInfo;
        return hashCode + (error != null ? error.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingPassResponse(personInfo=");
        LIZ.append(this.personInfo);
        LIZ.append(", errorInfo=");
        LIZ.append(this.errorInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SingPassResponse(PersonInfo personInfo, Error error) {
        this.personInfo = personInfo;
        this.errorInfo = error;
    }
}
