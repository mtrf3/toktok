package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AuthInfoResponseData {
    public final String LIZ;

    @InterfaceC65349Pkn("can_skip_confirm")
    public final boolean canSkipConfirm;

    @InterfaceC65349Pkn("client_name")
    public final String clientName;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthInfoResponseData() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInfoResponseData)) {
            return false;
        }
        AuthInfoResponseData authInfoResponseData = (AuthInfoResponseData) obj;
        return this.canSkipConfirm == authInfoResponseData.canSkipConfirm && o.LJ(this.clientName, authInfoResponseData.clientName) && this.errorCode == authInfoResponseData.errorCode && o.LJ(this.description, authInfoResponseData.description) && o.LJ(this.LIZ, authInfoResponseData.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public final int hashCode() {
        boolean z = this.canSkipConfirm;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.clientName;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.errorCode) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthInfoResponseData(canSkipConfirm=");
        LIZ.append(this.canSkipConfirm);
        LIZ.append(", clientName=");
        LIZ.append(this.clientName);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", detailErrorMsg=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public AuthInfoResponseData(boolean z, String str, int i, String str2, String str3) {
        this.canSkipConfirm = z;
        this.clientName = str;
        this.errorCode = i;
        this.description = str2;
        this.LIZ = str3;
    }

    public /* synthetic */ AuthInfoResponseData(boolean z, String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) == 0 ? i : 0, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? str3 : null);
    }
}
