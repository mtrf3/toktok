package dmt.av.video;

import X.InterfaceC133095Kf;
import X.Q89;
import X.X1D;
import Y.IDCreatorS47S0000000_2;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VETimelineParams;
import defpackage.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class VEPreviewParams implements InterfaceC133095Kf, Parcelable, Serializable {
    public static final Parcelable.Creator<VEPreviewParams> CREATOR = new IDCreatorS47S0000000_2(8);
    public long audioAecDelayTime;
    public CanvasVideoData canvasVideoPreviewData;
    public boolean enableMusicSync;
    public boolean interceptAutoPlay;
    public boolean isCutSameType;
    public boolean isFastImport;
    public boolean isFromCut;
    public boolean isMusicSyncMode;
    public boolean isStoryEditMode;
    public boolean isVideoImageMixFastImport;
    public boolean loadImageOptimizeByVEUserConfig;
    public boolean loadMixImageOptimizeByUserConfig;
    public String[] mAudioPaths;
    public int mCanvasHeight;
    public int mCanvasWidth;
    public double mDbRange;
    public VEEditorModel mEditorModel;
    public boolean mEnableAutoStart;
    public int mFps;
    public boolean mIsFromDraft;
    public int mMusicInPoint;
    public int mMusicOutPoint;
    public String mMusicPath;
    public float mMusicVolume;
    public int mPageMode;
    public int mPageType;
    public int mPreviewHeight;
    public int mPreviewWidth;
    public int[] mRotateArray;
    public float[] mSpeedArray;
    public VETimelineParams mTimelineParams;
    public boolean mUseVEPublic;
    public int[] mVTrimIn;
    public int[] mVTrimOut;
    public AudioEffectParam mVeAudioEffectParam;
    public AudioRecorderParam mVeAudioRecordParam;
    public String[] mVideoPaths;
    public float mVolume;
    public String mWorkspace;
    public MvCreateVideoData mvCreateVideoData;
    public boolean needVEUserConfig;
    public MultiEditVideoStatusRecordData recordData;
    public int sceneIn;
    public int sceneOut;
    public ArrayList<CutSameMediaItem> selectedTemplateMediaItemList;
    public String selectedTemplateStr;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public StitchParams stitchParams;
    public VECherEffectParam veCherEffectParam;
    public int videoEditorType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC133095Kf
    public long getEditorHandler() {
        return -1L;
    }

    public MultiSegmentPropExtra getMultiSegmentPropInfo() {
        return null;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getNeedTemplateExtra() {
        return true;
    }

    public String getRecordStickers() {
        return null;
    }

    @Override // X.InterfaceC133095Kf
    public boolean isCanvasVEEditorType() {
        return false;
    }

    public void setEditorHandler(long j) {
    }

    public void setMultiSegmentPropInfo(MultiSegmentPropExtra multiSegmentPropExtra) {
    }

    public void setRecordStickers(String str) {
    }

    public VEPreviewParams() {
        this.mFps = -1;
        this.mEnableAutoStart = true;
        this.mVolume = 1.0f;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEPreviewParams{mVideoPaths=");
        LIZ.append(Arrays.toString(this.mVideoPaths));
        LIZ.append(", mAudioPaths=");
        LIZ.append(Arrays.toString(this.mAudioPaths));
        LIZ.append(", mWorkspace='");
        Q89.LIZIZ(LIZ, this.mWorkspace, '\'', ", mVolume=");
        LIZ.append(this.mVolume);
        LIZ.append(", mFps=");
        LIZ.append(this.mFps);
        LIZ.append(", mVTrimIn=");
        LIZ.append(this.mVTrimIn);
        LIZ.append(", mVTrimOut=");
        LIZ.append(this.mVTrimOut);
        LIZ.append(", sceneIn=");
        LIZ.append(this.sceneIn);
        LIZ.append(", sceneOut=");
        LIZ.append(this.sceneOut);
        LIZ.append(", canvasWidth=");
        LIZ.append(this.mCanvasWidth);
        LIZ.append(", canvasHeight=");
        LIZ.append(this.mCanvasHeight);
        LIZ.append(", pageMode=");
        return b0.LIZJ(LIZ, this.mPageMode, '}', LIZ);
    }

    @Override // X.InterfaceC133095Kf
    public String[] getAudioPaths() {
        return this.mAudioPaths;
    }

    @Override // X.InterfaceC133095Kf
    public int getCanvasHeight() {
        return this.mCanvasHeight;
    }

    @Override // X.InterfaceC133095Kf
    public int getCanvasWidth() {
        return this.mCanvasWidth;
    }

    @Override // X.InterfaceC133095Kf
    public double getDbRange() {
        return this.mDbRange;
    }

    public VEEditorModel getEditorModel() {
        return this.mEditorModel;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getEnableAutoStart() {
        return this.mEnableAutoStart;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getEnableMusicSync() {
        return this.enableMusicSync;
    }

    @Override // X.InterfaceC133095Kf
    public int getFps() {
        return this.mFps;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getInterceptAutoPlay() {
        return this.interceptAutoPlay;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getLoadImageOptimizeByVEUserConfig() {
        return this.loadImageOptimizeByVEUserConfig;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getLoadMixImageOptimizeByVEUserConfig() {
        return this.loadMixImageOptimizeByUserConfig;
    }

    public float getMusicVolume() {
        return this.mMusicVolume;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getNeedVEUserConfig() {
        return this.needVEUserConfig;
    }

    @Override // X.InterfaceC133095Kf
    public int getPageMode() {
        return this.mPageMode;
    }

    @Override // X.InterfaceC133095Kf
    public int getPreviewHeight() {
        return this.mPreviewHeight;
    }

    @Override // X.InterfaceC133095Kf
    public int getPreviewWidth() {
        return this.mPreviewWidth;
    }

    @Override // X.InterfaceC133095Kf
    public int[] getRotateArray() {
        return this.mRotateArray;
    }

    @Override // X.InterfaceC133095Kf
    public float[] getSpeedArray() {
        return this.mSpeedArray;
    }

    public VETimelineParams getTimelineParams() {
        return this.mTimelineParams;
    }

    @Override // X.InterfaceC133095Kf
    public boolean getUseVEPublic() {
        return this.mUseVEPublic;
    }

    @Override // X.InterfaceC133095Kf
    public int[] getVTrimIn() {
        return this.mVTrimIn;
    }

    @Override // X.InterfaceC133095Kf
    public int[] getVTrimOut() {
        return this.mVTrimOut;
    }

    @Override // X.InterfaceC133095Kf
    public IAudioEffectParam getVeAudioEffectParam() {
        return this.mVeAudioEffectParam;
    }

    public AudioRecorderParam getVeAudioRecordParam() {
        return this.mVeAudioRecordParam;
    }

    @Override // X.InterfaceC133095Kf
    public String[] getVideoPaths() {
        return this.mVideoPaths;
    }

    public float getVolume() {
        return this.mVolume;
    }

    @Override // X.InterfaceC133095Kf
    public String getWorkspace() {
        return this.mWorkspace;
    }

    public VEPreviewParams(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.mFps = -1;
        this.mEnableAutoStart = true;
        this.mVideoPaths = parcel.createStringArray();
        this.mAudioPaths = parcel.createStringArray();
        this.mWorkspace = parcel.readString();
        this.mVolume = parcel.readFloat();
        this.mMusicVolume = parcel.readFloat();
        this.mDbRange = parcel.readDouble();
        this.mFps = parcel.readInt();
        this.mVTrimIn = parcel.createIntArray();
        this.mVTrimOut = parcel.createIntArray();
        this.sceneIn = parcel.readInt();
        this.sceneOut = parcel.readInt();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
        this.mSpeedArray = parcel.createFloatArray();
        this.mRotateArray = parcel.createIntArray();
        this.veCherEffectParam = (VECherEffectParam) parcel.readParcelable(VECherEffectParam.class.getClassLoader());
        this.mCanvasWidth = parcel.readInt();
        this.mCanvasHeight = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mMusicInPoint = parcel.readInt();
        this.mMusicOutPoint = parcel.readInt();
        this.mPageType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isCutSameType = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.needVEUserConfig = z3;
        this.mVeAudioRecordParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.recordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.mPreviewWidth = parcel.readInt();
        this.mPreviewHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isFastImport = z4;
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        this.audioAecDelayTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isStoryEditMode = z5;
        this.canvasVideoPreviewData = (CanvasVideoData) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableMusicSync = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isMusicSyncMode = z7;
        this.isVideoImageMixFastImport = parcel.readByte() != 0;
        this.mPageMode = parcel.readInt();
    }

    public void setCanvasHeight(int i) {
        this.mCanvasHeight = i;
    }

    public void setCanvasWidth(int i) {
        this.mCanvasWidth = i;
    }

    public void setEditorModel(VEEditorModel vEEditorModel) {
        this.mEditorModel = vEEditorModel;
    }

    public void setEnableAutoStart(boolean z) {
        this.mEnableAutoStart = z;
    }

    public void setEnableMusicSync(boolean z) {
        this.enableMusicSync = z;
    }

    public void setInterceptAutoPlay(boolean z) {
        this.interceptAutoPlay = z;
    }

    @Override // X.InterfaceC133095Kf
    public void setLoadImageOptimizeByVEUserConfig(boolean z) {
        this.loadImageOptimizeByVEUserConfig = z;
    }

    @Override // X.InterfaceC133095Kf
    public void setLoadMixImageOptimizeByVEUserConfig(boolean z) {
        this.loadMixImageOptimizeByUserConfig = z;
    }

    public void setNeedVEUserConfig(boolean z) {
        this.needVEUserConfig = z;
    }

    public void setTimelineParams(VETimelineParams vETimelineParams) {
        this.mTimelineParams = vETimelineParams;
    }

    public void setUseVEPublic(boolean z) {
        this.mUseVEPublic = z;
    }

    public void setVeAudioEffectParam(IAudioEffectParam iAudioEffectParam) {
        this.mVeAudioEffectParam = (AudioEffectParam) iAudioEffectParam;
    }

    public void setVeAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.mVeAudioRecordParam = audioRecorderParam;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.mVideoPaths);
        parcel.writeStringArray(this.mAudioPaths);
        parcel.writeString(this.mWorkspace);
        parcel.writeFloat(this.mVolume);
        parcel.writeFloat(this.mMusicVolume);
        parcel.writeDouble(this.mDbRange);
        parcel.writeInt(this.mFps);
        parcel.writeIntArray(this.mVTrimIn);
        parcel.writeIntArray(this.mVTrimOut);
        parcel.writeInt(this.sceneIn);
        parcel.writeInt(this.sceneOut);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeFloatArray(this.mSpeedArray);
        parcel.writeIntArray(this.mRotateArray);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mCanvasWidth);
        parcel.writeInt(this.mCanvasHeight);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicInPoint);
        parcel.writeInt(this.mMusicOutPoint);
        parcel.writeInt(this.mPageType);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mVeAudioRecordParam, i);
        parcel.writeParcelable(this.recordData, i);
        parcel.writeInt(this.mPreviewWidth);
        parcel.writeInt(this.mPreviewHeight);
        parcel.writeByte(this.isFastImport ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCutSameType ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needVEUserConfig ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeByte(this.isStoryEditMode ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.canvasVideoPreviewData);
        parcel.writeByte(this.enableMusicSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMusicSyncMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isVideoImageMixFastImport ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mPageMode);
    }
}
