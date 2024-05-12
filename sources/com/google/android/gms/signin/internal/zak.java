package com.google.android.gms.signin.internal;

import X.C67845Qjx;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* loaded from: classes12.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C67845Qjx();
    public final int LJLIL;
    public final ConnectionResult zab;
    public final zav zac;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 2, this.zab, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zac, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.LJLIL = i;
        this.zab = connectionResult;
        this.zac = zavVar;
    }
}
