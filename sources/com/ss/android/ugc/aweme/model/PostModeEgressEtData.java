package com.ss.android.ugc.aweme.model;

import X.C05040Hs;
import X.EnumC201127uu;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeEgressEtData implements Parcelable {
    public static final Parcelable.Creator<PostModeEgressEtData> CREATOR = new Parcelable.Creator<PostModeEgressEtData>() { // from class: X.7vQ
        @Override // android.os.Parcelable.Creator
        public final PostModeEgressEtData createFromParcel(Parcel parcel) {
            boolean z;
            EnumC201127uu valueOf;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            long readLong = parcel.readLong();
            Long l = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = EnumC201127uu.valueOf(parcel.readString());
            }
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new PostModeEgressEtData(z, readLong, valueOf, readLong2, readLong3, readLong4, l, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PostModeEgressEtData[] newArray(int i) {
            return new PostModeEgressEtData[i];
        }
    };
    public final EnumC201127uu exitMethod;
    public boolean isVideoPlayFinishReported;
    public final Long leaveFullPageTime;
    public final int loopTimesInDetailPage;
    public long photoModeDuration;
    public long postModeDuration;
    public long timePlayerIsPaused;
    public long videoPlayTimeAccumulated;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PostModeEgressEtData() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r11 = 255(0xff, float:3.57E-43)
            r0 = r12
            r5 = r3
            r7 = r3
            r9 = r2
            r10 = r1
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.PostModeEgressEtData.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModeEgressEtData)) {
            return false;
        }
        PostModeEgressEtData postModeEgressEtData = (PostModeEgressEtData) obj;
        return this.isVideoPlayFinishReported == postModeEgressEtData.isVideoPlayFinishReported && this.timePlayerIsPaused == postModeEgressEtData.timePlayerIsPaused && this.exitMethod == postModeEgressEtData.exitMethod && this.photoModeDuration == postModeEgressEtData.photoModeDuration && this.postModeDuration == postModeEgressEtData.postModeDuration && this.videoPlayTimeAccumulated == postModeEgressEtData.videoPlayTimeAccumulated && o.LJ(this.leaveFullPageTime, postModeEgressEtData.leaveFullPageTime) && this.loopTimesInDetailPage == postModeEgressEtData.loopTimesInDetailPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.isVideoPlayFinishReported;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZJ = JBR.LIZJ(this.timePlayerIsPaused, r0 * 31, 31);
        EnumC201127uu enumC201127uu = this.exitMethod;
        int i = 0;
        if (enumC201127uu == null) {
            hashCode = 0;
        } else {
            hashCode = enumC201127uu.hashCode();
        }
        int LIZJ2 = JBR.LIZJ(this.videoPlayTimeAccumulated, JBR.LIZJ(this.postModeDuration, JBR.LIZJ(this.photoModeDuration, (LIZJ + hashCode) * 31, 31), 31), 31);
        Long l = this.leaveFullPageTime;
        if (l != null) {
            i = l.hashCode();
        }
        return ((LIZJ2 + i) * 31) + this.loopTimesInDetailPage;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PostModeEgressEtData(isVideoPlayFinishReported=");
        LIZ.append(this.isVideoPlayFinishReported);
        LIZ.append(", timePlayerIsPaused=");
        LIZ.append(this.timePlayerIsPaused);
        LIZ.append(", exitMethod=");
        LIZ.append(this.exitMethod);
        LIZ.append(", photoModeDuration=");
        LIZ.append(this.photoModeDuration);
        LIZ.append(", postModeDuration=");
        LIZ.append(this.postModeDuration);
        LIZ.append(", videoPlayTimeAccumulated=");
        LIZ.append(this.videoPlayTimeAccumulated);
        LIZ.append(", leaveFullPageTime=");
        LIZ.append(this.leaveFullPageTime);
        LIZ.append(", loopTimesInDetailPage=");
        return b0.LIZJ(LIZ, this.loopTimesInDetailPage, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isVideoPlayFinishReported ? 1 : 0);
        out.writeLong(this.timePlayerIsPaused);
        EnumC201127uu enumC201127uu = this.exitMethod;
        if (enumC201127uu == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(enumC201127uu.name());
        }
        out.writeLong(this.photoModeDuration);
        out.writeLong(this.postModeDuration);
        out.writeLong(this.videoPlayTimeAccumulated);
        Long l = this.leaveFullPageTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeInt(this.loopTimesInDetailPage);
    }

    public /* synthetic */ PostModeEgressEtData(boolean z, EnumC201127uu enumC201127uu, long j, long j2, long j3, Long l, int i, int i2) {
        this((i2 & 1) != 0 ? false : z, 0L, (i2 & 4) != 0 ? null : enumC201127uu, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0L : j3, (i2 & 64) == 0 ? l : null, (i2 & 128) == 0 ? i : 0);
    }

    public PostModeEgressEtData(boolean z, long j, EnumC201127uu enumC201127uu, long j2, long j3, long j4, Long l, int i) {
        this.isVideoPlayFinishReported = z;
        this.timePlayerIsPaused = j;
        this.exitMethod = enumC201127uu;
        this.photoModeDuration = j2;
        this.postModeDuration = j3;
        this.videoPlayTimeAccumulated = j4;
        this.leaveFullPageTime = l;
        this.loopTimesInDetailPage = i;
    }
}
