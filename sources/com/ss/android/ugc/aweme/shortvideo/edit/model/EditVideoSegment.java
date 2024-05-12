package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C149685u8;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class EditVideoSegment implements Parcelable, Serializable {

    @InterfaceC43620HAa
    public String audioPath;
    public transient boolean isImage;
    public transient String muxPath;
    public VideoCutInfo videoCutInfo;
    public final VideoFileInfo videoFileInfo;

    @InterfaceC36436ERs
    @InterfaceC43620HAa(blockCreative = true)
    public String videoPath;
    public static final C149685u8 Companion = new Object() { // from class: X.5u8
    };
    public static final Parcelable.Creator<EditVideoSegment> CREATOR = new IDCreatorS47S0000000_2(4);

    public final EditVideoSegment copy() {
        return copy$default(this, null, null, null, null, 15, null);
    }

    public final EditVideoSegment copy(String str) {
        return copy$default(this, str, null, null, null, 14, null);
    }

    public final EditVideoSegment copy(String str, String str2) {
        return copy$default(this, str, str2, null, null, 12, null);
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo) {
        return copy$default(this, str, str2, videoFileInfo, null, 8, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final String getMuxPath() {
        return this.muxPath;
    }

    public final VideoCutInfo getVideoCutInfo() {
        return this.videoCutInfo;
    }

    public final VideoFileInfo getVideoFileInfo() {
        return this.videoFileInfo;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final boolean isImage() {
        return this.isImage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditVideoSegment(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r2 = r4.readString()
            if (r2 == 0) goto L42
            java.lang.String r1 = r4.readString()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo> r0 = com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo) r0
            if (r0 == 0) goto L3a
            r3.<init>(r2, r1, r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo> r0 = com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r0 = (com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo) r0
            r3.videoCutInfo = r0
            int r1 = r4.readInt()
            r0 = 1
            if (r1 != r0) goto L38
        L35:
            r3.isImage = r0
            return
        L38:
            r0 = 0
            goto L35
        L3a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "create EditVideoSegment instance with invalid VideoFileInfo"
            r1.<init>(r0)
            throw r1
        L42:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "create EditVideoSegment instance with invalid videoPath"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment.<init>(android.os.Parcel):void");
    }

    public final void setAudioPath(String str) {
        this.audioPath = str;
    }

    public final void setImage(boolean z) {
        this.isImage = z;
    }

    public final void setMuxPath(String str) {
        this.muxPath = str;
    }

    public final void setVideoCutInfo(VideoCutInfo videoCutInfo) {
        this.videoCutInfo = videoCutInfo;
    }

    public final void setVideoPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.videoPath = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.videoPath);
        dest.writeString(this.audioPath);
        dest.writeParcelable(this.videoFileInfo, i);
        dest.writeParcelable(this.videoCutInfo, i);
        dest.writeInt(this.isImage ? 1 : 0);
    }

    public EditVideoSegment(String videoPath, String str, VideoFileInfo videoFileInfo) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(videoFileInfo, "videoFileInfo");
        this.videoPath = videoPath;
        this.audioPath = str;
        this.videoFileInfo = videoFileInfo;
    }

    public final EditVideoSegment copy(String videoPath, String str, VideoFileInfo videoFileInfo, VideoCutInfo videoCutInfo) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(videoFileInfo, "videoFileInfo");
        EditVideoSegment editVideoSegment = new EditVideoSegment(videoPath, str, videoFileInfo);
        editVideoSegment.videoCutInfo = videoCutInfo;
        return editVideoSegment;
    }

    public /* synthetic */ EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, videoFileInfo);
    }

    public static /* synthetic */ EditVideoSegment copy$default(EditVideoSegment editVideoSegment, String str, String str2, VideoFileInfo videoFileInfo, VideoCutInfo videoCutInfo, int i, Object obj) {
        String str3 = str2;
        String str4 = str;
        VideoCutInfo videoCutInfo2 = videoCutInfo;
        VideoFileInfo videoFileInfo2 = videoFileInfo;
        if (obj == null) {
            if ((i & 1) != 0) {
                str4 = editVideoSegment.videoPath;
            }
            if ((i & 2) != 0) {
                str3 = editVideoSegment.audioPath;
            }
            if ((i & 4) != 0) {
                videoFileInfo2 = VideoFileInfo.copy$default(editVideoSegment.videoFileInfo, 0, 0, 0L, 0, 0, 0, 0, 0, 0.0f, 511, null);
            }
            if ((i & 8) != 0) {
                VideoCutInfo videoCutInfo3 = editVideoSegment.videoCutInfo;
                if (videoCutInfo3 != null) {
                    videoCutInfo2 = VideoCutInfo.copy$default(videoCutInfo3, 0L, 0L, 0.0f, 0, 15, null);
                } else {
                    videoCutInfo2 = null;
                }
            }
            return editVideoSegment.copy(str4, str3, videoFileInfo2, videoCutInfo2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }
}
