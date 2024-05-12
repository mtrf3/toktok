package com.google.android.gms.common.internal;

import X.C67851Qk3;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C67851Qk3();
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zza);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zze);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
