package com.google.android.gms.internal.ads;

import X.C79057V0z;
import X.YPA;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes16.dex */
public final class zzbqo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqo> CREATOR = new YPA();
    public final String packageName;
    public final int versionCode;
    public final String zzfgs;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.versionCode);
        C79057V0z.LJJZZIII(parcel, 2, this.packageName, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zzfgs, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzbqo(int i, String str, String str2) {
        this.versionCode = i;
        this.packageName = str;
        this.zzfgs = str2;
    }
}
