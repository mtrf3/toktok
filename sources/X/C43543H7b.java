package X;

import Y.AfS59S0100000_7;
import Y.IDaS218S0100000_7;
import Y.IDhS95S0100000_2;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import com.ss.android.ugc.aweme.canvas.StreamEditConfigure;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.story.forward.EmptyDownloadListener;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS62S0400000_2;
import kotlin.jvm.internal.IDqS449S0100000_2;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.H7b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43543H7b {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static ProgressDialogC164766dM LIZIZ;

    public static void LIZ(ActivityC45651qj activityC45651qj) {
        ProgressDialogC164766dM progressDialogC164766dM;
        if (LIZ.decrementAndGet() == 0 && (progressDialogC164766dM = LIZIZ) != null && progressDialogC164766dM.isShowing() && activityC45651qj != null && !activityC45651qj.isFinishing()) {
            ProgressDialogC164766dM progressDialogC164766dM2 = LIZIZ;
            if (progressDialogC164766dM2 != null) {
                progressDialogC164766dM2.dismiss();
            }
            LIZIZ = null;
            C42303Gix.LIZ(1112, GGO.DISMISS, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
        }
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj) {
        LIZ.incrementAndGet();
        if (LIZIZ == null && activityC45651qj != null && !activityC45651qj.isFinishing()) {
            LIZIZ = ProgressDialogC164766dM.LIZLLL(activityC45651qj, activityC45651qj.getString(R.string.pc6));
            C42303Gix.LIZ(1112, GGO.SHOW, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
        }
    }

    public static void LJ(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        StreamEditConfigure streamEditConfigure;
        ForwardVideo forwardVideo;
        Object obj;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null && (streamEditConfigure = extra.getStreamEditConfigure()) != null) {
            File file = new File(streamEditConfigure.getCacheDir());
            if (!file.exists() && !file.mkdirs()) {
                return;
            }
            C41848Gbc c41848Gbc = C41848Gbc.LIZ;
            CanvasExtra extra2 = canvasVideoData.getExtra();
            if (extra2 == null || (forwardCanvasExtra = extra2.getForwardCanvasExtra()) == null || (forwardVideo = forwardCanvasExtra.getForwardVideo()) == null) {
                List<String> sourceInfo = canvasVideoData.getSourceInfo();
                if (sourceInfo == null || (obj = ORZ.LJLLLL(sourceInfo)) == null) {
                    obj = "";
                }
                forwardVideo = new ForwardVideo(C47261Igj.LJJIJ(obj), null, 0, 0, 0, null, null, null, false, null, null, null, 4094, null);
            }
            String cacheDir = streamEditConfigure.getCacheDir();
            String fileName = streamEditConfigure.getFileName();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(streamEditConfigure.getCacheDir());
            LIZ2.append('+');
            LIZ2.append(streamEditConfigure.getFileName());
            c41848Gbc.download(forwardVideo, new ForwardMediaDownloader.DownloadConfig(cacheDir, fileName, X1D.LIZIZ(LIZ2), false, false, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT, null), streamEditConfigure.getPartialResult(), new EmptyDownloadListener());
        }
    }

    public static void LIZJ(final ActivityC45651qj mContext, final VideoPublishEditModel mModel, final InterfaceC65784Pro interfaceC65784Pro) {
        String str;
        C10K LJIIIZ;
        List<CanvasFilterParam> transformList;
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(mContext, "mContext");
        final long currentTimeMillis = System.currentTimeMillis();
        LIZIZ(mContext);
        C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
        C10K LJIIIZ2 = C10K.LJIIIZ(null);
        final n nVar = new n();
        ArrayList arrayList = new ArrayList();
        if (mModel.mIsFromDraft && C00F.LIZ(31744, 0, "tool_hdr_strategy", true) != 0) {
            arrayList.add("lens_hdr");
        }
        AudioEnhanceParam audioEnhanceParam = mModel.audioEnhanceParam;
        o.LJIIIIZZ(audioEnhanceParam, "mModel.audioEnhanceParam");
        if (C78685UuP.LJJIFFI(audioEnhanceParam) && !C44687HgJ.LIZIZ(C126354xb.LIZ)) {
            arrayList.add("unet_denoise_44k_music_model_v1.0");
        }
        if (!arrayList.isEmpty()) {
            new HIT().LIZIZ((String[]) arrayList.toArray(new String[0]), new FetchResourcesListener() { // from class: X.5hs
                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onSuccess() {
                    H78.LJI("fetchRequirement onSuccess");
                    nVar.LJ(null);
                }

                @Override // com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener
                public final void onFailed(Exception exc) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("fetchRequirement fail : ");
                    LIZ2.append(exc);
                    H78.LIZJ(X1D.LIZIZ(LIZ2));
                    nVar.LJ(null);
                }
            });
        } else {
            nVar.LJ(null);
        }
        C10K[] c10kArr = new C10K[5];
        c10kArr[0] = LJIIIZ2;
        final n nVar2 = new n();
        HashSet hashSet = new HashSet();
        o.LJIIIIZZ(mModel.getEffectList(), "model.effectList");
        if (!r5.isEmpty()) {
            Iterator<EffectPointModel> it = mModel.getEffectList().iterator();
            while (it.hasNext()) {
                EffectPointModel next = it.next();
                if (TextUtils.equals(next.getCategory(), "motion")) {
                    hashSet.add(next.getKey());
                } else if (!C39579Fg7.LIZIZ(next.getResDir())) {
                    hashSet.add(next.getKey());
                }
            }
        }
        CanvasVideoData canvasVideoData = mModel.canvasVideoData;
        if (canvasVideoData != null && (transformList = canvasVideoData.getTransformList()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<CanvasFilterParam> it2 = transformList.iterator();
            while (it2.hasNext()) {
                String animPath = it2.next().getAnimPath();
                if (animPath != null) {
                    arrayList2.add(animPath);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str2 = (String) it3.next();
                if (str2.length() > 0 && !C78966Uyw.LJJIJIL(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            InterfaceC84498XEg LIZ2 = C84488XDw.LIZ(mContext, null);
            LIZ2.G8(mContext);
            LIZ2.LJ(new ArrayList(hashSet), true, null, new IFetchEffectListListener() { // from class: X.6Z2
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult e) {
                    o.LJIIIZ(e, "e");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("uniformFetchList fail : ");
                    LIZ3.append(e);
                    H78.LIZJ(X1D.LIZIZ(LIZ3));
                    nVar2.LJ(C76800UCe.LIZ);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> response) {
                    o.LJIIIZ(response, "response");
                    H78.LJI("uniformFetchList onSuccess");
                    nVar2.LJ(C76800UCe.LIZ);
                }
            });
        } else {
            H78.LJI("All effects needn't download");
            nVar2.LJ(C76800UCe.LIZ);
        }
        C10K c10k = nVar2.LIZ;
        o.LJIIIIZZ(c10k, "effectPlatformTaskSource.task");
        c10kArr[1] = c10k;
        c10kArr[2] = nVar.LIZ;
        n nVar3 = new n();
        C44423Hc3 LJ = C73098SmU.LJ();
        List<EditVideoSegment> videoList = mModel.getPreviewInfo().getVideoList();
        if (!C78886Uxe.LJJIJ(videoList)) {
            str = ((EditVideoSegment) ListProtector.get(videoList, 0)).getVideoPath();
        } else {
            str = null;
        }
        if (LJ != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(Integer.valueOf(mModel.videoWidth()));
            arrayList3.add(Integer.valueOf(mModel.videoHeight()));
            C60903NvH.LJIIJJI().LIZJ().LIZJ(arrayList3, String.valueOf(str), LJ, new IDqS449S0100000_2(nVar3, (n<C76800UCe>) 4), new AqS173S0100000_7(nVar3, (n<Boolean>) 255));
        } else {
            nVar3.LJ(null);
        }
        C10K c10k2 = nVar3.LIZ;
        o.LJIIIIZZ(c10k2, "downloadTaskSource.task");
        c10kArr[3] = c10k2;
        H78.LIZ("fetchMusicSyncModelTask:");
        if (!H7R.LJIIL(mModel) || !C45771Hxn.LIZIZ) {
            H78.LIZ("fetchMusicSyncModelTask: no need fetch effect for music sync");
            LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
            o.LJIIIIZZ(LJIIIZ, "forResult(Unit)");
        } else {
            final n nVar4 = new n();
            C45422HsA.LIZJ(new IFoundationAVService.IFetchResourcesListener() { // from class: X.6X5
                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onFailed(Exception exc) {
                    H78.LIZ("fetchMusicSyncModelTask: fetch effect for music sync failed and disable editMusicSyncMode");
                    mModel.editMusicSyncMode = false;
                }

                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onSuccess(String[] requirements) {
                    o.LJIIIZ(requirements, "requirements");
                    H78.LIZ("fetchMusicSyncModelTask: fetch effect for music sync successfully");
                    nVar4.LJ(C76800UCe.LIZ);
                }
            });
            LJIIIZ = nVar4.LIZ;
            o.LJIIIIZZ(LJIIIZ, "resourceTask.task");
        }
        c10kArr[4] = LJIIIZ;
        C10K.LJIJJ(C65661Ppp.LIZIZ(c10kArr)).LJ(new C10I() { // from class: X.6aY
            @Override // X.C10I
            public final Object then(C10K c10k3) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("VideoPublish finish prepareEffectPlatform, cost: ");
                LIZ3.append(System.currentTimeMillis() - currentTimeMillis);
                LIZ3.append("ms.");
                H78.LJI(X1D.LIZIZ(LIZ3));
                C43543H7b.LIZ(mContext);
                interfaceC65784Pro.invoke();
                return C76800UCe.LIZ;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public static void LIZLLL(ActivityC45651qj mContext, VideoPublishEditModel videoPublishEditModel, InterfaceC65784Pro interfaceC65784Pro) {
        java.util.Map<SingleImageData, Integer> needCompileImages;
        o.LJIIIZ(mContext, "mContext");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (needCompileImages = imageAlbumData.getNeedCompileImages()) != null && (!needCompileImages.isEmpty())) {
            LIZIZ(mContext);
            AqS62S0400000_2 aqS62S0400000_2 = new AqS62S0400000_2((java.util.Map) needCompileImages, (java.util.Map<SingleImageData, Integer>) videoPublishEditModel, (VideoPublishEditModel) mContext, (ActivityC45651qj) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 1);
            if (!((Boolean) H8Y.LIZ.getValue()).booleanValue()) {
                aqS62S0400000_2.invoke();
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<SingleImageData, Integer>> it = needCompileImages.entrySet().iterator();
            while (it.hasNext()) {
                String filterId = it.next().getKey().getFilterInfo().getFilterId();
                if (!ujb.o.LJJJJJL(filterId)) {
                    arrayList.add(filterId);
                }
            }
            if (arrayList.isEmpty()) {
                aqS62S0400000_2.invoke();
                return;
            } else {
                C60903NvH.LJIIJJI().LJIILL().LJI().LIZJ(false).LJJIII(new IDhS95S0100000_2(arrayList, 7), false).LJJJLL(new InterfaceC64592gB() { // from class: X.9Fh
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }, new AfS59S0100000_7(aqS62S0400000_2, 29), new IDaS218S0100000_7(aqS62S0400000_2, 1));
                return;
            }
        }
        interfaceC65784Pro.invoke();
    }

    public static Intent LJFF(int i, VideoPublishEditModel model, boolean z) {
        String str;
        Object obj;
        o.LJIIIZ(model, "model");
        Intent intent = new Intent();
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        C78996UzQ.LJJIZ(intent, creativeModel);
        intent.putExtra("upload_method", model.uploadMethod);
        List<String> list = model.uploadTabNameList;
        if (list != null) {
            intent.putStringArrayListExtra("upload_tab_name", new ArrayList<>(list));
        }
        intent.putExtra("template_id", model.templateId);
        intent.putExtra("upload_next_method", model.albumPreviewNextMethod);
        intent.putExtra("workspace", C41727GZf.LIZ(model));
        intent.putExtra("sticker_challenge", (Parcelable) model.stickerChallenge);
        CreativeInfo creativeInfo = model.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
        C77412UZs.LJJIJIL(intent, creativeInfo);
        intent.putExtra("face_beauty", model.mFaceBeauty);
        intent.putExtra("face_beauty_open", model.faceBeautyOpen);
        ArrayList<BeautyMetadata> arrayList = model.mBeautyMetadatas;
        if (arrayList != null && !arrayList.isEmpty()) {
            intent.putParcelableArrayListExtra("extra_beauty_data", model.mBeautyMetadatas);
        }
        intent.putExtra("filter_id", model.mSelectedId);
        intent.putExtra("selected_filter_id", model.mSelectedFilterId);
        intent.putExtra("selected_filter_name", model.mSelectedFilterLabel);
        intent.putExtra("selected_filter_res_id", model.mSelectedFilterResId);
        intent.putExtra("extra_selected_filter_intensity", model.mSelectedFilterIntensity);
        intent.putExtra("camera", model.mCameraPosition);
        intent.putExtra("record_filter_names", model.mRecordFilterLabels);
        intent.putExtra("record_filter_values", model.mRecordFilterValues);
        intent.putExtra("record_beauty_mob_param", (Parcelable) model.mBeautyMobParam);
        intent.putExtra("record_filter_ids", model.mRecordFilterIds);
        intent.putExtra("filter_lables", model.mCurFilterLabels);
        intent.putExtra("filter_ids", model.mCurFilterIds);
        intent.putExtra("smooth_skin_labels", model.mSmoothSkinLabels);
        intent.putExtra("smooth_reshape_labels", model.mReshapeLabels);
        intent.putExtra("smooth_eyes_labels", model.mEyesLabels);
        intent.putExtra("smooth_tanning_labels", model.mTanningLabels);
        intent.putExtra("extra_aweme_speed", model.videoSpeed);
        intent.putExtra("extra_av_camera_ids", model.cameraIds);
        intent.putExtra("extra_beauty_type", model.beautyType);
        intent.putExtra("extra_video_record_metadata", C63872f1.LIZIZ(model.metadataMap));
        intent.putExtra("music_start", model.getMMusicStart());
        intent.putExtra("extra_music_end", model.getMMusicEnd());
        intent.putExtra("max_duration", model.maxDuration);
        intent.putExtra("wav_form", model.audioTrack);
        intent.putExtra("video_segment", model.mVideoSegmentsDesc);
        intent.putExtra("content_type", H7R.LJIIIZ(model));
        if (model.mFromCut || model.mFromMultiCut || model.isMvThemeVideoType()) {
            str = "upload";
        } else {
            str = "shoot";
        }
        intent.putExtra("content_source", str);
        intent.putExtra("hard_encode", model.mHardEncode);
        intent.putExtra("sticker_path", model.mStickerPath);
        intent.putExtra("sticker_id", model.mStickerID);
        intent.putExtra("first_sticker_music_ids", model.mFirstStickerMusicIdsJson);
        intent.putExtra("draft_id", model.draftId);
        intent.putExtra("new_draft_id", model.newDraftId);
        intent.putExtra("duet_green_srceen", model.isDuetGreenSrceen);
        intent.putExtra("isFromDraft", true);
        intent.putExtra("videoCoverStartTm", model.mVideoCoverStartTm);
        intent.putExtra("cover_publish_model", (Parcelable) model.getCoverPublishModel());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("effect list from publish : ");
        if (model.getEffectList() != null) {
            obj = Integer.valueOf(model.getEffectList().size());
        } else {
            obj = "null";
        }
        LIZ2.append(obj);
        X1D.LIZIZ(LIZ2);
        intent.putExtra("extra_video_canvas_width", model.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", model.mVideoCanvasHeight);
        intent.putExtra("origin", model.mOrigin);
        intent.putExtra("extra_import_video_info_list", model.importInfoList);
        intent.putExtra("extra_video_count", model.videoCount);
        intent.putExtra("extra_photo_count", model.photoCount);
        intent.putExtra("challenge", (Serializable) model.challenges);
        intent.putExtra("shoot_way", model.mShootWay);
        intent.putExtra("video_title", model.title);
        intent.putExtra("photo_mode_heading", model.heading);
        intent.putExtra("video_title_chain", model.getChain());
        intent.putExtra("disable_delete_title_chain", model.isDisableDeleteChain());
        intent.putExtra("struct_list", (Serializable) model.getStructList());
        intent.putExtra("is_rivate", model.isPrivate);
        intent.putExtra("exclude_user_list", (Serializable) model.excludeUserList);
        intent.putExtra("allow_recommend", model.allowRecommend);
        if (!C78886Uxe.LJJIJ(model.geofencingSetting)) {
            intent.putExtra("geo_fencing", (Serializable) model.geofencingSetting);
        }
        intent.putExtra("comment_setting", model.commentSetting);
        intent.putExtra("duet_setting", model.reactDuetSetting);
        intent.putExtra("stitch_setting", model.stitchSetting);
        intent.putExtra("duet_from", model.getDuetFrom());
        intent.putExtra("duet_author", model.getDuetAuthor());
        intent.putExtra("duet_hash_tag", model.getDuetHashTag());
        intent.putExtra("fromMultiCut", model.mFromMultiCut);
        intent.putExtra("edit_video_length", model.mCropVideo);
        intent.putExtra("duet_video_duration", model.duetVideoDuration);
        intent.putExtra("fromCut", model.mFromCut);
        intent.putExtra("shoot_mode", model.mShootMode);
        intent.putExtra("shooted_shoot_mode", model.mShootedShootMode);
        intent.putExtra("duration_mode", model.mDurationMode);
        intent.putExtra("contain_backgroundvideo", model.containBackgroundVideo);
        intent.putExtra("upload_video_type", model.mIsMultiVideo);
        intent.putExtra("record_mode", model.recordMode);
        intent.putExtra("record_game_score", model.gameScore);
        intent.putExtra("extra_auto_enhance_state", model.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", model.autoEnhanceType);
        intent.putExtra("is_muted", model.isMuted);
        intent.putExtra("music_volume", model.musicVolume);
        intent.putExtra("record_bgm_delay", model.recordBgmDelay);
        intent.putExtra("edit_loudness_param", (Parcelable) model.loudnessBalanceParam);
        intent.putExtra("open_platform_extra", model.openPlatformExtra);
        intent.putExtra("music_origin", model.getMusicOriginWithCheck());
        intent.putExtra("voice_volume", model.voiceVolume);
        ClientCherEffectParam clientCherEffectParam = model.veCherEffectParam;
        if (clientCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
        }
        AudioEffectParam audioEffectParam = model.veAudioEffectParam;
        if (audioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", (Parcelable) audioEffectParam);
        }
        AudioRecorderParam audioRecorderParam = model.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            intent.putExtra("audio_record_param", (Parcelable) audioRecorderParam);
        }
        CreativeFlowData creativeFlowData = model.creativeFlowData;
        if (creativeFlowData != null) {
            intent.putExtra("creative_flow_data", (Parcelable) creativeFlowData);
        }
        CommentVideoModel commentVideoModel = model.commentVideoModel;
        if (commentVideoModel != null) {
            intent.putExtra("comment_video_model", commentVideoModel);
        }
        C43587H8t.LIZIZ(intent, H83.LIZ(model), EnumC43590H8w.PUBLISH, EnumC43590H8w.EDIT);
        intent.putExtra("extract_model", model.extractFramesModel);
        intent.putExtra("infosticker_model", (Parcelable) model.infoStickerModel);
        intent.putExtra("download_setting", model.allowDownloadSetting);
        intent.putExtra("av_upload_struct", model.uploadMiscInfoStruct);
        if (model.isMvThemeVideoType()) {
            intent.putExtra("key_mv_theme_data", model.mvCreateVideoData);
        }
        intent.putExtra("extra_multi_edit_video_data", (Parcelable) model.multiEditVideoRecordData);
        SharedARModel sharedARModel = model.getSharedARModel();
        if (sharedARModel != null) {
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        intent.putExtra("extra_stickpoint_mode", model.isStickPointMode);
        intent.putExtra("key_stick_point_data", model.stickPointData);
        intent.putExtra("cutsame_data", model.cutSameEditData);
        intent.putExtra("extra_av_is_fast_import", model.isFastImport);
        if (model.getPreviewInfo() != null) {
            intent.putExtra("extra_edit_preview_info", (Parcelable) model.getPreviewInfo());
        }
        DraftEditTransferModel draftEditTransferModel = model.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        if (!C78886Uxe.LJJIJ(model.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", model.messageBubbleTexts);
        }
        intent.putExtra("picture_source", model.pic2VideoSource);
        intent.putExtra("use_music_before_edit", model.isUseMusicBeforeEdit());
        C1536161d.LJIIJJI = false;
        intent.putExtra("sticker_info", model.stickerInfo);
        intent.putStringArrayListExtra("extra_camera_lens_info", model.cameraLensInfo);
        if (model.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) model.getStitchParams());
        }
        intent.putParcelableArrayListExtra("library_material_info", model.libraryMaterialList);
        intent.putExtra("extra_publish_stage", model.publishStage);
        intent.putExtra("extra_photo_mv_mode", model.isPhotoMvMode);
        intent.putExtra("extra_photo_mv_mode_1080p", model.isPhotoMvMode1080p);
        intent.putExtra("is_photo_mv_music", model.isPhotoMvMusic);
        Boolean isSoundLoop = model.getIsSoundLoop();
        o.LJIIIIZZ(isSoundLoop, "model.isSoundLoop");
        intent.putExtra("extra_is_sound_loop", isSoundLoop.booleanValue());
        intent.putExtra("draft_music_legal_param", model.isDraftMusicIllegal());
        intent.putExtra("extra_audio_aec_delay_time", model.audioAecDelayTime);
        intent.putExtra("enter_edit_page_method", "click_back_button");
        intent.putExtra("extra_current_zoom_value", model.currentZoomValue);
        if (model.isDuet()) {
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) model.draftDuetExtraInfo);
            intent.putExtra("extra_duet_layout", model.duetLayout);
            intent.putExtra("duet_from", model.getDuetFrom());
        }
        intent.putExtra("is_west_window_exist", model.isWestWindowExistStr);
        CanvasVideoData canvasVideoData = model.canvasVideoData;
        if (canvasVideoData != null) {
            intent.putExtra("photo_canvas_data", canvasVideoData);
        }
        if (!C78886Uxe.LJJIJ(model.tagUserList)) {
            intent.putExtra("extra_social_video_tag_list", model.tagUserList);
        }
        AudioEnhanceParam audioEnhanceParam = model.audioEnhanceParam;
        o.LJII(audioEnhanceParam, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("audio_enhance_param", (Parcelable) audioEnhanceParam);
        intent.putExtra("edit_music_sync_mode", model.editMusicSyncMode);
        intent.putExtra("sound_sync_from_anchor", model.soundSyncFromAnchor);
        Cut2EditTransferModel cut2EditTransferModel = model.cut2EditTransferModel;
        ImageAlbumData imageAlbumData = null;
        if (!(cut2EditTransferModel instanceof Parcelable)) {
            cut2EditTransferModel = null;
        }
        intent.putExtra("cut_to_edit_transfer_model", (Parcelable) cut2EditTransferModel);
        intent.putExtra("draft_save_time", model.draftSaveTime);
        intent.putExtra("creation_mode", model.creationMode);
        if (H7R.LJJJJL(model)) {
            ImageAlbumData imageAlbumData2 = model.getImageAlbumData();
            if (imageAlbumData2 instanceof Parcelable) {
                imageAlbumData = imageAlbumData2;
            }
            intent.putExtra("image_album_data", (Parcelable) imageAlbumData);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("buildIntentFromVideoPublishEditModel ");
        LIZ3.append(H7R.LJJJJL(model));
        H78.LJI(X1D.LIZIZ(LIZ3));
        intent.putExtra("extra_apply_voice_to_all_text", model.getApplyVoiceToAllTextSwitch());
        intent.putExtra("extra_has_multi_audio_loudness_normalization", model.hasMultiAudioLoudnessNormalization);
        intent.putExtra("publish_retain_type", model.publishRetainType);
        intent.putExtra("order", model.propOrder);
        intent.putExtra("NLE", model.nleData);
        intent.putExtra("draft_to_edit_from", i);
        if (z) {
            intent.putExtra("video_cover_path", model.getVideoCoverPath());
        }
        return intent;
    }
}
