package com.google.android.gms.auth.api.credentials;

import X.C64363PNv;
import X.C67606Qg6;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C67606Qg6();
    public final String zba;
    public final String zbb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (C64363PNv.LIZ(this.zba, idToken.zba) && C64363PNv.LIZ(this.zbb, idToken.zbb)) {
            return true;
        }
        return false;
    }

    public IdToken(String str, String str2) {
        QH7.LIZ("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        QH7.LIZ("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.zba = str;
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 1, this.zba, false);
        C79057V0z.LJJZZIII(parcel, 2, this.zbb, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
