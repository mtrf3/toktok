package com.google.android.gms.measurement.internal;

import X.C68075Qnf;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C68075Qnf();
    public String zza;
    public String zzb;
    public zzlo zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzaw zzg;
    public long zzh;
    public zzaw zzi;
    public final long zzj;
    public final zzaw zzk;

    public zzac(zzac zzacVar) {
        QH7.LJIIIIZZ(zzacVar);
        this.zza = zzacVar.zza;
        this.zzb = zzacVar.zzb;
        this.zzc = zzacVar.zzc;
        this.zzd = zzacVar.zzd;
        this.zze = zzacVar.zze;
        this.zzf = zzacVar.zzf;
        this.zzg = zzacVar.zzg;
        this.zzh = zzacVar.zzh;
        this.zzi = zzacVar.zzi;
        this.zzj = zzacVar.zzj;
        this.zzk = zzacVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzc, i, false);
        C79057V0z.LJJLJLI(parcel, 5, this.zzd);
        C79057V0z.LJJJZ(parcel, 6, this.zze);
        C79057V0z.LJJZZIII(parcel, 7, this.zzf, false);
        C79057V0z.LJJZZI(parcel, 8, this.zzg, i, false);
        C79057V0z.LJJLJLI(parcel, 9, this.zzh);
        C79057V0z.LJJZZI(parcel, 10, this.zzi, i, false);
        C79057V0z.LJJLJLI(parcel, 11, this.zzj);
        C79057V0z.LJJZZI(parcel, 12, this.zzk, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzac(String str, String str2, zzlo zzloVar, long j, boolean z, String str3, zzaw zzawVar, long j2, zzaw zzawVar2, long j3, zzaw zzawVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzloVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzawVar;
        this.zzh = j2;
        this.zzi = zzawVar2;
        this.zzj = j3;
        this.zzk = zzawVar3;
    }
}
