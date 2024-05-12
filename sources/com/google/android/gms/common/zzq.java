package com.google.android.gms.common;

import X.C1FP;
import X.C68441QtZ;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C68441QtZ();
    public final boolean zza;
    public final String zzb;
    public final int zzc;

    public final int LJJJJL() {
        return C1FP.LJJI(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 1, this.zza);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzq(boolean z, String str, int i) {
        this.zza = z;
        this.zzb = str;
        this.zzc = C1FP.LJJI(i) - 1;
    }
}
