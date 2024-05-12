package com.google.android.gms.maps.model;

import X.AbstractBinderC68227Qq7;
import X.C68771Qyt;
import X.C68772Qyu;
import X.C79057V0z;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new C68771Qyt();
    public LatLng zza;
    public String zzb;
    public String zzc;
    public C68772Qyu zzd;
    public float zze;
    public float zzf;
    public boolean zzg;
    public boolean zzh;
    public boolean zzi;
    public float zzj;
    public float zzk;
    public float zzl;
    public float zzm;
    public float zzn;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzk = 0.5f;
        this.zzm = 1.0f;
    }

    public final void LJJJJL(LatLng latLng) {
        if (latLng != null) {
            this.zza = latLng;
            return;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C68772Qyu c68772Qyu = this.zzd;
        if (c68772Qyu == null) {
            asBinder = null;
        } else {
            asBinder = c68772Qyu.LIZ.asBinder();
        }
        C79057V0z.LJJLIIIJLJLI(parcel, 5, asBinder);
        C79057V0z.LJJLIIIJJIZ(parcel, 6, this.zze);
        C79057V0z.LJJLIIIJJIZ(parcel, 7, this.zzf);
        C79057V0z.LJJJZ(parcel, 8, this.zzg);
        C79057V0z.LJJJZ(parcel, 9, this.zzh);
        C79057V0z.LJJJZ(parcel, 10, this.zzi);
        C79057V0z.LJJLIIIJJIZ(parcel, 11, this.zzj);
        C79057V0z.LJJLIIIJJIZ(parcel, 12, this.zzk);
        C79057V0z.LJJLIIIJJIZ(parcel, 13, this.zzl);
        C79057V0z.LJJLIIIJJIZ(parcel, 14, this.zzm);
        C79057V0z.LJJLIIIJJIZ(parcel, 15, this.zzn);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzk = 0.5f;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new C68772Qyu(AbstractBinderC68227Qq7.LLJI(iBinder));
        }
        this.zze = f;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = f5;
        this.zzm = f6;
        this.zzn = f7;
    }
}
