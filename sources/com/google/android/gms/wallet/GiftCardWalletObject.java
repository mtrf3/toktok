package com.google.android.gms.wallet;

import X.C30931Jh;
import X.C68759Qyh;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes12.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new C68759Qyh();
    public final CommonWalletObject LJLIL;
    public String zzb;
    public String zzc;
    public String zzd;
    public long zze;
    public String zzf;
    public long zzg;
    public String zzh;

    public GiftCardWalletObject() {
        this.LJLIL = (CommonWalletObject) new C30931Jh(new CommonWalletObject()).LJLIL;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.LJLIL, i, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zzc, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zzd, false);
        C79057V0z.LJJLJLI(parcel, 6, this.zze);
        C79057V0z.LJJZZIII(parcel, 7, this.zzf, false);
        C79057V0z.LJJLJLI(parcel, 8, this.zzg);
        C79057V0z.LJJZZIII(parcel, 9, this.zzh, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        new CommonWalletObject();
        this.LJLIL = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j;
        this.zzf = str4;
        this.zzg = j2;
        this.zzh = str5;
        this.zzd = str3;
    }
}
