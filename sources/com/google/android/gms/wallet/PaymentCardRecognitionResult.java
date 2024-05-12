package com.google.android.gms.wallet;

import X.C79057V0z;
import X.YP5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new YP5();
    public String zza;
    public CreditCardExpirationDate zzb;

    public PaymentCardRecognitionResult() {
    }

    public PaymentCardRecognitionResult(String str, CreditCardExpirationDate creditCardExpirationDate) {
        this.zza = str;
        this.zzb = creditCardExpirationDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        C79057V0z.LJJZZI(parcel, 2, this.zzb, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
