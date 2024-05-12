package com.google.android.gms.cast.framework.media;

import X.C79057V0z;
import X.ZZ3;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes29.dex */
public class ImageHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImageHints> CREATOR = new ZZ3();
    public final int zza;
    public final int zzb;
    public final int zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zza);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zzb);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzc);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public ImageHints(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }
}
