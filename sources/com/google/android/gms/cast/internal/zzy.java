package com.google.android.gms.cast.internal;

import X.C79057V0z;
import X.C90468Zey;
import X.C90477Zf7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzar;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes29.dex */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzy> CREATOR = new C90477Zf7();
    public double zza;
    public boolean zzb;
    public int zzc;
    public ApplicationMetadata zzd;
    public int zze;
    public zzar zzf;
    public double zzg;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.zza), Boolean.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, Integer.valueOf(this.zze), this.zzf, Double.valueOf(this.zzg)});
    }

    public zzy() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzy)) {
            return false;
        }
        zzy zzyVar = (zzy) obj;
        if (this.zza == zzyVar.zza && this.zzb == zzyVar.zzb && this.zzc == zzyVar.zzc && C90468Zey.LJFF(this.zzd, zzyVar.zzd) && this.zze == zzyVar.zze) {
            zzar zzarVar = this.zzf;
            if (C90468Zey.LJFF(zzarVar, zzarVar) && this.zzg == zzyVar.zzg) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 2, this.zza);
        C79057V0z.LJJJZ(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJJZZI(parcel, 5, this.zzd, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zze);
        C79057V0z.LJJZZI(parcel, 7, this.zzf, i, false);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 8, this.zzg);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzy(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, zzar zzarVar, double d2) {
        this.zza = d;
        this.zzb = z;
        this.zzc = i;
        this.zzd = applicationMetadata;
        this.zze = i2;
        this.zzf = zzarVar;
        this.zzg = d2;
    }
}
