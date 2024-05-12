package com.google.android.gms.maps;

import X.C64362PNu;
import X.C68790QzC;
import X.C78946Uyc;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* loaded from: classes12.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C68790QzC();
    public StreetViewPanoramaCamera zza;
    public String zzb;
    public LatLng zzc;
    public Integer zzd;
    public Boolean zze;
    public Boolean zzf;
    public Boolean zzg;
    public Boolean zzh;
    public Boolean zzi;
    public StreetViewSource zzj;

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.zzb, "PanoramaId");
        c64362PNu.LIZ(this.zzc, "Position");
        c64362PNu.LIZ(this.zzd, "Radius");
        c64362PNu.LIZ(this.zzj, "Source");
        c64362PNu.LIZ(this.zza, "StreetViewPanoramaCamera");
        c64362PNu.LIZ(this.zze, "UserNavigationEnabled");
        c64362PNu.LIZ(this.zzf, "ZoomGesturesEnabled");
        c64362PNu.LIZ(this.zzg, "PanningGesturesEnabled");
        c64362PNu.LIZ(this.zzh, "StreetNamesEnabled");
        c64362PNu.LIZ(this.zzi, "UseViewLifecycleInFragment");
        return c64362PNu.toString();
    }

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzc, i, false);
        C79057V0z.LJJLJ(parcel, 5, this.zzd);
        C79057V0z.LJJLIIIIJ(parcel, 6, C78946Uyc.LJJIJLIJ(this.zze));
        C79057V0z.LJJLIIIIJ(parcel, 7, C78946Uyc.LJJIJLIJ(this.zzf));
        C79057V0z.LJJLIIIIJ(parcel, 8, C78946Uyc.LJJIJLIJ(this.zzg));
        C79057V0z.LJJLIIIIJ(parcel, 9, C78946Uyc.LJJIJLIJ(this.zzh));
        C79057V0z.LJJLIIIIJ(parcel, 10, C78946Uyc.LJJIJLIJ(this.zzi));
        C79057V0z.LJJZZI(parcel, 11, this.zzj, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = C78946Uyc.LJJIL(b);
        this.zzf = C78946Uyc.LJJIL(b2);
        this.zzg = C78946Uyc.LJJIL(b3);
        this.zzh = C78946Uyc.LJJIL(b4);
        this.zzi = C78946Uyc.LJJIL(b5);
        this.zzj = streetViewSource;
    }
}
