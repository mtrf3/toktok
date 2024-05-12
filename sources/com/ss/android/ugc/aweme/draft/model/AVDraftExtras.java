package com.ss.android.ugc.aweme.draft.model;

import X.C08880Wm;
import X.C47959Irz;
import X.C79062V1e;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryParams;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AVDraftExtras {
    public final transient ArrayList<TimeSpeedModelExtension> LIZ;

    @InterfaceC65349Pkn("allow_recommend")
    public int allowRecommend;

    @InterfaceC65349Pkn("app_voice_to_all_text_switch")
    public int applyVoiceToAllTextSwitch;

    @InterfaceC65349Pkn("audio_aec_delay_time")
    public long audioAecDelayTime;

    @InterfaceC65349Pkn("audio_enhance_param")
    public AudioEnhanceParam audioEnhanceParam;

    @InterfaceC65349Pkn("audio_recorder_param")
    public AudioRecorderParam audioRecorderParam;

    @InterfaceC65349Pkn("auto_attached_anchor")
    public AnchorTransData autoAttachedAnchor;

    @InterfaceC65349Pkn("selected_asr_lang")
    public String autoCaptionLang;

    @InterfaceC65349Pkn("autoEnhanceOn")
    public boolean autoEnhanceOn;

    @InterfaceC65349Pkn("autoEnhanceType")
    public int autoEnhanceType;

    @InterfaceC65349Pkn("av_upload_misc_struct")
    public AVUploadMiscInfoStruct avUploadMiscInfoStruct;

    @InterfaceC65349Pkn("backGroundVideoDraftDir")
    public String backgroundVideoDraftDir;

    @InterfaceC65349Pkn("beauty_metadata")
    public ArrayList<BeautyMetadata> beautyMetadata;

    @InterfaceC65349Pkn("beauty_type")
    public int beautyType;

    @InterfaceC65349Pkn("camera_ids")
    public String cameraIds;

    @InterfaceC65349Pkn("camera_lens_info")
    public ArrayList<String> cameraLensInfo;

    @InterfaceC65349Pkn("canvas_video_info")
    public CanvasVideoData canvasVideoData;

    @InterfaceC65349Pkn("commentSetting")
    public int commentSetting;

    @InterfaceC65349Pkn("comment_sticker_model")
    public CommentVideoModel commentVideoModel;

    @InterfaceC65349Pkn("commerceData")
    public String commerceData;

    @InterfaceC65349Pkn("is_commerce_music")
    public boolean commerceMusic;

    @InterfaceC65349Pkn("containBackgroundVideo")
    public boolean containBackgroundVideo;

    @InterfaceC65349Pkn("cover_publish_model")
    public CoverPublishModel coverPublishModel;

    @InterfaceC65349Pkn("creationId")
    public String creationId;

    @InterfaceC65349Pkn("creation_mode")
    public int creationMode;

    @InterfaceC65349Pkn("creative_flow_data")
    public CreativeFlowData creativeFlowData;

    @InterfaceC65349Pkn("creative_info")
    public CreativeInfo creativeInfo;

    @InterfaceC65349Pkn("current_zoom_value")
    public float currentZoomValue;

    @InterfaceC65349Pkn("cut_2_edit_transfer_model")
    public Cut2EditTransferModel cut2EditTransferModel;

    @InterfaceC65349Pkn("cutsame_data")
    public CutSameEditData cutSameData;

    @InterfaceC65349Pkn("downloadSetting")
    public int downloadSetting;

    @InterfaceC65349Pkn("cher_effect_param")
    public DraftCherEffectParam draftCherEffectParam;

    @InterfaceC65349Pkn("draftId")
    public int draftId;

    @InterfaceC65349Pkn("draft_ve_audio_effect_param")
    public DraftVEAudioEffectParam draftVEAudioEffectParam;

    @InterfaceC65349Pkn("draft_video_path")
    public String draftVideoPath;

    @InterfaceC65349Pkn("duet_extra_info")
    public DuetExtraInfo duetExtraInfo;

    @InterfaceC65349Pkn("duet_from_duet_button")
    public int duetFromDuetButton;

    @InterfaceC65349Pkn("duet_layout")
    public String duetLayout;

    @InterfaceC65349Pkn("duet_mode_type")
    public String duetModeType;

    @InterfaceC65349Pkn("duet_setting")
    public int duetSetting;

    @InterfaceC65349Pkn("duet_video_duration")
    public int duetVideoDuration;

    @InterfaceC65349Pkn("durationMode")
    public boolean durationMode;

    @InterfaceC65349Pkn("edit_music_sync_mode")
    public boolean editMusicSyncMode;

    @InterfaceC65349Pkn("enable_auto_caption")
    public int enableAutoCaption;

    @InterfaceC65349Pkn("exclude_user_list")
    public List<? extends User> excludeUserList;

    @InterfaceC65349Pkn("extractFramesModel")
    public ExtractFramesModel extractFramesModel;

    @InterfaceC65349Pkn("fast_import_resolution")
    public String fastImportResolution;

    @InterfaceC65349Pkn("is_file_length_fixed")
    public boolean fileLengthFixed;

    @InterfaceC65349Pkn("filterId")
    public String filterId;

    @InterfaceC65349Pkn("filter_intensity")
    public float filterIntensity;

    @InterfaceC36436ERs
    @InterfaceC65349Pkn("filter_local_path")
    public String filterLocalPath;

    @InterfaceC65349Pkn("firstStickerMusicIds")
    public String firstStickerMusicIds;

    @InterfaceC65349Pkn("from")
    public int from;

    @InterfaceC65349Pkn("from_item_id")
    public String fromItemId;

    @InterfaceC65349Pkn("gameScore")
    public int gameScore;

    @InterfaceC65349Pkn("geofencing_info")
    public List<String> geoFencingData;

    @InterfaceC65349Pkn("globalData")
    public String globalData;

    @InterfaceC65349Pkn("green_screen_material_list")
    public ArrayList<GreenScreenMaterial> greenScreenMaterials;

    @InterfaceC65349Pkn("has_multi_audio_loudness_normalization")
    public boolean hasMultiAudioLoudnessNormalization;

    @InterfaceC65349Pkn("hashtag_sticker_texts")
    public List<String> hashTagTextList;

    @InterfaceC65349Pkn("heading")
    public String heading;

    @InterfaceC65349Pkn("image_album_data")
    public ImageAlbumData imageAlbumData;

    @InterfaceC65349Pkn("import_video_infos")
    public ArrayList<ImportVideoInfo> importVideoInfos;

    @InterfaceC65349Pkn("infoStickerModel")
    public InfoStickerModel infoStickerModel;

    @InterfaceC65349Pkn("is_draft_music_illegal")
    public boolean isDraftMusicIllegal;

    @InterfaceC65349Pkn("is_duet_green_srceen")
    public boolean isDuetGreenSrceen;

    @InterfaceC65349Pkn("is_fast_import")
    public boolean isFastImport;

    @InterfaceC65349Pkn("isMultiVideo")
    public boolean isMultiVideo;

    @InterfaceC65349Pkn("isMuted")
    public boolean isMuted;

    @InterfaceC65349Pkn("is_now_publish")
    public boolean isNowPublish;

    @InterfaceC65349Pkn("is_photo_mv_mode")
    public boolean isPhotoMvMode;

    @InterfaceC65349Pkn("is_photo_mv_mode_1080p")
    public boolean isPhotoMvMode1080p;

    @InterfaceC65349Pkn("is_photo_mv_music")
    public boolean isPhotoMvMusic;

    @InterfaceC65349Pkn("is_sound_loop")
    public String isSoundLoop;

    @InterfaceC65349Pkn("is_stickpoint_mode")
    public boolean isStickPointMode;

    @InterfaceC65349Pkn("is_story_draft")
    public boolean isStoryDraft;

    @InterfaceC65349Pkn("update_info_stickers")
    public boolean isUpdateInfoStickers;

    @InterfaceC65349Pkn("is_west_window_exist_str")
    public String isWestWindowExistStr;

    @InterfaceC65349Pkn("last_output_video_path")
    public String lastOutputVideoPath;

    @InterfaceC65349Pkn("library_material_list")
    public ArrayList<LibraryMaterialInfoSv> libraryMaterialList;

    @InterfaceC65349Pkn("library_params")
    public LibraryParams libraryParams;

    @InterfaceC65349Pkn("lightening_extra_info")
    public LighteningExtraInfo lighteningExtraInfo;

    @InterfaceC65349Pkn("loudness_param")
    public LoudnessBalanceParam loudnessParam;

    @InterfaceC65349Pkn("mainBusinessData")
    public String mainBusinessData;

    @InterfaceC65349Pkn("mention_sticker_texts")
    public List<String> mentionTextList;

    @InterfaceC65349Pkn("message_bubble_texts")
    public List<String> messageBubbleTexts;

    @InterfaceC65349Pkn("microAppId")
    public String microAppId;

    @InterfaceC65349Pkn("micro_app_info")
    public MicroAppModel microAppInfo;

    @InterfaceC65349Pkn("multi_edit_video_data")
    public MultiEditVideoStatusRecordData multiEditVideoData;

    @InterfaceC65349Pkn("multi_edit_video_size")
    public Map<String, Long> multiEditVideoSize;

    @InterfaceC65349Pkn("music_end")
    public int musicEnd;

    @InterfaceC65349Pkn("musicOrigin")
    public String musicOrigin;

    @InterfaceC65349Pkn("mv_theme_create_video")
    public MvCreateVideoData mvCreateVideoData;

    @InterfaceC65349Pkn("newDraftId")
    public String newDraftId;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("nleDataPath")
    public String nleDataPath;

    @InterfaceC65349Pkn("open_platform_client_key")
    public String openplatformClientKey;

    @InterfaceC65349Pkn("open_platform_extra")
    public String openplatformExtra;

    @InterfaceC65349Pkn("photoCount")
    public int photoCount;

    @InterfaceC65349Pkn("pic2VideoSource")
    public String pic2VideoSource;

    @InterfaceC65349Pkn("draft_preview_configure")
    public DraftPreviewConfigure previewConfigure;

    @InterfaceC65349Pkn("preview_info")
    public EditPreviewInfo previewInfo;

    @InterfaceC65349Pkn("preview_video_list_copy")
    public List<? extends EditVideoSegment> previewVideoListCopy;

    @InterfaceC65349Pkn("prop_order")
    public int propOrder;

    @InterfaceC65349Pkn("publish_retain_type")
    public String publishRetainType;

    @InterfaceC65349Pkn("publish_stage")
    public int publishStage;

    @InterfaceC65349Pkn("qa_video_model")
    public QaStruct qaStruct;

    @InterfaceC65349Pkn("reactionParams")
    public ReactionParams reactionParams;

    @InterfaceC65349Pkn("record_beauty_mob_param")
    public BeautyMobParam recordBeautyMobParam;

    @InterfaceC65349Pkn("record_bgm_delay")
    public Integer recordBgmDelay;

    @InterfaceC65349Pkn("record_filter_ids")
    public String recordFilterIds;

    @InterfaceC65349Pkn("record_filter_names")
    public String recordFilterNames;

    @InterfaceC65349Pkn("record_filter_values")
    public String recordFilterValues;

    @InterfaceC65349Pkn("recordMode")
    public int recordMode;

    @InterfaceC65349Pkn("save_draft_app_version")
    public long saveDraftAppVersion;

    @InterfaceC65349Pkn("selectedFilterId")
    public String selectedFilterId;

    @InterfaceC65349Pkn("selectedFilterLabel")
    public String selectedFilterLabel;

    @InterfaceC65349Pkn("selectedFilterResId")
    public String selectedFilterResId;

    @InterfaceC65349Pkn("selectedFilterValue")
    public String selectedFilterValue;

    @InterfaceC65349Pkn("session_id")
    public String sessionId;

    @InterfaceC65349Pkn("shared_ar_model")
    public SharedARModel sharedARModel;

    @InterfaceC65349Pkn("shootFrom")
    public String shootFrom;

    @InterfaceC65349Pkn("shootMode")
    public int shootMode;

    @InterfaceC65349Pkn("shoot_publish_duration")
    public long shootPublishDuration;

    @InterfaceC65349Pkn("shootWay")
    public String shootWay;

    @InterfaceC65349Pkn("shooted_shoot_mode")
    public int shootedShootMode;

    @InterfaceC65349Pkn("shout_outs_data")
    public ShoutOutsData shoutOutsData;

    @InterfaceC65349Pkn("socialData")
    public String socialData;

    @InterfaceC65349Pkn(alternate = {"E"}, value = "socialModel")
    public SocialModel socialModel;

    @InterfaceC65349Pkn("sound_sync_from_anchor")
    public boolean soundSyncFromAnchor;

    @InterfaceC65349Pkn("status_create_video")
    public StatusCreateVideoData statusCreateVideoData;

    @InterfaceC65349Pkn("stick_point_data")
    public StickPointData stickPointData;

    @InterfaceC65349Pkn("stick_point_type")
    public int stickPointType;

    @InterfaceC65349Pkn("sticker_challenge")
    public StickerChallenge stickerChallenge;

    @InterfaceC65349Pkn("sticker_info")
    public StickerInfo stickerInfo;

    @InterfaceC65349Pkn("stitch_params")
    public StitchParams stitchParams;

    @InterfaceC65349Pkn("stitch_setting")
    public int stitchSetting;

    @InterfaceC65349Pkn("support_retake")
    public boolean supportRetake;

    @InterfaceC65349Pkn("tag_user_list")
    public ArrayList<InteractionTagUserInfo> tagUserList;

    @InterfaceC65349Pkn("techData")
    public String techData;

    @InterfaceC65349Pkn("text_sticker_challenge")
    public TextStickerChallenges textStickerChallenges;

    @InterfaceC65349Pkn("texts")
    public List<String> texts;

    @InterfaceC65349Pkn("draft_time_effect_start_point")
    public Integer timeEffectStartPoint;

    @InterfaceC65349Pkn("ugData")
    public String ugData;

    @InterfaceC65349Pkn("uploadMethod")
    public String uploadMethod;

    @InterfaceC65349Pkn("upload_path")
    public String uploadPath;

    @InterfaceC65349Pkn("uploadSaveModel")
    public AVUploadSaveModel uploadSaveModel;

    @InterfaceC65349Pkn("uploadTabNameList")
    public List<String> uploadTabNameList;

    @InterfaceC65349Pkn("useMusicBeforeEdit")
    public boolean useMusicBeforeEdit;

    @InterfaceC65349Pkn("usePaint")
    public boolean usePaint;

    @InterfaceC65349Pkn("videoCanvasHeight")
    public int videoCanvasHeight;

    @InterfaceC65349Pkn("videoCanvasWidth")
    public int videoCanvasWidth;

    @InterfaceC65349Pkn("videoCount")
    public int videoCount;

    @InterfaceC43620HAa
    @InterfaceC65349Pkn("videoCoverPath")
    public String videoCoverPath;

    @InterfaceC65349Pkn("videoOutHeight")
    public int videoOutHeight;

    @InterfaceC65349Pkn("videoOutWidth")
    public int videoOutWidth;

    @InterfaceC65349Pkn("video_part_metadata")
    public Map<String, ? extends Object> videoPartMetadata;

    @InterfaceC65349Pkn("video_segments_copy")
    public List<DraftVideoSegment> videoSegmentsCopy;

    @InterfaceC65349Pkn("video_type")
    public int videoType;

    public AVDraftExtras(int i, int i2, String str, CreativeInfo creativeInfo, String str2, int i3, String newDraftId, boolean z, boolean z2, int i4, int i5, ReactionParams reactionParams, String str3, boolean z3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ExtractFramesModel extractFramesModel, String str11, String str12, String str13, String str14, BeautyMobParam beautyMobParam, String str15, String str16, String str17, AVUploadSaveModel aVUploadSaveModel, InfoStickerModel infoStickerModel, MicroAppModel microAppModel, int i6, List<String> list, boolean z4, int i7, int i8, int i9, SocialModel socialModel, String str18, MvCreateVideoData mvCreateVideoData, int i10, ImageAlbumData imageAlbumData, String str19, StatusCreateVideoData statusCreateVideoData, CreativeFlowData creativeFlowData, AVUploadMiscInfoStruct aVUploadMiscInfoStruct, boolean z5, String str20, String str21, String str22, DraftCherEffectParam draftCherEffectParam, int i11, int i12, int i13, int i14, int i15, DraftVEAudioEffectParam draftVEAudioEffectParam, Integer num, String str23, String str24, int i16, ArrayList<ImportVideoInfo> arrayList, StickerChallenge stickerChallenge, TextStickerChallenges textStickerChallenges, Map<String, ? extends Object> map, AudioRecorderParam audioRecorderParam, boolean z6, String str25, DraftPreviewConfigure draftPreviewConfigure, List<DraftVideoSegment> list2, EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list3, int i17, int i18, float f, String pic2VideoSource, int i19, boolean z7, boolean z8, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z9, StickPointData stickPointData, String str26, StickerInfo stickerInfo, CommentVideoModel commentVideoModel, ArrayList<BeautyMetadata> arrayList2, boolean z10, boolean z11, int i20, int i21, String str27, int i22, StitchParams stitchParams, boolean z12, ArrayList<GreenScreenMaterial> arrayList3, LibraryParams libraryParams, ArrayList<LibraryMaterialInfoSv> arrayList4, ArrayList<String> arrayList5, boolean z13, boolean z14, String str28, CutSameEditData cutSameEditData, CoverPublishModel coverPublishModel, List<String> list4, List<? extends User> list5, ShoutOutsData shoutOutsData, int i23, SharedARModel sharedARModel, List<String> list6, boolean z15, boolean z16, boolean z17, int i24, long j, float f2, Map<String, Long> map2, List<String> list7, List<String> list8, int i25, int i26, int i27, String str29, DuetExtraInfo duetExtraInfo, Integer num2, String str30, CanvasVideoData canvasVideoData, LighteningExtraInfo lighteningExtraInfo, LoudnessBalanceParam loudnessBalanceParam, String str31, String str32, long j2, String isWestWindowExistStr, QaStruct qaStruct, ArrayList<InteractionTagUserInfo> arrayList6, AnchorTransData anchorTransData, String str33, String str34, AudioEnhanceParam audioEnhanceParam, boolean z18, boolean z19, Cut2EditTransferModel cut2EditTransferModel, boolean z20, String str35, String str36, boolean z21, String str37, String str38, List<String> list9, long j3, String str39, int i28, String str40, int i29, boolean z22, boolean z23) {
        o.LJIIIZ(newDraftId, "newDraftId");
        o.LJIIIZ(pic2VideoSource, "pic2VideoSource");
        o.LJIIIZ(duetExtraInfo, "duetExtraInfo");
        o.LJIIIZ(isWestWindowExistStr, "isWestWindowExistStr");
        this.shootMode = i;
        this.from = i2;
        this.creationId = str;
        this.creativeInfo = creativeInfo;
        this.shootWay = str2;
        this.draftId = i3;
        this.newDraftId = newDraftId;
        this.isMultiVideo = z;
        this.durationMode = z2;
        this.recordMode = i4;
        this.gameScore = i5;
        this.reactionParams = reactionParams;
        this.microAppId = str3;
        this.isMuted = z3;
        this.musicOrigin = str4;
        this.mainBusinessData = str5;
        this.socialData = str6;
        this.commerceData = str7;
        this.ugData = str8;
        this.techData = str9;
        this.globalData = str10;
        this.extractFramesModel = extractFramesModel;
        this.filterId = str11;
        this.recordFilterIds = str12;
        this.recordFilterNames = str13;
        this.recordFilterValues = str14;
        this.recordBeautyMobParam = beautyMobParam;
        this.selectedFilterId = str15;
        this.selectedFilterLabel = str16;
        this.selectedFilterValue = str17;
        this.uploadSaveModel = aVUploadSaveModel;
        this.infoStickerModel = infoStickerModel;
        this.microAppInfo = microAppModel;
        this.videoType = i6;
        this.texts = list;
        this.usePaint = z4;
        this.commentSetting = i7;
        this.duetSetting = i8;
        this.stitchSetting = i9;
        this.socialModel = socialModel;
        this.firstStickerMusicIds = str18;
        this.mvCreateVideoData = mvCreateVideoData;
        this.creationMode = i10;
        this.imageAlbumData = imageAlbumData;
        this.heading = str19;
        this.statusCreateVideoData = statusCreateVideoData;
        this.creativeFlowData = creativeFlowData;
        this.avUploadMiscInfoStruct = aVUploadMiscInfoStruct;
        this.isFastImport = z5;
        this.fastImportResolution = str20;
        this.draftVideoPath = str21;
        this.videoCoverPath = str22;
        this.draftCherEffectParam = draftCherEffectParam;
        this.videoOutWidth = i11;
        this.videoOutHeight = i12;
        this.videoCanvasWidth = i13;
        this.videoCanvasHeight = i14;
        this.musicEnd = i15;
        this.draftVEAudioEffectParam = draftVEAudioEffectParam;
        this.timeEffectStartPoint = num;
        this.filterLocalPath = str23;
        this.cameraIds = str24;
        this.beautyType = i16;
        this.importVideoInfos = arrayList;
        this.stickerChallenge = stickerChallenge;
        this.textStickerChallenges = textStickerChallenges;
        this.videoPartMetadata = map;
        this.audioRecorderParam = audioRecorderParam;
        this.isStickPointMode = z6;
        this.uploadPath = str25;
        this.previewConfigure = draftPreviewConfigure;
        this.videoSegmentsCopy = list2;
        this.previewInfo = editPreviewInfo;
        this.previewVideoListCopy = list3;
        this.videoCount = i17;
        this.photoCount = i18;
        this.filterIntensity = f;
        this.pic2VideoSource = pic2VideoSource;
        this.downloadSetting = i19;
        this.useMusicBeforeEdit = z7;
        this.supportRetake = z8;
        this.multiEditVideoData = multiEditVideoStatusRecordData;
        this.containBackgroundVideo = z9;
        this.stickPointData = stickPointData;
        this.backgroundVideoDraftDir = str26;
        this.stickerInfo = stickerInfo;
        this.commentVideoModel = commentVideoModel;
        this.beautyMetadata = arrayList2;
        this.isUpdateInfoStickers = z10;
        this.autoEnhanceOn = z11;
        this.autoEnhanceType = i20;
        this.stickPointType = i21;
        this.duetLayout = str27;
        this.duetVideoDuration = i22;
        this.stitchParams = stitchParams;
        this.commerceMusic = z12;
        this.greenScreenMaterials = arrayList3;
        this.libraryParams = libraryParams;
        this.libraryMaterialList = arrayList4;
        this.cameraLensInfo = arrayList5;
        this.isPhotoMvMode = z13;
        this.isDuetGreenSrceen = z14;
        this.isSoundLoop = str28;
        this.cutSameData = cutSameEditData;
        this.coverPublishModel = coverPublishModel;
        this.geoFencingData = list4;
        this.excludeUserList = list5;
        this.shoutOutsData = shoutOutsData;
        this.allowRecommend = i23;
        this.sharedARModel = sharedARModel;
        this.messageBubbleTexts = list6;
        this.isPhotoMvMusic = z15;
        this.isPhotoMvMode1080p = z16;
        this.isDraftMusicIllegal = z17;
        this.publishStage = i24;
        this.audioAecDelayTime = j;
        this.currentZoomValue = f2;
        this.multiEditVideoSize = map2;
        this.mentionTextList = list7;
        this.hashTagTextList = list8;
        this.shootedShootMode = i25;
        this.duetFromDuetButton = i26;
        this.enableAutoCaption = i27;
        this.autoCaptionLang = str29;
        this.duetExtraInfo = duetExtraInfo;
        this.recordBgmDelay = num2;
        this.selectedFilterResId = str30;
        this.canvasVideoData = canvasVideoData;
        this.lighteningExtraInfo = lighteningExtraInfo;
        this.loudnessParam = loudnessBalanceParam;
        this.shootFrom = str31;
        this.nleDataPath = str32;
        this.saveDraftAppVersion = j2;
        this.isWestWindowExistStr = isWestWindowExistStr;
        this.qaStruct = qaStruct;
        this.tagUserList = arrayList6;
        this.autoAttachedAnchor = anchorTransData;
        this.openplatformExtra = str33;
        this.openplatformClientKey = str34;
        this.audioEnhanceParam = audioEnhanceParam;
        this.editMusicSyncMode = z18;
        this.soundSyncFromAnchor = z19;
        this.cut2EditTransferModel = cut2EditTransferModel;
        this.fileLengthFixed = z20;
        this.sessionId = str35;
        this.lastOutputVideoPath = str36;
        this.isStoryDraft = z21;
        this.fromItemId = str37;
        this.uploadMethod = str38;
        this.uploadTabNameList = list9;
        this.shootPublishDuration = j3;
        this.duetModeType = str39;
        this.applyVoiceToAllTextSwitch = i28;
        this.publishRetainType = str40;
        this.propOrder = i29;
        this.isNowPublish = z22;
        this.hasMultiAudioLoudnessNormalization = z23;
        this.LIZ = new ArrayList<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AVDraftExtras(int r180, int r181, java.lang.String r182, com.ss.android.ugc.aweme.creative.CreativeInfo r183, java.lang.String r184, int r185, java.lang.String r186, boolean r187, boolean r188, int r189, int r190, com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r191, java.lang.String r192, boolean r193, java.lang.String r194, java.lang.String r195, java.lang.String r196, java.lang.String r197, java.lang.String r198, java.lang.String r199, java.lang.String r200, com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel r201, java.lang.String r202, java.lang.String r203, java.lang.String r204, java.lang.String r205, com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam r206, java.lang.String r207, java.lang.String r208, java.lang.String r209, com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel r210, com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel r211, com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r212, int r213, java.util.List r214, boolean r215, int r216, int r217, int r218, com.ss.android.ugc.aweme.shortvideo.model.SocialModel r219, java.lang.String r220, com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r221, int r222, com.ss.android.ugc.aweme.image.model.ImageAlbumData r223, java.lang.String r224, com.ss.android.ugc.aweme.status.StatusCreateVideoData r225, com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData r226, com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct r227, boolean r228, java.lang.String r229, java.lang.String r230, java.lang.String r231, com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam r232, int r233, int r234, int r235, int r236, int r237, com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam r238, java.lang.Integer r239, java.lang.String r240, java.lang.String r241, int r242, java.util.ArrayList r243, com.ss.android.ugc.aweme.infosticker.StickerChallenge r244, com.ss.android.ugc.aweme.textsticker.TextStickerChallenges r245, java.util.Map r246, com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r247, boolean r248, java.lang.String r249, com.ss.android.ugc.aweme.draft.model.DraftPreviewConfigure r250, java.util.List r251, com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r252, java.util.List r253, int r254, int r255, float r256, java.lang.String r257, int r258, boolean r259, boolean r260, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r261, boolean r262, com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData r263, java.lang.String r264, com.ss.android.ugc.aweme.sticker.StickerInfo r265, com.ss.android.ugc.aweme.comment.model.CommentVideoModel r266, java.util.ArrayList r267, boolean r268, boolean r269, int r270, int r271, java.lang.String r272, int r273, com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r274, boolean r275, java.util.ArrayList r276, com.ss.android.ugc.aweme.shortvideo.library.LibraryParams r277, java.util.ArrayList r278, java.util.ArrayList r279, boolean r280, boolean r281, java.lang.String r282, com.ss.android.ugc.aweme.draft.model.CutSameEditData r283, com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel r284, java.util.List r285, java.util.List r286, com.ss.android.ugc.aweme.shoutouts.ShoutOutsData r287, int r288, com.ss.android.ugc.aweme.sharedar.SharedARModel r289, java.util.List r290, boolean r291, boolean r292, boolean r293, int r294, long r295, float r297, java.util.Map r298, java.util.List r299, java.util.List r300, int r301, int r302, int r303, java.lang.String r304, com.ss.android.ugc.aweme.draft.model.DuetExtraInfo r305, java.lang.Integer r306, java.lang.String r307, com.ss.android.ugc.aweme.canvas.CanvasVideoData r308, com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo r309, com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam r310, java.lang.String r311, java.lang.String r312, long r313, java.lang.String r315, com.ss.android.ugc.aweme.sticker.data.QaStruct r316, java.util.ArrayList r317, com.ss.android.ugc.aweme.common.AnchorTransData r318, java.lang.String r319, java.lang.String r320, com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam r321, boolean r322, boolean r323, com.ss.android.ugc.aweme.edit.Cut2EditTransferModel r324, boolean r325, java.lang.String r326, java.lang.String r327, boolean r328, java.lang.String r329, java.lang.String r330, java.util.List r331, long r332, java.lang.String r334, int r335, java.lang.String r336, int r337, boolean r338, boolean r339, int r340, int r341, int r342, int r343, int r344, kotlin.jvm.internal.DefaultConstructorMarker r345) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.AVDraftExtras.<init>(int, int, java.lang.String, com.ss.android.ugc.aweme.creative.CreativeInfo, java.lang.String, int, java.lang.String, boolean, boolean, int, int, com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel, com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel, com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel, int, java.util.List, boolean, int, int, int, com.ss.android.ugc.aweme.shortvideo.model.SocialModel, java.lang.String, com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData, int, com.ss.android.ugc.aweme.image.model.ImageAlbumData, java.lang.String, com.ss.android.ugc.aweme.status.StatusCreateVideoData, com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData, com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct, boolean, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam, int, int, int, int, int, com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam, java.lang.Integer, java.lang.String, java.lang.String, int, java.util.ArrayList, com.ss.android.ugc.aweme.infosticker.StickerChallenge, com.ss.android.ugc.aweme.textsticker.TextStickerChallenges, java.util.Map, com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam, boolean, java.lang.String, com.ss.android.ugc.aweme.draft.model.DraftPreviewConfigure, java.util.List, com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, java.util.List, int, int, float, java.lang.String, int, boolean, boolean, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData, boolean, com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData, java.lang.String, com.ss.android.ugc.aweme.sticker.StickerInfo, com.ss.android.ugc.aweme.comment.model.CommentVideoModel, java.util.ArrayList, boolean, boolean, int, int, java.lang.String, int, com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams, boolean, java.util.ArrayList, com.ss.android.ugc.aweme.shortvideo.library.LibraryParams, java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.lang.String, com.ss.android.ugc.aweme.draft.model.CutSameEditData, com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel, java.util.List, java.util.List, com.ss.android.ugc.aweme.shoutouts.ShoutOutsData, int, com.ss.android.ugc.aweme.sharedar.SharedARModel, java.util.List, boolean, boolean, boolean, int, long, float, java.util.Map, java.util.List, java.util.List, int, int, int, java.lang.String, com.ss.android.ugc.aweme.draft.model.DuetExtraInfo, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.canvas.CanvasVideoData, com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo, com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam, java.lang.String, java.lang.String, long, java.lang.String, com.ss.android.ugc.aweme.sticker.data.QaStruct, java.util.ArrayList, com.ss.android.ugc.aweme.common.AnchorTransData, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam, boolean, boolean, com.ss.android.ugc.aweme.edit.Cut2EditTransferModel, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.List, long, java.lang.String, int, java.lang.String, int, boolean, boolean, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AVDraftExtras() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.draft.model.AVDraftExtras.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVDraftExtras)) {
            return false;
        }
        AVDraftExtras aVDraftExtras = (AVDraftExtras) obj;
        return this.shootMode == aVDraftExtras.shootMode && this.from == aVDraftExtras.from && o.LJ(this.creationId, aVDraftExtras.creationId) && o.LJ(this.creativeInfo, aVDraftExtras.creativeInfo) && o.LJ(this.shootWay, aVDraftExtras.shootWay) && this.draftId == aVDraftExtras.draftId && o.LJ(this.newDraftId, aVDraftExtras.newDraftId) && this.isMultiVideo == aVDraftExtras.isMultiVideo && this.durationMode == aVDraftExtras.durationMode && this.recordMode == aVDraftExtras.recordMode && this.gameScore == aVDraftExtras.gameScore && o.LJ(this.reactionParams, aVDraftExtras.reactionParams) && o.LJ(this.microAppId, aVDraftExtras.microAppId) && this.isMuted == aVDraftExtras.isMuted && o.LJ(this.musicOrigin, aVDraftExtras.musicOrigin) && o.LJ(this.mainBusinessData, aVDraftExtras.mainBusinessData) && o.LJ(this.socialData, aVDraftExtras.socialData) && o.LJ(this.commerceData, aVDraftExtras.commerceData) && o.LJ(this.ugData, aVDraftExtras.ugData) && o.LJ(this.techData, aVDraftExtras.techData) && o.LJ(this.globalData, aVDraftExtras.globalData) && o.LJ(this.extractFramesModel, aVDraftExtras.extractFramesModel) && o.LJ(this.filterId, aVDraftExtras.filterId) && o.LJ(this.recordFilterIds, aVDraftExtras.recordFilterIds) && o.LJ(this.recordFilterNames, aVDraftExtras.recordFilterNames) && o.LJ(this.recordFilterValues, aVDraftExtras.recordFilterValues) && o.LJ(this.recordBeautyMobParam, aVDraftExtras.recordBeautyMobParam) && o.LJ(this.selectedFilterId, aVDraftExtras.selectedFilterId) && o.LJ(this.selectedFilterLabel, aVDraftExtras.selectedFilterLabel) && o.LJ(this.selectedFilterValue, aVDraftExtras.selectedFilterValue) && o.LJ(this.uploadSaveModel, aVDraftExtras.uploadSaveModel) && o.LJ(this.infoStickerModel, aVDraftExtras.infoStickerModel) && o.LJ(this.microAppInfo, aVDraftExtras.microAppInfo) && this.videoType == aVDraftExtras.videoType && o.LJ(this.texts, aVDraftExtras.texts) && this.usePaint == aVDraftExtras.usePaint && this.commentSetting == aVDraftExtras.commentSetting && this.duetSetting == aVDraftExtras.duetSetting && this.stitchSetting == aVDraftExtras.stitchSetting && o.LJ(this.socialModel, aVDraftExtras.socialModel) && o.LJ(this.firstStickerMusicIds, aVDraftExtras.firstStickerMusicIds) && o.LJ(this.mvCreateVideoData, aVDraftExtras.mvCreateVideoData) && this.creationMode == aVDraftExtras.creationMode && o.LJ(this.imageAlbumData, aVDraftExtras.imageAlbumData) && o.LJ(this.heading, aVDraftExtras.heading) && o.LJ(this.statusCreateVideoData, aVDraftExtras.statusCreateVideoData) && o.LJ(this.creativeFlowData, aVDraftExtras.creativeFlowData) && o.LJ(this.avUploadMiscInfoStruct, aVDraftExtras.avUploadMiscInfoStruct) && this.isFastImport == aVDraftExtras.isFastImport && o.LJ(this.fastImportResolution, aVDraftExtras.fastImportResolution) && o.LJ(this.draftVideoPath, aVDraftExtras.draftVideoPath) && o.LJ(this.videoCoverPath, aVDraftExtras.videoCoverPath) && o.LJ(this.draftCherEffectParam, aVDraftExtras.draftCherEffectParam) && this.videoOutWidth == aVDraftExtras.videoOutWidth && this.videoOutHeight == aVDraftExtras.videoOutHeight && this.videoCanvasWidth == aVDraftExtras.videoCanvasWidth && this.videoCanvasHeight == aVDraftExtras.videoCanvasHeight && this.musicEnd == aVDraftExtras.musicEnd && o.LJ(this.draftVEAudioEffectParam, aVDraftExtras.draftVEAudioEffectParam) && o.LJ(this.timeEffectStartPoint, aVDraftExtras.timeEffectStartPoint) && o.LJ(this.filterLocalPath, aVDraftExtras.filterLocalPath) && o.LJ(this.cameraIds, aVDraftExtras.cameraIds) && this.beautyType == aVDraftExtras.beautyType && o.LJ(this.importVideoInfos, aVDraftExtras.importVideoInfos) && o.LJ(this.stickerChallenge, aVDraftExtras.stickerChallenge) && o.LJ(this.textStickerChallenges, aVDraftExtras.textStickerChallenges) && o.LJ(this.videoPartMetadata, aVDraftExtras.videoPartMetadata) && o.LJ(this.audioRecorderParam, aVDraftExtras.audioRecorderParam) && this.isStickPointMode == aVDraftExtras.isStickPointMode && o.LJ(this.uploadPath, aVDraftExtras.uploadPath) && o.LJ(this.previewConfigure, aVDraftExtras.previewConfigure) && o.LJ(this.videoSegmentsCopy, aVDraftExtras.videoSegmentsCopy) && o.LJ(this.previewInfo, aVDraftExtras.previewInfo) && o.LJ(this.previewVideoListCopy, aVDraftExtras.previewVideoListCopy) && this.videoCount == aVDraftExtras.videoCount && this.photoCount == aVDraftExtras.photoCount && Float.compare(this.filterIntensity, aVDraftExtras.filterIntensity) == 0 && o.LJ(this.pic2VideoSource, aVDraftExtras.pic2VideoSource) && this.downloadSetting == aVDraftExtras.downloadSetting && this.useMusicBeforeEdit == aVDraftExtras.useMusicBeforeEdit && this.supportRetake == aVDraftExtras.supportRetake && o.LJ(this.multiEditVideoData, aVDraftExtras.multiEditVideoData) && this.containBackgroundVideo == aVDraftExtras.containBackgroundVideo && o.LJ(this.stickPointData, aVDraftExtras.stickPointData) && o.LJ(this.backgroundVideoDraftDir, aVDraftExtras.backgroundVideoDraftDir) && o.LJ(this.stickerInfo, aVDraftExtras.stickerInfo) && o.LJ(this.commentVideoModel, aVDraftExtras.commentVideoModel) && o.LJ(this.beautyMetadata, aVDraftExtras.beautyMetadata) && this.isUpdateInfoStickers == aVDraftExtras.isUpdateInfoStickers && this.autoEnhanceOn == aVDraftExtras.autoEnhanceOn && this.autoEnhanceType == aVDraftExtras.autoEnhanceType && this.stickPointType == aVDraftExtras.stickPointType && o.LJ(this.duetLayout, aVDraftExtras.duetLayout) && this.duetVideoDuration == aVDraftExtras.duetVideoDuration && o.LJ(this.stitchParams, aVDraftExtras.stitchParams) && this.commerceMusic == aVDraftExtras.commerceMusic && o.LJ(this.greenScreenMaterials, aVDraftExtras.greenScreenMaterials) && o.LJ(this.libraryParams, aVDraftExtras.libraryParams) && o.LJ(this.libraryMaterialList, aVDraftExtras.libraryMaterialList) && o.LJ(this.cameraLensInfo, aVDraftExtras.cameraLensInfo) && this.isPhotoMvMode == aVDraftExtras.isPhotoMvMode && this.isDuetGreenSrceen == aVDraftExtras.isDuetGreenSrceen && o.LJ(this.isSoundLoop, aVDraftExtras.isSoundLoop) && o.LJ(this.cutSameData, aVDraftExtras.cutSameData) && o.LJ(this.coverPublishModel, aVDraftExtras.coverPublishModel) && o.LJ(this.geoFencingData, aVDraftExtras.geoFencingData) && o.LJ(this.excludeUserList, aVDraftExtras.excludeUserList) && o.LJ(this.shoutOutsData, aVDraftExtras.shoutOutsData) && this.allowRecommend == aVDraftExtras.allowRecommend && o.LJ(this.sharedARModel, aVDraftExtras.sharedARModel) && o.LJ(this.messageBubbleTexts, aVDraftExtras.messageBubbleTexts) && this.isPhotoMvMusic == aVDraftExtras.isPhotoMvMusic && this.isPhotoMvMode1080p == aVDraftExtras.isPhotoMvMode1080p && this.isDraftMusicIllegal == aVDraftExtras.isDraftMusicIllegal && this.publishStage == aVDraftExtras.publishStage && this.audioAecDelayTime == aVDraftExtras.audioAecDelayTime && Float.compare(this.currentZoomValue, aVDraftExtras.currentZoomValue) == 0 && o.LJ(this.multiEditVideoSize, aVDraftExtras.multiEditVideoSize) && o.LJ(this.mentionTextList, aVDraftExtras.mentionTextList) && o.LJ(this.hashTagTextList, aVDraftExtras.hashTagTextList) && this.shootedShootMode == aVDraftExtras.shootedShootMode && this.duetFromDuetButton == aVDraftExtras.duetFromDuetButton && this.enableAutoCaption == aVDraftExtras.enableAutoCaption && o.LJ(this.autoCaptionLang, aVDraftExtras.autoCaptionLang) && o.LJ(this.duetExtraInfo, aVDraftExtras.duetExtraInfo) && o.LJ(this.recordBgmDelay, aVDraftExtras.recordBgmDelay) && o.LJ(this.selectedFilterResId, aVDraftExtras.selectedFilterResId) && o.LJ(this.canvasVideoData, aVDraftExtras.canvasVideoData) && o.LJ(this.lighteningExtraInfo, aVDraftExtras.lighteningExtraInfo) && o.LJ(this.loudnessParam, aVDraftExtras.loudnessParam) && o.LJ(this.shootFrom, aVDraftExtras.shootFrom) && o.LJ(this.nleDataPath, aVDraftExtras.nleDataPath) && this.saveDraftAppVersion == aVDraftExtras.saveDraftAppVersion && o.LJ(this.isWestWindowExistStr, aVDraftExtras.isWestWindowExistStr) && o.LJ(this.qaStruct, aVDraftExtras.qaStruct) && o.LJ(this.tagUserList, aVDraftExtras.tagUserList) && o.LJ(this.autoAttachedAnchor, aVDraftExtras.autoAttachedAnchor) && o.LJ(this.openplatformExtra, aVDraftExtras.openplatformExtra) && o.LJ(this.openplatformClientKey, aVDraftExtras.openplatformClientKey) && o.LJ(this.audioEnhanceParam, aVDraftExtras.audioEnhanceParam) && this.editMusicSyncMode == aVDraftExtras.editMusicSyncMode && this.soundSyncFromAnchor == aVDraftExtras.soundSyncFromAnchor && o.LJ(this.cut2EditTransferModel, aVDraftExtras.cut2EditTransferModel) && this.fileLengthFixed == aVDraftExtras.fileLengthFixed && o.LJ(this.sessionId, aVDraftExtras.sessionId) && o.LJ(this.lastOutputVideoPath, aVDraftExtras.lastOutputVideoPath) && this.isStoryDraft == aVDraftExtras.isStoryDraft && o.LJ(this.fromItemId, aVDraftExtras.fromItemId) && o.LJ(this.uploadMethod, aVDraftExtras.uploadMethod) && o.LJ(this.uploadTabNameList, aVDraftExtras.uploadTabNameList) && this.shootPublishDuration == aVDraftExtras.shootPublishDuration && o.LJ(this.duetModeType, aVDraftExtras.duetModeType) && this.applyVoiceToAllTextSwitch == aVDraftExtras.applyVoiceToAllTextSwitch && o.LJ(this.publishRetainType, aVDraftExtras.publishRetainType) && this.propOrder == aVDraftExtras.propOrder && this.isNowPublish == aVDraftExtras.isNowPublish && this.hasMultiAudioLoudnessNormalization == aVDraftExtras.hasMultiAudioLoudnessNormalization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        int hashCode49;
        int hashCode50;
        int hashCode51;
        int hashCode52;
        int hashCode53;
        int hashCode54;
        int hashCode55;
        int hashCode56;
        int hashCode57;
        int hashCode58;
        int hashCode59;
        int hashCode60;
        int hashCode61;
        int hashCode62;
        int hashCode63;
        int hashCode64;
        int hashCode65;
        int hashCode66;
        int hashCode67;
        int hashCode68;
        int hashCode69;
        int hashCode70;
        int hashCode71;
        int hashCode72;
        int hashCode73;
        int hashCode74;
        int hashCode75;
        int hashCode76;
        int hashCode77;
        int hashCode78;
        int hashCode79;
        int hashCode80;
        int hashCode81;
        int hashCode82;
        int hashCode83;
        int hashCode84;
        int hashCode85;
        int hashCode86;
        int hashCode87;
        int hashCode88;
        int hashCode89;
        int hashCode90;
        int hashCode91;
        int hashCode92;
        int hashCode93;
        int hashCode94;
        int hashCode95;
        int i = ((this.shootMode * 31) + this.from) * 31;
        String str = this.creationId;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        CreativeInfo creativeInfo = this.creativeInfo;
        if (creativeInfo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = creativeInfo.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str2 = this.shootWay;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.newDraftId, (((i4 + hashCode3) * 31) + this.draftId) * 31, 31);
        boolean z = this.isMultiVideo;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (LJ + i6) * 31;
        boolean z2 = this.durationMode;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (((((i7 + i8) * 31) + this.recordMode) * 31) + this.gameScore) * 31;
        ReactionParams reactionParams = this.reactionParams;
        if (reactionParams == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = reactionParams.hashCode();
        }
        int i10 = (i9 + hashCode4) * 31;
        String str3 = this.microAppId;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i11 = (i10 + hashCode5) * 31;
        boolean z3 = this.isMuted;
        int i12 = z3;
        if (z3 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        String str4 = this.musicOrigin;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.mainBusinessData;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str6 = this.socialData;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str7 = this.commerceData;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str8 = this.ugData;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str9 = this.techData;
        if (str9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str9.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str10 = this.globalData;
        if (str10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str10.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        ExtractFramesModel extractFramesModel = this.extractFramesModel;
        if (extractFramesModel == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = extractFramesModel.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        String str11 = this.filterId;
        if (str11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str11.hashCode();
        }
        int i22 = (i21 + hashCode14) * 31;
        String str12 = this.recordFilterIds;
        if (str12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str12.hashCode();
        }
        int i23 = (i22 + hashCode15) * 31;
        String str13 = this.recordFilterNames;
        if (str13 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str13.hashCode();
        }
        int i24 = (i23 + hashCode16) * 31;
        String str14 = this.recordFilterValues;
        if (str14 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str14.hashCode();
        }
        int i25 = (i24 + hashCode17) * 31;
        BeautyMobParam beautyMobParam = this.recordBeautyMobParam;
        if (beautyMobParam == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = beautyMobParam.hashCode();
        }
        int i26 = (i25 + hashCode18) * 31;
        String str15 = this.selectedFilterId;
        if (str15 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str15.hashCode();
        }
        int i27 = (i26 + hashCode19) * 31;
        String str16 = this.selectedFilterLabel;
        if (str16 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str16.hashCode();
        }
        int i28 = (i27 + hashCode20) * 31;
        String str17 = this.selectedFilterValue;
        if (str17 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str17.hashCode();
        }
        int i29 = (i28 + hashCode21) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.uploadSaveModel;
        if (aVUploadSaveModel == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = aVUploadSaveModel.hashCode();
        }
        int i30 = (i29 + hashCode22) * 31;
        InfoStickerModel infoStickerModel = this.infoStickerModel;
        if (infoStickerModel == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = infoStickerModel.hashCode();
        }
        int i31 = (i30 + hashCode23) * 31;
        MicroAppModel microAppModel = this.microAppInfo;
        if (microAppModel == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = microAppModel.hashCode();
        }
        int i32 = (((i31 + hashCode24) * 31) + this.videoType) * 31;
        List<String> list = this.texts;
        if (list == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = list.hashCode();
        }
        int i33 = (i32 + hashCode25) * 31;
        boolean z4 = this.usePaint;
        int i34 = z4;
        if (z4 != 0) {
            i34 = 1;
        }
        int i35 = (((((((i33 + i34) * 31) + this.commentSetting) * 31) + this.duetSetting) * 31) + this.stitchSetting) * 31;
        SocialModel socialModel = this.socialModel;
        if (socialModel == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = socialModel.hashCode();
        }
        int i36 = (i35 + hashCode26) * 31;
        String str18 = this.firstStickerMusicIds;
        if (str18 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str18.hashCode();
        }
        int i37 = (i36 + hashCode27) * 31;
        MvCreateVideoData mvCreateVideoData = this.mvCreateVideoData;
        if (mvCreateVideoData == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = mvCreateVideoData.hashCode();
        }
        int i38 = (((i37 + hashCode28) * 31) + this.creationMode) * 31;
        ImageAlbumData imageAlbumData = this.imageAlbumData;
        if (imageAlbumData == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = imageAlbumData.hashCode();
        }
        int i39 = (i38 + hashCode29) * 31;
        String str19 = this.heading;
        if (str19 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str19.hashCode();
        }
        int i40 = (i39 + hashCode30) * 31;
        StatusCreateVideoData statusCreateVideoData = this.statusCreateVideoData;
        if (statusCreateVideoData == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = statusCreateVideoData.hashCode();
        }
        int i41 = (i40 + hashCode31) * 31;
        CreativeFlowData creativeFlowData = this.creativeFlowData;
        if (creativeFlowData == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = creativeFlowData.hashCode();
        }
        int i42 = (i41 + hashCode32) * 31;
        AVUploadMiscInfoStruct aVUploadMiscInfoStruct = this.avUploadMiscInfoStruct;
        if (aVUploadMiscInfoStruct == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = aVUploadMiscInfoStruct.hashCode();
        }
        int i43 = (i42 + hashCode33) * 31;
        boolean z5 = this.isFastImport;
        int i44 = z5;
        if (z5 != 0) {
            i44 = 1;
        }
        int i45 = (i43 + i44) * 31;
        String str20 = this.fastImportResolution;
        if (str20 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = str20.hashCode();
        }
        int i46 = (i45 + hashCode34) * 31;
        String str21 = this.draftVideoPath;
        if (str21 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = str21.hashCode();
        }
        int i47 = (i46 + hashCode35) * 31;
        String str22 = this.videoCoverPath;
        if (str22 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = str22.hashCode();
        }
        int i48 = (i47 + hashCode36) * 31;
        DraftCherEffectParam draftCherEffectParam = this.draftCherEffectParam;
        if (draftCherEffectParam == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = draftCherEffectParam.hashCode();
        }
        int i49 = (((((((((((i48 + hashCode37) * 31) + this.videoOutWidth) * 31) + this.videoOutHeight) * 31) + this.videoCanvasWidth) * 31) + this.videoCanvasHeight) * 31) + this.musicEnd) * 31;
        DraftVEAudioEffectParam draftVEAudioEffectParam = this.draftVEAudioEffectParam;
        if (draftVEAudioEffectParam == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = draftVEAudioEffectParam.hashCode();
        }
        int i50 = (i49 + hashCode38) * 31;
        Integer num = this.timeEffectStartPoint;
        if (num == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = num.hashCode();
        }
        int i51 = (i50 + hashCode39) * 31;
        String str23 = this.filterLocalPath;
        if (str23 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = str23.hashCode();
        }
        int i52 = (i51 + hashCode40) * 31;
        String str24 = this.cameraIds;
        if (str24 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = str24.hashCode();
        }
        int i53 = (((i52 + hashCode41) * 31) + this.beautyType) * 31;
        ArrayList<ImportVideoInfo> arrayList = this.importVideoInfos;
        if (arrayList == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = arrayList.hashCode();
        }
        int i54 = (i53 + hashCode42) * 31;
        StickerChallenge stickerChallenge = this.stickerChallenge;
        if (stickerChallenge == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = stickerChallenge.hashCode();
        }
        int i55 = (i54 + hashCode43) * 31;
        TextStickerChallenges textStickerChallenges = this.textStickerChallenges;
        if (textStickerChallenges == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = textStickerChallenges.hashCode();
        }
        int i56 = (i55 + hashCode44) * 31;
        Map<String, ? extends Object> map = this.videoPartMetadata;
        if (map == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = map.hashCode();
        }
        int i57 = (i56 + hashCode45) * 31;
        AudioRecorderParam audioRecorderParam = this.audioRecorderParam;
        if (audioRecorderParam == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = audioRecorderParam.hashCode();
        }
        int i58 = (i57 + hashCode46) * 31;
        boolean z6 = this.isStickPointMode;
        int i59 = z6;
        if (z6 != 0) {
            i59 = 1;
        }
        int i60 = (i58 + i59) * 31;
        String str25 = this.uploadPath;
        if (str25 == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = str25.hashCode();
        }
        int i61 = (i60 + hashCode47) * 31;
        DraftPreviewConfigure draftPreviewConfigure = this.previewConfigure;
        if (draftPreviewConfigure == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = draftPreviewConfigure.hashCode();
        }
        int i62 = (i61 + hashCode48) * 31;
        List<DraftVideoSegment> list2 = this.videoSegmentsCopy;
        if (list2 == null) {
            hashCode49 = 0;
        } else {
            hashCode49 = list2.hashCode();
        }
        int i63 = (i62 + hashCode49) * 31;
        EditPreviewInfo editPreviewInfo = this.previewInfo;
        if (editPreviewInfo == null) {
            hashCode50 = 0;
        } else {
            hashCode50 = editPreviewInfo.hashCode();
        }
        int i64 = (i63 + hashCode50) * 31;
        List<? extends EditVideoSegment> list3 = this.previewVideoListCopy;
        if (list3 == null) {
            hashCode51 = 0;
        } else {
            hashCode51 = list3.hashCode();
        }
        int LJ2 = (C79062V1e.LJ(this.pic2VideoSource, C47959Irz.LIZIZ(this.filterIntensity, (((((i64 + hashCode51) * 31) + this.videoCount) * 31) + this.photoCount) * 31, 31), 31) + this.downloadSetting) * 31;
        boolean z7 = this.useMusicBeforeEdit;
        int i65 = z7;
        if (z7 != 0) {
            i65 = 1;
        }
        int i66 = (LJ2 + i65) * 31;
        boolean z8 = this.supportRetake;
        int i67 = z8;
        if (z8 != 0) {
            i67 = 1;
        }
        int i68 = (i66 + i67) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.multiEditVideoData;
        if (multiEditVideoStatusRecordData == null) {
            hashCode52 = 0;
        } else {
            hashCode52 = multiEditVideoStatusRecordData.hashCode();
        }
        int i69 = (i68 + hashCode52) * 31;
        boolean z9 = this.containBackgroundVideo;
        int i70 = z9;
        if (z9 != 0) {
            i70 = 1;
        }
        int i71 = (i69 + i70) * 31;
        StickPointData stickPointData = this.stickPointData;
        if (stickPointData == null) {
            hashCode53 = 0;
        } else {
            hashCode53 = stickPointData.hashCode();
        }
        int i72 = (i71 + hashCode53) * 31;
        String str26 = this.backgroundVideoDraftDir;
        if (str26 == null) {
            hashCode54 = 0;
        } else {
            hashCode54 = str26.hashCode();
        }
        int i73 = (i72 + hashCode54) * 31;
        StickerInfo stickerInfo = this.stickerInfo;
        if (stickerInfo == null) {
            hashCode55 = 0;
        } else {
            hashCode55 = stickerInfo.hashCode();
        }
        int i74 = (i73 + hashCode55) * 31;
        CommentVideoModel commentVideoModel = this.commentVideoModel;
        if (commentVideoModel == null) {
            hashCode56 = 0;
        } else {
            hashCode56 = commentVideoModel.hashCode();
        }
        int i75 = (i74 + hashCode56) * 31;
        ArrayList<BeautyMetadata> arrayList2 = this.beautyMetadata;
        if (arrayList2 == null) {
            hashCode57 = 0;
        } else {
            hashCode57 = arrayList2.hashCode();
        }
        int i76 = (i75 + hashCode57) * 31;
        boolean z10 = this.isUpdateInfoStickers;
        int i77 = z10;
        if (z10 != 0) {
            i77 = 1;
        }
        int i78 = (i76 + i77) * 31;
        boolean z11 = this.autoEnhanceOn;
        int i79 = z11;
        if (z11 != 0) {
            i79 = 1;
        }
        int i80 = (((((i78 + i79) * 31) + this.autoEnhanceType) * 31) + this.stickPointType) * 31;
        String str27 = this.duetLayout;
        if (str27 == null) {
            hashCode58 = 0;
        } else {
            hashCode58 = str27.hashCode();
        }
        int i81 = (((i80 + hashCode58) * 31) + this.duetVideoDuration) * 31;
        StitchParams stitchParams = this.stitchParams;
        if (stitchParams == null) {
            hashCode59 = 0;
        } else {
            hashCode59 = stitchParams.hashCode();
        }
        int i82 = (i81 + hashCode59) * 31;
        boolean z12 = this.commerceMusic;
        int i83 = z12;
        if (z12 != 0) {
            i83 = 1;
        }
        int i84 = (i82 + i83) * 31;
        ArrayList<GreenScreenMaterial> arrayList3 = this.greenScreenMaterials;
        if (arrayList3 == null) {
            hashCode60 = 0;
        } else {
            hashCode60 = arrayList3.hashCode();
        }
        int i85 = (i84 + hashCode60) * 31;
        LibraryParams libraryParams = this.libraryParams;
        if (libraryParams == null) {
            hashCode61 = 0;
        } else {
            hashCode61 = libraryParams.hashCode();
        }
        int i86 = (i85 + hashCode61) * 31;
        ArrayList<LibraryMaterialInfoSv> arrayList4 = this.libraryMaterialList;
        if (arrayList4 == null) {
            hashCode62 = 0;
        } else {
            hashCode62 = arrayList4.hashCode();
        }
        int i87 = (i86 + hashCode62) * 31;
        ArrayList<String> arrayList5 = this.cameraLensInfo;
        if (arrayList5 == null) {
            hashCode63 = 0;
        } else {
            hashCode63 = arrayList5.hashCode();
        }
        int i88 = (i87 + hashCode63) * 31;
        boolean z13 = this.isPhotoMvMode;
        int i89 = z13;
        if (z13 != 0) {
            i89 = 1;
        }
        int i90 = (i88 + i89) * 31;
        boolean z14 = this.isDuetGreenSrceen;
        int i91 = z14;
        if (z14 != 0) {
            i91 = 1;
        }
        int i92 = (i90 + i91) * 31;
        String str28 = this.isSoundLoop;
        if (str28 == null) {
            hashCode64 = 0;
        } else {
            hashCode64 = str28.hashCode();
        }
        int i93 = (i92 + hashCode64) * 31;
        CutSameEditData cutSameEditData = this.cutSameData;
        if (cutSameEditData == null) {
            hashCode65 = 0;
        } else {
            hashCode65 = cutSameEditData.hashCode();
        }
        int i94 = (i93 + hashCode65) * 31;
        CoverPublishModel coverPublishModel = this.coverPublishModel;
        if (coverPublishModel == null) {
            hashCode66 = 0;
        } else {
            hashCode66 = coverPublishModel.hashCode();
        }
        int i95 = (i94 + hashCode66) * 31;
        List<String> list4 = this.geoFencingData;
        if (list4 == null) {
            hashCode67 = 0;
        } else {
            hashCode67 = list4.hashCode();
        }
        int i96 = (i95 + hashCode67) * 31;
        List<? extends User> list5 = this.excludeUserList;
        if (list5 == null) {
            hashCode68 = 0;
        } else {
            hashCode68 = list5.hashCode();
        }
        int i97 = (i96 + hashCode68) * 31;
        ShoutOutsData shoutOutsData = this.shoutOutsData;
        if (shoutOutsData == null) {
            hashCode69 = 0;
        } else {
            hashCode69 = shoutOutsData.hashCode();
        }
        int i98 = (((i97 + hashCode69) * 31) + this.allowRecommend) * 31;
        SharedARModel sharedARModel = this.sharedARModel;
        if (sharedARModel == null) {
            hashCode70 = 0;
        } else {
            hashCode70 = sharedARModel.hashCode();
        }
        int i99 = (i98 + hashCode70) * 31;
        List<String> list6 = this.messageBubbleTexts;
        if (list6 == null) {
            hashCode71 = 0;
        } else {
            hashCode71 = list6.hashCode();
        }
        int i100 = (i99 + hashCode71) * 31;
        boolean z15 = this.isPhotoMvMusic;
        int i101 = z15;
        if (z15 != 0) {
            i101 = 1;
        }
        int i102 = (i100 + i101) * 31;
        boolean z16 = this.isPhotoMvMode1080p;
        int i103 = z16;
        if (z16 != 0) {
            i103 = 1;
        }
        int i104 = (i102 + i103) * 31;
        boolean z17 = this.isDraftMusicIllegal;
        int i105 = z17;
        if (z17 != 0) {
            i105 = 1;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.currentZoomValue, JBR.LIZJ(this.audioAecDelayTime, (((i104 + i105) * 31) + this.publishStage) * 31, 31), 31);
        Map<String, Long> map2 = this.multiEditVideoSize;
        if (map2 == null) {
            hashCode72 = 0;
        } else {
            hashCode72 = map2.hashCode();
        }
        int i106 = (LIZIZ + hashCode72) * 31;
        List<String> list7 = this.mentionTextList;
        if (list7 == null) {
            hashCode73 = 0;
        } else {
            hashCode73 = list7.hashCode();
        }
        int i107 = (i106 + hashCode73) * 31;
        List<String> list8 = this.hashTagTextList;
        if (list8 == null) {
            hashCode74 = 0;
        } else {
            hashCode74 = list8.hashCode();
        }
        int i108 = (((((((i107 + hashCode74) * 31) + this.shootedShootMode) * 31) + this.duetFromDuetButton) * 31) + this.enableAutoCaption) * 31;
        String str29 = this.autoCaptionLang;
        if (str29 == null) {
            hashCode75 = 0;
        } else {
            hashCode75 = str29.hashCode();
        }
        int hashCode96 = (this.duetExtraInfo.hashCode() + ((i108 + hashCode75) * 31)) * 31;
        Integer num2 = this.recordBgmDelay;
        if (num2 == null) {
            hashCode76 = 0;
        } else {
            hashCode76 = num2.hashCode();
        }
        int i109 = (hashCode96 + hashCode76) * 31;
        String str30 = this.selectedFilterResId;
        if (str30 == null) {
            hashCode77 = 0;
        } else {
            hashCode77 = str30.hashCode();
        }
        int i110 = (i109 + hashCode77) * 31;
        CanvasVideoData canvasVideoData = this.canvasVideoData;
        if (canvasVideoData == null) {
            hashCode78 = 0;
        } else {
            hashCode78 = canvasVideoData.hashCode();
        }
        int i111 = (i110 + hashCode78) * 31;
        LighteningExtraInfo lighteningExtraInfo = this.lighteningExtraInfo;
        if (lighteningExtraInfo == null) {
            hashCode79 = 0;
        } else {
            hashCode79 = lighteningExtraInfo.hashCode();
        }
        int i112 = (i111 + hashCode79) * 31;
        LoudnessBalanceParam loudnessBalanceParam = this.loudnessParam;
        if (loudnessBalanceParam == null) {
            hashCode80 = 0;
        } else {
            hashCode80 = loudnessBalanceParam.hashCode();
        }
        int i113 = (i112 + hashCode80) * 31;
        String str31 = this.shootFrom;
        if (str31 == null) {
            hashCode81 = 0;
        } else {
            hashCode81 = str31.hashCode();
        }
        int i114 = (i113 + hashCode81) * 31;
        String str32 = this.nleDataPath;
        if (str32 == null) {
            hashCode82 = 0;
        } else {
            hashCode82 = str32.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.isWestWindowExistStr, JBR.LIZJ(this.saveDraftAppVersion, (i114 + hashCode82) * 31, 31), 31);
        QaStruct qaStruct = this.qaStruct;
        if (qaStruct == null) {
            hashCode83 = 0;
        } else {
            hashCode83 = qaStruct.hashCode();
        }
        int i115 = (LJ3 + hashCode83) * 31;
        ArrayList<InteractionTagUserInfo> arrayList6 = this.tagUserList;
        if (arrayList6 == null) {
            hashCode84 = 0;
        } else {
            hashCode84 = arrayList6.hashCode();
        }
        int i116 = (i115 + hashCode84) * 31;
        AnchorTransData anchorTransData = this.autoAttachedAnchor;
        if (anchorTransData == null) {
            hashCode85 = 0;
        } else {
            hashCode85 = anchorTransData.hashCode();
        }
        int i117 = (i116 + hashCode85) * 31;
        String str33 = this.openplatformExtra;
        if (str33 == null) {
            hashCode86 = 0;
        } else {
            hashCode86 = str33.hashCode();
        }
        int i118 = (i117 + hashCode86) * 31;
        String str34 = this.openplatformClientKey;
        if (str34 == null) {
            hashCode87 = 0;
        } else {
            hashCode87 = str34.hashCode();
        }
        int i119 = (i118 + hashCode87) * 31;
        AudioEnhanceParam audioEnhanceParam = this.audioEnhanceParam;
        if (audioEnhanceParam == null) {
            hashCode88 = 0;
        } else {
            hashCode88 = audioEnhanceParam.hashCode();
        }
        int i120 = (i119 + hashCode88) * 31;
        boolean z18 = this.editMusicSyncMode;
        int i121 = z18;
        if (z18 != 0) {
            i121 = 1;
        }
        int i122 = (i120 + i121) * 31;
        boolean z19 = this.soundSyncFromAnchor;
        int i123 = z19;
        if (z19 != 0) {
            i123 = 1;
        }
        int i124 = (i122 + i123) * 31;
        Cut2EditTransferModel cut2EditTransferModel = this.cut2EditTransferModel;
        if (cut2EditTransferModel == null) {
            hashCode89 = 0;
        } else {
            hashCode89 = cut2EditTransferModel.hashCode();
        }
        int i125 = (i124 + hashCode89) * 31;
        boolean z20 = this.fileLengthFixed;
        int i126 = z20;
        if (z20 != 0) {
            i126 = 1;
        }
        int i127 = (i125 + i126) * 31;
        String str35 = this.sessionId;
        if (str35 == null) {
            hashCode90 = 0;
        } else {
            hashCode90 = str35.hashCode();
        }
        int i128 = (i127 + hashCode90) * 31;
        String str36 = this.lastOutputVideoPath;
        if (str36 == null) {
            hashCode91 = 0;
        } else {
            hashCode91 = str36.hashCode();
        }
        int i129 = (i128 + hashCode91) * 31;
        boolean z21 = this.isStoryDraft;
        int i130 = z21;
        if (z21 != 0) {
            i130 = 1;
        }
        int i131 = (i129 + i130) * 31;
        String str37 = this.fromItemId;
        if (str37 == null) {
            hashCode92 = 0;
        } else {
            hashCode92 = str37.hashCode();
        }
        int i132 = (i131 + hashCode92) * 31;
        String str38 = this.uploadMethod;
        if (str38 == null) {
            hashCode93 = 0;
        } else {
            hashCode93 = str38.hashCode();
        }
        int i133 = (i132 + hashCode93) * 31;
        List<String> list9 = this.uploadTabNameList;
        if (list9 == null) {
            hashCode94 = 0;
        } else {
            hashCode94 = list9.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.shootPublishDuration, (i133 + hashCode94) * 31, 31);
        String str39 = this.duetModeType;
        if (str39 == null) {
            hashCode95 = 0;
        } else {
            hashCode95 = str39.hashCode();
        }
        int i134 = (((LIZJ + hashCode95) * 31) + this.applyVoiceToAllTextSwitch) * 31;
        String str40 = this.publishRetainType;
        if (str40 != null) {
            i2 = str40.hashCode();
        }
        int i135 = (((i134 + i2) * 31) + this.propOrder) * 31;
        boolean z22 = this.isNowPublish;
        int i136 = z22;
        if (z22 != 0) {
            i136 = 1;
        }
        int i137 = (i135 + i136) * 31;
        if (!this.hasMultiAudioLoudnessNormalization) {
            i5 = 0;
        }
        return i137 + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AVDraftExtras(shootMode=");
        sb.append(this.shootMode);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", creationId=");
        sb.append(this.creationId);
        sb.append(", creativeInfo=");
        sb.append(this.creativeInfo);
        sb.append(", shootWay=");
        sb.append(this.shootWay);
        sb.append(", draftId=");
        sb.append(this.draftId);
        sb.append(", newDraftId=");
        sb.append(this.newDraftId);
        sb.append(", isMultiVideo=");
        sb.append(this.isMultiVideo);
        sb.append(", durationMode=");
        sb.append(this.durationMode);
        sb.append(", recordMode=");
        sb.append(this.recordMode);
        sb.append(", gameScore=");
        sb.append(this.gameScore);
        sb.append(", reactionParams=");
        sb.append(this.reactionParams);
        sb.append(", microAppId=");
        sb.append(this.microAppId);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", musicOrigin=");
        sb.append(this.musicOrigin);
        sb.append(", mainBusinessData=");
        sb.append(this.mainBusinessData);
        sb.append(", socialData=");
        sb.append(this.socialData);
        sb.append(", commerceData=");
        sb.append(this.commerceData);
        sb.append(", ugData=");
        sb.append(this.ugData);
        sb.append(", techData=");
        sb.append(this.techData);
        sb.append(", globalData=");
        sb.append(this.globalData);
        sb.append(", extractFramesModel=");
        sb.append(this.extractFramesModel);
        sb.append(", filterId=");
        sb.append(this.filterId);
        sb.append(", recordFilterIds=");
        sb.append(this.recordFilterIds);
        sb.append(", recordFilterNames=");
        sb.append(this.recordFilterNames);
        sb.append(", recordFilterValues=");
        sb.append(this.recordFilterValues);
        sb.append(", recordBeautyMobParam=");
        sb.append(this.recordBeautyMobParam);
        sb.append(", selectedFilterId=");
        sb.append(this.selectedFilterId);
        sb.append(", selectedFilterLabel=");
        sb.append(this.selectedFilterLabel);
        sb.append(", selectedFilterValue=");
        sb.append(this.selectedFilterValue);
        sb.append(", uploadSaveModel=");
        sb.append(this.uploadSaveModel);
        sb.append(", infoStickerModel=");
        sb.append(this.infoStickerModel);
        sb.append(", microAppInfo=");
        sb.append(this.microAppInfo);
        sb.append(", videoType=");
        sb.append(this.videoType);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", usePaint=");
        sb.append(this.usePaint);
        sb.append(", commentSetting=");
        sb.append(this.commentSetting);
        sb.append(", duetSetting=");
        sb.append(this.duetSetting);
        sb.append(", stitchSetting=");
        sb.append(this.stitchSetting);
        sb.append(", socialModel=");
        sb.append(this.socialModel);
        sb.append(", firstStickerMusicIds=");
        sb.append(this.firstStickerMusicIds);
        sb.append(", mvCreateVideoData=");
        sb.append(this.mvCreateVideoData);
        sb.append(", creationMode=");
        sb.append(this.creationMode);
        sb.append(", imageAlbumData=");
        sb.append(this.imageAlbumData);
        sb.append(", heading=");
        sb.append(this.heading);
        sb.append(", statusCreateVideoData=");
        sb.append(this.statusCreateVideoData);
        sb.append(", creativeFlowData=");
        sb.append(this.creativeFlowData);
        sb.append(", avUploadMiscInfoStruct=");
        sb.append(this.avUploadMiscInfoStruct);
        sb.append(", isFastImport=");
        sb.append(this.isFastImport);
        sb.append(", fastImportResolution=");
        sb.append(this.fastImportResolution);
        sb.append(", draftVideoPath=");
        sb.append(this.draftVideoPath);
        sb.append(", videoCoverPath=");
        sb.append(this.videoCoverPath);
        sb.append(", draftCherEffectParam=");
        sb.append(this.draftCherEffectParam);
        sb.append(", videoOutWidth=");
        sb.append(this.videoOutWidth);
        sb.append(", videoOutHeight=");
        sb.append(this.videoOutHeight);
        sb.append(", videoCanvasWidth=");
        sb.append(this.videoCanvasWidth);
        sb.append(", videoCanvasHeight=");
        sb.append(this.videoCanvasHeight);
        sb.append(", musicEnd=");
        sb.append(this.musicEnd);
        sb.append(", draftVEAudioEffectParam=");
        sb.append(this.draftVEAudioEffectParam);
        sb.append(", timeEffectStartPoint=");
        sb.append(this.timeEffectStartPoint);
        sb.append(", filterLocalPath=");
        sb.append(this.filterLocalPath);
        sb.append(", cameraIds=");
        sb.append(this.cameraIds);
        sb.append(", beautyType=");
        sb.append(this.beautyType);
        sb.append(", importVideoInfos=");
        sb.append(this.importVideoInfos);
        sb.append(", stickerChallenge=");
        sb.append(this.stickerChallenge);
        sb.append(", textStickerChallenges=");
        sb.append(this.textStickerChallenges);
        sb.append(", videoPartMetadata=");
        sb.append(this.videoPartMetadata);
        sb.append(", audioRecorderParam=");
        sb.append(this.audioRecorderParam);
        sb.append(", isStickPointMode=");
        sb.append(this.isStickPointMode);
        sb.append(", uploadPath=");
        sb.append(this.uploadPath);
        sb.append(", previewConfigure=");
        sb.append(this.previewConfigure);
        sb.append(", videoSegmentsCopy=");
        sb.append(this.videoSegmentsCopy);
        sb.append(", previewInfo=");
        sb.append(this.previewInfo);
        sb.append(", previewVideoListCopy=");
        sb.append(this.previewVideoListCopy);
        sb.append(", videoCount=");
        sb.append(this.videoCount);
        sb.append(", photoCount=");
        sb.append(this.photoCount);
        sb.append(", filterIntensity=");
        sb.append(this.filterIntensity);
        sb.append(", pic2VideoSource=");
        sb.append(this.pic2VideoSource);
        sb.append(", downloadSetting=");
        sb.append(this.downloadSetting);
        sb.append(", useMusicBeforeEdit=");
        sb.append(this.useMusicBeforeEdit);
        sb.append(", supportRetake=");
        sb.append(this.supportRetake);
        sb.append(", multiEditVideoData=");
        sb.append(this.multiEditVideoData);
        sb.append(", containBackgroundVideo=");
        sb.append(this.containBackgroundVideo);
        sb.append(", stickPointData=");
        sb.append(this.stickPointData);
        sb.append(", backgroundVideoDraftDir=");
        sb.append(this.backgroundVideoDraftDir);
        sb.append(", stickerInfo=");
        sb.append(this.stickerInfo);
        sb.append(", commentVideoModel=");
        sb.append(this.commentVideoModel);
        sb.append(", beautyMetadata=");
        sb.append(this.beautyMetadata);
        sb.append(", isUpdateInfoStickers=");
        sb.append(this.isUpdateInfoStickers);
        sb.append(", autoEnhanceOn=");
        sb.append(this.autoEnhanceOn);
        sb.append(", autoEnhanceType=");
        sb.append(this.autoEnhanceType);
        sb.append(", stickPointType=");
        sb.append(this.stickPointType);
        sb.append(", duetLayout=");
        sb.append(this.duetLayout);
        sb.append(", duetVideoDuration=");
        sb.append(this.duetVideoDuration);
        sb.append(", stitchParams=");
        sb.append(this.stitchParams);
        sb.append(", commerceMusic=");
        sb.append(this.commerceMusic);
        sb.append(", greenScreenMaterials=");
        sb.append(this.greenScreenMaterials);
        sb.append(", libraryParams=");
        sb.append(this.libraryParams);
        sb.append(", libraryMaterialList=");
        sb.append(this.libraryMaterialList);
        sb.append(", cameraLensInfo=");
        sb.append(this.cameraLensInfo);
        sb.append(", isPhotoMvMode=");
        sb.append(this.isPhotoMvMode);
        sb.append(", isDuetGreenSrceen=");
        sb.append(this.isDuetGreenSrceen);
        sb.append(", isSoundLoop=");
        sb.append(this.isSoundLoop);
        sb.append(", cutSameData=");
        sb.append(this.cutSameData);
        sb.append(", coverPublishModel=");
        sb.append(this.coverPublishModel);
        sb.append(", geoFencingData=");
        sb.append(this.geoFencingData);
        sb.append(", excludeUserList=");
        sb.append(this.excludeUserList);
        sb.append(", shoutOutsData=");
        sb.append(this.shoutOutsData);
        sb.append(", allowRecommend=");
        sb.append(this.allowRecommend);
        sb.append(", sharedARModel=");
        sb.append(this.sharedARModel);
        sb.append(", messageBubbleTexts=");
        sb.append(this.messageBubbleTexts);
        sb.append(", isPhotoMvMusic=");
        sb.append(this.isPhotoMvMusic);
        sb.append(", isPhotoMvMode1080p=");
        sb.append(this.isPhotoMvMode1080p);
        sb.append(", isDraftMusicIllegal=");
        sb.append(this.isDraftMusicIllegal);
        sb.append(", publishStage=");
        sb.append(this.publishStage);
        sb.append(", audioAecDelayTime=");
        sb.append(this.audioAecDelayTime);
        sb.append(", currentZoomValue=");
        sb.append(this.currentZoomValue);
        sb.append(", multiEditVideoSize=");
        sb.append(this.multiEditVideoSize);
        sb.append(", mentionTextList=");
        sb.append(this.mentionTextList);
        sb.append(", hashTagTextList=");
        sb.append(this.hashTagTextList);
        sb.append(", shootedShootMode=");
        sb.append(this.shootedShootMode);
        sb.append(", duetFromDuetButton=");
        sb.append(this.duetFromDuetButton);
        sb.append(", enableAutoCaption=");
        sb.append(this.enableAutoCaption);
        sb.append(", autoCaptionLang=");
        sb.append(this.autoCaptionLang);
        sb.append(", duetExtraInfo=");
        sb.append(this.duetExtraInfo);
        sb.append(", recordBgmDelay=");
        sb.append(this.recordBgmDelay);
        sb.append(", selectedFilterResId=");
        sb.append(this.selectedFilterResId);
        sb.append(", canvasVideoData=");
        sb.append(this.canvasVideoData);
        sb.append(", lighteningExtraInfo=");
        sb.append(this.lighteningExtraInfo);
        sb.append(", loudnessParam=");
        sb.append(this.loudnessParam);
        sb.append(", shootFrom=");
        sb.append(this.shootFrom);
        sb.append(", nleDataPath=");
        sb.append(this.nleDataPath);
        sb.append(", saveDraftAppVersion=");
        sb.append(this.saveDraftAppVersion);
        sb.append(", isWestWindowExistStr=");
        sb.append(this.isWestWindowExistStr);
        sb.append(", qaStruct=");
        sb.append(this.qaStruct);
        sb.append(", tagUserList=");
        sb.append(this.tagUserList);
        sb.append(", autoAttachedAnchor=");
        sb.append(this.autoAttachedAnchor);
        sb.append(", openplatformExtra=");
        sb.append(this.openplatformExtra);
        sb.append(", openplatformClientKey=");
        sb.append(this.openplatformClientKey);
        sb.append(", audioEnhanceParam=");
        sb.append(this.audioEnhanceParam);
        sb.append(", editMusicSyncMode=");
        sb.append(this.editMusicSyncMode);
        sb.append(", soundSyncFromAnchor=");
        sb.append(this.soundSyncFromAnchor);
        sb.append(", cut2EditTransferModel=");
        sb.append(this.cut2EditTransferModel);
        sb.append(", fileLengthFixed=");
        sb.append(this.fileLengthFixed);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", lastOutputVideoPath=");
        sb.append(this.lastOutputVideoPath);
        sb.append(", isStoryDraft=");
        sb.append(this.isStoryDraft);
        sb.append(", fromItemId=");
        sb.append(this.fromItemId);
        sb.append(", uploadMethod=");
        sb.append(this.uploadMethod);
        sb.append(", uploadTabNameList=");
        sb.append(this.uploadTabNameList);
        sb.append(", shootPublishDuration=");
        sb.append(this.shootPublishDuration);
        sb.append(", duetModeType=");
        sb.append(this.duetModeType);
        sb.append(", applyVoiceToAllTextSwitch=");
        sb.append(this.applyVoiceToAllTextSwitch);
        sb.append(", publishRetainType=");
        sb.append(this.publishRetainType);
        sb.append(", propOrder=");
        sb.append(this.propOrder);
        sb.append(", isNowPublish=");
        sb.append(this.isNowPublish);
        sb.append(", hasMultiAudioLoudnessNormalization=");
        return C08880Wm.LIZJ(sb, this.hasMultiAudioLoudnessNormalization, ')');
    }
}
