package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.model.CollectionInfoParcelableForShoot;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.services.SDKServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.ugc.aweme.services.external.ui.CommentVideoConfig;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.EffectConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.LiveParams;
import com.ss.android.ugc.aweme.services.external.ui.MiniAppConfig;
import com.ss.android.ugc.aweme.services.external.ui.QaStructConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.IBinderWrapper;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.util.performance.SoundSyncOpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS2S0410000_7;
import kotlin.jvm.internal.AqS67S0400000_7;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class HPU implements IRecordService {
    public final C41658GWo LIZ;
    public final SDKServiceImpl LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final boolean isBroadcastSmoothGoLive() {
        C44172HVg.LJIILLIIL.getClass();
        return LiveOuterService.LJJJLL().isBroadcastSmoothGoLive();
    }

    public HPU() {
        C41658GWo LIZLLL = C41658GWo.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "inst()");
        this.LIZ = LIZLLL;
        ((HLQ) HLQ.LIZIZ.getValue()).avsettingsConfig();
        this.LIZIZ = new SDKServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final boolean isVideoRecordNewActivityInStack() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        boolean z = false;
        if (activityStack != null && activityStack.length > 0) {
            z = false;
            for (Activity activity : activityStack) {
                if (HK4.LIZ(activity) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static Intent LIZ(RecordConfig config) {
        java.util.Set<Map.Entry<String, String>> entrySet;
        java.util.Set<Map.Entry<String, String>> entrySet2;
        o.LJIIIZ(config, "config");
        Intent intent = new Intent();
        intent.putExtra("net_unavailable_music", config.getNetworkUnavailableMusic());
        intent.putExtra("need_load_later", config.getNeedLoadResourceAfterRecord());
        intent.putExtra("do_not_load_music", config.getDoNotLoadMusic());
        MusicModel musicModel = config.getMusicModel();
        if (musicModel != null) {
            intent.putExtra("music_model", musicModel);
        }
        Boolean isInterceptBackground = config.isInterceptBackground();
        if (isInterceptBackground != null) {
            intent.putExtra("intercept_background", isInterceptBackground.booleanValue());
        }
        String shootway = config.getShootway();
        if (shootway != null) {
            intent.putExtra("shoot_way", shootway);
        }
        Long maxDuration = config.getMaxDuration();
        if (maxDuration != null) {
            intent.putExtra("extra_max_shoot_duration", maxDuration.longValue());
        }
        Integer musicStart = config.getMusicStart();
        if (musicStart != null) {
            intent.putExtra("music_start", musicStart.intValue());
        }
        Integer musicEnd = config.getMusicEnd();
        if (musicEnd != null) {
            intent.putExtra("music_end", musicEnd.intValue());
        }
        String shootFrom = config.getShootFrom();
        if (shootFrom != null) {
            intent.putExtra("shoot_from", shootFrom);
        }
        String enterFrom = config.getEnterFrom();
        if (enterFrom != null) {
            intent.putExtra("enter_from", enterFrom);
        }
        String enterMethod = config.getEnterMethod();
        if (enterMethod != null) {
            intent.putExtra("enter_method", enterMethod);
        }
        AddYourRecordParam addYourRecordParam = config.getAddYourRecordParam();
        if (addYourRecordParam != null) {
            intent.putExtra("add_yours_sticker_record_param", (Parcelable) addYourRecordParam);
        }
        String creationId = config.getCreationId();
        if (creationId == null) {
            creationId = C44384HbQ.LJJJJIZL();
        }
        Serializable serializable = null;
        C77412UZs.LJJIJL(intent, creationId, 0, null);
        String shoutoutMode = config.getShoutoutMode();
        if (shoutoutMode != null) {
            intent.putExtra("shoutouts_mode", shoutoutMode);
        }
        String shoutoutOrderID = config.getShoutoutOrderID();
        if (shoutoutOrderID != null) {
            intent.putExtra("shout_out_order_id", shoutoutOrderID);
        }
        intent.putExtra("restore", config.getRestoreType());
        String musicOrigin = config.getMusicOrigin();
        if (musicOrigin != null) {
            intent.putExtra("music_origin", musicOrigin);
        }
        intent.putExtra("need_refresh_filter_data", config.getPrepareFilter());
        OSZ<String, String> mentionUser = config.getMentionUser();
        if (mentionUser != null) {
            intent.putExtra("extra_mention_uid", mentionUser.getFirst());
            intent.putExtra("extra_mention_user_name", mentionUser.getSecond());
        }
        String previousPage = config.getPreviousPage();
        if (previousPage != null) {
            intent.putExtra("extra_previous_page", previousPage);
        }
        String commerceData = config.getCommerceData();
        if (commerceData != null) {
            intent.putExtra("commerce_data_in_tools_line", commerceData);
        }
        Integer tabs = config.getTabs();
        if (tabs != null) {
            intent.putExtra("tabs", tabs.intValue());
        }
        String sticker = config.getSticker();
        if (sticker != null) {
            intent.putExtra("sticker_id", sticker);
        }
        Boolean showCancelAfterPinProp = config.getShowCancelAfterPinProp();
        if (showCancelAfterPinProp != null) {
            intent.putExtra("show_cancel_after_pin_prop", showCancelAfterPinProp.booleanValue());
        }
        String isFilterBusniessSticker = config.isFilterBusniessSticker();
        if (isFilterBusniessSticker != null) {
            intent.putExtra("filter_business_sticker", isFilterBusniessSticker);
        }
        Long videoDownloadDuration = config.getVideoDownloadDuration();
        if (videoDownloadDuration != null) {
            intent.putExtra("video_download_duration", videoDownloadDuration.longValue());
        }
        Long effectDownloadDuration = config.getEffectDownloadDuration();
        if (effectDownloadDuration != null) {
            intent.putExtra("effect_download_duration", effectDownloadDuration.longValue());
        }
        Long musicDownloadDuration = config.getMusicDownloadDuration();
        if (musicDownloadDuration != null) {
            intent.putExtra("music_download_duration", musicDownloadDuration.longValue());
        }
        Long startRecordTime = config.getStartRecordTime();
        if (startRecordTime != null) {
            intent.putExtra("extra_start_record_time", startRecordTime.longValue());
        }
        String voiceEffectId = config.getVoiceEffectId();
        if (voiceEffectId != null) {
            intent.putExtra("voice_effect_id", voiceEffectId);
        }
        String voiceEffectName = config.getVoiceEffectName();
        if (voiceEffectName != null) {
            intent.putExtra("voice_effect_name", voiceEffectName);
        }
        String vcVoiceEffectId = config.getVcVoiceEffectId();
        if (vcVoiceEffectId != null) {
            intent.putExtra("voice_conversion_effect_id", vcVoiceEffectId);
        }
        String vcVoiceEffectName = config.getVcVoiceEffectName();
        if (vcVoiceEffectName != null) {
            intent.putExtra("voice_conversion_effect_name", vcVoiceEffectName);
        }
        ArrayList<String> ttsVoiceIDs = config.getTtsVoiceIDs();
        if (ttsVoiceIDs != null) {
            intent.putStringArrayListExtra("tts_voice_ids", ttsVoiceIDs);
        }
        ArrayList<String> ttsVoiceRefIDs = config.getTtsVoiceRefIDs();
        if (ttsVoiceRefIDs != null) {
            intent.putStringArrayListExtra("tts_voice_ref_ids", ttsVoiceRefIDs);
        }
        ArrayList<String> vcVoiceIDs = config.getVcVoiceIDs();
        if (vcVoiceIDs != null) {
            intent.putStringArrayListExtra("vc_voice_ids", vcVoiceIDs);
        }
        ArrayList<String> vcVoiceRefIDs = config.getVcVoiceRefIDs();
        if (vcVoiceRefIDs != null) {
            intent.putStringArrayListExtra("vc_voice_ref_ids", vcVoiceRefIDs);
        }
        Long decompressTime = config.getDecompressTime();
        if (decompressTime != null) {
            intent.putExtra("extra_decompress_time", decompressTime.longValue());
        }
        Boolean presetSticker = config.getPresetSticker();
        if (presetSticker != null) {
            intent.putExtra("use_preset_sticker_at_first", presetSticker.booleanValue());
        }
        Integer translationType = config.getTranslationType();
        if (translationType != null) {
            intent.putExtra("translation_type", translationType.intValue());
        }
        Boolean permissionActivityRequired = config.getPermissionActivityRequired();
        if (permissionActivityRequired != null) {
            intent.putExtra("extra_need_permission_activity", permissionActivityRequired.booleanValue());
        }
        if (o.LJ(config.getFromMain(), Boolean.TRUE)) {
            intent.putExtra("from", "main");
        }
        Boolean fromSystem = config.getFromSystem();
        if (fromSystem != null) {
            intent.putExtra("enter_record_directly_from_system", fromSystem.booleanValue());
        }
        Boolean fromOtherPlatform = config.getFromOtherPlatform();
        if (fromOtherPlatform != null) {
            intent.putExtra("enter_record_from_other_platform", fromOtherPlatform.booleanValue());
        }
        Boolean autoStartRecording = config.getAutoStartRecording();
        if (autoStartRecording != null) {
            intent.putExtra("auto_start_recording", autoStartRecording.booleanValue());
        }
        Integer cameraFacing = config.getCameraFacing();
        if (cameraFacing != null) {
            intent.putExtra("extra_camera_facing", cameraFacing.intValue());
        }
        ArrayList<String> stickers = config.getStickers();
        if (stickers != null) {
            intent.putStringArrayListExtra("reuse_sticker_ids", stickers);
        }
        String giphyGifIds = config.getGiphyGifIds();
        if (giphyGifIds != null) {
            intent.putExtra("reuse_giphy_gifs", giphyGifIds);
        }
        ShootExtraData shootExtraData = config.getShootExtraData();
        if (shootExtraData != null) {
            intent.putExtra("extra_shoot_data", (Parcelable) shootExtraData);
        }
        SearchCreationExtraData searchExtraData = config.getSearchExtraData();
        if (searchExtraData != null) {
            intent.putExtra("extra_search_creation_data", (Parcelable) searchExtraData);
        }
        CreativeDurationExtra creativeDurationExtra = config.getCreativeDurationExtra();
        if (creativeDurationExtra != null) {
            intent.putExtra("extra_creative_duration", (Parcelable) creativeDurationExtra);
        }
        String musicPath = config.getMusicPath();
        if (musicPath != null) {
            intent.putExtra("path", musicPath);
        }
        String musicSticker = config.getMusicSticker();
        if (musicSticker != null) {
            intent.putExtra("music_reuse_sticker_id", musicSticker);
        }
        String stickerWithMusicFilePath = config.getStickerWithMusicFilePath();
        if (stickerWithMusicFilePath != null) {
            intent.putExtra("sticker_with_music_file_path", stickerWithMusicFilePath);
        }
        Effect musicWithStickerEffect = config.getMusicWithStickerEffect();
        if (musicWithStickerEffect != null) {
            intent.putExtra("music_with_sticker_effect", (Parcelable) musicWithStickerEffect);
        }
        Music stickerMusic = config.getStickerMusic();
        if (stickerMusic != null) {
            intent.putExtra("sticker_music", stickerMusic);
        }
        String musicId = config.getMusicId();
        if (musicId != null) {
            intent.putExtra("music_id", musicId);
        }
        ReuseSoundAndEffectModel reuseSoundAndEffectModel = config.getReuseSoundAndEffectModel();
        if (reuseSoundAndEffectModel != null) {
            intent.putExtra("reuse_sound_and_effect_model", (Parcelable) reuseSoundAndEffectModel);
        }
        String shareId = config.getShareId();
        if (shareId != null) {
            intent.putExtra("share_id", shareId);
        }
        String clientId = config.getClientId();
        if (clientId != null) {
            intent.putExtra("channel", clientId);
        }
        String challengeId = config.getChallengeId();
        if (challengeId != null) {
            intent.putExtra("challenge_id", challengeId);
        }
        String autoUseMusic = config.getAutoUseMusic();
        if (autoUseMusic != null) {
            intent.putExtra("direct_use_sticker_music", autoUseMusic);
        }
        String autoUseSticker = config.getAutoUseSticker();
        if (autoUseSticker != null) {
            intent.putExtra("first_face_sticker", autoUseSticker);
        }
        Boolean showPreloadingDialog = config.getShowPreloadingDialog();
        if (showPreloadingDialog != null) {
            intent.putExtra("show_preloading_dialog", showPreloadingDialog.booleanValue());
        }
        intent.putExtra("msg_preloading_dialog", config.getPreloadStringResource());
        Boolean isFormFlipShootIcon = config.isFormFlipShootIcon();
        if (isFormFlipShootIcon != null) {
            intent.putExtra("enter_form_flip_shoot_icon", isFormFlipShootIcon.booleanValue());
        }
        intent.putExtra("enter_record_from_feed", config.getRecordFromFeed());
        intent.putExtra("extra_landing_back", config.getLandingBack());
        String backUrl = config.getBackUrl();
        if (backUrl != null) {
            intent.putExtra("extra_back_url", backUrl);
        }
        intent.putExtra("extra_include_draft", config.getLandingIncludeDraft());
        Effect mvSticker = config.getMvSticker();
        if (mvSticker != null) {
            intent.putExtra("reuse_mvtheme_enter", true);
            intent.putExtra("extra_bind_mv_id", mvSticker.getEffectId());
            intent.putExtra("extra_mv_effect", (Parcelable) mvSticker);
        }
        String mvStickerId = config.getMvStickerId();
        if (mvStickerId != null) {
            intent.putExtra("extra_bind_mv_id", mvStickerId);
        }
        CollectionInfoParcelableForShoot seriesCollectionInfo = config.getSeriesCollectionInfo();
        if (seriesCollectionInfo != null) {
            intent.putExtra("series_creation_info", (Parcelable) seriesCollectionInfo);
        }
        MiniAppConfig miniAppConfig = config.getMiniAppConfig();
        if (miniAppConfig != null) {
            intent.putExtra("sticker_id", miniAppConfig.getStickerId());
            intent.putExtra("micro_app_info", miniAppConfig.getAppInfo());
            intent.putExtra("micro_app_class", miniAppConfig.getAppClass());
        }
        CommentVideoConfig commentVideoConfig = config.getCommentVideoConfig();
        if (commentVideoConfig != null) {
            intent.putExtra("comment_video_model", commentVideoConfig.getCommentVideoModel());
        }
        QaStructConfig qaStructConfig = config.getQaStructConfig();
        if (qaStructConfig != null) {
            intent.putExtra("question_answer_video_model", qaStructConfig.getQaStruct());
        }
        LibraryMaterialInfoSv libraryMaterialInfo = config.getLibraryMaterialInfo();
        if (libraryMaterialInfo != null) {
            intent.putExtra("library_video_model", (Serializable) libraryMaterialInfo);
        }
        intent.putExtra("is_through_anchor", config.isThroughAnchor());
        Effect firstSticker = config.getFirstSticker();
        if (firstSticker != null) {
            intent.putExtra("first_sticker", (Parcelable) firstSticker);
        }
        String unpublishedEffect = config.getUnpublishedEffect();
        if (unpublishedEffect != null) {
            intent.putExtra("unpublished_sticker_id", unpublishedEffect);
        }
        String savedDraft = config.getSavedDraft();
        if (savedDraft != null) {
            intent.putExtra("saved_draft_id", savedDraft);
        }
        RecordPresetResource recordPresetResource = config.getRecordPresetResource();
        if (recordPresetResource != null) {
            intent.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
        }
        java.util.Map<String, String> extraParams = config.getExtraParams();
        if (extraParams != null) {
            intent.putExtra("extra_sticker_from", extraParams.get(WM7.SCENE_SERVICE));
            intent.putExtra("grade_key", extraParams.get("grade_key"));
        }
        String editEffectUID = config.getEditEffectUID();
        if (editEffectUID != null) {
            intent.putExtra("extra_edit_effect_uid", editEffectUID);
        }
        String donationId = config.getDonationId();
        if (donationId != null) {
            intent.putExtra("donation_id", donationId);
        }
        Integer defaultTab = config.getDefaultTab();
        if (defaultTab != null) {
            if (defaultTab.intValue() == 1) {
                intent.putExtra("extra_to_status", true);
            } else if (defaultTab.intValue() == 2) {
                intent.putExtra("to_live", true);
            } else if (defaultTab.intValue() == 3) {
                intent.putExtra("to_upload_album", true);
            }
        }
        Integer defaultSubTabForUploadPage = config.getDefaultSubTabForUploadPage();
        if (defaultSubTabForUploadPage != null) {
            if (defaultSubTabForUploadPage.intValue() == 0) {
                intent.putExtra("key_default_landing_tab", EnumC44013HPd.ALL.getType());
            } else if (defaultSubTabForUploadPage.intValue() == 1) {
                intent.putExtra("key_default_landing_tab", EnumC44013HPd.VIDEO.getType());
            } else if (defaultSubTabForUploadPage.intValue() == 2) {
                intent.putExtra("key_default_landing_tab", EnumC44013HPd.PHOTO.getType());
            }
        }
        intent.putExtra("Key_enable_multi_select", config.getUploadPageMultiSelect());
        LiveParams liveParams = config.getLiveParams();
        if (liveParams != null) {
            String sourceParams = liveParams.getSourceParams();
            if (sourceParams != null) {
                intent.putExtra("extra_live_source_params", sourceParams);
            }
            Boolean onlyShowLiveTab = liveParams.getOnlyShowLiveTab();
            if (onlyShowLiveTab != null) {
                intent.putExtra("extra_only_show_live_tab", onlyShowLiveTab.booleanValue());
            }
        }
        if (config.getShowStickerPanel()) {
            intent.putExtra("sticker_pannel_show", true);
        }
        HashMap<String, String> starAtlasConfig = config.getStarAtlasConfig();
        if (starAtlasConfig != null && (entrySet2 = starAtlasConfig.entrySet()) != null) {
            for (Map.Entry<String, String> entry : entrySet2) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
        }
        HashMap<String, String> missionConfig = config.getMissionConfig();
        if (missionConfig != null && (entrySet = missionConfig.entrySet()) != null) {
            for (Map.Entry<String, String> entry2 : entrySet) {
                intent.putExtra(entry2.getKey(), entry2.getValue());
            }
        }
        EffectConfig effectConfig = config.getEffectConfig();
        if (effectConfig != null) {
            intent.putExtra("effect_meta_info", effectConfig.getEffectMetaInfo());
            intent.putExtra("effect_image", effectConfig.getEffectImage());
        }
        StitchParams stitchParams = config.getStitchParams();
        if (stitchParams != null) {
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
        }
        Boolean fromSpecialPlus = config.getFromSpecialPlus();
        if (fromSpecialPlus != null) {
            intent.putExtra("from_special_plus", fromSpecialPlus.booleanValue());
        }
        Integer videoLength = config.getVideoLength();
        if (videoLength != null) {
            intent.putExtra("extra_video_length", videoLength.intValue());
        }
        Integer duetVideoDuration = config.getDuetVideoDuration();
        if (duetVideoDuration != null) {
            intent.putExtra("duet_video_duration", duetVideoDuration.intValue());
        }
        String sharedARSessionId = config.getSharedARSessionId();
        if (sharedARSessionId != null) {
            intent.putExtra("session", sharedARSessionId);
        }
        String sharedARHostId = config.getSharedARHostId();
        if (sharedARHostId != null) {
            intent.putExtra("host_uid", sharedARHostId);
        }
        Effect ttepPreviewEffect = config.getTtepPreviewEffect();
        if (ttepPreviewEffect != null) {
            intent.putExtra("extra_ttep_preview_effect", (Parcelable) ttepPreviewEffect);
        }
        intent.putExtra("extra_ttep_enter_preview_page", config.getEnterTTEPPage());
        intent.putExtra("auto_selected_anchor", config.getAutoSelectedAnchor());
        List<AnchorTransData> autoSelectedAnchorList = config.getAutoSelectedAnchorList();
        if (autoSelectedAnchorList != null) {
            if (autoSelectedAnchorList instanceof Serializable) {
                serializable = (Serializable) autoSelectedAnchorList;
            }
            intent.putExtra("auto_selected_anchors", serializable);
        }
        intent.putExtra("open_platform_extra", config.getOpenPlatformExtra());
        intent.putExtra("open_platform_client_key", config.getOpenPlatformClientKey());
        HashMap<String, String> extraLogParams = config.getExtraLogParams();
        if (extraLogParams != null) {
            intent.putExtra("extra_log_params", extraLogParams);
        }
        String duetModeType = config.getDuetModeType();
        if (duetModeType != null) {
            intent.putExtra("duet_mode_type", duetModeType);
        }
        OPSDK$GreenScreenKitConfig greenScreenKitConfig = config.getGreenScreenKitConfig();
        if (greenScreenKitConfig != null) {
            intent.putExtra("green_screen_kit_config", greenScreenKitConfig);
        }
        RecordPresetResource greenScreenKitPresetResource = config.getGreenScreenKitPresetResource();
        if (greenScreenKitPresetResource != null) {
            intent.putExtra("green_screen_kit_preset_source", (Parcelable) greenScreenKitPresetResource);
        }
        intent.putExtra("extra_event_params", config.getExtraEventParams());
        ShareKitPanel shareKitPanel = config.getShareKitPanel();
        if (shareKitPanel != null) {
            intent.putExtra("share_kit_panel", (Parcelable) shareKitPanel);
        }
        BaseShareContext shareModel = config.getShareModel();
        if (shareModel != null) {
            intent.putExtra("share_model", shareModel);
        }
        String qaOrigin = config.getQaOrigin();
        if (qaOrigin != null) {
            intent.putExtra("extra_qa_origin", qaOrigin);
        }
        String qaOriginGroupId = config.getQaOriginGroupId();
        if (qaOriginGroupId != null) {
            intent.putExtra("extra_qa_origin_group_id", qaOriginGroupId);
        }
        String questionCategory = config.getQuestionCategory();
        if (questionCategory != null) {
            intent.putExtra("question_category", questionCategory);
        }
        CreativeInitialModel initialModel = config.getInitialModel();
        if (initialModel != null) {
            intent.putExtra("creative_initial_model", initialModel);
        }
        String postTrendsId = config.getPostTrendsId();
        if (postTrendsId != null) {
            intent.putExtra("post_trends_id", postTrendsId);
        }
        String postTrendsType = config.getPostTrendsType();
        if (postTrendsType != null) {
            intent.putExtra("post_trends_type", postTrendsType);
        }
        String recordParam = config.getRecordParam();
        if (recordParam != null) {
            intent.putExtra("record_param", recordParam);
        }
        intent.putExtra("ugc_template_tag", config.getUgcTemplateTag());
        intent.putExtra("need_mob_shoot", config.getNeedMobShoot());
        intent.putExtra("music_download_complete", config.getMusicDownloadComplete());
        intent.putExtra("extra_need_add_recent", config.getNeedAddRecentMusic());
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final Intent getRecordBasicIntent(RecordConfig recordConfig) {
        o.LJIIIZ(recordConfig, "recordConfig");
        return LIZ(recordConfig);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void enterRecordPageInTemplate(Context context, RecordConfig recordConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        recordConfig.setFromSpecialPlus(Boolean.TRUE);
        recordConfig.setEnterFrom("super_entrance");
        Intent LIZ = LIZ(recordConfig);
        Effect LIZIZ = new C36478ETi().LIZIZ();
        if (LIZIZ != null) {
            LIZ.putExtra("reuse_mvtheme_enter", true);
            LIZ.putExtra("extra_bind_mv_id", LIZIZ.getEffectId());
            LIZ.putExtra("extra_mv_effect", (Parcelable) LIZIZ);
        }
        I9T.LJFF(null);
        this.LIZ.LJFF();
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, LIZ);
        HQC.LIZ().setSpecialPlusClicked();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startIndependentLiveActivity(Context context, RecordConfig recordConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        Intent LIZ = LIZ(recordConfig);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//live/golive_direct");
        buildRoute.withParam(C16880lQ.LLJJIJI(LIZ));
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, RecordConfig recordConfig) {
        String sourceParams;
        String sourceParams2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        Intent LIZ = LIZ(recordConfig);
        LiveParams liveParams = recordConfig.getLiveParams();
        String str = null;
        if (liveParams != null && (sourceParams = liveParams.getSourceParams()) != null) {
            try {
                if (new JSONObject(sourceParams).optInt("open_sub_only_setting") == 1) {
                    LiveParams liveParams2 = recordConfig.getLiveParams();
                    if (liveParams2 == null || (sourceParams2 = liveParams2.getSourceParams()) == null) {
                        return;
                    }
                    try {
                        str = new JSONObject(sourceParams2).optString("show_entrance");
                    } catch (JSONException unused) {
                    }
                    ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
                    if (LJJJLL == null || LJJJLL.LJJJJJ() == null) {
                        return;
                    }
                    ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).Xo(str, new AqS67S0400000_7(recordConfig, this, context, LIZ, 0));
                    return;
                }
            } catch (JSONException unused2) {
            }
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            LIZJ(context, LIZ, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            LIZIZ(context, LIZ, recordConfig.getKeepChallenges());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startSpecialPlusEntrance(Context context, RecordConfig recordConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        recordConfig.setSticker(HQC.LIZ().getEffectId());
        Boolean bool = Boolean.TRUE;
        recordConfig.setFromSpecialPlus(bool);
        recordConfig.setEnterFrom("super_entrance");
        recordConfig.setPresetSticker(bool);
        Intent LIZ = LIZ(recordConfig);
        Effect LIZIZ = new C36478ETi().LIZIZ();
        if (LIZIZ != null) {
            recordConfig.setFirstSticker(LIZIZ);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, LIZ);
        HQC.LIZ().setSpecialPlusClicked();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startSuperEntrace(Activity context, RecordConfig recordConfig) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        recordConfig.setPrepareFilter(false);
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startSuperEntranceRecordActivity(context, LIZ(recordConfig));
        HVE.LIZ.getValue().getClass();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r0.intValue() == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r4, com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig r5, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener r6) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "stickerDownloadConfig"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Integer r0 = r5.getType()
            if (r0 != 0) goto L44
        L10:
            r1 = 0
        L11:
            r3 = 0
            if (r1 == 0) goto L33
            com.ss.android.ugc.aweme.services.effect.EffectService$Companion r0 = com.ss.android.ugc.aweme.services.effect.EffectService.Companion
            com.ss.android.ugc.aweme.services.effect.EffectService r1 = r0.getInstance()
            if (r1 == 0) goto L32
            java.lang.String r0 = r5.getRegion()
            X.XEg r2 = r1.createMvEffectPlatform(r4, r0)
        L24:
            if (r2 == 0) goto L32
            java.lang.String r1 = r5.getStickerId()
            X.HPc r0 = new X.HPc
            r0.<init>(r5, r6)
            r2.LIZLLL(r1, r3, r0)
        L32:
            return
        L33:
            com.ss.android.ugc.aweme.services.effect.EffectService$Companion r0 = com.ss.android.ugc.aweme.services.effect.EffectService.Companion
            com.ss.android.ugc.aweme.services.effect.EffectService r1 = r0.getInstance()
            if (r1 == 0) goto L32
            java.lang.String r0 = r5.getRegion()
            X.XEg r2 = r1.createEffectPlatform(r4, r0)
            goto L24
        L44:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L10
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HPU.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener):void");
    }

    public final void LIZIZ(Context context, Intent intent, Boolean bool) {
        I9T.LJFF(null);
        if (!o.LJ(bool, Boolean.TRUE)) {
            this.LIZ.LJFF();
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, intent);
    }

    public final Object LJ(Context context, C42436Gl6 c42436Gl6, InterfaceC67352kd<? super OSZ<Integer, Integer>> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        this.LIZIZ.split(context, c42436Gl6.LIZ, c42436Gl6.LIZIZ, c42436Gl6.LIZJ, c42436Gl6.LIZLLL, c42436Gl6.LJ, new HOY(xks));
        return xks.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void preloadDuetLayout(int i, int i2, InterfaceC88472Yns<? super Effect, C76800UCe> onFinish) {
        o.LJIIIZ(onFinish, "onFinish");
        if (i == 0 || i2 == 0) {
            onFinish.invoke(null);
        } else if (!HWY.LIZ() && (i * 1.0f) / i2 <= 1.0d) {
            onFinish.invoke(null);
        } else {
            InterfaceC84498XEg LIZ = C84488XDw.LIZ(FKM.LIZ(), null);
            LIZ.LJI("duet-layout", false, new HUU(i, i2, onFinish, LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, RecordConfig recordConfig, android.net.Uri extraUri) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        o.LJIIIZ(extraUri, "extraUri");
        Intent LIZ = LIZ(recordConfig);
        if (extraUri.isHierarchical()) {
            for (String str : UriProtector.getQueryParameterNames(extraUri)) {
                LIZ.putExtra(str, UriProtector.getQueryParameter(extraUri, str));
            }
        }
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            LIZJ(context, LIZ, recordConfig.getKeepChallenges(), recordConfig.getReshootConfig());
        } else {
            LIZIZ(context, LIZ, recordConfig.getKeepChallenges());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Context context, RecordConfig recordConfig, Challenge challenge) {
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        o.LJIIIZ(challenge, "challenge");
        recordConfig.setPrepareFilter(false);
        AVChallenge LJIJ = C44172HVg.LJI.LJIJ(challenge);
        if (recordConfig.getRecordPresetResource() != null) {
            if (LJIJ != null) {
                str = LJIJ.stickerId;
                str2 = LJIJ.musicId;
            } else {
                str = null;
                str2 = null;
            }
            recordConfig.setRecordPresetResource(new RecordPresetResource(str, null, str2, null));
        }
        this.LIZ.LIZIZ(LJIJ);
        I9T.LJFF(null);
        Intent LIZ = LIZ(recordConfig);
        if (LJIJ != null) {
            LIZ.putExtra("extra_open_record_challenge", (Serializable) LJIJ);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, LIZ);
    }

    public final void LIZJ(Context context, Intent intent, Boolean bool, ReshootConfig reshootConfig) {
        boolean LJ;
        I9T.LJFF(null);
        if (!o.LJ(bool, Boolean.TRUE)) {
            this.LIZ.LJFF();
        }
        Boolean backMain = reshootConfig.getBackMain();
        if (backMain != null) {
            LJ = backMain.booleanValue();
        } else {
            LJ = C44172HVg.LJ();
        }
        if (context instanceof Activity) {
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            o.LJI(reshootClear);
            VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity((Activity) context, intent, enableReshoot, reshootClear.booleanValue(), LJ);
            return;
        }
        VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
        boolean enableReshoot2 = reshootConfig.getEnableReshoot();
        Boolean reshootClear2 = reshootConfig.getReshootClear();
        o.LJI(reshootClear2);
        instance.notifyToolPermissionActivity(context, intent, enableReshoot2, reshootClear2.booleanValue(), LJ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startAlbum(Context context, RecordConfig recordConfig, EnumC133695Mn enumC133695Mn, EditEffectAnchorManager editEffectAnchorManager) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        o.LJIIIZ(editEffectAnchorManager, "editEffectAnchorManager");
        Intent LIZ = LIZ(recordConfig);
        G8G.LIZ.start(SoundSyncOpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        ShortVideoContext LIZJ = HB3.LIZJ(C16880lQ.LLJJIJI(LIZ), context, null);
        Bundle bundle = new Bundle();
        C77412UZs.LJJIJLIJ(bundle, LIZJ.creativeInfo);
        bundle.putParcelable("key_short_video_context", LIZJ);
        bundle.putIntegerArrayList("clip_arg_data_process_items", new ArrayList<>());
        Music music = (Music) LIZ.getSerializableExtra("sticker_music");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(LIZ, "sticker_with_music_file_path");
        if (music != null) {
            AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(music.convertToMusicModel());
            transformMusicModel.setMusicPriority(2);
            I9T.LJFF(transformMusicModel);
            bundle.putSerializable("aweme_music", transformMusicModel);
        }
        bundle.putString("path", LLJJIJIIJIL);
        bundle.putInt("key_photo_select_min_count", 1);
        if (enumC133695Mn == EnumC133695Mn.EDIT_EFFECT_SERVER || enumC133695Mn == EnumC133695Mn.EDIT_EFFECT_COMBINED) {
            i = 1;
            bundle.putInt("key_photo_select_max_count", 1);
            bundle.putInt("key_support_flag", 1);
            bundle.putInt("key_choose_scene", 32);
        } else if (enumC133695Mn == EnumC133695Mn.EDIT_EFFECT_CLIENT) {
            bundle.putInt("key_video_select_max_count", 1);
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putBoolean("Key_enable_multi_video", false);
            bundle.putInt("key_support_flag", 4);
            bundle.putInt("key_choose_scene", 34);
            i = 1;
        } else {
            C43117Gw5.LIZ.getClass();
            int LJII = C43117Gw5.LJII();
            bundle.putLong("Key_min_duration", C44529Hdl.LIZIZ());
            bundle.putInt("key_choose_scene", 11);
            bundle.putInt("key_photo_select_max_count", LJII);
            bundle.putInt("key_video_select_max_count", LJII);
            i = 1;
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putBoolean("Key_enable_multi_video", true);
            bundle.putInt("key_support_flag", 6);
        }
        LIZ.putExtras(bundle);
        LIZ.putExtra("key_choose_request_code", i);
        LIZ.setClass(context, MvChoosePhotoActivity.class);
        C43635HAp.LIZ(LIZJ, editEffectAnchorManager, "", null, LIZJ.shootWay);
        C16880lQ.LIZJ(context, LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startRecord(Activity context, RecordConfig recordConfig, MusicModel musicModel, boolean z) {
        boolean z2;
        boolean z3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(recordConfig, "recordConfig");
        Intent LIZ = LIZ(recordConfig);
        boolean z4 = true;
        if (o.LJ("direct_shoot", C41658GWo.LIZLLL().LIZIZ) && 2 == C41658GWo.LIZLLL().LIZJ) {
            if (musicModel == null) {
                z4 = false;
            }
            LIZ.putExtra("extra_clear_dialog_show_needed", z4);
        }
        if (musicModel != null && musicModel.getMusicWaveBean() != null) {
            LIZ.putExtra("music_wave_data", musicModel.getMusicWaveBean());
        }
        I9T.LJFF(C44172HVg.LJI.transformMusicModel(musicModel));
        LIZ.putExtra("music_model", musicModel);
        if (recordConfig.getReshootConfig().getEnableReshoot()) {
            ReshootConfig reshootConfig = recordConfig.getReshootConfig();
            VideoRecordEntranceServiceImpl instance = VideoRecordEntranceServiceImpl.Companion.getINSTANCE();
            boolean enableReshoot = reshootConfig.getEnableReshoot();
            Boolean reshootClear = reshootConfig.getReshootClear();
            if (reshootClear != null) {
                z2 = reshootClear.booleanValue();
            } else {
                z2 = false;
            }
            Boolean backMain = reshootConfig.getBackMain();
            if (backMain != null) {
                z3 = backMain.booleanValue();
            } else {
                z3 = false;
            }
            instance.startToolPermissionActivity(context, LIZ, enableReshoot, z2, z3);
            return;
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity(context, LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startStitch(Context context, Intent intent, StitchParams stitchParams, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(stitchParams, "stitchParams");
        C43045Guv.LIZLLL(new AqS2S0410000_7(intent, this, context, stitchParams, z, 0), 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startChangeBanMusic(Aweme aweme, Activity context, ChangeBanMusicConfig config, IRecordService.UICallback uICallback, String from) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(from, "from");
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C42435Gl5(this, context, config, uICallback, aweme, from, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startExteriorVideoRecordScene(Context context, ExteriorRecordModel exteriorRecordModel, AbstractBinderC44127HTn callback, String shootWay, Bundle bundle) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(exteriorRecordModel, "exteriorRecordModel");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(shootWay, "shootWay");
        Intent intent = new Intent();
        intent.putExtra("shoot_way", shootWay);
        C77412UZs.LJJIJL(intent, C44384HbQ.LJJJJIZL(), 0, null);
        intent.putExtra("exterior_record_model", exteriorRecordModel);
        Activity LIZ = C105574Cj.LIZ(context);
        if (LIZ != null) {
            KeyboardUtils.LIZIZ(LIZ.getCurrentFocus());
        }
        String extraKey = callback.LIZIZ();
        o.LJIIIZ(extraKey, "extraKey");
        intent.putExtra(extraKey, new IBinderWrapper(callback));
        if (bundle != null) {
            intent.putExtra("extraParams", bundle);
        }
        LIZIZ(context, intent, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService
    public final void startDuet(Context context, RecordConfig config, DuetConfig duetConfig, IRecordService.UICallback uICallback, String str, String str2) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(duetConfig, "duetConfig");
        this.LIZIZ.split(context, duetConfig.getMinDuration(), duetConfig.getOutputDir(), duetConfig.getOriginVideo(), duetConfig.getWavPath(), duetConfig.getMp4Path(), new HB5(duetConfig, this, config, context, uICallback, str2));
    }
}
