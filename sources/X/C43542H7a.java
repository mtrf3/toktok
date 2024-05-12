package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.VolumeInfoModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.video2sticker.OriginVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftAwemeCompat;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.vesdk.VEUtils;
import defpackage.b1;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.H7a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43542H7a {
    public C43542H7a(String str) {
        FP1.LJ("VideoPublishEditModelBridge; owner : ", str);
    }

    public static VideoPublishEditModel LIZJ(AwemeDraft awemeDraft) {
        int i;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        InterfaceC43592H8y c44375HbH;
        String str;
        ClientCherEffectParam clientCherEffectParam;
        DraftCherEffectParam draftCherEffectParam;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        List<EditVideoSegment> videoList;
        o.LJIIIZ(awemeDraft, "<this>");
        EditPreviewInfo LIZJ = C41802Gas.LIZJ(awemeDraft);
        if (LIZJ != null && (videoList = LIZJ.getVideoList()) != null) {
            for (EditVideoSegment editVideoSegment : videoList) {
                StringBuilder LIZJ2 = b1.LIZJ("convertFromDraft", " -> getPreviewInfo: videoPath = ");
                LIZJ2.append(editVideoSegment.getVideoPath());
                LIZJ2.append('.');
                GPR.LIZ("VideoPublishEditModelBridge -> ", X1D.LIZIZ(LIZJ2));
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJI.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                StringBuilder LIZJ3 = b1.LIZJ("convertFromDraft", " -> RecordData: videoPath = ");
                LIZJ3.append(multiEditVideoSegmentRecordData.videoPath);
                LIZJ3.append("draftVideoPath = ");
                LIZJ3.append(multiEditVideoSegmentRecordData.draftVideoPath);
                GPR.LIZ("VideoPublishEditModelBridge -> ", X1D.LIZIZ(LIZJ3));
                arrayList.add(C76800UCe.LIZ);
            }
        }
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creativeModel = awemeDraft.LIZ;
        C44384HbQ.LLIIIJ(videoPublishEditModel);
        I9T.LJI(awemeDraft.LIZLLL, awemeDraft.LJJJJI.isPhotoMvMode, videoPublishEditModel.creativeModel.musicBuzModel);
        videoPublishEditModel.setConvertFromDraft(true);
        videoPublishEditModel.setPreviewInfo(C41802Gas.LIZJ(awemeDraft));
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        videoPublishEditModel.uploadMethod = aVDraftExtras.uploadMethod;
        videoPublishEditModel.uploadTabNameList = aVDraftExtras.uploadTabNameList;
        videoPublishEditModel.canvasVideoData = aVDraftExtras.canvasVideoData;
        videoPublishEditModel.isPhotoMvMode = aVDraftExtras.isPhotoMvMode;
        if (awemeDraft.LJIIL()) {
            MvCreateVideoData mvCreateVideoData = awemeDraft.LJJJJI.mvCreateVideoData;
            videoPublishEditModel.mvCreateVideoData = mvCreateVideoData;
            if (mvCreateVideoData != null && mvCreateVideoData.mvType == 1) {
                videoPublishEditModel.setVideoEditorType(3);
            } else {
                videoPublishEditModel.setVideoEditorType(2);
            }
            AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJI;
            videoPublishEditModel.uploadMiscInfoStruct = aVDraftExtras2.avUploadMiscInfoStruct;
            videoPublishEditModel.templateId = aVDraftExtras2.mvCreateVideoData.mvId;
        }
        if (awemeDraft.LJJJJI.canvasVideoData != null) {
            videoPublishEditModel.setVideoEditorType(11);
        }
        AVDraftExtras aVDraftExtras3 = awemeDraft.LJJJJI;
        boolean z4 = aVDraftExtras3.isStickPointMode;
        videoPublishEditModel.isStickPointMode = z4;
        if (z4) {
            videoPublishEditModel.stickPointData = aVDraftExtras3.stickPointData;
        }
        videoPublishEditModel.containBackgroundVideo = aVDraftExtras3.containBackgroundVideo;
        videoPublishEditModel.setBackgroundVideoDraftDir(aVDraftExtras3.backgroundVideoDraftDir);
        videoPublishEditModel.isFastImport = awemeDraft.LJJJJI.isFastImport;
        videoPublishEditModel.setTitle(awemeDraft.aweme.desc);
        videoPublishEditModel.setChain(awemeDraft.aweme.titleChain);
        videoPublishEditModel.challenges = awemeDraft.aweme.challengeList;
        videoPublishEditModel.setTextStickerChallenges(videoPublishEditModel.getTextStickerChallenges());
        AVDraftExtras aVDraftExtras4 = awemeDraft.LJJJJI;
        videoPublishEditModel.commentVideoModel = aVDraftExtras4.commentVideoModel;
        videoPublishEditModel.qaStruct = aVDraftExtras4.qaStruct;
        videoPublishEditModel.hasQaSticker = Boolean.valueOf(videoPublishEditModel.isQaAnswer());
        AVDraftExtras aVDraftExtras5 = awemeDraft.LJJJJI;
        videoPublishEditModel.isWestWindowExistStr = aVDraftExtras5.isWestWindowExistStr;
        CreativeFlowData creativeFlowData = aVDraftExtras5.creativeFlowData;
        if (creativeFlowData != null) {
            videoPublishEditModel.creativeFlowData = creativeFlowData;
        }
        videoPublishEditModel.setSharedARModel(aVDraftExtras5.sharedARModel);
        videoPublishEditModel.setStructList(awemeDraft.aweme.textExtra);
        videoPublishEditModel.setMusicId(C78841Uwv.LJIILLIIL(awemeDraft.LIZLLL));
        videoPublishEditModel.setMusicRequestId(C78841Uwv.LJIIZILJ(awemeDraft.LIZLLL));
        videoPublishEditModel.setMMusicPath(awemeDraft.LJI);
        videoPublishEditModel.setMMusicStart(awemeDraft.LJIILIIL);
        AVDraftExtras aVDraftExtras6 = awemeDraft.LJJJJI;
        if (aVDraftExtras6 == null) {
            i = 0;
        } else {
            i = aVDraftExtras6.musicEnd;
        }
        videoPublishEditModel.setMMusicEnd(i);
        videoPublishEditModel.setMusicOrigin(awemeDraft.LJJJJI.musicOrigin);
        AVMusic aVMusic = awemeDraft.LIZLLL;
        if (aVMusic != null && aVMusic.musicType == 2) {
            videoPublishEditModel.setIsReuseOriginalSound(true);
            videoPublishEditModel.setReuseOriginalSoundId(aVMusic.getMusicId());
            videoPublishEditModel.setReuseOriginalSoundLength(aVMusic.getShootDuration());
            videoPublishEditModel.setReuseOriginalSoundUrls(aVMusic.getReuseAudioPlayUrl());
        }
        videoPublishEditModel.mSelectedId = awemeDraft.LJIIL;
        AVDraftExtras aVDraftExtras7 = awemeDraft.LJJJJI;
        videoPublishEditModel.mRecordFilterIds = aVDraftExtras7.recordFilterIds;
        videoPublishEditModel.mRecordFilterLabels = aVDraftExtras7.recordFilterNames;
        videoPublishEditModel.mRecordFilterValues = aVDraftExtras7.recordFilterValues;
        videoPublishEditModel.mBeautyMobParam = aVDraftExtras7.recordBeautyMobParam;
        videoPublishEditModel.mSelectedFilterId = aVDraftExtras7.selectedFilterId;
        videoPublishEditModel.mSelectedFilterLabel = aVDraftExtras7.selectedFilterLabel;
        videoPublishEditModel.mSelectedFilterResId = aVDraftExtras7.selectedFilterResId;
        videoPublishEditModel.mFaceBeauty = awemeDraft.LJJIII;
        videoPublishEditModel.mCameraPosition = awemeDraft.LJIJJLI;
        videoPublishEditModel.mCurFilterLabels = awemeDraft.LJIJJ;
        videoPublishEditModel.mCurFilterIds = aVDraftExtras7.filterId;
        videoPublishEditModel.mOrigin = awemeDraft.LJIILL;
        videoPublishEditModel.mVideoSegmentsDesc = awemeDraft.LJJIIJZLJL;
        videoPublishEditModel.mHardEncode = awemeDraft.LJJIIZ;
        videoPublishEditModel.mStickerID = awemeDraft.LJJIJIIJI;
        videoPublishEditModel.isPrivate = awemeDraft.LJJI;
        videoPublishEditModel.excludeUserList = aVDraftExtras7.excludeUserList;
        videoPublishEditModel.allowRecommend = aVDraftExtras7.allowRecommend;
        videoPublishEditModel.geofencingSetting = aVDraftExtras7.geoFencingData;
        videoPublishEditModel.commentSetting = aVDraftExtras7.commentSetting;
        videoPublishEditModel.reactDuetSetting = aVDraftExtras7.duetSetting;
        videoPublishEditModel.stitchSetting = aVDraftExtras7.stitchSetting;
        videoPublishEditModel.maxDuration = awemeDraft.LJJII;
        videoPublishEditModel.audioTrack = awemeDraft.LJIJ;
        videoPublishEditModel.videoSpeed = awemeDraft.LJIIZILJ;
        AVDraftExtras aVDraftExtras8 = awemeDraft.LJJJJI;
        videoPublishEditModel.cameraIds = aVDraftExtras8.cameraIds;
        videoPublishEditModel.beautyType = aVDraftExtras8.beautyType;
        videoPublishEditModel.mBeautyMetadatas = aVDraftExtras8.beautyMetadata;
        videoPublishEditModel.mUploadPath = aVDraftExtras8.uploadPath;
        videoPublishEditModel.importInfoList = aVDraftExtras8.importVideoInfos;
        videoPublishEditModel.metadataMap = aVDraftExtras8.videoPartMetadata;
        videoPublishEditModel.mShoutOutsData = aVDraftExtras8.shoutOutsData;
        C78934UyQ.LJLIL.getCommerceService().getClass();
        String str2 = awemeDraft.LJJJJI.commerceData;
        PublishExtensionModel fromString = PublishExtensionModel.fromString("");
        fromString.shopOrderShareStructInfo = PublishExtensionModel.fromString(str2).shopOrderShareStructInfo;
        videoPublishEditModel.commerceData = PublishExtensionModel.toString(fromString);
        videoPublishEditModel.mSelectedFilterIntensity = awemeDraft.LJFF();
        videoPublishEditModel.setVideoLength(awemeDraft.aweme.videoLength);
        videoPublishEditModel.recordBgmDelay = awemeDraft.LJJJJI.recordBgmDelay.intValue();
        AVDraftExtras aVDraftExtras9 = awemeDraft.LJJJJI;
        videoPublishEditModel.loudnessBalanceParam = aVDraftExtras9.loudnessParam;
        videoPublishEditModel.mVideoCoverStartTm = awemeDraft.LJJIJLIJ;
        videoPublishEditModel.setVideoCoverPath(aVDraftExtras9.videoCoverPath);
        AVDraftExtras aVDraftExtras10 = awemeDraft.LJJJJI;
        videoPublishEditModel.mOutVideoWidth = aVDraftExtras10.videoOutWidth;
        videoPublishEditModel.mOutVideoHeight = aVDraftExtras10.videoOutHeight;
        videoPublishEditModel.mVideoCanvasWidth = aVDraftExtras10.videoCanvasWidth;
        videoPublishEditModel.mVideoCanvasHeight = aVDraftExtras10.videoCanvasHeight;
        if (awemeDraft.LIZLLL != null) {
            C78934UyQ.LJLIL.getBridgeService().getClass();
            videoPublishEditModel.setMId3Album(awemeDraft.LIZLLL.getAlbum());
            videoPublishEditModel.setMId3Author(awemeDraft.LIZLLL.getSinger());
            if (awemeDraft.LIZLLL.getCoverThumb() != null && !C78886Uxe.LJJIJ(awemeDraft.LIZLLL.getCoverThumb().getUrlList())) {
                videoPublishEditModel.setMusicCover((String) ListProtector.get(awemeDraft.LIZLLL.getCoverThumb().getUrlList(), 0));
            }
            videoPublishEditModel.setMId3Title(awemeDraft.LIZLLL.getName());
            videoPublishEditModel.setMMusicType(C78934UyQ.LJLIL.getMusicService().isMusicTypeLocal(awemeDraft.LIZLLL.getMusicType()) ? 1 : 0);
            videoPublishEditModel.setPreviewStartTime(awemeDraft.LIZLLL.getPreviewStartTime());
        }
        videoPublishEditModel.mDuetFrom = awemeDraft.LJJIL;
        videoPublishEditModel.mSyncPlatforms = awemeDraft.LJJIZ;
        AVDraftExtras aVDraftExtras11 = awemeDraft.LJJJJI;
        int i2 = aVDraftExtras11.from;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModel.mFromMultiCut = z;
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        videoPublishEditModel.mFromCut = z2;
        videoPublishEditModel.mShootMode = aVDraftExtras11.shootMode;
        videoPublishEditModel.microAppId = aVDraftExtras11.microAppId;
        videoPublishEditModel.microAppModel = aVDraftExtras11.microAppInfo;
        videoPublishEditModel.creativeInfo = awemeDraft.LIZIZ();
        AVDraftExtras aVDraftExtras12 = awemeDraft.LJJJJI;
        videoPublishEditModel.draftId = aVDraftExtras12.draftId;
        videoPublishEditModel.newDraftId = aVDraftExtras12.newDraftId;
        int i3 = awemeDraft.LJJIJL;
        C60903NvH.LJIIJJI().LJJJI().LJIIIIZZ();
        float f3 = 0.0f;
        if (i3 == 3) {
            VolumeInfoModel volumeInfoModel = awemeDraft.LIZ.volumeInfoModel;
            float f4 = volumeInfoModel.musicVolume;
            if (f4 > 0.0f) {
                float f5 = volumeInfoModel.videoVolume;
                if (f5 > 0.0f) {
                    videoPublishEditModel.voiceVolume = (f5 * WUK.LJIJ) / 100.0f;
                    videoPublishEditModel.musicVolume = (f4 * WUK.LJIJJ) / 100.0f;
                }
            }
            videoPublishEditModel.voiceVolume = (awemeDraft.LJIIIIZZ * WUK.LJIJ) / 100.0f;
            videoPublishEditModel.musicVolume = (awemeDraft.LJIIIZ * WUK.LJIJJ) / 100.0f;
        } else {
            if (videoPublishEditModel.hasOriginalSound()) {
                f = WUK.LJIIZILJ;
            } else {
                f = 0.0f;
            }
            videoPublishEditModel.voiceVolume = f;
            if (videoPublishEditModel.isMusic() > 0) {
                f2 = WUK.LJIJI;
            } else {
                f2 = 0.0f;
            }
            videoPublishEditModel.musicVolume = f2;
        }
        AVDraftExtras aVDraftExtras13 = awemeDraft.LJJJJI;
        videoPublishEditModel.mShootWay = aVDraftExtras13.shootWay;
        videoPublishEditModel.autoEnhanceType = aVDraftExtras13.autoEnhanceType;
        videoPublishEditModel.autoEnhanceOn = aVDraftExtras13.autoEnhanceOn;
        videoPublishEditModel.setShootFrom(aVDraftExtras13.shootFrom);
        AVDraftExtras aVDraftExtras14 = awemeDraft.LJJJJI;
        videoPublishEditModel.mDurationMode = aVDraftExtras14.durationMode;
        videoPublishEditModel.mIsMultiVideo = aVDraftExtras14.isMultiVideo;
        videoPublishEditModel.setNewVersion(awemeDraft.LJJIJL);
        AVDraftExtras aVDraftExtras15 = awemeDraft.LJJJJI;
        if (aVDraftExtras15 != null) {
            z3 = aVDraftExtras15.isMuted;
        } else {
            z3 = false;
        }
        videoPublishEditModel.isMuted = z3;
        if (!z3) {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = aVDraftExtras15.recordMode;
        videoPublishEditModel.gameScore = aVDraftExtras15.gameScore;
        ExtractFramesModel extractFramesModel = aVDraftExtras15.extractFramesModel;
        AudioEffectParam audioEffectParam = null;
        if (extractFramesModel == null) {
            extractFramesModel = null;
        }
        videoPublishEditModel.extractFramesModel = extractFramesModel;
        videoPublishEditModel.setSaveModel(aVDraftExtras15.uploadSaveModel);
        videoPublishEditModel.infoStickerModel = awemeDraft.LJI();
        AVDraftExtras aVDraftExtras16 = awemeDraft.LJJJJI;
        videoPublishEditModel.videoType = aVDraftExtras16.videoType;
        videoPublishEditModel.usePaint = aVDraftExtras16.usePaint;
        videoPublishEditModel.texts = aVDraftExtras16.texts;
        videoPublishEditModel.socialModel = aVDraftExtras16.socialModel;
        Workspace LIZ = C41727GZf.LIZ(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = LIZ.LLLLLLLLLL().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = LIZ.LLJJJIL().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = LIZ.LLLLLLLLL().getPath();
        AVDraftExtras aVDraftExtras17 = awemeDraft.LJJJJI;
        if (aVDraftExtras17 == null) {
            c44375HbH = H83.LIZ;
        } else {
            c44375HbH = new C44375HbH(aVDraftExtras17);
        }
        C43587H8t.LIZJ(c44375HbH, new C44224HXg(videoPublishEditModel), EnumC43590H8w.DRAFT, EnumC43590H8w.PUBLISH);
        videoPublishEditModel.setStickPointType(awemeDraft.LJJJJI.stickPointType);
        AVDraftExtras aVDraftExtras18 = awemeDraft.LJJJJI;
        if (aVDraftExtras18 == null) {
            str = null;
        } else {
            str = aVDraftExtras18.firstStickerMusicIds;
        }
        videoPublishEditModel.mFirstStickerMusicIdsJson = str;
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(awemeDraft.LIZJ(), C41802Gas.LJ(awemeDraft));
        AVDraftExtras aVDraftExtras19 = awemeDraft.LJJJJI;
        if (aVDraftExtras19 == null || (draftCherEffectParam = aVDraftExtras19.draftCherEffectParam) == null) {
            clientCherEffectParam = null;
        } else {
            clientCherEffectParam = new ClientCherEffectParam(draftCherEffectParam.matrix, draftCherEffectParam.duration, draftCherEffectParam.segUseCher);
        }
        videoPublishEditModel.veCherEffectParam = clientCherEffectParam;
        if (awemeDraft.LJJJJI != null && awemeDraft.LIZLLL() != null) {
            DraftVEAudioEffectParam LIZLLL = awemeDraft.LIZLLL();
            String str3 = LIZLLL.uploadId;
            if (str3 == null) {
                str3 = "";
            }
            audioEffectParam = new AudioEffectParam(str3, LIZLLL.trackType, LIZLLL.trackIndex, LIZLLL.effectPath, LIZLLL.effectTag, LIZLLL.seqIn, LIZLLL.seqOut, null, LIZLLL.challenge, LIZLLL.challenges);
        }
        videoPublishEditModel.veAudioEffectParam = audioEffectParam;
        videoPublishEditModel.stickerChallenge = awemeDraft.LJJJJI.stickerChallenge;
        if (H8T.LIZ()) {
            videoPublishEditModel.veAudioRecorderParam = awemeDraft.LJJJJI.audioRecorderParam;
        }
        AVDraftExtras aVDraftExtras20 = awemeDraft.LJJJJI;
        videoPublishEditModel.multiEditVideoRecordData = aVDraftExtras20.multiEditVideoData;
        videoPublishEditModel.supportRetake = aVDraftExtras20.supportRetake;
        videoPublishEditModel.videoCount = aVDraftExtras20.videoCount;
        videoPublishEditModel.photoCount = aVDraftExtras20.photoCount;
        videoPublishEditModel.pic2VideoSource = aVDraftExtras20.pic2VideoSource;
        videoPublishEditModel.allowDownloadSetting = aVDraftExtras20.downloadSetting;
        videoPublishEditModel.setUseMusicBeforeEdit(aVDraftExtras20.useMusicBeforeEdit);
        StitchParams stitchParams = awemeDraft.LJJJJI.stitchParams;
        if (stitchParams != null) {
            videoPublishEditModel.stitchParams = stitchParams;
        }
        if (awemeDraft.LJIIL()) {
            MvCreateVideoData mvCreateVideoData2 = awemeDraft.LJJJJI.mvCreateVideoData;
            videoPublishEditModel.mvCreateVideoData = mvCreateVideoData2;
            if (mvCreateVideoData2 != null && mvCreateVideoData2.mvType == 1) {
                videoPublishEditModel.setVideoEditorType(3);
            } else {
                videoPublishEditModel.setVideoEditorType(2);
            }
            videoPublishEditModel.uploadMiscInfoStruct = awemeDraft.LJJJJI.avUploadMiscInfoStruct;
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.setVideoEditorType(4);
        } else if (videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.setVideoEditorType(7);
        } else if (H7R.LJJJ(videoPublishEditModel)) {
            videoPublishEditModel.setVideoEditorType(10);
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.setVideoEditorType(6);
        }
        videoPublishEditModel.creationMode = awemeDraft.LJJJJI.creationMode;
        C139895eL.LIZIZ = H7R.LJJJJL(videoPublishEditModel);
        if (H7R.LJJJJL(videoPublishEditModel)) {
            videoPublishEditModel.setImageAlbumData(awemeDraft.LJJJJI.imageAlbumData);
        }
        AVDraftExtras aVDraftExtras21 = awemeDraft.LJJJJI;
        videoPublishEditModel.heading = aVDraftExtras21.heading;
        videoPublishEditModel.setMainBusinessData(aVDraftExtras21.mainBusinessData);
        AVDraftExtras aVDraftExtras22 = awemeDraft.LJJJJI;
        videoPublishEditModel.stickerInfo = aVDraftExtras22.stickerInfo;
        videoPublishEditModel.duetLayout = aVDraftExtras22.duetLayout;
        videoPublishEditModel.draftDuetExtraInfo = aVDraftExtras22.duetExtraInfo;
        videoPublishEditModel.cutSameEditData = aVDraftExtras22.cutSameData;
        if (videoPublishEditModel.isCutSameVideoType()) {
            videoPublishEditModel.uploadMiscInfoStruct = awemeDraft.LJJJJI.avUploadMiscInfoStruct;
        }
        AVDraftExtras aVDraftExtras23 = awemeDraft.LJJJJI;
        videoPublishEditModel.mentionTextList = aVDraftExtras23.mentionTextList;
        videoPublishEditModel.hashTagTextList = aVDraftExtras23.hashTagTextList;
        videoPublishEditModel.setCommerceMusic(aVDraftExtras23.commerceMusic);
        AVDraftExtras aVDraftExtras24 = awemeDraft.LJJJJI;
        videoPublishEditModel.libraryMaterialList = aVDraftExtras24.libraryMaterialList;
        videoPublishEditModel.cameraLensInfo = aVDraftExtras24.cameraLensInfo;
        videoPublishEditModel.isDuetGreenSrceen = aVDraftExtras24.isDuetGreenSrceen;
        videoPublishEditModel.isPhotoMvMusic = aVDraftExtras24.isPhotoMvMusic;
        videoPublishEditModel.isPhotoMvMode1080p = aVDraftExtras24.isPhotoMvMode1080p;
        videoPublishEditModel.setDraftMusicIllegal(aVDraftExtras24.isDraftMusicIllegal);
        if (TextUtils.isEmpty(awemeDraft.LJJJJI.isSoundLoop)) {
            videoPublishEditModel.setIsSoundLoop(Boolean.FALSE);
        } else {
            videoPublishEditModel.setIsSoundLoop(Boolean.valueOf(TextUtils.equals("on", awemeDraft.LJJJJI.isSoundLoop)));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SoundLoop, convertFromDraft ");
        LIZ2.append(videoPublishEditModel.getIsSoundLoop());
        H78.LIZ(X1D.LIZIZ(LIZ2));
        videoPublishEditModel.setCoverPublishModel(awemeDraft.LJJJJI.coverPublishModel);
        List<String> list2 = awemeDraft.LJJJJI.messageBubbleTexts;
        if (!C78886Uxe.LJJIJ(list2)) {
            videoPublishEditModel.messageBubbleTexts = C61328O5c.LJ(list2);
        }
        long j = videoPublishEditModel.audioAecDelayTime;
        AVDraftExtras aVDraftExtras25 = awemeDraft.LJJJJI;
        aVDraftExtras25.audioAecDelayTime = j;
        videoPublishEditModel.currentZoomValue = aVDraftExtras25.currentZoomValue;
        videoPublishEditModel.mShootedShootMode = aVDraftExtras25.shootedShootMode;
        videoPublishEditModel.allowAutoCaptionSetting = aVDraftExtras25.enableAutoCaption;
        videoPublishEditModel.autoCaptionLang = aVDraftExtras25.autoCaptionLang;
        videoPublishEditModel.mDuetFromDuetButton = aVDraftExtras25.duetFromDuetButton;
        videoPublishEditModel.publishStage = aVDraftExtras25.publishStage;
        videoPublishEditModel.tagUserList = aVDraftExtras25.tagUserList;
        videoPublishEditModel.audioEnhanceParam = aVDraftExtras25.audioEnhanceParam;
        videoPublishEditModel.autoAttachedAnchor = aVDraftExtras25.autoAttachedAnchor;
        videoPublishEditModel.openPlatformExtra = aVDraftExtras25.openplatformExtra;
        videoPublishEditModel.openPlatformClientKey = aVDraftExtras25.openplatformClientKey;
        videoPublishEditModel.editMusicSyncMode = aVDraftExtras25.editMusicSyncMode;
        videoPublishEditModel.soundSyncFromAnchor = aVDraftExtras25.soundSyncFromAnchor;
        videoPublishEditModel.cut2EditTransferModel = aVDraftExtras25.cut2EditTransferModel;
        videoPublishEditModel.nleData = awemeDraft.LJIIJ;
        videoPublishEditModel.draftSaveTime = awemeDraft.saveTime;
        videoPublishEditModel.isStoryEditMode = aVDraftExtras25.isStoryDraft;
        String str4 = aVDraftExtras25.fromItemId;
        videoPublishEditModel.fromItemId = str4;
        videoPublishEditModel.setDuetModeType(aVDraftExtras25.duetModeType);
        C78983UzD.LJLJL = str4;
        videoPublishEditModel.creativeFlowData.getCreativeDurationExtra().setStartEditDraftTime(System.currentTimeMillis());
        videoPublishEditModel.setApplyVoiceToAllTextSwitch(awemeDraft.LJJJJI.applyVoiceToAllTextSwitch);
        AVDraftExtras aVDraftExtras26 = awemeDraft.LJJJJI;
        videoPublishEditModel.publishRetainType = aVDraftExtras26.publishRetainType;
        videoPublishEditModel.propOrder = aVDraftExtras26.propOrder;
        videoPublishEditModel.hasMultiAudioLoudnessNormalization = aVDraftExtras26.hasMultiAudioLoudnessNormalization;
        return videoPublishEditModel;
    }

    public static AwemeDraft LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        return LJ(videoPublishEditModel, "");
    }

    public static VideoPublishEditModel LJI(Bundle bundle) {
        int i;
        float f;
        float f2;
        float f3;
        ArrayList<LibraryMaterialInfoSv> libraryMaterials;
        ArrayList<TimeSpeedModelExtension> arrayList;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.nleData = bundle.getString("NLE");
        videoPublishEditModel.creativeInfo = C77412UZs.LJIJJ(bundle);
        videoPublishEditModel.creativeModel = C78996UzQ.LJIILLIIL(bundle);
        boolean z = true;
        videoPublishEditModel.creationMode = bundle.getInt("creation_mode", 1);
        videoPublishEditModel.uploadMethod = bundle.getString("upload_method");
        videoPublishEditModel.uploadTabNameList = bundle.getStringArrayList("upload_tab_name");
        videoPublishEditModel.albumPreviewNextMethod = bundle.getString("upload_next_method");
        videoPublishEditModel.setPreviewInfo((EditPreviewInfo) bundle.getParcelable("extra_edit_preview_info"));
        videoPublishEditModel.setAvetParameter(AVETParameterKt.generateAVETParam(bundle));
        Workspace workspace = (Workspace) bundle.getParcelable("workspace");
        videoPublishEditModel.mWorkspace = workspace;
        if (workspace == null) {
            videoPublishEditModel.mWorkspace = HU5.LIZ(videoPublishEditModel.creativeInfo);
        }
        if (bundle.containsKey("extra_multi_edit_video_data")) {
            videoPublishEditModel.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) bundle.getParcelable("extra_multi_edit_video_data");
        }
        videoPublishEditModel.allowAutoCaptionSetting = bundle.getInt("extra_auto_caption_setting", 1);
        videoPublishEditModel.mFromCut = bundle.getBoolean("fromCut", false);
        videoPublishEditModel.mFromMultiCut = bundle.getBoolean("fromMultiCut", false);
        videoPublishEditModel.mEncodedAudioOutputFile = videoPublishEditModel.mWorkspace.LLLLLLLLL().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = videoPublishEditModel.mWorkspace.LLJJJIL().getPath();
        videoPublishEditModel.mFaceBeauty = bundle.getInt("face_beauty", 0);
        videoPublishEditModel.faceBeautyOpen = bundle.getBoolean("face_beauty_open", false);
        if (bundle.containsKey("extra_beauty_data")) {
            videoPublishEditModel.mBeautyMetadatas = bundle.getParcelableArrayList("extra_beauty_data");
        }
        videoPublishEditModel.mSelectedId = bundle.getInt("filter_id", 0);
        videoPublishEditModel.mSelectedFilterId = bundle.getString("selected_filter_id");
        videoPublishEditModel.mSelectedFilterLabel = bundle.getString("selected_filter_name");
        videoPublishEditModel.mSelectedFilterResId = bundle.getString("selected_filter_res_id");
        videoPublishEditModel.mSelectedFilterIntensity = bundle.getFloat("extra_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mRecordVideoSelectedFilterIndex = bundle.getInt("extra_record_video_selected_filter_index", 0);
        videoPublishEditModel.mRecordVideoSelectedFilterIntensity = bundle.getFloat("extra_record_video_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mCameraPosition = bundle.getInt("camera", 0);
        videoPublishEditModel.mRecordFilterIds = bundle.getString("record_filter_ids");
        videoPublishEditModel.mRecordFilterLabels = bundle.getString("record_filter_names");
        videoPublishEditModel.mRecordFilterValues = bundle.getString("record_filter_values");
        videoPublishEditModel.mBeautyMobParam = (BeautyMobParam) bundle.getParcelable("record_beauty_mob_param");
        videoPublishEditModel.mCurFilterLabels = bundle.getString("filter_lables");
        videoPublishEditModel.mCurFilterIds = bundle.getString("filter_ids");
        videoPublishEditModel.mSmoothSkinLabels = bundle.getString("smooth_skin_labels");
        videoPublishEditModel.mReshapeLabels = bundle.getString("smooth_reshape_labels");
        videoPublishEditModel.mTanningLabels = bundle.getString("smooth_tanning_labels");
        videoPublishEditModel.mEyesLabels = bundle.getString("smooth_eyes_labels");
        videoPublishEditModel.recordBgmDelay = bundle.getInt("record_bgm_delay", 0);
        videoPublishEditModel.loudnessBalanceParam = (LoudnessBalanceParam) bundle.getParcelable("edit_loudness_param");
        videoPublishEditModel.commentVideoModel = (CommentVideoModel) bundle.getSerializable("comment_video_model");
        videoPublishEditModel.ttsVoiceModel = (TTSVoiceModel) bundle.getSerializable("extra_tts_voice_model");
        videoPublishEditModel.qaStruct = (QaStruct) bundle.getSerializable("question_answer_video_model");
        videoPublishEditModel.qaStickerModel = (QAStickerModel) bundle.getParcelable("question_answer_video_model_new");
        videoPublishEditModel.libraryMaterialInfo = (LibraryMaterialInfoSv) bundle.getSerializable("library_video_model");
        videoPublishEditModel.extraEventParams = (HashMap) bundle.getSerializable("extra_event_params");
        videoPublishEditModel.hasQaSticker = Boolean.valueOf(videoPublishEditModel.isQaAnswer());
        videoPublishEditModel.setSharedARModel((SharedARModel) bundle.getParcelable("extra_shared_ar_effect"));
        videoPublishEditModel.videoSpeed = bundle.getString("extra_aweme_speed");
        videoPublishEditModel.cameraIds = bundle.getString("extra_av_camera_ids");
        videoPublishEditModel.beautyType = bundle.getInt("extra_beauty_type", 0);
        videoPublishEditModel.metadataMap = C63872f1.LIZ(bundle.getString("extra_video_record_metadata"));
        if (videoPublishEditModel.mWorkspace.getMusicPath() != null) {
            videoPublishEditModel.setMMusicPath(videoPublishEditModel.mWorkspace.getMusicPath());
            videoPublishEditModel.setMMusicStart(bundle.getInt("music_start", 0));
            videoPublishEditModel.setMMusicEnd(bundle.getInt("extra_music_end", 0));
        } else {
            videoPublishEditModel.setMMusicPath(null);
            videoPublishEditModel.setMMusicStart(0);
            videoPublishEditModel.setMMusicEnd(0);
        }
        videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.LLLLLLLLLL().getPath();
        if (bundle.getBoolean("enable_music_path_check", true) && videoPublishEditModel.getMMusicPath() == null && !videoPublishEditModel.isRetakeVideo()) {
            I9T.LJI(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
        }
        videoPublishEditModel.maxDuration = bundle.getLong("max_duration", LivePlayEnforceIntervalSetting.DEFAULT);
        videoPublishEditModel.audioTrack = (UrlModel) bundle.getSerializable("wav_form");
        if (!videoPublishEditModel.mFromCut) {
            videoPublishEditModel.mVideoSegmentsDesc = bundle.getString("video_segment");
        }
        videoPublishEditModel.mHardEncode = bundle.getInt("hard_encode", 0);
        videoPublishEditModel.mStickerPath = bundle.getString("sticker_path");
        videoPublishEditModel.mStickerID = bundle.getString("sticker_id");
        videoPublishEditModel.mDesignerIdList = bundle.getString("original_designer_uid_list");
        videoPublishEditModel.mOriginalStickerCount = bundle.getInt("original_sticker_count", 0);
        videoPublishEditModel.stickerInfo = (StickerInfo) bundle.getSerializable("sticker_info");
        videoPublishEditModel.mFirstStickerMusicIdsJson = bundle.getString("first_sticker_music_ids");
        videoPublishEditModel.draftFromShoot = bundle.getBoolean("draft_from_shoot", false);
        videoPublishEditModel.qaPermissionDialogShownStatus = bundle.getBoolean("qa_permission_dialog_status", false);
        videoPublishEditModel.mRestoreType = bundle.getInt("restore", 0);
        if (videoPublishEditModel.mSelectedId == 0) {
            i = 1;
        } else {
            i = 0;
        }
        videoPublishEditModel.mUseFilter = i;
        videoPublishEditModel.mWillGoOnShortVideo = bundle.getBoolean("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", false);
        String string = bundle.getString("shoot_way");
        videoPublishEditModel.mShootWay = string;
        String str = "";
        if (TextUtils.equals(string, "chat_shoot")) {
            if (bundle.getInt("extra_dm_media_type", 3) == 2) {
                videoPublishEditModel.creativeModel.dmMediaModel = new DMMediaModel(2, C5YW.LIZIZ().LIZIZ(videoPublishEditModel.creativeInfo), "", false);
                videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.LLLLLLLLLL().getPath();
            } else {
                videoPublishEditModel.creativeModel.dmMediaModel = new DMMediaModel(3, "", C5YW.LIZIZ().LIZIZ(videoPublishEditModel.creativeInfo), false);
            }
        }
        if (C44384HbQ.LJLLLLLL(videoPublishEditModel)) {
            if (H7R.LJJJJL(videoPublishEditModel)) {
                videoPublishEditModel.replaceMusicModel = new C42466Gla();
            } else {
                C42466Gla c42466Gla = new C42466Gla();
                c42466Gla.setVid(bundle.getString("video_id"));
                c42466Gla.setCover(bundle.getString("video_cover"));
                videoPublishEditModel.replaceMusicModel = c42466Gla;
            }
            videoPublishEditModel.replaceMusicModel.setAid(bundle.getString("id"));
            String string2 = bundle.getString("music_id");
            if (!TextUtils.isEmpty(string2)) {
                videoPublishEditModel.replaceMusicModel.setMid(string2);
            }
        }
        videoPublishEditModel.setShootFrom(bundle.getString("shoot_from"));
        videoPublishEditModel.mIsFromDraft = bundle.getBoolean("isFromDraft", false);
        videoPublishEditModel.mDraftToEditFrom = bundle.getInt("draft_to_edit_from", -1);
        if (videoPublishEditModel.mIsFromDraft) {
            videoPublishEditModel.mVideoCanvasWidth = bundle.getInt("extra_video_canvas_width", 0);
            videoPublishEditModel.mVideoCanvasHeight = bundle.getInt("extra_video_canvas_height", 0);
        }
        videoPublishEditModel.mVideoCoverStartTm = bundle.getFloat("videoCoverStartTm", 0.0f);
        videoPublishEditModel.setCoverPublishModel((CoverPublishModel) bundle.getParcelable("cover_publish_model"));
        videoPublishEditModel.setVideoCoverPath(bundle.getString("video_cover_path"));
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.mOrigin = bundle.getInt("origin", 0);
        Iterable iterable = (Iterable) bundle.getSerializable("challenge");
        if (iterable != null) {
            videoPublishEditModel.challenges = ORZ.LJLL(iterable);
        }
        videoPublishEditModel.geofencingSetting = (List) bundle.getSerializable("geo_fencing");
        videoPublishEditModel.mDuetFrom = bundle.getString("duet_from");
        videoPublishEditModel.mDuetAuthor = (User) bundle.getSerializable("duet_author");
        videoPublishEditModel.setDuetHashTag(bundle.getString("duet_hash_tag"));
        ShoutOutsData shoutOutsData = (ShoutOutsData) bundle.getSerializable("shout_out_data");
        videoPublishEditModel.mShoutOutsData = shoutOutsData;
        if (shoutOutsData != null) {
            C41658GWo.LIZLLL().LJ = Boolean.TRUE;
        }
        CreativeFlowData creativeFlowData = (CreativeFlowData) bundle.getParcelable("creative_flow_data");
        if (creativeFlowData != null) {
            videoPublishEditModel.creativeFlowData = creativeFlowData;
        }
        Serializable serializable = bundle.getSerializable("auto_selected_anchors");
        if (serializable != null && (videoPublishEditModel.creativeFlowData.getAnchors() == null || videoPublishEditModel.creativeFlowData.getAnchors().isEmpty())) {
            videoPublishEditModel.creativeFlowData.setAnchors((List) serializable);
        }
        videoPublishEditModel.mSyncPlatforms = bundle.getString("sync_platform");
        videoPublishEditModel.mShootMode = bundle.getInt("shoot_mode", 0);
        videoPublishEditModel.mShootedShootMode = bundle.getInt("shooted_shoot_mode", -1);
        videoPublishEditModel.ccVid = bundle.getString("cc_vid");
        videoPublishEditModel.draftId = bundle.getInt("draft_id", 0);
        String string3 = bundle.getString("new_draft_id");
        videoPublishEditModel.newDraftId = string3;
        if (string3 == null) {
            videoPublishEditModel.newDraftId = "";
        }
        if (videoPublishEditModel.hasOriginalSound()) {
            f = WUK.LJIIZILJ;
        } else {
            f = 0.0f;
        }
        videoPublishEditModel.voiceVolume = f;
        if (videoPublishEditModel.isMusic() > 0) {
            f2 = WUK.LJIJI;
        } else {
            f2 = 0.0f;
        }
        videoPublishEditModel.musicVolume = f2;
        videoPublishEditModel.setTitle(bundle.getString("video_title"));
        videoPublishEditModel.heading = bundle.getString("photo_mode_heading");
        videoPublishEditModel.setChain(bundle.getString("video_title_chain"));
        videoPublishEditModel.mDuetFromDuetButton = bundle.getInt("duet_from_duet_button", 0);
        videoPublishEditModel.setDisableDeleteChain(bundle.getBoolean("disable_delete_title_chain", false));
        videoPublishEditModel.isPrivate = bundle.getInt("is_rivate", C42000Ge4.LJI(videoPublishEditModel));
        videoPublishEditModel.excludeUserList = (List) bundle.getSerializable("exclude_user_list");
        videoPublishEditModel.allowRecommend = bundle.getInt("allow_recommend", 0);
        videoPublishEditModel.commentSetting = bundle.getInt("comment_setting", G9D.LIZIZ);
        videoPublishEditModel.reactDuetSetting = bundle.getInt("duet_setting", C60903NvH.LJIIJJI().LJJIL().getReactDuetSettingCurrent(0));
        videoPublishEditModel.stitchSetting = bundle.getInt("stitch_setting", C60903NvH.LJIIJJI().LJJIL().getStitchSettingCurrent(0));
        videoPublishEditModel.setStructList((List) bundle.getSerializable("struct_list"));
        videoPublishEditModel.mDurationMode = bundle.getBoolean("duration_mode", false);
        videoPublishEditModel.mIsMultiVideo = bundle.getBoolean("upload_video_type", false);
        videoPublishEditModel.autoEnhanceType = bundle.getInt("extra_auto_enhance_type", 0);
        videoPublishEditModel.autoEnhanceOn = bundle.getBoolean("extra_auto_enhance_state", false);
        C43587H8t.LIZ(bundle, new C44224HXg(videoPublishEditModel));
        boolean z2 = bundle.getBoolean("is_muted", false);
        videoPublishEditModel.isMuted = z2;
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = bundle.getInt("record_mode", 0);
        videoPublishEditModel.gameScore = bundle.getInt("record_game_score", 0);
        videoPublishEditModel.setMusicOrigin(bundle.getString("music_origin"));
        if (videoPublishEditModel.getMusicOrigin() == null && Objects.equals(videoPublishEditModel.mShootWay, "profile_photo") && !C5WB.LIZ()) {
            videoPublishEditModel.setMusicOrigin("profile_photo");
        }
        videoPublishEditModel.microAppId = bundle.getString("micro_app_id");
        videoPublishEditModel.isDuetGreenSrceen = bundle.getBoolean("duet_green_srceen", false);
        videoPublishEditModel.microAppModel = (MicroAppModel) bundle.getSerializable("micro_app_info");
        videoPublishEditModel.extractFramesModel = (ExtractFramesModel) bundle.getSerializable("extract_model");
        videoPublishEditModel.infoStickerModel = (InfoStickerModel) bundle.getParcelable("infosticker_model");
        videoPublishEditModel.md5 = bundle.getString("md5");
        if (bundle.containsKey("extra_import_video_info_list")) {
            videoPublishEditModel.importInfoList = bundle.getParcelableArrayList("extra_import_video_info_list");
        }
        videoPublishEditModel.videoCount = bundle.getInt("extra_video_count", 0);
        videoPublishEditModel.photoCount = bundle.getInt("extra_photo_count", 0);
        videoPublishEditModel.enterFrom = bundle.getString("enter_from");
        videoPublishEditModel.shootEnterMethod = bundle.getString("enter_method");
        videoPublishEditModel.sendToUserHead = (UrlModel) bundle.getSerializable("send_to_user_head");
        videoPublishEditModel.isFastImport = bundle.getBoolean("extra_av_is_fast_import", false);
        videoPublishEditModel.fastImportErrorCode = bundle.getInt("extra_fast_import_error_code", -1);
        videoPublishEditModel.isStickPointMode = bundle.getBoolean("extra_stickpoint_mode", false);
        videoPublishEditModel.cut2EditTransferModel = (Cut2EditTransferModel) bundle.getParcelable("cut_to_edit_transfer_model");
        videoPublishEditModel.editMusicSyncMode = bundle.getBoolean("edit_music_sync_mode", false);
        videoPublishEditModel.isPhotoMvMode = bundle.getBoolean("extra_photo_mv_mode", false);
        videoPublishEditModel.isPhotoMvMode1080p = bundle.getBoolean("extra_photo_mv_mode_1080p", false);
        videoPublishEditModel.isPhotoMvMusic = bundle.getBoolean("is_photo_mv_music", false);
        videoPublishEditModel.soundSyncFromAnchor = bundle.getBoolean("sound_sync_from_anchor", false);
        videoPublishEditModel.successEnableAEC = bundle.getBoolean("extra_success_enable_aec", false);
        videoPublishEditModel.audioAecDelayTime = bundle.getLong("extra_audio_aec_delay_time", -1L);
        videoPublishEditModel.currentZoomValue = bundle.getFloat("extra_current_zoom_value", -1.0f);
        videoPublishEditModel.cutSameEditData = (CutSameEditData) bundle.getParcelable("cutsame_data");
        if (bundle.containsKey("extra_share_context")) {
            C43722HDy c43722HDy = (C43722HDy) bundle.getSerializable("extra_share_context");
            C164846dU c164846dU = new C164846dU();
            c164846dU.setShareContext(c43722HDy);
            videoPublishEditModel.creativeFlowData.setExtraShareOptions(c43722HDy.mExtraShareOptions);
            videoPublishEditModel.setMainBusinessContext(c164846dU);
        }
        if (bundle.containsKey("extra_mention_user_model")) {
            videoPublishEditModel.mentionUserModel = (ExtraMentionUserModel) bundle.getSerializable("extra_mention_user_model");
        }
        if (bundle.containsKey("extra_ar_text")) {
            videoPublishEditModel.arTextList = bundle.getStringArrayList("extra_ar_text");
        }
        if (bundle.containsKey("extra_sticker_text")) {
            videoPublishEditModel.messageBubbleTexts = bundle.getStringArrayList("extra_sticker_text");
        }
        if (bundle.containsKey("extra_countdown_mode")) {
            videoPublishEditModel.countDownModes = bundle.getIntegerArrayList("extra_countdown_mode");
        }
        if (bundle.containsKey("extra_draft_transform_model")) {
            videoPublishEditModel.draftEditTransferModel = (DraftEditTransferModel) bundle.getParcelable("extra_draft_transform_model");
        }
        if (bundle.containsKey("av_upload_struct")) {
            videoPublishEditModel.uploadMiscInfoStruct = (AVUploadMiscInfoStruct) bundle.getSerializable("av_upload_struct");
        }
        videoPublishEditModel.containBackgroundVideo = bundle.getBoolean("contain_backgroundvideo", false);
        videoPublishEditModel.containDiyPropVideo = bundle.getBoolean("contain_diy_prop_video", false);
        videoPublishEditModel.supportRetake = bundle.getBoolean("support_retake", true);
        if (bundle.containsKey("key_mv_theme_data")) {
            MvCreateVideoData mvCreateVideoData = (MvCreateVideoData) bundle.getSerializable("key_mv_theme_data");
            videoPublishEditModel.mvCreateVideoData = mvCreateVideoData;
            if (mvCreateVideoData != null) {
                if (mvCreateVideoData.mvType == 1) {
                    videoPublishEditModel.setVideoEditorType(3);
                } else {
                    videoPublishEditModel.setVideoEditorType(2);
                }
                videoPublishEditModel.templateId = videoPublishEditModel.mvCreateVideoData.mvId;
            }
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.setVideoEditorType(4);
        } else if (bundle.containsKey("stitch_params") || videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.stitchParams = (StitchParams) bundle.getParcelable("stitch_params");
            videoPublishEditModel.setVideoEditorType(7);
            if (videoPublishEditModel.stitchParams != null && Float.compare(videoPublishEditModel.mVideoCoverStartTm, 0.0f) == 0 && ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo() != null) {
                videoPublishEditModel.mVideoCoverStartTm = ((float) (((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getDuration() + 1)) / 1000.0f;
            }
        } else if (H7R.LJJJ(videoPublishEditModel)) {
            videoPublishEditModel.setVideoEditorType(10);
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.setVideoEditorType(6);
        } else if (bundle.containsKey("photo_canvas_data")) {
            videoPublishEditModel.setVideoEditorType(11);
        } else if (videoPublishEditModel.isCutSameVideoType()) {
            videoPublishEditModel.setVideoEditorType(13);
        } else {
            videoPublishEditModel.setVideoEditorType(0);
        }
        if (bundle.containsKey("key_stick_point_data")) {
            videoPublishEditModel.stickPointData = (StickPointData) bundle.getSerializable("key_stick_point_data");
        }
        if (bundle.containsKey("extra_ve_cher_effect_param")) {
            videoPublishEditModel.veCherEffectParam = (ClientCherEffectParam) bundle.getParcelable("extra_ve_cher_effect_param");
        }
        if (bundle.containsKey("extra_ve_audio_effect_param")) {
            videoPublishEditModel.veAudioEffectParam = (AudioEffectParam) bundle.getParcelable("extra_ve_audio_effect_param");
        }
        if (bundle.containsKey("sticker_challenge")) {
            videoPublishEditModel.stickerChallenge = (StickerChallenge) bundle.getParcelable("sticker_challenge");
        }
        if (bundle.containsKey("audio_record_param")) {
            videoPublishEditModel.veAudioRecorderParam = (AudioRecorderParam) bundle.getParcelable("audio_record_param");
        }
        videoPublishEditModel.singleImageCoverBitmapData = (SingleImageCoverBitmapData) bundle.getParcelable("key_choose_media_item_cover_bitmap_data");
        videoPublishEditModel.pic2VideoSource = bundle.getString("picture_source");
        videoPublishEditModel.allowDownloadSetting = bundle.getInt("download_setting", 0);
        videoPublishEditModel.setUseMusicBeforeEdit(bundle.getBoolean("use_music_before_edit", false));
        videoPublishEditModel.duetLayout = bundle.getString("extra_duet_layout");
        videoPublishEditModel.duetVideoDuration = bundle.getInt("duet_video_duration", 0);
        videoPublishEditModel.setReuseOriginalSoundId(bundle.getString("reuse_original_sound_id"));
        videoPublishEditModel.setReuseOriginalSoundLength(bundle.getInt("reuse_original_sound_length", 0));
        videoPublishEditModel.setReuseOriginalSoundUrls((UrlModel) bundle.getSerializable("reuse_original_sound_url"));
        if (!TextUtils.isEmpty(videoPublishEditModel.getReuseOriginalSoundId())) {
            videoPublishEditModel.setIsReuseOriginalSound(true);
        }
        videoPublishEditModel.draftDuetExtraInfo = (DuetExtraInfo) bundle.getParcelable(DuetExtraInfo.class.getName());
        videoPublishEditModel.greenScreenMaterialList = bundle.getParcelableArrayList("green_screen_material_list");
        videoPublishEditModel.cameraLensInfo = bundle.getStringArrayList("extra_camera_lens_info");
        videoPublishEditModel.setDraftMusicIllegal(bundle.getBoolean("draft_music_legal_param", false));
        videoPublishEditModel.videoDurationFromVideoCutPage = bundle.getInt("preview_video_length", -1);
        videoPublishEditModel.fromPropId = bundle.getString("from_prop_id");
        videoPublishEditModel.isDefaultProp = bundle.getBoolean("is_default_prop", false);
        videoPublishEditModel.publishStage = bundle.getInt("extra_publish_stage", 0);
        if (bundle.containsKey("photo_canvas_data")) {
            videoPublishEditModel.canvasVideoData = (CanvasVideoData) bundle.getSerializable("photo_canvas_data");
        }
        videoPublishEditModel.isWestWindowExistStr = bundle.getString("is_west_window_exist");
        if (bundle.containsKey("enter_method")) {
            videoPublishEditModel.shootEnterMethod = bundle.getString("enter_method");
        }
        videoPublishEditModel.tagUserList = (ArrayList) bundle.getSerializable("extra_social_video_tag_list");
        if (bundle.containsKey("audio_enhance_param")) {
            videoPublishEditModel.audioEnhanceParam = (AudioEnhanceParam) bundle.getParcelable("audio_enhance_param");
        }
        videoPublishEditModel.draftSaveTime = bundle.getLong("draft_save_time", 0L);
        videoPublishEditModel.fromItemId = C78983UzD.LJLJL;
        videoPublishEditModel.setDuetModeType(bundle.getString("duet_mode_type"));
        videoPublishEditModel.setApplyVoiceToAllTextSwitch(bundle.getInt("extra_apply_voice_to_all_text", 0));
        videoPublishEditModel.publishRetainType = bundle.getString("publish_retain_type");
        videoPublishEditModel.propOrder = bundle.getInt("order", 0);
        videoPublishEditModel.hasMultiAudioLoudnessNormalization = bundle.getBoolean("extra_has_multi_audio_loudness_normalization", false);
        if (bundle.getSerializable("on_this_day_day") != null) {
            OnThisDayData onThisDayData = (OnThisDayData) bundle.getSerializable("on_this_day_day");
            videoPublishEditModel.creativeModel.onThisDayData.setFromOnThisDay(onThisDayData.isFromOnThisDay());
            videoPublishEditModel.creativeModel.onThisDayData.setPastMemoryKey(onThisDayData.getPastMemoryKey());
            videoPublishEditModel.creativeModel.onThisDayData.setCreateTime(onThisDayData.getCreateTime());
            videoPublishEditModel.creativeModel.onThisDayData.setForwardType(onThisDayData.getForwardType());
        }
        if (bundle.getBoolean("extra_retake_from_advanced", false)) {
            videoPublishEditModel.getEditorProModel().setAdvancedEditDraft(true);
            videoPublishEditModel.infoStickerModel = C132385Hm.LIZIZ.LJ;
        }
        if (videoPublishEditModel.isRetakeVideo()) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null && (arrayList = multiEditVideoStatusRecordData.editSegments) != null) {
                Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().getBackgroundVideo() != null) {
                        break;
                    }
                }
            }
            z = false;
            videoPublishEditModel.containBackgroundVideo = z;
        }
        if (videoPublishEditModel.mIsFromDraft) {
            libraryMaterials = bundle.getParcelableArrayList("library_material_info");
        } else {
            libraryMaterials = videoPublishEditModel.getLibraryMaterials();
        }
        videoPublishEditModel.libraryMaterialList = libraryMaterials;
        if (bundle.getBoolean("video2sticker_mode", false)) {
            Video2StickerModel video2StickerModel = new Video2StickerModel();
            Aweme aweme = (Aweme) bundle.getSerializable("aweme");
            OriginVideoInfo originVideoInfo = video2StickerModel.originVideoInfo;
            String aid = aweme.getAid();
            originVideoInfo.getClass();
            o.LJIIIZ(aid, "<set-?>");
            originVideoInfo.awemeId = aid;
            OriginVideoInfo originVideoInfo2 = video2StickerModel.originVideoInfo;
            String authorUid = aweme.getAuthorUid();
            originVideoInfo2.getClass();
            o.LJIIIZ(authorUid, "<set-?>");
            originVideoInfo2.userId = authorUid;
            OriginVideoInfo originVideoInfo3 = video2StickerModel.originVideoInfo;
            if (aweme.getSecAuthorUid() != null) {
                str = aweme.getSecAuthorUid();
            }
            originVideoInfo3.getClass();
            o.LJIIIZ(str, "<set-?>");
            originVideoInfo3.secUserId = str;
            video2StickerModel.originVideoInfo.coverTsp = (long) (aweme.getVideo().getCoverTsp() * 1000.0d);
            OriginVideoInfo originVideoInfo4 = video2StickerModel.originVideoInfo;
            String string4 = bundle.getString("video_file_path");
            originVideoInfo4.getClass();
            o.LJIIIZ(string4, "<set-?>");
            originVideoInfo4.filePath = string4;
            videoPublishEditModel.creativeModel.video2StickerModel = video2StickerModel;
            videoPublishEditModel.creationMode = 4;
        }
        if (Objects.equals(videoPublishEditModel.mShootWay, "change_ban_music")) {
            videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly = bundle.getBoolean("is_sub_only_video", false);
        }
        if (bundle.containsKey("extra_quick_forward_edit_result")) {
            videoPublishEditModel.creativeModel.forwardEditPublishData = (ForwardEditPublishData) bundle.getParcelable("extra_quick_forward_edit_result");
        }
        return videoPublishEditModel;
    }

    public static VideoPublishEditModel LJII(Bundle bundle) {
        float f;
        VideoPublishEditModel LJI = LJI(bundle);
        LJI.musicVolume = bundle.getFloat("music_volume", WUK.LJIJI);
        if (LJI.isMuted) {
            f = 0.0f;
        } else {
            f = bundle.getFloat("voice_volume", WUK.LJIIZILJ);
        }
        LJI.voiceVolume = f;
        if ((LJI.isFastImport && LJI.isStickPointMode) || LJI.isPhotoMvMode || LJI.isSoundSyncFromAnchor()) {
            LJI.voiceVolume = 0.0f;
        } else {
            MicDataModel micDataModel = LJI.creativeModel.micDataModel;
            float f2 = micDataModel.editDefaultVolume;
            if (f2 != -1.0f && !micDataModel.editVolumeChangeMark) {
                LJI.voiceVolume = f2;
            }
        }
        LJI.setIsSoundLoop(Boolean.valueOf(bundle.getBoolean("extra_is_sound_loop", false)));
        return LJI;
    }

    public static void LIZ(Intent intent, VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        intent.putParcelableArrayListExtra("original_segments", multiEditVideoStatusRecordData.originalSegments);
        intent.putExtra("original_music_start", multiEditVideoStatusRecordData.originalMusicStart);
        intent.putExtra("retake_shoot_mode", 2);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
    }

    public static AwemeDraft LJ(final VideoPublishEditModel videoPublishEditModel, String str) {
        InterfaceC43591H8x ldb;
        DraftCherEffectParam draftCherEffectParam;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("convertToDraft ; from : ");
        LIZ.append(str);
        H78.LIZ(X1D.LIZIZ(LIZ));
        final AwemeDraft awemeDraft = new AwemeDraft();
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        awemeDraft.LIZ = creativeModel;
        creativeModel.musicBuzModel.isDraftMusicValid = true;
        awemeDraft.LJJJJI.previewInfo = videoPublishEditModel.getPreviewInfo();
        awemeDraft.LJJIJL = videoPublishEditModel.getNewVersion();
        AVDraftAwemeCompat aVDraftAwemeCompat = new AVDraftAwemeCompat();
        aVDraftAwemeCompat.desc = videoPublishEditModel.title;
        aVDraftAwemeCompat.titleChain = videoPublishEditModel.getChain();
        aVDraftAwemeCompat.isDisableDeleteTitleChain = videoPublishEditModel.isDisableDeleteChain();
        aVDraftAwemeCompat.challengeList = videoPublishEditModel.challenges;
        aVDraftAwemeCompat.videoLength = videoPublishEditModel.getVideoLength();
        aVDraftAwemeCompat.textExtra = videoPublishEditModel.getStructList();
        String str2 = videoPublishEditModel.uploadMethod;
        if (str2 == null) {
            str2 = "";
        }
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJI;
        aVDraftExtras.uploadMethod = str2;
        aVDraftExtras.uploadTabNameList = videoPublishEditModel.uploadTabNameList;
        awemeDraft.aweme = aVDraftAwemeCompat;
        str.equals("KidsEdit");
        awemeDraft.LIZLLL = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        CommentVideoModel commentVideoModel = videoPublishEditModel.commentVideoModel;
        AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJI;
        aVDraftExtras2.commentVideoModel = commentVideoModel;
        aVDraftExtras2.qaStruct = videoPublishEditModel.qaStruct;
        String str3 = videoPublishEditModel.isWestWindowExistStr;
        if (str3 != null) {
            aVDraftExtras2.isWestWindowExistStr = str3;
        }
        awemeDraft.LJI = videoPublishEditModel.getMMusicPath();
        awemeDraft.LJIILIIL = videoPublishEditModel.getMMusicStart();
        int mMusicEnd = videoPublishEditModel.getMMusicEnd();
        AVDraftExtras aVDraftExtras3 = awemeDraft.LJJJJI;
        if (aVDraftExtras3 != null) {
            aVDraftExtras3.musicEnd = mMusicEnd;
        }
        awemeDraft.LJJJJI.musicOrigin = videoPublishEditModel.getMusicOrigin();
        C41802Gas.LJIIJ(videoPublishEditModel.getFilterIndex(), awemeDraft);
        String str4 = videoPublishEditModel.mRecordFilterIds;
        AVDraftExtras aVDraftExtras4 = awemeDraft.LJJJJI;
        aVDraftExtras4.recordFilterIds = str4;
        aVDraftExtras4.recordFilterNames = videoPublishEditModel.mRecordFilterLabels;
        aVDraftExtras4.recordFilterValues = videoPublishEditModel.mRecordFilterValues;
        aVDraftExtras4.recordBeautyMobParam = videoPublishEditModel.mBeautyMobParam;
        aVDraftExtras4.selectedFilterId = videoPublishEditModel.mSelectedFilterId;
        aVDraftExtras4.selectedFilterLabel = videoPublishEditModel.mSelectedFilterLabel;
        aVDraftExtras4.selectedFilterResId = videoPublishEditModel.mSelectedFilterResId;
        float f = videoPublishEditModel.mSelectedFilterIntensity;
        double d = f;
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            awemeDraft.LJJJJI.filterIntensity = f;
        }
        awemeDraft.LJJIII = videoPublishEditModel.mFaceBeauty;
        awemeDraft.LJIJJLI = videoPublishEditModel.mCameraPosition;
        awemeDraft.LJIJJ = videoPublishEditModel.mCurFilterLabels;
        awemeDraft.LJJJJI.filterId = videoPublishEditModel.mCurFilterIds;
        awemeDraft.LJIILL = videoPublishEditModel.mOrigin;
        awemeDraft.LJJIIJ = C77339UWx.LIZJ();
        awemeDraft.LJJIIJZLJL = videoPublishEditModel.mVideoSegmentsDesc;
        awemeDraft.LJJIIZ = videoPublishEditModel.mHardEncode;
        awemeDraft.LJJIJIIJI = videoPublishEditModel.mStickerID;
        String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        AVDraftExtras aVDraftExtras5 = awemeDraft.LJJJJI;
        aVDraftExtras5.videoCoverPath = videoCoverPath;
        awemeDraft.LJIL = videoPublishEditModel.faceBeautyOpen ? 1 : 0;
        aVDraftExtras5.beautyMetadata = videoPublishEditModel.mBeautyMetadatas;
        awemeDraft.LJJI = videoPublishEditModel.isPrivate;
        aVDraftExtras5.excludeUserList = videoPublishEditModel.excludeUserList;
        aVDraftExtras5.shoutOutsData = videoPublishEditModel.mShoutOutsData;
        aVDraftExtras5.allowRecommend = videoPublishEditModel.allowRecommend;
        aVDraftExtras5.commentSetting = videoPublishEditModel.commentSetting;
        aVDraftExtras5.duetSetting = videoPublishEditModel.reactDuetSetting;
        aVDraftExtras5.stitchSetting = videoPublishEditModel.stitchSetting;
        awemeDraft.LJJII = videoPublishEditModel.maxDuration;
        awemeDraft.LJIJ = videoPublishEditModel.audioTrack;
        awemeDraft.LJIIZILJ = videoPublishEditModel.videoSpeed;
        aVDraftExtras5.cameraIds = videoPublishEditModel.cameraIds;
        aVDraftExtras5.beautyType = videoPublishEditModel.beautyType;
        aVDraftExtras5.importVideoInfos = videoPublishEditModel.importInfoList;
        aVDraftExtras5.videoPartMetadata = videoPublishEditModel.metadataMap;
        aVDraftExtras5.videoOutWidth = videoPublishEditModel.mOutVideoWidth;
        aVDraftExtras5.videoOutHeight = videoPublishEditModel.mOutVideoHeight;
        aVDraftExtras5.videoCanvasWidth = videoPublishEditModel.mVideoCanvasWidth;
        aVDraftExtras5.videoCanvasHeight = videoPublishEditModel.mVideoCanvasHeight;
        awemeDraft.LJJIJLIJ = videoPublishEditModel.mVideoCoverStartTm;
        awemeDraft.LJJIL = videoPublishEditModel.mDuetFrom;
        aVDraftExtras5.uploadPath = videoPublishEditModel.mUploadPath;
        awemeDraft.LJJIZ = videoPublishEditModel.mSyncPlatforms;
        int from = videoPublishEditModel.getFrom();
        AVDraftExtras aVDraftExtras6 = awemeDraft.LJJJJI;
        aVDraftExtras6.from = from;
        aVDraftExtras6.shootMode = videoPublishEditModel.mShootMode;
        aVDraftExtras6.microAppId = videoPublishEditModel.microAppId;
        aVDraftExtras6.microAppInfo = videoPublishEditModel.microAppModel;
        awemeDraft.LJIILIIL(videoPublishEditModel.creativeInfo);
        awemeDraft.LJJJJI.draftId = videoPublishEditModel.draftId;
        String newDraftId = videoPublishEditModel.newDraftId;
        o.LJIIIZ(newDraftId, "newDraftId");
        AVDraftExtras aVDraftExtras7 = awemeDraft.LJJJJI;
        aVDraftExtras7.getClass();
        aVDraftExtras7.newDraftId = newDraftId;
        String str5 = videoPublishEditModel.mShootWay;
        if (TextUtils.isEmpty(str5)) {
            str5 = "edit_draft";
        }
        AVDraftExtras aVDraftExtras8 = awemeDraft.LJJJJI;
        aVDraftExtras8.shootWay = str5;
        aVDraftExtras8.autoEnhanceOn = videoPublishEditModel.autoEnhanceOn;
        aVDraftExtras8.autoEnhanceType = videoPublishEditModel.autoEnhanceType;
        String shootFrom = videoPublishEditModel.getShootFrom();
        AVDraftExtras aVDraftExtras9 = awemeDraft.LJJJJI;
        aVDraftExtras9.shootFrom = shootFrom;
        aVDraftExtras9.durationMode = videoPublishEditModel.mDurationMode;
        aVDraftExtras9.isMultiVideo = videoPublishEditModel.mIsMultiVideo;
        aVDraftExtras9.isMuted = videoPublishEditModel.isMuted;
        aVDraftExtras9.geoFencingData = videoPublishEditModel.geofencingSetting;
        aVDraftExtras9.recordMode = videoPublishEditModel.recordMode;
        aVDraftExtras9.gameScore = videoPublishEditModel.gameScore;
        aVDraftExtras9.extractFramesModel = videoPublishEditModel.extractFramesModel;
        AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
        AVDraftExtras aVDraftExtras10 = awemeDraft.LJJJJI;
        aVDraftExtras10.uploadSaveModel = saveModel;
        aVDraftExtras10.infoStickerModel = videoPublishEditModel.infoStickerModel;
        aVDraftExtras10.videoType = videoPublishEditModel.videoType;
        aVDraftExtras10.texts = videoPublishEditModel.texts;
        aVDraftExtras10.usePaint = videoPublishEditModel.usePaint;
        aVDraftExtras10.socialModel = videoPublishEditModel.socialModel;
        aVDraftExtras10.stickerChallenge = videoPublishEditModel.stickerChallenge;
        awemeDraft.LJJJJI.textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
        int newVersion = videoPublishEditModel.getNewVersion();
        C60903NvH.LJIIJJI().LJJJI().LJIIIIZZ();
        if (newVersion == 3) {
            VolumeInfoModel volumeInfoModel = awemeDraft.LIZ.volumeInfoModel;
            float f2 = (videoPublishEditModel.musicVolume / WUK.LJIJJ) * 100.0f;
            volumeInfoModel.musicVolume = f2;
            float f3 = (videoPublishEditModel.voiceVolume / WUK.LJIJ) * 100.0f;
            volumeInfoModel.videoVolume = f3;
            awemeDraft.LJIIIZ = (int) f2;
            awemeDraft.LJIIIIZZ = (int) f3;
        }
        InterfaceC43592H8y LIZ2 = H83.LIZ(videoPublishEditModel);
        AVDraftExtras aVDraftExtras11 = awemeDraft.LJJJJI;
        if (aVDraftExtras11 == null) {
            ldb = H83.LIZIZ;
        } else {
            ldb = new LDB(4, aVDraftExtras11);
        }
        C43587H8t.LIZJ(LIZ2, ldb, EnumC43590H8w.PUBLISH, EnumC43590H8w.DRAFT);
        awemeDraft.LJJJJI.stickPointType = videoPublishEditModel.getStickPointType();
        awemeDraft.LJJJJI.recordBgmDelay = Integer.valueOf(videoPublishEditModel.recordBgmDelay);
        AVDraftExtras aVDraftExtras12 = awemeDraft.LJJJJI;
        aVDraftExtras12.loudnessParam = videoPublishEditModel.loudnessBalanceParam;
        aVDraftExtras12.firstStickerMusicIds = videoPublishEditModel.mFirstStickerMusicIdsJson;
        aVDraftExtras12.shootedShootMode = videoPublishEditModel.mShootedShootMode;
        String str6 = C78983UzD.LJLJL;
        if (str6 == null) {
            str6 = "";
        }
        aVDraftExtras12.fromItemId = str6;
        aVDraftExtras12.commerceData = videoPublishEditModel.commerceData;
        aVDraftExtras12.isFastImport = videoPublishEditModel.isFastImport;
        aVDraftExtras12.mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
        aVDraftExtras12.isStickPointMode = videoPublishEditModel.isStickPointMode;
        aVDraftExtras12.containBackgroundVideo = videoPublishEditModel.containBackgroundVideo;
        aVDraftExtras12.avUploadMiscInfoStruct = videoPublishEditModel.uploadMiscInfoStruct;
        aVDraftExtras12.creativeFlowData = videoPublishEditModel.creativeFlowData;
        DraftEditTransferModel draftEditTransferModel = videoPublishEditModel.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            awemeDraft.LIZJ = draftEditTransferModel.getPrimaryKey();
            if (videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy() != null) {
                awemeDraft.LJJJJI.previewVideoListCopy = videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy();
            }
        }
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(awemeDraft.LIZJ(), C41802Gas.LJ(awemeDraft));
        ClientCherEffectParam clientCherEffectParam = videoPublishEditModel.veCherEffectParam;
        DraftVEAudioEffectParam draftVEAudioEffectParam = null;
        if (clientCherEffectParam == null) {
            draftCherEffectParam = null;
        } else {
            draftCherEffectParam = new DraftCherEffectParam(clientCherEffectParam.getMatrix(), videoPublishEditModel.veCherEffectParam.getDuration(), videoPublishEditModel.veCherEffectParam.getSegUseCher());
        }
        awemeDraft.LJJJJI.draftCherEffectParam = draftCherEffectParam;
        AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam != null) {
            draftVEAudioEffectParam = new DraftVEAudioEffectParam(audioEffectParam.getUploadId(), videoPublishEditModel.veAudioEffectParam.getTrackType(), videoPublishEditModel.veAudioEffectParam.getTrackIndex(), videoPublishEditModel.veAudioEffectParam.getEffectPath(), videoPublishEditModel.veAudioEffectParam.getEffectTag(), videoPublishEditModel.veAudioEffectParam.getSeqIn(), videoPublishEditModel.veAudioEffectParam.getSeqOut(), videoPublishEditModel.veAudioEffectParam.getChallenge(), videoPublishEditModel.veAudioEffectParam.getChallenges());
        }
        awemeDraft.LJJJJI.draftVEAudioEffectParam = draftVEAudioEffectParam;
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
            audioRecorderParam2.copyFrom(audioRecorderParam);
            audioRecorderParam2.setAudioUrl(audioRecorderParam2.getAudioUrl());
            audioRecorderParam2.setExtraUrl("");
            awemeDraft.LJJJJI.audioRecorderParam = audioRecorderParam2;
        }
        if (videoPublishEditModel.metadataMap == null) {
            videoPublishEditModel.metadataMap = C63942P7q.LIZ();
        } else {
            java.util.Map<String, Object> LIZ3 = C63942P7q.LIZ();
            if (LIZ3 != null) {
                videoPublishEditModel.metadataMap.putAll(LIZ3);
            }
        }
        java.util.Map<String, ? extends Object> map = videoPublishEditModel.metadataMap;
        AVDraftExtras aVDraftExtras13 = awemeDraft.LJJJJI;
        aVDraftExtras13.videoPartMetadata = map;
        aVDraftExtras13.videoCount = videoPublishEditModel.videoCount;
        aVDraftExtras13.photoCount = videoPublishEditModel.photoCount;
        String str7 = videoPublishEditModel.pic2VideoSource;
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        } else {
            o.LJI(str7);
        }
        aVDraftExtras13.pic2VideoSource = str7;
        awemeDraft.LJJJJI.downloadSetting = videoPublishEditModel.allowDownloadSetting;
        boolean isUseMusicBeforeEdit = videoPublishEditModel.isUseMusicBeforeEdit();
        AVDraftExtras aVDraftExtras14 = awemeDraft.LJJJJI;
        if (aVDraftExtras14 != null) {
            aVDraftExtras14.useMusicBeforeEdit = isUseMusicBeforeEdit;
        }
        if (H7R.LJJJJL(videoPublishEditModel) && (videoPublishEditModel.getImageAlbumData() == null || videoPublishEditModel.getImageAlbumData().getImageList().isEmpty())) {
            String str8 = "photo mode image list must not be null " + videoPublishEditModel.getImageAlbumData();
            H78.LIZJ(str8);
            C78983UzD.LJIILL(str8);
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        AVDraftExtras aVDraftExtras15 = awemeDraft.LJJJJI;
        aVDraftExtras15.imageAlbumData = imageAlbumData;
        aVDraftExtras15.heading = videoPublishEditModel.heading;
        aVDraftExtras15.creationMode = videoPublishEditModel.creationMode;
        SharedARModel sharedARModel = videoPublishEditModel.getSharedARModel();
        if (sharedARModel != null) {
            awemeDraft.LJJJJI.sharedARModel = sharedARModel;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        AVDraftExtras aVDraftExtras16 = awemeDraft.LJJJJI;
        aVDraftExtras16.multiEditVideoData = multiEditVideoStatusRecordData;
        aVDraftExtras16.supportRetake = videoPublishEditModel.supportRetake;
        aVDraftExtras16.stickPointData = videoPublishEditModel.stickPointData;
        awemeDraft.LJJJJI.backgroundVideoDraftDir = videoPublishEditModel.getBackgroundVideoDraftDir();
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        AVDraftExtras aVDraftExtras17 = awemeDraft.LJJJJI;
        aVDraftExtras17.mainBusinessData = mainBusinessData;
        aVDraftExtras17.stickerInfo = videoPublishEditModel.stickerInfo;
        aVDraftExtras17.isUpdateInfoStickers = false;
        aVDraftExtras17.duetLayout = videoPublishEditModel.duetLayout;
        aVDraftExtras17.duetVideoDuration = videoPublishEditModel.duetVideoDuration;
        DuetExtraInfo duetExtraInfo = videoPublishEditModel.draftDuetExtraInfo;
        if (duetExtraInfo != null) {
            aVDraftExtras17.getClass();
            aVDraftExtras17.duetExtraInfo = duetExtraInfo;
        }
        awemeDraft.LJJJJI.stitchParams = videoPublishEditModel.stitchParams;
        boolean isCommerceMusic = videoPublishEditModel.isCommerceMusic();
        AVDraftExtras aVDraftExtras18 = awemeDraft.LJJJJI;
        aVDraftExtras18.commerceMusic = isCommerceMusic;
        aVDraftExtras18.libraryMaterialList = videoPublishEditModel.libraryMaterialList;
        aVDraftExtras18.cameraLensInfo = videoPublishEditModel.cameraLensInfo;
        aVDraftExtras18.isPhotoMvMode = videoPublishEditModel.isPhotoMvMode;
        aVDraftExtras18.isPhotoMvMusic = videoPublishEditModel.isPhotoMvMusic;
        aVDraftExtras18.isPhotoMvMode1080p = videoPublishEditModel.isPhotoMvMode1080p;
        aVDraftExtras18.isDuetGreenSrceen = videoPublishEditModel.isDuetGreenSrceen;
        int applyVoiceToAllTextSwitch = videoPublishEditModel.getApplyVoiceToAllTextSwitch();
        AVDraftExtras aVDraftExtras19 = awemeDraft.LJJJJI;
        aVDraftExtras19.applyVoiceToAllTextSwitch = applyVoiceToAllTextSwitch;
        aVDraftExtras19.hasMultiAudioLoudnessNormalization = videoPublishEditModel.hasMultiAudioLoudnessNormalization;
        if (videoPublishEditModel.getIsSoundLoop().booleanValue()) {
            awemeDraft.LJJJJI.isSoundLoop = "on";
        } else {
            awemeDraft.LJJJJI.isSoundLoop = "off";
        }
        boolean isDraftMusicIllegal = videoPublishEditModel.isDraftMusicIllegal();
        AVDraftExtras aVDraftExtras20 = awemeDraft.LJJJJI;
        aVDraftExtras20.isDraftMusicIllegal = isDraftMusicIllegal;
        aVDraftExtras20.messageBubbleTexts = videoPublishEditModel.messageBubbleTexts;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("SoundLoop, convertToDraft ");
        LIZ4.append(videoPublishEditModel.getIsSoundLoop());
        H78.LIZ(X1D.LIZIZ(LIZ4));
        awemeDraft.LJJJJI.cutSameData = videoPublishEditModel.cutSameEditData;
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        AVDraftExtras aVDraftExtras21 = awemeDraft.LJJJJI;
        aVDraftExtras21.coverPublishModel = coverPublishModel;
        aVDraftExtras21.audioAecDelayTime = videoPublishEditModel.audioAecDelayTime;
        aVDraftExtras21.currentZoomValue = videoPublishEditModel.currentZoomValue;
        aVDraftExtras21.mentionTextList = videoPublishEditModel.mentionTextList;
        aVDraftExtras21.hashTagTextList = videoPublishEditModel.hashTagTextList;
        aVDraftExtras21.enableAutoCaption = videoPublishEditModel.allowAutoCaptionSetting;
        aVDraftExtras21.autoCaptionLang = videoPublishEditModel.autoCaptionLang;
        aVDraftExtras21.duetFromDuetButton = videoPublishEditModel.mDuetFromDuetButton;
        aVDraftExtras21.canvasVideoData = videoPublishEditModel.canvasVideoData;
        C78841Uwv.LJJIIZ("", new InterfaceC65784Pro() { // from class: X.4tI
            @Override // X.InterfaceC65784Pro
            public final Object invoke() {
                VideoPublishEditModel videoPublishEditModel2 = VideoPublishEditModel.this;
                AwemeDraft awemeDraft2 = awemeDraft;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("convertToDraft set nle data ");
                LIZ5.append(videoPublishEditModel2.nleData);
                C126344xa.LIZ(X1D.LIZIZ(LIZ5));
                awemeDraft2.LJIIJ = videoPublishEditModel2.nleData;
                return null;
            }
        });
        AVDraftExtras aVDraftExtras22 = awemeDraft.LJJJJI;
        aVDraftExtras22.tagUserList = videoPublishEditModel.tagUserList;
        aVDraftExtras22.audioEnhanceParam = videoPublishEditModel.audioEnhanceParam;
        aVDraftExtras22.autoAttachedAnchor = videoPublishEditModel.autoAttachedAnchor;
        aVDraftExtras22.openplatformExtra = videoPublishEditModel.openPlatformExtra;
        aVDraftExtras22.openplatformClientKey = videoPublishEditModel.openPlatformClientKey;
        aVDraftExtras22.editMusicSyncMode = videoPublishEditModel.editMusicSyncMode;
        aVDraftExtras22.soundSyncFromAnchor = videoPublishEditModel.soundSyncFromAnchor;
        aVDraftExtras22.cut2EditTransferModel = videoPublishEditModel.cut2EditTransferModel;
        aVDraftExtras22.fileLengthFixed = true;
        awemeDraft.saveTime = videoPublishEditModel.draftSaveTime;
        aVDraftExtras22.isStoryDraft = videoPublishEditModel.isStoryEditMode;
        aVDraftExtras22.duetModeType = videoPublishEditModel.getDuetModeType();
        String str9 = videoPublishEditModel.publishRetainType;
        AVDraftExtras aVDraftExtras23 = awemeDraft.LJJJJI;
        aVDraftExtras23.publishRetainType = str9;
        aVDraftExtras23.propOrder = videoPublishEditModel.propOrder;
        DraftInfoModel draftInfoModel = videoPublishEditModel.creativeModel.draftInfoModel;
        awemeDraft.LJJJ = draftInfoModel.isPublishedDraft;
        awemeDraft.LJJJI = draftInfoModel.publishedTime;
        awemeDraft.LJJJIL = draftInfoModel.publishedAwemeId;
        awemeDraft.LJJJJ = draftInfoModel.isConvertToNormalDraft;
        return awemeDraft;
    }

    public static Intent LIZIZ(VideoPublishEditModel videoPublishEditModel, int i, C137965bE c137965bE) {
        Intent intent = new Intent();
        C78996UzQ.LJJIZ(intent, videoPublishEditModel.creativeModel);
        intent.putExtra("draft_to_edit_from", i);
        intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        ClientCherEffectParam clientCherEffectParam = videoPublishEditModel.veCherEffectParam;
        if (clientCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
        }
        intent.putExtra("restore", 1);
        intent.putExtra("workspace", videoPublishEditModel.mWorkspace);
        if (videoPublishEditModel.isReuseOriginalSound()) {
            intent.putExtra("reuse_original_sound_id", videoPublishEditModel.getReuseOriginalSoundId());
            intent.putExtra("reuse_original_sound_length", videoPublishEditModel.getReuseOriginalSoundLength());
            intent.putExtra("reuse_original_sound_url", videoPublishEditModel.getReuseOriginalSoundUrls());
        }
        intent.putExtra("translation_type", 1);
        List<InteractStickerStruct> LJI = C164826dS.LJI(videoPublishEditModel.getMainBusinessContext(), 12, EnumC164816dR.TRACK_PAGE_EDIT);
        if (LJI != null && LJI.size() > 0) {
            videoPublishEditModel.qaStruct = ((InteractStickerStruct) ListProtector.get(LJI, 0)).getQaStruct();
        }
        intent.putExtra("video_edit_model", (Serializable) videoPublishEditModel);
        intent.putExtra("path", videoPublishEditModel.getMMusicPath());
        C77412UZs.LJJIJIL(intent, videoPublishEditModel.creativeInfo);
        intent.putExtra("draft_id", videoPublishEditModel.draftId);
        intent.putExtra("new_draft_id", videoPublishEditModel.newDraftId);
        intent.putExtra("fromDraft", videoPublishEditModel.mIsFromDraft);
        Collection<AVChallenge> values = c137965bE.LIZIZ().getStickerToChallenge().values();
        o.LJIIIIZZ(values, "stickerChallenge.stickerToChallenge.values");
        videoPublishEditModel.removeChallengeFromTitleAndStruct(values);
        AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam != null && audioEffectParam.getChallenge() != null) {
            videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(videoPublishEditModel.veAudioEffectParam.getChallenge());
        }
        AudioEffectParam audioEffectParam2 = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam2 != null && !audioEffectParam2.getChallenges().isEmpty()) {
            for (int i2 = 0; i2 < videoPublishEditModel.veAudioEffectParam.getChallenges().size(); i2++) {
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct((AVChallenge) ListProtector.get(videoPublishEditModel.veAudioEffectParam.getChallenges(), i2));
            }
        }
        intent.putExtra("video_title", videoPublishEditModel.title);
        intent.putExtra("video_title_chain", videoPublishEditModel.getChain());
        intent.putExtra("disable_delete_title_chain", videoPublishEditModel.isDisableDeleteChain());
        intent.putExtra("struct_list", (Serializable) videoPublishEditModel.getStructList());
        intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
        intent.putExtra("exclude_user_list", (Serializable) videoPublishEditModel.excludeUserList);
        intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
        intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
        intent.putExtra("duet_setting", videoPublishEditModel.reactDuetSetting);
        intent.putExtra("stitch_setting", videoPublishEditModel.stitchSetting);
        intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
        intent.putExtra("extra_publish_stage", videoPublishEditModel.publishStage);
        if (videoPublishEditModel.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) videoPublishEditModel.getStitchParams());
        }
        if (videoPublishEditModel.hasRetake()) {
            LIZ(intent, videoPublishEditModel);
        }
        intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) videoPublishEditModel.draftDuetExtraInfo);
        intent.putExtra("extra_duet_layout", videoPublishEditModel.duetLayout);
        intent.putExtra("duet_video_duration", videoPublishEditModel.duetVideoDuration);
        intent.putExtra("duet_from", videoPublishEditModel.getDuetFrom());
        intent.putExtra("music_origin", videoPublishEditModel.getMusicOrigin());
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = videoPublishEditModel.creativeModel.initialModel.duetAndStitchRouterConfig;
        if (duetAndStitchRouterConfig != null) {
            intent.putExtra("duet_and_stitch_router_config", duetAndStitchRouterConfig);
        }
        return intent;
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, CreativeInfo creativeInfo, String str, String str2, String str3) {
        videoPublishEditModel.creativeInfo = creativeInfo;
        videoPublishEditModel.mOrigin = 0;
        videoPublishEditModel.mFromCut = true;
        videoPublishEditModel.isFastImport = true;
        videoPublishEditModel.mShootWay = ShoutOutsData.shootWay;
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return;
        }
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, new VideoFileInfo(iArr[0], iArr[1], iArr[3], iArr[7], iArr[6]));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(0L, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0));
        ArrayList arrayList = new ArrayList();
        arrayList.add(editVideoSegment);
        videoPublishEditModel.setPreviewInfo(new C6NR(C60903NvH.LJIIJJI().LJJIJLIJ().getVideoWidth(), C60903NvH.LJIIJJI().LJJIJLIJ().getVideoHeight(), 28).LIZ(arrayList));
        videoPublishEditModel.videoWidth();
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[6];
        int i4 = iArr[8];
        long j = iArr[3];
        arrayList2.add(new ImportVideoInfo(i, i2, i3, i4, str, j, j, null, null, iArr[7], 1.0f, str, str, false, null));
        videoPublishEditModel.importInfoList = arrayList2;
        Workspace LIZ = C41727GZf.LIZ(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = LIZ.LLLLLLLLLL().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = LIZ.LLLLLLLLL().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = LIZ.LLJJJIL().getPath();
        videoPublishEditModel.videoCount = 1;
        videoPublishEditModel.voiceVolume = 1.0f;
        videoPublishEditModel.mShootMode = -1;
        videoPublishEditModel.mDuetFrom = null;
        videoPublishEditModel.musicVolume = 1.0f;
        C60903NvH.LJIIJJI().LJJJI().LJIIIIZZ();
        videoPublishEditModel.setNewVersion(3);
        videoPublishEditModel.generateVideoCoverPath();
        C140945g2 c140945g2 = new C140945g2(videoPublishEditModel);
        ShoutOutsData shoutOutsData = new ShoutOutsData();
        videoPublishEditModel.mShoutOutsData = shoutOutsData;
        shoutOutsData.setShoutOutsMode(ShoutOutsData.MODE_POST);
        videoPublishEditModel.mShoutOutsData.setProductId(str2);
        videoPublishEditModel.mShoutOutsData.setMusicId(str3);
        videoPublishEditModel.mShoutOutsData.setPostVideoPath(str);
        c140945g2.LIZJ(false, false);
    }
}
