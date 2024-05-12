package com.google.android.gms.auth.api.identity;

import X.C64363PNv;
import X.C67347Qbv;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new C67347Qbv();
    public final String zba;
    public final String zbb;
    public final String zbc;
    public final String zbd;
    public final boolean zbe;
    public final int zbf;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbd, Boolean.valueOf(this.zbe), Integer.valueOf(this.zbf)});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!C64363PNv.LIZ(this.zba, getSignInIntentRequest.zba) || !C64363PNv.LIZ(this.zbd, getSignInIntentRequest.zbd) || !C64363PNv.LIZ(this.zbb, getSignInIntentRequest.zbb) || !C64363PNv.LIZ(Boolean.valueOf(this.zbe), Boolean.valueOf(getSignInIntentRequest.zbe)) || this.zbf != getSignInIntentRequest.zbf) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zba, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
        C79057V0z.LJJZZIII(parcel, 3, this.zbc, false);
        C79057V0z.LJJZZIII(parcel, 4, this.zbd, false);
        C79057V0z.LJJJZ(parcel, 5, this.zbe);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 6, this.zbf);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z, int i) {
        QH7.LJIIIIZZ(str);
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = z;
        this.zbf = i;
    }
}
