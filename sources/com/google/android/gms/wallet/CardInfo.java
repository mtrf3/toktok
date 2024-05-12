package com.google.android.gms.wallet;

import X.C68185QpR;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes12.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new C68185QpR();
    public final int LJLIL;
    public String zza;
    public String zzb;
    public String zzc;
    public UserAddress zze;

    public CardInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzc, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 4, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 5, this.zze, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.LJLIL = i;
        this.zze = userAddress;
    }
}
