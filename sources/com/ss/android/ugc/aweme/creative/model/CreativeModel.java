package com.ss.android.ugc.aweme.creative.model;

import X.C40946G5e;
import X.C43546H7e;
import X.C6N5;
import X.G5D;
import X.GPV;
import X.H59;
import X.H9G;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.creative.model.audio.TTSModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.duet.DuetModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditBackSaveModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditVideoEnhanceModel;
import com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PrePublishEntranceModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel;
import com.ss.android.ugc.aweme.creative.model.record.UploadPreviewClipModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchModel;
import com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeModel implements Parcelable {
    public static final Parcelable.Creator<CreativeModel> CREATOR = new C43546H7e();

    @GPV
    public H9G albumTabModel;

    @InterfaceC65349Pkn("algorithm_on_off")
    public AudioAlgorithmModel audioAlgorithmModel;

    @InterfaceC65349Pkn("audio_copyright_detect_model")
    public AudioCopyrightDetectModel audioCopyrightDetectModel;

    @InterfaceC65349Pkn("volume_adjustment")
    public AudioVolumeAdjustModel audioVolumeAdjustModel;

    @InterfaceC65349Pkn("autocut_anchor_data")
    public AutoCutAnchorModel autoCutAnchorModel;

    @InterfaceC65349Pkn("autocut_data")
    public AutoCutModel autoCutModel;

    @GPV
    public final VEBytevc1Model bytevcVC1Model;

    @InterfaceC65349Pkn("change_avatar_model")
    public ChangeAvatarModel changeAvatarModel;

    @InterfaceC65349Pkn("check_point_model")
    public final CheckPointModel checkPointModel;

    @InterfaceC65349Pkn("commerce_model")
    public CommerceToolsModel commerceModel;

    @InterfaceC65349Pkn("common_mob")
    public CommonMobParamModel commonMobModel;

    @InterfaceC65349Pkn("cut_same_model")
    public CutSameModel cutSameModel;

    @GPV
    public DMMediaModel dmMediaModel;

    @InterfaceC65349Pkn("draft_info_model")
    public final DraftInfoModel draftInfoModel;

    @InterfaceC65349Pkn("duet_model")
    public final DuetModel duetModel;

    @InterfaceC65349Pkn("edit_back_save_model")
    public EditBackSaveModel editBackSaveModel;

    @InterfaceC65349Pkn("edit_effect_model")
    public EditEffectModel editEffectModel;

    @InterfaceC65349Pkn("edit_post")
    public EditPostModel editPostModel;

    @GPV
    public EditSaveLocalModel editSaveLocalModel;

    @InterfaceC65349Pkn("edit_sticker_model")
    public EditStickerModel editStickerModel;

    @GPV
    public EditVideoEnhanceModel editVideoEnhanceModel;

    @InterfaceC65349Pkn("effect_data")
    public EffectDataTransport effectData;

    @InterfaceC65349Pkn("filter_model")
    public FilterModel filterModel;

    @InterfaceC65349Pkn("follow_up_publish_tracker_model")
    public final FollowUpPublishTrackerModel followUpPublishTrackerModel;

    @GPV
    public ForwardEditPublishData forwardEditPublishData;

    @InterfaceC65349Pkn("green_screen_effect_model")
    public GreenScreenEffectModel greenScreenEffectModel;

    @GPV
    public final HDRModel hdrModel;

    @InterfaceC65349Pkn("initial_input_model")
    public CreativeInitialModel initialModel;

    @InterfaceC65349Pkn("inline_caption_experiment_group")
    public InlineCaptionExperimentInformation inlineCaptionExperimentInformation;

    @InterfaceC65349Pkn("inline_caption_model")
    public InlineCaptionModel inlineCaptionModel;

    @InterfaceC65349Pkn("library_model")
    public LibraryModel libraryModel;

    @GPV
    public LoadMusicAndEffectModel loadMusicAndEffectModel;

    @InterfaceC65349Pkn("loudness_balance")
    public LoudnessBalanceModel loudnessBalanceModel;

    @InterfaceC65349Pkn("magic_combine_effect_model")
    public MagicCombineEffectModel magicCombineEffectModel;

    @InterfaceC65349Pkn("mic_data_model")
    public final MicDataModel micDataModel;

    @InterfaceC65349Pkn("mirror_mode")
    public MirrorMode mirrorMode;

    @InterfaceC65349Pkn("mobile_effects")
    public MobileEffectsModel mobileEffectsModel;

    @InterfaceC65349Pkn("mobile_effects_2")
    public MobileEffectsModel2 mobileEffectsModel2;

    @InterfaceC65349Pkn("music_business_model")
    public MusicBuzModel musicBuzModel;

    @InterfaceC65349Pkn("music_share_story")
    public MusicShareStoryData musicShareStoryData;

    @InterfaceC65349Pkn("music_volume_info_model")
    public final MusicVolumeInfoModel musicVolumeInfoModel;

    @InterfaceC65349Pkn("nle_info_model")
    public NLEInfoModel nleInfoModel;

    @InterfaceC65349Pkn("nows_data")
    public NowsShootModel nowsShootModel;

    @InterfaceC65349Pkn("on_this_day")
    public final OnThisDayData onThisDayData;

    @InterfaceC65349Pkn("paid_content_video_model")
    public PaidContentVideoModel paidContentModel;

    @InterfaceC65349Pkn("post_landing_model")
    public final PostLandingModel postLandingModel;

    @InterfaceC65349Pkn("post_page_model")
    public final PostPageModel postPageModel;

    @GPV
    public PrePublishEntranceModel prePublishEntranceModel;

    @GPV
    public H59 prePublishStatusModel;

    @InterfaceC65349Pkn("privacy_setting")
    public PrivacySettingModel privacySettingModel;

    @GPV
    public PublishItemTrackModel publishItemTrackModel;

    @InterfaceC65349Pkn("publish_permission_model")
    public final CreativePublishPermissionModel publishPermissionModel;

    @InterfaceC65349Pkn("publish_preview_model")
    public final PublishPreviewModel publishPreviewModel;

    @InterfaceC65349Pkn("pugc_template_data")
    public PUgcTemplateData pugcTemplateData;

    @GPV
    public C6N5 quickPostOnEditPageModel;

    @InterfaceC65349Pkn("record_downgrade_model")
    public final RecordDowngradeModel recordDowngradeModel;

    @InterfaceC65349Pkn("record_effect_model")
    public final RecordEffectModel recordEffectModel;

    @GPV
    public ReuseSoundAndEffectModel reuseSoundAndEffectModel;

    @InterfaceC65349Pkn("search_create_model")
    public SearchCreateModel searchCreateModel;

    @GPV
    public C40946G5e shortcutPublishStatusModel;

    @InterfaceC65349Pkn("sound_effect_info_model")
    public final SoundEffectInfoModel soundEffectInfoModel;

    @InterfaceC65349Pkn("sticker_model")
    public StickerNewEngineModel stickerModel;

    @InterfaceC65349Pkn("stitch_model")
    public final StitchModel stitchModel;

    @InterfaceC65349Pkn("stream_voice_conversion")
    public StreamVoiceConversionModel streamVoiceConversionModel;

    @GPV
    public boolean toUploadAlbum;

    @GPV
    public final G5D transientPostPageModel;

    @InterfaceC65349Pkn("trending_data")
    public TrendingUploadModel trendingUploadModel;

    @InterfaceC65349Pkn("tts_and_vc_ref_ids")
    public TTSAndVCRefIDsModel ttsAndVcRefIDsModel;

    @InterfaceC65349Pkn("text_to_speech")
    public TTSModel ttsModel;

    @InterfaceC65349Pkn("ugc_template_data")
    public UgcTemplateData ugcTemplateData;

    @GPV
    public UploadPreviewClipModel uploadPreviewClipModel;

    @GPV
    public Video2StickerModel video2StickerModel;

    @GPV
    public String videoDetectionRiskInfo;

    @InterfaceC65349Pkn("voice_conversion")
    public VoiceConversionModel voiceConversionModel;

    @InterfaceC65349Pkn("volume_info_model")
    public final VolumeInfoModel volumeInfoModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativeModel() {
        /*
            r74 = this;
            r1 = 0
            r70 = -1
            r72 = 31
            r0 = r74
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r34 = r1
            r35 = r1
            r36 = r1
            r37 = r1
            r38 = r1
            r39 = r1
            r40 = r1
            r41 = r1
            r42 = r1
            r43 = r1
            r44 = r1
            r45 = r1
            r46 = r1
            r47 = r1
            r48 = r1
            r49 = r1
            r50 = r1
            r51 = r1
            r52 = r1
            r53 = r1
            r54 = r1
            r55 = r1
            r56 = r1
            r57 = r1
            r58 = r1
            r59 = r1
            r60 = r1
            r61 = r1
            r62 = r1
            r63 = r1
            r64 = r1
            r65 = r1
            r66 = r1
            r67 = r1
            r68 = r1
            r69 = r1
            r71 = r70
            r73 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.CreativeModel.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.initialModel.writeToParcel(out, i);
        this.recordEffectModel.writeToParcel(out, i);
        this.loadMusicAndEffectModel.writeToParcel(out, i);
        this.recordDowngradeModel.writeToParcel(out, i);
        this.reuseSoundAndEffectModel.writeToParcel(out, i);
        this.greenScreenEffectModel.writeToParcel(out, i);
        this.searchCreateModel.writeToParcel(out, i);
        this.volumeInfoModel.writeToParcel(out, i);
        this.musicVolumeInfoModel.writeToParcel(out, i);
        this.soundEffectInfoModel.writeToParcel(out, i);
        this.musicBuzModel.writeToParcel(out, i);
        CutSameModel cutSameModel = this.cutSameModel;
        if (cutSameModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cutSameModel.writeToParcel(out, i);
        }
        this.editEffectModel.writeToParcel(out, i);
        this.editBackSaveModel.writeToParcel(out, i);
        this.nleInfoModel.writeToParcel(out, i);
        this.editStickerModel.writeToParcel(out, i);
        this.editVideoEnhanceModel.writeToParcel(out, i);
        this.editSaveLocalModel.writeToParcel(out, i);
        this.filterModel.writeToParcel(out, i);
        this.mirrorMode.writeToParcel(out, i);
        this.duetModel.writeToParcel(out, i);
        this.stitchModel.writeToParcel(out, i);
        this.mobileEffectsModel.writeToParcel(out, i);
        this.mobileEffectsModel2.writeToParcel(out, i);
        this.libraryModel.writeToParcel(out, i);
        this.postPageModel.writeToParcel(out, i);
        this.followUpPublishTrackerModel.writeToParcel(out, i);
        this.postLandingModel.writeToParcel(out, i);
        this.publishPreviewModel.writeToParcel(out, i);
        this.draftInfoModel.writeToParcel(out, i);
        this.micDataModel.writeToParcel(out, i);
        this.checkPointModel.writeToParcel(out, i);
        this.loudnessBalanceModel.writeToParcel(out, i);
        this.audioAlgorithmModel.writeToParcel(out, i);
        this.audioVolumeAdjustModel.writeToParcel(out, i);
        this.audioCopyrightDetectModel.writeToParcel(out, i);
        this.prePublishEntranceModel.writeToParcel(out, i);
        this.voiceConversionModel.writeToParcel(out, i);
        this.ttsAndVcRefIDsModel.writeToParcel(out, i);
        this.ttsModel.writeToParcel(out, i);
        this.streamVoiceConversionModel.writeToParcel(out, i);
        NowsShootModel nowsShootModel = this.nowsShootModel;
        if (nowsShootModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nowsShootModel.writeToParcel(out, i);
        }
        DMMediaModel dMMediaModel = this.dmMediaModel;
        if (dMMediaModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dMMediaModel.writeToParcel(out, i);
        }
        this.effectData.writeToParcel(out, i);
        this.publishPermissionModel.writeToParcel(out, i);
        out.writeParcelable(this.commerceModel, i);
        InlineCaptionModel inlineCaptionModel = this.inlineCaptionModel;
        if (inlineCaptionModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            inlineCaptionModel.writeToParcel(out, i);
        }
        InlineCaptionExperimentInformation inlineCaptionExperimentInformation = this.inlineCaptionExperimentInformation;
        if (inlineCaptionExperimentInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            inlineCaptionExperimentInformation.writeToParcel(out, i);
        }
        this.autoCutModel.writeToParcel(out, i);
        this.autoCutAnchorModel.writeToParcel(out, i);
        this.ugcTemplateData.writeToParcel(out, i);
        this.pugcTemplateData.writeToParcel(out, i);
        EditPostModel editPostModel = this.editPostModel;
        if (editPostModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            editPostModel.writeToParcel(out, i);
        }
        Video2StickerModel video2StickerModel = this.video2StickerModel;
        if (video2StickerModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            video2StickerModel.writeToParcel(out, i);
        }
        this.uploadPreviewClipModel.writeToParcel(out, i);
        this.trendingUploadModel.writeToParcel(out, i);
        this.hdrModel.writeToParcel(out, i);
        this.bytevcVC1Model.writeToParcel(out, i);
        this.commonMobModel.writeToParcel(out, i);
        this.privacySettingModel.writeToParcel(out, i);
        this.changeAvatarModel.writeToParcel(out, i);
        this.onThisDayData.writeToParcel(out, i);
        this.musicShareStoryData.writeToParcel(out, i);
        out.writeSerializable(this.albumTabModel);
        this.stickerModel.writeToParcel(out, i);
        PublishItemTrackModel publishItemTrackModel = this.publishItemTrackModel;
        if (publishItemTrackModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            publishItemTrackModel.writeToParcel(out, i);
        }
        this.magicCombineEffectModel.writeToParcel(out, i);
        ForwardEditPublishData forwardEditPublishData = this.forwardEditPublishData;
        if (forwardEditPublishData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            forwardEditPublishData.writeToParcel(out, i);
        }
        this.paidContentModel.writeToParcel(out, i);
    }

    public CreativeModel(CreativeInitialModel initialModel, RecordEffectModel recordEffectModel, LoadMusicAndEffectModel loadMusicAndEffectModel, RecordDowngradeModel recordDowngradeModel, ReuseSoundAndEffectModel reuseSoundAndEffectModel, GreenScreenEffectModel greenScreenEffectModel, SearchCreateModel searchCreateModel, VolumeInfoModel volumeInfoModel, MusicVolumeInfoModel musicVolumeInfoModel, SoundEffectInfoModel soundEffectInfoModel, MusicBuzModel musicBuzModel, CutSameModel cutSameModel, EditEffectModel editEffectModel, EditBackSaveModel editBackSaveModel, NLEInfoModel nleInfoModel, EditStickerModel editStickerModel, EditVideoEnhanceModel editVideoEnhanceModel, EditSaveLocalModel editSaveLocalModel, FilterModel filterModel, MirrorMode mirrorMode, DuetModel duetModel, StitchModel stitchModel, MobileEffectsModel mobileEffectsModel, MobileEffectsModel2 mobileEffectsModel2, LibraryModel libraryModel, PostPageModel postPageModel, FollowUpPublishTrackerModel followUpPublishTrackerModel, PostLandingModel postLandingModel, PublishPreviewModel publishPreviewModel, DraftInfoModel draftInfoModel, MicDataModel micDataModel, CheckPointModel checkPointModel, LoudnessBalanceModel loudnessBalanceModel, AudioAlgorithmModel audioAlgorithmModel, AudioVolumeAdjustModel audioVolumeAdjustModel, AudioCopyrightDetectModel audioCopyrightDetectModel, PrePublishEntranceModel prePublishEntranceModel, VoiceConversionModel voiceConversionModel, TTSAndVCRefIDsModel ttsAndVcRefIDsModel, TTSModel ttsModel, StreamVoiceConversionModel streamVoiceConversionModel, NowsShootModel nowsShootModel, DMMediaModel dMMediaModel, EffectDataTransport effectData, CreativePublishPermissionModel publishPermissionModel, CommerceToolsModel commerceModel, InlineCaptionModel inlineCaptionModel, InlineCaptionExperimentInformation inlineCaptionExperimentInformation, AutoCutModel autoCutModel, AutoCutAnchorModel autoCutAnchorModel, UgcTemplateData ugcTemplateData, PUgcTemplateData pugcTemplateData, EditPostModel editPostModel, Video2StickerModel video2StickerModel, UploadPreviewClipModel uploadPreviewClipModel, TrendingUploadModel trendingUploadModel, HDRModel hdrModel, VEBytevc1Model bytevcVC1Model, CommonMobParamModel commonMobModel, PrivacySettingModel privacySettingModel, ChangeAvatarModel changeAvatarModel, OnThisDayData onThisDayData, MusicShareStoryData musicShareStoryData, H9G albumTabModel, StickerNewEngineModel stickerModel, PublishItemTrackModel publishItemTrackModel, MagicCombineEffectModel magicCombineEffectModel, ForwardEditPublishData forwardEditPublishData, PaidContentVideoModel paidContentModel) {
        o.LJIIIZ(initialModel, "initialModel");
        o.LJIIIZ(recordEffectModel, "recordEffectModel");
        o.LJIIIZ(loadMusicAndEffectModel, "loadMusicAndEffectModel");
        o.LJIIIZ(recordDowngradeModel, "recordDowngradeModel");
        o.LJIIIZ(reuseSoundAndEffectModel, "reuseSoundAndEffectModel");
        o.LJIIIZ(greenScreenEffectModel, "greenScreenEffectModel");
        o.LJIIIZ(searchCreateModel, "searchCreateModel");
        o.LJIIIZ(volumeInfoModel, "volumeInfoModel");
        o.LJIIIZ(musicVolumeInfoModel, "musicVolumeInfoModel");
        o.LJIIIZ(soundEffectInfoModel, "soundEffectInfoModel");
        o.LJIIIZ(musicBuzModel, "musicBuzModel");
        o.LJIIIZ(editEffectModel, "editEffectModel");
        o.LJIIIZ(editBackSaveModel, "editBackSaveModel");
        o.LJIIIZ(nleInfoModel, "nleInfoModel");
        o.LJIIIZ(editStickerModel, "editStickerModel");
        o.LJIIIZ(editVideoEnhanceModel, "editVideoEnhanceModel");
        o.LJIIIZ(editSaveLocalModel, "editSaveLocalModel");
        o.LJIIIZ(filterModel, "filterModel");
        o.LJIIIZ(mirrorMode, "mirrorMode");
        o.LJIIIZ(duetModel, "duetModel");
        o.LJIIIZ(stitchModel, "stitchModel");
        o.LJIIIZ(mobileEffectsModel, "mobileEffectsModel");
        o.LJIIIZ(mobileEffectsModel2, "mobileEffectsModel2");
        o.LJIIIZ(libraryModel, "libraryModel");
        o.LJIIIZ(postPageModel, "postPageModel");
        o.LJIIIZ(followUpPublishTrackerModel, "followUpPublishTrackerModel");
        o.LJIIIZ(postLandingModel, "postLandingModel");
        o.LJIIIZ(publishPreviewModel, "publishPreviewModel");
        o.LJIIIZ(draftInfoModel, "draftInfoModel");
        o.LJIIIZ(micDataModel, "micDataModel");
        o.LJIIIZ(checkPointModel, "checkPointModel");
        o.LJIIIZ(loudnessBalanceModel, "loudnessBalanceModel");
        o.LJIIIZ(audioAlgorithmModel, "audioAlgorithmModel");
        o.LJIIIZ(audioVolumeAdjustModel, "audioVolumeAdjustModel");
        o.LJIIIZ(audioCopyrightDetectModel, "audioCopyrightDetectModel");
        o.LJIIIZ(prePublishEntranceModel, "prePublishEntranceModel");
        o.LJIIIZ(voiceConversionModel, "voiceConversionModel");
        o.LJIIIZ(ttsAndVcRefIDsModel, "ttsAndVcRefIDsModel");
        o.LJIIIZ(ttsModel, "ttsModel");
        o.LJIIIZ(streamVoiceConversionModel, "streamVoiceConversionModel");
        o.LJIIIZ(effectData, "effectData");
        o.LJIIIZ(publishPermissionModel, "publishPermissionModel");
        o.LJIIIZ(commerceModel, "commerceModel");
        o.LJIIIZ(autoCutModel, "autoCutModel");
        o.LJIIIZ(autoCutAnchorModel, "autoCutAnchorModel");
        o.LJIIIZ(ugcTemplateData, "ugcTemplateData");
        o.LJIIIZ(pugcTemplateData, "pugcTemplateData");
        o.LJIIIZ(uploadPreviewClipModel, "uploadPreviewClipModel");
        o.LJIIIZ(trendingUploadModel, "trendingUploadModel");
        o.LJIIIZ(hdrModel, "hdrModel");
        o.LJIIIZ(bytevcVC1Model, "bytevcVC1Model");
        o.LJIIIZ(commonMobModel, "commonMobModel");
        o.LJIIIZ(privacySettingModel, "privacySettingModel");
        o.LJIIIZ(changeAvatarModel, "changeAvatarModel");
        o.LJIIIZ(onThisDayData, "onThisDayData");
        o.LJIIIZ(musicShareStoryData, "musicShareStoryData");
        o.LJIIIZ(albumTabModel, "albumTabModel");
        o.LJIIIZ(stickerModel, "stickerModel");
        o.LJIIIZ(magicCombineEffectModel, "magicCombineEffectModel");
        o.LJIIIZ(paidContentModel, "paidContentModel");
        this.initialModel = initialModel;
        this.recordEffectModel = recordEffectModel;
        this.loadMusicAndEffectModel = loadMusicAndEffectModel;
        this.recordDowngradeModel = recordDowngradeModel;
        this.reuseSoundAndEffectModel = reuseSoundAndEffectModel;
        this.greenScreenEffectModel = greenScreenEffectModel;
        this.searchCreateModel = searchCreateModel;
        this.volumeInfoModel = volumeInfoModel;
        this.musicVolumeInfoModel = musicVolumeInfoModel;
        this.soundEffectInfoModel = soundEffectInfoModel;
        this.musicBuzModel = musicBuzModel;
        this.cutSameModel = cutSameModel;
        this.editEffectModel = editEffectModel;
        this.editBackSaveModel = editBackSaveModel;
        this.nleInfoModel = nleInfoModel;
        this.editStickerModel = editStickerModel;
        this.editVideoEnhanceModel = editVideoEnhanceModel;
        this.editSaveLocalModel = editSaveLocalModel;
        this.filterModel = filterModel;
        this.mirrorMode = mirrorMode;
        this.duetModel = duetModel;
        this.stitchModel = stitchModel;
        this.mobileEffectsModel = mobileEffectsModel;
        this.mobileEffectsModel2 = mobileEffectsModel2;
        this.libraryModel = libraryModel;
        this.postPageModel = postPageModel;
        this.followUpPublishTrackerModel = followUpPublishTrackerModel;
        this.postLandingModel = postLandingModel;
        this.publishPreviewModel = publishPreviewModel;
        this.draftInfoModel = draftInfoModel;
        this.micDataModel = micDataModel;
        this.checkPointModel = checkPointModel;
        this.loudnessBalanceModel = loudnessBalanceModel;
        this.audioAlgorithmModel = audioAlgorithmModel;
        this.audioVolumeAdjustModel = audioVolumeAdjustModel;
        this.audioCopyrightDetectModel = audioCopyrightDetectModel;
        this.prePublishEntranceModel = prePublishEntranceModel;
        this.voiceConversionModel = voiceConversionModel;
        this.ttsAndVcRefIDsModel = ttsAndVcRefIDsModel;
        this.ttsModel = ttsModel;
        this.streamVoiceConversionModel = streamVoiceConversionModel;
        this.nowsShootModel = nowsShootModel;
        this.dmMediaModel = dMMediaModel;
        this.effectData = effectData;
        this.publishPermissionModel = publishPermissionModel;
        this.commerceModel = commerceModel;
        this.inlineCaptionModel = inlineCaptionModel;
        this.inlineCaptionExperimentInformation = inlineCaptionExperimentInformation;
        this.autoCutModel = autoCutModel;
        this.autoCutAnchorModel = autoCutAnchorModel;
        this.ugcTemplateData = ugcTemplateData;
        this.pugcTemplateData = pugcTemplateData;
        this.editPostModel = editPostModel;
        this.video2StickerModel = video2StickerModel;
        this.uploadPreviewClipModel = uploadPreviewClipModel;
        this.trendingUploadModel = trendingUploadModel;
        this.hdrModel = hdrModel;
        this.bytevcVC1Model = bytevcVC1Model;
        this.commonMobModel = commonMobModel;
        this.privacySettingModel = privacySettingModel;
        this.changeAvatarModel = changeAvatarModel;
        this.onThisDayData = onThisDayData;
        this.musicShareStoryData = musicShareStoryData;
        this.albumTabModel = albumTabModel;
        this.stickerModel = stickerModel;
        this.publishItemTrackModel = publishItemTrackModel;
        this.magicCombineEffectModel = magicCombineEffectModel;
        this.forwardEditPublishData = forwardEditPublishData;
        this.paidContentModel = paidContentModel;
        this.prePublishStatusModel = new H59();
        this.quickPostOnEditPageModel = new C6N5();
        this.shortcutPublishStatusModel = new C40946G5e();
        this.transientPostPageModel = new G5D();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CreativeModel(com.ss.android.ugc.aweme.creative.model.CreativeInitialModel r171, com.ss.android.ugc.aweme.creative.model.RecordEffectModel r172, com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel r173, com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel r174, com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel r175, com.ss.android.ugc.aweme.creative.model.GreenScreenEffectModel r176, com.ss.android.ugc.aweme.creative.model.SearchCreateModel r177, com.ss.android.ugc.aweme.creative.model.VolumeInfoModel r178, com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel r179, com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel r180, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r181, com.ss.android.ugc.aweme.creative.model.CutSameModel r182, com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel r183, com.ss.android.ugc.aweme.creative.model.edit.EditBackSaveModel r184, com.ss.android.ugc.aweme.creative.model.NLEInfoModel r185, com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel r186, com.ss.android.ugc.aweme.creative.model.edit.EditVideoEnhanceModel r187, com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel r188, com.ss.android.ugc.aweme.creative.model.FilterModel r189, com.ss.android.ugc.aweme.creative.model.MirrorMode r190, com.ss.android.ugc.aweme.creative.model.duet.DuetModel r191, com.ss.android.ugc.aweme.creative.model.stitch.StitchModel r192, com.ss.android.ugc.aweme.creative.model.MobileEffectsModel r193, com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2 r194, com.ss.android.ugc.aweme.creative.model.LibraryModel r195, com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r196, com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel r197, com.ss.android.ugc.aweme.creative.model.PostLandingModel r198, com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel r199, com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r200, com.ss.android.ugc.aweme.creative.model.MicDataModel r201, com.ss.android.ugc.aweme.creative.model.CheckPointModel r202, com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel r203, com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel r204, com.ss.android.ugc.aweme.creative.model.AudioVolumeAdjustModel r205, com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel r206, com.ss.android.ugc.aweme.creative.model.publish.PrePublishEntranceModel r207, com.ss.android.ugc.aweme.creative.model.VoiceConversionModel r208, com.ss.android.ugc.aweme.creative.model.TTSAndVCRefIDsModel r209, com.ss.android.ugc.aweme.creative.model.audio.TTSModel r210, com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel r211, com.ss.android.ugc.aweme.creative.model.NowsShootModel r212, com.ss.android.ugc.aweme.creative.model.DMMediaModel r213, com.ss.android.ugc.aweme.creative.model.EffectDataTransport r214, com.ss.android.ugc.aweme.creative.model.CreativePublishPermissionModel r215, com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel r216, com.ss.android.ugc.aweme.creative.model.InlineCaptionModel r217, com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation r218, com.ss.android.ugc.aweme.creative.model.AutoCutModel r219, com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel r220, com.ss.android.ugc.aweme.creative.model.UgcTemplateData r221, com.ss.android.ugc.aweme.creative.model.PUgcTemplateData r222, com.ss.android.ugc.aweme.creative.model.EditPostModel r223, com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel r224, com.ss.android.ugc.aweme.creative.model.record.UploadPreviewClipModel r225, com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel r226, com.ss.android.ugc.aweme.creative.model.HDRModel r227, com.ss.android.ugc.aweme.creative.model.VEBytevc1Model r228, com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r229, com.ss.android.ugc.aweme.creative.model.PrivacySettingModel r230, com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r231, com.ss.android.ugc.aweme.creative.model.OnThisDayData r232, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData r233, X.H9G r234, com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r235, com.ss.android.ugc.aweme.creative.model.PublishItemTrackModel r236, com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel r237, com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData r238, com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel r239, int r240, int r241, int r242, kotlin.jvm.internal.DefaultConstructorMarker r243) {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.CreativeModel.<init>(com.ss.android.ugc.aweme.creative.model.CreativeInitialModel, com.ss.android.ugc.aweme.creative.model.RecordEffectModel, com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel, com.ss.android.ugc.aweme.creative.model.record.RecordDowngradeModel, com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel, com.ss.android.ugc.aweme.creative.model.GreenScreenEffectModel, com.ss.android.ugc.aweme.creative.model.SearchCreateModel, com.ss.android.ugc.aweme.creative.model.VolumeInfoModel, com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel, com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel, com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel, com.ss.android.ugc.aweme.creative.model.CutSameModel, com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel, com.ss.android.ugc.aweme.creative.model.edit.EditBackSaveModel, com.ss.android.ugc.aweme.creative.model.NLEInfoModel, com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel, com.ss.android.ugc.aweme.creative.model.edit.EditVideoEnhanceModel, com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel, com.ss.android.ugc.aweme.creative.model.FilterModel, com.ss.android.ugc.aweme.creative.model.MirrorMode, com.ss.android.ugc.aweme.creative.model.duet.DuetModel, com.ss.android.ugc.aweme.creative.model.stitch.StitchModel, com.ss.android.ugc.aweme.creative.model.MobileEffectsModel, com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2, com.ss.android.ugc.aweme.creative.model.LibraryModel, com.ss.android.ugc.aweme.creative.model.publish.PostPageModel, com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel, com.ss.android.ugc.aweme.creative.model.PostLandingModel, com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel, com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel, com.ss.android.ugc.aweme.creative.model.MicDataModel, com.ss.android.ugc.aweme.creative.model.CheckPointModel, com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel, com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel, com.ss.android.ugc.aweme.creative.model.AudioVolumeAdjustModel, com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel, com.ss.android.ugc.aweme.creative.model.publish.PrePublishEntranceModel, com.ss.android.ugc.aweme.creative.model.VoiceConversionModel, com.ss.android.ugc.aweme.creative.model.TTSAndVCRefIDsModel, com.ss.android.ugc.aweme.creative.model.audio.TTSModel, com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel, com.ss.android.ugc.aweme.creative.model.NowsShootModel, com.ss.android.ugc.aweme.creative.model.DMMediaModel, com.ss.android.ugc.aweme.creative.model.EffectDataTransport, com.ss.android.ugc.aweme.creative.model.CreativePublishPermissionModel, com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel, com.ss.android.ugc.aweme.creative.model.InlineCaptionModel, com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation, com.ss.android.ugc.aweme.creative.model.AutoCutModel, com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel, com.ss.android.ugc.aweme.creative.model.UgcTemplateData, com.ss.android.ugc.aweme.creative.model.PUgcTemplateData, com.ss.android.ugc.aweme.creative.model.EditPostModel, com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel, com.ss.android.ugc.aweme.creative.model.record.UploadPreviewClipModel, com.ss.android.ugc.aweme.creative.model.trending.TrendingUploadModel, com.ss.android.ugc.aweme.creative.model.HDRModel, com.ss.android.ugc.aweme.creative.model.VEBytevc1Model, com.ss.android.ugc.aweme.creative.model.CommonMobParamModel, com.ss.android.ugc.aweme.creative.model.PrivacySettingModel, com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel, com.ss.android.ugc.aweme.creative.model.OnThisDayData, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData, X.H9G, com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel, com.ss.android.ugc.aweme.creative.model.PublishItemTrackModel, com.ss.android.ugc.aweme.creative.model.magic.MagicCombineEffectModel, com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData, com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
