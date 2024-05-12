package com.ss.android.ugc.aweme.account.login.v2.network;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Check2SvPushClickResponse {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final Integer error_code;

    @InterfaceC65349Pkn("result")
    public final String result;

    @InterfaceC65349Pkn("verify_ticket")
    public final String verify_ticket;

    /* JADX WARN: Multi-variable type inference failed */
    public Check2SvPushClickResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Check2SvPushClickResponse)) {
            return false;
        }
        Check2SvPushClickResponse check2SvPushClickResponse = (Check2SvPushClickResponse) obj;
        return o.LJ(this.result, check2SvPushClickResponse.result) && o.LJ(this.verify_ticket, check2SvPushClickResponse.verify_ticket) && o.LJ(this.description, check2SvPushClickResponse.description) && o.LJ(this.error_code, check2SvPushClickResponse.error_code);
    }

    public final int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.verify_ticket;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.error_code;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Check2SvPushClickResponse(result=");
        LIZ.append(this.result);
        LIZ.append(", verify_ticket=");
        LIZ.append(this.verify_ticket);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", error_code=");
        return s0.LIZJ(LIZ, this.error_code, ')', LIZ);
    }

    public Check2SvPushClickResponse(String str, String str2, String str3, Integer num) {
        this.result = str;
        this.verify_ticket = str2;
        this.description = str3;
        this.error_code = num;
    }

    public /* synthetic */ Check2SvPushClickResponse(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}
