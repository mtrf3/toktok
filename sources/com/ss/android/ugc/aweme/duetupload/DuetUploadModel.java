package com.ss.android.ugc.aweme.duetupload;

import X.C42068GfA;
import X.C47959Irz;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetUploadModel implements Parcelable {
    public static final C42068GfA CREATOR = new C42068GfA();

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("endTime")
    public long endTime;

    @InterfaceC65349Pkn("fileLocalUriPath")
    public String fileLocalUriPath;

    @InterfaceC65349Pkn("isImageType")
    public boolean isImageType;

    @InterfaceC65349Pkn("isVideoType")
    public boolean isVideoType;

    @InterfaceC65349Pkn("rotation")
    public float rotation;

    @InterfaceC65349Pkn("speed")
    public float speed;

    @InterfaceC65349Pkn("startTime")
    public long startTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DuetUploadModel() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r8 = 0
            r10 = 0
            r12 = 255(0xff, float:3.57E-43)
            r0 = r14
            r4 = r2
            r6 = r2
            r9 = r8
            r11 = r10
            r13 = r1
            r0.<init>(r1, r2, r4, r6, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.duetupload.DuetUploadModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetUploadModel)) {
            return false;
        }
        DuetUploadModel duetUploadModel = (DuetUploadModel) obj;
        return o.LJ(this.fileLocalUriPath, duetUploadModel.fileLocalUriPath) && this.startTime == duetUploadModel.startTime && this.endTime == duetUploadModel.endTime && this.duration == duetUploadModel.duration && Float.compare(this.speed, duetUploadModel.speed) == 0 && Float.compare(this.rotation, duetUploadModel.rotation) == 0 && this.isImageType == duetUploadModel.isImageType && this.isVideoType == duetUploadModel.isVideoType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        String str = this.fileLocalUriPath;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.rotation, C47959Irz.LIZIZ(this.speed, JBR.LIZJ(this.duration, JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, hashCode * 31, 31), 31), 31), 31), 31);
        boolean z = this.isImageType;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.isVideoType) {
            i = 0;
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DuetUploadModel(fileLocalUriPath=");
        LIZ.append(this.fileLocalUriPath);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", speed=");
        LIZ.append(this.speed);
        LIZ.append(", rotation=");
        LIZ.append(this.rotation);
        LIZ.append(", isImageType=");
        LIZ.append(this.isImageType);
        LIZ.append(", isVideoType=");
        return C48339Iy7.LIZJ(LIZ, this.isVideoType, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DuetUploadModel(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r1 = r13.readString()
            long r2 = r13.readLong()
            long r4 = r13.readLong()
            long r6 = r13.readLong()
            float r8 = r13.readFloat()
            float r9 = r13.readFloat()
            byte r0 = r13.readByte()
            if (r0 == 0) goto L32
            r10 = 1
        L24:
            byte r0 = r13.readByte()
            if (r0 == 0) goto L30
            r11 = 1
        L2b:
            r0 = r12
            r0.<init>(r1, r2, r4, r6, r8, r9, r10, r11)
            return
        L30:
            r11 = 0
            goto L2b
        L32:
            r10 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.duetupload.DuetUploadModel.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.fileLocalUriPath);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeLong(this.duration);
        parcel.writeFloat(this.speed);
        parcel.writeFloat(this.rotation);
        parcel.writeByte(this.isImageType ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isVideoType ? (byte) 1 : (byte) 0);
    }

    public DuetUploadModel(String str, long j, long j2, long j3, float f, float f2, boolean z, boolean z2) {
        this.fileLocalUriPath = str;
        this.startTime = j;
        this.endTime = j2;
        this.duration = j3;
        this.speed = f;
        this.rotation = f2;
        this.isImageType = z;
        this.isVideoType = z2;
    }

    public /* synthetic */ DuetUploadModel(String str, long j, long j2, long j3, float f, float f2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) == 0 ? j3 : 0L, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false);
    }
}
