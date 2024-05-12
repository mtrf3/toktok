package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C67683QhL;
import X.C79057V0z;
import X.QH7;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C67683QhL();
    public final String zba;
    public final String zbb;
    public final String zbc;
    public final String zbd;
    public final Uri zbe;
    public final String zbf;
    public final String zbg;
    public final String zbh;
    public final PublicKeyCredential zbi;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!C64363PNv.LIZ(this.zba, signInCredential.zba) || !C64363PNv.LIZ(this.zbb, signInCredential.zbb) || !C64363PNv.LIZ(this.zbc, signInCredential.zbc) || !C64363PNv.LIZ(this.zbd, signInCredential.zbd) || !C64363PNv.LIZ(this.zbe, signInCredential.zbe) || !C64363PNv.LIZ(this.zbf, signInCredential.zbf) || !C64363PNv.LIZ(this.zbg, signInCredential.zbg) || !C64363PNv.LIZ(this.zbh, signInCredential.zbh) || !C64363PNv.LIZ(this.zbi, signInCredential.zbi)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zba, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zbc, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zbd, false);
        C79057V0z.LJJZZI(parcel, 5, this.zbe, i, false);
        C79057V0z.LJJZZIII(parcel, 6, this.zbf, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zbg, false);
        C79057V0z.LJJZZIII(parcel, 8, this.zbh, false);
        C79057V0z.LJJZZI(parcel, 9, this.zbi, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        QH7.LJI(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
        this.zbi = publicKeyCredential;
    }
}
