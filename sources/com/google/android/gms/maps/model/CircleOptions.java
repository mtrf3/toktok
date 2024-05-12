package com.google.android.gms.maps.model;

import X.C68782Qz4;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes12.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new C68782Qz4();
    public LatLng zza;
    public double zzb;
    public float zzc;
    public int zzd;
    public int zze;
    public float zzf;
    public boolean zzg;
    public boolean zzh;
    public List zzi;

    public CircleOptions() {
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zzg = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.zzc);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zzd);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zze);
        C79057V0z.LJJLIIIJJIZ(parcel, 7, this.zzf);
        C79057V0z.LJJJZ(parcel, 8, this.zzg);
        C79057V0z.LJJJZ(parcel, 9, this.zzh);
        C79057V0z.LJLIIL(parcel, 10, this.zzi, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.zza = latLng;
        this.zzb = d;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list;
    }
}
