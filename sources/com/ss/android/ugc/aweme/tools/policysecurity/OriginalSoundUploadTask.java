package com.ss.android.ugc.aweme.tools.policysecurity;

import X.C79062V1e;
import X.HGE;
import X.HH1;
import X.JBR;
import X.UPJ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OriginalSoundUploadTask implements Parcelable {
    public static final Parcelable.Creator<OriginalSoundUploadTask> CREATOR = new HGE();
    public transient String audioVid;
    public final String awemeId;
    public boolean isBackup;
    public boolean isDraft;
    public int matchFactors;
    public int origin;
    public final String originalSoundPath;
    public int queryTimes;
    public final String unionId;
    public final long updateTime;
    public final String vid;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalSoundUploadTask)) {
            return false;
        }
        OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) obj;
        return o.LJ(this.awemeId, originalSoundUploadTask.awemeId) && o.LJ(this.vid, originalSoundUploadTask.vid) && o.LJ(this.originalSoundPath, originalSoundUploadTask.originalSoundPath) && this.updateTime == originalSoundUploadTask.updateTime && o.LJ(this.unionId, originalSoundUploadTask.unionId) && o.LJ(this.audioVid, originalSoundUploadTask.audioVid) && this.matchFactors == originalSoundUploadTask.matchFactors && this.isDraft == originalSoundUploadTask.isDraft && this.origin == originalSoundUploadTask.origin && this.isBackup == originalSoundUploadTask.isBackup && this.queryTimes == originalSoundUploadTask.queryTimes;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.awemeId);
        out.writeString(this.vid);
        out.writeString(this.originalSoundPath);
        out.writeLong(this.updateTime);
        out.writeString(this.unionId);
        out.writeString(this.audioVid);
        out.writeInt(this.matchFactors);
        out.writeInt(this.isDraft ? 1 : 0);
        out.writeInt(this.origin);
        out.writeInt(this.isBackup ? 1 : 0);
        out.writeInt(this.queryTimes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZJ = JBR.LIZJ(this.updateTime, C79062V1e.LJ(this.originalSoundPath, C79062V1e.LJ(this.vid, this.awemeId.hashCode() * 31, 31), 31), 31);
        String str = this.unionId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str2 = this.audioVid;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (((i2 + i) * 31) + this.matchFactors) * 31;
        boolean z = this.isDraft;
        int i4 = 1;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        int i6 = (((i3 + i5) * 31) + this.origin) * 31;
        if (!this.isBackup) {
            i4 = 0;
        }
        return ((i6 + i4) * 31) + this.queryTimes;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalSoundUploadTask(awemeId=");
        sb.append(this.awemeId);
        sb.append(", vid=");
        sb.append(this.vid);
        sb.append(", originalSoundPath=");
        sb.append(this.originalSoundPath);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", unionId=");
        sb.append(this.unionId);
        sb.append(", audioVid=");
        sb.append(this.audioVid);
        sb.append(", matchFactors=");
        sb.append(this.matchFactors);
        sb.append(", isDraft=");
        sb.append(this.isDraft);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(", isBackup=");
        sb.append(this.isBackup);
        sb.append(", queryTimes=");
        return UPJ.LIZLLL(sb, this.queryTimes, ')');
    }

    public OriginalSoundUploadTask(String str, String str2, String str3, long j, String str4, String str5, int i, boolean z, int i2, boolean z2, int i3) {
        HH1.LIZ(str, "awemeId", str2, "vid", str3, "originalSoundPath");
        this.awemeId = str;
        this.vid = str2;
        this.originalSoundPath = str3;
        this.updateTime = j;
        this.unionId = str4;
        this.audioVid = str5;
        this.matchFactors = i;
        this.isDraft = z;
        this.origin = i2;
        this.isBackup = z2;
        this.queryTimes = i3;
    }
}
