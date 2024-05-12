package com.google.android.gms.auth;

import X.C67872QkO;
import X.C79057V0z;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C67872QkO();
    public final int LJLIL;
    public int zzb;
    public String zzc;
    public Account zzd;

    public AccountChangeEventsRequest() {
        this.LJLIL = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zzb);
        C79057V0z.LJJZZIII(parcel, 3, this.zzc, false);
        C79057V0z.LJJZZI(parcel, 4, this.zzd, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.LJLIL = i;
        this.zzb = i2;
        this.zzc = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.zzd = new Account(str, "com.google");
        } else {
            this.zzd = account;
        }
    }
}
