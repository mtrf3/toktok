package com.ss.android.ugc.aweme.shortvideo.edit.model;

import X.C43494H5e;
import X.C43496H5g;
import X.F9E;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoFileInfo extends F9E implements Parcelable, Serializable {
    public final int bitrate;
    public final int codecType;
    public final long duration;
    public final int fps;
    public final float fpsFloat;
    public final int gop;
    public final int height;
    public final int keyFrameCount;
    public final int width;
    public static final C43496H5g Companion = new C43496H5g();
    public static final Parcelable.Creator<VideoFileInfo> CREATOR = new C43494H5e();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoFileInfo(int r14, int r15, long r16) {
        /*
            r13 = this;
            r5 = 0
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r12 = 0
            r1 = r14
            r0 = r13
            r3 = r16
            r2 = r15
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.<init>(int, int, long):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoFileInfo(int r14, int r15, long r16, int r18) {
        /*
            r13 = this;
            r6 = 0
            r10 = 0
            r11 = 496(0x1f0, float:6.95E-43)
            r12 = 0
            r1 = r14
            r0 = r13
            r2 = r15
            r5 = r18
            r3 = r16
            r7 = r6
            r8 = r6
            r9 = r6
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.<init>(int, int, long, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoFileInfo(int r14, int r15, long r16, int r18, int r19) {
        /*
            r13 = this;
            r7 = 0
            r10 = 0
            r11 = 480(0x1e0, float:6.73E-43)
            r12 = 0
            r1 = r14
            r0 = r13
            r2 = r15
            r3 = r16
            r6 = r19
            r5 = r18
            r8 = r7
            r9 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.<init>(int, int, long, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoFileInfo(int r14, int r15, long r16, int r18, int r19, int r20) {
        /*
            r13 = this;
            r8 = 0
            r10 = 0
            r11 = 448(0x1c0, float:6.28E-43)
            r12 = 0
            r6 = r19
            r1 = r14
            r7 = r20
            r0 = r13
            r2 = r15
            r3 = r16
            r5 = r18
            r9 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.<init>(int, int, long, int, int, int):void");
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        this(i, i2, j, i3, i4, i5, i6, 0, 0.0f, 384, null);
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, j, i3, i4, i5, i6, i7, 0.0f, 256, null);
    }

    public static /* synthetic */ VideoFileInfo copy$default(VideoFileInfo videoFileInfo, int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, float f, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = videoFileInfo.width;
        }
        if ((i8 & 2) != 0) {
            i2 = videoFileInfo.height;
        }
        if ((i8 & 4) != 0) {
            j = videoFileInfo.duration;
        }
        if ((i8 & 8) != 0) {
            i3 = videoFileInfo.fps;
        }
        if ((i8 & 16) != 0) {
            i4 = videoFileInfo.bitrate;
        }
        if ((i8 & 32) != 0) {
            i5 = videoFileInfo.codecType;
        }
        if ((i8 & 64) != 0) {
            i6 = videoFileInfo.keyFrameCount;
        }
        if ((i8 & 128) != 0) {
            i7 = videoFileInfo.gop;
        }
        if ((i8 & 256) != 0) {
            f = videoFileInfo.fpsFloat;
        }
        return videoFileInfo.copy(i, i2, j, i3, i4, i5, i6, i7, f);
    }

    public final VideoFileInfo copy(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, float f) {
        return new VideoFileInfo(i, i2, j, i3, i4, i5, i6, i7, f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height), Long.valueOf(this.duration), Integer.valueOf(this.fps), Integer.valueOf(this.bitrate), Integer.valueOf(this.codecType), Integer.valueOf(this.keyFrameCount), Integer.valueOf(this.gop), Float.valueOf(this.fpsFloat)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.codecType);
        parcel.writeInt(this.keyFrameCount);
        parcel.writeInt(this.gop);
        parcel.writeFloat(this.fpsFloat);
    }

    public final String getResolution() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.width);
        LIZ.append('*');
        LIZ.append(this.height);
        return X1D.LIZIZ(LIZ);
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getCodecType() {
        return this.codecType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFps() {
        return this.fps;
    }

    public final float getFpsFloat() {
        return this.fpsFloat;
    }

    public final int getGop() {
        return this.gop;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getKeyFrameCount() {
        return this.keyFrameCount;
    }

    public final int getWidth() {
        return this.width;
    }

    public VideoFileInfo(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, float f) {
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.fps = i3;
        this.bitrate = i4;
        this.codecType = i5;
        this.keyFrameCount = i6;
        this.gop = i7;
        this.fpsFloat = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ VideoFileInfo(int r2, int r3, long r4, int r6, int r7, int r8, int r9, int r10, float r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r0 = r12 & 8
            if (r0 == 0) goto L6
            r6 = -100
        L6:
            r0 = r12 & 16
            if (r0 == 0) goto Lb
            r7 = 0
        Lb:
            r0 = r12 & 32
            if (r0 == 0) goto L10
            r8 = -1
        L10:
            r0 = r12 & 64
            if (r0 == 0) goto L15
            r9 = -1
        L15:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1a
            r10 = -1
        L1a:
            r0 = r12 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L1f
            float r11 = (float) r6
        L1f:
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.<init>(int, int, long, int, int, int, int, int, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
