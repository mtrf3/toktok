package com.google.android.gms.maps;

import X.C16880lQ;
import X.C64362PNu;
import X.C68789QzB;
import X.C68793QzF;
import X.C78946Uyc;
import X.C79057V0z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C68789QzB();
    public static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean zzb;
    public Boolean zzc;
    public int zzd;
    public CameraPosition zze;
    public Boolean zzf;
    public Boolean zzg;
    public Boolean zzh;
    public Boolean zzi;
    public Boolean zzj;
    public Boolean zzk;
    public Boolean zzl;
    public Boolean zzm;
    public Boolean zzn;
    public Float zzo;
    public Float zzp;
    public LatLngBounds zzq;
    public Boolean zzr;
    public Integer zzs;
    public String zzt;

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(Integer.valueOf(this.zzd), "MapType");
        c64362PNu.LIZ(this.zzl, "LiteMode");
        c64362PNu.LIZ(this.zze, "Camera");
        c64362PNu.LIZ(this.zzg, "CompassEnabled");
        c64362PNu.LIZ(this.zzf, "ZoomControlsEnabled");
        c64362PNu.LIZ(this.zzh, "ScrollGesturesEnabled");
        c64362PNu.LIZ(this.zzi, "ZoomGesturesEnabled");
        c64362PNu.LIZ(this.zzj, "TiltGesturesEnabled");
        c64362PNu.LIZ(this.zzk, "RotateGesturesEnabled");
        c64362PNu.LIZ(this.zzr, "ScrollGesturesEnabledDuringRotateOrZoom");
        c64362PNu.LIZ(this.zzm, "MapToolbarEnabled");
        c64362PNu.LIZ(this.zzn, "AmbientEnabled");
        c64362PNu.LIZ(this.zzo, "MinZoomPreference");
        c64362PNu.LIZ(this.zzp, "MaxZoomPreference");
        c64362PNu.LIZ(this.zzs, "BackgroundColor");
        c64362PNu.LIZ(this.zzq, "LatLngBoundsForCameraTarget");
        c64362PNu.LIZ(this.zzb, "ZOrderOnTop");
        c64362PNu.LIZ(this.zzc, "UseViewLifecycleInFragment");
        return c64362PNu.toString();
    }

    public GoogleMapOptions() {
        this.zzd = -1;
    }

    public static GoogleMapOptions LJJJJL(Context context, AttributeSet attributeSet) {
        Float f;
        Float f2;
        Float f3;
        Float f4;
        float f5;
        float f6;
        String LLLZLZ;
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.vu, R.attr.x9, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a19, R.attr.a1_, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.ap8, R.attr.az4, R.attr.az5, R.attr.bvc, R.attr.bvd, R.attr.bve, R.attr.bvf, R.attr.bvg, R.attr.bvi, R.attr.bvj, R.attr.bvk, R.attr.bw0, R.attr.by8});
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.zzd = obtainAttributes.getInt(15, -1);
        }
        if (obtainAttributes.hasValue(25)) {
            googleMapOptions.zzb = Boolean.valueOf(obtainAttributes.getBoolean(25, false));
        }
        if (obtainAttributes.hasValue(24)) {
            googleMapOptions.zzc = Boolean.valueOf(obtainAttributes.getBoolean(24, false));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.zzg = Boolean.valueOf(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.zzk = Boolean.valueOf(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.zzr = Boolean.valueOf(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.zzh = Boolean.valueOf(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.zzj = Boolean.valueOf(obtainAttributes.getBoolean(21, true));
        }
        if (obtainAttributes.hasValue(23)) {
            googleMapOptions.zzi = Boolean.valueOf(obtainAttributes.getBoolean(23, true));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.zzf = Boolean.valueOf(obtainAttributes.getBoolean(22, true));
        }
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.zzl = Boolean.valueOf(obtainAttributes.getBoolean(13, false));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.zzm = Boolean.valueOf(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.zzn = Boolean.valueOf(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.zzo = Float.valueOf(obtainAttributes.getFloat(4, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(4)) {
            googleMapOptions.zzp = Float.valueOf(obtainAttributes.getFloat(3, Float.POSITIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(1)) {
            googleMapOptions.zzs = Integer.valueOf(obtainAttributes.getColor(1, zza.intValue()));
        }
        if (obtainAttributes.hasValue(14) && (LLLZLZ = C16880lQ.LLLZLZ(obtainAttributes, 14)) != null && !LLLZLZ.isEmpty()) {
            googleMapOptions.zzt = LLLZLZ;
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.vu, R.attr.x9, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a19, R.attr.a1_, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.ap8, R.attr.az4, R.attr.az5, R.attr.bvc, R.attr.bvd, R.attr.bve, R.attr.bvf, R.attr.bvg, R.attr.bvi, R.attr.bvj, R.attr.bvk, R.attr.bw0, R.attr.by8});
        if (obtainAttributes2.hasValue(11)) {
            f = Float.valueOf(obtainAttributes2.getFloat(11, 0.0f));
        } else {
            f = null;
        }
        if (obtainAttributes2.hasValue(12)) {
            f2 = Float.valueOf(obtainAttributes2.getFloat(12, 0.0f));
        } else {
            f2 = null;
        }
        if (obtainAttributes2.hasValue(9)) {
            f3 = Float.valueOf(obtainAttributes2.getFloat(9, 0.0f));
        } else {
            f3 = null;
        }
        if (obtainAttributes2.hasValue(10)) {
            f4 = Float.valueOf(obtainAttributes2.getFloat(10, 0.0f));
        } else {
            f4 = null;
        }
        obtainAttributes2.recycle();
        if (f != null && f2 != null && f3 != null && f4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(f.floatValue(), f2.floatValue()), new LatLng(f3.floatValue(), f4.floatValue()));
        }
        googleMapOptions.zzq = latLngBounds;
        TypedArray obtainAttributes3 = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.vu, R.attr.x9, R.attr.a14, R.attr.a15, R.attr.a16, R.attr.a17, R.attr.a18, R.attr.a19, R.attr.a1_, R.attr.akr, R.attr.aks, R.attr.akt, R.attr.aku, R.attr.ap8, R.attr.az4, R.attr.az5, R.attr.bvc, R.attr.bvd, R.attr.bve, R.attr.bvf, R.attr.bvg, R.attr.bvi, R.attr.bvj, R.attr.bvk, R.attr.bw0, R.attr.by8});
        if (obtainAttributes3.hasValue(5)) {
            f5 = obtainAttributes3.getFloat(5, 0.0f);
        } else {
            f5 = 0.0f;
        }
        if (obtainAttributes3.hasValue(6)) {
            f6 = obtainAttributes3.getFloat(6, 0.0f);
        } else {
            f6 = 0.0f;
        }
        LatLng latLng = new LatLng(f5, f6);
        C68793QzF c68793QzF = new C68793QzF();
        c68793QzF.LIZ = latLng;
        if (obtainAttributes3.hasValue(8)) {
            c68793QzF.LIZIZ = obtainAttributes3.getFloat(8, 0.0f);
        }
        if (obtainAttributes3.hasValue(2)) {
            c68793QzF.LIZLLL = obtainAttributes3.getFloat(2, 0.0f);
        }
        if (obtainAttributes3.hasValue(7)) {
            c68793QzF.LIZJ = obtainAttributes3.getFloat(7, 0.0f);
        }
        obtainAttributes3.recycle();
        googleMapOptions.zze = new CameraPosition(c68793QzF.LIZ, c68793QzF.LIZIZ, c68793QzF.LIZJ, c68793QzF.LIZLLL);
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIIJ(parcel, 2, C78946Uyc.LJJIJLIJ(this.zzb));
        C79057V0z.LJJLIIIIJ(parcel, 3, C78946Uyc.LJJIJLIJ(this.zzc));
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzd);
        C79057V0z.LJJZZI(parcel, 5, this.zze, i, false);
        C79057V0z.LJJLIIIIJ(parcel, 6, C78946Uyc.LJJIJLIJ(this.zzf));
        C79057V0z.LJJLIIIIJ(parcel, 7, C78946Uyc.LJJIJLIJ(this.zzg));
        C79057V0z.LJJLIIIIJ(parcel, 8, C78946Uyc.LJJIJLIJ(this.zzh));
        C79057V0z.LJJLIIIIJ(parcel, 9, C78946Uyc.LJJIJLIJ(this.zzi));
        C79057V0z.LJJLIIIIJ(parcel, 10, C78946Uyc.LJJIJLIJ(this.zzj));
        C79057V0z.LJJLIIIIJ(parcel, 11, C78946Uyc.LJJIJLIJ(this.zzk));
        C79057V0z.LJJLIIIIJ(parcel, 12, C78946Uyc.LJJIJLIJ(this.zzl));
        C79057V0z.LJJLIIIIJ(parcel, 14, C78946Uyc.LJJIJLIJ(this.zzm));
        C79057V0z.LJJLIIIIJ(parcel, 15, C78946Uyc.LJJIJLIJ(this.zzn));
        C79057V0z.LJJLIIIJL(parcel, 16, this.zzo);
        C79057V0z.LJJLIIIJL(parcel, 17, this.zzp);
        C79057V0z.LJJZZI(parcel, 18, this.zzq, i, false);
        C79057V0z.LJJLIIIIJ(parcel, 19, C78946Uyc.LJJIJLIJ(this.zzr));
        C79057V0z.LJJLJ(parcel, 20, this.zzs);
        C79057V0z.LJJZZIII(parcel, 21, this.zzt, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str) {
        this.zzd = -1;
        this.zzb = C78946Uyc.LJJIL(b);
        this.zzc = C78946Uyc.LJJIL(b2);
        this.zzd = i;
        this.zze = cameraPosition;
        this.zzf = C78946Uyc.LJJIL(b3);
        this.zzg = C78946Uyc.LJJIL(b4);
        this.zzh = C78946Uyc.LJJIL(b5);
        this.zzi = C78946Uyc.LJJIL(b6);
        this.zzj = C78946Uyc.LJJIL(b7);
        this.zzk = C78946Uyc.LJJIL(b8);
        this.zzl = C78946Uyc.LJJIL(b9);
        this.zzm = C78946Uyc.LJJIL(b10);
        this.zzn = C78946Uyc.LJJIL(b11);
        this.zzo = f;
        this.zzp = f2;
        this.zzq = latLngBounds;
        this.zzr = C78946Uyc.LJJIL(b12);
        this.zzs = num;
        this.zzt = str;
    }
}
