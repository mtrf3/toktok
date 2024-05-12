package com.ss.android.ugc.aweme.listener;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.listener.MultiBitRateEtParams;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MultiBitRateEtParams extends F9E implements Parcelable {
    public static final Parcelable.Creator<MultiBitRateEtParams> CREATOR = new Parcelable.Creator<MultiBitRateEtParams>() { // from class: X.81j
        @Override // android.os.Parcelable.Creator
        public final MultiBitRateEtParams createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            return new MultiBitRateEtParams(readInt, parcel.readInt(), parcel.readInt(), parcel.readInt(), readString, readString2, readString3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MultiBitRateEtParams[] newArray(int i) {
            return new MultiBitRateEtParams[i];
        }
    };
    public final int imageFirstFrameDuration;
    public final int imageFirstFrameRenderered;
    public final String imageSizeListStr;
    public final String ladderErrCode;
    public final String playLadderNameList;
    public final String resolutionListStr;
    public final String scene;
    public final int skippedImageCnt;
    public final int useMultiBitrateCount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.resolutionListStr, this.imageSizeListStr, Integer.valueOf(this.useMultiBitrateCount), this.ladderErrCode, Integer.valueOf(this.skippedImageCnt), this.playLadderNameList, Integer.valueOf(this.imageFirstFrameDuration), Integer.valueOf(this.imageFirstFrameRenderered), this.scene};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.resolutionListStr);
        out.writeString(this.imageSizeListStr);
        out.writeInt(this.useMultiBitrateCount);
        out.writeString(this.ladderErrCode);
        out.writeInt(this.skippedImageCnt);
        out.writeString(this.playLadderNameList);
        out.writeInt(this.imageFirstFrameDuration);
        out.writeInt(this.imageFirstFrameRenderered);
        out.writeString(this.scene);
    }

    public MultiBitRateEtParams(int i, int i2, int i3, int i4, String resolutionListStr, String imageSizeListStr, String ladderErrCode, String playLadderNameList, String scene) {
        o.LJIIIZ(resolutionListStr, "resolutionListStr");
        o.LJIIIZ(imageSizeListStr, "imageSizeListStr");
        o.LJIIIZ(ladderErrCode, "ladderErrCode");
        o.LJIIIZ(playLadderNameList, "playLadderNameList");
        o.LJIIIZ(scene, "scene");
        this.resolutionListStr = resolutionListStr;
        this.imageSizeListStr = imageSizeListStr;
        this.useMultiBitrateCount = i;
        this.ladderErrCode = ladderErrCode;
        this.skippedImageCnt = i2;
        this.playLadderNameList = playLadderNameList;
        this.imageFirstFrameDuration = i3;
        this.imageFirstFrameRenderered = i4;
        this.scene = scene;
    }
}
