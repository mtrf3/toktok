package com.ss.android.ugc.aweme.canvas;

import X.C41724GZc;
import X.C47959Irz;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ForwardCanvasExtra implements Serializable {
    public static final C41724GZc Companion = new C41724GZc();

    @InterfaceC65349Pkn("forwardAwemeType")
    public final int forwardAwemeType;

    @InterfaceC65349Pkn("forwardMusic")
    public final ForwardMusic forwardMusic;

    @InterfaceC65349Pkn("forwardType")
    public final int forwardType;

    @InterfaceC65349Pkn("forwardVideo")
    public final ForwardVideo forwardVideo;

    @InterfaceC65349Pkn("isOwnVideo")
    public final boolean isOwnVideo;

    @InterfaceC65349Pkn("isQuickForward")
    public final boolean isQuickForward;

    @InterfaceC65349Pkn("meta")
    public final String mediaMeta;

    @InterfaceC65349Pkn("targetVolumeLoud")
    public final float targetVolumeLoud;

    @InterfaceC65349Pkn("video_share_info")
    public final VideoShareInfoStruct videoShareInfoStruct;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ForwardCanvasExtra() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r7 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r3 = r1
            r4 = r1
            r5 = r2
            r6 = r2
            r8 = r2
            r9 = r1
            r11 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra.<init>():void");
    }

    public static /* synthetic */ ForwardCanvasExtra copy$default(ForwardCanvasExtra forwardCanvasExtra, int i, String str, int i2, boolean z, VideoShareInfoStruct videoShareInfoStruct, ForwardMusic forwardMusic, float f, ForwardVideo forwardVideo, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = forwardCanvasExtra.forwardType;
        }
        if ((i3 & 2) != 0) {
            str = forwardCanvasExtra.mediaMeta;
        }
        if ((i3 & 4) != 0) {
            i2 = forwardCanvasExtra.forwardAwemeType;
        }
        if ((i3 & 8) != 0) {
            z = forwardCanvasExtra.isOwnVideo;
        }
        if ((i3 & 16) != 0) {
            videoShareInfoStruct = forwardCanvasExtra.videoShareInfoStruct;
        }
        if ((i3 & 32) != 0) {
            forwardMusic = forwardCanvasExtra.forwardMusic;
        }
        if ((i3 & 64) != 0) {
            f = forwardCanvasExtra.targetVolumeLoud;
        }
        if ((i3 & 128) != 0) {
            forwardVideo = forwardCanvasExtra.forwardVideo;
        }
        if ((i3 & 256) != 0) {
            z2 = forwardCanvasExtra.isQuickForward;
        }
        return forwardCanvasExtra.copy(i, str, i2, z, videoShareInfoStruct, forwardMusic, f, forwardVideo, z2);
    }

    public final ForwardCanvasExtra copy(int i, String str, int i2, boolean z, VideoShareInfoStruct videoShareInfoStruct, ForwardMusic forwardMusic, float f, ForwardVideo forwardVideo, boolean z2) {
        return new ForwardCanvasExtra(i, str, i2, z, videoShareInfoStruct, forwardMusic, f, forwardVideo, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardCanvasExtra)) {
            return false;
        }
        ForwardCanvasExtra forwardCanvasExtra = (ForwardCanvasExtra) obj;
        return this.forwardType == forwardCanvasExtra.forwardType && o.LJ(this.mediaMeta, forwardCanvasExtra.mediaMeta) && this.forwardAwemeType == forwardCanvasExtra.forwardAwemeType && this.isOwnVideo == forwardCanvasExtra.isOwnVideo && o.LJ(this.videoShareInfoStruct, forwardCanvasExtra.videoShareInfoStruct) && o.LJ(this.forwardMusic, forwardCanvasExtra.forwardMusic) && Float.compare(this.targetVolumeLoud, forwardCanvasExtra.targetVolumeLoud) == 0 && o.LJ(this.forwardVideo, forwardCanvasExtra.forwardVideo) && this.isQuickForward == forwardCanvasExtra.isQuickForward;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.forwardType * 31;
        String str = this.mediaMeta;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (((i + hashCode) * 31) + this.forwardAwemeType) * 31;
        boolean z = this.isOwnVideo;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (i3 + i5) * 31;
        VideoShareInfoStruct videoShareInfoStruct = this.videoShareInfoStruct;
        if (videoShareInfoStruct == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = videoShareInfoStruct.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        ForwardMusic forwardMusic = this.forwardMusic;
        if (forwardMusic == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = forwardMusic.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.targetVolumeLoud, (i7 + hashCode3) * 31, 31);
        ForwardVideo forwardVideo = this.forwardVideo;
        if (forwardVideo != null) {
            i2 = forwardVideo.hashCode();
        }
        int i8 = (LIZIZ + i2) * 31;
        if (!this.isQuickForward) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ForwardCanvasExtra(forwardType=");
        LIZ.append(this.forwardType);
        LIZ.append(", mediaMeta=");
        LIZ.append(this.mediaMeta);
        LIZ.append(", forwardAwemeType=");
        LIZ.append(this.forwardAwemeType);
        LIZ.append(", isOwnVideo=");
        LIZ.append(this.isOwnVideo);
        LIZ.append(", videoShareInfoStruct=");
        LIZ.append(this.videoShareInfoStruct);
        LIZ.append(", forwardMusic=");
        LIZ.append(this.forwardMusic);
        LIZ.append(", targetVolumeLoud=");
        LIZ.append(this.targetVolumeLoud);
        LIZ.append(", forwardVideo=");
        LIZ.append(this.forwardVideo);
        LIZ.append(", isQuickForward=");
        return C48339Iy7.LIZJ(LIZ, this.isQuickForward, ')', LIZ);
    }

    public final int getForwardAwemeType() {
        return this.forwardAwemeType;
    }

    public final ForwardMusic getForwardMusic() {
        return this.forwardMusic;
    }

    public final int getForwardType() {
        return this.forwardType;
    }

    public final ForwardVideo getForwardVideo() {
        return this.forwardVideo;
    }

    public final String getMediaMeta() {
        return this.mediaMeta;
    }

    public final float getTargetVolumeLoud() {
        return this.targetVolumeLoud;
    }

    public final VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.videoShareInfoStruct;
    }

    public final boolean isOwnVideo() {
        return this.isOwnVideo;
    }

    public final boolean isQuickForward() {
        return this.isQuickForward;
    }

    public ForwardCanvasExtra(int i, String str, int i2, boolean z, VideoShareInfoStruct videoShareInfoStruct, ForwardMusic forwardMusic, float f, ForwardVideo forwardVideo, boolean z2) {
        this.forwardType = i;
        this.mediaMeta = str;
        this.forwardAwemeType = i2;
        this.isOwnVideo = z;
        this.videoShareInfoStruct = videoShareInfoStruct;
        this.forwardMusic = forwardMusic;
        this.targetVolumeLoud = f;
        this.forwardVideo = forwardVideo;
        this.isQuickForward = z2;
    }

    public /* synthetic */ ForwardCanvasExtra(int i, String str, int i2, boolean z, VideoShareInfoStruct videoShareInfoStruct, ForwardMusic forwardMusic, float f, ForwardVideo forwardVideo, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) == 0 ? i2 : -1, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? null : videoShareInfoStruct, (i3 & 32) != 0 ? null : forwardMusic, (i3 & 64) != 0 ? -12.0f : f, (i3 & 128) == 0 ? forwardVideo : null, (i3 & 256) == 0 ? z2 : false);
    }
}
