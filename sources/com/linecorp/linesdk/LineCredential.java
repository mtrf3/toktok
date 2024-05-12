package com.linecorp.linesdk;

import Y.IDCreatorS54S0000000_11;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new IDCreatorS54S0000000_11(49);
    public final LineAccessToken accessToken;
    public final List<String> permission;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.permission.hashCode() + (this.accessToken.hashCode() * 31);
    }

    public final String toString() {
        return "LineCredential{accessToken=#####, permission=" + this.permission + '}';
    }

    public LineCredential(Parcel parcel) {
        this.accessToken = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.permission = Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (!this.accessToken.equals(lineCredential.accessToken)) {
            return false;
        }
        return this.permission.equals(lineCredential.permission);
    }

    public LineCredential(LineAccessToken lineAccessToken, List<String> list) {
        this.accessToken = lineAccessToken;
        this.permission = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.accessToken, i);
        parcel.writeStringList(this.permission);
    }
}
