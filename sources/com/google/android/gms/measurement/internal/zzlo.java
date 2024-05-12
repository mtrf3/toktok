package com.google.android.gms.measurement.internal;

import X.C68101Qo5;
import X.C68135Qod;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzlo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlo> CREATOR = new C68101Qo5();
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    public final Object LJJJJL() {
        Long l = this.zzd;
        if (l != null) {
            return l;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzlo(C68135Qod c68135Qod) {
        this(c68135Qod.LIZLLL, c68135Qod.LJ, c68135Qod.LIZJ, c68135Qod.LIZIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C68101Qo5.LIZ(this, parcel);
    }

    public zzlo(long j, Object obj, String str, String str2) {
        QH7.LJI(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public zzlo(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        Double d2;
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            } else {
                d2 = null;
            }
            this.zzg = d2;
        } else {
            this.zzg = d;
        }
        this.zze = str2;
        this.zzf = str3;
    }
}
