package com.kakao.sdk.user.model;

import X.C78920UyC;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new Creator();
    public final Boolean isDefaultImage;
    public final String nickname;
    public final String profileImageUrl;
    public final String thumbnailImageUrl;

    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<Profile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Profile createFromParcel(Parcel parcel) {
            Boolean valueOf;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Profile(readString, readString2, readString3, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.nickname;
        }
        if ((i & 2) != 0) {
            str2 = profile.profileImageUrl;
        }
        if ((i & 4) != 0) {
            str3 = profile.thumbnailImageUrl;
        }
        if ((i & 8) != 0) {
            bool = profile.isDefaultImage;
        }
        return profile.copy(str, str2, str3, bool);
    }

    public final Profile copy(String str, String str2, String str3, Boolean bool) {
        return new Profile(str, str2, str3, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return o.LJ(this.nickname, profile.nickname) && o.LJ(this.profileImageUrl, profile.profileImageUrl) && o.LJ(this.thumbnailImageUrl, profile.thumbnailImageUrl) && o.LJ(this.isDefaultImage, profile.isDefaultImage);
    }

    public int hashCode() {
        String str = this.nickname;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.profileImageUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailImageUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDefaultImage;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.nickname);
        out.writeString(this.profileImageUrl);
        out.writeString(this.thumbnailImageUrl);
        Boolean bool = this.isDefaultImage;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Profile(nickname=");
        LIZ.append((Object) this.nickname);
        LIZ.append(", profileImageUrl=");
        LIZ.append((Object) this.profileImageUrl);
        LIZ.append(", thumbnailImageUrl=");
        LIZ.append((Object) this.thumbnailImageUrl);
        LIZ.append(", isDefaultImage=");
        return C78920UyC.LIZIZ(LIZ, this.isDefaultImage, ')', LIZ);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public final Boolean isDefaultImage() {
        return this.isDefaultImage;
    }

    public Profile(String str, String str2, String str3, Boolean bool) {
        this.nickname = str;
        this.profileImageUrl = str2;
        this.thumbnailImageUrl = str3;
        this.isDefaultImage = bool;
    }
}
