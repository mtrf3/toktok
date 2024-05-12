package com.google.android.gms.common.internal;

import X.C67841Qjt;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C67841Qjt();
    public final RootTelemetryConfiguration zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int[] zzd;
    public final int zze;
    public final int[] zzf;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 1, this.zza, i, false);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIJ(parcel, 4, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zze);
        C79057V0z.LJJLIIJ(parcel, 6, this.zzf);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
