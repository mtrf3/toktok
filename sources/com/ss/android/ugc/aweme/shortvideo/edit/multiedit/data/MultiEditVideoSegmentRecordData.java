package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import X.C47135Ieh;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class MultiEditVideoSegmentRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoSegmentRecordData> CREATOR = new IDCreatorS51S0000000_7(16);

    @InterfaceC65349Pkn("audio_length")
    public long audioLength;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("audio_path")
    public String audioPath;

    @InterfaceC65349Pkn("audio_speed")
    public float audioSpeed;

    @InterfaceC65349Pkn("draft_audio_path")
    public String draftAudioPath;

    @InterfaceC65349Pkn("draft_video_path")
    public String draftVideoPath;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("endTime")
    public long endTime;

    @InterfaceC65349Pkn("fast_import_origin_video_path")
    public String fastImportOriginVideoPath;

    @InterfaceC65349Pkn("frameLeakProbability")
    public int frameLeakProbability;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("is_mute")
    public boolean isMute;

    @InterfaceC65349Pkn("library_material_info")
    public LibraryMaterialInfoSv libraryMaterialInfo;

    @InterfaceC65349Pkn("edit_trim_state")
    public MultiEditTrimState multiEditTrimState;

    @InterfaceC65349Pkn("music_sync_data")
    public MusicSyncData musicSyncData;

    @InterfaceC65349Pkn("rotate")
    public int rotate;

    @InterfaceC65349Pkn("scale")
    public float scale;

    @InterfaceC65349Pkn("startTime")
    public long startTime;

    @InterfaceC65349Pkn("video_key")
    public int videoKey;

    @InterfaceC65349Pkn("video_length")
    public long videoLength;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("video_path")
    public String videoPath;

    @InterfaceC65349Pkn("speed")
    public float videoSpeed;

    @InterfaceC65349Pkn("width")
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MultiEditVideoSegmentRecordData cloneData() {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = this.videoPath;
        multiEditVideoSegmentRecordData.videoLength = this.videoLength;
        multiEditVideoSegmentRecordData.draftVideoPath = this.draftVideoPath;
        multiEditVideoSegmentRecordData.draftAudioPath = this.draftAudioPath;
        multiEditVideoSegmentRecordData.audioPath = this.audioPath;
        multiEditVideoSegmentRecordData.audioLength = this.audioLength;
        multiEditVideoSegmentRecordData.videoSpeed = this.videoSpeed;
        multiEditVideoSegmentRecordData.audioSpeed = this.audioSpeed;
        multiEditVideoSegmentRecordData.startTime = this.startTime;
        multiEditVideoSegmentRecordData.endTime = this.endTime;
        multiEditVideoSegmentRecordData.rotate = this.rotate;
        multiEditVideoSegmentRecordData.frameLeakProbability = this.frameLeakProbability;
        multiEditVideoSegmentRecordData.videoKey = this.videoKey;
        multiEditVideoSegmentRecordData.enable = this.enable;
        multiEditVideoSegmentRecordData.width = this.width;
        multiEditVideoSegmentRecordData.height = this.height;
        multiEditVideoSegmentRecordData.scale = this.scale;
        multiEditVideoSegmentRecordData.isMute = this.isMute;
        multiEditVideoSegmentRecordData.musicSyncData = this.musicSyncData;
        multiEditVideoSegmentRecordData.libraryMaterialInfo = this.libraryMaterialInfo;
        multiEditVideoSegmentRecordData.multiEditTrimState = this.multiEditTrimState;
        multiEditVideoSegmentRecordData.fastImportOriginVideoPath = this.fastImportOriginVideoPath;
        return multiEditVideoSegmentRecordData;
    }

    public MediaModel convertModel() {
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.fileLocalUriPath = this.videoPath;
        mediaModel.duration = this.videoLength / 1000;
        mediaModel.width = this.width;
        mediaModel.height = this.height;
        mediaModel.startTime = (int) this.startTime;
        mediaModel.endTime = (int) this.endTime;
        mediaModel.speed = this.videoSpeed;
        return mediaModel;
    }

    public long getEndTime() {
        MusicSyncData musicSyncData = this.musicSyncData;
        if (musicSyncData != null) {
            return musicSyncData.getVideoEnd();
        }
        return this.endTime;
    }

    public long getStartTime() {
        MusicSyncData musicSyncData = this.musicSyncData;
        if (musicSyncData != null) {
            return musicSyncData.getVideoStart();
        }
        return this.startTime;
    }

    public float getVideoSpeed() {
        if (this.musicSyncData != null) {
            return 1.0f;
        }
        return this.videoSpeed;
    }

    public void resetTime() {
        this.startTime = 0L;
        this.endTime = this.videoLength / 1000;
        this.frameLeakProbability = 0;
    }

    public MultiEditVideoSegmentRecordData() {
        this.videoSpeed = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1280;
        this.enable = true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiEditVideoSegmentRecordData{videoPath=");
        LIZ.append(this.videoPath);
        LIZ.append(", videoLength=");
        LIZ.append(this.videoLength);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        return C47135Ieh.LIZIZ(LIZ, this.endTime, '}', LIZ);
    }

    public long getOriginEndTime() {
        return this.endTime;
    }

    public long getOriginStartTime() {
        return this.startTime;
    }

    public float getOriginVideoSpeed() {
        return this.videoSpeed;
    }

    public MultiEditVideoSegmentRecordData(Parcel parcel) {
        boolean z;
        this.videoSpeed = 1.0f;
        this.audioSpeed = 1.0f;
        this.width = 720;
        this.height = 1280;
        this.enable = true;
        this.videoPath = parcel.readString();
        this.draftVideoPath = parcel.readString();
        this.audioPath = parcel.readString();
        this.draftAudioPath = parcel.readString();
        this.videoLength = parcel.readLong();
        this.audioLength = parcel.readLong();
        this.videoSpeed = parcel.readFloat();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.rotate = parcel.readInt();
        this.audioSpeed = parcel.readFloat();
        this.frameLeakProbability = parcel.readInt();
        this.videoKey = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enable = z;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.scale = parcel.readFloat();
        this.musicSyncData = (MusicSyncData) parcel.readParcelable(MusicSyncData.class.getClassLoader());
        this.libraryMaterialInfo = (LibraryMaterialInfoSv) parcel.readParcelable(LibraryMaterialInfoSv.class.getClassLoader());
        this.multiEditTrimState = (MultiEditTrimState) parcel.readParcelable(MultiEditTrimState.class.getClassLoader());
        this.isMute = parcel.readByte() != 0;
        this.fastImportOriginVideoPath = parcel.readString();
    }

    public void copyData(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData == null) {
            return;
        }
        this.videoPath = multiEditVideoSegmentRecordData.videoPath;
        this.audioPath = multiEditVideoSegmentRecordData.audioPath;
        this.videoLength = multiEditVideoSegmentRecordData.videoLength;
        this.audioLength = multiEditVideoSegmentRecordData.audioLength;
        this.startTime = multiEditVideoSegmentRecordData.startTime;
        this.endTime = multiEditVideoSegmentRecordData.endTime;
        this.videoSpeed = multiEditVideoSegmentRecordData.videoSpeed;
        this.audioSpeed = multiEditVideoSegmentRecordData.audioSpeed;
        this.rotate = multiEditVideoSegmentRecordData.rotate;
        this.frameLeakProbability = multiEditVideoSegmentRecordData.frameLeakProbability;
        this.videoKey = multiEditVideoSegmentRecordData.videoKey;
        this.enable = multiEditVideoSegmentRecordData.enable;
        this.width = multiEditVideoSegmentRecordData.width;
        this.height = multiEditVideoSegmentRecordData.height;
        this.scale = multiEditVideoSegmentRecordData.scale;
        this.musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
        this.libraryMaterialInfo = multiEditVideoSegmentRecordData.libraryMaterialInfo;
        this.multiEditTrimState = multiEditVideoSegmentRecordData.multiEditTrimState;
        this.isMute = multiEditVideoSegmentRecordData.isMute;
        this.fastImportOriginVideoPath = multiEditVideoSegmentRecordData.fastImportOriginVideoPath;
    }

    public boolean isEqual(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData == null || !TextUtils.equals(this.videoPath, multiEditVideoSegmentRecordData.videoPath) || this.videoLength != multiEditVideoSegmentRecordData.videoLength || !TextUtils.equals(this.audioPath, multiEditVideoSegmentRecordData.audioPath) || this.audioLength != multiEditVideoSegmentRecordData.audioLength || this.videoSpeed != multiEditVideoSegmentRecordData.videoSpeed || this.audioSpeed != multiEditVideoSegmentRecordData.audioSpeed || this.startTime != multiEditVideoSegmentRecordData.startTime || this.endTime != multiEditVideoSegmentRecordData.endTime || this.rotate != multiEditVideoSegmentRecordData.rotate || this.musicSyncData != multiEditVideoSegmentRecordData.musicSyncData) {
            return false;
        }
        return true;
    }

    public void setEndTime(long j) {
        MusicSyncData musicSyncData = this.musicSyncData;
        if (musicSyncData != null) {
            this.musicSyncData = musicSyncData.copy(musicSyncData.getVideoStart(), j, this.musicSyncData.getVideoDuration());
        } else {
            this.endTime = j;
        }
    }

    public void setStartTime(long j) {
        MusicSyncData musicSyncData = this.musicSyncData;
        if (musicSyncData != null) {
            this.musicSyncData = musicSyncData.copy(j, musicSyncData.getVideoEnd(), this.musicSyncData.getVideoDuration());
        } else {
            this.startTime = j;
        }
    }

    public void setVideoSpeed(float f) {
        if (this.musicSyncData == null) {
            this.videoSpeed = f;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.draftVideoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.draftAudioPath);
        parcel.writeLong(this.videoLength);
        parcel.writeLong(this.audioLength);
        parcel.writeFloat(this.videoSpeed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.rotate);
        parcel.writeFloat(this.audioSpeed);
        parcel.writeInt(this.frameLeakProbability);
        parcel.writeInt(this.videoKey);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.scale);
        parcel.writeParcelable(this.musicSyncData, i);
        parcel.writeParcelable(this.libraryMaterialInfo, i);
        parcel.writeParcelable(this.multiEditTrimState, i);
        parcel.writeByte(this.isMute ? (byte) 1 : (byte) 0);
        parcel.writeString(this.fastImportOriginVideoPath);
    }
}
