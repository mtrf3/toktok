package com.ss.android.ugc.gamora.editorpro.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.gamora.editorpro.model.EditorProResultData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class EditorProResultData implements Parcelable {
    public static final Parcelable.Creator<EditorProResultData> CREATOR = new Parcelable.Creator<EditorProResultData>() { // from class: X.5Ra
        @Override // android.os.Parcelable.Creator
        public final EditorProResultData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            parcel.readInt();
            return new EditorProResultData();
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProResultData[] newArray(int i) {
            return new EditorProResultData[i];
        }
    };
    public boolean effectMultiTrackMode;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
