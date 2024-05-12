package com.ss.android.ugc.aweme.addyours.model;

import X.C1FJ;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserInvitee implements Serializable, Parcelable {
    public static final Parcelable.Creator<UserInvitee> CREATOR = new Parcelable.Creator<UserInvitee>() { // from class: X.8iZ
        @Override // android.os.Parcelable.Creator
        public final UserInvitee createFromParcel(Parcel parcel) {
            Integer valueOf;
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new UserInvitee(readString, readString2, readString3, urlModel, valueOf, num, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final UserInvitee[] newArray(int i) {
            return new UserInvitee[i];
        }
    };

    @InterfaceC65349Pkn("avatar_model")
    public final UrlModel avatarModel;

    @InterfaceC65349Pkn("avatar_url")
    public final String avatarUrl;

    @InterfaceC65349Pkn("follow_status")
    public final Integer followStatus;

    @InterfaceC65349Pkn("follower_status")
    public final Integer followerStatus;

    @InterfaceC65349Pkn("invited")
    public final boolean invited;

    @InterfaceC65349Pkn("is_muf")
    public final boolean isMuf;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @InterfaceC65349Pkn("user_name")
    public final String userName;

    public static /* synthetic */ UserInvitee copy$default(UserInvitee userInvitee, String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInvitee.uid;
        }
        if ((i & 2) != 0) {
            str2 = userInvitee.userName;
        }
        if ((i & 4) != 0) {
            str3 = userInvitee.avatarUrl;
        }
        if ((i & 8) != 0) {
            urlModel = userInvitee.avatarModel;
        }
        if ((i & 16) != 0) {
            num = userInvitee.followStatus;
        }
        if ((i & 32) != 0) {
            num2 = userInvitee.followerStatus;
        }
        if ((i & 64) != 0) {
            z = userInvitee.invited;
        }
        if ((i & 128) != 0) {
            z2 = userInvitee.isMuf;
        }
        return userInvitee.copy(str, str2, str3, urlModel, num, num2, z, z2);
    }

    public final UserInvitee copy(String uid, String str, String str2, UrlModel urlModel, Integer num, Integer num2, boolean z, boolean z2) {
        o.LJIIIZ(uid, "uid");
        return new UserInvitee(uid, str, str2, urlModel, num, num2, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.uid.hashCode() * 31;
        String str = this.userName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.avatarModel;
        int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.followStatus;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.followerStatus;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.invited;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + (this.isMuf ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserInvitee(uid=");
        LIZ.append(this.uid);
        LIZ.append(", userName=");
        LIZ.append(this.userName);
        LIZ.append(", avatarUrl=");
        LIZ.append(this.avatarUrl);
        LIZ.append(", avatarModel=");
        LIZ.append(this.avatarModel);
        LIZ.append(", followStatus=");
        LIZ.append(this.followStatus);
        LIZ.append(", followerStatus=");
        LIZ.append(this.followerStatus);
        LIZ.append(", invited=");
        LIZ.append(this.invited);
        LIZ.append(", isMuf=");
        return C48339Iy7.LIZJ(LIZ, this.isMuf, ')', LIZ);
    }

    public final UrlModel getAvatarModel() {
        return this.avatarModel;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final boolean getInvited() {
        return this.invited;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean isMuf() {
        return this.isMuf;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserInvitee)) {
            return false;
        }
        return o.LJ(this.uid, ((UserInvitee) obj).uid);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uid);
        out.writeString(this.userName);
        out.writeString(this.avatarUrl);
        out.writeSerializable(this.avatarModel);
        Integer num = this.followStatus;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.followerStatus;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeInt(this.invited ? 1 : 0);
        out.writeInt(this.isMuf ? 1 : 0);
    }

    public UserInvitee(String uid, String str, String str2, UrlModel urlModel, Integer num, Integer num2, boolean z, boolean z2) {
        o.LJIIIZ(uid, "uid");
        this.uid = uid;
        this.userName = str;
        this.avatarUrl = str2;
        this.avatarModel = urlModel;
        this.followStatus = num;
        this.followerStatus = num2;
        this.invited = z;
        this.isMuf = z2;
    }

    public /* synthetic */ UserInvitee(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? urlModel : null, (i & 16) != 0 ? -1 : num, (i & 32) != 0 ? -1 : num2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2);
    }
}
