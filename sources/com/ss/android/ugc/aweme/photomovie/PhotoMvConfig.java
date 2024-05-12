package com.ss.android.ugc.aweme.photomovie;

import X.C43674HCc;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PhotoMvConfig implements Parcelable {
    public static final Parcelable.Creator<PhotoMvConfig> CREATOR = new C43674HCc();
    public final String anchorMvId;
    public final String anchorMvPanel;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoMvConfig)) {
            return false;
        }
        PhotoMvConfig photoMvConfig = (PhotoMvConfig) obj;
        return o.LJ(this.anchorMvId, photoMvConfig.anchorMvId) && o.LJ(this.anchorMvPanel, photoMvConfig.anchorMvPanel);
    }

    public final int hashCode() {
        String str = this.anchorMvId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.anchorMvPanel;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.anchorMvId);
        out.writeString(this.anchorMvPanel);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoMvConfig(anchorMvId=");
        LIZ.append(this.anchorMvId);
        LIZ.append(", anchorMvPanel=");
        return q.LIZIZ(LIZ, this.anchorMvPanel, ')', LIZ);
    }

    public PhotoMvConfig(String str, String str2) {
        this.anchorMvId = str;
        this.anchorMvPanel = str2;
    }
}
