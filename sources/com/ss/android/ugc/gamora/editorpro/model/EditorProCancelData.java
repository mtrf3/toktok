package com.ss.android.ugc.gamora.editorpro.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditorProCancelData extends EditorProResultData {
    public static final Parcelable.Creator<EditorProCancelData> CREATOR = new Parcelable.Creator<EditorProCancelData>() { // from class: X.5RX
        @Override // android.os.Parcelable.Creator
        public final EditorProCancelData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            parcel.readInt();
            return new EditorProCancelData();
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProCancelData[] newArray(int i) {
            return new EditorProCancelData[i];
        }
    };
    public MultiEditVideoRecordData curMultiEditData;
    public boolean exitByBackPressed;
    public boolean isRetake;

    @Override // com.ss.android.ugc.gamora.editorpro.model.EditorProResultData, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
