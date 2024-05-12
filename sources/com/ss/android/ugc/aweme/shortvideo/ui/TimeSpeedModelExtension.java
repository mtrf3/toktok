package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.InterfaceC65404Plg;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.mapping.TimeSpeedModelExtrasAdapterFactory;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import com.ss.android.ugc.aweme.sticker.model.RecordUploadVideoTimeInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class TimeSpeedModelExtension implements Parcelable {
    public static final Parcelable.Creator<TimeSpeedModelExtension> CREATOR = new IDCreatorS51S0000000_7(19);
    public BeautifySegmentInfo beautifySegmentInfo;
    public int cameraId;
    public String cameraLensInfo;
    public String createId;
    public int duration;
    public int editPageButtonStyle;
    public SimpleEffect effectInfo;
    public boolean enable;

    @InterfaceC65349Pkn("segmentFrameKey")
    public String identityKey;
    public boolean isBusiSticker;
    public boolean isUploadTypeSticker;
    public boolean isUseMirrorMode;
    public List<String> mARText;
    public BackgroundVideo mBackgroundVideo;
    public RecordUploadVideoTimeInfo mBackgroundVideoTimeInfo;
    public BeautyMetadata mBeautyMetadata;
    public List<String> mBubbleText;

    @InterfaceC65404Plg(TimeSpeedModelChallengeAdapterFactory.class)
    public List<AVChallenge> mChallenge;
    public String mCustomizedBuzExtra;
    public String mCustomizedPropIconPath;
    public String mCustomizedPropId;
    public String mCustomizedPropPath;
    public DiyPropVideo mDiyPropVideo;
    public String mDiyType;
    public RecordUploadVideoTimeInfo mDiypropVideoTimeInfo;
    public LibraryVideo mLibraryVideo;
    public String mStickerId;
    public List<String> mStickerMusicIds;
    public String mTemplatePropId;
    public EmbaddedWindowInfo mWindowInfo;

    @InterfaceC65404Plg(TimeSpeedModelExtrasAdapterFactory.class)
    public Bundle recordExtras;
    public SavePhotoStickerInfo savePhotoStickerInfo;
    public String segmentBeginTime;
    public double speed;
    public StickerInfo stickerInfo;
    public boolean supportExtractFrame;
    public boolean supportRetake;
    public int uploadTypeStickerSelectMediaSize;
    public long videoTimeStamp;
    public String words;

    public static int calculateRealTime(int i, double d) {
        return (int) ((i * 1.0d) / d);
    }

    public static long calculateRealTime(long j, double d) {
        return (long) ((j * 1.0d) / d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEffectIntensity() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null) {
            return "";
        }
        return stickerInfo.getEffectIntensity();
    }

    public String getGradeKey() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null || stickerInfo.getGradeKey() == null) {
            return "";
        }
        return this.stickerInfo.getGradeKey();
    }

    public String getImprPosition() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null) {
            return "";
        }
        return stickerInfo.getImprPosition();
    }

    public String getOriginalId() {
        SimpleEffect simpleEffect = this.effectInfo;
        if (simpleEffect == null || simpleEffect.getDesignerUid() == null) {
            return "";
        }
        return this.effectInfo.getDesignerUid();
    }

    public String getPropRec() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null || stickerInfo.getRecId() == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return this.stickerInfo.getRecId();
    }

    public String getPropSource() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null || stickerInfo.getPropSource() == null) {
            return "";
        }
        return this.stickerInfo.getPropSource();
    }

    public Bundle getRecordExtras() {
        Bundle target = this.recordExtras;
        o.LJIIIZ(target, "target");
        if (target.getClassLoader() == null) {
            target.setClassLoader(getClass().getClassLoader());
        }
        return this.recordExtras;
    }

    public String getSearchParams() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null || stickerInfo.getPropSearchParams() == null) {
            return "";
        }
        return this.stickerInfo.getPropSearchParams();
    }

    public String getTabIds() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null) {
            return "";
        }
        return stickerInfo.getPropTabId();
    }

    public String getTabOrder() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null) {
            return "";
        }
        return stickerInfo.getTabOrder();
    }

    public boolean isAudioGraphOutput() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo != null && stickerInfo.isAudioGraphOutput()) {
            return true;
        }
        return false;
    }

    public boolean isGameTypeSticker() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo != null && stickerInfo.isGameTypeSticker()) {
            return true;
        }
        return false;
    }

    public boolean isTextTypeSticker() {
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo != null && stickerInfo.isTextTypeSticker()) {
            return true;
        }
        return false;
    }

    public TimeSpeedModelExtension() {
        this.recordExtras = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.enable = true;
        this.supportExtractFrame = false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public TimeSpeedModelExtension m160clone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) obtain.readValue(TimeSpeedModelExtension.class.getClassLoader());
        obtain.recycle();
        return timeSpeedModelExtension;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("durationSDK: ");
        LIZ.append(getDuration());
        LIZ.append(" speed: ");
        LIZ.append(getSpeed());
        return X1D.LIZIZ(LIZ);
    }

    public List<String> getARTexts() {
        return this.mARText;
    }

    public BackgroundVideo getBackgroundVideo() {
        return this.mBackgroundVideo;
    }

    public BeautifySegmentInfo getBeautifySegmentInfo() {
        return this.beautifySegmentInfo;
    }

    public BeautyMetadata getBeautyMetadata() {
        return this.mBeautyMetadata;
    }

    public List<String> getBubbleTexts() {
        return this.mBubbleText;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public String getCameraLensInfo() {
        return this.cameraLensInfo;
    }

    public String getCreateId() {
        return this.createId;
    }

    public String getCustomizedBuzExtra() {
        return this.mCustomizedBuzExtra;
    }

    public String getCustomizedPropIconPath() {
        return this.mCustomizedPropIconPath;
    }

    public String getCustomizedPropId() {
        return this.mCustomizedPropId;
    }

    public String getCustomizedPropPath() {
        return this.mCustomizedPropPath;
    }

    public DiyPropVideo getDiyPropVideo() {
        return this.mDiyPropVideo;
    }

    public String getDiyType() {
        return this.mDiyType;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEditPageButtonStyle() {
        return this.editPageButtonStyle;
    }

    public SimpleEffect getEffectInfo() {
        return this.effectInfo;
    }

    public List<AVChallenge> getHashtag() {
        return this.mChallenge;
    }

    public String getIdentityKey() {
        return this.identityKey;
    }

    public LibraryVideo getLibraryVideo() {
        return this.mLibraryVideo;
    }

    public SavePhotoStickerInfo getSavePhotoStickerInfo() {
        return this.savePhotoStickerInfo;
    }

    public String getSegmentBeginTime() {
        return this.segmentBeginTime;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getStickerId() {
        return this.mStickerId;
    }

    public StickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public List<String> getStickerMusicIds() {
        return this.mStickerMusicIds;
    }

    public String getTemplatePropId() {
        return this.mTemplatePropId;
    }

    public int getUploadTypeStickerSelectMediaSize() {
        return this.uploadTypeStickerSelectMediaSize;
    }

    public long getVideoTimeStamp() {
        return this.videoTimeStamp;
    }

    public String getWords() {
        return this.words;
    }

    public RecordUploadVideoTimeInfo getmBackgroundVideoTimeInfo() {
        return this.mBackgroundVideoTimeInfo;
    }

    public RecordUploadVideoTimeInfo getmDiyPropVideoTimeInfo() {
        return this.mBackgroundVideoTimeInfo;
    }

    public EmbaddedWindowInfo getmWindowInfo() {
        return this.mWindowInfo;
    }

    public boolean isBusiSticker() {
        return this.isBusiSticker;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSupportExtractFrame() {
        return this.supportExtractFrame;
    }

    public boolean isSupportRetake() {
        return this.supportRetake;
    }

    public boolean isUploadTypeSticker() {
        return this.isUploadTypeSticker;
    }

    public boolean isUseMirrorMode() {
        return this.isUseMirrorMode;
    }

    public TimeSpeedModelExtension(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.recordExtras = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.enable = true;
        this.supportExtractFrame = false;
        this.duration = parcel.readInt();
        this.speed = parcel.readDouble();
        this.cameraId = parcel.readInt();
        this.mStickerId = parcel.readString();
        this.mTemplatePropId = parcel.readString();
        this.mCustomizedPropId = parcel.readString();
        this.mCustomizedPropIconPath = parcel.readString();
        this.mCustomizedPropPath = parcel.readString();
        this.mDiyType = parcel.readString();
        this.mCustomizedBuzExtra = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isBusiSticker = z;
        this.editPageButtonStyle = parcel.readInt();
        this.mStickerMusicIds = parcel.createStringArrayList();
        this.stickerInfo = (StickerInfo) parcel.readSerializable();
        this.words = parcel.readString();
        this.mChallenge = parcel.createTypedArrayList(AVChallenge.CREATOR);
        this.mWindowInfo = (EmbaddedWindowInfo) parcel.readParcelable(EmbaddedWindowInfo.class.getClassLoader());
        this.mBubbleText = parcel.createStringArrayList();
        this.mARText = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.supportRetake = z2;
        this.mBackgroundVideo = (BackgroundVideo) parcel.readParcelable(BackgroundVideo.class.getClassLoader());
        this.mBackgroundVideoTimeInfo = (RecordUploadVideoTimeInfo) parcel.readParcelable(RecordUploadVideoTimeInfo.class.getClassLoader());
        this.createId = parcel.readString();
        this.mLibraryVideo = (LibraryVideo) parcel.readParcelable(LibraryVideo.class.getClassLoader());
        this.mBeautyMetadata = (BeautyMetadata) parcel.readParcelable(BeautyMetadata.class.getClassLoader());
        this.cameraLensInfo = parcel.readString();
        this.savePhotoStickerInfo = (SavePhotoStickerInfo) parcel.readParcelable(SavePhotoStickerInfo.class.getClassLoader());
        this.segmentBeginTime = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUploadTypeSticker = z3;
        this.uploadTypeStickerSelectMediaSize = parcel.readInt();
        this.recordExtras = (Bundle) parcel.readParcelable(TimeSpeedModelExtension.class.getClassLoader());
        this.effectInfo = (SimpleEffect) parcel.readParcelable(SimpleEffect.class.getClassLoader());
        this.identityKey = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.supportExtractFrame = z4;
        this.videoTimeStamp = parcel.readLong();
        this.isUseMirrorMode = parcel.readByte() != 0;
        this.beautifySegmentInfo = (BeautifySegmentInfo) parcel.readParcelable(BeautifySegmentInfo.class.getClassLoader());
    }

    public static int calculateRealTime(List<TimeSpeedModelExtension> list) {
        int i = 0;
        if (list != null && list.size() > 0) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
                i += calculateRealTime(timeSpeedModelExtension.duration, timeSpeedModelExtension.speed);
            }
        }
        return i;
    }

    public void adjustDuration(long j) {
        this.duration = (int) j;
    }

    public <T> T getFromRecordExtras(String str) {
        T t = (T) C16880lQ.LLJJIII(this.recordExtras, str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public void setARText(List<String> list) {
        this.mARText = list;
    }

    public void setBubbleText(List<String> list) {
        this.mBubbleText = list;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setLibraryVideo(LibraryVideo libraryVideo) {
        this.mLibraryVideo = libraryVideo;
    }

    public void setRecordExtras(Bundle bundle) {
        this.recordExtras = bundle;
    }

    public void setSpeed(double d) {
        this.speed = d;
    }

    public void setStickerInfo(StickerInfo stickerInfo) {
        this.stickerInfo = stickerInfo;
    }

    public void setStickerMusicIds(List<String> list) {
        this.mStickerMusicIds = list;
    }

    public void setSupportExtractFrame(boolean z) {
        this.supportExtractFrame = z;
    }

    public void setWords(String str) {
        this.words = str;
    }

    public void setmWindowInfo(EmbaddedWindowInfo embaddedWindowInfo) {
        this.mWindowInfo = embaddedWindowInfo;
    }

    public m toJson(Gson gson) {
        return GsonProtectorUtils.toJsonTree(gson, this).LJIIZILJ();
    }

    public static TimeSpeedModelExtension fromJson(Gson gson, m mVar) {
        return (TimeSpeedModelExtension) GsonProtectorUtils.fromJson(gson, (j) mVar, TimeSpeedModelExtension.class);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeDouble(this.speed);
        parcel.writeInt(this.cameraId);
        parcel.writeString(this.mStickerId);
        parcel.writeString(this.mTemplatePropId);
        parcel.writeString(this.mCustomizedPropId);
        parcel.writeString(this.mCustomizedPropIconPath);
        parcel.writeString(this.mCustomizedPropPath);
        parcel.writeString(this.mDiyType);
        parcel.writeString(this.mCustomizedBuzExtra);
        parcel.writeByte(this.isBusiSticker ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.editPageButtonStyle);
        parcel.writeStringList(this.mStickerMusicIds);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeString(this.words);
        parcel.writeTypedList(this.mChallenge);
        parcel.writeParcelable(this.mWindowInfo, i);
        parcel.writeStringList(this.mBubbleText);
        parcel.writeStringList(this.mARText);
        parcel.writeByte(this.supportRetake ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mBackgroundVideo, i);
        parcel.writeParcelable(this.mBackgroundVideoTimeInfo, i);
        parcel.writeString(this.createId);
        parcel.writeParcelable(this.mLibraryVideo, i);
        parcel.writeParcelable(this.mBeautyMetadata, i);
        parcel.writeString(this.cameraLensInfo);
        parcel.writeParcelable(this.savePhotoStickerInfo, i);
        parcel.writeString(this.segmentBeginTime);
        parcel.writeByte(this.isUploadTypeSticker ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.uploadTypeStickerSelectMediaSize);
        parcel.writeParcelable(this.recordExtras, i);
        parcel.writeParcelable(this.effectInfo, i);
        parcel.writeString(this.identityKey);
        parcel.writeByte(isSupportExtractFrame() ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.videoTimeStamp);
        parcel.writeByte(this.isUseMirrorMode ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.beautifySegmentInfo, i);
    }

    public TimeSpeedModelExtension(int i, double d, String str, List<AVChallenge> list, List<String> list2) {
        this.recordExtras = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.enable = true;
        this.supportExtractFrame = false;
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.mChallenge = list;
        this.mStickerMusicIds = list2;
    }

    public TimeSpeedModelExtension(int i, double d, String str, String str2, String str3, String str4, String str5, String str6, String str7, StickerInfo stickerInfo, SimpleEffect simpleEffect, List<AVChallenge> list, List<String> list2, EmbaddedWindowInfo embaddedWindowInfo, List<String> list3, List<String> list4, int i2, boolean z, int i3, boolean z2, BackgroundVideo backgroundVideo, DiyPropVideo diyPropVideo, RecordUploadVideoTimeInfo recordUploadVideoTimeInfo, RecordUploadVideoTimeInfo recordUploadVideoTimeInfo2, String str8, BeautyMetadata beautyMetadata, String str9, SavePhotoStickerInfo savePhotoStickerInfo, String str10, boolean z3, int i4, String str11, boolean z4, Bundle bundle) {
        Bundle bundle2 = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.recordExtras = bundle2;
        this.enable = true;
        this.supportExtractFrame = false;
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.mTemplatePropId = str2;
        this.mCustomizedPropId = str3;
        this.mCustomizedPropIconPath = str4;
        this.mCustomizedPropPath = str5;
        this.mDiyType = str6;
        this.mCustomizedBuzExtra = str7;
        this.stickerInfo = stickerInfo;
        this.effectInfo = simpleEffect;
        this.mChallenge = list;
        this.mStickerMusicIds = list2;
        this.mWindowInfo = embaddedWindowInfo;
        this.mARText = list3;
        this.mBubbleText = list4;
        this.cameraId = i2;
        this.isBusiSticker = z;
        this.editPageButtonStyle = i3;
        this.mBackgroundVideo = backgroundVideo;
        this.mDiyPropVideo = diyPropVideo;
        this.mBackgroundVideoTimeInfo = recordUploadVideoTimeInfo;
        this.mDiypropVideoTimeInfo = recordUploadVideoTimeInfo2;
        this.createId = str8;
        this.supportRetake = z2;
        this.mBeautyMetadata = beautyMetadata;
        this.cameraLensInfo = str9;
        this.savePhotoStickerInfo = savePhotoStickerInfo;
        this.segmentBeginTime = str10;
        this.isUploadTypeSticker = z3;
        this.uploadTypeStickerSelectMediaSize = i4;
        if (str11 != null) {
            this.identityKey = str11;
        }
        this.isUseMirrorMode = z4;
        if (bundle != null) {
            bundle2.putAll(bundle);
            this.supportExtractFrame = bundle.getBoolean("support_extract_frame", false);
        }
        Bundle bundle3 = this.recordExtras;
        if (bundle3 != null) {
            this.beautifySegmentInfo = (BeautifySegmentInfo) bundle3.getParcelable("beauty_segment_info");
            this.recordExtras.remove("beauty_segment_info");
        }
        this.videoTimeStamp = System.currentTimeMillis();
    }
}
