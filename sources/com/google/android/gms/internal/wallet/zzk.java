package com.google.android.gms.internal.wallet;

import X.C68721Qy5;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C68721Qy5();
    public final byte[] LJLIL;

    public zzk() {
        this.LJLIL = new byte[0];
    }

    public zzk(byte[] bArr) {
        this.LJLIL = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 2, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
