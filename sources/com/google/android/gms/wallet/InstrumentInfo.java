package com.google.android.gms.wallet;

import X.C68725Qy9;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new C68725Qy9();
    public String zza;
    public String zzb;
    public int zzc;

    public InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        int i2 = 0;
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        int i3 = this.zzc;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i2 = i3;
        }
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, i2);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }
}
