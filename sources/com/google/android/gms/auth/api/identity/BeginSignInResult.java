package com.google.android.gms.auth.api.identity;

import X.C67668Qh6;
import X.C79057V0z;
import X.QH7;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C67668Qh6();
    public final PendingIntent zba;

    public BeginSignInResult(PendingIntent pendingIntent) {
        QH7.LJIIIIZZ(pendingIntent);
        this.zba = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zba, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
