package com.google.android.gms.internal.auth;

import X.C79057V0z;
import X.QH7;
import X.YP7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new YP7();
    public final int LJLIL = 1;
    public final String zzb;
    public final int zzc;

    public zzav(String str, int i) {
        QH7.LJIIIIZZ(str);
        this.zzb = str;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}