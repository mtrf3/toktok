package com.ss.android.ugc.aweme.account.login.twostep;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerifyWays implements Serializable {

    @InterfaceC65349Pkn("email")
    public final String email;

    @InterfaceC65349Pkn("is_available")
    public final Boolean isAvailable;

    @InterfaceC65349Pkn("mobile")
    public final String mobile;

    @InterfaceC65349Pkn("password")
    public final String password;

    @InterfaceC65349Pkn("verify_way")
    public final String verify_way;

    public static /* synthetic */ TwoStepVerifyWays copy$default(TwoStepVerifyWays twoStepVerifyWays, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twoStepVerifyWays.verify_way;
        }
        if ((i & 2) != 0) {
            str2 = twoStepVerifyWays.mobile;
        }
        if ((i & 4) != 0) {
            str3 = twoStepVerifyWays.email;
        }
        if ((i & 8) != 0) {
            str4 = twoStepVerifyWays.password;
        }
        if ((i & 16) != 0) {
            bool = twoStepVerifyWays.isAvailable;
        }
        return twoStepVerifyWays.copy(str, str2, str3, str4, bool);
    }

    public final TwoStepVerifyWays copy(String str, String str2, String str3, String str4, Boolean bool) {
        return new TwoStepVerifyWays(str, str2, str3, str4, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwoStepVerifyWays)) {
            return false;
        }
        TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) obj;
        return o.LJ(this.verify_way, twoStepVerifyWays.verify_way) && o.LJ(this.mobile, twoStepVerifyWays.mobile) && o.LJ(this.email, twoStepVerifyWays.email) && o.LJ(this.password, twoStepVerifyWays.password) && o.LJ(this.isAvailable, twoStepVerifyWays.isAvailable);
    }

    public int hashCode() {
        String str = this.verify_way;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mobile;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.password;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isAvailable;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwoStepVerifyWays(verify_way=");
        LIZ.append(this.verify_way);
        LIZ.append(", mobile=");
        LIZ.append(this.mobile);
        LIZ.append(", email=");
        LIZ.append(this.email);
        LIZ.append(", password=");
        LIZ.append(this.password);
        LIZ.append(", isAvailable=");
        return C78920UyC.LIZIZ(LIZ, this.isAvailable, ')', LIZ);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getVerify_way() {
        return this.verify_way;
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public TwoStepVerifyWays(String str, String str2, String str3, String str4, Boolean bool) {
        this.verify_way = str;
        this.mobile = str2;
        this.email = str3;
        this.password = str4;
        this.isAvailable = bool;
    }

    public /* synthetic */ TwoStepVerifyWays(String str, String str2, String str3, String str4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? Boolean.FALSE : bool);
    }
}
