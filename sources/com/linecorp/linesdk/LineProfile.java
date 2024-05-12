package com.linecorp.linesdk;

import X.AnonymousClass073;
import X.C79062V1e;
import Y.IDCreatorS54S0000000_11;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class LineProfile implements Parcelable {
    public static final Parcelable.Creator<LineProfile> CREATOR = new IDCreatorS54S0000000_11(50);
    public final String displayName;
    public final Uri pictureUrl;
    public final String statusMessage;
    public final String userId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i;
        int LJ = C79062V1e.LJ(this.displayName, this.userId.hashCode() * 31, 31);
        Uri uri = this.pictureUrl;
        int i2 = 0;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i3 = (LJ + i) * 31;
        String str = this.statusMessage;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineProfile{displayName='");
        sb.append(this.displayName);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', pictureUrl='");
        sb.append(this.pictureUrl);
        sb.append("', statusMessage='");
        return AnonymousClass073.LIZIZ(sb, this.statusMessage, "'}");
    }

    public LineProfile(Parcel parcel) {
        this.userId = parcel.readString();
        this.displayName = parcel.readString();
        this.pictureUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.statusMessage = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineProfile lineProfile = (LineProfile) obj;
            if (!this.userId.equals(lineProfile.userId) || !this.displayName.equals(lineProfile.displayName)) {
                return false;
            }
            Uri uri = this.pictureUrl;
            if (uri == null ? lineProfile.pictureUrl != null : !uri.equals(lineProfile.pictureUrl)) {
                return false;
            }
            String str = this.statusMessage;
            String str2 = lineProfile.statusMessage;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.displayName);
        parcel.writeParcelable(this.pictureUrl, i);
        parcel.writeString(this.statusMessage);
    }

    public LineProfile(Uri uri, String str, String str2, String str3) {
        this.userId = str;
        this.displayName = str2;
        this.pictureUrl = uri;
        this.statusMessage = str3;
    }
}
