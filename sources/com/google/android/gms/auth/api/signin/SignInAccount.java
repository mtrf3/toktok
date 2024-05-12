package com.google.android.gms.auth.api.signin;

import X.C67694QhW;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C67694QhW();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final GoogleSignInAccount zbc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 4, this.LJLIL, false);
        C79057V0z.LJJZZI(parcel, 7, this.zbc, i, false);
        C79057V0z.LJJZZIII(parcel, 8, this.LJLILLLLZI, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        QH7.LJFF("8.3 and 8.4 SDKs require non-null email", str);
        this.LJLIL = str;
        QH7.LJFF("8.3 and 8.4 SDKs require non-null userId", str2);
        this.LJLILLLLZI = str2;
    }
}
