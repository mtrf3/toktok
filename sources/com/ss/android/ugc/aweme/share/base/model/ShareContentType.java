package com.ss.android.ugc.aweme.share.base.model;

import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public enum ShareContentType implements Parcelable {
    LINK(0),
    VIDEO(1),
    PHOTO(4),
    LINK_PLUS_PHOTO(5),
    LINK_PLUS_VIDEO(6),
    PHOTOS(7),
    ILEGAL(-2),
    DISABLE_SHARE(-1);

    public static final Parcelable.Creator<ShareContentType> CREATOR = new Parcelable.Creator<ShareContentType>() { // from class: X.OdK
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Enum, com.ss.android.ugc.aweme.share.base.model.ShareContentType] */
        @Override // android.os.Parcelable.Creator
        public final ShareContentType createFromParcel(Parcel in) {
            o.LJIIIZ(in, "in");
            return V0N.LJJJ(ShareContentType.class, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShareContentType[] newArray(int i) {
            return new ShareContentType[i];
        }
    };
    public final int num;

    public static ShareContentType valueOf(String str) {
        return (ShareContentType) V0N.LJJJ(ShareContentType.class, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(name());
    }

    public final int getNum() {
        return this.num;
    }

    ShareContentType(int i) {
        this.num = i;
    }
}
