package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import X.InterfaceC65349Pkn;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class MultiEditVideoRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoRecordData> CREATOR = new IDCreatorS47S0000000_2(5);

    @InterfaceC65349Pkn("concat_audio")
    public String concatAudio;

    @InterfaceC65349Pkn("concat_video")
    public String concatVideo;

    @InterfaceC65349Pkn("cover_path")
    public String coverPath;

    @InterfaceC65349Pkn("curRecordingDir")
    public String curRecordingDir;

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("from_advanced_edit")
    public boolean fromAdvancedEdit;

    @InterfaceC65349Pkn("from_cut")
    public boolean fromCut;

    @InterfaceC65349Pkn("has_retake")
    public boolean hasRetake;

    @InterfaceC65349Pkn("is_single_video")
    public boolean isSingleVideo;

    @InterfaceC65349Pkn("is_sound_loop")
    public boolean isSoundLoop;

    @InterfaceC65349Pkn("left_slide_x")
    public float leftSlideX;

    @InterfaceC65349Pkn("music_duration")
    public int musicDuration;

    @InterfaceC65349Pkn("music_path")
    public String musicPath;

    @InterfaceC65349Pkn("music_trimin")
    public int musicTrimIn;

    @InterfaceC65349Pkn("music_volume")
    public float musicVolume;

    @InterfaceC65349Pkn("origin_volume")
    public float originVolume;

    @InterfaceC65349Pkn("video_duration")
    public int preVideoDuration;

    @InterfaceC65349Pkn("right_slide_x")
    public float rightSlideX;

    @InterfaceC65349Pkn("segment_list")
    public List<MultiEditVideoSegmentRecordData> segmentDataList;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("use_music")
    public boolean useMusic;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MultiEditVideoRecordData cloneData() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.concatVideo = this.concatVideo;
        multiEditVideoRecordData.concatAudio = this.concatAudio;
        multiEditVideoRecordData.useMusic = this.useMusic;
        multiEditVideoRecordData.startTime = this.startTime;
        multiEditVideoRecordData.endTime = this.endTime;
        multiEditVideoRecordData.leftSlideX = this.leftSlideX;
        multiEditVideoRecordData.rightSlideX = this.rightSlideX;
        multiEditVideoRecordData.curRecordingDir = this.curRecordingDir;
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list != null) {
            Iterator<MultiEditVideoSegmentRecordData> it = list.iterator();
            while (it.hasNext()) {
                multiEditVideoRecordData.segmentDataList.add(it.next().cloneData());
            }
        }
        multiEditVideoRecordData.musicPath = this.musicPath;
        multiEditVideoRecordData.originVolume = this.originVolume;
        multiEditVideoRecordData.musicVolume = this.musicVolume;
        multiEditVideoRecordData.hasRetake = this.hasRetake;
        multiEditVideoRecordData.musicTrimIn = this.musicTrimIn;
        multiEditVideoRecordData.musicDuration = this.musicDuration;
        multiEditVideoRecordData.preVideoDuration = this.preVideoDuration;
        multiEditVideoRecordData.coverPath = this.coverPath;
        multiEditVideoRecordData.isSingleVideo = this.isSingleVideo;
        multiEditVideoRecordData.isSoundLoop = this.isSoundLoop;
        multiEditVideoRecordData.fromCut = this.fromCut;
        multiEditVideoRecordData.fromAdvancedEdit = this.fromAdvancedEdit;
        return multiEditVideoRecordData;
    }

    public MultiEditVideoRecordData cloneSegmentDataList() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list != null && !list.isEmpty()) {
            multiEditVideoRecordData.segmentDataList = new ArrayList();
            Iterator<MultiEditVideoSegmentRecordData> it = this.segmentDataList.iterator();
            while (it.hasNext()) {
                multiEditVideoRecordData.segmentDataList.add(it.next().cloneData());
            }
        }
        return multiEditVideoRecordData;
    }

    public List<MediaModel> convertMediaModelList() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MultiEditVideoSegmentRecordData> it = this.segmentDataList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertModel());
        }
        if (this.isSingleVideo) {
            MediaModel mediaModel = (MediaModel) ListProtector.get(arrayList, 0);
            long j = this.startTime;
            mediaModel.startTime = (int) j;
            long j2 = this.endTime;
            mediaModel.endTime = (int) j2;
            mediaModel.duration = j2 - j;
        }
        return arrayList;
    }

    public Pair<Integer, Integer> getPlayInOutTime() {
        int i;
        long j;
        long j2 = this.startTime;
        int i2 = (int) j2;
        long j3 = this.endTime;
        if (((int) (j3 - j2)) > 0) {
            j = j3 - j2;
        } else {
            List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
            if (list == null || list.isEmpty()) {
                i = 0;
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
            }
            j = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                j += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
            }
        }
        i = (int) j;
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
    }

    public void resetTimeData() {
        List<MultiEditVideoSegmentRecordData> list = this.segmentDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.startTime = 0L;
        this.endTime = 0L;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
            multiEditVideoSegmentRecordData.resetTime();
            this.endTime = (multiEditVideoSegmentRecordData.videoLength / 1000) + this.endTime;
        }
    }

    public MultiEditVideoRecordData() {
        this.originVolume = 0.5f;
        this.musicVolume = 0.5f;
    }

    public boolean isPlaySingleSegmentMusic() {
        if (this.musicDuration + 1000 >= ((Integer) getPlayInOutTime().second).intValue() - ((Integer) getPlayInOutTime().first).intValue()) {
            return true;
        }
        return false;
    }

    public MultiEditVideoRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.originVolume = 0.5f;
        this.musicVolume = 0.5f;
        this.segmentDataList = parcel.createTypedArrayList(MultiEditVideoSegmentRecordData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.leftSlideX = parcel.readFloat();
        this.rightSlideX = parcel.readFloat();
        this.curRecordingDir = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasRetake = z2;
        this.musicPath = parcel.readString();
        this.originVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        this.musicTrimIn = parcel.readInt();
        this.musicDuration = parcel.readInt();
        this.preVideoDuration = parcel.readInt();
        this.coverPath = parcel.readString();
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSingleVideo = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isSoundLoop = z4;
        if (parcel.readByte() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.fromCut = z5;
        this.fromAdvancedEdit = parcel.readByte() == 1;
    }

    public void copyData(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData == null) {
            return;
        }
        this.startTime = multiEditVideoRecordData.startTime;
        this.endTime = multiEditVideoRecordData.endTime;
        this.leftSlideX = multiEditVideoRecordData.leftSlideX;
        this.rightSlideX = multiEditVideoRecordData.rightSlideX;
        this.useMusic = multiEditVideoRecordData.useMusic;
        this.concatVideo = multiEditVideoRecordData.concatVideo;
        this.concatAudio = multiEditVideoRecordData.concatAudio;
        this.musicVolume = multiEditVideoRecordData.musicVolume;
        this.originVolume = multiEditVideoRecordData.originVolume;
        this.musicPath = multiEditVideoRecordData.musicPath;
        this.hasRetake = multiEditVideoRecordData.hasRetake;
        this.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        this.musicDuration = multiEditVideoRecordData.musicDuration;
        this.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        this.coverPath = multiEditVideoRecordData.coverPath;
        this.isSingleVideo = multiEditVideoRecordData.isSingleVideo;
        this.isSoundLoop = multiEditVideoRecordData.isSoundLoop;
        this.fromCut = multiEditVideoRecordData.fromCut;
        this.fromAdvancedEdit = multiEditVideoRecordData.fromAdvancedEdit;
    }

    public boolean isEqual(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!((MultiEditVideoSegmentRecordData) ListProtector.get(this.segmentDataList, i)).isEqual((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqualWithDeleteStatus(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        if (multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null || list.isEmpty() || (list2 = this.segmentDataList) == null || list2.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!((MultiEditVideoSegmentRecordData) ListProtector.get(this.segmentDataList, i)).isEqual((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)) || ((MultiEditVideoSegmentRecordData) ListProtector.get(this.segmentDataList, i)).enable != ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i)).enable) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.segmentDataList);
        parcel.writeByte(this.useMusic ? (byte) 1 : (byte) 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeFloat(this.leftSlideX);
        parcel.writeFloat(this.rightSlideX);
        parcel.writeString(this.curRecordingDir);
        parcel.writeByte(this.hasRetake ? (byte) 1 : (byte) 0);
        parcel.writeString(this.musicPath);
        parcel.writeFloat(this.originVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.musicDuration);
        parcel.writeInt(this.preVideoDuration);
        parcel.writeString(this.coverPath);
        parcel.writeByte(this.isSingleVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSoundLoop ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fromCut ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.fromAdvancedEdit ? (byte) 1 : (byte) 0);
    }
}
