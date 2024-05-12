package com.google.android.gms.wallet.wobs;

import X.C68764Qym;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new C68764Qym();
    public String zza;
    public String zzb;
    public TimeInterval zzc;
    public UriData zzd;
    public UriData zze;

    public WalletObjectMessage() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.zza, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzc, i, false);
        C79057V0z.LJJZZI(parcel, 5, this.zzd, i, false);
        C79057V0z.LJJZZI(parcel, 6, this.zze, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }
}
