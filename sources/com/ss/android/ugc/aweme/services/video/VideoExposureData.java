package com.ss.android.ugc.aweme.services.video;

import X.C47959Irz;
import X.C79062V1e;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoModeExposureData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoExposureData implements Parcelable {
    public static final Parcelable.Creator<VideoExposureData> CREATOR = new Creator();
    public final AVUploadSaveModel avUploadSaveModel;
    public final String creationId;
    public final String draftPrimaryKey;
    public final String inputVideoFile;
    public final boolean isSaveLocal;
    public final String localFinalPath;
    public final String mainBusinessData;
    public final MusicBuzModel musicInfo;
    public final int origin;
    public final String outPutFile;
    public final String path;
    public final PhotoModeExposureData photoModeExposureData;
    public final String shootWay;
    public final float videoCoverStartTm;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<VideoExposureData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoExposureData createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new VideoExposureData(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (AVUploadSaveModel) parcel.readParcelable(VideoExposureData.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (MusicBuzModel) parcel.readParcelable(VideoExposureData.class.getClassLoader()), parcel.readInt() == 0 ? null : PhotoModeExposureData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoExposureData[] newArray(int i) {
            return new VideoExposureData[i];
        }
    }

    public static /* synthetic */ VideoExposureData copy$default(VideoExposureData videoExposureData, String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8, MusicBuzModel musicBuzModel, PhotoModeExposureData photoModeExposureData, int i2, Object obj) {
        String str9 = str;
        float f2 = f;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        boolean z2 = z;
        String str14 = str6;
        AVUploadSaveModel aVUploadSaveModel2 = aVUploadSaveModel;
        int i3 = i;
        String str15 = str7;
        String str16 = str8;
        MusicBuzModel musicBuzModel2 = musicBuzModel;
        PhotoModeExposureData photoModeExposureData2 = photoModeExposureData;
        if ((i2 & 1) != 0) {
            str9 = videoExposureData.path;
        }
        if ((i2 & 2) != 0) {
            f2 = videoExposureData.videoCoverStartTm;
        }
        if ((i2 & 4) != 0) {
            str10 = videoExposureData.mainBusinessData;
        }
        if ((i2 & 8) != 0) {
            str11 = videoExposureData.outPutFile;
        }
        if ((i2 & 16) != 0) {
            str12 = videoExposureData.inputVideoFile;
        }
        if ((i2 & 32) != 0) {
            str13 = videoExposureData.creationId;
        }
        if ((i2 & 64) != 0) {
            z2 = videoExposureData.isSaveLocal;
        }
        if ((i2 & 128) != 0) {
            str14 = videoExposureData.localFinalPath;
        }
        if ((i2 & 256) != 0) {
            aVUploadSaveModel2 = videoExposureData.avUploadSaveModel;
        }
        if ((i2 & 512) != 0) {
            i3 = videoExposureData.origin;
        }
        if ((i2 & 1024) != 0) {
            str15 = videoExposureData.draftPrimaryKey;
        }
        if ((i2 & 2048) != 0) {
            str16 = videoExposureData.shootWay;
        }
        if ((i2 & 4096) != 0) {
            musicBuzModel2 = videoExposureData.musicInfo;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            photoModeExposureData2 = videoExposureData.photoModeExposureData;
        }
        return videoExposureData.copy(str9, f2, str10, str11, str12, str13, z2, str14, aVUploadSaveModel2, i3, str15, str16, musicBuzModel2, photoModeExposureData2);
    }

    public final VideoExposureData copy(String path, float f, String str, String outPutFile, String inputVideoFile, String creationId, boolean z, String str2, AVUploadSaveModel aVUploadSaveModel, int i, String str3, String str4, MusicBuzModel musicInfo, PhotoModeExposureData photoModeExposureData) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(outPutFile, "outPutFile");
        o.LJIIIZ(inputVideoFile, "inputVideoFile");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(musicInfo, "musicInfo");
        return new VideoExposureData(path, f, str, outPutFile, inputVideoFile, creationId, z, str2, aVUploadSaveModel, i, str3, str4, musicInfo, photoModeExposureData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoExposureData)) {
            return false;
        }
        VideoExposureData videoExposureData = (VideoExposureData) obj;
        return o.LJ(this.path, videoExposureData.path) && Float.compare(this.videoCoverStartTm, videoExposureData.videoCoverStartTm) == 0 && o.LJ(this.mainBusinessData, videoExposureData.mainBusinessData) && o.LJ(this.outPutFile, videoExposureData.outPutFile) && o.LJ(this.inputVideoFile, videoExposureData.inputVideoFile) && o.LJ(this.creationId, videoExposureData.creationId) && this.isSaveLocal == videoExposureData.isSaveLocal && o.LJ(this.localFinalPath, videoExposureData.localFinalPath) && o.LJ(this.avUploadSaveModel, videoExposureData.avUploadSaveModel) && this.origin == videoExposureData.origin && o.LJ(this.draftPrimaryKey, videoExposureData.draftPrimaryKey) && o.LJ(this.shootWay, videoExposureData.shootWay) && o.LJ(this.musicInfo, videoExposureData.musicInfo) && o.LJ(this.photoModeExposureData, videoExposureData.photoModeExposureData);
    }

    public String toString() {
        return "VideoExposureData(path=" + this.path + ", videoCoverStartTm=" + this.videoCoverStartTm + ", mainBusinessData=" + this.mainBusinessData + ", outPutFile=" + this.outPutFile + ", inputVideoFile=" + this.inputVideoFile + ", creationId=" + this.creationId + ", isSaveLocal=" + this.isSaveLocal + ", localFinalPath=" + this.localFinalPath + ", avUploadSaveModel=" + this.avUploadSaveModel + ", origin=" + this.origin + ", draftPrimaryKey=" + this.draftPrimaryKey + ", shootWay=" + this.shootWay + ", musicInfo=" + this.musicInfo + ", photoModeExposureData=" + this.photoModeExposureData + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.path);
        out.writeFloat(this.videoCoverStartTm);
        out.writeString(this.mainBusinessData);
        out.writeString(this.outPutFile);
        out.writeString(this.inputVideoFile);
        out.writeString(this.creationId);
        out.writeInt(this.isSaveLocal ? 1 : 0);
        out.writeString(this.localFinalPath);
        out.writeParcelable(this.avUploadSaveModel, i);
        out.writeInt(this.origin);
        out.writeString(this.draftPrimaryKey);
        out.writeString(this.shootWay);
        out.writeParcelable(this.musicInfo, i);
        PhotoModeExposureData photoModeExposureData = this.photoModeExposureData;
        if (photoModeExposureData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            photoModeExposureData.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int LIZIZ = C47959Irz.LIZIZ(this.videoCoverStartTm, this.path.hashCode() * 31, 31);
        String str = this.mainBusinessData;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.creationId, C79062V1e.LJ(this.inputVideoFile, C79062V1e.LJ(this.outPutFile, (LIZIZ + hashCode) * 31, 31), 31), 31);
        boolean z = this.isSaveLocal;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LJ + i2) * 31;
        String str2 = this.localFinalPath;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.avUploadSaveModel;
        if (aVUploadSaveModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVUploadSaveModel.hashCode();
        }
        int i5 = (((i4 + hashCode3) * 31) + this.origin) * 31;
        String str3 = this.draftPrimaryKey;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str4 = this.shootWay;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int hashCode6 = (this.musicInfo.hashCode() + ((i6 + hashCode5) * 31)) * 31;
        PhotoModeExposureData photoModeExposureData = this.photoModeExposureData;
        if (photoModeExposureData != null) {
            i = photoModeExposureData.hashCode();
        }
        return hashCode6 + i;
    }

    public final AVUploadSaveModel getAvUploadSaveModel() {
        return this.avUploadSaveModel;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getDraftPrimaryKey() {
        return this.draftPrimaryKey;
    }

    public final String getInputVideoFile() {
        return this.inputVideoFile;
    }

    public final String getLocalFinalPath() {
        return this.localFinalPath;
    }

    public final String getMainBusinessData() {
        return this.mainBusinessData;
    }

    public final MusicBuzModel getMusicInfo() {
        return this.musicInfo;
    }

    public final int getOrigin() {
        return this.origin;
    }

    public final String getOutPutFile() {
        return this.outPutFile;
    }

    public final String getPath() {
        return this.path;
    }

    public final PhotoModeExposureData getPhotoModeExposureData() {
        return this.photoModeExposureData;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final float getVideoCoverStartTm() {
        return this.videoCoverStartTm;
    }

    public final boolean isSaveLocal() {
        return this.isSaveLocal;
    }

    public VideoExposureData(String path, float f, String str, String outPutFile, String inputVideoFile, String creationId, boolean z, String str2, AVUploadSaveModel aVUploadSaveModel, int i, String str3, String str4, MusicBuzModel musicInfo, PhotoModeExposureData photoModeExposureData) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(outPutFile, "outPutFile");
        o.LJIIIZ(inputVideoFile, "inputVideoFile");
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(musicInfo, "musicInfo");
        this.path = path;
        this.videoCoverStartTm = f;
        this.mainBusinessData = str;
        this.outPutFile = outPutFile;
        this.inputVideoFile = inputVideoFile;
        this.creationId = creationId;
        this.isSaveLocal = z;
        this.localFinalPath = str2;
        this.avUploadSaveModel = aVUploadSaveModel;
        this.origin = i;
        this.draftPrimaryKey = str3;
        this.shootWay = str4;
        this.musicInfo = musicInfo;
        this.photoModeExposureData = photoModeExposureData;
    }

    public /* synthetic */ VideoExposureData(String str, float f, String str2, String str3, String str4, String str5, boolean z, String str6, AVUploadSaveModel aVUploadSaveModel, int i, String str7, String str8, MusicBuzModel musicBuzModel, PhotoModeExposureData photoModeExposureData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, str2, str3, str4, str5, z, str6, aVUploadSaveModel, i, str7, str8, musicBuzModel, (i2 & FileUtils.BUFFER_SIZE) != 0 ? null : photoModeExposureData);
    }
}
