package com.google.android.gms.auth;

import X.C67346Qbu;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes12.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new C67346Qbu();
    public final int LJLIL;
    public final List zzb;

    public AccountChangeEventsResponse(int i, List list) {
        this.LJLIL = i;
        QH7.LJIIIIZZ(list);
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJLIIL(parcel, 2, this.zzb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
