package com.google.android.gms.auth.api.signin.internal;

import X.C67702Qhe;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C67702Qhe();
    public final int LJLIL;
    public int zab;
    public Bundle zac;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zab);
        C79057V0z.LJJLI(parcel, 3, this.zac);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.LJLIL = i;
        this.zab = i2;
        this.zac = bundle;
    }
}
