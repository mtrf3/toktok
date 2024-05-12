package com.ss.android.ugc.aweme.shortvideo.edit;

import X.AbstractC65654Ppi;
import X.C00F;
import X.C143195jf;
import X.C148585sM;
import X.C15070iV;
import X.C152295yL;
import X.C164826dS;
import X.C164846dU;
import X.C16880lQ;
import X.C17N;
import X.C32151Nz;
import X.C38352F3k;
import X.C42000Ge4;
import X.C42466Gla;
import X.C43710HDm;
import X.C44549He5;
import X.C44564HeK;
import X.C44687HgJ;
import X.C44694HgQ;
import X.C47261Igj;
import X.C5YW;
import X.C60903NvH;
import X.C62819Ol5;
import X.C63872f1;
import X.C63A;
import X.C6B8;
import X.C6H4;
import X.C76917UGr;
import X.C77413UZt;
import X.C78858UxC;
import X.C78926UyI;
import X.C78946Uyc;
import X.C78966Uyw;
import X.C79004UzY;
import X.DIW;
import X.EnumC164816dR;
import X.FFL;
import X.H57;
import X.H78;
import X.H7R;
import X.H7X;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import Y.IDCreatorS51S0000000_7;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoModeExposureData;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import defpackage.a1;
import defpackage.b1;
import defpackage.e1;
import defpackage.i0;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class VideoPublishEditModel extends BaseShortVideoContext implements DIW, Serializable, Cloneable {
    public static final Parcelable.Creator<VideoPublishEditModel> CREATOR = new IDCreatorS51S0000000_7(15);
    public static final long serialVersionUID = 1;
    public String aiMusicLogPbImprId;
    public String albumPreviewNextMethod;
    public int applyVoiceToAllTextSwitch;
    public long audioAecDelayTime;
    public AudioEnhanceParam audioEnhanceParam;
    public UrlModel audioTrack;
    public boolean autoAddTTSStickerOnce;
    public AnchorTransData autoAttachedAnchor;
    public boolean autoEnhanceOn;
    public int autoEnhanceType;
    public String backgroundVideoDraftDir;
    public int beautyType;
    public transient Gson businessGson;
    public String cameraIds;
    public ArrayList<String> cameraLensInfo;
    public CanvasVideoData canvasVideoData;
    public transient CaptionStruct captionStruct;
    public String ccVid;
    public String chain;
    public long clickGoNextBtnTime;
    public String clientId;
    public int comFrom;
    public CommentVideoModel commentVideoModel;
    public CompileProbeResult compileProbeResult;
    public boolean containBackgroundVideo;
    public boolean containDiyPropVideo;
    public ArrayList<Integer> countDownModes;
    public CoverPublishModel coverPublishModel;
    public int creationMode;
    public CreativeFlowData creativeFlowData;
    public CreativeInfo creativeInfo;
    public transient CreativeModel creativeModel;
    public int curMusicLength;
    public float currentZoomValue;
    public ArrayList<String> customStickerPaths;
    public Cut2EditTransferModel cut2EditTransferModel;
    public boolean disableDeleteChain;
    public DuetExtraInfo draftDuetExtraInfo;
    public boolean draftFromShoot;
    public int draftId;
    public long draftSaveTime;
    public String duetLayout;
    public String duetModeType;
    public int duetVideoDuration;
    public boolean editMusicSyncMode;
    public final transient String emptyMainBusinessContext;
    public int encryptType;
    public String enterFrom;
    public boolean enterFromImageSwitch;
    public HashMap<String, HashMap<String, String>> extraEventParams;
    public ExtractFramesModel extractFramesModel;
    public boolean faceBeautyOpen;
    public int fastImportErrorCode;
    public String fromItemId;
    public int gameScore;
    public ArrayList<GreenScreenMaterial> greenScreenMaterialList;
    public transient H57 hardcodeAdaptiveResult;
    public boolean hasMultiAudioLoudnessNormalization;
    public Boolean hasQaSticker;
    public String heading;
    public String hotSpotTag;
    public ImageAlbumData imageAlbumData;
    public ArrayList<ImportVideoInfo> importInfoList;
    public InfoStickerCategoryParams infoStickerCategoryParams;
    public InfoStickerModel infoStickerModel;
    public boolean isBackgroundPublish;
    public boolean isCommerceMusic;
    public boolean isCompileFinished;
    public boolean isConvertFromDraft;
    public boolean isDraftMusicIllegal;
    public boolean isDuetGreenSrceen;
    public boolean isFastImport;
    public boolean isFromRestoreRecover;
    public boolean isMuted;
    public boolean isOpenForegroundPublish;
    public boolean isOriginalSound;
    public boolean isPhotoMvMode;
    public boolean isPhotoMvMode1080p;
    public boolean isPhotoMvMusic;
    public boolean isReuseOriginalSound;
    public Boolean isSoundLoop;
    public boolean isStickPointMode;
    public boolean isStoryEditMode;
    public boolean isStoryTextRecord;
    public transient boolean isSyntheticHardEncode;
    public boolean isUseMusicBeforeEdit;
    public String isWestWindowExistStr;
    public LibraryMaterialInfoSv libraryMaterialInfo;
    public ArrayList<LibraryMaterialInfoSv> libraryMaterialList;
    public LoudnessBalanceParam loudnessBalanceParam;
    public ArrayList<BeautyMetadata> mBeautyMetadatas;
    public BeautyMobParam mBeautyMobParam;
    public String mBindMvId;
    public int mCameraPosition;
    public transient boolean mCropVideo;
    public String mCurFilterIds;
    public String mCurFilterLabels;
    public String mDesignerIdList;
    public User mDuetAuthor;
    public String mDuetFrom;
    public int mDuetFromDuetButton;
    public String mDuetHashTag;
    public boolean mDurationMode;
    public String mEncodedAudioOutputFile;
    public String mEyesLabels;
    public int mFaceBeauty;
    public String mFirstStickerMusicIdsJson;
    public boolean mFromCut;
    public boolean mFromMultiCut;
    public int mHardEncode;
    public String mId3Album;
    public String mId3Title;
    public boolean mIsMultiVideo;
    public String mMusicPath;
    public int mNewVersion;
    public int mOrigin;
    public int mOriginalStickerCount;
    public int mOutVideoHeight;
    public int mOutVideoWidth;
    public String mOutputFile;
    public String mParallelUploadOutputFile;
    public PoiData mPoiData;
    public String mRecordFilterIds;
    public String mRecordFilterLabels;
    public String mRecordFilterValues;
    public int mRecordVideoSelectedFilterIndex;
    public float mRecordVideoSelectedFilterIntensity;
    public String mReshapeLabels;
    public int mRestoreType;

    @InterfaceC65349Pkn("save_model")
    public AVUploadSaveModel mSaveModel;
    public String mSelectedFilterId;
    public float mSelectedFilterIntensity;
    public String mSelectedFilterLabel;
    public String mSelectedFilterResId;
    public int mSelectedId;
    public SharedARModel mSharedARModel;
    public int mShootMode;
    public int mShootedShootMode;
    public ShoutOutsData mShoutOutsData;
    public String mSmoothSkinLabels;
    public String mStickerID;
    public String mStickerPath;
    public C6B8 mSubtitleMusicChangeChecker;
    public String mTanningLabels;
    public String mUploadPath;
    public int mUseFilter;
    public int mVideoCanvasHeight;
    public int mVideoCanvasWidth;
    public float mVideoCoverStartTm;
    public String mVideoSegmentsDesc;
    public boolean mWillGoOnShortVideo;
    public transient Workspace mWorkspace;
    public transient C164846dU mainBusinessContext;
    public long maxDuration;
    public String md5;
    public int mentionEditTextLength;
    public ExtraMentionUserModel mentionUserModel;
    public Map<String, Object> metadataMap;
    public String microAppId;
    public MicroAppModel microAppModel;
    public MultiEditVideoStatusRecordData multiEditVideoRecordData;
    public String musicCover;
    public int musicEnd;
    public String musicId;
    public String musicOrigin;
    public int musicRecType;
    public String musicRequestId;
    public int musicShowRank;
    public int musicStart;
    public int musicType;
    public float musicVolume;
    public MvCreateVideoData mvCreateVideoData;
    public transient boolean needRegisterGsonAdapter;
    public String newDraftId;
    public String nleData;
    public transient NLEModel nleModel;
    public String openPlatformClientKey;
    public String openPlatformExtra;
    public VideoFileInfo originalVideoInfo;
    public int photoCount;
    public String pic2VideoSource;
    public EditPreviewInfo previewInfo;
    public float previewStartTime;
    public int propOrder;
    public List<String> publishDuetMentionedUserList;
    public String publishRetainType;
    public int publishStage;
    public boolean qaPermissionDialogShownStatus;
    public QAStickerModel qaStickerModel;
    public QaStruct qaStruct;
    public int recordBgmDelay;
    public int recordMode;
    public C42466Gla replaceMusicModel;
    public String reuseOriginalSoundId;
    public int reuseOriginalSoundLength;
    public UrlModel reuseOriginalSoundUrls;
    public int screenBrightness;
    public List<Integer> segmentLoudness;
    public UrlModel sendToUserHead;
    public String sentenceId;
    public String shareId;
    public String shootEnterMethod;
    public String shopDraftId;
    public boolean shouldEditorStartOptimization;
    public boolean shouldSkipMusicSync;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public String smartCompileLabel;
    public SocialModel socialModel;
    public boolean soundSyncFromAnchor;
    public StickPointData stickPointData;
    public int stickPointType;
    public StickerChallenge stickerChallenge;
    public StitchParams stitchParams;
    public StoryEditEtParam storyEditEtParam;
    public transient C44549He5 strategiesResult;
    public List<AVTextExtraStruct> structList;
    public boolean successEnableAEC;
    public boolean supportEnhanceCached;
    public boolean supportEnhanceField;
    public boolean supportRetake;
    public String synthesisFileHash;
    public ArrayList<InteractionTagUserInfo> tagUserList;
    public String templateId;
    public String textEffectIds;
    public float textLayoutHeight;
    public float textLayoutWidth;
    public TextStickerChallenges textStickerChallenges;
    public String textTypes;
    public List<String> texts;
    public String title;
    public TTStoryUploadModel ttStoryUploadModel;
    public TTSVoiceModel ttsVoiceModel;
    public String uploadMethod;
    public AVUploadMiscInfoStruct uploadMiscInfoStruct;
    public int uploadScene;
    public transient UploadSpeedEncodeSettings uploadSpeedEncodeSettings;
    public UploadSpeedInfo uploadSpeedInfo;
    public List<String> uploadTabNameList;
    public boolean usePaint;
    public boolean useTextInEditorPro;
    public AudioEffectParam veAudioEffectParam;
    public AudioRecorderParam veAudioRecorderParam;
    public ClientCherEffectParam veCherEffectParam;
    public int videoCount;

    @InterfaceC43620HAa
    public String videoCoverPath;
    public int videoDurationFromVideoCutPage;
    public int videoEditorType;
    public String videoSpeed;
    public int videoType;
    public float voiceVolume;
    public C78858UxC watermarkVideoResolution;

    public void autoAddTTSStickerOnce() {
        this.autoAddTTSStickerOnce = true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getLocationStickerParams() {
        List<InteractStickerStruct> LJI;
        InteractStickerStruct interactStickerStruct;
        try {
            C164846dU c164846dU = this.mainBusinessContext;
            if (c164846dU == null || (LJI = C164826dS.LJI(c164846dU, 13, EnumC164816dR.TRACK_PAGE_EDIT)) == null || LJI.isEmpty() || (interactStickerStruct = (InteractStickerStruct) ListProtector.get(LJI, 0)) == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            String poiId = interactStickerStruct.getPoiStickerStruct().getPoiId();
            if (!TextUtils.isEmpty(poiId)) {
                hashMap.put("sticker_poi_id", poiId);
            }
            hashMap.put("poi_enter_method", "poi_sticker");
            Map map = (Map) GsonHolder.LIZLLL().LIZ().LJI(interactStickerStruct.getAttr(), Map.class);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    hashMap.put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            if (isPoi() && interactStickerStruct.getPoiStickerStruct() != null) {
                if (Objects.equals(this.mPoiData.getPoiId(), interactStickerStruct.getPoiStickerStruct().getPoiId())) {
                    hashMap.put("is_sticker_poi", "1");
                } else {
                    hashMap.put("is_sticker_poi", CardStruct.IStatusCode.DEFAULT);
                }
            }
            return hashMap;
        } catch (Exception unused) {
        }
        return null;
    }

    public Float getPreviewStartTime() {
        Float valueOf = Float.valueOf(0.0f);
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return Float.valueOf(musicObject.previewStartTime);
        }
        return valueOf;
    }

    public void resetCompileProbeResult() {
        this.compileProbeResult = null;
    }

    public void setCommerceMusic(boolean z) {
    }

    public void setMId3Album(String str) {
    }

    public void setMId3Author(String str) {
    }

    public void setMId3Title(String str) {
    }

    public void setMusicCover(String str) {
    }

    public void setMusicId(String str) {
    }

    public void setPreviewStartTime(float f) {
    }

    public final ArrayList<TimeSpeedModelExtension> LIZ() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            if (C77413UZt.LJJ(multiEditVideoStatusRecordData.editSegments)) {
                return this.multiEditVideoRecordData.editSegments;
            }
            return this.multiEditVideoRecordData.originalSegments;
        }
        return null;
    }

    public boolean duetFilesExist() {
        if (C44687HgJ.LIZIZ(this.draftDuetExtraInfo.getDuetAudioPath()) && C44687HgJ.LIZIZ(this.draftDuetExtraInfo.getDuetVideoPath())) {
            return true;
        }
        return false;
    }

    public String formatCameraLensInfo() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.cameraLensInfo.size(); i++) {
            for (String str : ((String) ListProtector.get(this.cameraLensInfo, i)).split(":")) {
                if (!str.isEmpty()) {
                    hashSet.add(CastIntegerProtector.valueOf(str));
                }
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(ListProtector.get(arrayList, i2));
            if (i2 != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void generateVideoCoverPath() {
        if (TextUtils.isEmpty(this.videoCoverPath) || !new File(this.videoCoverPath).exists()) {
            this.videoCoverPath = C5YW.LIZIZ().LIZIZ(this.creativeInfo);
        }
    }

    public String getAllSelectedEffectIds() {
        String selectedEffectIds;
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> LIZ = LIZ();
        if (LIZ != null) {
            Iterator<TimeSpeedModelExtension> it = LIZ.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (next.getStickerInfo() != null && (selectedEffectIds = next.getStickerInfo().getSelectedEffectIds()) != null) {
                    arrayList.add(selectedEffectIds);
                }
            }
            ArrayList arrayList2 = new ArrayList(new LinkedHashSet(arrayList));
            StringBuilder sb = new StringBuilder();
            if (!C77413UZt.LJIILL(arrayList2)) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    sb.append((String) ListProtector.get(arrayList2, i));
                    if (i != arrayList2.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        return "";
    }

    public String getBackgroundVideoDraftDir() {
        if (TextUtils.isEmpty(this.backgroundVideoDraftDir)) {
            this.backgroundVideoDraftDir = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LIZ(this, "");
        }
        return this.backgroundVideoDraftDir;
    }

    public String getContactVideoPathAsKey() {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            String str = multiEditVideoRecordData.concatVideo;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            StitchParams stitchParams = this.stitchParams;
            if (stitchParams != null && stitchParams.getConcatVideoPath() != null && !TextUtils.isEmpty(this.stitchParams.getConcatVideoPath())) {
                return this.stitchParams.getConcatVideoPath();
            }
        }
        return videoPath();
    }

    public CoverPublishModel getCoverPublishModel() {
        if (this.coverPublishModel == null) {
            this.coverPublishModel = new CoverPublishModel();
        }
        return this.coverPublishModel;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public String getCreationId() {
        return this.creativeInfo.getCreationId();
    }

    public ArrayList<Float> getCurMultiEditVideoDurations() {
        long endTime;
        long startTime;
        ArrayList<Float> arrayList = new ArrayList<>();
        if (getCurMultiEditVideoRecordData() != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : getCurMultiEditVideoRecordData().segmentDataList) {
                MusicSyncData musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
                if (musicSyncData != null) {
                    endTime = musicSyncData.getVideoEnd();
                    startTime = multiEditVideoSegmentRecordData.musicSyncData.getVideoStart();
                } else {
                    endTime = multiEditVideoSegmentRecordData.getEndTime();
                    startTime = multiEditVideoSegmentRecordData.getStartTime();
                }
                arrayList.add(Float.valueOf(new BigDecimal(((float) (endTime - startTime)) / 1000.0f).setScale(1, 4).floatValue()));
            }
        }
        return arrayList;
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordDataInEditorPro() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null) {
            return null;
        }
        return multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
    }

    public int getCurMusicServerLength() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.duration;
        }
        return -1;
    }

    public String getDescriptionByUpload() {
        if (C32151Nz.LJJIIZI(this.importInfoList)) {
            return ((ImportVideoInfo) ListProtector.get(this.importInfoList, 0)).getDescription();
        }
        return "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getDuetLayoutLogMode() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.draft.model.DuetExtraInfo r0 = r3.draftDuetExtraInfo
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            java.lang.String r1 = r0.getDuetLayoutMode()
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1984141450: goto L30;
                case 346401221: goto L27;
                case 1387629604: goto L1e;
                case 1415681320: goto L15;
                default: goto L14;
            }
        L14:
            return r2
        L15:
            java.lang.String r0 = "green_screen"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L39
            goto L14
        L1e:
            java.lang.String r0 = "horizontal"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3c
            goto L14
        L27:
            java.lang.String r0 = "picture_in_picture"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3f
            goto L14
        L30:
            java.lang.String r0 = "vertical"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L42
            goto L14
        L39:
            java.lang.String r0 = "2"
            return r0
        L3c:
            java.lang.String r0 = "1"
            return r0
        L3f:
            java.lang.String r0 = "3"
            return r0
        L42:
            java.lang.String r0 = "4"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.getDuetLayoutLogMode():java.lang.String");
    }

    public EditEffectModel getEditEffectModel() {
        return this.creativeModel.editEffectModel;
    }

    public String getEditFilterId() {
        String str = this.mSelectedFilterId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEditFilterName() {
        String str = this.mSelectedFilterLabel;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getEditPagePrePublishId() {
        return this.creativeModel.prePublishEntranceModel.publishId;
    }

    public String getEditStickerIds() {
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel == null) {
            return "";
        }
        return infoStickerModel.getInfoStickerIds();
    }

    public EditorProModel getEditorProModel() {
        if (this.creativeFlowData.getEditorProModel() == null) {
            EditorProModel editorProModel = new EditorProModel();
            editorProModel.setOldEffectDraft(false);
            this.creativeFlowData.setEditorProModel(editorProModel);
        }
        return this.creativeFlowData.getEditorProModel();
    }

    public ArrayList<EffectPointModel> getEffectList() {
        return this.creativeModel.editEffectModel.effectList;
    }

    public ArrayList<TimeSpeedModelExtension> getFinalVideoList() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && C32151Nz.LJJIIZI(multiEditVideoStatusRecordData.editCutSegments)) {
            return this.multiEditVideoRecordData.editCutSegments;
        }
        return CameraComponentModel.LJIIJJI(this.mVideoSegmentsDesc);
    }

    public int getFrom() {
        if (this.mFromCut) {
            return 0;
        }
        if (this.mFromMultiCut) {
            return 1;
        }
        return 3;
    }

    public H57 getHardcodeAdaptiveResult() {
        C44549He5 c44549He5 = this.strategiesResult;
        if (c44549He5 != null) {
            return c44549He5.LIZLLL;
        }
        return this.hardcodeAdaptiveResult;
    }

    public boolean getHasClippedEffect() {
        return this.creativeModel.editEffectModel.hasClippedEffect;
    }

    public int getImportVideoCount() {
        ArrayList<ImportVideoInfo> arrayList = this.importInfoList;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public Boolean getIsSoundLoop() {
        return this.creativeModel.musicBuzModel.isSoundLoop;
    }

    public String getLibraryContentsSourceParam() {
        StringBuilder sb = new StringBuilder();
        ArrayList<LibraryMaterialInfoSv> arrayList = this.libraryMaterialList;
        if (arrayList != null) {
            Iterator<LibraryMaterialInfoSv> it = arrayList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                if (sb.length() == 0) {
                    sb.append(next.getMaterialProvider());
                } else {
                    sb.append(',');
                    sb.append(next.getMaterialProvider());
                }
            }
        }
        return sb.toString();
    }

    public String getLibraryMaterialARs() {
        int intValue;
        int intValue2;
        String str;
        StringBuilder sb = new StringBuilder();
        if (C77413UZt.LJJ(this.libraryMaterialList)) {
            Iterator<LibraryMaterialInfoSv> it = this.libraryMaterialList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                if (next.getWidth() == null) {
                    intValue = 1;
                } else {
                    intValue = next.getWidth().intValue();
                }
                if (next.getHeight() == null) {
                    intValue2 = 1;
                } else {
                    intValue2 = next.getHeight().intValue();
                }
                String LLLZI = C16880lQ.LLLZI(Locale.US, "%d/%d", new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)});
                if (sb.length() == 0) {
                    str = "";
                } else {
                    str = ",";
                }
                sb.append(str);
                sb.append(LLLZI);
            }
        }
        return sb.toString();
    }

    public int getLibraryMaterialCount() {
        if (C77413UZt.LJIILL(this.libraryMaterialList)) {
            return 0;
        }
        return this.libraryMaterialList.size();
    }

    public String getLibraryMaterialIds() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (C77413UZt.LJJ(this.libraryMaterialList)) {
            Iterator<LibraryMaterialInfoSv> it = this.libraryMaterialList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                if (sb.length() == 0) {
                    str = "";
                } else {
                    str = ",";
                }
                sb.append(str);
                sb.append(next.getId());
            }
        }
        return sb.toString();
    }

    public String getLibraryMaterialOrientations() {
        int intValue;
        int intValue2;
        String str;
        StringBuilder sb = new StringBuilder();
        if (C77413UZt.LJJ(this.libraryMaterialList)) {
            Iterator<LibraryMaterialInfoSv> it = this.libraryMaterialList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                int i = 1;
                if (next.getWidth() == null) {
                    intValue = 1;
                } else {
                    intValue = next.getWidth().intValue();
                }
                if (next.getHeight() == null) {
                    intValue2 = 1;
                } else {
                    intValue2 = next.getHeight().intValue();
                }
                if (intValue <= intValue2 || !H7X.LIZ()) {
                    i = 0;
                }
                if (sb.length() == 0) {
                    str = "";
                } else {
                    str = ",";
                }
                sb.append(str);
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public String getLibrarySearchResultParam() {
        StringBuilder sb = new StringBuilder();
        ArrayList<LibraryMaterialInfoSv> arrayList = this.libraryMaterialList;
        if (arrayList != null) {
            Iterator<LibraryMaterialInfoSv> it = arrayList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                String str = "1";
                if (sb.length() == 0) {
                    if (!next.isFromSearch()) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    sb.append(str);
                } else {
                    sb.append(',');
                    if (!next.isFromSearch()) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public String getLocalFinalPath() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalFinalPath();
    }

    public String getLocalSilentSharePath() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalSilentSharePath();
    }

    public String getLocalTempPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        C78966Uyw.LJJJJLL(new File(this.mSaveModel.getLocalTempPath()).getParentFile());
        return this.mSaveModel.getLocalTempPath();
    }

    public int getMCurMusicLength() {
        return this.creativeModel.musicBuzModel.mCurMusicLength;
    }

    public String getMId3Album() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.album;
        }
        return null;
    }

    public String getMId3Author() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.authorName;
        }
        return null;
    }

    public String getMId3Title() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.musicName;
        }
        return null;
    }

    public int getMMusicEnd() {
        return this.creativeModel.musicBuzModel.musicEnd;
    }

    public String getMMusicPath() {
        return this.creativeModel.musicBuzModel.musicPath;
    }

    public int getMMusicRecType() {
        return this.creativeModel.musicBuzModel.musicRecType;
    }

    public int getMMusicShowRank() {
        return this.creativeModel.musicBuzModel.musicShowRank;
    }

    public int getMMusicStart() {
        return this.creativeModel.musicBuzModel.musicStart;
    }

    public int getMMusicType() {
        return this.creativeModel.musicBuzModel.mMusicType;
    }

    public C164846dU getMainBusinessContext() {
        C164846dU c164846dU = this.mainBusinessContext;
        if (c164846dU != null) {
            return c164846dU;
        }
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null) {
            if (this.needRegisterGsonAdapter && (C00F.LIZ(31744, 0, "studio_enable_opt_user_gson", true) & 1) != 0) {
                this.needRegisterGsonAdapter = false;
                try {
                    this.businessGson = GsonHolder.LIZLLL().LIZ();
                } catch (Throwable unused) {
                }
            }
            try {
                if ("{\"interactStickerCheckEffectSdk\":false,\"mInteractStickerContext\":{\"multi_edit_map\":{},\"multi_record_map\":{}}}".equals(mainBusinessData)) {
                    FFL.LJIIIZ().getClass();
                    if ((FFL.LJIIJ(31744, 0, "studio_enable_opt_user_gson", true) & 2) != 0) {
                        C164846dU c164846dU2 = new C164846dU();
                        this.mainBusinessContext = c164846dU2;
                        c164846dU2.setInteractStickerContext(new InteractStickerTracksContext());
                    }
                }
                this.mainBusinessContext = (C164846dU) this.businessGson.LJI(mainBusinessData, C164846dU.class);
            } catch (Exception unused2) {
                return null;
            }
        }
        return this.mainBusinessContext;
    }

    public List<MediaModel> getMediaModelList() {
        ArrayList arrayList = new ArrayList();
        if (getPreviewInfo() != null) {
            for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
                boolean z = this.isFastImport;
                o.LJIIIZ(editVideoSegment, "<this>");
                MediaModel mediaModel = new MediaModel(-1L);
                mediaModel.fileLocalUriPath = editVideoSegment.getVideoPath();
                mediaModel.width = editVideoSegment.getVideoFileInfo().getWidth();
                mediaModel.height = editVideoSegment.getVideoFileInfo().getHeight();
                mediaModel.duration = editVideoSegment.getVideoFileInfo().getDuration();
                if (z && editVideoSegment.getVideoCutInfo() != null) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    o.LJI(videoCutInfo);
                    mediaModel.speed = videoCutInfo.getSpeed();
                }
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public String getMusicCover() {
        UrlModel urlModel;
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null && (urlModel = musicObject.coverThumb) != null && !C79004UzY.LJJIFFI(urlModel.getUrlList())) {
            return (String) ListProtector.get(musicObject.coverThumb.getUrlList(), 0);
        }
        return null;
    }

    public String getMusicId() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return MusicBeanUtilKt.getMusicId(musicObject);
        }
        return null;
    }

    public String getMusicIdByUpload() {
        if (C32151Nz.LJJIIZI(this.importInfoList)) {
            return ((ImportVideoInfo) ListProtector.get(this.importInfoList, 0)).getRealMusicId();
        }
        return "";
    }

    public String getMusicOrigin() {
        return this.creativeModel.musicBuzModel.musicOrigin;
    }

    public String getPropCustomPicCnt() {
        StringBuilder sb = new StringBuilder();
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList == null || finalVideoList.isEmpty()) {
            sb.append(this.creativeModel.greenScreenEffectModel.propCustomPicCnt);
        } else {
            for (int i = 0; i < finalVideoList.size(); i++) {
                sb.append(((TimeSpeedModelExtension) ListProtector.get(finalVideoList, i)).getFromRecordExtras("prop_customized_pic_cnt"));
                if (i != finalVideoList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public String getReadTextAllSpeakerId() {
        SimpleTextStickerData simpleTextStickerData;
        ArrayList arrayList = new ArrayList();
        if (C42000Ge4.LJIILIIL(this)) {
            for (TextStickerModel textStickerModel : C42000Ge4.LJII(this)) {
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().hasReadTextAudio && !TextUtils.isEmpty(textStickerModel.getTtsModel().speakerID)) {
                    arrayList.add(textStickerModel.getTtsModel().speakerID);
                }
            }
        } else if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker() && (simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, SimpleTextStickerData.class)) != null && simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getSpeakerID())) {
                    arrayList.add(simpleTextStickerData.getSpeakerID());
                }
            }
        }
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                str = (String) ListProtector.get(arrayList, i);
            } else {
                StringBuilder LIZJ = b1.LIZJ(str, ",");
                LIZJ.append((String) ListProtector.get(arrayList, i));
                str = X1D.LIZIZ(LIZJ);
            }
        }
        return str;
    }

    public List<AVChallenge> getRecordEffectChallenges() {
        List list = this.creativeModel.recordEffectModel.stickerChallenges;
        if (list != null && list.size() > 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList != null && !finalVideoList.isEmpty()) {
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                List<AVChallenge> hashtag = it.next().getHashtag();
                if (hashtag != null && !hashtag.isEmpty()) {
                    arrayList.addAll(hashtag);
                }
            }
        }
        return arrayList;
    }

    public String getReuseOriginalSoundId() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundId;
    }

    public int getReuseOriginalSoundLength() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundLength;
    }

    public UrlModel getReuseOriginalSoundUrls() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundUrls;
    }

    public String getSessionId() {
        return this.creativeInfo.getSessionId();
    }

    public C44549He5 getStrategiesResult() {
        if (this.strategiesResult == null) {
            this.strategiesResult = new C44549He5();
        }
        return this.strategiesResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<SimpleTextStickerData> getTextStickerDataList() {
        ArrayList arrayList = new ArrayList();
        if (C42000Ge4.LJIILIIL(this)) {
            for (TextStickerModel textStickerModel : C42000Ge4.LJII(this)) {
                o.LJIIIZ(textStickerModel, "<this>");
                long j = 0;
                Object[] objArr = 0 == true ? 1 : 0;
                Object[] objArr2 = 0 == true ? 1 : 0;
                Object[] objArr3 = 0 == true ? 1 : 0;
                SimpleTextStickerData simpleTextStickerData = new SimpleTextStickerData(false, null, objArr, 0 == true ? 1 : 0, objArr2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr3, j, j, 0 == true ? 1 : 0, 65535, 0 == true ? 1 : 0);
                TTSModel ttsModel = textStickerModel.getTtsModel();
                if (ttsModel != null) {
                    boolean z = ttsModel.hasReadTextAudio;
                    int i = ttsModel.audioTrackIndex;
                    String str = ttsModel.audioTrackFilePath;
                    String str2 = ttsModel.speakerID;
                    int i2 = ttsModel.audioTrackDuration;
                    String str3 = ttsModel.audioText;
                    String str4 = ttsModel.voiceEffectId;
                    String str5 = ttsModel.voiceEffectResourceId;
                    simpleTextStickerData = new SimpleTextStickerData(z, str2, i, str, i2, str3, str4, ttsModel.voiceEffectIconUrl, ttsModel.voiceAnchorName, str5, ttsModel.voiceCreatorUserId, ttsModel.voiceCreatorUserName, ttsModel.isCreatorVoice, ttsModel.ttsAnchorReleaseDate, ttsModel.ttsReleaseDate, ttsModel.ttsExtraMap);
                }
                arrayList.add(simpleTextStickerData);
            }
        } else if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    arrayList.add(GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, SimpleTextStickerData.class));
                }
            }
        }
        return arrayList;
    }

    public EffectPointModel getTimeEffect() {
        return this.creativeModel.editEffectModel.timeEffect;
    }

    public UploadSpeedEncodeSettings getUploadSpeedEncodeSettings() {
        if (this.uploadSpeedEncodeSettings == null) {
            this.uploadSpeedEncodeSettings = u.LJIIL(this.uploadSpeedInfo, !isUploadVideo());
        }
        return this.uploadSpeedEncodeSettings;
    }

    public Integer getUploadSpeedSettingsIndex() {
        C44564HeK c44564HeK;
        C44549He5 c44549He5 = this.strategiesResult;
        if (c44549He5 != null && (c44564HeK = c44549He5.LIZIZ) != null) {
            return c44564HeK.LIZ;
        }
        getUploadSpeedEncodeSettings();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadSpeeds , settingsIndex : ");
        LIZ.append((Object) null);
        H78.LJI(X1D.LIZIZ(LIZ));
        return null;
    }

    public String getValidVideoCoverPath() {
        if (C44687HgJ.LIZIZ(this.videoCoverPath)) {
            return this.videoCoverPath;
        }
        return null;
    }

    public boolean hasEditEffect() {
        if (this.creativeModel.editEffectModel.effectList.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasGalleryPhoto() {
        if (C77413UZt.LJJ(this.libraryMaterialList)) {
            Iterator<LibraryMaterialInfoSv> it = this.libraryMaterialList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                if (next.getMaterialProvider() != null && next.getMaterialProvider().intValue() == 3 && next.getMaterialType() != null && next.getMaterialType().intValue() == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasGalleryVideo() {
        if (C77413UZt.LJJ(this.libraryMaterialList)) {
            Iterator<LibraryMaterialInfoSv> it = this.libraryMaterialList.iterator();
            while (it.hasNext()) {
                LibraryMaterialInfoSv next = it.next();
                if (next.getMaterialProvider() != null && next.getMaterialProvider().intValue() == 3 && next.getMaterialType() != null && next.getMaterialType().intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasInfoStickers() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        Iterator<StickerItemModel> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().type != 1000) {
                return true;
            }
        }
        return false;
    }

    public boolean hasMusic() {
        String str = this.creativeModel.musicBuzModel.musicPath;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasNotAudioRecord() {
        AudioRecorderParam audioRecorderParam = this.veAudioRecorderParam;
        if (audioRecorderParam == null || !audioRecorderParam.hasRecord()) {
            return true;
        }
        return false;
    }

    public boolean hasOriginalSoundWithoutLibraryPhoto() {
        HashSet hashSet = new HashSet();
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList != null) {
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (C76917UGr.LJJJI(next) && next.getLibraryVideo() != null && !TextUtils.isEmpty(next.getLibraryVideo().getAudioPath())) {
                    hashSet.add(next.getLibraryVideo().getAudioPath());
                }
            }
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (previewInfo != null) {
            for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
                if (editVideoSegment.getAudioPath() != null && !hashSet.contains(editVideoSegment.getAudioPath()) && C44687HgJ.LIZIZ(editVideoSegment.getAudioPath())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasPrePublishResult() {
        return this.creativeModel.prePublishEntranceModel.preCompileSuccess;
    }

    public boolean hasRecord() {
        AudioRecorderParam audioRecorderParam = this.veAudioRecorderParam;
        if (audioRecorderParam != null && audioRecorderParam.hasRecord()) {
            return true;
        }
        return false;
    }

    public boolean hasShootEffect() {
        String str = this.mStickerID;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean hasStickers() {
        List<InteractStickerStruct> list;
        List<InteractStickerStruct> list2;
        List<InteractStickerStruct> list3;
        if (C6H4.LJI(this.creativeModel.stickerModel)) {
            return true;
        }
        C164846dU mainBusinessContext = getMainBusinessContext();
        if (mainBusinessContext != null) {
            EnumC164816dR enumC164816dR = EnumC164816dR.TRACK_PAGE_EDIT;
            list = C164826dS.LJI(mainBusinessContext, 1, enumC164816dR);
            list3 = C164826dS.LJI(mainBusinessContext, 10, enumC164816dR);
            list2 = C164826dS.LJI(mainBusinessContext, 11, enumC164816dR);
        } else {
            list = null;
            list2 = null;
            list3 = null;
        }
        if (hasInfoStickers()) {
            return true;
        }
        if (list != null && !list.isEmpty() && ((InteractStickerStruct) ListProtector.get(list, 0)).getPollStruct() != null) {
            return true;
        }
        if (list3 != null && !list3.isEmpty() && ((InteractStickerStruct) ListProtector.get(list3, 0)).getCountDownStickerStruct() != null) {
            return true;
        }
        if (!C79004UzY.LJJIFFI(list2) && ((InteractStickerStruct) ListProtector.get(list2, 0)).getCaptionStruct() != null) {
            return true;
        }
        return false;
    }

    public boolean hasText() {
        if (!this.creativeModel.stickerModel.textStickerModels.isEmpty()) {
            return true;
        }
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel != null && !C79004UzY.LJJIFFI(infoStickerModel.stickers)) {
            Iterator<StickerItemModel> it = this.infoStickerModel.stickers.iterator();
            while (it.hasNext()) {
                if (it.next().type == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasTextSticker() {
        if (!this.creativeModel.stickerModel.textStickerModels.isEmpty()) {
            return true;
        }
        if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasUploadFrameConditionInRecord() {
        return !TextUtils.isEmpty(this.mStickerID);
    }

    public boolean hasUserAddStickers() {
        List<StickerItemModel> list;
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        Iterator<StickerItemModel> it = list.iterator();
        while (it.hasNext()) {
            int i = it.next().type;
            if (i != 1000 && i != 27) {
                return true;
            }
        }
        return false;
    }

    public boolean isAllowClearMusic() {
        if (this.isPhotoMvMode || !isMvThemeVideoType()) {
            return true;
        }
        return false;
    }

    public boolean isApplyVoiceToAllTextOpen() {
        if (this.applyVoiceToAllTextSwitch == 1) {
            return true;
        }
        return false;
    }

    public boolean isAutoEnhanceEnable() {
        boolean LIZ;
        C148585sM.LIZ.getClass();
        if (((CreativeToolsEntranceReversalConfig) C148585sM.LIZJ.getValue()).getHideAutoEnhanceOnEditPage() && !this.mIsFromDraft) {
            return false;
        }
        if (e1.LIZ(31744, "studio_editor_auto_enhance_opti", true, false)) {
            if (this.supportEnhanceCached) {
                LIZ = this.supportEnhanceField;
            } else {
                LIZ = C152295yL.LIZ(this);
                this.supportEnhanceField = LIZ;
                this.supportEnhanceCached = true;
            }
        } else {
            LIZ = C152295yL.LIZ(this);
        }
        if (!LIZ || isDuet() || isStitchMode() || isShoutout()) {
            return false;
        }
        return true;
    }

    public boolean isCommentReply() {
        return CommentUtils.isDataValid(this.commentVideoModel);
    }

    public boolean isCommerceMusic() {
        Boolean bool = Boolean.FALSE;
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            bool = Boolean.valueOf(musicObject.isCommerceMusic);
        }
        return bool.booleanValue();
    }

    public boolean isCurrentAutoCutMode() {
        int i;
        AutoCutModel autoCutModel = this.creativeModel.autoCutModel;
        if (autoCutModel.curIndexFromSource >= 0 && (i = autoCutModel.curSource) >= 0 && i < C63A.values().length) {
            return true;
        }
        return false;
    }

    public boolean isCutSameVideoType() {
        if (this.cutSameEditData != null) {
            return true;
        }
        return false;
    }

    public boolean isDisableOriginalSound() {
        AudioRecorderParam audioRecorderParam = this.veAudioRecorderParam;
        if (audioRecorderParam != null && !audioRecorderParam.getNeedOriginalSound()) {
            return true;
        }
        return false;
    }

    public boolean isDraftMusicIllegal() {
        return this.creativeModel.musicBuzModel.isDraftMusicIllegal;
    }

    public boolean isEnterFromDM() {
        return this.creativeModel.initialModel.dmCameraModel.enterFromDM;
    }

    public boolean isFromAutoCutAnchor() {
        return TextUtils.equals(this.mShootWay, "autocut_anchor");
    }

    public boolean isFromCrash() {
        if (this.publishStage == 50) {
            return true;
        }
        return false;
    }

    public boolean isGifMaterialOnly() {
        if (!C77413UZt.LJJ(this.libraryMaterialList)) {
            return false;
        }
        Iterator<LibraryMaterialInfoSv> it = this.libraryMaterialList.iterator();
        while (it.hasNext()) {
            if (it.next().getMaterialType().intValue() == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean isLibraryMaterialUsed() {
        return C77413UZt.LJJ(this.libraryMaterialList);
    }

    public boolean isMvThemeVideoType() {
        int i;
        if (this.mvCreateVideoData != null && ((i = this.videoEditorType) == 2 || i == 3)) {
            return true;
        }
        return false;
    }

    public boolean isNLECanvas() {
        return this.creativeFlowData.getNleEditModel().isNLECanvas();
    }

    public boolean isPoi() {
        if (this.mPoiData != null) {
            return true;
        }
        return false;
    }

    public boolean isPrePublishStarted() {
        return this.creativeModel.prePublishEntranceModel.started;
    }

    public boolean isQaAnswer() {
        QAStickerModel qAStickerModel = this.qaStickerModel;
        if (qAStickerModel != null && qAStickerModel.getQuestionId() != 0) {
            return true;
        }
        return false;
    }

    public boolean isReuseOriginalSound() {
        return this.creativeModel.musicBuzModel.isReuseOriginalSound;
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

    public boolean isShoutout() {
        if (this.mShoutOutsData != null) {
            return true;
        }
        return false;
    }

    public boolean isSilentShare() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel != null && aVUploadSaveModel.getSaveType() != 0 && this.mSaveModel.getSaveType() != 1) {
            return true;
        }
        return false;
    }

    public boolean isUploadDuetMode() {
        if ("duet".equals(this.mShootWay) && C43710HDm.LIZ()) {
            return true;
        }
        return false;
    }

    public boolean isUploadVideo() {
        int i = this.mOrigin;
        if (i == 0 || i == 2) {
            return true;
        }
        return false;
    }

    public boolean isUseMusicBeforeEdit() {
        return this.creativeModel.musicBuzModel.isUseMusicBeforeEdit;
    }

    public void resetStrategiesResult() {
        this.strategiesResult = new C44549He5();
    }

    public void resetVolume() {
        if (this.isFastImport || realHasOriginalSound()) {
            this.voiceVolume = 1.0f;
        }
    }

    public VideoPublishEditModel() {
        this.creativeModel = new CreativeModel();
        this.fromItemId = "";
        this.creativeFlowData = new CreativeFlowData();
        this.clickGoNextBtnTime = -1L;
        this.watermarkVideoResolution = new C78858UxC(0, 0);
        this.aiMusicLogPbImprId = "";
        this.comFrom = 0;
        this.nleData = null;
        this.nleModel = null;
        Boolean bool = Boolean.FALSE;
        this.hasQaSticker = bool;
        this.mentionEditTextLength = -1;
        this.textLayoutWidth = 0.0f;
        this.textLayoutHeight = 0.0f;
        this.uploadScene = 1;
        this.encryptType = 1;
        this.albumPreviewNextMethod = "";
        this.mDesignerIdList = "";
        this.mOriginalStickerCount = 0;
        this.useTextInEditorPro = false;
        this.videoEditorType = 0;
        this.mCropVideo = false;
        this.mBeautyMetadatas = new ArrayList<>();
        this.autoAddTTSStickerOnce = false;
        this.enterFromImageSwitch = false;
        this.audioEnhanceParam = new AudioEnhanceParam();
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.importInfoList = new ArrayList<>();
        this.clientId = "";
        this.mDuetFrom = "";
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.segmentLoudness = new ArrayList();
        this.publishStage = 0;
        this.mShootedShootMode = -1;
        this.creativeInfo = new CreativeInfo();
        this.newDraftId = "";
        this.isFromRestoreRecover = false;
        this.soundSyncFromAnchor = false;
        this.shouldSkipMusicSync = true;
        this.publishDuetMentionedUserList = new ArrayList();
        this.isMuted = false;
        this.infoStickerCategoryParams = new InfoStickerCategoryParams();
        this.greenScreenMaterialList = new ArrayList<>();
        this.libraryMaterialList = new ArrayList<>();
        this.draftFromShoot = false;
        this.qaPermissionDialogShownStatus = false;
        this.customStickerPaths = new ArrayList<>();
        this.videoDurationFromVideoCutPage = -1;
        this.isStoryEditMode = false;
        this.isWestWindowExistStr = "";
        this.shootEnterMethod = "";
        this.creationMode = 1;
        this.duetModeType = "";
        this.propOrder = 0;
        this.textStickerChallenges = new TextStickerChallenges();
        this.editMusicSyncMode = false;
        this.mSubtitleMusicChangeChecker = new C6B8();
        this.emptyMainBusinessContext = "{\"interactStickerCheckEffectSdk\":false,\"mInteractStickerContext\":{\"multi_edit_map\":{},\"multi_record_map\":{}}}";
        this.needRegisterGsonAdapter = (C00F.LIZ(31744, 0, "studio_enable_opt_user_gson", true) & 1) != 0;
        this.businessGson = new Gson();
        this.applyVoiceToAllTextSwitch = 0;
        this.hasMultiAudioLoudnessNormalization = false;
        this.isDuetGreenSrceen = false;
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.stickPointType = 0;
        this.textTypes = "";
        this.textEffectIds = "";
        this.pic2VideoSource = "";
        this.successEnableAEC = false;
        this.disableDeleteChain = false;
        this.isSoundLoop = bool;
        this.isReuseOriginalSound = false;
        this.isCompileFinished = false;
        this.synthesisFileHash = "";
    }

    public final boolean LIZIZ() {
        if (isUploadVideo() || isDuet() || isStitchMode() || getSharedARModel() != null) {
            return false;
        }
        return isMultiVideoEdit();
    }

    public String audioPath() {
        if (getPreviewInfo() == null || H7R.LJJJJIZL(this)) {
            return null;
        }
        return ((EditVideoSegment) ListProtector.get(getPreviewInfo().getVideoList(), 0)).getAudioPath();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VideoPublishEditModel m158clone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obtain.readValue(VideoPublishEditModel.class.getClassLoader());
        Parcel obtain2 = Parcel.obtain();
        obtain2.writeValue(this.creativeModel);
        obtain2.setDataPosition(0);
        videoPublishEditModel.creativeModel = (CreativeModel) obtain2.readValue(CreativeModel.class.getClassLoader());
        obtain.recycle();
        obtain2.recycle();
        return videoPublishEditModel;
    }

    public void copyMultiEditMusicInfo() {
        if (!isMultiVideoEdit()) {
            return;
        }
        getCurMultiEditVideoRecordData().musicPath = getMMusicPath();
        getCurMultiEditVideoRecordData().musicVolume = this.musicVolume;
        getCurMultiEditVideoRecordData().originVolume = this.voiceVolume;
        getCurMultiEditVideoRecordData().musicTrimIn = getMMusicStart();
    }

    public ArrayList<TimeSpeedModelExtension> deepCopyFinalVideoList() {
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (!C77413UZt.LJIILL(finalVideoList)) {
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) C78946Uyc.LIZJ(next);
                if (Build.VERSION.SDK_INT >= 26) {
                    timeSpeedModelExtension.recordExtras = next.getRecordExtras().deepCopy();
                } else {
                    timeSpeedModelExtension.recordExtras = GreenScreenMaterial.bytesToBundle(GreenScreenMaterial.bundleToBytes(next.recordExtras));
                }
                arrayList.add(timeSpeedModelExtension);
            }
        }
        return arrayList;
    }

    public String draftDir() {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJLIIIJL(this);
    }

    public String getContactAudioPathAsKey() {
        if (isMultiVideoEdit()) {
            String str = this.multiEditVideoRecordData.curMultiEditVideoRecordData.concatAudio;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            StitchParams stitchParams = this.stitchParams;
            if (stitchParams != null && !TextUtils.isEmpty(stitchParams.getConcatAudioPath())) {
                return this.stitchParams.getConcatAudioPath();
            }
        }
        return audioPath();
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordData() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData;
    }

    public String getEditEffectDurationListStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        if (C32151Nz.LJJIIJZLJL(effectList)) {
            return "";
        }
        EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(effectList, 0);
        StringBuilder sb = new StringBuilder(String.valueOf(effectPointModel.getUiEndPoint() - effectPointModel.getUiStartPoint()));
        for (int i = 1; i < effectList.size(); i++) {
            EffectPointModel effectPointModel2 = (EffectPointModel) ListProtector.get(effectList, i);
            sb.append(",");
            sb.append(effectPointModel2.getUiEndPoint() - effectPointModel2.getUiStartPoint());
        }
        return sb.toString();
    }

    public String getEditEffectIndexStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String str = "";
            if (i >= effectList.size()) {
                break;
            }
            if (!((EffectPointModel) ListProtector.get(effectList, i)).getIsFromEditPro().booleanValue()) {
                int index = ((EffectPointModel) ListProtector.get(effectList, i)).getIndex() + 1;
                if (index != -1) {
                    str = String.valueOf(index);
                }
                sb.append(str);
                sb.append(",");
            }
            i++;
        }
        if (sb.length() <= 0) {
            return "";
        }
        return sb.substring(0, sb.length() - 1);
    }

    public String getEditEffectListStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < effectList.size(); i++) {
            if (!((EffectPointModel) ListProtector.get(effectList, i)).getIsFromEditPro().booleanValue()) {
                sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getKey());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return "";
    }

    public String getEditEffectListWithOutZeroStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        String str = "";
        if (C32151Nz.LJJIIJZLJL(effectList)) {
            return "";
        }
        String key = ((EffectPointModel) ListProtector.get(effectList, 0)).getKey();
        if (!key.equals(CardStruct.IStatusCode.DEFAULT)) {
            str = key;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < effectList.size(); i++) {
            if (!((EffectPointModel) ListProtector.get(effectList, i)).getKey().equals(CardStruct.IStatusCode.DEFAULT)) {
                sb.append(",");
                sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getKey());
            }
        }
        return sb.toString();
    }

    public String getEditEffectSelectionStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        if (C32151Nz.LJJIIJZLJL(effectList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (((EffectPointModel) ListProtector.get(effectList, 0)).getSelectFrom() != null) {
            sb.append(((EffectPointModel) ListProtector.get(effectList, 0)).getSelectFrom());
        }
        for (int i = 1; i < effectList.size(); i++) {
            if (((EffectPointModel) ListProtector.get(effectList, i)).getSelectFrom() != null) {
                sb.append(",");
                sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getSelectFrom());
            }
        }
        return sb.toString();
    }

    public StickerItemModel getFirstTextSticker() {
        if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    return stickerItemModel;
                }
            }
            return null;
        }
        return null;
    }

    public String getInfoStickerFrom() {
        C15070iV<String, String> LIZJ = C164826dS.LIZJ(getMainBusinessContext());
        String str = LIZJ.LIZ;
        String str2 = LIZJ.LIZIZ;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (String str3 : str.split(",")) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                } else if (this.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(str3)) {
                    sb.append(this.infoStickerCategoryParams.getInfoStickerCategoryMap().get(str3));
                }
            }
        }
        CommentVideoModel commentVideoModel = this.commentVideoModel;
        if (commentVideoModel != null && !TextUtils.isEmpty(commentVideoModel.getAwemeId())) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(",");
            }
            sb.append("comment_reply");
        }
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel == null || C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            return sb.toString();
        }
        String sb2 = sb.toString();
        Iterator it = AbstractC65654Ppi.copyOf(this.infoStickerModel.stickers).iterator();
        StringBuilder sb3 = new StringBuilder();
        boolean z = true;
        while (it.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it.next();
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb3.append(',');
                }
                if (!TextUtils.isEmpty(stickerItemModel.tabId)) {
                    sb3.append(stickerItemModel.tabId);
                } else if (this.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(stickerItemModel.stickerId)) {
                    sb3.append(this.infoStickerCategoryParams.getInfoStickerCategoryMap().get(stickerItemModel.stickerId));
                } else if (stickerItemModel.type == 10) {
                    sb3.append("giphy");
                } else if (this.creativeModel.changeAvatarModel.stickerIds.contains(stickerItemModel.stickerId)) {
                    sb3.append("profile_photo");
                }
            }
        }
        return i0.LJFF(sb3.toString(), sb2);
    }

    public String getInfoStickerList() {
        String str;
        String str2 = C164826dS.LIZJ(getMainBusinessContext()).LIZ;
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel == null || C32151Nz.LJJIIJZLJL(infoStickerModel.stickers)) {
            return str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = i0.LJFF(",", str2);
        } else {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.infoStickerModel.getNotEmptyInfoStickerIds());
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public ArrayList<LibraryMaterialInfoSv> getLibraryMaterials() {
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        String str;
        Integer num;
        Integer num2;
        UrlModel urlModel;
        String str2;
        Long l;
        Long l2;
        Long l3;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        Integer num3;
        Integer num4;
        ArrayList<TimeSpeedModelExtension> LIZ = LIZ();
        ArrayList<LibraryMaterialInfoSv> arrayList = new ArrayList<>();
        if (!C77413UZt.LJIILL(LIZ)) {
            Iterator<TimeSpeedModelExtension> it = LIZ.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                if (!C76917UGr.LJJJJJ(next)) {
                    String LJJI = C76917UGr.LJJI(next);
                    LibraryMaterialInfoSv libraryMaterialInfoSv2 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv2 != null) {
                        str = libraryMaterialInfoSv2.getMaterialName();
                    } else {
                        str = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv3 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv3 != null) {
                        num = libraryMaterialInfoSv3.getMaterialProvider();
                    } else {
                        num = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv4 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv4 != null) {
                        num2 = libraryMaterialInfoSv4.getMaterialType();
                    } else {
                        num2 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv5 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv5 != null) {
                        urlModel = libraryMaterialInfoSv5.getCover();
                    } else {
                        urlModel = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv6 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv6 != null) {
                        str2 = libraryMaterialInfoSv6.getPreview();
                    } else {
                        str2 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv7 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv7 != null) {
                        l = libraryMaterialInfoSv7.getUsedCount();
                    } else {
                        l = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv8 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv8 != null) {
                        l2 = libraryMaterialInfoSv8.getStartTime();
                    } else {
                        l2 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv9 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv9 != null) {
                        l3 = libraryMaterialInfoSv9.getEndTime();
                    } else {
                        l3 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv10 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv10 != null) {
                        str3 = libraryMaterialInfoSv10.getAuthor();
                    } else {
                        str3 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv11 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv11 != null) {
                        str4 = libraryMaterialInfoSv11.getRawFilePath();
                    } else {
                        str4 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv12 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv12 != null) {
                        str5 = libraryMaterialInfoSv12.getSplitAudioPath();
                    } else {
                        str5 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv13 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv13 != null) {
                        str6 = libraryMaterialInfoSv13.getSplitVideoPath();
                    } else {
                        str6 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv14 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    boolean z2 = false;
                    if (libraryMaterialInfoSv14 != null && libraryMaterialInfoSv14.isLibraryMaterialConsumed()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv15 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv15 != null && libraryMaterialInfoSv15.isFromSearch()) {
                        z2 = true;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv16 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv16 != null) {
                        num3 = libraryMaterialInfoSv16.getWidth();
                    } else {
                        num3 = null;
                    }
                    LibraryMaterialInfoSv libraryMaterialInfoSv17 = (LibraryMaterialInfoSv) next.getFromRecordExtras("extra_key_library_material");
                    if (libraryMaterialInfoSv17 != null) {
                        num4 = libraryMaterialInfoSv17.getHeight();
                    } else {
                        num4 = null;
                    }
                    arrayList.add(new LibraryMaterialInfoSv(LJJI, str, num, num2, urlModel, str2, l, l2, l3, str3, str4, str5, str6, z, z2, num3, num4));
                }
            }
            if (getCurMultiEditVideoRecordData() != null) {
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : getCurMultiEditVideoRecordData().segmentDataList) {
                    if (multiEditVideoSegmentRecordData.enable && (libraryMaterialInfoSv = multiEditVideoSegmentRecordData.libraryMaterialInfo) != null) {
                        arrayList.add(libraryMaterialInfoSv);
                    }
                }
            }
        }
        arrayList.removeAll(Collections.singleton(null));
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public String getMainBusinessData() {
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null) {
            return mainBusinessData;
        }
        C164846dU c164846dU = this.mainBusinessContext;
        if (c164846dU != null) {
            String json = GsonProtectorUtils.toJson(this.businessGson, c164846dU);
            super.setMainBusinessData(json);
            return json;
        }
        return mainBusinessData;
    }

    public long getMultiEditVideoStartTime() {
        if (!isMultiVideoEdit()) {
            return 0L;
        }
        return getCurMultiEditVideoRecordData().startTime;
    }

    public String getMusicOriginWithCheck() {
        if (TextUtils.isEmpty(getMusicOrigin())) {
            return "original";
        }
        return getMusicOrigin();
    }

    public AVMusic getOriginalRecordMusic() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.recordMusic;
    }

    public int getPollStickerSize() {
        List<InteractStickerStruct> LJI = C164826dS.LJI(getMainBusinessContext(), 1, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI != null && !LJI.isEmpty() && ((InteractStickerStruct) ListProtector.get(LJI, 0)).getPollStruct() != null) {
            return 1;
        }
        return 0;
    }

    public int getRealOriginal() {
        if (getEditorProModel() != null && getEditorProModel().getRealOrigin() != null) {
            return getEditorProModel().getRealOrigin().intValue();
        }
        return this.mOrigin;
    }

    public int[] getRecordVideoSize() {
        return new int[]{C78926UyI.LJJLIIIIJ(getPreviewInfo(), this.isFastImport, isStitchMode(), false, this), C78926UyI.LJJLI(getPreviewInfo(), this.isFastImport, isStitchMode(), false, this)};
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public int getVideoLength() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getPreviewVideoLength();
    }

    public String getVideoResolution() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(videoWidth());
        LIZ.append("*");
        LIZ.append(videoHeight());
        return X1D.LIZIZ(LIZ);
    }

    public List<Integer> getVideoRotateArray() {
        if (getPreviewInfo() == null) {
            return Collections.singletonList(0);
        }
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
            if (editVideoSegment.getVideoCutInfo() != null) {
                arrayList.add(Integer.valueOf(editVideoSegment.getVideoCutInfo().getRotate()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
        }
        return arrayList;
    }

    public String getWavFile() {
        if (audioPath() == null || !C44687HgJ.LIZIZ(audioPath())) {
            return null;
        }
        return audioPath();
    }

    public boolean hadRecordWithVolume() {
        AudioRecorderParam audioRecorderParam;
        if (hasRecord() && (audioRecorderParam = this.veAudioRecorderParam) != null && audioRecorderParam.getRecordVolume() > 0.0f) {
            return true;
        }
        return false;
    }

    public boolean hasImageStickers() {
        if (!hasInfoStickers()) {
            return false;
        }
        Iterator<StickerItemModel> it = this.infoStickerModel.stickers.iterator();
        while (it.hasNext()) {
            if (it.next().isImageSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasOriginalSound() {
        if (getWavFile() != null) {
            return true;
        }
        return false;
    }

    public boolean hasReadTextAudio() {
        SimpleTextStickerData simpleTextStickerData;
        if (C42000Ge4.LJIILIIL(this)) {
            for (TextStickerModel textStickerModel : C42000Ge4.LJII(this)) {
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().hasReadTextAudio) {
                    return true;
                }
            }
            return false;
        }
        if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker() && (simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, SimpleTextStickerData.class)) != null && simpleTextStickerData.getHasReadTextAudio()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean hasRetake() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData.hasRetake;
    }

    public boolean hasSubtitle() {
        if (getMainBusinessContext() != null) {
            return !C79004UzY.LJJIFFI(C164826dS.LJI(r2, 11, EnumC164816dR.TRACK_PAGE_EDIT));
        }
        return false;
    }

    public boolean hasUploadFrameConditionInEdit() {
        if (!getEffectList().isEmpty() || hasStickers()) {
            return true;
        }
        return false;
    }

    public boolean isChangeMultiEditData() {
        if (!isMultiVideoEdit() || this.multiEditVideoRecordData.originMultiEditRecordData == null) {
            return false;
        }
        Pair<Integer, Integer> playInOutTime = getCurMultiEditVideoRecordData().getPlayInOutTime();
        Pair<Integer, Integer> playInOutTime2 = this.multiEditVideoRecordData.originMultiEditRecordData.getPlayInOutTime();
        if (!((Integer) playInOutTime.first).equals(playInOutTime2.first) || !((Integer) playInOutTime.second).equals(playInOutTime2.second)) {
            return true;
        }
        return !getCurMultiEditVideoRecordData().isEqual(this.multiEditVideoRecordData.originMultiEditRecordData);
    }

    public boolean isDuet() {
        return !TextUtils.isEmpty(getDuetFrom());
    }

    public boolean isLibraryMaterialOnly() {
        ArrayList<TimeSpeedModelExtension> LIZ = LIZ();
        if (!C77413UZt.LJJ(LIZ)) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = LIZ.iterator();
        while (it.hasNext()) {
            if (C76917UGr.LJJJJJ(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isLibraryPhotoOnly() {
        ArrayList<TimeSpeedModelExtension> LIZ = LIZ();
        if (!C77413UZt.LJJ(LIZ)) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = LIZ.iterator();
        while (it.hasNext()) {
            if (!C76917UGr.LJJJI(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isMediaFromGallery() {
        return TextUtils.equals(getAvetParameter().getContentSource(), "upload");
    }

    public boolean isMultiVideoEdit() {
        return H7R.LJIL(this);
    }

    public boolean isMultiVideoEditFeature() {
        if (isMultiVideoEdit() && this.mSharedARModel == null && !isDuet() && !isStitchMode() && !this.containBackgroundVideo && this.supportRetake) {
            return true;
        }
        return false;
    }

    public int isMusic() {
        if (getMMusicPath() == null) {
            return 0;
        }
        return 1;
    }

    public boolean isPreviewInfoValid() {
        if (getPreviewInfo() == null || getPreviewInfo().getVideoList().isEmpty()) {
            H78.LIZJ("EditPreviewInfo in VideoPublishEditModel is null");
            return false;
        }
        return true;
    }

    public boolean isRetakeVideo() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        if (!isMultiVideoEdit() || (multiEditVideoStatusRecordData = this.multiEditVideoRecordData) == null || multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null || !multiEditVideoStatusRecordData.isMultiEditRetake) {
            return false;
        }
        return true;
    }

    public boolean isReverse() {
        EffectPointModel timeEffect = getTimeEffect();
        if (timeEffect != null && "1".equals(timeEffect.getKey())) {
            return true;
        }
        return false;
    }

    public boolean isStitchMode() {
        if (getStitchParams() != null) {
            return true;
        }
        return false;
    }

    public boolean isTemplateMv() {
        if (isMvThemeVideoType() && !this.isPhotoMvMode) {
            return true;
        }
        return false;
    }

    public boolean isTimeEffectApply() {
        EffectPointModel timeEffect = getTimeEffect();
        if (timeEffect == null) {
            return false;
        }
        String key = timeEffect.getKey();
        if (!TextUtils.equals("1", key) && !TextUtils.equals("2", key) && !TextUtils.equals("3", key)) {
            return false;
        }
        return true;
    }

    public boolean isUseMultiEdit() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.isUseMultiEdit;
    }

    public boolean isUseTimeReverseEffect() {
        EffectPointModel timeEffect = getTimeEffect();
        if (timeEffect != null && timeEffect.getKey().equals("1")) {
            return true;
        }
        return false;
    }

    public int maxFps4Videos() {
        VEUtils.VEVideoFileInfo LJIJJ;
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        o.LJIIIZ(previewInfo, "<this>");
        int i = 0;
        for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i >= 0) {
                EditVideoSegment editVideoSegment2 = editVideoSegment;
                if (!C44694HgQ.LJIJI(editVideoSegment2.getVideoPath(), false) && editVideoSegment2.getVideoFileInfo().getFps() == -100 && (LJIJJ = C62819Ol5.LJIJJ(editVideoSegment2.getVideoPath())) != null) {
                    ListProtector.set(previewInfo.getVideoList(), i, EditVideoSegment.copy$default(editVideoSegment2, null, null, C78926UyI.LJJJJZI(LJIJJ), null, 11, null));
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator<EditVideoSegment> it = previewInfo.getVideoList().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(it.next().getVideoFileInfo().getFps());
        while (it.hasNext()) {
            Integer valueOf2 = Integer.valueOf(it.next().getVideoFileInfo().getFps());
            if (valueOf.compareTo(valueOf2) < 0) {
                valueOf = valueOf2;
            }
        }
        if (valueOf == null || valueOf.intValue() <= 0 || valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public boolean notUseCanvasSize() {
        if (videoWidth() > videoHeight() && !getCoverPublishModel().getNeedExpandCompiledSize()) {
            return true;
        }
        return false;
    }

    public boolean realHasOriginalSound() {
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (previewInfo == null) {
            return false;
        }
        for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
            if (editVideoSegment.getAudioPath() != null && new File(editVideoSegment.getAudioPath()).exists()) {
                return true;
            }
        }
        return false;
    }

    public String reverseVideoPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return getPreviewInfo().reverseVideo();
    }

    public int segmentCounts() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getVideoList().size();
    }

    public void setMultiEditBeautyMetadatas() {
        if (!isMultiVideoEdit() || C77413UZt.LJIILL(this.multiEditVideoRecordData.editSegments)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next != null && next.getBeautyMetadata() != null) {
                arrayList.add(next.getBeautyMetadata());
            }
        }
        if (C77413UZt.LJIILL(arrayList)) {
            return;
        }
        this.mBeautyMetadatas.clear();
        this.mBeautyMetadatas.addAll(arrayList);
    }

    public void setMultiEditCameraLensInfo() {
        if (!isMultiVideoEdit() || C77413UZt.LJIILL(this.multiEditVideoRecordData.editSegments)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next != null && next.getCameraLensInfo() != null) {
                arrayList.add(next.getCameraLensInfo());
            }
        }
        if (C77413UZt.LJIILL(arrayList)) {
            return;
        }
        this.cameraLensInfo.clear();
        this.cameraLensInfo.addAll(arrayList);
    }

    public void setMultiEditStickIds() {
        ArrayList<TimeSpeedModelExtension> arrayList;
        if (!isMultiVideoEdit() || (arrayList = this.multiEditVideoRecordData.editSegments) == null || arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it = this.multiEditVideoRecordData.editSegments.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next != null && !TextUtils.isEmpty(next.getStickerId())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(next.getStickerId());
                LIZ.append(",");
                sb.append(X1D.LIZIZ(LIZ));
            }
        }
        this.mStickerID = sb.toString();
    }

    public boolean shouldReuseAutoCutAnchor() {
        if (isFromAutoCutAnchor()) {
            CreativeModel creativeModel = this.creativeModel;
            if (creativeModel.autoCutAnchorModel.templateId != null) {
                AutoCutModel autoCutModel = creativeModel.autoCutModel;
                if (autoCutModel.curIndexFromSource == 0 && autoCutModel.curSource == C63A.AUTO_CUT.ordinal()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean shouldUploadExtractFrames() {
        if (hasUploadFrameConditionInRecord() || hasUploadFrameConditionInEdit()) {
            return true;
        }
        return false;
    }

    public int sourceVideoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        boolean z = this.isFastImport;
        o.LJIIIZ(previewInfo, "<this>");
        if (z) {
            if (previewInfo.getCalculateSourceHeight() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C17N.LJJLIIIJILLIZJL(previewInfo), Integer.MAX_VALUE);
                previewInfo.setCalculateSourceWidth(calcTargetRes.width);
                previewInfo.setCalculateSourceHeight(calcTargetRes.height);
            }
            return previewInfo.getCalculateSourceHeight();
        }
        if (previewInfo.getVideoList().isEmpty()) {
            return 0;
        }
        return ((EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)).getVideoFileInfo().getHeight();
    }

    public int sourceVideoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        boolean z = this.isFastImport;
        o.LJIIIZ(previewInfo, "<this>");
        if (z) {
            if (previewInfo.getCalculateSourceWidth() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C17N.LJJLIIIJILLIZJL(previewInfo), Integer.MAX_VALUE);
                previewInfo.setCalculateSourceWidth(calcTargetRes.width);
                previewInfo.setCalculateSourceHeight(calcTargetRes.height);
            }
            return previewInfo.getCalculateSourceWidth();
        }
        if (previewInfo.getVideoList().isEmpty()) {
            return 0;
        }
        return ((EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)).getVideoFileInfo().getWidth();
    }

    public int videoHeight() {
        if (getPreviewInfo() == null || H7R.LJJJJIZL(this)) {
            return 0;
        }
        return C78926UyI.LJJLI(getPreviewInfo(), this.isFastImport, isStitchMode(), LIZIZ(), this);
    }

    public String videoPath() {
        if (getPreviewInfo() == null || H7R.LJJJJIZL(this)) {
            return "";
        }
        return ((EditVideoSegment) ListProtector.get(getPreviewInfo().getVideoList(), 0)).getVideoPath();
    }

    public int videoWidth() {
        if (getPreviewInfo() == null || H7R.LJJJJIZL(this)) {
            return 0;
        }
        return C78926UyI.LJJLIIIIJ(getPreviewInfo(), this.isFastImport, isStitchMode(), LIZIZ(), this);
    }

    public int getApplyVoiceToAllTextSwitch() {
        return this.applyVoiceToAllTextSwitch;
    }

    public String getBindMvId() {
        return this.mBindMvId;
    }

    public int getCamera() {
        return this.mCameraPosition;
    }

    public String getCameraIds() {
        return this.cameraIds;
    }

    public String getChain() {
        return this.chain;
    }

    public CompileProbeResult getCompileProbeResult() {
        return this.compileProbeResult;
    }

    public User getDuetAuthor() {
        return this.mDuetAuthor;
    }

    public String getDuetFrom() {
        return this.mDuetFrom;
    }

    public String getDuetHashTag() {
        return this.mDuetHashTag;
    }

    public String getDuetModeType() {
        return this.duetModeType;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getFilterIds() {
        return this.mCurFilterIds;
    }

    public int getFilterIndex() {
        return this.mSelectedId;
    }

    public String getFilterName() {
        return this.mCurFilterLabels;
    }

    public ImageAlbumData getImageAlbumData() {
        return this.imageAlbumData;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMusicRequestId() {
        return this.musicRequestId;
    }

    public int getNewVersion() {
        return this.mNewVersion;
    }

    public int getOriginal() {
        return this.mOrigin;
    }

    public VideoFileInfo getOriginalVideoInfo() {
        return this.originalVideoInfo;
    }

    public String getOutputFile() {
        return this.mOutputFile;
    }

    public int getPrettify() {
        return this.mFaceBeauty;
    }

    public EditPreviewInfo getPreviewInfo() {
        return this.previewInfo;
    }

    public AVUploadSaveModel getSaveModel() {
        return this.mSaveModel;
    }

    public UrlModel getSendToUserHead() {
        return this.sendToUserHead;
    }

    public SharedARModel getSharedARModel() {
        return this.mSharedARModel;
    }

    public String getSpeed() {
        return this.videoSpeed;
    }

    public int getStickPointType() {
        return this.stickPointType;
    }

    public String getStickers() {
        return this.mStickerID;
    }

    public StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public List<AVTextExtraStruct> getStructList() {
        return this.structList;
    }

    public String getSynthesisFileHash() {
        return this.synthesisFileHash;
    }

    public String getSynthesisFilePath() {
        return this.mParallelUploadOutputFile;
    }

    public ArrayList<InteractionTagUserInfo> getTagUserList() {
        return this.tagUserList;
    }

    public TextStickerChallenges getTextStickerChallenges() {
        return this.textStickerChallenges;
    }

    public String getTitle() {
        return this.title;
    }

    public TTSVoiceModel getTtsVoiceModel() {
        return this.ttsVoiceModel;
    }

    public String getVideoCoverPath() {
        return this.videoCoverPath;
    }

    public int getVideoEditorType() {
        return this.videoEditorType;
    }

    public C78858UxC getWatermarkVideoResolution() {
        return this.watermarkVideoResolution;
    }

    public boolean isAutoAddTTSSticker() {
        return this.autoAddTTSStickerOnce;
    }

    public boolean isCompileFinished() {
        return this.isCompileFinished;
    }

    public boolean isConvertFromDraft() {
        return this.isConvertFromDraft;
    }

    public boolean isDisableDeleteChain() {
        return this.disableDeleteChain;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public int isPrivate() {
        return this.isPrivate;
    }

    public boolean isShouldEditorStartOptimization() {
        return this.shouldEditorStartOptimization;
    }

    public boolean isSoundSyncFromAnchor() {
        return this.soundSyncFromAnchor;
    }

    public VideoPublishEditModel(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        this.creativeModel = new CreativeModel();
        this.fromItemId = "";
        this.creativeFlowData = new CreativeFlowData();
        this.clickGoNextBtnTime = -1L;
        this.watermarkVideoResolution = new C78858UxC(0, 0);
        this.aiMusicLogPbImprId = "";
        this.comFrom = 0;
        this.nleData = null;
        this.nleModel = null;
        Boolean bool = Boolean.FALSE;
        this.hasQaSticker = bool;
        this.mentionEditTextLength = -1;
        this.textLayoutWidth = 0.0f;
        this.textLayoutHeight = 0.0f;
        this.uploadScene = 1;
        this.encryptType = 1;
        this.albumPreviewNextMethod = "";
        this.mDesignerIdList = "";
        this.mOriginalStickerCount = 0;
        this.useTextInEditorPro = false;
        this.videoEditorType = 0;
        this.mCropVideo = false;
        this.mBeautyMetadatas = new ArrayList<>();
        this.autoAddTTSStickerOnce = false;
        this.enterFromImageSwitch = false;
        this.audioEnhanceParam = new AudioEnhanceParam();
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.importInfoList = new ArrayList<>();
        this.clientId = "";
        this.mDuetFrom = "";
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.segmentLoudness = new ArrayList();
        this.publishStage = 0;
        this.mShootedShootMode = -1;
        this.creativeInfo = new CreativeInfo();
        this.newDraftId = "";
        this.isFromRestoreRecover = false;
        this.soundSyncFromAnchor = false;
        this.shouldSkipMusicSync = true;
        this.publishDuetMentionedUserList = new ArrayList();
        this.isMuted = false;
        this.infoStickerCategoryParams = new InfoStickerCategoryParams();
        this.greenScreenMaterialList = new ArrayList<>();
        this.libraryMaterialList = new ArrayList<>();
        this.draftFromShoot = false;
        this.qaPermissionDialogShownStatus = false;
        this.customStickerPaths = new ArrayList<>();
        this.videoDurationFromVideoCutPage = -1;
        this.isStoryEditMode = false;
        this.isWestWindowExistStr = "";
        this.shootEnterMethod = "";
        this.creationMode = 1;
        this.duetModeType = "";
        this.propOrder = 0;
        this.textStickerChallenges = new TextStickerChallenges();
        this.editMusicSyncMode = false;
        this.mSubtitleMusicChangeChecker = new C6B8();
        this.emptyMainBusinessContext = "{\"interactStickerCheckEffectSdk\":false,\"mInteractStickerContext\":{\"multi_edit_map\":{},\"multi_record_map\":{}}}";
        if ((C00F.LIZ(31744, 0, "studio_enable_opt_user_gson", true) & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needRegisterGsonAdapter = z;
        this.businessGson = new Gson();
        this.applyVoiceToAllTextSwitch = 0;
        this.hasMultiAudioLoudnessNormalization = false;
        this.isDuetGreenSrceen = false;
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.stickPointType = 0;
        this.textTypes = "";
        this.textEffectIds = "";
        this.pic2VideoSource = "";
        this.successEnableAEC = false;
        this.disableDeleteChain = false;
        this.isSoundLoop = bool;
        this.isReuseOriginalSound = false;
        this.isCompileFinished = false;
        this.synthesisFileHash = "";
        this.title = parcel.readString();
        this.chain = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.disableDeleteChain = z2;
        this.structList = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.uploadMethod = parcel.readString();
        this.templateId = parcel.readString();
        this.mSelectedFilterId = parcel.readString();
        this.mSelectedFilterLabel = parcel.readString();
        this.mSelectedFilterResId = parcel.readString();
        setPreviewInfo((EditPreviewInfo) parcel.readParcelable(EditPreviewInfo.class.getClassLoader()));
        this.mRecordFilterIds = parcel.readString();
        this.mRecordFilterLabels = parcel.readString();
        this.mRecordFilterValues = parcel.readString();
        this.mBeautyMobParam = (BeautyMobParam) parcel.readParcelable(BeautyMobParam.class.getClassLoader());
        this.mCurFilterLabels = parcel.readString();
        this.mCurFilterIds = parcel.readString();
        this.mSmoothSkinLabels = parcel.readString();
        this.commentVideoModel = (CommentVideoModel) parcel.readSerializable();
        this.mSubtitleMusicChangeChecker = (C6B8) parcel.readSerializable();
        this.mReshapeLabels = parcel.readString();
        this.videoSpeed = parcel.readString();
        this.cameraIds = parcel.readString();
        this.beautyType = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mVideoSegmentsDesc = parcel.readString();
        this.mStickerPath = parcel.readString();
        this.mStickerID = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mFromCut = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mFromMultiCut = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.faceBeautyOpen = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mWillGoOnShortVideo = z6;
        this.mOrigin = parcel.readInt();
        this.mHardEncode = parcel.readInt();
        this.mRestoreType = parcel.readInt();
        this.mFaceBeauty = parcel.readInt();
        this.mSelectedId = parcel.readInt();
        this.mSelectedFilterIntensity = parcel.readFloat();
        this.mRecordVideoSelectedFilterIndex = parcel.readInt();
        this.mRecordVideoSelectedFilterIntensity = parcel.readFloat();
        this.mCameraPosition = parcel.readInt();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.autoEnhanceOn = z7;
        this.autoEnhanceType = parcel.readInt();
        this.musicStart = parcel.readInt();
        this.musicEnd = parcel.readInt();
        this.musicOrigin = parcel.readString();
        this.musicShowRank = parcel.readInt();
        this.musicRecType = parcel.readInt();
        this.mUseFilter = parcel.readInt();
        this.mVideoCoverStartTm = parcel.readFloat();
        this.maxDuration = parcel.readLong();
        this.importInfoList = parcel.createTypedArrayList(ImportVideoInfo.CREATOR);
        this.audioTrack = (UrlModel) parcel.readSerializable();
        this.musicId = parcel.readString();
        this.musicRequestId = parcel.readString();
        this.shareId = parcel.readString();
        this.clientId = parcel.readString();
        this.previewStartTime = parcel.readFloat();
        this.mOutputFile = parcel.readString();
        this.mId3Title = parcel.readString();
        this.musicCover = parcel.readString();
        this.mId3Album = parcel.readString();
        this.musicType = parcel.readInt();
        this.mDuetFrom = parcel.readString();
        this.mDuetAuthor = (User) parcel.readSerializable();
        this.mDuetHashTag = parcel.readString();
        this.mShootMode = parcel.readInt();
        this.mShootedShootMode = parcel.readInt();
        this.creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
        this.ccVid = parcel.readString();
        this.hotSpotTag = parcel.readString();
        this.sentenceId = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mDurationMode = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isMuted = z9;
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.mEncodedAudioOutputFile = parcel.readString();
        this.mParallelUploadOutputFile = parcel.readString();
        this.voiceVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mIsMultiVideo = z10;
        this.shopDraftId = parcel.readString();
        this.mNewVersion = parcel.readInt();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.creativeFlowData = (CreativeFlowData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
        this.mSharedARModel = (SharedARModel) parcel.readParcelable(SharedARModel.class.getClassLoader());
        this.recordMode = parcel.readInt();
        this.gameScore = parcel.readInt();
        this.mEyesLabels = parcel.readString();
        this.mTanningLabels = parcel.readString();
        this.videoCoverPath = parcel.readString();
        this.microAppId = parcel.readString();
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.infoStickerModel = (InfoStickerModel) parcel.readParcelable(InfoStickerModel.class.getClassLoader());
        this.microAppModel = (MicroAppModel) parcel.readSerializable();
        this.texts = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.usePaint = z11;
        this.videoType = parcel.readInt();
        this.socialModel = (SocialModel) parcel.readParcelable(SocialModel.class.getClassLoader());
        this.md5 = parcel.readString();
        this.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.isStoryTextRecord = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.supportRetake = z13;
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.mFirstStickerMusicIdsJson = parcel.readString();
        this.uploadMiscInfoStruct = (AVUploadMiscInfoStruct) parcel.readSerializable();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
        this.compileProbeResult = (CompileProbeResult) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.isFastImport = z14;
        this.veCherEffectParam = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.mOutVideoWidth = parcel.readInt();
        this.mOutVideoHeight = parcel.readInt();
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.mVideoCanvasWidth = parcel.readInt();
        this.mVideoCanvasHeight = parcel.readInt();
        this.veAudioEffectParam = (AudioEffectParam) parcel.readParcelable(AudioEffectParam.class.getClassLoader());
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.uploadSpeedInfo = (UploadSpeedInfo) parcel.readParcelable(UploadSpeedInfo.class.getClassLoader());
        this.fastImportErrorCode = parcel.readInt();
        if (parcel.readByte() == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.isCommerceMusic = z15;
        if (parcel.readByte() == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.isOriginalSound = z16;
        if (parcel.readByte() == 1) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.soundSyncFromAnchor = z17;
        this.mBindMvId = parcel.readString();
        this.stickerChallenge = (StickerChallenge) parcel.readParcelable(StickerChallenge.class.getClassLoader());
        this.textStickerChallenges = (TextStickerChallenges) parcel.readParcelable(TextStickerChallenges.class.getClassLoader());
        this.metadataMap = C63872f1.LIZ(parcel.readString());
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.isStickPointMode = z18;
        this.mUploadPath = parcel.readString();
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.countDownModes = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        this.veAudioRecorderParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.textTypes = parcel.readString();
        this.textEffectIds = parcel.readString();
        this.videoCount = parcel.readInt();
        this.photoCount = parcel.readInt();
        this.mentionEditTextLength = parcel.readInt();
        this.pic2VideoSource = parcel.readString();
        if (parcel.readByte() == 1) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.isUseMusicBeforeEdit = z19;
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.containBackgroundVideo = z20;
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.containDiyPropVideo = z21;
        this.stickPointData = (StickPointData) parcel.readSerializable();
        this.mBeautyMetadatas = parcel.createTypedArrayList(BeautyMetadata.CREATOR);
        this.infoStickerCategoryParams = (InfoStickerCategoryParams) parcel.readParcelable(InfoStickerCategoryParams.class.getClassLoader());
        this.stickPointType = parcel.readInt();
        this.duetLayout = parcel.readString();
        this.duetVideoDuration = parcel.readInt();
        this.draftDuetExtraInfo = (DuetExtraInfo) parcel.readParcelable(DuetExtraInfo.class.getClassLoader());
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        this.greenScreenMaterialList = parcel.createTypedArrayList(GreenScreenMaterial.CREATOR);
        this.libraryMaterialList = parcel.createTypedArrayList(LibraryMaterialInfoSv.CREATOR);
        this.cameraLensInfo = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.isPhotoMvMode = z22;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.isDuetGreenSrceen = z23;
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.isPhotoMvMode1080p = z24;
        if (parcel.readByte() == 1) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.isSoundLoop = Boolean.valueOf(z25);
        this.coverPublishModel = (CoverPublishModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
        this.customStickerPaths = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z26 = true;
        } else {
            z26 = false;
        }
        this.isPhotoMvMusic = z26;
        if (parcel.readByte() != 0) {
            z27 = true;
        } else {
            z27 = false;
        }
        this.isDraftMusicIllegal = z27;
        this.audioAecDelayTime = parcel.readLong();
        this.currentZoomValue = parcel.readFloat();
        this.enterFrom = parcel.readString();
        this.screenBrightness = parcel.readInt();
        this.mShoutOutsData = (ShoutOutsData) parcel.readSerializable();
        this.recordBgmDelay = parcel.readInt();
        this.mDuetFromDuetButton = parcel.readInt();
        this.ttStoryUploadModel = (TTStoryUploadModel) parcel.readParcelable(TTStoryUploadModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z28 = true;
        } else {
            z28 = false;
        }
        this.isStoryEditMode = z28;
        this.canvasVideoData = (CanvasVideoData) parcel.readSerializable();
        this.storyEditEtParam = (StoryEditEtParam) parcel.readParcelable(StoryEditEtParam.class.getClassLoader());
        this.shootEnterMethod = parcel.readString();
        this.publishStage = parcel.readInt();
        this.singleImageCoverBitmapData = (SingleImageCoverBitmapData) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader());
        this.loudnessBalanceParam = (LoudnessBalanceParam) parcel.readSerializable();
        parcel.readList(this.segmentLoudness, Integer.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z29 = true;
        } else {
            z29 = false;
        }
        this.draftFromShoot = z29;
        if (parcel.readByte() == 1) {
            z30 = true;
        } else {
            z30 = false;
        }
        this.qaPermissionDialogShownStatus = z30;
        this.mPoiData = (PoiData) parcel.readSerializable();
        this.qaStruct = (QaStruct) parcel.readSerializable();
        this.qaStickerModel = (QAStickerModel) parcel.readParcelable(QAStickerModel.class.getClassLoader());
        this.libraryMaterialInfo = (LibraryMaterialInfoSv) parcel.readSerializable();
        this.extraEventParams = (HashMap) parcel.readSerializable();
        this.clickGoNextBtnTime = parcel.readLong();
        this.mDesignerIdList = parcel.readString();
        this.mOriginalStickerCount = parcel.readInt();
        this.isWestWindowExistStr = parcel.readString();
        this.autoAttachedAnchor = (AnchorTransData) parcel.readSerializable();
        ArrayList<InteractionTagUserInfo> arrayList2 = new ArrayList<>();
        this.tagUserList = arrayList2;
        parcel.readList(arrayList2, User.class.getClassLoader());
        this.textLayoutWidth = parcel.readFloat();
        this.textLayoutHeight = parcel.readFloat();
        this.uploadScene = parcel.readInt();
        this.encryptType = parcel.readInt();
        this.audioEnhanceParam = (AudioEnhanceParam) parcel.readParcelable(AudioEnhanceParam.class.getClassLoader());
        this.openPlatformExtra = parcel.readString();
        this.openPlatformClientKey = parcel.readString();
        this.creationMode = parcel.readInt();
        this.imageAlbumData = (ImageAlbumData) parcel.readParcelable(ImageAlbumData.class.getClassLoader());
        this.cut2EditTransferModel = (Cut2EditTransferModel) parcel.readParcelable(Cut2EditTransferModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z31 = true;
        } else {
            z31 = false;
        }
        this.editMusicSyncMode = z31;
        this.publishDuetMentionedUserList = parcel.createStringArrayList();
        this.nleData = parcel.readString();
        this.draftSaveTime = parcel.readLong();
        this.albumPreviewNextMethod = parcel.readString();
        this.fromItemId = parcel.readString();
        if (parcel.readByte() != 0) {
            z32 = true;
        } else {
            z32 = false;
        }
        this.isReuseOriginalSound = z32;
        this.reuseOriginalSoundId = parcel.readString();
        this.reuseOriginalSoundUrls = (UrlModel) parcel.readSerializable();
        this.ttsVoiceModel = (TTSVoiceModel) parcel.readSerializable();
        this.reuseOriginalSoundLength = parcel.readInt();
        this.duetModeType = parcel.readString();
        this.heading = parcel.readString();
        this.applyVoiceToAllTextSwitch = parcel.readInt();
        if (parcel.readByte() == 1) {
            z33 = true;
        } else {
            z33 = false;
        }
        this.useTextInEditorPro = z33;
        this.publishRetainType = parcel.readString();
        this.propOrder = parcel.readInt();
        if (parcel.readByte() != 0) {
            z34 = true;
        } else {
            z34 = false;
        }
        this.isFromRestoreRecover = z34;
        this.uploadTabNameList = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z35 = true;
        } else {
            z35 = false;
        }
        this.hasMultiAudioLoudnessNormalization = z35;
        this.isConvertFromDraft = parcel.readByte() != 0;
    }

    public static VideoExposureData asExposureData(Object obj) {
        boolean z;
        PhotoModeExposureData photoModeExposureData;
        String creationId;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel.creationMode == 2 && videoPublishEditModel.imageAlbumData != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            photoModeExposureData = new PhotoModeExposureData(new ArrayList(videoPublishEditModel.imageAlbumData.getImageList()));
        } else {
            new ArrayList();
            photoModeExposureData = null;
        }
        String videoPath = videoPublishEditModel.videoPath();
        float f = videoPublishEditModel.mVideoCoverStartTm;
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        String str = videoPublishEditModel.mOutputFile;
        String videoPath2 = videoPublishEditModel.videoPath();
        if (videoPublishEditModel.getCreationId() == null) {
            creationId = UUID.randomUUID().toString();
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        return new VideoExposureData(videoPath, f, mainBusinessData, str, videoPath2, creationId, videoPublishEditModel.isSaveLocal(), videoPublishEditModel.getLocalFinalPath(), videoPublishEditModel.mSaveModel, videoPublishEditModel.mOrigin, videoPublishEditModel.getDraftPrimaryKey(), videoPublishEditModel.mShootWay, videoPublishEditModel.creativeModel.musicBuzModel, photoModeExposureData);
    }

    public static String getGiphyGifIds(ArrayList<GreenScreenMaterial> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null) {
            return sb.toString();
        }
        return sb.toString();
    }

    public static VideoPublishEditModel makeCopy(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.m158clone();
    }

    public static String translateNullFilter(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("null", "-1");
    }

    public String getTtsLokiIds(boolean z) {
        SimpleTextStickerData simpleTextStickerData;
        String str;
        ArrayList arrayList = new ArrayList();
        if (C42000Ge4.LJIILIIL(this)) {
            for (TextStickerModel textStickerModel : C42000Ge4.LJII(this)) {
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().hasReadTextAudio && !TextUtils.isEmpty(textStickerModel.getTtsModel().voiceEffectId)) {
                    arrayList.add(textStickerModel.getTtsModel().voiceEffectId);
                }
            }
        } else if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker() && (simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, SimpleTextStickerData.class)) != null && simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getVoiceEffectId())) {
                    arrayList.add(simpleTextStickerData.getVoiceEffectId());
                }
            }
        }
        String str2 = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                str2 = (String) ListProtector.get(arrayList, i);
                if (z) {
                    str2 = a1.LJ("\"", str2, "\"");
                }
            } else {
                StringBuilder LIZJ = b1.LIZJ(str2, ",");
                if (z) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("\"");
                    str = JBR.LJFF(LIZ, (String) ListProtector.get(arrayList, i), "\"", LIZ);
                } else {
                    str = (String) ListProtector.get(arrayList, i);
                }
                LIZJ.append(str);
                str2 = X1D.LIZIZ(LIZJ);
            }
        }
        return str2;
    }

    public boolean hasOriginalAudio(boolean z) {
        ArrayList<LibraryMaterialInfoSv> arrayList;
        CanvasVideoData canvasVideoData;
        if ((!hasOriginalSound(z) && (((arrayList = this.libraryMaterialList) == null || arrayList.isEmpty()) && ((canvasVideoData = this.canvasVideoData) == null || !C79004UzY.LJJJI(canvasVideoData)))) || this.isMuted) {
            return false;
        }
        if (isStitchMode()) {
            StitchParams stitchParams = this.stitchParams;
            if (stitchParams != null) {
                return stitchParams.getEnableMic();
            }
            return true;
        }
        if (this.isStickPointMode || this.editMusicSyncMode) {
            return false;
        }
        return true;
    }

    public boolean hasOriginalSound(boolean z) {
        if (z) {
            if (!realHasOriginalSound() && !this.isFastImport && !isCutSameVideoType() && !isCurrentAutoCutMode()) {
                return false;
            }
            return true;
        }
        if (!realHasOriginalSound() && !this.isFastImport && (!isCutSameVideoType() || isCurrentAutoCutMode())) {
            return false;
        }
        return true;
    }

    public void onlyUpdateSuperMainBusinessData(C164846dU c164846dU) {
        super.setMainBusinessData(GsonProtectorUtils.toJson(this.businessGson, c164846dU));
    }

    public void removeAudioEffectChallengeFromTitleAndStruct(AVChallenge aVChallenge) {
        removeTitleAndChallenge(aVChallenge);
    }

    public void removeChallengeFromTitleAndStruct(Collection<AVChallenge> collection) {
        Iterator<AVChallenge> it = collection.iterator();
        while (it.hasNext()) {
            removeTitleAndChallenge(it.next());
        }
    }

    public void removeTitleAndChallenge(AVChallenge aVChallenge) {
        List<AVTextExtraStruct> list;
        if (aVChallenge == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.title)) {
            String str = this.title;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("#");
            LIZ.append(aVChallenge.challengeName);
            LIZ.append(" ");
            this.title = str.replace(X1D.LIZIZ(LIZ), "");
        }
        List<AVTextExtraStruct> list2 = this.structList;
        if (list2 != null && !list2.isEmpty() && (list = this.structList) != null) {
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                if (aVChallenge.challengeName.equals(aVTextExtraStruct.hashTagName)) {
                    this.structList.remove(aVTextExtraStruct);
                    return;
                }
            }
        }
    }

    public void setApplyVoiceToAllTextSwitch(int i) {
        this.applyVoiceToAllTextSwitch = i;
    }

    public void setBackgroundVideoDraftDir(String str) {
        this.backgroundVideoDraftDir = str;
    }

    public void setChain(String str) {
        this.chain = str;
    }

    public void setCompileFinished(boolean z) {
        this.isCompileFinished = z;
    }

    public void setCompileProbeResult(CompileProbeResult compileProbeResult) {
        this.compileProbeResult = compileProbeResult;
    }

    public void setConvertFromDraft(boolean z) {
        this.isConvertFromDraft = z;
    }

    public void setCoverPublishModel(CoverPublishModel coverPublishModel) {
        this.coverPublishModel = coverPublishModel;
    }

    public void setDisableDeleteChain(boolean z) {
        this.disableDeleteChain = z;
    }

    public void setDraftMusicIllegal(boolean z) {
        this.creativeModel.musicBuzModel.isDraftMusicIllegal = z;
    }

    public void setDuetHashTag(String str) {
        this.mDuetHashTag = str;
    }

    public void setDuetModeType(String str) {
        this.duetModeType = str;
    }

    public void setEditPagePrePublishId(String str) {
        this.creativeModel.prePublishEntranceModel.publishId = str;
    }

    public void setEditorProModel(EditorProModel editorProModel) {
        this.creativeFlowData.setEditorProModel(editorProModel);
    }

    public void setEffectList(ArrayList<EffectPointModel> arrayList) {
        EditEffectModel editEffectModel = this.creativeModel.editEffectModel;
        editEffectModel.getClass();
        o.LJIIIZ(arrayList, "<set-?>");
        editEffectModel.effectList = arrayList;
    }

    public void setHardcodeAdaptiveResult(H57 h57) {
        C44549He5 c44549He5 = this.strategiesResult;
        if (c44549He5 != null) {
            c44549He5.LIZLLL = h57;
        } else {
            this.hardcodeAdaptiveResult = h57;
        }
    }

    public void setImageAlbumData(ImageAlbumData imageAlbumData) {
        this.imageAlbumData = imageAlbumData;
    }

    public void setIsReuseOriginalSound(boolean z) {
        this.creativeModel.musicBuzModel.isReuseOriginalSound = z;
    }

    public void setIsSoundLoop(Boolean bool) {
        this.creativeModel.musicBuzModel.isSoundLoop = bool;
    }

    public void setMCurMusicLength(int i) {
        this.creativeModel.musicBuzModel.mCurMusicLength = i;
    }

    public void setMMusicEnd(int i) {
        this.creativeModel.musicBuzModel.musicEnd = i;
    }

    public void setMMusicPath(String str) {
        this.creativeModel.musicBuzModel.musicPath = str;
    }

    public void setMMusicRecType(int i) {
        this.creativeModel.musicBuzModel.musicRecType = i;
    }

    public void setMMusicShowRank(int i) {
        this.creativeModel.musicBuzModel.musicShowRank = i;
    }

    public void setMMusicStart(int i) {
        this.creativeModel.musicBuzModel.musicStart = i;
    }

    public void setMMusicType(int i) {
        this.creativeModel.musicBuzModel.mMusicType = i;
    }

    public void setMainBusinessContext(C164846dU c164846dU) {
        if (this.mainBusinessContext != c164846dU) {
            this.mainBusinessContext = c164846dU;
            if (super.getMainBusinessData() != null) {
                super.setMainBusinessData(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void setMainBusinessData(String str) {
        if (!TextUtils.equals(super.getMainBusinessData(), str)) {
            super.setMainBusinessData(str);
            if (this.mainBusinessContext != null) {
                this.mainBusinessContext = null;
            }
        }
    }

    public void setMicroAppId(String str) {
        this.microAppId = str;
    }

    public void setMusicOrigin(String str) {
        this.creativeModel.musicBuzModel.musicOrigin = str;
    }

    public void setMusicRequestId(String str) {
        this.musicRequestId = str;
    }

    public void setNLECanvas(boolean z) {
        this.creativeFlowData.getNleEditModel().setNLECanvas(z);
    }

    public void setNewVersion(int i) {
        this.mNewVersion = i;
    }

    public void setOriginalVideoInfo(VideoFileInfo videoFileInfo) {
        this.originalVideoInfo = videoFileInfo;
    }

    public void setPreCompileResult(boolean z) {
        this.creativeModel.prePublishEntranceModel.preCompileSuccess = z;
    }

    public void setPrePublishStarted(boolean z) {
        this.creativeModel.prePublishEntranceModel.started = z;
    }

    public void setPreviewInfo(EditPreviewInfo editPreviewInfo) {
        this.previewInfo = editPreviewInfo;
    }

    public void setReplaceMusicId(String str) {
        this.creativeModel.musicBuzModel.replaceMusicId = str;
    }

    public void setReuseOriginalSoundId(String str) {
        this.creativeModel.musicBuzModel.reuseOriginalSoundId = str;
    }

    public void setReuseOriginalSoundLength(int i) {
        this.creativeModel.musicBuzModel.reuseOriginalSoundLength = i;
    }

    public void setReuseOriginalSoundUrls(UrlModel urlModel) {
        this.creativeModel.musicBuzModel.reuseOriginalSoundUrls = urlModel;
    }

    public void setSaveModel(AVUploadSaveModel aVUploadSaveModel) {
        this.mSaveModel = aVUploadSaveModel;
    }

    public void setSharedARModel(SharedARModel sharedARModel) {
        this.mSharedARModel = sharedARModel;
    }

    public void setShouldEditorStartOptimization(boolean z) {
        this.shouldEditorStartOptimization = z;
    }

    public void setStickPointType(int i) {
        this.stickPointType = i;
    }

    public void setStrategiesResult(C44549He5 c44549He5) {
        this.strategiesResult = c44549He5;
    }

    public void setStructList(List<AVTextExtraStruct> list) {
        this.structList = list;
    }

    public void setSynthesisFileHash(String str) {
        this.synthesisFileHash = str;
    }

    public void setTagUserList(ArrayList<InteractionTagUserInfo> arrayList) {
        this.tagUserList = arrayList;
    }

    public void setTextStickerChallenges(TextStickerChallenges textStickerChallenges) {
        this.textStickerChallenges = textStickerChallenges;
    }

    public void setTimeEffect(EffectPointModel effectPointModel) {
        this.creativeModel.editEffectModel.timeEffect = effectPointModel;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTtsVoiceModel(TTSVoiceModel tTSVoiceModel) {
        this.ttsVoiceModel = tTSVoiceModel;
    }

    public void setUseMusicBeforeEdit(boolean z) {
        this.creativeModel.musicBuzModel.isUseMusicBeforeEdit = z;
    }

    public void setVideoCoverPath(String str) {
        this.videoCoverPath = str;
    }

    public void setVideoEditorType(int i) {
        this.videoEditorType = i;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void setVideoLength(int i) {
        if (getPreviewInfo() == null) {
            return;
        }
        getPreviewInfo().setPreviewVideoLength(i);
    }

    public void setWatermarkVideoResolution(C78858UxC c78858UxC) {
        Objects.requireNonNull(c78858UxC);
        this.watermarkVideoResolution = c78858UxC;
    }

    public String uniqueVideoSessionDir(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        String contactVideoPathAsKey = getContactVideoPathAsKey();
        contactVideoPathAsKey.toString();
        if (this.isFastImport) {
            if (TextUtils.isEmpty(this.creativeInfo.getCreationId())) {
                this.creativeInfo = new CreativeInfo();
            }
            contactVideoPathAsKey = this.creativeInfo.getCreationId();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[getUniqueName]: creation id = ");
        LIZ2.append(getCreationId());
        LIZ2.append("   uniqueName = ");
        LIZ2.append(contactVideoPathAsKey);
        C143195jf.LIZ(X1D.LIZIZ(LIZ2));
        LIZ.append(C38352F3k.LIZJ(contactVideoPathAsKey));
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.DIW
    public int videoFps(boolean z) {
        return (int) videoFpsFloat(z);
    }

    @Override // X.DIW
    public float videoFpsFloat(boolean z) {
        if (getPreviewInfo() == null || H7R.LJJJJIZL(this)) {
            return 0.0f;
        }
        return C78926UyI.LJJJZ(getPreviewInfo(), z);
    }

    public void setApplyVoiceToAllTextSwitch(boolean z) {
        this.applyVoiceToAllTextSwitch = z ? 1 : 0;
    }

    public void setEffectSource(boolean z, int i) {
        EditEffectModel editEffectModel = this.creativeModel.editEffectModel;
        editEffectModel.effectSource = i;
        editEffectModel.hasMultiTrackEffect = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.chain);
        parcel.writeByte(this.disableDeleteChain ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.structList);
        parcel.writeString(this.uploadMethod);
        parcel.writeString(this.templateId);
        parcel.writeString(this.mSelectedFilterId);
        parcel.writeString(this.mSelectedFilterLabel);
        parcel.writeString(this.mSelectedFilterResId);
        parcel.writeParcelable(getPreviewInfo(), i);
        parcel.writeString(this.mRecordFilterIds);
        parcel.writeString(this.mRecordFilterLabels);
        parcel.writeString(this.mRecordFilterValues);
        parcel.writeParcelable(this.mBeautyMobParam, i);
        parcel.writeString(this.mCurFilterLabels);
        parcel.writeString(this.mCurFilterIds);
        parcel.writeString(this.mSmoothSkinLabels);
        parcel.writeSerializable(this.commentVideoModel);
        parcel.writeSerializable(this.mSubtitleMusicChangeChecker);
        parcel.writeString(this.mReshapeLabels);
        parcel.writeString(this.videoSpeed);
        parcel.writeString(this.cameraIds);
        parcel.writeInt(this.beautyType);
        parcel.writeString(this.mMusicPath);
        parcel.writeString(this.mVideoSegmentsDesc);
        parcel.writeString(this.mStickerPath);
        parcel.writeString(this.mStickerID);
        parcel.writeByte(this.mFromCut ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mFromMultiCut ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.faceBeautyOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mWillGoOnShortVideo ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mOrigin);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mRestoreType);
        parcel.writeInt(this.mFaceBeauty);
        parcel.writeInt(this.mSelectedId);
        parcel.writeFloat(this.mSelectedFilterIntensity);
        parcel.writeInt(this.mRecordVideoSelectedFilterIndex);
        parcel.writeFloat(this.mRecordVideoSelectedFilterIntensity);
        parcel.writeInt(this.mCameraPosition);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        parcel.writeInt(this.autoEnhanceType);
        parcel.writeInt(this.musicStart);
        parcel.writeInt(this.musicEnd);
        parcel.writeString(this.musicOrigin);
        parcel.writeInt(this.musicShowRank);
        parcel.writeInt(this.musicRecType);
        parcel.writeInt(this.mUseFilter);
        parcel.writeFloat(this.mVideoCoverStartTm);
        parcel.writeLong(this.maxDuration);
        parcel.writeTypedList(this.importInfoList);
        parcel.writeSerializable(this.audioTrack);
        parcel.writeString(this.musicId);
        parcel.writeString(this.musicRequestId);
        parcel.writeString(this.shareId);
        parcel.writeString(this.clientId);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeString(this.mOutputFile);
        parcel.writeString(this.mId3Title);
        parcel.writeString(this.musicCover);
        parcel.writeString(this.mId3Album);
        parcel.writeInt(this.musicType);
        parcel.writeString(this.mDuetFrom);
        parcel.writeSerializable(this.mDuetAuthor);
        parcel.writeString(this.mDuetHashTag);
        parcel.writeInt(this.mShootMode);
        parcel.writeInt(this.mShootedShootMode);
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeString(this.ccVid);
        parcel.writeString(this.hotSpotTag);
        parcel.writeString(this.sentenceId);
        parcel.writeByte(this.mDurationMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.mEncodedAudioOutputFile);
        parcel.writeString(this.mParallelUploadOutputFile);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeByte(this.mIsMultiVideo ? (byte) 1 : (byte) 0);
        parcel.writeString(this.shopDraftId);
        parcel.writeInt(this.mNewVersion);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeParcelable(this.creativeFlowData, i);
        parcel.writeParcelable(this.mSharedARModel, i);
        parcel.writeInt(this.recordMode);
        parcel.writeInt(this.gameScore);
        parcel.writeString(this.mEyesLabels);
        parcel.writeString(this.mTanningLabels);
        parcel.writeString(this.videoCoverPath);
        parcel.writeString(this.microAppId);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.infoStickerModel, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeStringList(this.texts);
        parcel.writeByte(this.usePaint ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.videoType);
        parcel.writeParcelable(this.socialModel, i);
        parcel.writeString(this.md5);
        parcel.writeParcelable(this.multiEditVideoRecordData, i);
        parcel.writeByte(this.isStoryTextRecord ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.supportRetake ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeString(this.mFirstStickerMusicIdsJson);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeSerializable(this.compileProbeResult);
        parcel.writeByte(this.isFastImport ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mOutVideoWidth);
        parcel.writeInt(this.mOutVideoHeight);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeInt(this.mVideoCanvasWidth);
        parcel.writeInt(this.mVideoCanvasHeight);
        parcel.writeParcelable(this.veAudioEffectParam, i);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeParcelable(this.uploadSpeedInfo, i);
        parcel.writeInt(this.fastImportErrorCode);
        parcel.writeByte(this.isCommerceMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.soundSyncFromAnchor ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mBindMvId);
        parcel.writeParcelable(this.stickerChallenge, i);
        parcel.writeParcelable(this.textStickerChallenges, i);
        parcel.writeString(C63872f1.LIZIZ(this.metadataMap));
        parcel.writeByte(this.isStickPointMode ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mUploadPath);
        parcel.writeList(this.countDownModes);
        parcel.writeParcelable(this.veAudioRecorderParam, i);
        parcel.writeString(this.textTypes);
        parcel.writeString(this.textEffectIds);
        parcel.writeInt(this.videoCount);
        parcel.writeInt(this.photoCount);
        parcel.writeInt(this.mentionEditTextLength);
        parcel.writeString(this.pic2VideoSource);
        parcel.writeByte(this.isUseMusicBeforeEdit ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.containBackgroundVideo ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.containDiyPropVideo ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.stickPointData);
        parcel.writeTypedList(this.mBeautyMetadatas);
        parcel.writeParcelable(this.infoStickerCategoryParams, i);
        parcel.writeInt(this.stickPointType);
        parcel.writeString(this.duetLayout);
        parcel.writeInt(this.duetVideoDuration);
        parcel.writeParcelable(this.draftDuetExtraInfo, i);
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeTypedList(this.greenScreenMaterialList);
        parcel.writeTypedList(this.libraryMaterialList);
        parcel.writeStringList(this.cameraLensInfo);
        parcel.writeByte(this.isPhotoMvMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDuetGreenSrceen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isPhotoMvMode1080p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSoundLoop.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.coverPublishModel, i);
        parcel.writeStringList(this.customStickerPaths);
        parcel.writeByte(this.isPhotoMvMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDraftMusicIllegal ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeFloat(this.currentZoomValue);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.screenBrightness);
        parcel.writeSerializable(this.mShoutOutsData);
        parcel.writeInt(this.recordBgmDelay);
        parcel.writeInt(this.mDuetFromDuetButton);
        parcel.writeParcelable(this.ttStoryUploadModel, i);
        parcel.writeByte(this.isStoryEditMode ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.canvasVideoData);
        parcel.writeParcelable(this.storyEditEtParam, i);
        parcel.writeString(this.shootEnterMethod);
        parcel.writeInt(this.publishStage);
        parcel.writeParcelable(this.singleImageCoverBitmapData, i);
        parcel.writeSerializable(this.loudnessBalanceParam);
        parcel.writeList(this.segmentLoudness);
        parcel.writeByte(this.draftFromShoot ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.qaPermissionDialogShownStatus ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.mPoiData);
        parcel.writeSerializable(this.qaStruct);
        parcel.writeParcelable(this.qaStickerModel, i);
        parcel.writeSerializable(this.libraryMaterialInfo);
        parcel.writeSerializable(this.extraEventParams);
        parcel.writeLong(this.clickGoNextBtnTime);
        parcel.writeString(this.mDesignerIdList);
        parcel.writeInt(this.mOriginalStickerCount);
        parcel.writeString(this.isWestWindowExistStr);
        parcel.writeSerializable(this.autoAttachedAnchor);
        parcel.writeList(this.tagUserList);
        parcel.writeFloat(this.textLayoutWidth);
        parcel.writeFloat(this.textLayoutHeight);
        parcel.writeInt(this.uploadScene);
        parcel.writeInt(this.encryptType);
        parcel.writeParcelable(this.audioEnhanceParam, i);
        parcel.writeString(this.openPlatformExtra);
        parcel.writeString(this.openPlatformClientKey);
        parcel.writeInt(this.creationMode);
        parcel.writeParcelable(this.imageAlbumData, i);
        parcel.writeParcelable(this.cut2EditTransferModel, i);
        parcel.writeByte(this.editMusicSyncMode ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.publishDuetMentionedUserList);
        parcel.writeString(this.nleData);
        parcel.writeLong(this.draftSaveTime);
        parcel.writeString(this.albumPreviewNextMethod);
        parcel.writeString(this.fromItemId);
        parcel.writeByte(this.isReuseOriginalSound ? (byte) 1 : (byte) 0);
        parcel.writeString(this.reuseOriginalSoundId);
        parcel.writeSerializable(this.reuseOriginalSoundUrls);
        parcel.writeSerializable(this.ttsVoiceModel);
        parcel.writeInt(this.reuseOriginalSoundLength);
        parcel.writeString(this.duetModeType);
        parcel.writeString(this.heading);
        parcel.writeInt(this.applyVoiceToAllTextSwitch);
        parcel.writeByte(this.useTextInEditorPro ? (byte) 1 : (byte) 0);
        parcel.writeString(this.publishRetainType);
        parcel.writeInt(this.propOrder);
        parcel.writeByte(this.isFromRestoreRecover ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.uploadTabNameList);
        parcel.writeByte(this.hasMultiAudioLoudnessNormalization ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isConvertFromDraft ? (byte) 1 : (byte) 0);
    }
}
