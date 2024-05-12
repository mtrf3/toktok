package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C48501J1t;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class BillboardNewUser implements Parcelable {
    public static final Parcelable.Creator<BillboardNewUser> CREATOR = new C48501J1t();

    @InterfaceC65349Pkn("is_new_user")
    public final Boolean isNewUser;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillboardNewUser) && o.LJ(this.isNewUser, ((BillboardNewUser) obj).isNewUser);
    }

    public final int hashCode() {
        Boolean bool = this.isNewUser;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        Boolean bool = this.isNewUser;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BillboardNewUser(isNewUser=");
        return C78920UyC.LIZIZ(LIZ, this.isNewUser, ')', LIZ);
    }

    public BillboardNewUser(Boolean bool) {
        this.isNewUser = bool;
    }
}
