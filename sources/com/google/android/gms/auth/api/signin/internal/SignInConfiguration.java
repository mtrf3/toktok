package com.google.android.gms.auth.api.signin.internal;

import X.C67698Qha;
import X.C67699Qhb;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C67698Qha();
    public final String zba;
    public final GoogleSignInOptions zbb;

    public final int hashCode() {
        C67699Qhb c67699Qhb = new C67699Qhb();
        c67699Qhb.LIZ(this.zba);
        c67699Qhb.LIZ(this.zbb);
        return c67699Qhb.LIZ;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.zba.equals(signInConfiguration.zba)) {
            GoogleSignInOptions googleSignInOptions = this.zbb;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.zbb;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        QH7.LJI(str);
        this.zba = str;
        this.zbb = googleSignInOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zba, false);
        C79057V0z.LJJZZI(parcel, 5, this.zbb, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
