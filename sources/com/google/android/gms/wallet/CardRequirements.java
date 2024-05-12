package com.google.android.gms.wallet;

import X.C68706Qxq;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new C68706Qxq();
    public ArrayList zza;
    public boolean zzb;
    public boolean zzc;
    public int zzd;

    public CardRequirements() {
        this.zzb = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIL(parcel, 1, this.zza);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJJZ(parcel, 3, this.zzc);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.zza = arrayList;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i;
    }
}
