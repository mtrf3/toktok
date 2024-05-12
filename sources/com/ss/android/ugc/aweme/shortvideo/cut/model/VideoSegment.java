package com.ss.android.ugc.aweme.shortvideo.cut.model;

import X.C08380Uo;
import X.C44694HgQ;
import X.C5UB;
import X.EnumC82528WaC;
import X.H8A;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;

/* loaded from: classes8.dex */
public class VideoSegment implements Parcelable {
    public static final Parcelable.Creator<VideoSegment> CREATOR = new IDCreatorS51S0000000_7(14);
    public int bitRate;
    public int codecId;
    public long duration;
    public long end;
    public boolean fastImportDependHW;
    public int fps;
    public int gop;
    public int height;
    public int imageTranslationType;
    public boolean isDeleted;
    public boolean isGetVideoFrame;
    public boolean isImageType;
    public boolean isStickPointMode;
    public LibraryVideo libraryVideoSegment;
    public String lvFunction;
    public String lvPrevious;
    public String mDescription;
    public String mMusicId;
    public String md5;
    public final String originPath;
    public String path;
    public int rotate;
    public float scaleH;
    public float scaleW;
    public float speed;
    public String srcImagePath;
    public long start;
    public C5UB stickPointVideoSegment;
    public String thumbnail;
    public int videoIndex;
    public int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZ() {
        VEUtils.VEVideoFileInfo LIZIZ;
        if (!this.isImageType && (LIZIZ = H8A.LIZIZ(this.path)) != null) {
            this.width = LIZIZ.width;
            this.height = LIZIZ.height;
            this.fps = LIZIZ.fps;
            this.codecId = LIZIZ.codec;
            this.bitRate = LIZIZ.bitrate;
            this.gop = LIZIZ.keyFrameCount;
        }
    }

    public final int LIZIZ() {
        if (this.bitRate == 0) {
            LIZ();
        }
        return this.bitRate;
    }

    public final int LIZLLL() {
        if (this.codecId == 0) {
            LIZ();
        }
        return this.codecId;
    }

    public final int LJI() {
        if (this.fps == 0) {
            LIZ();
        }
        return this.fps;
    }

    public final boolean LJIIJ() {
        if (this.isStickPointMode && this.stickPointVideoSegment != null) {
            return true;
        }
        return false;
    }

    public final long LJ() {
        if (LJIIJ()) {
            return this.stickPointVideoSegment.getVideoEnd();
        }
        return this.end;
    }

    public final float LJIIIIZZ() {
        if (LJIIJ()) {
            return this.stickPointVideoSegment.getSpeed();
        }
        return this.speed;
    }

    public final long LJIIIZ() {
        if (LJIIJ()) {
            return this.stickPointVideoSegment.getVideoStart();
        }
        return this.start;
    }

    public VideoSegment(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.scaleW = 1.0f;
        this.scaleH = 1.0f;
        this.imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
        this.videoIndex = parcel.readInt();
        this.path = parcel.readString();
        this.duration = parcel.readLong();
        this.start = parcel.readLong();
        this.end = parcel.readLong();
        this.speed = parcel.readFloat();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.thumbnail = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isDeleted = z;
        this.rotate = parcel.readInt();
        this.md5 = parcel.readString();
        this.scaleW = parcel.readFloat();
        this.scaleH = parcel.readFloat();
        this.stickPointVideoSegment = (C5UB) parcel.readSerializable();
        this.libraryVideoSegment = (LibraryVideo) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isStickPointMode = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isGetVideoFrame = z3;
        this.imageTranslationType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isImageType = z4;
        this.originPath = parcel.readString();
        this.fastImportDependHW = parcel.readByte() != 0;
    }

    public final String LJII(boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            return C08380Uo.LIZ(LIZ, this.videoIndex, "", LIZ);
        }
        return this.path;
    }

    public final void LJIIJJI(long j) {
        if (LJIIJ()) {
            this.stickPointVideoSegment.setVideoEnd(j);
        } else {
            this.end = j;
        }
    }

    public final void LJIIL(String str) {
        this.path = str;
        this.isImageType = C44694HgQ.LJIJI(str, false);
    }

    public final void LJIILIIL(float f) {
        if (LJIIJ()) {
            this.stickPointVideoSegment.setSpeed(1.0f);
        } else {
            this.speed = f;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSegment)) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) obj;
        if (this.videoIndex == videoSegment.videoIndex && this.duration == videoSegment.duration && this.start == videoSegment.start && this.end == videoSegment.end && Float.compare(videoSegment.speed, this.speed) == 0 && this.width == videoSegment.width && this.height == videoSegment.height && this.isDeleted == videoSegment.isDeleted && (((str = this.path) == (str2 = videoSegment.path) || (str != null && str.equals(str2))) && ((str3 = this.thumbnail) == (str4 = videoSegment.thumbnail) || (str3 != null && str3.equals(str4))))) {
            String str5 = this.md5;
            String str6 = videoSegment.md5;
            if (str5 == str6) {
                return true;
            }
            if (str5 != null && str5.equals(str6)) {
                return true;
            }
        }
        return false;
    }

    public VideoSegment(MediaModel mediaModel) {
        this.scaleW = 1.0f;
        this.scaleH = 1.0f;
        this.imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
        this.path = mediaModel.fileLocalUriPath;
        this.width = mediaModel.width;
        this.height = mediaModel.height;
        this.thumbnail = mediaModel.thumbnail;
        long j = mediaModel.duration;
        this.duration = j;
        this.start = mediaModel.startTime;
        int i = mediaModel.endTime;
        if (i > 0) {
            this.end = i;
        } else {
            this.end = j;
        }
        this.speed = mediaModel.speed;
        this.isImageType = C44694HgQ.LJIJJ(mediaModel);
        this.originPath = this.path;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.videoIndex);
        parcel.writeString(this.path);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.start);
        parcel.writeLong(this.end);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.thumbnail);
        parcel.writeByte(this.isDeleted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.rotate);
        parcel.writeString(this.md5);
        parcel.writeFloat(this.scaleW);
        parcel.writeFloat(this.scaleH);
        parcel.writeSerializable(this.stickPointVideoSegment);
        parcel.writeSerializable(this.libraryVideoSegment);
        parcel.writeInt(this.isStickPointMode ? 1 : 0);
        parcel.writeInt(this.isGetVideoFrame ? 1 : 0);
        parcel.writeInt(this.imageTranslationType);
        parcel.writeByte(this.isImageType ? (byte) 1 : (byte) 0);
        parcel.writeString(this.originPath);
        parcel.writeByte(this.fastImportDependHW ? (byte) 1 : (byte) 0);
    }

    public VideoSegment(String str, int i, int i2, int i3) {
        this.scaleW = 1.0f;
        this.scaleH = 1.0f;
        this.imageTranslationType = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
        this.path = str;
        this.width = i;
        this.height = i2;
        this.thumbnail = "";
        long j = i3;
        this.duration = j;
        this.end = j;
        this.speed = EnumC82528WaC.NORMAL.value();
        this.isImageType = C44694HgQ.LJIJI(str, false);
        this.originPath = this.path;
    }
}
