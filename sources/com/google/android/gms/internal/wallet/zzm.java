package com.google.android.gms.internal.wallet;

import X.C68722Qy6;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C68722Qy6();
    public final byte[] LJLIL;

    public zzm(byte[] bArr) {
        this.LJLIL = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJ(parcel, 1, this.LJLIL, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
