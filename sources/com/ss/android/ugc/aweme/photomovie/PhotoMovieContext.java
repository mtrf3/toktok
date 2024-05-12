package com.ss.android.ugc.aweme.photomovie;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes8.dex */
public class PhotoMovieContext extends BaseShortVideoContext {
    public static final Parcelable.Creator<PhotoMovieContext> CREATOR = new IDCreatorS51S0000000_7(7);

    @InterfaceC65349Pkn("coverPublishModel")
    public CoverPublishModel coverPublishModel;

    @InterfaceC65349Pkn("creationId")
    public String creationId;

    @InterfaceC65349Pkn("creative_version")
    public int creativeVersion;

    @InterfaceC65349Pkn("draftId")
    public int draftId;

    @InterfaceC65349Pkn("extract_model")
    public ExtractFramesModel extractFramesModel;

    @InterfaceC65349Pkn("is_background_publish")
    public boolean isBackgroundPublish;

    @InterfaceC65349Pkn("isMusicIllegal")
    public boolean isMusicIllegal;

    @InterfaceC65349Pkn("is_open_foreground_publish")
    public boolean isOpenForegroundPublish;

    @InterfaceC65349Pkn("mCoverStartTm")
    public float mCoverStartTm;

    @InterfaceC65349Pkn("mFilterId")
    public int mFilterId;

    @InterfaceC65349Pkn("mFilterName")
    public String mFilterName;

    @InterfaceC65349Pkn("mFilterPath")
    public String mFilterPath;

    @InterfaceC65349Pkn("mFinalVideoTmpPath")
    public String mFinalVideoTmpPath;

    @InterfaceC65349Pkn("mFrom")
    public int mFrom;

    @InterfaceC65349Pkn("mHeight")
    public int mHeight;

    @InterfaceC65349Pkn("mImageList")
    public List<String> mImageList;

    @InterfaceC65349Pkn("mInputAudioPath")
    public String mInputAudioPath;

    @InterfaceC65349Pkn("mMusic")
    public AVMusic mMusic;

    @InterfaceC65349Pkn("mMusicList")
    public List<AVMusic> mMusicList;

    @InterfaceC65349Pkn("mMusicPath")
    public String mMusicPath;

    @InterfaceC65349Pkn("mOutputVideoPath")
    public String mOutputVideoPath;

    @InterfaceC65349Pkn("mPlayType")
    public int mPlayType;

    @InterfaceC65349Pkn("mRealImageCount")
    public int mRealImageCount;

    @InterfaceC65349Pkn("save_model")
    public AVUploadSaveModel mSaveModel;

    @InterfaceC65349Pkn("mWidth")
    public int mWidth;

    @InterfaceC65349Pkn("music_origin")
    public String musicOrigin;

    @InterfaceC65349Pkn("newDraftId")
    public String newDraftId;

    @InterfaceC65349Pkn("photo_time")
    public int photoTime;

    @InterfaceC65349Pkn("shop_draft_id")
    public String shopDraftId;

    @InterfaceC65349Pkn("startTime")
    public long startTime;

    @InterfaceC65349Pkn("trans_time")
    public int transTime;

    @InterfaceC65349Pkn("video_cover_path")
    public String videoCoverPath;

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CoverPublishModel getCoverPublishModel() {
        if (this.coverPublishModel == null) {
            this.coverPublishModel = new CoverPublishModel();
        }
        return this.coverPublishModel;
    }

    public int getImageCount() {
        List<String> list = this.mImageList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getLocalTempPath() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalTempPath();
    }

    public boolean isSaveLocal() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel != null && aVUploadSaveModel.isSaveLocal()) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocalWithWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel != null && aVUploadSaveModel.isSaveLocalWithWaterMark()) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel != null && !aVUploadSaveModel.isWaterMark()) {
            return true;
        }
        return false;
    }

    public boolean isSaveToAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel != null && aVUploadSaveModel.getSaveToAlbum()) {
            return true;
        }
        return false;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel != null && aVUploadSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return true;
        }
        return false;
    }

    public PhotoMovieContext() {
        this.mMusicList = new ArrayList();
        this.creativeVersion = 0;
        this.newDraftId = "";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public String getCreationId() {
        return this.creationId;
    }

    public int getCreativeVersion() {
        return this.creativeVersion;
    }

    public PhotoMovieContext(Parcel parcel) {
        super(parcel);
        this.mMusicList = new ArrayList();
        this.creativeVersion = 0;
        this.newDraftId = "";
        this.mFinalVideoTmpPath = parcel.readString();
        this.mImageList = parcel.createStringArrayList();
        this.musicOrigin = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mPlayType = parcel.readInt();
        this.mOutputVideoPath = parcel.readString();
        this.mInputAudioPath = parcel.readString();
        this.mCoverStartTm = parcel.readFloat();
        this.mMusic = (AVMusic) parcel.readSerializable();
        this.mFilterPath = parcel.readString();
        this.mFilterName = parcel.readString();
        this.mFilterId = parcel.readInt();
        this.mFrom = parcel.readInt();
        this.creationId = parcel.readString();
        this.creativeVersion = parcel.readInt();
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.shopDraftId = parcel.readString();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.photoTime = parcel.readInt();
        this.transTime = parcel.readInt();
        this.mRealImageCount = parcel.readInt();
        this.coverPublishModel = (CoverPublishModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
        this.videoCoverPath = parcel.readString();
        this.mDraftToEditFrom = parcel.readInt();
        this.isMusicIllegal = parcel.readByte() != 0;
    }

    private String generateTempCoverPath(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getCacheDir(context));
        LIZ.append(getRandomFileName("_cover.png"));
        return X1D.LIZIZ(LIZ);
    }

    private String getCacheDir(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIIL(context).getPath());
        LIZ.append(File.separator);
        return X1D.LIZIZ(LIZ);
    }

    private String getRandomFileName(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(simpleDateFormat.format(time));
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public String getVideoCoverPath(Context context) {
        if (TextUtils.isEmpty(this.videoCoverPath)) {
            this.videoCoverPath = generateTempCoverPath(context);
        }
        return this.videoCoverPath;
    }

    public void setCoverPublishModel(CoverPublishModel coverPublishModel) {
        this.coverPublishModel = coverPublishModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mFinalVideoTmpPath);
        parcel.writeStringList(this.mImageList);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mPlayType);
        parcel.writeString(this.mOutputVideoPath);
        parcel.writeString(this.mInputAudioPath);
        parcel.writeFloat(this.mCoverStartTm);
        parcel.writeSerializable(this.mMusic);
        parcel.writeString(this.mFilterPath);
        parcel.writeString(this.mFilterName);
        parcel.writeInt(this.mFilterId);
        parcel.writeInt(this.mFrom);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.creativeVersion);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.shopDraftId);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeInt(this.photoTime);
        parcel.writeInt(this.transTime);
        parcel.writeInt(this.mRealImageCount);
        parcel.writeParcelable(this.coverPublishModel, i);
        parcel.writeString(this.videoCoverPath);
        parcel.writeInt(this.mDraftToEditFrom);
        parcel.writeByte(this.isMusicIllegal ? (byte) 1 : (byte) 0);
    }
}
