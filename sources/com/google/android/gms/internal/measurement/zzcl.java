package com.google.android.gms.internal.measurement;

import X.C68040Qn6;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C68040Qn6();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLJLI(parcel, 1, this.zza);
        C79057V0z.LJJLJLI(parcel, 2, this.zzb);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJZZIII(parcel, 4, this.zzd, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zze, false);
        C79057V0z.LJJZZIII(parcel, 6, this.zzf, false);
        C79057V0z.LJJLI(parcel, 7, this.zzg);
        C79057V0z.LJJZZIII(parcel, 8, this.zzh, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }
}
