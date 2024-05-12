package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.GPV;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public enum TabType implements Parcelable {
    PHOTO(0),
    PHOTO_AND_VIDEO(1),
    VIDEO(2);

    public static final Parcelable.Creator<TabType> CREATOR = new Parcelable.Creator<TabType>() { // from class: X.HCW
        @Override // android.os.Parcelable.Creator
        public final TabType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return TabType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabType[] newArray(int i) {
            return new TabType[i];
        }
    };

    @GPV
    public final int type;

    public static TabType valueOf(String str) {
        return (TabType) V0N.LJJJ(TabType.class, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(name());
    }

    public final int getType() {
        return this.type;
    }

    TabType(int i) {
        this.type = i;
    }
}
