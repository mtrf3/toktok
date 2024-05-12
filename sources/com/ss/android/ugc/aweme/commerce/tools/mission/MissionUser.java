package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class MissionUser implements Parcelable, Serializable {
    public static final Parcelable.Creator<MissionUser> CREATOR = new Parcelable.Creator<MissionUser>() { // from class: X.6bH
        @Override // android.os.Parcelable.Creator
        public final MissionUser createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new MissionUser(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MissionUser[] newArray(int i) {
            return new MissionUser[i];
        }
    };

    @InterfaceC65349Pkn("nickname")
    public String nickname;

    @InterfaceC65349Pkn("sec_uid")
    public final String secUid;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public MissionUser() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MissionUser copy$default(MissionUser missionUser, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = missionUser.uid;
        }
        if ((i & 2) != 0) {
            str2 = missionUser.secUid;
        }
        if ((i & 4) != 0) {
            str3 = missionUser.nickname;
        }
        return missionUser.copy(str, str2, str3);
    }

    public final MissionUser copy(String str, String str2, String str3) {
        return new MissionUser(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionUser)) {
            return false;
        }
        MissionUser missionUser = (MissionUser) obj;
        return o.LJ(this.uid, missionUser.uid) && o.LJ(this.secUid, missionUser.secUid) && o.LJ(this.nickname, missionUser.nickname);
    }

    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uid);
        out.writeString(this.secUid);
        out.writeString(this.nickname);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MissionUser(uid=");
        LIZ.append(this.uid);
        LIZ.append(", secUid=");
        LIZ.append(this.secUid);
        LIZ.append(", nickname=");
        return q.LIZIZ(LIZ, this.nickname, ')', LIZ);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public MissionUser(String str, String str2, String str3) {
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
    }

    public /* synthetic */ MissionUser(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
