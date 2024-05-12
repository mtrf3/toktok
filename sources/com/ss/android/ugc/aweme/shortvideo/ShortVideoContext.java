package com.ss.android.ugc.aweme.shortvideo;

import X.C41012G7s;
import X.C43119Gw7;
import X.C43722HDy;
import X.C60903NvH;
import X.C76917UGr;
import X.G9D;
import X.HCA;
import Y.IDCreatorS51S0000000_7;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<ShortVideoContext> CREATOR = new IDCreatorS51S0000000_7(11);
    public transient long actionDownTime;
    public String albumPreviewNextMethod;
    public int allowRecommend;
    public ArrayList<String> arTextList;
    public long audioAecDelayTime;
    public AVETParameter avetParameter;
    public BeautyMobParam beautyMobParam;
    public final CameraComponentModel cameraComponentModel;
    public String chain;
    public String clientId;
    public CommentVideoModel commentVideoModel;
    public ArrayList<Integer> countDownModes;
    public CreativeFlowData creativeFlowData;
    public CreativeInfo creativeInfo;
    public CreativeModel creativeModel;
    public GreenScreenMaterial curGreenScreenMaterial;
    public float currentZoomValue;
    public boolean disableDeleteChain;
    public Boolean doNotLoadMusic;
    public DraftEditTransferModel draftEditTransferModel;
    public boolean draftFromShoot;
    public int draftId;
    public int draftToEditFrom;
    public boolean duetEnterRecordPageWithProps;
    public User duetFromUser;
    public String duetModeType;
    public int duetVideoDuration;
    public String effectImage;
    public String effectMetaInfo;
    public boolean enableSingleSegmentConcatUseCopy;
    public String enterAlbumMethod;
    public String enterCutsameId;
    public String enterFrom;
    public String enterMethod;
    public Effect enterMvThemeEffect;
    public String enterPreviousPage;
    public String eventType;
    public List<User> excludeUserList;
    public HashMap<String, HashMap<String, String>> extraEventParams;
    public ExtraSession extraSession;
    public String filterBusinessSticker;
    public int firstPropOrder;
    public String fromPropId;
    public int gameScore;
    public String giphyGifIds;
    public OPSDK$GreenScreenKitConfig greenScreenKitConfig;
    public boolean isAIEnhanceOn;
    public boolean isAutoSelectedAlbumPreview;
    public Boolean isBusinessFirstSticker;
    public boolean isCarouselOpen;
    public boolean isClickFromAlbumPreview;
    public boolean isDraftMusicIllegal;
    public boolean isDuetGreenSrceen;
    public boolean isDuetMode;
    public boolean isFromNormalRecord;
    public boolean isPhotoMvMode;
    public int isPrivate;
    public boolean isReuseOriginalSound;
    public boolean isShowedMusicTips;
    public boolean isSimpleShootMode;
    public int isSpecialPlusIcon;
    public boolean isStory;
    public boolean isStoryOrPhotoTab;
    public String isWestWindowExistStr;
    public Long lastMusicTitleTimeMills;
    public LibraryContext libraryContext;
    public String liveSourceParams;
    public LoudnessBalanceParam loudnessBalanceParam;
    public AnchorTransData mAutoSelectedAnchor;
    public String mBindMovieId;
    public int mDuetFromDuetButton;
    public boolean mFromOtherPlatform;
    public boolean mIsFromDraft;
    public boolean mIsPhotoMvModeMusic;
    public int mMusicLength;
    public String mMusicOrigin;
    public UrlModel mMusicStrongBeatUrl;
    public String mSavedDraftId;
    public String mShareId;
    public String mShootFrom;
    public ShoutOutsData mShoutOutsData;
    public boolean mToLive;
    public boolean mToStatus;
    public String mUnpublishedEffectId;
    public int mVideoRecordSelectedFilterIndex;
    public float mVideoRecordSelectedFilterIntensity;
    public UrlModel mWavFormUrl;
    public ExtraMentionUserModel mentionUserModel;
    public ArrayList<String> messageBubbleTexts;
    public MicroAppModel microAppModel;
    public MultiSegmentPropExtra multiSegmentPropClipsInfo;
    public AVMusic musicBeforeRetake;
    public String musicId;
    public AVMusicWaveBean musicWaveBean;
    public NaviContext naviContext;
    public String newDraftId;
    public Bundle nonDuetModeBundle;
    public boolean onlyShowLiveTab;
    public String openPlatformClientKey;
    public String openPlatformExtra;
    public String openPlatformShareId;
    public String originalUid;
    public PhotoMvConfig photoMvConfig;
    public int pic2VideoSource;
    public ArrayList<String> pic2VideoSourceList;
    public String presetEffectId;
    public int propOrder;
    public String publishRetainType;
    public int publishStage;
    public boolean putPresetStickerAtFirst;
    public boolean qaPermissionDialogShownStatus;
    public QAStickerModel qaStickerModel;
    public QaStruct qaStruct;
    public int recordBGMDelay;
    public String recordParam;
    public RecordPresetResource recordPresetResource;
    public Effect retainFirstEffect;
    public String reuseOriginalSoundId;
    public int reuseOriginalSoundLength;
    public UrlModel reuseOriginalSoundUrls;
    public UrlModel sendToUserHead;
    public C43722HDy shareContext;
    public SharedARModel sharedARModel;
    public int shootMode;
    public String shootWay;
    public int shootedShootMode;
    public Boolean showCancelAfterPinProp;
    public String showStickerMode;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public String stickersFromDraftVideos;
    public StitchContext stitchContext;
    public boolean storyPublishWithAnim;
    public List<AVTextExtraStruct> structList;
    public int tabs;
    public String tagId;
    public String title;
    public TTSVoiceModel ttsVoiceModel;
    public String ugcTemplateTag;
    public String uploadMethod;
    public AVUploadMiscInfoStruct uploadMiscInfoStruct;
    public List<String> uploadTabNameList;
    public boolean usedEffectFromDiscoveryPage;
    public int videoLength;

    public final void LJJJ() {
        this.isShowedMusicTips = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZ() {
        StitchContext stitchContext = this.stitchContext;
        stitchContext.stitchParams = null;
        stitchContext.stitchClip = null;
    }

    public final HCA LIZIZ() {
        return this.cameraComponentModel.LIZ();
    }

    public final AVETParameter LIZLLL() {
        if (this.avetParameter == null) {
            this.avetParameter = new AVETParameter();
        }
        return this.avetParameter;
    }

    public final int LJ() {
        int i = this.shootedShootMode;
        if (i == -1) {
            return this.shootMode;
        }
        return i;
    }

    public final String LJI() {
        return this.creativeInfo.getCreationId();
    }

    public final HCA LJII() {
        return this.cameraComponentModel.LIZIZ();
    }

    public final long LJIIIIZZ() {
        return this.cameraComponentModel.LIZLLL();
    }

    public final TimeSpeedModelExtension LJIIJ() {
        HCA LIZIZ = this.cameraComponentModel.LIZIZ();
        if (LIZIZ.isEmpty()) {
            return null;
        }
        return LIZIZ.get(LIZIZ.size() - 1);
    }

    public final int LJIIJJI() {
        return this.creativeModel.musicBuzModel.musicLength;
    }

    public final String LJIIL() {
        return this.creativeModel.musicBuzModel.musicOrigin;
    }

    public final long LJIILIIL() {
        return this.cameraComponentModel.LJ();
    }

    public final RetakeVideoContext LJIILL() {
        return (RetakeVideoContext) this.cameraComponentModel.retakeVideoContext;
    }

    public final String LJIILLIIL() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundId;
    }

    public final int LJIIZILJ() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundLength;
    }

    public final UrlModel LJIJ() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundUrls;
    }

    public final String LJIJI() {
        int i = this.shootMode;
        if (i != 2) {
            if (i != 10) {
                if (i != 11) {
                    switch (i) {
                        case 14:
                            return "video_180";
                        case 15:
                            return "fast_shoot";
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            return C60903NvH.LJIIJJI().LJJIII().getNowUIService().getTabName();
                        case 17:
                            return "photo";
                        case 18:
                            return "video_600";
                        case 19:
                            return "upload_tab";
                        case 20:
                            return "fast_shoot";
                        default:
                            return "";
                    }
                }
                return "video_60";
            }
            return "video_15";
        }
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (!C43119Gw7.LIZ()) {
            return "photo";
        }
        return "fast_shoot";
    }

    public final boolean LJIJJ() {
        StitchParams stitchParams = this.stitchContext.stitchParams;
        if (stitchParams == null) {
            return false;
        }
        if (stitchParams.isPGCMusic() && this.stitchContext.stitchParams.getMusic() != null) {
            return false;
        }
        return true;
    }

    public final boolean LJIL() {
        if (this.isFromNormalRecord && !this.isShowedMusicTips) {
            return true;
        }
        return false;
    }

    public final boolean LJJ() {
        if (this.isPhotoMvMode && this.mIsFromDraft) {
            return true;
        }
        return false;
    }

    public final boolean LJJI() {
        if (TextUtils.equals(this.shootWay, "l8_import_music_edit") || TextUtils.equals(this.shootWay, "change_ban_music")) {
            return true;
        }
        return false;
    }

    public final boolean LJJIFFI() {
        if (this.cameraComponentModel.mRestoreType == 2 || this.publishStage == 50) {
            return true;
        }
        return false;
    }

    public final boolean LJJII() {
        return this.cameraComponentModel.LJII();
    }

    public final boolean LJJIIJ() {
        return this.creativeModel.musicBuzModel.isReuseOriginalSound;
    }

    public final boolean LJJIIJZLJL() {
        if (this.sharedARModel != null) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIZ() {
        if (this.mShoutOutsData != null) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJ() {
        return TextUtils.equals(this.shootWay, "sound_sync");
    }

    public final boolean LJJIJIIJI() {
        if (this.stitchContext.stitchParams != null) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJIIJIL() {
        if (TextUtils.equals(this.shootWay, "ugc_template") || TextUtils.equals(this.ugcTemplateTag, "ugc_template_tag_game") || TextUtils.equals(this.shootWay, "pugc_template")) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJIL() {
        return this.cameraComponentModel.LJIIIIZZ();
    }

    public final boolean LJJJI() {
        return this.cameraComponentModel.LJIILIIL();
    }

    public final boolean LJJJIL() {
        StitchParams stitchParams = this.stitchContext.stitchParams;
        if (stitchParams == null || stitchParams.getMusic() == null || !this.stitchContext.stitchParams.isPGCMusic() || this.stitchContext.stitchParams.getMusicStart() < 0) {
            return false;
        }
        return true;
    }

    public final String getMusicId() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return MusicBeanUtilKt.getMusicId(musicObject);
        }
        return null;
    }

    public final String getMusicPath() {
        return this.cameraComponentModel.getMusicPath();
    }

    public final long LJIIIZ() {
        boolean z;
        Iterator<TimeSpeedModelExtension> it = LJII().iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next != null && next.getLibraryVideo() != null && next.getLibraryVideo().getMaterialProvider() != null && next.getLibraryVideo().getMaterialProvider().equals(2)) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                return next.getDuration();
            }
        }
        return 0L;
    }

    public final int LJIILJJIL() {
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        if (C41012G7s.LIZ() && ((creativeModel = this.creativeModel) == null || (draftInfoModel = creativeModel.draftInfoModel) == null || !draftInfoModel.isDraft)) {
            if (G9D.LIZ() == 4) {
                return G9D.LIZJ();
            }
            return G9D.LIZ();
        }
        return G9D.LIZIZ();
    }

    public ShortVideoContext(Parcel parcel) {
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
        this.creativeFlowData = new CreativeFlowData();
        this.draftToEditFrom = -1;
        this.isReuseOriginalSound = false;
        this.creativeInfo = new CreativeInfo();
        this.draftFromShoot = false;
        this.qaPermissionDialogShownStatus = false;
        this.clientId = "";
        this.newDraftId = "";
        this.stitchContext = new StitchContext();
        this.libraryContext = new LibraryContext();
        this.naviContext = new NaviContext();
        this.disableDeleteChain = false;
        this.isPrivate = LJIILJJIL();
        this.isDuetGreenSrceen = false;
        this.isCarouselOpen = false;
        this.usedEffectFromDiscoveryPage = false;
        Boolean bool = Boolean.FALSE;
        this.doNotLoadMusic = bool;
        this.showCancelAfterPinProp = bool;
        this.isBusinessFirstSticker = bool;
        this.duetEnterRecordPageWithProps = false;
        this.shootedShootMode = -1;
        this.isFromNormalRecord = false;
        this.isShowedMusicTips = false;
        this.extraSession = new ExtraSession();
        this.enterPreviousPage = "";
        this.tabs = 0;
        this.arTextList = new ArrayList<>();
        this.publishStage = 0;
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.messageBubbleTexts = new ArrayList<>();
        this.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        this.musicWaveBean = null;
        this.countDownModes = new ArrayList<>();
        this.mVideoRecordSelectedFilterIndex = 0;
        this.mVideoRecordSelectedFilterIntensity = -1.0f;
        this.pic2VideoSource = 0;
        this.pic2VideoSourceList = new ArrayList<>();
        this.isClickFromAlbumPreview = false;
        this.isAutoSelectedAlbumPreview = false;
        this.albumPreviewNextMethod = "";
        this.showStickerMode = "";
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.isPhotoMvMode = false;
        this.isStoryOrPhotoTab = false;
        this.isStory = false;
        this.storyPublishWithAnim = false;
        this.isWestWindowExistStr = "";
        this.firstPropOrder = 0;
        this.propOrder = 0;
        this.isAIEnhanceOn = false;
        this.lastMusicTitleTimeMills = -1L;
        this.uploadMethod = parcel.readString();
        this.enterAlbumMethod = parcel.readString();
        this.cameraComponentModel = (CameraComponentModel) parcel.readParcelable(CameraComponentModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromNormalRecord = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isShowedMusicTips = z2;
        this.mWavFormUrl = (UrlModel) parcel.readSerializable();
        this.mMusicLength = parcel.readInt();
        this.mMusicOrigin = parcel.readString();
        this.creativeInfo = (CreativeInfo) parcel.readParcelable(CreativeInfo.class.getClassLoader());
        this.shootWay = parcel.readString();
        this.mShootFrom = parcel.readString();
        this.stickersFromDraftVideos = parcel.readString();
        this.giphyGifIds = parcel.readString();
        this.curGreenScreenMaterial = (GreenScreenMaterial) parcel.readSerializable();
        this.commentVideoModel = (CommentVideoModel) parcel.readSerializable();
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.presetEffectId = parcel.readString();
        this.fromPropId = parcel.readString();
        this.tagId = parcel.readString();
        this.shootMode = parcel.readInt();
        this.shootedShootMode = parcel.readInt();
        this.title = parcel.readString();
        this.structList = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.isPrivate = parcel.readInt();
        this.excludeUserList = (List) parcel.readSerializable();
        this.allowRecommend = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mIsFromDraft = z3;
        this.gameScore = parcel.readInt();
        this.extraSession = (ExtraSession) parcel.readParcelable(ExtraSession.class.getClassLoader());
        this.microAppModel = (MicroAppModel) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mFromOtherPlatform = z4;
        this.avetParameter = (AVETParameter) parcel.readSerializable();
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.arTextList = parcel.createStringArrayList();
        this.messageBubbleTexts = parcel.createStringArrayList();
        this.uploadMiscInfoStruct = (AVUploadMiscInfoStruct) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isSimpleShootMode = z5;
        this.draftEditTransferModel = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.sendToUserHead = (UrlModel) parcel.readSerializable();
        this.shareContext = (C43722HDy) parcel.readSerializable();
        this.mBindMovieId = parcel.readString();
        this.enterFrom = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableSingleSegmentConcatUseCopy = z6;
        this.mVideoRecordSelectedFilterIndex = parcel.readInt();
        this.mVideoRecordSelectedFilterIntensity = parcel.readFloat();
        parcel.readList(this.countDownModes, Integer.class.getClassLoader());
        this.filterBusinessSticker = parcel.readString();
        this.chain = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.disableDeleteChain = z7;
        this.musicId = parcel.readString();
        this.mMusicStrongBeatUrl = (UrlModel) parcel.readSerializable();
        this.photoMvConfig = (PhotoMvConfig) parcel.readParcelable(PhotoMvConfig.class.getClassLoader());
        this.creativeFlowData = (CreativeFlowData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsPhotoMvModeMusic = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isDuetGreenSrceen = z9;
        this.audioAecDelayTime = parcel.readLong();
        this.currentZoomValue = parcel.readFloat();
        this.draftToEditFrom = parcel.readInt();
        this.mShoutOutsData = (ShoutOutsData) parcel.readSerializable();
        this.duetFromUser = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isClickFromAlbumPreview = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isAutoSelectedAlbumPreview = z11;
        this.albumPreviewNextMethod = parcel.readString();
        this.mShareId = parcel.readString();
        this.clientId = parcel.readString();
        this.recordBGMDelay = parcel.readInt();
        this.mDuetFromDuetButton = parcel.readInt();
        this.enterMethod = parcel.readString();
        this.publishStage = parcel.readInt();
        this.loudnessBalanceParam = (LoudnessBalanceParam) parcel.readSerializable();
        this.beautyMobParam = (BeautyMobParam) parcel.readParcelable(BeautyMobParam.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.draftFromShoot = z12;
        if (parcel.readByte() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.qaPermissionDialogShownStatus = z13;
        this.isWestWindowExistStr = parcel.readString();
        this.qaStruct = (QaStruct) parcel.readSerializable();
        this.qaStickerModel = (QAStickerModel) parcel.readParcelable(QAStickerModel.class.getClassLoader());
        this.libraryContext = (LibraryContext) parcel.readParcelable(LibraryContext.class.getClassLoader());
        this.mAutoSelectedAnchor = (AnchorTransData) parcel.readSerializable();
        this.openPlatformExtra = parcel.readString();
        this.singleImageCoverBitmapData = (SingleImageCoverBitmapData) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader());
        this.openPlatformClientKey = parcel.readString();
        this.openPlatformShareId = parcel.readString();
        this.ttsVoiceModel = (TTSVoiceModel) parcel.readSerializable();
        this.isSpecialPlusIcon = parcel.readInt();
        this.greenScreenKitConfig = (OPSDK$GreenScreenKitConfig) parcel.readSerializable();
        this.publishRetainType = parcel.readString();
        this.firstPropOrder = parcel.readInt();
        this.isAIEnhanceOn = parcel.readByte() != 0;
        this.uploadTabNameList = parcel.createStringArrayList();
        this.creativeModel = (CreativeModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
        this.multiSegmentPropClipsInfo = (MultiSegmentPropExtra) parcel.readParcelable(MultiSegmentPropExtra.class.getClassLoader());
        this.recordParam = parcel.readString();
        this.ugcTemplateTag = parcel.readString();
        this.lastMusicTitleTimeMills = Long.valueOf(parcel.readLong());
    }

    public final void LJIJJLI(StitchParams stitchParams) {
        if (stitchParams == null || stitchParams.getVideoSegment() == null || stitchParams.getVideoSegment().getVideoFileInfo() == null) {
            return;
        }
        this.stitchContext.stitchParams = stitchParams;
        this.cameraComponentModel.isMuted = stitchParams.isMuted();
        this.stitchContext.stitchClip = new TimeSpeedModelExtension();
        this.stitchContext.stitchClip.setDuration((int) stitchParams.getDuration());
    }

    public final void LJJIJL(TimeSpeedModelExtension timeSpeedModelExtension) {
        String str;
        PublishExtensionModel fromString;
        List<CreateAnchorInfo> list;
        if (timeSpeedModelExtension != null && (str = this.extraSession.commerceData) != null && (list = (fromString = PublishExtensionModel.fromString(str)).createAnchorInfos) != null && !list.isEmpty()) {
            Iterator<CreateAnchorInfo> it = fromString.createAnchorInfos.iterator();
            while (it.hasNext()) {
                CreateAnchorInfo next = it.next();
                if (C76917UGr.LJJJJ(timeSpeedModelExtension)) {
                    try {
                        if (TextUtils.equals(new JSONObject(next.getExtra()).optString("id"), C76917UGr.LJJI(timeSpeedModelExtension))) {
                            it.remove();
                        }
                    } catch (Exception unused) {
                    }
                } else if (TextUtils.equals(new JSONObject(next.getContent()).optString("third_id", ""), timeSpeedModelExtension.getStickerId())) {
                    it.remove();
                }
            }
            this.extraSession.commerceData = PublishExtensionModel.toString(fromString);
        }
    }

    public final void LJJIJLIJ(int i) {
        this.creativeModel.musicBuzModel.musicLength = i;
    }

    public final void LJJIL(String str) {
        this.creativeModel.musicBuzModel.musicOrigin = str;
    }

    public final void LJJIZ(boolean z) {
        if (z) {
            if (this.sharedARModel == null) {
                this.sharedARModel = new SharedARModel();
                return;
            }
            return;
        }
        this.sharedARModel = null;
    }

    public ShortVideoContext(CameraComponentModel cameraComponentModel) {
        this.creativeFlowData = new CreativeFlowData();
        this.draftToEditFrom = -1;
        this.isReuseOriginalSound = false;
        this.creativeInfo = new CreativeInfo();
        this.draftFromShoot = false;
        this.qaPermissionDialogShownStatus = false;
        this.clientId = "";
        this.newDraftId = "";
        this.stitchContext = new StitchContext();
        this.libraryContext = new LibraryContext();
        this.naviContext = new NaviContext();
        this.disableDeleteChain = false;
        this.isPrivate = LJIILJJIL();
        this.isDuetGreenSrceen = false;
        this.isCarouselOpen = false;
        this.usedEffectFromDiscoveryPage = false;
        Boolean bool = Boolean.FALSE;
        this.doNotLoadMusic = bool;
        this.showCancelAfterPinProp = bool;
        this.isBusinessFirstSticker = bool;
        this.duetEnterRecordPageWithProps = false;
        this.shootedShootMode = -1;
        this.isFromNormalRecord = false;
        this.isShowedMusicTips = false;
        this.extraSession = new ExtraSession();
        this.enterPreviousPage = "";
        this.tabs = 0;
        this.arTextList = new ArrayList<>();
        this.publishStage = 0;
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.messageBubbleTexts = new ArrayList<>();
        this.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        this.musicWaveBean = null;
        this.countDownModes = new ArrayList<>();
        this.mVideoRecordSelectedFilterIndex = 0;
        this.mVideoRecordSelectedFilterIntensity = -1.0f;
        this.pic2VideoSource = 0;
        this.pic2VideoSourceList = new ArrayList<>();
        this.isClickFromAlbumPreview = false;
        this.isAutoSelectedAlbumPreview = false;
        this.albumPreviewNextMethod = "";
        this.showStickerMode = "";
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.isPhotoMvMode = false;
        this.isStoryOrPhotoTab = false;
        this.isStory = false;
        this.storyPublishWithAnim = false;
        this.isWestWindowExistStr = "";
        this.firstPropOrder = 0;
        this.propOrder = 0;
        this.isAIEnhanceOn = false;
        this.lastMusicTitleTimeMills = -1L;
        this.cameraComponentModel = cameraComponentModel;
        this.creativeModel = new CreativeModel();
    }

    public ShortVideoContext(CameraComponentModel cameraComponentModel, CreativeModel creativeModel) {
        this.creativeFlowData = new CreativeFlowData();
        this.draftToEditFrom = -1;
        this.isReuseOriginalSound = false;
        this.creativeInfo = new CreativeInfo();
        this.draftFromShoot = false;
        this.qaPermissionDialogShownStatus = false;
        this.clientId = "";
        this.newDraftId = "";
        this.stitchContext = new StitchContext();
        this.libraryContext = new LibraryContext();
        this.naviContext = new NaviContext();
        this.disableDeleteChain = false;
        this.isPrivate = LJIILJJIL();
        this.isDuetGreenSrceen = false;
        this.isCarouselOpen = false;
        this.usedEffectFromDiscoveryPage = false;
        Boolean bool = Boolean.FALSE;
        this.doNotLoadMusic = bool;
        this.showCancelAfterPinProp = bool;
        this.isBusinessFirstSticker = bool;
        this.duetEnterRecordPageWithProps = false;
        this.shootedShootMode = -1;
        this.isFromNormalRecord = false;
        this.isShowedMusicTips = false;
        this.extraSession = new ExtraSession();
        this.enterPreviousPage = "";
        this.tabs = 0;
        this.arTextList = new ArrayList<>();
        this.publishStage = 0;
        this.loudnessBalanceParam = new LoudnessBalanceParam();
        this.messageBubbleTexts = new ArrayList<>();
        this.uploadMiscInfoStruct = new AVUploadMiscInfoStruct();
        this.musicWaveBean = null;
        this.countDownModes = new ArrayList<>();
        this.mVideoRecordSelectedFilterIndex = 0;
        this.mVideoRecordSelectedFilterIntensity = -1.0f;
        this.pic2VideoSource = 0;
        this.pic2VideoSourceList = new ArrayList<>();
        this.isClickFromAlbumPreview = false;
        this.isAutoSelectedAlbumPreview = false;
        this.albumPreviewNextMethod = "";
        this.showStickerMode = "";
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.isPhotoMvMode = false;
        this.isStoryOrPhotoTab = false;
        this.isStory = false;
        this.storyPublishWithAnim = false;
        this.isWestWindowExistStr = "";
        this.firstPropOrder = 0;
        this.propOrder = 0;
        this.isAIEnhanceOn = false;
        this.lastMusicTitleTimeMills = -1L;
        this.cameraComponentModel = cameraComponentModel;
        this.creativeModel = creativeModel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uploadMethod);
        parcel.writeString(this.enterAlbumMethod);
        parcel.writeParcelable(this.cameraComponentModel, i);
        parcel.writeInt(this.isFromNormalRecord ? 1 : 0);
        parcel.writeInt(this.isShowedMusicTips ? 1 : 0);
        parcel.writeSerializable(this.mWavFormUrl);
        parcel.writeInt(this.mMusicLength);
        parcel.writeString(this.mMusicOrigin);
        parcel.writeParcelable(this.creativeInfo, i);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.mShootFrom);
        parcel.writeString(this.stickersFromDraftVideos);
        parcel.writeString(this.giphyGifIds);
        parcel.writeSerializable(this.curGreenScreenMaterial);
        parcel.writeSerializable(this.commentVideoModel);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.presetEffectId);
        parcel.writeString(this.fromPropId);
        parcel.writeString(this.tagId);
        parcel.writeInt(this.shootMode);
        parcel.writeInt(this.shootedShootMode);
        parcel.writeString(this.title);
        parcel.writeTypedList(this.structList);
        parcel.writeInt(this.isPrivate);
        parcel.writeSerializable((Serializable) this.excludeUserList);
        parcel.writeInt(this.allowRecommend);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.extraSession, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeInt(this.mFromOtherPlatform ? 1 : 0);
        parcel.writeSerializable(this.avetParameter);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeStringList(this.arTextList);
        parcel.writeStringList(this.messageBubbleTexts);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeByte(this.isSimpleShootMode ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.draftEditTransferModel, i);
        parcel.writeSerializable(this.sendToUserHead);
        parcel.writeSerializable(this.shareContext);
        parcel.writeString(this.mBindMovieId);
        parcel.writeString(this.enterFrom);
        parcel.writeByte(this.enableSingleSegmentConcatUseCopy ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mVideoRecordSelectedFilterIndex);
        parcel.writeFloat(this.mVideoRecordSelectedFilterIntensity);
        parcel.writeList(this.countDownModes);
        parcel.writeString(this.filterBusinessSticker);
        parcel.writeString(this.chain);
        parcel.writeByte(this.disableDeleteChain ? (byte) 1 : (byte) 0);
        parcel.writeString(this.musicId);
        parcel.writeSerializable(this.mMusicStrongBeatUrl);
        parcel.writeParcelable(this.photoMvConfig, i);
        parcel.writeParcelable(this.creativeFlowData, i);
        parcel.writeByte(this.mIsPhotoMvModeMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDuetGreenSrceen ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeFloat(this.currentZoomValue);
        parcel.writeInt(this.draftToEditFrom);
        parcel.writeSerializable(this.mShoutOutsData);
        parcel.writeSerializable(this.duetFromUser);
        parcel.writeByte(this.isClickFromAlbumPreview ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAutoSelectedAlbumPreview ? (byte) 1 : (byte) 0);
        parcel.writeString(this.albumPreviewNextMethod);
        parcel.writeString(this.mShareId);
        parcel.writeString(this.clientId);
        parcel.writeInt(this.recordBGMDelay);
        parcel.writeInt(this.mDuetFromDuetButton);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.publishStage);
        parcel.writeSerializable(this.loudnessBalanceParam);
        parcel.writeParcelable(this.beautyMobParam, i);
        parcel.writeByte(this.draftFromShoot ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.qaPermissionDialogShownStatus ? (byte) 1 : (byte) 0);
        parcel.writeString(this.isWestWindowExistStr);
        parcel.writeSerializable(this.qaStruct);
        parcel.writeParcelable(this.qaStickerModel, i);
        parcel.writeParcelable(this.libraryContext, i);
        parcel.writeSerializable(this.mAutoSelectedAnchor);
        parcel.writeString(this.openPlatformExtra);
        parcel.writeParcelable(this.singleImageCoverBitmapData, i);
        parcel.writeString(this.openPlatformClientKey);
        parcel.writeString(this.openPlatformShareId);
        parcel.writeSerializable(this.ttsVoiceModel);
        parcel.writeInt(this.isSpecialPlusIcon);
        parcel.writeSerializable(this.greenScreenKitConfig);
        parcel.writeString(this.publishRetainType);
        parcel.writeInt(this.firstPropOrder);
        parcel.writeByte(this.isAIEnhanceOn ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.uploadTabNameList);
        parcel.writeParcelable(this.creativeModel, i);
        parcel.writeParcelable(this.multiSegmentPropClipsInfo, i);
        parcel.writeString(this.recordParam);
        parcel.writeString(this.ugcTemplateTag);
        parcel.writeLong(this.lastMusicTitleTimeMills.longValue());
    }
}
