package com.kakao.sdk.user.model;

import X.C05040Hs;
import X.C1FL;
import X.C78920UyC;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    public final Date connectedAt;
    public final String groupUserToken;
    public final Boolean hasSignedUp;
    public final Long id;
    public final Account kakaoAccount;
    public final Map<String, String> properties;
    public final Date synchedAt;

    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            o.LJIIIZ(parcel, "parcel");
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new User(valueOf, linkedHashMap, parcel.readInt() == 0 ? null : Account.CREATOR.createFromParcel(parcel), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ User copy$default(User user, Long l, Map map, Account account, String str, Date date, Date date2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            l = user.id;
        }
        if ((i & 2) != 0) {
            map = user.properties;
        }
        if ((i & 4) != 0) {
            account = user.kakaoAccount;
        }
        if ((i & 8) != 0) {
            str = user.groupUserToken;
        }
        if ((i & 16) != 0) {
            date = user.connectedAt;
        }
        if ((i & 32) != 0) {
            date2 = user.synchedAt;
        }
        if ((i & 64) != 0) {
            bool = user.hasSignedUp;
        }
        return user.copy(l, map, account, str, date, date2, bool);
    }

    public final User copy(Long l, Map<String, String> map, Account account, String str, Date date, Date date2, Boolean bool) {
        return new User(l, map, account, str, date, date2, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return o.LJ(this.id, user.id) && o.LJ(this.properties, user.properties) && o.LJ(this.kakaoAccount, user.kakaoAccount) && o.LJ(this.groupUserToken, user.groupUserToken) && o.LJ(this.connectedAt, user.connectedAt) && o.LJ(this.synchedAt, user.synchedAt) && o.LJ(this.hasSignedUp, user.hasSignedUp);
    }

    public int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Map<String, String> map = this.properties;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Account account = this.kakaoAccount;
        int hashCode3 = (hashCode2 + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.groupUserToken;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.connectedAt;
        int hashCode5 = (hashCode4 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.synchedAt;
        int hashCode6 = (hashCode5 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Boolean bool = this.hasSignedUp;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("User(id=");
        LIZ.append(this.id);
        LIZ.append(", properties=");
        LIZ.append(this.properties);
        LIZ.append(", kakaoAccount=");
        LIZ.append(this.kakaoAccount);
        LIZ.append(", groupUserToken=");
        LIZ.append((Object) this.groupUserToken);
        LIZ.append(", connectedAt=");
        LIZ.append(this.connectedAt);
        LIZ.append(", synchedAt=");
        LIZ.append(this.synchedAt);
        LIZ.append(", hasSignedUp=");
        return C78920UyC.LIZIZ(LIZ, this.hasSignedUp, ')', LIZ);
    }

    public final Date getConnectedAt() {
        return this.connectedAt;
    }

    public final String getGroupUserToken() {
        return this.groupUserToken;
    }

    public final Boolean getHasSignedUp() {
        return this.hasSignedUp;
    }

    public final Long getId() {
        return this.id;
    }

    public final Account getKakaoAccount() {
        return this.kakaoAccount;
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public final Date getSynchedAt() {
        return this.synchedAt;
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
        Map<String, String> map = this.properties;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Account account = this.kakaoAccount;
        if (account == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            account.writeToParcel(out, i);
        }
        out.writeString(this.groupUserToken);
        out.writeSerializable(this.connectedAt);
        out.writeSerializable(this.synchedAt);
        Boolean bool = this.hasSignedUp;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }

    public User(Long l, Map<String, String> map, Account account, String str, Date date, Date date2, Boolean bool) {
        this.id = l;
        this.properties = map;
        this.kakaoAccount = account;
        this.groupUserToken = str;
        this.connectedAt = date;
        this.synchedAt = date2;
        this.hasSignedUp = bool;
    }
}
