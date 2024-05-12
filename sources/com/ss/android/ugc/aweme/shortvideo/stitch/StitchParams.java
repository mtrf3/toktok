package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.AnonymousClass391;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.UPJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StitchParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<StitchParams> CREATOR = new Parcelable.Creator<StitchParams>() { // from class: X.5gw
        @Override // android.os.Parcelable.Creator
        public final StitchParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            o.LJIIIZ(parcel, "parcel");
            EditVideoSegment editVideoSegment = (EditVideoSegment) parcel.readParcelable(StitchParams.class.getClassLoader());
            String readString = parcel.readString();
            AVMusic aVMusic = (AVMusic) parcel.readSerializable();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String readString3 = parcel.readString();
            User user = (User) parcel.readSerializable();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            long readLong = parcel.readLong();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new StitchParams(editVideoSegment, readString, aVMusic, readString2, readInt, z, readString3, user, readString4, readString5, readLong, readString6, readString7, z2, z3, readLong2, readLong3, readInt2, z4, createStringArrayList, createStringArrayList2, z5, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StitchParams[] newArray(int i) {
            return new StitchParams[i];
        }
    };

    @InterfaceC65349Pkn(alternate = {"i"}, value = "aweme_id")
    public String awemeId;

    @InterfaceC65349Pkn(alternate = {"j"}, value = "chain")
    public String chain;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"m"}, value = "concat_audio_path")
    public String concatAudioPath;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"l"}, value = "concat_video_path")
    public String concatVideoPath;

    @InterfaceC65349Pkn(alternate = {"k"}, value = "duration")
    public long duration;

    @InterfaceC65349Pkn(alternate = {"n"}, value = "enable_mic")
    public boolean enableMic;

    @InterfaceC65349Pkn(alternate = {"q"}, value = "endTime")
    public long endTime;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn(alternate = {"t"}, value = "enterRecordFromFeed")
    public boolean enterRecordFromFeed;

    @InterfaceC65349Pkn(alternate = {"h"}, value = "from_user")
    public User fromUser;

    @InterfaceC65349Pkn(alternate = {"o"}, value = "is_muted")
    public boolean isMuted;

    @InterfaceC65349Pkn(alternate = {"f"}, value = "is_pgc_music")
    public boolean isPGCMusic;

    @InterfaceC65349Pkn(alternate = {"s"}, value = "isThroughStitchChain")
    public boolean isThroughStitchChain;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "music")
    public AVMusic music;

    @InterfaceC65349Pkn(alternate = {"g"}, value = "music_id")
    public String musicId;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn(alternate = {"d"}, value = "music_path")
    public String musicPath;

    @InterfaceC65349Pkn(alternate = {"e"}, value = "music_start")
    public int musicStart;

    @InterfaceC65349Pkn("origin_video_aigc_label_type")
    public int originVideoAIGCLabelType;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("recordAudioPathLists")
    public List<String> recordAudioPathLists;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("recordVideoPathLists")
    public List<String> recordVideoPathLists;

    @InterfaceC65349Pkn(alternate = {"p"}, value = "startTime")
    public long startTime;

    @InterfaceC65349Pkn(alternate = {"r"}, value = "stitchVideoDuration")
    public int stitchVideoDuration;

    @InterfaceC36436ERs
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
    public StitchParams() {
        /*
            r29 = this;
            r1 = 0
            r5 = 0
            r11 = 0
            r27 = 8388607(0x7fffff, float:1.1754942E-38)
            r0 = r29
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r5
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r13 = r1
            r14 = r1
            r15 = r5
            r16 = r5
            r17 = r11
            r19 = r11
            r21 = r5
            r22 = r5
            r23 = r1
            r24 = r1
            r25 = r5
            r26 = r5
            r28 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams.<init>():void");
    }

    public static /* synthetic */ StitchParams copy$default(StitchParams stitchParams, EditVideoSegment editVideoSegment, String str, AVMusic aVMusic, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, boolean z4, List list, List list2, boolean z5, int i3, int i4, Object obj) {
        EditVideoSegment editVideoSegment2 = editVideoSegment;
        long j4 = j;
        String str8 = str5;
        String str9 = str4;
        User user2 = user;
        AVMusic aVMusic2 = aVMusic;
        String str10 = str6;
        String str11 = str;
        String str12 = str7;
        String str13 = str2;
        int i5 = i;
        boolean z6 = z;
        String str14 = str3;
        int i6 = i3;
        boolean z7 = z5;
        List list3 = list;
        boolean z8 = z3;
        boolean z9 = z2;
        long j5 = j2;
        List list4 = list2;
        long j6 = j3;
        int i7 = i2;
        boolean z10 = z4;
        if ((i4 & 1) != 0) {
            editVideoSegment2 = stitchParams.videoSegment;
        }
        if ((i4 & 2) != 0) {
            str11 = stitchParams.videoPath;
        }
        if ((i4 & 4) != 0) {
            aVMusic2 = stitchParams.music;
        }
        if ((i4 & 8) != 0) {
            str13 = stitchParams.musicPath;
        }
        if ((i4 & 16) != 0) {
            i5 = stitchParams.musicStart;
        }
        if ((i4 & 32) != 0) {
            z6 = stitchParams.isPGCMusic;
        }
        if ((i4 & 64) != 0) {
            str14 = stitchParams.musicId;
        }
        if ((i4 & 128) != 0) {
            user2 = stitchParams.fromUser;
        }
        if ((i4 & 256) != 0) {
            str9 = stitchParams.awemeId;
        }
        if ((i4 & 512) != 0) {
            str8 = stitchParams.chain;
        }
        if ((i4 & 1024) != 0) {
            j4 = stitchParams.duration;
        }
        if ((i4 & 2048) != 0) {
            str10 = stitchParams.concatVideoPath;
        }
        if ((i4 & 4096) != 0) {
            str12 = stitchParams.concatAudioPath;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            z9 = stitchParams.enableMic;
        }
        if ((i4 & 16384) != 0) {
            z8 = stitchParams.isMuted;
        }
        if ((32768 & i4) != 0) {
            j5 = stitchParams.startTime;
        }
        if ((65536 & i4) != 0) {
            j6 = stitchParams.endTime;
        }
        if ((131072 & i4) != 0) {
            i7 = stitchParams.stitchVideoDuration;
        }
        if ((262144 & i4) != 0) {
            z10 = stitchParams.isThroughStitchChain;
        }
        if ((524288 & i4) != 0) {
            list3 = stitchParams.recordVideoPathLists;
        }
        if ((1048576 & i4) != 0) {
            list4 = stitchParams.recordAudioPathLists;
        }
        if ((2097152 & i4) != 0) {
            z7 = stitchParams.enterRecordFromFeed;
        }
        if ((i4 & 4194304) != 0) {
            i6 = stitchParams.originVideoAIGCLabelType;
        }
        boolean z11 = z7;
        int i8 = i6;
        return stitchParams.copy(editVideoSegment2, str11, aVMusic2, str13, i5, z6, str14, user2, str9, str8, j4, str10, str12, z9, z8, j5, j6, i7, z10, list3, list4, z11, i8);
    }

    public final StitchParams copy(EditVideoSegment editVideoSegment, String str, AVMusic aVMusic, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, boolean z4, List<String> recordVideoPathLists, List<String> recordAudioPathLists, boolean z5, int i3) {
        o.LJIIIZ(recordVideoPathLists, "recordVideoPathLists");
        o.LJIIIZ(recordAudioPathLists, "recordAudioPathLists");
        return new StitchParams(editVideoSegment, str, aVMusic, str2, i, z, str3, user, str4, str5, j, str6, str7, z2, z3, j2, j3, i2, z4, recordVideoPathLists, recordAudioPathLists, z5, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchParams)) {
            return false;
        }
        StitchParams stitchParams = (StitchParams) obj;
        return o.LJ(this.videoSegment, stitchParams.videoSegment) && o.LJ(this.videoPath, stitchParams.videoPath) && o.LJ(this.music, stitchParams.music) && o.LJ(this.musicPath, stitchParams.musicPath) && this.musicStart == stitchParams.musicStart && this.isPGCMusic == stitchParams.isPGCMusic && o.LJ(this.musicId, stitchParams.musicId) && o.LJ(this.fromUser, stitchParams.fromUser) && o.LJ(this.awemeId, stitchParams.awemeId) && o.LJ(this.chain, stitchParams.chain) && this.duration == stitchParams.duration && o.LJ(this.concatVideoPath, stitchParams.concatVideoPath) && o.LJ(this.concatAudioPath, stitchParams.concatAudioPath) && this.enableMic == stitchParams.enableMic && this.isMuted == stitchParams.isMuted && this.startTime == stitchParams.startTime && this.endTime == stitchParams.endTime && this.stitchVideoDuration == stitchParams.stitchVideoDuration && this.isThroughStitchChain == stitchParams.isThroughStitchChain && o.LJ(this.recordVideoPathLists, stitchParams.recordVideoPathLists) && o.LJ(this.recordAudioPathLists, stitchParams.recordAudioPathLists) && this.enterRecordFromFeed == stitchParams.enterRecordFromFeed && this.originVideoAIGCLabelType == stitchParams.originVideoAIGCLabelType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.videoSegment, i);
        out.writeString(this.videoPath);
        out.writeSerializable(this.music);
        out.writeString(this.musicPath);
        out.writeInt(this.musicStart);
        out.writeInt(this.isPGCMusic ? 1 : 0);
        out.writeString(this.musicId);
        out.writeSerializable(this.fromUser);
        out.writeString(this.awemeId);
        out.writeString(this.chain);
        out.writeLong(this.duration);
        out.writeString(this.concatVideoPath);
        out.writeString(this.concatAudioPath);
        out.writeInt(this.enableMic ? 1 : 0);
        out.writeInt(this.isMuted ? 1 : 0);
        out.writeLong(this.startTime);
        out.writeLong(this.endTime);
        out.writeInt(this.stitchVideoDuration);
        out.writeInt(this.isThroughStitchChain ? 1 : 0);
        out.writeStringList(this.recordVideoPathLists);
        out.writeStringList(this.recordAudioPathLists);
        out.writeInt(this.enterRecordFromFeed ? 1 : 0);
        out.writeInt(this.originVideoAIGCLabelType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
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
        AVMusic aVMusic = this.music;
        if (aVMusic == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVMusic.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str2 = this.musicPath;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i5 = (((i4 + hashCode4) * 31) + this.musicStart) * 31;
        boolean z = this.isPGCMusic;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i5 + i7) * 31;
        String str3 = this.musicId;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        User user = this.fromUser;
        if (user == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = user.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        String str4 = this.awemeId;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        String str5 = this.chain;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.duration, (i11 + hashCode8) * 31, 31);
        String str6 = this.concatVideoPath;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i12 = (LIZJ + hashCode9) * 31;
        String str7 = this.concatAudioPath;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i13 = (i12 + i) * 31;
        boolean z2 = this.enableMic;
        int i14 = z2;
        if (z2 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z3 = this.isMuted;
        int i16 = z3;
        if (z3 != 0) {
            i16 = 1;
        }
        int LIZJ2 = (JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, (i15 + i16) * 31, 31), 31) + this.stitchVideoDuration) * 31;
        boolean z4 = this.isThroughStitchChain;
        int i17 = z4;
        if (z4 != 0) {
            i17 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.recordAudioPathLists, AnonymousClass391.LIZIZ(this.recordVideoPathLists, (LIZJ2 + i17) * 31, 31), 31);
        if (!this.enterRecordFromFeed) {
            i6 = 0;
        }
        return ((LIZIZ + i6) * 31) + this.originVideoAIGCLabelType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StitchParams(videoSegment=");
        sb.append(this.videoSegment);
        sb.append(", videoPath=");
        sb.append(this.videoPath);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", musicPath=");
        sb.append(this.musicPath);
        sb.append(", musicStart=");
        sb.append(this.musicStart);
        sb.append(", isPGCMusic=");
        sb.append(this.isPGCMusic);
        sb.append(", musicId=");
        sb.append(this.musicId);
        sb.append(", fromUser=");
        sb.append(this.fromUser);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", chain=");
        sb.append(this.chain);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", concatVideoPath=");
        sb.append(this.concatVideoPath);
        sb.append(", concatAudioPath=");
        sb.append(this.concatAudioPath);
        sb.append(", enableMic=");
        sb.append(this.enableMic);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", stitchVideoDuration=");
        sb.append(this.stitchVideoDuration);
        sb.append(", isThroughStitchChain=");
        sb.append(this.isThroughStitchChain);
        sb.append(", recordVideoPathLists=");
        sb.append(this.recordVideoPathLists);
        sb.append(", recordAudioPathLists=");
        sb.append(this.recordAudioPathLists);
        sb.append(", enterRecordFromFeed=");
        sb.append(this.enterRecordFromFeed);
        sb.append(", originVideoAIGCLabelType=");
        return UPJ.LIZLLL(sb, this.originVideoAIGCLabelType, ')');
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getChain() {
        return this.chain;
    }

    public final String getConcatAudioPath() {
        return this.concatAudioPath;
    }

    public final String getConcatVideoPath() {
        return this.concatVideoPath;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableMic() {
        return this.enableMic;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getEnterRecordFromFeed() {
        return this.enterRecordFromFeed;
    }

    public final User getFromUser() {
        return this.fromUser;
    }

    public final AVMusic getMusic() {
        return this.music;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final int getOriginVideoAIGCLabelType() {
        return this.originVideoAIGCLabelType;
    }

    public final List<String> getRecordAudioPathLists() {
        return this.recordAudioPathLists;
    }

    public final List<String> getRecordVideoPathLists() {
        return this.recordVideoPathLists;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStitchVideoDuration() {
        return this.stitchVideoDuration;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final EditVideoSegment getVideoSegment() {
        return this.videoSegment;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    public final boolean isPGCMusic() {
        return this.isPGCMusic;
    }

    public final boolean isThroughStitchChain() {
        return this.isThroughStitchChain;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setChain(String str) {
        this.chain = str;
    }

    public final void setConcatAudioPath(String str) {
        this.concatAudioPath = str;
    }

    public final void setConcatVideoPath(String str) {
        this.concatVideoPath = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnableMic(boolean z) {
        this.enableMic = z;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEnterRecordFromFeed(boolean z) {
        this.enterRecordFromFeed = z;
    }

    public final void setFromUser(User user) {
        this.fromUser = user;
    }

    public final void setMusic(AVMusic aVMusic) {
        this.music = aVMusic;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicStart(int i) {
        this.musicStart = i;
    }

    public final void setMuted(boolean z) {
        this.isMuted = z;
    }

    public final void setOriginVideoAIGCLabelType(int i) {
        this.originVideoAIGCLabelType = i;
    }

    public final void setPGCMusic(boolean z) {
        this.isPGCMusic = z;
    }

    public final void setRecordAudioPathLists(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.recordAudioPathLists = list;
    }

    public final void setRecordVideoPathLists(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.recordVideoPathLists = list;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStitchVideoDuration(int i) {
        this.stitchVideoDuration = i;
    }

    public final void setThroughStitchChain(boolean z) {
        this.isThroughStitchChain = z;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setVideoSegment(EditVideoSegment editVideoSegment) {
        this.videoSegment = editVideoSegment;
    }

    public StitchParams(EditVideoSegment editVideoSegment, String str, AVMusic aVMusic, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, boolean z4, List<String> recordVideoPathLists, List<String> recordAudioPathLists, boolean z5, int i3) {
        o.LJIIIZ(recordVideoPathLists, "recordVideoPathLists");
        o.LJIIIZ(recordAudioPathLists, "recordAudioPathLists");
        this.videoSegment = editVideoSegment;
        this.videoPath = str;
        this.music = aVMusic;
        this.musicPath = str2;
        this.musicStart = i;
        this.isPGCMusic = z;
        this.musicId = str3;
        this.fromUser = user;
        this.awemeId = str4;
        this.chain = str5;
        this.duration = j;
        this.concatVideoPath = str6;
        this.concatAudioPath = str7;
        this.enableMic = z2;
        this.isMuted = z3;
        this.startTime = j2;
        this.endTime = j3;
        this.stitchVideoDuration = i2;
        this.isThroughStitchChain = z4;
        this.recordVideoPathLists = recordVideoPathLists;
        this.recordAudioPathLists = recordAudioPathLists;
        this.enterRecordFromFeed = z5;
        this.originVideoAIGCLabelType = i3;
    }

    public /* synthetic */ StitchParams(EditVideoSegment editVideoSegment, String str, AVMusic aVMusic, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, boolean z4, List list, List list2, boolean z5, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : editVideoSegment, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : aVMusic, (i4 & 8) != 0 ? null : str2, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : user, (i4 & 256) != 0 ? null : str4, (i4 & 512) != 0 ? null : str5, (i4 & 1024) != 0 ? 0L : j, (i4 & 2048) != 0 ? null : str6, (i4 & 4096) != 0 ? null : str7, (i4 & FileUtils.BUFFER_SIZE) != 0 ? true : z2, (i4 & 16384) != 0 ? false : z3, (32768 & i4) != 0 ? 0L : j2, (65536 & i4) != 0 ? 0L : j3, (131072 & i4) != 0 ? 0 : i2, (262144 & i4) != 0 ? false : z4, (524288 & i4) != 0 ? new ArrayList() : list, (1048576 & i4) != 0 ? new ArrayList() : list2, (2097152 & i4) != 0 ? false : z5, (i4 & 4194304) != 0 ? 0 : i3);
    }
}
