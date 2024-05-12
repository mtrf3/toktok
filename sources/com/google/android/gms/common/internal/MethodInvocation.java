package com.google.android.gms.common.internal;

import X.C67850Qk2;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C67850Qk2();
    public final int zaa;
    public final int zab;
    public final int zac;
    public final long zad;
    public final long zae;
    public final String zaf;
    public final String zag;
    public final int zah;
    public final int zai;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.zaa);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, this.zab);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, this.zac);
        C79057V0z.LJJLJLI(parcel, 4, this.zad);
        C79057V0z.LJJLJLI(parcel, 5, this.zae);
        C79057V0z.LJJZZIII(parcel, 6, this.zaf, false);
        C79057V0z.LJJZZIII(parcel, 7, this.zag, false);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 8, this.zah);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 9, this.zai);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public MethodInvocation(int i, int i2, int i3, int i4, int i5, long j, long j2, String str, String str2) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }
}
