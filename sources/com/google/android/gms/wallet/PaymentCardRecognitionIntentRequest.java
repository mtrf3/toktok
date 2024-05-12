package com.google.android.gms.wallet;

import X.C79057V0z;
import X.YK2;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new YK2();
    public final int LJLIL;

    public PaymentCardRecognitionIntentRequest() {
    }

    public PaymentCardRecognitionIntentRequest(int i) {
        this.LJLIL = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
