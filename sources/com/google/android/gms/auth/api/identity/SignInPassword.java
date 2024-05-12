package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C68355QsB;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new C68355QsB();
    public final String zba;
    public final String zbb;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!C64363PNv.LIZ(this.zba, signInPassword.zba) || !C64363PNv.LIZ(this.zbb, signInPassword.zbb)) {
            return false;
        }
        return true;
    }

    public SignInPassword(String str, String str2) {
        QH7.LJIIIZ(str, "Account identifier cannot be null");
        String trim = str.trim();
        QH7.LJFF("Account identifier cannot be empty", trim);
        this.zba = trim;
        QH7.LJI(str2);
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zba, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
