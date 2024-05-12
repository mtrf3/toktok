package com.ss.android.ugc.cut_ui;

import X.C172816qL;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CutSource extends F9E implements Parcelable {
    public final CutSourceType type;
    public final String value;
    public static final C172816qL Companion = new Object() { // from class: X.6qL
    };
    public static final Parcelable.Creator<CutSource> CREATOR = new Parcelable.Creator<CutSource>() { // from class: X.6qK
        @Override // android.os.Parcelable.Creator
        public final CutSource createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CutSource(parcel.readString(), CutSourceType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CutSource[] newArray(int i) {
            return new CutSource[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.value, this.type};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.value);
        this.type.writeToParcel(out, i);
    }

    public CutSource(String value, CutSourceType type) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(type, "type");
        this.value = value;
        this.type = type;
    }
}
