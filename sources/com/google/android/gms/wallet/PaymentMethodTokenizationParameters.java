package com.google.android.gms.wallet;

import X.C68707Qxr;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new C68707Qxr();
    public final Bundle LJLIL;
    public int zza;

    public PaymentMethodTokenizationParameters() {
        this.LJLIL = new Bundle();
    }

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.LJLIL = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza);
        C79057V0z.LJJLI(parcel, 3, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
