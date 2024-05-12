package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.AudioVolumeAdjustModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CheckPointModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.CreativePublishPermissionModel;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import com.ss.android.ugc.aweme.creative.model.FilterModel;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.creative.model.GreenScreenEffectModel;
import com.ss.android.ugc.aweme.creative.model.HDRModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionExperimentInformation;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.LibraryModel;
import com.ss.android.ugc.aweme.creative.model.LoadMusicAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.LoudnessBalanceModel;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.MirrorMode;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import com.ss.android.ugc.aweme.creative.model.MusicVolumeInfoModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.PaidContentVideoModel;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.PublishItemTrackModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.creative.model.SearchCreateModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffectInfoModel;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.TTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.VEBytevc1Model;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.VolumeInfoModel;
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

/* renamed from: X.H7e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43546H7e implements Parcelable.Creator<CreativeModel> {
    @Override // android.os.Parcelable.Creator
    public final CreativeModel createFromParcel(Parcel parcel) {
        CutSameModel createFromParcel;
        NowsShootModel createFromParcel2;
        DMMediaModel createFromParcel3;
        InlineCaptionModel createFromParcel4;
        InlineCaptionExperimentInformation createFromParcel5;
        EditPostModel createFromParcel6;
        Video2StickerModel createFromParcel7;
        PublishItemTrackModel createFromParcel8;
        o.LJIIIZ(parcel, "parcel");
        CreativeInitialModel createFromParcel9 = CreativeInitialModel.CREATOR.createFromParcel(parcel);
        RecordEffectModel createFromParcel10 = RecordEffectModel.CREATOR.createFromParcel(parcel);
        LoadMusicAndEffectModel createFromParcel11 = LoadMusicAndEffectModel.CREATOR.createFromParcel(parcel);
        RecordDowngradeModel createFromParcel12 = RecordDowngradeModel.CREATOR.createFromParcel(parcel);
        ReuseSoundAndEffectModel createFromParcel13 = ReuseSoundAndEffectModel.CREATOR.createFromParcel(parcel);
        GreenScreenEffectModel createFromParcel14 = GreenScreenEffectModel.CREATOR.createFromParcel(parcel);
        SearchCreateModel createFromParcel15 = SearchCreateModel.CREATOR.createFromParcel(parcel);
        VolumeInfoModel createFromParcel16 = VolumeInfoModel.CREATOR.createFromParcel(parcel);
        MusicVolumeInfoModel createFromParcel17 = MusicVolumeInfoModel.CREATOR.createFromParcel(parcel);
        SoundEffectInfoModel createFromParcel18 = SoundEffectInfoModel.CREATOR.createFromParcel(parcel);
        MusicBuzModel createFromParcel19 = MusicBuzModel.CREATOR.createFromParcel(parcel);
        ForwardEditPublishData forwardEditPublishData = null;
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = CutSameModel.CREATOR.createFromParcel(parcel);
        }
        CutSameModel cutSameModel = createFromParcel;
        EditEffectModel createFromParcel20 = EditEffectModel.CREATOR.createFromParcel(parcel);
        EditBackSaveModel createFromParcel21 = EditBackSaveModel.CREATOR.createFromParcel(parcel);
        NLEInfoModel createFromParcel22 = NLEInfoModel.CREATOR.createFromParcel(parcel);
        EditStickerModel createFromParcel23 = EditStickerModel.CREATOR.createFromParcel(parcel);
        EditVideoEnhanceModel createFromParcel24 = EditVideoEnhanceModel.CREATOR.createFromParcel(parcel);
        EditSaveLocalModel createFromParcel25 = EditSaveLocalModel.CREATOR.createFromParcel(parcel);
        FilterModel createFromParcel26 = FilterModel.CREATOR.createFromParcel(parcel);
        MirrorMode createFromParcel27 = MirrorMode.CREATOR.createFromParcel(parcel);
        DuetModel createFromParcel28 = DuetModel.CREATOR.createFromParcel(parcel);
        StitchModel createFromParcel29 = StitchModel.CREATOR.createFromParcel(parcel);
        MobileEffectsModel createFromParcel30 = MobileEffectsModel.CREATOR.createFromParcel(parcel);
        MobileEffectsModel2 createFromParcel31 = MobileEffectsModel2.CREATOR.createFromParcel(parcel);
        LibraryModel createFromParcel32 = LibraryModel.CREATOR.createFromParcel(parcel);
        PostPageModel createFromParcel33 = PostPageModel.CREATOR.createFromParcel(parcel);
        FollowUpPublishTrackerModel createFromParcel34 = FollowUpPublishTrackerModel.CREATOR.createFromParcel(parcel);
        PostLandingModel createFromParcel35 = PostLandingModel.CREATOR.createFromParcel(parcel);
        PublishPreviewModel createFromParcel36 = PublishPreviewModel.CREATOR.createFromParcel(parcel);
        DraftInfoModel createFromParcel37 = DraftInfoModel.CREATOR.createFromParcel(parcel);
        MicDataModel createFromParcel38 = MicDataModel.CREATOR.createFromParcel(parcel);
        CheckPointModel createFromParcel39 = CheckPointModel.CREATOR.createFromParcel(parcel);
        LoudnessBalanceModel createFromParcel40 = LoudnessBalanceModel.CREATOR.createFromParcel(parcel);
        AudioAlgorithmModel createFromParcel41 = AudioAlgorithmModel.CREATOR.createFromParcel(parcel);
        AudioVolumeAdjustModel createFromParcel42 = AudioVolumeAdjustModel.CREATOR.createFromParcel(parcel);
        AudioCopyrightDetectModel createFromParcel43 = AudioCopyrightDetectModel.CREATOR.createFromParcel(parcel);
        PrePublishEntranceModel createFromParcel44 = PrePublishEntranceModel.CREATOR.createFromParcel(parcel);
        VoiceConversionModel createFromParcel45 = VoiceConversionModel.CREATOR.createFromParcel(parcel);
        TTSAndVCRefIDsModel createFromParcel46 = TTSAndVCRefIDsModel.CREATOR.createFromParcel(parcel);
        TTSModel createFromParcel47 = TTSModel.CREATOR.createFromParcel(parcel);
        StreamVoiceConversionModel createFromParcel48 = StreamVoiceConversionModel.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = NowsShootModel.CREATOR.createFromParcel(parcel);
        }
        NowsShootModel nowsShootModel = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = DMMediaModel.CREATOR.createFromParcel(parcel);
        }
        DMMediaModel dMMediaModel = createFromParcel3;
        EffectDataTransport createFromParcel49 = EffectDataTransport.CREATOR.createFromParcel(parcel);
        CreativePublishPermissionModel createFromParcel50 = CreativePublishPermissionModel.CREATOR.createFromParcel(parcel);
        CommerceToolsModel commerceToolsModel = (CommerceToolsModel) parcel.readParcelable(CreativeModel.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = InlineCaptionModel.CREATOR.createFromParcel(parcel);
        }
        InlineCaptionModel inlineCaptionModel = createFromParcel4;
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = InlineCaptionExperimentInformation.CREATOR.createFromParcel(parcel);
        }
        InlineCaptionExperimentInformation inlineCaptionExperimentInformation = createFromParcel5;
        AutoCutModel createFromParcel51 = AutoCutModel.CREATOR.createFromParcel(parcel);
        AutoCutAnchorModel createFromParcel52 = AutoCutAnchorModel.CREATOR.createFromParcel(parcel);
        UgcTemplateData createFromParcel53 = UgcTemplateData.CREATOR.createFromParcel(parcel);
        PUgcTemplateData createFromParcel54 = PUgcTemplateData.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = EditPostModel.CREATOR.createFromParcel(parcel);
        }
        EditPostModel editPostModel = createFromParcel6;
        if (parcel.readInt() == 0) {
            createFromParcel7 = null;
        } else {
            createFromParcel7 = Video2StickerModel.CREATOR.createFromParcel(parcel);
        }
        Video2StickerModel video2StickerModel = createFromParcel7;
        UploadPreviewClipModel createFromParcel55 = UploadPreviewClipModel.CREATOR.createFromParcel(parcel);
        TrendingUploadModel createFromParcel56 = TrendingUploadModel.CREATOR.createFromParcel(parcel);
        HDRModel createFromParcel57 = HDRModel.CREATOR.createFromParcel(parcel);
        VEBytevc1Model createFromParcel58 = VEBytevc1Model.CREATOR.createFromParcel(parcel);
        CommonMobParamModel createFromParcel59 = CommonMobParamModel.CREATOR.createFromParcel(parcel);
        PrivacySettingModel createFromParcel60 = PrivacySettingModel.CREATOR.createFromParcel(parcel);
        ChangeAvatarModel createFromParcel61 = ChangeAvatarModel.CREATOR.createFromParcel(parcel);
        OnThisDayData createFromParcel62 = OnThisDayData.CREATOR.createFromParcel(parcel);
        MusicShareStoryData createFromParcel63 = MusicShareStoryData.CREATOR.createFromParcel(parcel);
        H9G h9g = (H9G) parcel.readSerializable();
        StickerNewEngineModel createFromParcel64 = StickerNewEngineModel.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            createFromParcel8 = null;
        } else {
            createFromParcel8 = PublishItemTrackModel.CREATOR.createFromParcel(parcel);
        }
        PublishItemTrackModel publishItemTrackModel = createFromParcel8;
        MagicCombineEffectModel createFromParcel65 = MagicCombineEffectModel.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            forwardEditPublishData = ForwardEditPublishData.CREATOR.createFromParcel(parcel);
        }
        return new CreativeModel(createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, createFromParcel16, createFromParcel17, createFromParcel18, createFromParcel19, cutSameModel, createFromParcel20, createFromParcel21, createFromParcel22, createFromParcel23, createFromParcel24, createFromParcel25, createFromParcel26, createFromParcel27, createFromParcel28, createFromParcel29, createFromParcel30, createFromParcel31, createFromParcel32, createFromParcel33, createFromParcel34, createFromParcel35, createFromParcel36, createFromParcel37, createFromParcel38, createFromParcel39, createFromParcel40, createFromParcel41, createFromParcel42, createFromParcel43, createFromParcel44, createFromParcel45, createFromParcel46, createFromParcel47, createFromParcel48, nowsShootModel, dMMediaModel, createFromParcel49, createFromParcel50, commerceToolsModel, inlineCaptionModel, inlineCaptionExperimentInformation, createFromParcel51, createFromParcel52, createFromParcel53, createFromParcel54, editPostModel, video2StickerModel, createFromParcel55, createFromParcel56, createFromParcel57, createFromParcel58, createFromParcel59, createFromParcel60, createFromParcel61, createFromParcel62, createFromParcel63, h9g, createFromParcel64, publishItemTrackModel, createFromParcel65, forwardEditPublishData, PaidContentVideoModel.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final CreativeModel[] newArray(int i) {
        return new CreativeModel[i];
    }
}
