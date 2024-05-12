package com.google.android.gms.internal.wallet;

import X.C68718Qy2;
import X.C79057V0z;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C68718Qy2();
    public final PendingIntent LJLIL;

    public zzo(PendingIntent pendingIntent) {
        this.LJLIL = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.LJLIL, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
