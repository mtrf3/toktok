package com.google.android.gms.wallet;

import X.C68760Qyi;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new C68760Qyi();
    public LoyaltyWalletObject zza;
    public OfferWalletObject zzb;
    public GiftCardWalletObject zzc;
    public int zzd;

    public CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzb, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzc, i, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 5, this.zzd);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CreateWalletObjectsRequest(LoyaltyWalletObject loyaltyWalletObject, OfferWalletObject offerWalletObject, GiftCardWalletObject giftCardWalletObject, int i) {
        this.zza = loyaltyWalletObject;
        this.zzb = offerWalletObject;
        this.zzc = giftCardWalletObject;
        this.zzd = i;
    }
}
