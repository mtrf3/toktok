package com.google.android.gms.signin.internal;

import X.C67854Qk6;
import X.C79057V0z;
import X.InterfaceC67754QiU;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC67754QiU {
    public static final Parcelable.Creator<zaa> CREATOR = new C67854Qk6();
    public final int LJLIL;
    public int zab;
    public Intent zac;

    public zaa() {
        this(2, 0, null);
    }

    @Override // X.InterfaceC67754QiU
    public final Status getStatus() {
        if (this.zab == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zab);
        C79057V0z.LJJZZI(parcel, 3, this.zac, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zaa(int i, int i2, Intent intent) {
        this.LJLIL = i;
        this.zab = i2;
        this.zac = intent;
    }
}
