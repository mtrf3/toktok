package com.ss.android.ugc.aweme.shortvideo;

import X.HB2;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ExtraSession implements Parcelable {
    public static final Parcelable.Creator<ExtraSession> CREATOR = new HB2();
    public String commerceData;
    public String globalData;
    public String mainBusinessData;
    public String socialData;
    public String techData;
    public String ugData;

    public ExtraSession() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraSession)) {
            return false;
        }
        ExtraSession extraSession = (ExtraSession) obj;
        return o.LJ(this.mainBusinessData, extraSession.mainBusinessData) && o.LJ(this.socialData, extraSession.socialData) && o.LJ(this.commerceData, extraSession.commerceData) && o.LJ(this.ugData, extraSession.ugData) && o.LJ(this.techData, extraSession.techData) && o.LJ(this.globalData, extraSession.globalData);
    }

    public final int hashCode() {
        String str = this.mainBusinessData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.socialData;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commerceData;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ugData;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.techData;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.globalData;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.mainBusinessData);
        out.writeString(this.socialData);
        out.writeString(this.commerceData);
        out.writeString(this.ugData);
        out.writeString(this.techData);
        out.writeString(this.globalData);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraSession(mainBusinessData=");
        LIZ.append(this.mainBusinessData);
        LIZ.append(", socialData=");
        LIZ.append(this.socialData);
        LIZ.append(", commerceData=");
        LIZ.append(this.commerceData);
        LIZ.append(", ugData=");
        LIZ.append(this.ugData);
        LIZ.append(", techData=");
        LIZ.append(this.techData);
        LIZ.append(", globalData=");
        return q.LIZIZ(LIZ, this.globalData, ')', LIZ);
    }

    public ExtraSession(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mainBusinessData = str;
        this.socialData = str2;
        this.commerceData = str3;
        this.ugData = str4;
        this.techData = str5;
        this.globalData = str6;
    }
}
