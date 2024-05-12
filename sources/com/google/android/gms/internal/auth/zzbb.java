package com.google.android.gms.internal.auth;

import X.C68751QyZ;
import X.C79057V0z;
import X.QH7;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new C68751QyZ();
    public final int LJLIL = 1;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(PendingIntent pendingIntent, String str) {
        QH7.LJIIIIZZ(str);
        this.zzb = str;
        QH7.LJIIIIZZ(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzc, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
