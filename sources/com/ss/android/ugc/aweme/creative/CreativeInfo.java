package com.ss.android.ugc.aweme.creative;

import X.C44384HbQ;
import X.H8S;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeInfo> CREATOR = new H8S();

    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    @InterfaceC65349Pkn("version")
    public final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInfo() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInfo(String creationId) {
        this(creationId, 0, null, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(creationId, "creationId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreativeInfo(String creationId, int i) {
        this(creationId, i, null, 4, 0 == true ? 1 : 0);
        o.LJIIIZ(creationId, "creationId");
    }

    public static /* synthetic */ CreativeInfo copy$default(CreativeInfo creativeInfo, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = creativeInfo.creationId;
        }
        if ((i2 & 2) != 0) {
            i = creativeInfo.version;
        }
        if ((i2 & 4) != 0) {
            str2 = creativeInfo.sessionId;
        }
        return creativeInfo.copy(str, i, str2);
    }

    public final CreativeInfo copy(String creationId, int i, String str) {
        o.LJIIIZ(creationId, "creationId");
        return new CreativeInfo(creationId, i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreativeInfo)) {
            return false;
        }
        CreativeInfo creativeInfo = (CreativeInfo) obj;
        return o.LJ(this.creationId, creativeInfo.creationId) && this.version == creativeInfo.version && o.LJ(this.sessionId, creativeInfo.sessionId);
    }

    public int hashCode() {
        int hashCode = ((this.creationId.hashCode() * 31) + this.version) * 31;
        String str = this.sessionId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.creationId);
        out.writeInt(this.version);
        out.writeString(this.sessionId);
    }

    public final boolean isValid() {
        if (this.creationId.length() > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreativeInfo(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", sessionId=");
        return q.LIZIZ(LIZ, this.sessionId, ')', LIZ);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getVersion() {
        return this.version;
    }

    public CreativeInfo(String creationId, int i, String str) {
        o.LJIIIZ(creationId, "creationId");
        this.creationId = creationId;
        this.version = i;
        this.sessionId = str;
    }

    public /* synthetic */ CreativeInfo(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C44384HbQ.LJJJJIZL() : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
    }
}
