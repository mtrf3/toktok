package com.ss.android.ugc.cut_ui;

import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.CutSourceType;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public enum CutSourceType implements Parcelable {
    URL("url"),
    ZIP("zip"),
    JSON("json"),
    WORKSPACE("workspace"),
    NEW("new");

    public static final Parcelable.Creator<CutSourceType> CREATOR = new Parcelable.Creator<CutSourceType>() { // from class: X.6qS
        @Override // android.os.Parcelable.Creator
        public final CutSourceType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return CutSourceType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CutSourceType[] newArray(int i) {
            return new CutSourceType[i];
        }
    };
    public final String desc;

    public static CutSourceType valueOf(String str) {
        return (CutSourceType) V0N.LJJJ(CutSourceType.class, str);
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

    public final String getDesc() {
        return this.desc;
    }

    CutSourceType(String str) {
        this.desc = str;
    }
}
