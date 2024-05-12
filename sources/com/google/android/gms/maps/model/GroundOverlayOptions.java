package com.google.android.gms.maps.model;

import X.AbstractBinderC68227Qq7;
import X.C68772Qyu;
import X.C68773Qyv;
import X.C79057V0z;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new C68773Qyv();
    public C68772Qyu zza;
    public LatLng zzb;
    public float zzc;
    public float zzd;
    public LatLngBounds zze;
    public float zzf;
    public float zzg;
    public boolean zzh;
    public float zzi;
    public float zzj;
    public float zzk;
    public boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLJLI(parcel, 2, this.zza.LIZ.asBinder());
        C79057V0z.LJJZZI(parcel, 3, this.zzb, i, false);
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.zzc);
        C79057V0z.LJJLIIIJJIZ(parcel, 5, this.zzd);
        C79057V0z.LJJZZI(parcel, 6, this.zze, i, false);
        C79057V0z.LJJLIIIJJIZ(parcel, 7, this.zzf);
        C79057V0z.LJJLIIIJJIZ(parcel, 8, this.zzg);
        C79057V0z.LJJJZ(parcel, 9, this.zzh);
        C79057V0z.LJJLIIIJJIZ(parcel, 10, this.zzi);
        C79057V0z.LJJLIIIJJIZ(parcel, 11, this.zzj);
        C79057V0z.LJJLIIIJJIZ(parcel, 12, this.zzk);
        C79057V0z.LJJJZ(parcel, 13, this.zzl);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzh = true;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zza = new C68772Qyu(AbstractBinderC68227Qq7.LLJI(iBinder));
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        this.zze = latLngBounds;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = z;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = z2;
    }
}
