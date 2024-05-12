package com.google.android.gms.wallet;

import X.C68724Qy8;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes12.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new C68724Qy8();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String[] LJLJI;
    public final String LJLJJI;
    public final zza LJLJJL;
    public final zza LJLJJLL;
    public final LoyaltyWalletObject[] LJLJL;
    public final OfferWalletObject[] LJLJLJ;
    public final UserAddress LJLJLLL;
    public final UserAddress LJLL;
    public final InstrumentInfo[] LJLLI;

    public MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 3, this.LJLILLLLZI, false);
        C79057V0z.LJL(parcel, 4, this.LJLJI);
        C79057V0z.LJJZZIII(parcel, 5, this.LJLJJI, false);
        C79057V0z.LJJZZI(parcel, 6, this.LJLJJL, i, false);
        C79057V0z.LJJZZI(parcel, 7, this.LJLJJLL, i, false);
        C79057V0z.LJLIIIL(parcel, 8, this.LJLJL, i);
        C79057V0z.LJLIIIL(parcel, 9, this.LJLJLJ, i);
        C79057V0z.LJJZZI(parcel, 10, this.LJLJLLL, i, false);
        C79057V0z.LJJZZI(parcel, 11, this.LJLL, i, false);
        C79057V0z.LJLIIIL(parcel, 12, this.LJLLI, i);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zzaVar, zza zzaVar2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = strArr;
        this.LJLJJI = str3;
        this.LJLJJL = zzaVar;
        this.LJLJJLL = zzaVar2;
        this.LJLJL = loyaltyWalletObjectArr;
        this.LJLJLJ = offerWalletObjectArr;
        this.LJLJLLL = userAddress;
        this.LJLL = userAddress2;
        this.LJLLI = instrumentInfoArr;
    }
}
