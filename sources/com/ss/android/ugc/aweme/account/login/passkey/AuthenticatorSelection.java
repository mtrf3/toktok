package com.ss.android.ugc.aweme.account.login.passkey;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AuthenticatorSelection {

    @InterfaceC65349Pkn("authenticatorAttachment")
    public final String authenticatorAttachment;

    @InterfaceC65349Pkn("residentKey")
    public final String residentKey;

    @InterfaceC65349Pkn("userVerification")
    public final String userVerification;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticatorSelection() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatorSelection)) {
            return false;
        }
        AuthenticatorSelection authenticatorSelection = (AuthenticatorSelection) obj;
        return o.LJ(this.authenticatorAttachment, authenticatorSelection.authenticatorAttachment) && o.LJ(this.residentKey, authenticatorSelection.residentKey) && o.LJ(this.userVerification, authenticatorSelection.userVerification);
    }

    public final int hashCode() {
        String str = this.authenticatorAttachment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.residentKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userVerification;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthenticatorSelection(authenticatorAttachment=");
        LIZ.append(this.authenticatorAttachment);
        LIZ.append(", residentKey=");
        LIZ.append(this.residentKey);
        LIZ.append(", userVerification=");
        return q.LIZIZ(LIZ, this.userVerification, ')', LIZ);
    }

    public AuthenticatorSelection(String str, String str2, String str3) {
        this.authenticatorAttachment = str;
        this.residentKey = str2;
        this.userVerification = str3;
    }

    public /* synthetic */ AuthenticatorSelection(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
