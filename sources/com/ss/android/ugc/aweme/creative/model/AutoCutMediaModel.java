package com.ss.android.ugc.aweme.creative.model;

import X.C43810HHi;
import X.C63B;
import X.GPV;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutoCutMediaModel implements Parcelable {

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("autocut_compress_path")
    public String compressPath;

    @InterfaceC65349Pkn("autocut_media_cut_duration")
    public long cutDuration;

    @InterfaceC65349Pkn("autocut_media_cut_start_time")
    public long cutStartTime;

    @InterfaceC65349Pkn("autocut_media_duration")
    public long duration;

    @InterfaceC43620HAa(blockCreative = false)
    @InterfaceC65349Pkn("autocut_media_path")
    public final String filePath;

    @GPV
    public final String fileUriPath;

    @InterfaceC65349Pkn("autocut_media_height")
    public int height;

    @InterfaceC65349Pkn("autocut_media_is_video_type")
    public final boolean isVideoType;

    @InterfaceC65349Pkn("autocut_media_speed")
    public float speed;

    @InterfaceC65349Pkn("autocut_media_width")
    public int width;
    public static final C63B Companion = new C63B();
    public static final Parcelable.Creator<AutoCutMediaModel> CREATOR = new C43810HHi();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoCutMediaModel() {
        /*
            r16 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r12 = 0
            r14 = 1023(0x3ff, float:1.434E-42)
            r0 = r16
            r2 = r1
            r4 = r3
            r5 = r3
            r8 = r6
            r10 = r6
            r13 = r1
            r15 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.filePath);
        out.writeString(this.fileUriPath);
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeInt(this.isVideoType ? 1 : 0);
        out.writeLong(this.duration);
        out.writeLong(this.cutStartTime);
        out.writeLong(this.cutDuration);
        out.writeFloat(this.speed);
        out.writeString(this.compressPath);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMediaModel(filePath = ");
        LIZ.append(this.filePath);
        LIZ.append(", fileUriPath = ");
        LIZ.append(this.fileUriPath);
        LIZ.append(", width = ");
        LIZ.append(this.width);
        LIZ.append(", height = ");
        LIZ.append(this.height);
        LIZ.append(", isVideoType = ");
        LIZ.append(this.isVideoType);
        LIZ.append(", duration = ");
        LIZ.append(this.duration);
        LIZ.append(",cutStartTime = ");
        LIZ.append(this.cutStartTime);
        LIZ.append(",cutDuration = ");
        LIZ.append(this.cutDuration);
        LIZ.append(",speed = ");
        LIZ.append(this.speed);
        return X1D.LIZIZ(LIZ);
    }

    public AutoCutMediaModel(String filePath, String str, int i, int i2, boolean z, long j, long j2, long j3, float f, String compressPath) {
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(compressPath, "compressPath");
        this.filePath = filePath;
        this.fileUriPath = str;
        this.width = i;
        this.height = i2;
        this.isVideoType = z;
        this.duration = j;
        this.cutStartTime = j2;
        this.cutDuration = j3;
        this.speed = f;
        this.compressPath = compressPath;
    }

    public /* synthetic */ AutoCutMediaModel(String str, String str2, int i, int i2, boolean z, long j, long j2, long j3, float f, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) == 0 ? z : false, (i3 & 32) != 0 ? 0L : j, (i3 & 64) == 0 ? j2 : 0L, (i3 & 128) != 0 ? -1L : j3, (i3 & 256) != 0 ? 1.0f : f, (i3 & 512) == 0 ? str3 : "");
    }
}
