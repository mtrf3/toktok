package com.bytedance.android.livesdkapi.session.deeplink;

import X.BLE;
import X.BMU;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DeepLinkData implements Parcelable {
    public static final BLE CREATOR = new BLE();
    public final long bizType;
    public final String displayId;
    public final String openUrl;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkData)) {
            return false;
        }
        DeepLinkData deepLinkData = (DeepLinkData) obj;
        return o.LJ(this.openUrl, deepLinkData.openUrl) && this.bizType == deepLinkData.bizType && o.LJ(this.displayId, deepLinkData.displayId);
    }

    public DeepLinkData() {
        this(null, BMU.Unknown.getScene(), null);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.openUrl;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.bizType, hashCode * 31, 31);
        String str2 = this.displayId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeepLinkData(openUrl=");
        LIZ.append(this.openUrl);
        LIZ.append(", bizType=");
        LIZ.append(this.bizType);
        LIZ.append(", displayId=");
        return q.LIZIZ(LIZ, this.displayId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.openUrl);
        parcel.writeLong(this.bizType);
        parcel.writeString(this.displayId);
    }

    public DeepLinkData(String str, long j, String str2) {
        this.openUrl = str;
        this.bizType = j;
        this.displayId = str2;
    }
}
