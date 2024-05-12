package com.ss.android.ugc.aweme.creative.model.video2sticker;

import X.F9E;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData;
import com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class Video2StickerModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<Video2StickerModel> CREATOR = new Parcelable.Creator<Video2StickerModel>() { // from class: X.5m8
        @Override // android.os.Parcelable.Creator
        public final Video2StickerModel createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new Video2StickerModel(OriginVideoInfo.CREATOR.createFromParcel(parcel), VideoCropData.CREATOR.createFromParcel(parcel), VideoTimeTrimData.CREATOR.createFromParcel(parcel), EditVideoInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Video2StickerModel[] newArray(int i) {
            return new Video2StickerModel[i];
        }
    };

    @GPV
    public EditVideoInfo editVideoInfo;

    @GPV
    public OriginVideoInfo originVideoInfo;

    @GPV
    public VideoCropData videoCropData;

    @GPV
    public VideoTimeTrimData videoTimeTrimData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.originVideoInfo, this.videoCropData, this.videoTimeTrimData, this.editVideoInfo};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.originVideoInfo.writeToParcel(out, i);
        this.videoCropData.writeToParcel(out, i);
        this.videoTimeTrimData.writeToParcel(out, i);
        this.editVideoInfo.writeToParcel(out, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Video2StickerModel() {
        /*
            r26 = this;
            com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo r2 = new com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo
            r3 = 0
            r4 = 0
            r5 = 0
            r17 = 0
            r13 = 255(0xff, float:3.57E-43)
            r7 = r4
            r8 = r3
            r9 = r3
            r10 = r5
            r12 = r3
            r14 = r3
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r12, r13, r14)
            com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData r5 = new com.ss.android.ugc.aweme.creative.model.video2sticker.VideoCropData
            r7 = 0
            r23 = 0
            r10 = 15
            r6 = r3
            r8 = r7
            r9 = r4
            r11 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData r0 = new com.ss.android.ugc.aweme.creative.model.video2sticker.VideoTimeTrimData
            r19 = 0
            r24 = 7
            r18 = r0
            r21 = r19
            r25 = r17
            r18.<init>(r19, r21, r23, r24, r25)
            com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo r11 = new com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1 = r26
            r1.<init>(r2, r5, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel.<init>():void");
    }

    public Video2StickerModel(OriginVideoInfo originVideoInfo, VideoCropData videoCropData, VideoTimeTrimData videoTimeTrimData, EditVideoInfo editVideoInfo) {
        o.LJIIIZ(originVideoInfo, "originVideoInfo");
        o.LJIIIZ(videoCropData, "videoCropData");
        o.LJIIIZ(videoTimeTrimData, "videoTimeTrimData");
        o.LJIIIZ(editVideoInfo, "editVideoInfo");
        this.originVideoInfo = originVideoInfo;
        this.videoCropData = videoCropData;
        this.videoTimeTrimData = videoTimeTrimData;
        this.editVideoInfo = editVideoInfo;
    }
}
