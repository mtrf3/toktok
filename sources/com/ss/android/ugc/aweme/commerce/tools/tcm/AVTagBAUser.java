package com.ss.android.ugc.aweme.commerce.tools.tcm;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.tcm.AVTagBAUser;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AVTagBAUser implements Serializable, Parcelable {
    public static final Parcelable.Creator<AVTagBAUser> CREATOR = new Parcelable.Creator<AVTagBAUser>() { // from class: X.4e7
        @Override // android.os.Parcelable.Creator
        public final AVTagBAUser createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AVTagBAUser(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AVTagBAUser[] newArray(int i) {
            return new AVTagBAUser[i];
        }
    };

    @InterfaceC65349Pkn("handle_name")
    public final String handleName;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public AVTagBAUser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AVTagBAUser copy$default(AVTagBAUser aVTagBAUser, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVTagBAUser.uid;
        }
        if ((i & 2) != 0) {
            str2 = aVTagBAUser.handleName;
        }
        return aVTagBAUser.copy(str, str2);
    }

    public final AVTagBAUser copy(String str, String str2) {
        return new AVTagBAUser(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTagBAUser)) {
            return false;
        }
        AVTagBAUser aVTagBAUser = (AVTagBAUser) obj;
        return o.LJ(this.uid, aVTagBAUser.uid) && o.LJ(this.handleName, aVTagBAUser.handleName);
    }

    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.handleName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uid);
        out.writeString(this.handleName);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVTagBAUser(uid=");
        LIZ.append(this.uid);
        LIZ.append(", handleName=");
        return q.LIZIZ(LIZ, this.handleName, ')', LIZ);
    }

    public final String getHandleName() {
        return this.handleName;
    }

    public final String getUid() {
        return this.uid;
    }

    public AVTagBAUser(String str, String str2) {
        this.uid = str;
        this.handleName = str2;
    }

    public /* synthetic */ AVTagBAUser(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
