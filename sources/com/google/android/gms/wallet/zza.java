package com.google.android.gms.wallet;

import X.C68726QyA;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C68726QyA();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final String LJLJLLL;
    public final boolean LJLL;
    public final String LJLLI;

    public zza() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLIL, false);
        C79057V0z.LJJZZIII(parcel, 3, this.LJLILLLLZI, false);
        C79057V0z.LJJZZIII(parcel, 4, this.LJLJI, false);
        C79057V0z.LJJZZIII(parcel, 5, this.LJLJJI, false);
        C79057V0z.LJJZZIII(parcel, 6, this.LJLJJL, false);
        C79057V0z.LJJZZIII(parcel, 7, this.LJLJJLL, false);
        C79057V0z.LJJZZIII(parcel, 8, this.LJLJL, false);
        C79057V0z.LJJZZIII(parcel, 9, this.LJLJLJ, false);
        C79057V0z.LJJZZIII(parcel, 10, this.LJLJLLL, false);
        C79057V0z.LJJJZ(parcel, 11, this.LJLL);
        C79057V0z.LJJZZIII(parcel, 12, this.LJLLI, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zza(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
        this.LJLJL = str7;
        this.LJLJLJ = str8;
        this.LJLJLLL = str9;
        this.LJLL = z;
        this.LJLLI = str10;
    }
}
