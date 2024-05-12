package com.google.android.gms.auth.api.accounttransfer;

import X.C67322QbW;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new C67322QbW();
    public final int LJLIL;
    public boolean zzb;
    public long zzc;
    public final boolean zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJLJLI(parcel, 3, this.zzc);
        C79057V0z.LJJJZ(parcel, 4, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.LJLIL = i;
        this.zzb = z;
        this.zzc = j;
        this.zzd = z2;
    }
}
