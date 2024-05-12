package com.ss.android.ugc.aweme.draft.model;

import X.C07670Rv;
import X.C42070GfC;
import X.C47959Irz;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftVideoSegment implements Parcelable {
    public static final Parcelable.Creator<DraftVideoSegment> CREATOR = new C42070GfC();

    @InterfaceC65349Pkn("audio_path")
    public String audioPath;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("end")
    public int end;

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("reverse_path")
    public String reversePath;

    @InterfaceC65349Pkn("roatete")
    public int rotate;

    @InterfaceC65349Pkn("speed")
    public float speed;

    @InterfaceC65349Pkn("start")
    public int start;

    @InterfaceC65349Pkn("temp_path")
    public String tempVideoPath;

    @InterfaceC65349Pkn("video_path")
    public String videoPath;

    @InterfaceC65349Pkn("width")
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DraftVideoSegment() {
        /*
            r14 = this;
            r1 = 0
            r6 = 0
            r8 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r7 = r1
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.DraftVideoSegment.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftVideoSegment)) {
            return false;
        }
        DraftVideoSegment draftVideoSegment = (DraftVideoSegment) obj;
        return this.width == draftVideoSegment.width && this.height == draftVideoSegment.height && this.start == draftVideoSegment.start && this.end == draftVideoSegment.end && this.duration == draftVideoSegment.duration && Float.compare(this.speed, draftVideoSegment.speed) == 0 && this.rotate == draftVideoSegment.rotate && o.LJ(this.videoPath, draftVideoSegment.videoPath) && o.LJ(this.audioPath, draftVideoSegment.audioPath) && o.LJ(this.reversePath, draftVideoSegment.reversePath) && o.LJ(this.tempVideoPath, draftVideoSegment.tempVideoPath);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeInt(this.start);
        out.writeInt(this.end);
        out.writeInt(this.duration);
        out.writeFloat(this.speed);
        out.writeInt(this.rotate);
        out.writeString(this.videoPath);
        out.writeString(this.audioPath);
        out.writeString(this.reversePath);
        out.writeString(this.tempVideoPath);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.videoPath, (C47959Irz.LIZIZ(this.speed, ((((((((this.width * 31) + this.height) * 31) + this.start) * 31) + this.end) * 31) + this.duration) * 31, 31) + this.rotate) * 31, 31);
        String str = this.audioPath;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.reversePath;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.tempVideoPath;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftVideoSegment(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", rotate=");
        sb.append(this.rotate);
        sb.append(", videoPath=");
        sb.append(this.videoPath);
        sb.append(", audioPath=");
        sb.append(this.audioPath);
        sb.append(", reversePath=");
        sb.append(this.reversePath);
        sb.append(", tempVideoPath=");
        return C07670Rv.LIZIZ(sb, this.tempVideoPath, ')');
    }

    public DraftVideoSegment(int i, int i2, int i3, int i4, int i5, float f, int i6, String videoPath, String str, String str2, String str3) {
        o.LJIIIZ(videoPath, "videoPath");
        this.width = i;
        this.height = i2;
        this.start = i3;
        this.end = i4;
        this.duration = i5;
        this.speed = f;
        this.rotate = i6;
        this.videoPath = videoPath;
        this.audioPath = str;
        this.reversePath = str2;
        this.tempVideoPath = str3;
    }

    public /* synthetic */ DraftVideoSegment(int i, int i2, int i3, int i4, int i5, float f, int i6, String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 1.0f : f, (i7 & 64) == 0 ? i6 : 0, (i7 & 128) != 0 ? "" : str, (i7 & 256) != 0 ? null : str2, (i7 & 512) != 0 ? null : str3, (i7 & 1024) == 0 ? str4 : null);
    }
}
