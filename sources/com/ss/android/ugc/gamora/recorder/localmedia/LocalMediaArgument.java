package com.ss.android.ugc.gamora.recorder.localmedia;

import X.C79062V1e;
import X.HRN;
import X.JBR;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LocalMediaArgument implements Parcelable {
    public static final HRN CREATOR = new HRN();
    public final int chooseRequestCode;
    public final int chooseScene;
    public final int dmChatType;
    public final boolean enableMultiVideo;
    public final Bundle extraBundle;
    public final String hintText;
    public final int maxPhotoCount;
    public final int maxSelectableVideoDuration;
    public final int maxVideoCount;
    public final long minDuration;
    public final int minPhotoCount;
    public final int minSelectableVideoDuration;
    public final int minVideoCount;
    public final int requestCode;
    public final String sessionId;
    public final boolean shouldDisplayTnsNotice;
    public final int supportFlag;
    public final int tnsNoticeRes;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMediaArgument)) {
            return false;
        }
        LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
        return this.chooseRequestCode == localMediaArgument.chooseRequestCode && this.requestCode == localMediaArgument.requestCode && this.supportFlag == localMediaArgument.supportFlag && this.enableMultiVideo == localMediaArgument.enableMultiVideo && this.chooseScene == localMediaArgument.chooseScene && this.minDuration == localMediaArgument.minDuration && this.minPhotoCount == localMediaArgument.minPhotoCount && this.maxPhotoCount == localMediaArgument.maxPhotoCount && this.minVideoCount == localMediaArgument.minVideoCount && this.maxVideoCount == localMediaArgument.maxVideoCount && this.minSelectableVideoDuration == localMediaArgument.minSelectableVideoDuration && this.maxSelectableVideoDuration == localMediaArgument.maxSelectableVideoDuration && this.shouldDisplayTnsNotice == localMediaArgument.shouldDisplayTnsNotice && this.tnsNoticeRes == localMediaArgument.tnsNoticeRes && this.dmChatType == localMediaArgument.dmChatType && o.LJ(this.sessionId, localMediaArgument.sessionId) && o.LJ(this.hintText, localMediaArgument.hintText) && o.LJ(this.extraBundle, localMediaArgument.extraBundle);
    }

    public final String toString() {
        return "LocalMediaArgument(chooseRequestCode=" + this.chooseRequestCode + ", requestCode=" + this.requestCode + ", supportFlag=" + this.supportFlag + ", enableMultiVideo=" + this.enableMultiVideo + ", chooseScene=" + this.chooseScene + ", minDuration=" + this.minDuration + ", minPhotoCount=" + this.minPhotoCount + ", maxPhotoCount=" + this.maxPhotoCount + ", minVideoCount=" + this.minVideoCount + ", maxVideoCount=" + this.maxVideoCount + ", minSelectableVideoDuration=" + this.minSelectableVideoDuration + ", maxSelectableVideoDuration=" + this.maxSelectableVideoDuration + ", shouldDisplayTnsNotice=" + this.shouldDisplayTnsNotice + ", tnsNoticeRes=" + this.tnsNoticeRes + ", dmChatType=" + this.dmChatType + ", sessionId=" + this.sessionId + ", hintText=" + this.hintText + ", extraBundle=" + this.extraBundle + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = ((((this.chooseRequestCode * 31) + this.requestCode) * 31) + this.supportFlag) * 31;
        boolean z = this.enableMultiVideo;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int LIZJ = (((((((((((JBR.LIZJ(this.minDuration, (((i + i3) * 31) + this.chooseScene) * 31, 31) + this.minPhotoCount) * 31) + this.maxPhotoCount) * 31) + this.minVideoCount) * 31) + this.maxVideoCount) * 31) + this.minSelectableVideoDuration) * 31) + this.maxSelectableVideoDuration) * 31;
        if (!this.shouldDisplayTnsNotice) {
            i2 = 0;
        }
        int LJ = C79062V1e.LJ(this.hintText, C79062V1e.LJ(this.sessionId, (((((LIZJ + i2) * 31) + this.tnsNoticeRes) * 31) + this.dmChatType) * 31, 31), 31);
        Bundle bundle = this.extraBundle;
        if (bundle == null) {
            hashCode = 0;
        } else {
            hashCode = bundle.hashCode();
        }
        return LJ + hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeInt(this.chooseRequestCode);
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.supportFlag);
        parcel.writeByte(this.enableMultiVideo ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.chooseScene);
        parcel.writeLong(this.minDuration);
        parcel.writeInt(this.minPhotoCount);
        parcel.writeInt(this.maxPhotoCount);
        parcel.writeInt(this.minVideoCount);
        parcel.writeInt(this.maxVideoCount);
        parcel.writeInt(this.minSelectableVideoDuration);
        parcel.writeInt(this.maxSelectableVideoDuration);
        parcel.writeByte(this.shouldDisplayTnsNotice ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.tnsNoticeRes);
        parcel.writeInt(this.dmChatType);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.hintText);
        Bundle bundle = this.extraBundle;
        if (bundle != null) {
            parcel.writeBundle(bundle);
        }
    }

    public LocalMediaArgument(int i, int i2, int i3, boolean z, int i4, long j, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, int i11, int i12, String str, String str2, Bundle bundle, int i13) {
        int i14 = i7;
        String sessionId = str;
        boolean z3 = z2;
        Bundle bundle2 = bundle;
        int i15 = i9;
        int i16 = i10;
        int i17 = (i13 & 128) != 0 ? 12 : i6;
        i14 = (i13 & 256) != 0 ? 1 : i14;
        int i18 = (i13 & 512) == 0 ? i8 : 12;
        i15 = (i13 & 1024) != 0 ? -1 : i15;
        i16 = (i13 & 2048) != 0 ? -1 : i16;
        z3 = (i13 & 4096) != 0 ? false : z3;
        int i19 = (i13 & FileUtils.BUFFER_SIZE) == 0 ? i11 : 0;
        int i20 = (i13 & 16384) == 0 ? i12 : -1;
        sessionId = (32768 & i13) != 0 ? "" : sessionId;
        String hintText = (65536 & i13) == 0 ? str2 : "";
        bundle2 = (i13 & 131072) != 0 ? null : bundle2;
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(hintText, "hintText");
        this.chooseRequestCode = i;
        this.requestCode = i2;
        this.supportFlag = i3;
        this.enableMultiVideo = z;
        this.chooseScene = i4;
        this.minDuration = j;
        this.minPhotoCount = i5;
        this.maxPhotoCount = i17;
        this.minVideoCount = i14;
        this.maxVideoCount = i18;
        this.minSelectableVideoDuration = i15;
        this.maxSelectableVideoDuration = i16;
        this.shouldDisplayTnsNotice = z3;
        this.tnsNoticeRes = i19;
        this.dmChatType = i20;
        this.sessionId = sessionId;
        this.hintText = hintText;
        this.extraBundle = bundle2;
    }
}
