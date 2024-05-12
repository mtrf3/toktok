package com.ss.android.ugc.gamora.editorpro.model;

import X.OSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditorProSaveData extends EditorProResultData {
    public static final Parcelable.Creator<EditorProSaveData> CREATOR = new Parcelable.Creator<EditorProSaveData>() { // from class: X.5RY
        @Override // android.os.Parcelable.Creator
        public final EditorProSaveData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            parcel.readInt();
            return new EditorProSaveData();
        }

        @Override // android.os.Parcelable.Creator
        public final EditorProSaveData[] newArray(int i) {
            return new EditorProSaveData[i];
        }
    };
    public VideoPublishEditModel editModel;
    public boolean fromEditorProAnchor;
    public boolean hasUseEdit;
    public ArrayList<OSZ<String, String>> inlineCaptionCaches;

    @Override // com.ss.android.ugc.gamora.editorpro.model.EditorProResultData, android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
