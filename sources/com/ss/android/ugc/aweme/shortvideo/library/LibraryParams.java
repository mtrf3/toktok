package com.ss.android.ugc.aweme.shortvideo.library;

import X.C1FJ;
import X.C1FL;
import X.GAJ;
import X.InterfaceC65349Pkn;
import X.JBR;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<LibraryParams> CREATOR = new GAJ();

    @InterfaceC65349Pkn(alternate = {"m"}, value = "concat_audio_path")
    public String concatAudioPath;

    @InterfaceC65349Pkn(alternate = {"l"}, value = "concat_video_path")
    public String concatVideoPath;

    @InterfaceC65349Pkn(alternate = {"d"}, value = "contains_sound")
    public Boolean containsSound;

    @InterfaceC65349Pkn(alternate = {"k"}, value = "duration")
    public long duration;

    @InterfaceC65349Pkn(alternate = {"q"}, value = "endTime")
    public long endTime;

    @InterfaceC65349Pkn(alternate = {"h"}, value = "from_user")
    public String fromUser;

    @InterfaceC65349Pkn("original_image_copy_path")
    public String originalImageCopyPath;

    @InterfaceC65349Pkn(alternate = {"r"}, value = "rotation")
    public int rotation;

    @InterfaceC65349Pkn(alternate = {"s"}, value = "speed")
    public float speed;

    @InterfaceC65349Pkn(alternate = {"p"}, value = "startTime")
    public long startTime;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "type")
    public Integer type;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "video_path")
    public String videoPath;

    @InterfaceC65349Pkn(alternate = {"a"}, value = "video_segment")
    public EditVideoSegment videoSegment;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LibraryParams() {
        /*
            r19 = this;
            r1 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r17 = 8191(0x1fff, float:1.1478E-41)
            r0 = r19
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r8 = r1
            r9 = r1
            r10 = r6
            r12 = r6
            r14 = r1
            r18 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.library.LibraryParams.<init>():void");
    }

    public static /* synthetic */ LibraryParams copy$default(LibraryParams libraryParams, EditVideoSegment editVideoSegment, String str, Integer num, Boolean bool, String str2, long j, String str3, String str4, long j2, long j3, String str5, int i, float f, int i2, Object obj) {
        EditVideoSegment editVideoSegment2 = editVideoSegment;
        String str6 = str;
        String str7 = str2;
        Integer num2 = num;
        Boolean bool2 = bool;
        String str8 = str3;
        long j4 = j;
        long j5 = j2;
        String str9 = str4;
        String str10 = str5;
        long j6 = j3;
        int i3 = i;
        float f2 = f;
        if ((i2 & 1) != 0) {
            editVideoSegment2 = libraryParams.videoSegment;
        }
        if ((i2 & 2) != 0) {
            str6 = libraryParams.videoPath;
        }
        if ((i2 & 4) != 0) {
            num2 = libraryParams.type;
        }
        if ((i2 & 8) != 0) {
            bool2 = libraryParams.containsSound;
        }
        if ((i2 & 16) != 0) {
            str7 = libraryParams.fromUser;
        }
        if ((i2 & 32) != 0) {
            j4 = libraryParams.duration;
        }
        if ((i2 & 64) != 0) {
            str8 = libraryParams.concatVideoPath;
        }
        if ((i2 & 128) != 0) {
            str9 = libraryParams.concatAudioPath;
        }
        if ((i2 & 256) != 0) {
            j5 = libraryParams.startTime;
        }
        if ((i2 & 512) != 0) {
            j6 = libraryParams.endTime;
        }
        if ((i2 & 1024) != 0) {
            str10 = libraryParams.originalImageCopyPath;
        }
        if ((i2 & 2048) != 0) {
            i3 = libraryParams.rotation;
        }
        if ((i2 & 4096) != 0) {
            f2 = libraryParams.speed;
        }
        Boolean bool3 = bool2;
        return libraryParams.copy(editVideoSegment2, str6, num2, bool3, str7, j4, str8, str9, j5, j6, str10, i3, f2);
    }

    public final LibraryParams copy(EditVideoSegment editVideoSegment, String str, Integer num, Boolean bool, String str2, long j, String str3, String str4, long j2, long j3, String str5, int i, float f) {
        return new LibraryParams(editVideoSegment, str, num, bool, str2, j, str3, str4, j2, j3, str5, i, f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryParams)) {
            return false;
        }
        LibraryParams libraryParams = (LibraryParams) obj;
        return o.LJ(this.videoSegment, libraryParams.videoSegment) && o.LJ(this.videoPath, libraryParams.videoPath) && o.LJ(this.type, libraryParams.type) && o.LJ(this.containsSound, libraryParams.containsSound) && o.LJ(this.fromUser, libraryParams.fromUser) && this.duration == libraryParams.duration && o.LJ(this.concatVideoPath, libraryParams.concatVideoPath) && o.LJ(this.concatAudioPath, libraryParams.concatAudioPath) && this.startTime == libraryParams.startTime && this.endTime == libraryParams.endTime && o.LJ(this.originalImageCopyPath, libraryParams.originalImageCopyPath) && this.rotation == libraryParams.rotation && Float.compare(this.speed, libraryParams.speed) == 0;
    }

    public String toString() {
        return "LibraryParams(videoSegment=" + this.videoSegment + ", videoPath=" + this.videoPath + ", type=" + this.type + ", containsSound=" + this.containsSound + ", fromUser=" + this.fromUser + ", duration=" + this.duration + ", concatVideoPath=" + this.concatVideoPath + ", concatAudioPath=" + this.concatAudioPath + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", originalImageCopyPath=" + this.originalImageCopyPath + ", rotation=" + this.rotation + ", speed=" + this.speed + ')';
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        EditVideoSegment editVideoSegment = this.videoSegment;
        int i = 0;
        if (editVideoSegment == null) {
            hashCode = 0;
        } else {
            hashCode = editVideoSegment.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.videoPath;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.type;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool = this.containsSound;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.fromUser;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.duration, (i5 + hashCode5) * 31, 31);
        String str3 = this.concatVideoPath;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i6 = (LIZJ + hashCode6) * 31;
        String str4 = this.concatAudioPath;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, (i6 + hashCode7) * 31, 31), 31);
        String str5 = this.originalImageCopyPath;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return Float.floatToIntBits(this.speed) + ((((LIZJ2 + i) * 31) + this.rotation) * 31);
    }

    public final String getConcatAudioPath() {
        return this.concatAudioPath;
    }

    public final String getConcatVideoPath() {
        return this.concatVideoPath;
    }

    public final Boolean getContainsSound() {
        return this.containsSound;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getFromUser() {
        return this.fromUser;
    }

    public final String getOriginalImageCopyPath() {
        return this.originalImageCopyPath;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final EditVideoSegment getVideoSegment() {
        return this.videoSegment;
    }

    public final void setConcatAudioPath(String str) {
        this.concatAudioPath = str;
    }

    public final void setConcatVideoPath(String str) {
        this.concatVideoPath = str;
    }

    public final void setContainsSound(Boolean bool) {
        this.containsSound = bool;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setFromUser(String str) {
        this.fromUser = str;
    }

    public final void setOriginalImageCopyPath(String str) {
        this.originalImageCopyPath = str;
    }

    public final void setRotation(int i) {
        this.rotation = i;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setVideoSegment(EditVideoSegment editVideoSegment) {
        this.videoSegment = editVideoSegment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.videoSegment, i);
        out.writeString(this.videoPath);
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.containsSound;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.fromUser);
        out.writeLong(this.duration);
        out.writeString(this.concatVideoPath);
        out.writeString(this.concatAudioPath);
        out.writeLong(this.startTime);
        out.writeLong(this.endTime);
        out.writeString(this.originalImageCopyPath);
        out.writeInt(this.rotation);
        out.writeFloat(this.speed);
    }

    public LibraryParams(EditVideoSegment editVideoSegment, String str, Integer num, Boolean bool, String str2, long j, String str3, String str4, long j2, long j3, String str5, int i, float f) {
        this.videoSegment = editVideoSegment;
        this.videoPath = str;
        this.type = num;
        this.containsSound = bool;
        this.fromUser = str2;
        this.duration = j;
        this.concatVideoPath = str3;
        this.concatAudioPath = str4;
        this.startTime = j2;
        this.endTime = j3;
        this.originalImageCopyPath = str5;
        this.rotation = i;
        this.speed = f;
    }

    public /* synthetic */ LibraryParams(EditVideoSegment editVideoSegment, String str, Integer num, Boolean bool, String str2, long j, String str3, String str4, long j2, long j3, String str5, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : editVideoSegment, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? 0L : j2, (i2 & 512) == 0 ? j3 : 0L, (i2 & 1024) == 0 ? str5 : null, (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) != 0 ? 0.0f : f);
    }
}
