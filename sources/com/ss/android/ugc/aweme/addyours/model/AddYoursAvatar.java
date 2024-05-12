package com.ss.android.ugc.aweme.addyours.model;

import X.C05040Hs;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursAvatar implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursAvatar> CREATOR = new Parcelable.Creator<AddYoursAvatar>() { // from class: X.8km
        @Override // android.os.Parcelable.Creator
        public final AddYoursAvatar createFromParcel(Parcel parcel) {
            Long valueOf;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            return new AddYoursAvatar(valueOf, (UrlModel) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursAvatar[] newArray(int i) {
            return new AddYoursAvatar[i];
        }
    };

    @InterfaceC65349Pkn("uid")
    public Long uid;

    @InterfaceC65349Pkn("user_avatar")
    public UrlModel userAvatar;

    @InterfaceC65349Pkn("user_nickname")
    public String userNickname;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursAvatar() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AddYoursAvatar copy$default(AddYoursAvatar addYoursAvatar, Long l, UrlModel urlModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = addYoursAvatar.uid;
        }
        if ((i & 2) != 0) {
            urlModel = addYoursAvatar.userAvatar;
        }
        if ((i & 4) != 0) {
            str = addYoursAvatar.userNickname;
        }
        return addYoursAvatar.copy(l, urlModel, str);
    }

    public final AddYoursAvatar copy(Long l, UrlModel urlModel, String str) {
        return new AddYoursAvatar(l, urlModel, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursAvatar)) {
            return false;
        }
        AddYoursAvatar addYoursAvatar = (AddYoursAvatar) obj;
        return o.LJ(this.uid, addYoursAvatar.uid) && o.LJ(this.userAvatar, addYoursAvatar.userAvatar) && o.LJ(this.userNickname, addYoursAvatar.userNickname);
    }

    public int hashCode() {
        Long l = this.uid;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        UrlModel urlModel = this.userAvatar;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.userNickname;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursAvatar(uid=");
        LIZ.append(this.uid);
        LIZ.append(", userAvatar=");
        LIZ.append(this.userAvatar);
        LIZ.append(", userNickname=");
        return q.LIZIZ(LIZ, this.userNickname, ')', LIZ);
    }

    public final Long getUid() {
        return this.uid;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserNickname() {
        return this.userNickname;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.uid;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeSerializable(this.userAvatar);
        out.writeString(this.userNickname);
    }

    public AddYoursAvatar(Long l, UrlModel urlModel, String str) {
        this.uid = l;
        this.userAvatar = urlModel;
        this.userNickname = str;
    }

    public /* synthetic */ AddYoursAvatar(Long l, UrlModel urlModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : urlModel, (i & 4) != 0 ? null : str);
    }
}
