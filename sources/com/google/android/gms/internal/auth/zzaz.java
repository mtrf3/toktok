package com.google.android.gms.internal.auth;

import X.C79057V0z;
import X.QH7;
import X.R3M;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new R3M();
    public final int LJLIL = 1;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(String str, byte[] bArr) {
        QH7.LJIIIIZZ(str);
        this.zzb = str;
        QH7.LJIIIIZZ(bArr);
        this.zzc = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJLIIIJ(parcel, 3, this.zzc, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
