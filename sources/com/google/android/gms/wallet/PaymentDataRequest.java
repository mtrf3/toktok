package com.google.android.gms.wallet;

import X.C68705Qxp;
import X.C79057V0z;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new C68705Qxp();
    public boolean zza;
    public boolean zzb;
    public CardRequirements zzc;
    public boolean zzd;
    public ShippingAddressRequirements zze;
    public ArrayList zzf;
    public PaymentMethodTokenizationParameters zzg;
    public TransactionInfo zzh;
    public boolean zzi;
    public String zzj;
    public Bundle zzk;

    public PaymentDataRequest() {
        this.zzi = true;
    }

    public static PaymentDataRequest LJJJJL(String str) {
        PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
        paymentDataRequest.zzj = str;
        return paymentDataRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJJZ(parcel, 1, this.zza);
        C79057V0z.LJJJZ(parcel, 2, this.zzb);
        C79057V0z.LJJZZI(parcel, 3, this.zzc, i, false);
        C79057V0z.LJJJZ(parcel, 4, this.zzd);
        C79057V0z.LJJZZI(parcel, 5, this.zze, i, false);
        C79057V0z.LJJLIL(parcel, 6, this.zzf);
        C79057V0z.LJJZZI(parcel, 7, this.zzg, i, false);
        C79057V0z.LJJZZI(parcel, 8, this.zzh, i, false);
        C79057V0z.LJJJZ(parcel, 9, this.zzi);
        C79057V0z.LJJZZIII(parcel, 10, this.zzj, false);
        C79057V0z.LJJLI(parcel, 11, this.zzk);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public PaymentDataRequest(boolean z, boolean z2, CardRequirements cardRequirements, boolean z3, ShippingAddressRequirements shippingAddressRequirements, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, TransactionInfo transactionInfo, boolean z4, String str, Bundle bundle) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = cardRequirements;
        this.zzd = z3;
        this.zze = shippingAddressRequirements;
        this.zzf = arrayList;
        this.zzg = paymentMethodTokenizationParameters;
        this.zzh = transactionInfo;
        this.zzi = z4;
        this.zzj = str;
        this.zzk = bundle;
    }
}
