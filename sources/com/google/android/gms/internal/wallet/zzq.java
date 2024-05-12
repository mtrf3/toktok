package com.google.android.gms.internal.wallet;

import X.C67316QbQ;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C67316QbQ();
    public final String[] LJLIL;
    public final int[] LJLILLLLZI;
    public final RemoteViews LJLJI;
    public final byte[] LJLJJI;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJL(parcel, 1, this.LJLIL);
        C79057V0z.LJJLIIJ(parcel, 2, this.LJLILLLLZI);
        C79057V0z.LJJZZI(parcel, 3, this.LJLJI, i, false);
        C79057V0z.LJJLIIIJ(parcel, 4, this.LJLJJI, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zzq(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.LJLIL = strArr;
        this.LJLILLLLZI = iArr;
        this.LJLJI = remoteViews;
        this.LJLJJI = bArr;
    }
}
