package X;

import android.os.Bundle;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.OSy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61948OSy extends AbstractC45836Hyq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public C61948OSy() {
        this(null, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61948OSy)) {
            return false;
        }
        C61948OSy c61948OSy = (C61948OSy) obj;
        return o.LJ(this.LIZ, c61948OSy.LIZ) && o.LJ(this.LIZIZ, c61948OSy.LIZIZ) && o.LJ(this.LIZJ, c61948OSy.LIZJ) && o.LJ(this.LIZLLL, c61948OSy.LIZLLL) && o.LJ(this.LJ, c61948OSy.LJ) && o.LJ(this.LJFF, c61948OSy.LJFF);
    }

    @Override // X.AbstractC45836Hyq
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthResponse(authCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", state=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", grantedPermissions=");
        LIZ.append(this.LIZJ);
        LIZ.append(", error=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", errorDescription=");
        LIZ.append(this.LJ);
        LIZ.append(", redirectUrl=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    @Override // X.AbstractC45836Hyq
    public final void toBundle(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        super.toBundle(bundle);
        bundle.putString("_bytedance_params_authcode", this.LIZ);
        bundle.putString("_bytedance_params_state", this.LIZIZ);
        bundle.putString("_bytedance_params_granted_permission", this.LIZJ);
        bundle.putString("_bytedance_params_auth_error", this.LIZLLL);
        bundle.putString("_bytedance_params_auth_error_description", this.LJ);
    }

    public C61948OSy(String authCode, String str, String str2, String str3, String str4, String str5, int i) {
        authCode = (i & 1) != 0 ? "" : authCode;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        str4 = (i & 16) != 0 ? null : str4;
        str5 = (i & 32) != 0 ? null : str5;
        o.LJIIIZ(authCode, "authCode");
        this.LIZ = authCode;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
