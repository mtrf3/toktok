package com.ss.android.ugc.aweme.account.login.passkey;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PassKeyRegistrationRequest {

    @InterfaceC65349Pkn("attestation")
    public final String attestation;

    @InterfaceC65349Pkn("authenticatorSelection")
    public final AuthenticatorSelection authenticatorSelection;

    @InterfaceC65349Pkn("challenge")
    public final String challenge;

    @InterfaceC65349Pkn("excludeCredentials")
    public final List<Object> excludeCredentials;

    @InterfaceC65349Pkn("pubKeyCredParams")
    public final List<Object> pubKeyCredParams;

    @InterfaceC65349Pkn("rp")
    public final RelyingParty rp;

    @InterfaceC65349Pkn("user")
    public final UserData user;

    @InterfaceC65349Pkn("user_exists")
    public final boolean userExists;

    @InterfaceC65349Pkn("webauthn_ticket")
    public final String webauthnTicket;

    /* JADX WARN: Multi-variable type inference failed */
    public PassKeyRegistrationRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassKeyRegistrationRequest)) {
            return false;
        }
        PassKeyRegistrationRequest passKeyRegistrationRequest = (PassKeyRegistrationRequest) obj;
        return o.LJ(this.challenge, passKeyRegistrationRequest.challenge) && o.LJ(this.rp, passKeyRegistrationRequest.rp) && o.LJ(this.user, passKeyRegistrationRequest.user) && o.LJ(this.pubKeyCredParams, passKeyRegistrationRequest.pubKeyCredParams) && o.LJ(this.attestation, passKeyRegistrationRequest.attestation) && o.LJ(this.excludeCredentials, passKeyRegistrationRequest.excludeCredentials) && o.LJ(this.authenticatorSelection, passKeyRegistrationRequest.authenticatorSelection) && o.LJ(this.webauthnTicket, passKeyRegistrationRequest.webauthnTicket) && this.userExists == passKeyRegistrationRequest.userExists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.challenge;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        RelyingParty relyingParty = this.rp;
        if (relyingParty == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = relyingParty.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        UserData userData = this.user;
        if (userData == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = userData.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<Object> list = this.pubKeyCredParams;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.attestation;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<Object> list2 = this.excludeCredentials;
        if (list2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        AuthenticatorSelection authenticatorSelection = this.authenticatorSelection;
        if (authenticatorSelection != null) {
            i = authenticatorSelection.hashCode();
        }
        int LJ = C79062V1e.LJ(this.webauthnTicket, (i7 + i) * 31, 31);
        boolean z = this.userExists;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        return LJ + i8;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PassKeyRegistrationRequest(challenge=");
        LIZ.append(this.challenge);
        LIZ.append(", rp=");
        LIZ.append(this.rp);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", pubKeyCredParams=");
        LIZ.append(this.pubKeyCredParams);
        LIZ.append(", attestation=");
        LIZ.append(this.attestation);
        LIZ.append(", excludeCredentials=");
        LIZ.append(this.excludeCredentials);
        LIZ.append(", authenticatorSelection=");
        LIZ.append(this.authenticatorSelection);
        LIZ.append(", webauthnTicket=");
        LIZ.append(this.webauthnTicket);
        LIZ.append(", userExists=");
        return C48339Iy7.LIZJ(LIZ, this.userExists, ')', LIZ);
    }

    public PassKeyRegistrationRequest(String str, RelyingParty relyingParty, UserData userData, List<Object> list, String str2, List<Object> list2, AuthenticatorSelection authenticatorSelection, String webauthnTicket, boolean z) {
        o.LJIIIZ(webauthnTicket, "webauthnTicket");
        this.challenge = str;
        this.rp = relyingParty;
        this.user = userData;
        this.pubKeyCredParams = list;
        this.attestation = str2;
        this.excludeCredentials = list2;
        this.authenticatorSelection = authenticatorSelection;
        this.webauthnTicket = webauthnTicket;
        this.userExists = z;
    }

    public /* synthetic */ PassKeyRegistrationRequest(String str, RelyingParty relyingParty, UserData userData, List list, String str2, List list2, AuthenticatorSelection authenticatorSelection, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : relyingParty, (i & 4) != 0 ? null : userData, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list2, (i & 64) == 0 ? authenticatorSelection : null, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? false : z);
    }
}
