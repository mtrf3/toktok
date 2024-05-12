package com.google.android.gms.wallet.callback;

import X.C79057V0z;
import X.R3O;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class PaymentDataRequestUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequestUpdate> CREATOR = new R3O();
    public String zza;
    public Bundle zzb;

    public PaymentDataRequestUpdate(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        C79057V0z.LJJLI(parcel, 2, this.zzb);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
