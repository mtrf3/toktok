package com.google.android.gms.maps.model;

import X.C79057V0z;
import X.YK0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new YK0();
    public final byte[] data;
    public final int height;
    public final int width;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.width);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.height);
        C79057V0z.LJJLIIIJ(parcel, 4, this.data, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public Tile(int i, byte[] bArr, int i2) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }
}
