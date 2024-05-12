package com.google.android.gms.wallet;

import X.C30931Jh;
import X.C68758Qyg;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* loaded from: classes12.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new C68758Qyg();
    public final CommonWalletObject LJLIL;
    public String zzb;
    public final int zzd;

    public OfferWalletObject() {
        this.zzd = 3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zzd);
        C79057V0z.LJJZZIII(parcel, 3, this.zzb, false);
        C79057V0z.LJJZZI(parcel, 4, this.LJLIL, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public OfferWalletObject(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.zzd = i;
        this.zzb = str2;
        if (i < 3) {
            CommonWalletObject commonWalletObject2 = (CommonWalletObject) new C30931Jh(new CommonWalletObject()).LJLIL;
            commonWalletObject2.zza = str;
            this.LJLIL = commonWalletObject2;
            return;
        }
        this.LJLIL = commonWalletObject;
    }
}
