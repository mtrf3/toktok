package com.google.android.gms.wallet;

import X.C79057V0z;
import X.YP4;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class CreditCardExpirationDate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new YP4();
    public int zza;
    public int zzb;

    public CreditCardExpirationDate() {
    }

    public CreditCardExpirationDate(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zza);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
