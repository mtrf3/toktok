package com.google.android.gms.wallet;

import X.C68183QpP;
import X.C79057V0z;
import X.InterfaceC68184QpQ;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes12.dex */
public final class PaymentData extends AbstractSafeParcelable implements InterfaceC68184QpQ {
    public static final Parcelable.Creator<PaymentData> CREATOR = new C68183QpP();
    public String zza;
    public CardInfo zzb;
    public UserAddress zzc;
    public PaymentMethodToken zzd;
    public String zze;
    public Bundle zzf;
    public String zzg;
    public Bundle zzh;

    public PaymentData() {
    }

    @Override // X.InterfaceC68184QpQ
    public final void LJIIJ(Intent intent) {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zza, false);
        C79057V0z.LJJZZI(parcel, 2, this.zzb, i, false);
        C79057V0z.LJJZZI(parcel, 3, this.zzc, i, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzd, i, false);
        C79057V0z.LJJZZIII(parcel, 5, this.zze, false);
        C79057V0z.LJJLI(parcel, 6, this.zzf);
        C79057V0z.LJJZZIII(parcel, 7, this.zzg, false);
        C79057V0z.LJJLI(parcel, 8, this.zzh);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }
}
