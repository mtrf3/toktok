package com.ss.android.ugc.aweme.account.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SafeEnvData {

    @InterfaceC65349Pkn("captcha")
    public final String captcha;

    @InterfaceC65349Pkn("desc_url")
    public final String desc_url;

    @InterfaceC65349Pkn("eligible_verification_methods")
    public final List<VerificationMethod> eligibleVerificationMethods;

    @InterfaceC65349Pkn("error_code")
    public final int errorCode;

    @InterfaceC65349Pkn("description")
    public final String errorDescription;

    @InterfaceC65349Pkn("passport_ticket")
    public final String passportTicket;

    @InterfaceC65349Pkn("safe")
    public final boolean safe;

    @InterfaceC65349Pkn("two_step_verify_ways")
    public final List<TwoStepVerifyWays> twoStepVerifyWays;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeEnvData)) {
            return false;
        }
        SafeEnvData safeEnvData = (SafeEnvData) obj;
        return o.LJ(this.captcha, safeEnvData.captcha) && o.LJ(this.errorDescription, safeEnvData.errorDescription) && o.LJ(this.desc_url, safeEnvData.desc_url) && this.errorCode == safeEnvData.errorCode && this.safe == safeEnvData.safe && o.LJ(this.passportTicket, safeEnvData.passportTicket) && o.LJ(this.eligibleVerificationMethods, safeEnvData.eligibleVerificationMethods) && o.LJ(this.twoStepVerifyWays, safeEnvData.twoStepVerifyWays);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.captcha;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc_url;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.errorCode) * 31;
        boolean z = this.safe;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str4 = this.passportTicket;
        int hashCode4 = (i2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<VerificationMethod> list = this.eligibleVerificationMethods;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<TwoStepVerifyWays> list2 = this.twoStepVerifyWays;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeEnvData(captcha=");
        LIZ.append(this.captcha);
        LIZ.append(", errorDescription=");
        LIZ.append(this.errorDescription);
        LIZ.append(", desc_url=");
        LIZ.append(this.desc_url);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", safe=");
        LIZ.append(this.safe);
        LIZ.append(", passportTicket=");
        LIZ.append(this.passportTicket);
        LIZ.append(", eligibleVerificationMethods=");
        LIZ.append(this.eligibleVerificationMethods);
        LIZ.append(", twoStepVerifyWays=");
        return C1NE.LIZIZ(LIZ, this.twoStepVerifyWays, ')', LIZ);
    }

    public SafeEnvData(String str, String str2, String str3, int i, boolean z, String str4, List<VerificationMethod> list, List<TwoStepVerifyWays> list2) {
        this.captcha = str;
        this.errorDescription = str2;
        this.desc_url = str3;
        this.errorCode = i;
        this.safe = z;
        this.passportTicket = str4;
        this.eligibleVerificationMethods = list;
        this.twoStepVerifyWays = list2;
    }

    public SafeEnvData(String str, String str2, String str3, int i, boolean z, String str4, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, i, z, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? C61878OQg.INSTANCE : list, (i2 & 128) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
