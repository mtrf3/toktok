package com.google.android.gms.maps.model;

import X.C68776Qyy;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class StrokeStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StrokeStyle> CREATOR = new C68776Qyy();
    public final float zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final StampStyle zze;

    public final Pair LJJJJL() {
        return new Pair(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJJIZ(parcel, 2, this.zza);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJJJZ(parcel, 5, this.zzd);
        C79057V0z.LJJZZI(parcel, 6, this.zze, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public StrokeStyle(float f, int i, int i2, boolean z, StampStyle stampStyle) {
        this.zza = f;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = stampStyle;
    }
}
