package com.google.android.gms.common.server.response;

import X.C67312QbM;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* loaded from: classes12.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C67312QbM();
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final FastJsonResponse.Field<?, ?> LJLJI;

    public zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.LJLIL = 1;
        this.LJLILLLLZI = str;
        this.LJLJI = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.LJLIL);
        C79057V0z.LJJZZIII(parcel, 2, this.LJLILLLLZI, false);
        C79057V0z.LJJZZI(parcel, 3, this.LJLJI, i, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = field;
    }
}
