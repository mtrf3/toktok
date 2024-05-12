package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class MultiEditVideoStatusRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoStatusRecordData> CREATOR = new IDCreatorS51S0000000_7(17);

    @InterfaceC65349Pkn("edit_adjust_clips_state")
    public EditAdjustClipsState adjustClipsState;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("cover_img_path")
    public String coverImagePath;

    @InterfaceC65349Pkn("cur_multi_edit_data")
    public MultiEditVideoRecordData curMultiEditVideoRecordData;

    @InterfaceC65349Pkn("cur_select_index")
    public int currentEditIndex;

    @InterfaceC65349Pkn("edit_cut_segments")
    public ArrayList<TimeSpeedModelExtension> editCutSegments;

    @InterfaceC65349Pkn("edit_segments")
    public ArrayList<TimeSpeedModelExtension> editSegments;

    @InterfaceC65349Pkn("edit_library_mode")
    public boolean isLibraryMode;

    @InterfaceC65349Pkn("is_multi_edit_retake")
    public boolean isMultiEditRetake;

    @InterfaceC65349Pkn("is_support_multi_edit")
    public boolean isSupportMultiEdit;

    @InterfaceC65349Pkn("is_use_multi_edit")
    public boolean isUseMultiEdit;

    @InterfaceC65349Pkn("origin_multi_edit_data")
    public MultiEditVideoRecordData originMultiEditRecordData;

    @InterfaceC65349Pkn("original_music_start")
    public int originalMusicStart;

    @InterfaceC65349Pkn("original_segments")
    public ArrayList<TimeSpeedModelExtension> originalSegments;

    @InterfaceC65349Pkn("record_music")
    public AVMusic recordMusic;

    @InterfaceC65349Pkn("restore_multi_edit_data")
    public MultiEditVideoRecordData restoreMultiEditVideoRecordData;

    @InterfaceC65349Pkn("restore_edit_segments")
    public ArrayList<TimeSpeedModelExtension> restoreSegments;

    @InterfaceC65349Pkn("segment_size_change")
    public boolean segmentSizeChange;

    @InterfaceC65349Pkn("single_restore_multi_edit_data")
    public MultiEditVideoRecordData singleRestoreMultiEditRecordData;

    @InterfaceC65349Pkn("single_restore_segments")
    public ArrayList<TimeSpeedModelExtension> singleRestoreSegments;

    @InterfaceC65349Pkn("video_meta_data")
    public String videoMetaData;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MultiEditVideoStatusRecordData() {
        this.currentEditIndex = -1;
    }

    public MultiEditVideoStatusRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.currentEditIndex = -1;
        this.curMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.restoreMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.singleRestoreMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.originMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.currentEditIndex = parcel.readInt();
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.segmentSizeChange = z;
        Parcelable.Creator<TimeSpeedModelExtension> creator = TimeSpeedModelExtension.CREATOR;
        this.originalSegments = parcel.createTypedArrayList(creator);
        this.editSegments = parcel.createTypedArrayList(creator);
        this.restoreSegments = parcel.createTypedArrayList(creator);
        this.singleRestoreSegments = parcel.createTypedArrayList(creator);
        this.editCutSegments = parcel.createTypedArrayList(creator);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMultiEditRetake = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUseMultiEdit = z3;
        this.coverImagePath = parcel.readString();
        this.recordMusic = (AVMusic) parcel.readSerializable();
        this.originalMusicStart = parcel.readInt();
        this.videoMetaData = parcel.readString();
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isSupportMultiEdit = z4;
        this.adjustClipsState = (EditAdjustClipsState) parcel.readParcelable(EditAdjustClipsState.class.getClassLoader());
        this.isLibraryMode = parcel.readByte() == 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.curMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.restoreMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.singleRestoreMultiEditRecordData, i);
        parcel.writeParcelable(this.originMultiEditRecordData, i);
        parcel.writeInt(this.currentEditIndex);
        parcel.writeByte(this.segmentSizeChange ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.originalSegments);
        parcel.writeTypedList(this.editSegments);
        parcel.writeTypedList(this.restoreSegments);
        parcel.writeTypedList(this.singleRestoreSegments);
        parcel.writeTypedList(this.editCutSegments);
        parcel.writeByte(this.isMultiEditRetake ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isUseMultiEdit ? (byte) 1 : (byte) 0);
        parcel.writeString(this.coverImagePath);
        parcel.writeSerializable(this.recordMusic);
        parcel.writeInt(this.originalMusicStart);
        parcel.writeString(this.videoMetaData);
        parcel.writeByte(this.isSupportMultiEdit ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.adjustClipsState, i);
        parcel.writeByte(this.isLibraryMode ? (byte) 1 : (byte) 0);
    }
}
