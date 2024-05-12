package com.google.android.gms.common.internal;

import X.C67846Qjy;
import X.C79057V0z;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C67846Qjy();
    public final int LJLIL;
    public final Account zab;
    public final int zac;
    public final GoogleSignInAccount zad;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 2, this.zab, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zac);
        C79057V0z.LJJZZI(parcel, 4, this.zad, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.LJLIL = i;
        this.zab = account;
        this.zac = i2;
        this.zad = googleSignInAccount;
    }
}
