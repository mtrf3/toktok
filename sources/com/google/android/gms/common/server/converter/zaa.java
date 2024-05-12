package com.google.android.gms.common.server.converter;

import X.C67307QbH;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C67307QbH();
    public final int LJLIL;
    public final StringToIntConverter zab;

    public final StringToIntConverter LJJJJL() {
        StringToIntConverter stringToIntConverter = this.zab;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.LJLIL = 1;
        this.zab = stringToIntConverter;
    }

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.LJLIL = i;
        this.zab = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZI(parcel, 2, this.zab, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
