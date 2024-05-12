package com.google.android.gms.common.internal;

import X.C64363PNv;
import X.C68859R0t;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C68859R0t();
    public final String packageName;
    public final int uid;

    public final int hashCode() {
        return this.uid;
    }

    public final String toString() {
        int i = this.uid;
        String str = this.packageName;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.uid == this.uid && C64363PNv.LIZ(clientIdentity.packageName, this.packageName)) {
            return true;
        }
        return false;
    }

    public ClientIdentity(int i, String str) {
        this.uid = i;
        this.packageName = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, this.uid);
        C79057V0z.LJJZZIII(parcel, 2, this.packageName, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
