package com.google.android.gms.internal.ads;

import X.C79057V0z;
import X.C87194YJy;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class zzbql extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbql> CREATOR = new C87194YJy();
    public final int versionCode;
    public final byte[] zzfgr;

    public zzbql(int i, byte[] bArr) {
        this.versionCode = i;
        this.zzfgr = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.versionCode);
        C79057V0z.LJJLIIIJ(parcel, 2, this.zzfgr, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
