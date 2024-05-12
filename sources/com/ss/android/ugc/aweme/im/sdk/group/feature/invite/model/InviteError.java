package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InviteError {

    @InterfaceC65349Pkn("error_code")
    public Integer errorCode;

    @InterfaceC65349Pkn("error_message")
    public String errorMessage;

    @InterfaceC65349Pkn("error_title")
    public String errorTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteError() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteError)) {
            return false;
        }
        InviteError inviteError = (InviteError) obj;
        return o.LJ(this.errorCode, inviteError.errorCode) && o.LJ(this.errorTitle, inviteError.errorTitle) && o.LJ(this.errorMessage, inviteError.errorMessage);
    }

    public final int hashCode() {
        Integer num = this.errorCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean LIZ() {
        Integer num = this.errorCode;
        if (num == null || num.intValue() != 7824) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ() {
        Integer num = this.errorCode;
        if (num == null || num.intValue() != 7823) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InviteError(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorTitle=");
        LIZ.append(this.errorTitle);
        LIZ.append(", errorMessage=");
        return q.LIZIZ(LIZ, this.errorMessage, ')', LIZ);
    }

    public InviteError(Integer num, String str, String str2) {
        this.errorCode = num;
        this.errorTitle = str;
        this.errorMessage = str2;
    }

    public /* synthetic */ InviteError(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
