package com.ss.android.ugc.aweme.im.message.template.service;

import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SendMessageEventParcel implements Parcelable {
    public static final Parcelable.Creator<SendMessageEventParcel> CREATOR = new Parcelable.Creator<SendMessageEventParcel>() { // from class: X.4Nd
        @Override // android.os.Parcelable.Creator
        public final SendMessageEventParcel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new SendMessageEventParcel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendMessageEventParcel[] newArray(int i) {
            return new SendMessageEventParcel[i];
        }
    };
    public final String authorFollowStatus;
    public final String enterFrom;
    public String enterMethod;
    public final String panelSource;
    public final String resourceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageEventParcel)) {
            return false;
        }
        SendMessageEventParcel sendMessageEventParcel = (SendMessageEventParcel) obj;
        return o.LJ(this.enterFrom, sendMessageEventParcel.enterFrom) && o.LJ(this.resourceId, sendMessageEventParcel.resourceId) && o.LJ(this.panelSource, sendMessageEventParcel.panelSource) && o.LJ(this.enterMethod, sendMessageEventParcel.enterMethod) && o.LJ(this.authorFollowStatus, sendMessageEventParcel.authorFollowStatus);
    }

    public final int hashCode() {
        int hashCode = this.enterFrom.hashCode() * 31;
        String str = this.resourceId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.panelSource;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterMethod;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authorFollowStatus;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.enterFrom);
        out.writeString(this.resourceId);
        out.writeString(this.panelSource);
        out.writeString(this.enterMethod);
        out.writeString(this.authorFollowStatus);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMessageEventParcel(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", resourceId=");
        LIZ.append(this.resourceId);
        LIZ.append(", panelSource=");
        LIZ.append(this.panelSource);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", authorFollowStatus=");
        return q.LIZIZ(LIZ, this.authorFollowStatus, ')', LIZ);
    }

    public /* synthetic */ SendMessageEventParcel(String str, String str2, String str3, String str4, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (String) null, (i & 16) != 0 ? null : str4);
    }

    public SendMessageEventParcel(String enterFrom, String str, String str2, String str3, String str4) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.enterFrom = enterFrom;
        this.resourceId = str;
        this.panelSource = str2;
        this.enterMethod = str3;
        this.authorFollowStatus = str4;
    }
}
