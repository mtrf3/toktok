package com.google.android.gms.common.internal;

import X.C67848Qk0;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes12.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C67848Qk0();
    public final int zaa;
    public List<MethodInvocation> zab;

    public TelemetryData(int i, List<MethodInvocation> list) {
        this.zaa = i;
        this.zab = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zaa);
        C79057V0z.LJLIIL(parcel, 2, this.zab, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
