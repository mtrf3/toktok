package com.ss.android.ugc.aweme.shortvideo.upload;

import X.C43477H4n;
import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadSpeedInfo extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<UploadSpeedInfo> CREATOR = new C43477H4n();
    public final long endTime;
    public String probeContext;
    public final long speed;
    public final long startTime;
    public int usedCompilerSettingGroup;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadSpeedInfo() {
        /*
            r11 = this;
            r1 = 0
            r3 = 0
            r8 = 0
            r9 = 31
            r0 = r11
            r4 = r1
            r6 = r1
            r10 = r3
            r0.<init>(r1, r3, r4, r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadSpeedInfo(long r12) {
        /*
            r11 = this;
            r3 = 0
            r4 = 0
            r8 = 0
            r9 = 30
            r0 = r11
            r1 = r12
            r6 = r4
            r10 = r3
            r0.<init>(r1, r3, r4, r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo.<init>(long):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UploadSpeedInfo(long r12, java.lang.String r14) {
        /*
            r11 = this;
            java.lang.String r0 = "probeContext"
            r3 = r14
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            r4 = 0
            r8 = 0
            r9 = 28
            r10 = 0
            r1 = r12
            r0 = r11
            r6 = r4
            r0.<init>(r1, r3, r4, r6, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo.<init>(long, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadSpeedInfo(long j, String probeContext, long j2) {
        this(j, probeContext, j2, 0L, 0, 24, null);
        o.LJIIIZ(probeContext, "probeContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadSpeedInfo(long j, String probeContext, long j2, long j3) {
        this(j, probeContext, j2, j3, 0, 16, null);
        o.LJIIIZ(probeContext, "probeContext");
    }

    public static /* synthetic */ UploadSpeedInfo copy$default(UploadSpeedInfo uploadSpeedInfo, long j, String str, long j2, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = uploadSpeedInfo.speed;
        }
        if ((i2 & 2) != 0) {
            str = uploadSpeedInfo.probeContext;
        }
        if ((i2 & 4) != 0) {
            j2 = uploadSpeedInfo.startTime;
        }
        if ((i2 & 8) != 0) {
            j3 = uploadSpeedInfo.endTime;
        }
        if ((i2 & 16) != 0) {
            i = uploadSpeedInfo.usedCompilerSettingGroup;
        }
        return uploadSpeedInfo.copy(j, str, j2, j3, i);
    }

    public final UploadSpeedInfo copy(long j, String probeContext, long j2, long j3, int i) {
        o.LJIIIZ(probeContext, "probeContext");
        return new UploadSpeedInfo(j, probeContext, j2, j3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.speed), this.probeContext, Long.valueOf(this.startTime), Long.valueOf(this.endTime), Integer.valueOf(this.usedCompilerSettingGroup)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.speed);
        out.writeString(this.probeContext);
        out.writeLong(this.startTime);
        out.writeLong(this.endTime);
        out.writeInt(this.usedCompilerSettingGroup);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getProbeContext() {
        return this.probeContext;
    }

    public final long getSpeed() {
        return this.speed;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getUsedCompilerSettingGroup() {
        return this.usedCompilerSettingGroup;
    }

    public final void setProbeContext(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.probeContext = str;
    }

    public final void setUsedCompilerSettingGroup(int i) {
        this.usedCompilerSettingGroup = i;
    }

    public UploadSpeedInfo(long j, String probeContext, long j2, long j3, int i) {
        o.LJIIIZ(probeContext, "probeContext");
        this.speed = j;
        this.probeContext = probeContext;
        this.startTime = j2;
        this.endTime = j3;
        this.usedCompilerSettingGroup = i;
    }

    public /* synthetic */ UploadSpeedInfo(long j, String str, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -6L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? -6L : j2, (i2 & 8) == 0 ? j3 : -6L, (i2 & 16) != 0 ? -1 : i);
    }
}
