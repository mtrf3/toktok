package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.V0N;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public enum EditPostPoiChangeType implements Parcelable, Serializable {
    UNKNOWN(0),
    ADD(1),
    MODIFY(2),
    DELETE(3);

    public static final Parcelable.Creator<EditPostPoiChangeType> CREATOR = new Parcelable.Creator<EditPostPoiChangeType>() { // from class: X.Gae
        @Override // android.os.Parcelable.Creator
        public final EditPostPoiChangeType createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return EditPostPoiChangeType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditPostPoiChangeType[] newArray(int i) {
            return new EditPostPoiChangeType[i];
        }
    };

    @GPV
    public final int value;

    public static EditPostPoiChangeType valueOf(String str) {
        return (EditPostPoiChangeType) V0N.LJJJ(EditPostPoiChangeType.class, str);
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

    public final int getValue() {
        return this.value;
    }

    EditPostPoiChangeType(int i) {
        this.value = i;
    }
}
