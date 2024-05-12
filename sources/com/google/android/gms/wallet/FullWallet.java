package com.google.android.gms.wallet;

import X.C68723Qy7;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes12.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FullWallet> CREATOR = new C68723Qy7();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final zzaj LJLJI;
    public final String LJLJJI;
    public final zza LJLJJL;
    public final zza LJLJJLL;
    public final String[] LJLJL;
    public final UserAddress LJLJLJ;
    public final UserAddress LJLJLLL;
    public final InstrumentInfo[] LJLL;
    public final PaymentMethodToken LJLLI;

    public FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 3, this.LJLILLLLZI, false);
        C79057V0z.LJJZZI(parcel, 4, this.LJLJI, i, false);
        C79057V0z.LJJZZIII(parcel, 5, this.LJLJJI, false);
        C79057V0z.LJJZZI(parcel, 6, this.LJLJJL, i, false);
        C79057V0z.LJJZZI(parcel, 7, this.LJLJJLL, i, false);
        C79057V0z.LJL(parcel, 8, this.LJLJL);
        C79057V0z.LJJZZI(parcel, 9, this.LJLJLJ, i, false);
        C79057V0z.LJJZZI(parcel, 10, this.LJLJLLL, i, false);
        C79057V0z.LJLIIIL(parcel, 11, this.LJLL, i);
        C79057V0z.LJJZZI(parcel, 12, this.LJLLI, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public FullWallet(String str, String str2, zzaj zzajVar, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = zzajVar;
        this.LJLJJI = str3;
        this.LJLJJL = zzaVar;
        this.LJLJJLL = zzaVar2;
        this.LJLJL = strArr;
        this.LJLJLJ = userAddress;
        this.LJLJLLL = userAddress2;
        this.LJLL = instrumentInfoArr;
        this.LJLLI = paymentMethodToken;
    }
}
