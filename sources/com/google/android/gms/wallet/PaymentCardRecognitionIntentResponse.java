package com.google.android.gms.wallet;

import X.C68719Qy3;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new C68719Qy3();
    public PendingIntent zza;

    public PaymentCardRecognitionIntentResponse() {
    }

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zza, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
