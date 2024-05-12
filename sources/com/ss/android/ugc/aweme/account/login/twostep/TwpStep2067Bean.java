package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TwpStep2067Bean implements Serializable {

    @InterfaceC65349Pkn("profile_key")
    public final String profile_key;

    @InterfaceC65349Pkn("sms_code_key")
    public final String sms_code_key;

    @InterfaceC65349Pkn("verify_ticket")
    public final String verify_ticket;

    public static /* synthetic */ TwpStep2067Bean copy$default(TwpStep2067Bean twpStep2067Bean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twpStep2067Bean.verify_ticket;
        }
        if ((i & 2) != 0) {
            str2 = twpStep2067Bean.sms_code_key;
        }
        if ((i & 4) != 0) {
            str3 = twpStep2067Bean.profile_key;
        }
        return twpStep2067Bean.copy(str, str2, str3);
    }

    public final TwpStep2067Bean copy(String str, String str2, String str3) {
        return new TwpStep2067Bean(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwpStep2067Bean)) {
            return false;
        }
        TwpStep2067Bean twpStep2067Bean = (TwpStep2067Bean) obj;
        return o.LJ(this.verify_ticket, twpStep2067Bean.verify_ticket) && o.LJ(this.sms_code_key, twpStep2067Bean.sms_code_key) && o.LJ(this.profile_key, twpStep2067Bean.profile_key);
    }

    public int hashCode() {
        String str = this.verify_ticket;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sms_code_key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profile_key;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwpStep2067Bean(verify_ticket=");
        LIZ.append(this.verify_ticket);
        LIZ.append(", sms_code_key=");
        LIZ.append(this.sms_code_key);
        LIZ.append(", profile_key=");
        return q.LIZIZ(LIZ, this.profile_key, ')', LIZ);
    }

    public final String getProfile_key() {
        return this.profile_key;
    }

    public final String getSms_code_key() {
        return this.sms_code_key;
    }

    public final String getVerify_ticket() {
        return this.verify_ticket;
    }

    public TwpStep2067Bean(String str, String str2, String str3) {
        this.verify_ticket = str;
        this.sms_code_key = str2;
        this.profile_key = str3;
    }
}
