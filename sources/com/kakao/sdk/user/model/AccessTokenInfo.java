package com.kakao.sdk.user.model;

import X.C05040Hs;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class AccessTokenInfo implements Parcelable {
    public static final Parcelable.Creator<AccessTokenInfo> CREATOR = new Creator();
    public final int appId;
    public final long expiresIn;

    @InterfaceC65349Pkn("expiresInMillis")
    public final Long expiresInMillis;
    public final Long id;

    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<AccessTokenInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new AccessTokenInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccessTokenInfo[] newArray(int i) {
            return new AccessTokenInfo[i];
        }
    }

    public static /* synthetic */ AccessTokenInfo copy$default(AccessTokenInfo accessTokenInfo, Long l, long j, int i, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = accessTokenInfo.id;
        }
        if ((i2 & 2) != 0) {
            j = accessTokenInfo.expiresIn;
        }
        if ((i2 & 4) != 0) {
            i = accessTokenInfo.appId;
        }
        if ((i2 & 8) != 0) {
            l2 = accessTokenInfo.expiresInMillis;
        }
        return accessTokenInfo.copy(l, j, i, l2);
    }

    public static /* synthetic */ void getExpiresInMillis$annotations() {
    }

    public final AccessTokenInfo copy(Long l, long j, int i, Long l2) {
        return new AccessTokenInfo(l, j, i, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessTokenInfo)) {
            return false;
        }
        AccessTokenInfo accessTokenInfo = (AccessTokenInfo) obj;
        return o.LJ(this.id, accessTokenInfo.id) && this.expiresIn == accessTokenInfo.expiresIn && this.appId == accessTokenInfo.appId && o.LJ(this.expiresInMillis, accessTokenInfo.expiresInMillis);
    }

    public int hashCode() {
        int hashCode;
        Long l = this.id;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int LIZJ = (JBR.LIZJ(this.expiresIn, hashCode * 31, 31) + this.appId) * 31;
        Long l2 = this.expiresInMillis;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return LIZJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AccessTokenInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", expiresIn=");
        LIZ.append(this.expiresIn);
        LIZ.append(", appId=");
        LIZ.append(this.appId);
        LIZ.append(", expiresInMillis=");
        return JBR.LJ(LIZ, this.expiresInMillis, ')', LIZ);
    }

    public final int getAppId() {
        return this.appId;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final Long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public final Long getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.id;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeLong(this.expiresIn);
        out.writeInt(this.appId);
        Long l2 = this.expiresInMillis;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public AccessTokenInfo(Long l, long j, int i, Long l2) {
        this.id = l;
        this.expiresIn = j;
        this.appId = i;
        this.expiresInMillis = l2;
    }
}
