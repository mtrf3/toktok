package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EffectDataTransport;
import com.ss.android.ugc.aweme.creative.model.edit.EditSaveLocalModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H9R extends C78253UnR {
    public static final /* synthetic */ int LJLJJLL = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(AbstractC43596H9c abstractC43596H9c) {
        List<MultiEditVideoSegmentRecordData> list;
        if (abstractC43596H9c instanceof C43595H9b) {
            C43595H9b c43595H9b = (C43595H9b) abstractC43596H9c;
            C42244Gi0 c42244Gi0 = c43595H9b.LIZIZ;
            final Activity activity = c43595H9b.LIZ;
            ShortVideoContext shortVideoContext = c42244Gi0.LIZJ;
            Intent LJIIIIZZ = LJIIIIZZ(c42244Gi0, shortVideoContext);
            if (C43150Gwc.LIZJ && !C43150Gwc.LIZ) {
                C43150Gwc.LIZJ = false;
                C43150Gwc.LIZLLL("record_success");
            }
            G8G.LIZ.step("av_video_edit", "startVideoEditActivity");
            if (shortVideoContext.mFromOtherPlatform) {
                HZV.LIZ().LJJ(activity, LJIIIIZZ);
                return;
            }
            int i = shortVideoContext.shootMode;
            if (i == 15 || i == 17 || i == 20) {
                LJIIIIZZ.putExtra("extra_request_code", 12345);
                final AqS154S0200000_7 aqS154S0200000_7 = new AqS154S0200000_7(activity, LJIIIIZZ, 99);
                if (activity instanceof LifecycleOwner) {
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
                    if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                        aqS154S0200000_7.invoke();
                        return;
                    } else {
                        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.RecordStage$startActivitySafely$1
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    onActivityStart();
                                }
                            }

                            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                            public final void onActivityStart() {
                                ((LifecycleOwner) activity).getLifecycle().removeObserver(this);
                                aqS154S0200000_7.invoke();
                            }
                        });
                        return;
                    }
                }
                aqS154S0200000_7.invoke();
                return;
            }
            if (o.LJ(shortVideoContext.enterFrom, "effect_qr_scan")) {
                LJIIIIZZ.putExtra("extra_request_code", 1003);
                HZV.LIZ().LJJ(activity, LJIIIIZZ);
                return;
            } else {
                LJIIIIZZ.putExtra("extra_request_code", 12344);
                LJIIIIZZ.putExtra("extra_retake_from_advanced", shortVideoContext.LJJII());
                HZV.LIZ().LJJ(activity, LJIIIIZZ);
                return;
            }
        }
        if (abstractC43596H9c instanceof C43594H9a) {
            C43594H9a c43594H9a = (C43594H9a) abstractC43596H9c;
            ShortVideoContext shortVideoContext2 = c43594H9a.LIZJ;
            Activity activity2 = c43594H9a.LIZ;
            Intent LJIIIZ = LJIIIZ(shortVideoContext2, c43594H9a.LIZIZ, c43594H9a.LIZLLL);
            String absolutePath = shortVideoContext2.cameraComponentModel.mWorkspace.E().getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "shortVideoContext.worksp…catVideoFile.absolutePath");
            String absolutePath2 = shortVideoContext2.cameraComponentModel.mWorkspace.LJJJJLI().getAbsolutePath();
            o.LJIIIIZZ(absolutePath2, "shortVideoContext.worksp…catAudioFile.absolutePath");
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = shortVideoContext2.LJIILL().multiEditVideoRecordData;
            LJIIIZ.putExtra("extra_edit_preview_info", (Parcelable) C43832HIe.LIZJ(shortVideoContext2, multiEditVideoStatusRecordData, absolutePath, absolutePath2));
            if (multiEditVideoStatusRecordData != null) {
                LJIIIZ.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                if (multiEditVideoRecordData != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                    LJIIIZ.putExtra("extra_video_count", list.size());
                }
            }
            HZV.LIZ().LJJII(activity2, LJIIIZ);
            return;
        }
        if (abstractC43596H9c instanceof C43600H9g) {
            Activity activity3 = ((C43600H9g) abstractC43596H9c).LIZ;
            if (activity3 instanceof SAAActivity) {
                SAAActivity sAAActivity = (SAAActivity) activity3;
                if (sAAActivity.LLIIIILZ() instanceof TikTokCameraBaseGroupScene) {
                    AbstractC42651GoZ LLIIIILZ = sAAActivity.LLIIIILZ();
                    o.LJII(LLIIIILZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene");
                    ((TikTokCameraBaseGroupScene) LLIIIILZ).LLLIIIIL();
                    return;
                } else {
                    AbstractC42651GoZ LLIIIILZ2 = sAAActivity.LLIIIILZ();
                    if (LLIIIILZ2 == null) {
                        return;
                    }
                    LLIIIILZ2.LLJJI();
                    return;
                }
            }
            if (activity3 instanceof VideoRecordNewActivity) {
                ((VideoRecordNewActivity) activity3).LJLJJI.LLLIIIIL();
                return;
            } else {
                activity3.finish();
                return;
            }
        }
        if (abstractC43596H9c instanceof C43599H9f) {
            C43599H9f c43599H9f = (C43599H9f) abstractC43596H9c;
            if (c43599H9f.LIZIZ) {
                c43599H9f.LIZ.setResult(-1);
            }
            c43599H9f.LIZ.finish();
            return;
        }
        if (abstractC43596H9c instanceof C164666dC) {
            C164666dC c164666dC = (C164666dC) abstractC43596H9c;
            VideoPublishEditModel videoPublishEditModel = c164666dC.LIZ;
            if (C150655vh.LIZ()) {
                H7R.LIZIZ(videoPublishEditModel.creativeModel.draftInfoModel);
            }
            C60903NvH.LJIIJJI().LJJJI().LJFF().LJ(new C41021G8b(videoPublishEditModel, new GLI("VideoRecordNewActivity", 5)), c164666dC.LIZIZ, null);
            return;
        }
        throw new C162476Zf();
    }

    public static Intent LJIIIIZZ(C42244Gi0 c42244Gi0, ShortVideoContext shortVideoContext) {
        String firstFrameWithEffect;
        List<MultiEditVideoSegmentRecordData> list;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        AVMusicWaveBean aVMusicWaveBean = c42244Gi0.LJ;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = c42244Gi0.LJFF;
        long j = c42244Gi0.LIZIZ;
        int i = c42244Gi0.LIZLLL;
        String str = c42244Gi0.LJI;
        String str2 = c42244Gi0.LJII;
        C43598H9e c43598H9e = c42244Gi0.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordPageAction video path = ");
        LIZ.append(str);
        C143195jf.LIZ(X1D.LIZIZ(LIZ));
        Intent LJIIIZ = LJIIIZ(shortVideoContext, c43598H9e, i);
        if (multiEditVideoStatusRecordData != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (multiEditVideoRecordData != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                LJIIIZ.putExtra("extra_video_count", list.size());
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (multiEditVideoRecordData2 != null) {
                C42315Gj9.LIZ = (int) multiEditVideoRecordData2.endTime;
            }
        }
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("duration", C44847Hit.LIZ(j));
        c6bk.LIZ.put("type", "record");
        c6bk.LIZ.put("abParam", Boolean.TRUE);
        C43882HKc.LIZIZ("type_av_record_concat_time", c6bk.LJ());
        if (aVMusicWaveBean != null) {
            LJIIIZ.putExtra("music_wave_data", aVMusicWaveBean);
        }
        if (multiEditVideoStatusRecordData != null) {
            HCA LIZIZ = shortVideoContext.LIZIZ();
            o.LJIIIIZZ(LIZIZ, "shortVideoContext.allShootingSegments");
            if (shortVideoContext.cameraComponentModel.isRetakeMode) {
                multiEditVideoStatusRecordData.editSegments = LIZIZ;
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
            } else {
                multiEditVideoStatusRecordData.originalSegments = LIZIZ;
                multiEditVideoStatusRecordData.isMultiEditRetake = false;
                multiEditVideoStatusRecordData.recordMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                multiEditVideoStatusRecordData.originalMusicStart = shortVideoContext.cameraComponentModel.mMusicStart;
            }
            LJIIIZ.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
        }
        if (!TextUtils.isEmpty(shortVideoContext.mShareId)) {
            LJIIIZ.putExtra("share_id", shortVideoContext.mShareId);
        }
        if (!TextUtils.isEmpty(shortVideoContext.clientId)) {
            LJIIIZ.putExtra("channel", shortVideoContext.clientId);
        }
        LJIIIZ.putExtra("extra_edit_preview_info", (Parcelable) C43832HIe.LIZJ(shortVideoContext, multiEditVideoStatusRecordData, str, str2));
        ExtractFramesModel extractFramesModel = shortVideoContext.cameraComponentModel.extractFramesModel;
        if (extractFramesModel != null && (firstFrameWithEffect = extractFramesModel.getFirstFrameWithEffect()) != null) {
            LJIIIZ.putExtra("key_choose_media_item_cover_bitmap_data", (Parcelable) new SingleImageCoverBitmapData("", 1, 0L, 0, 0, 0, firstFrameWithEffect));
        }
        LJIIIZ.putExtra("extra_need_add_recent", shortVideoContext.creativeModel.musicBuzModel.needAddRecent);
        return LJIIIZ;
    }

    public static Intent LJIIIZ(ShortVideoContext shortVideoContext, C43598H9e c43598H9e, int i) {
        Serializable serializable;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        TimeSpeedModelExtension timeSpeedModelExtension;
        String stickerId;
        String str;
        String str2;
        String contentType;
        Serializable serializable2;
        Long publishTime;
        String str3;
        Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
        HCA LIZIZ = shortVideoContext.LIZIZ();
        Intent intent = new Intent();
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        HCA hca = shortVideoContext.cameraComponentModel.mDurings;
        o.LJIIIIZZ(hca, "shortVideoContext.durings");
        ArrayList arrayList = new ArrayList(C32I.LJJL(hca, 10));
        Iterator<TimeSpeedModelExtension> it = hca.iterator();
        while (it.hasNext()) {
            SimpleEffect effectInfo = it.next().getEffectInfo();
            if (effectInfo != null) {
                str3 = effectInfo.getResourceId();
            } else {
                str3 = null;
            }
            arrayList.add(str3);
        }
        String LLD = ORZ.LLD(ORZ.LJLL(arrayList), ",", null, null, null, 62);
        HCA hca2 = shortVideoContext.cameraComponentModel.mDurings;
        o.LJIIIIZZ(hca2, "shortVideoContext.durings");
        ArrayList arrayList2 = new ArrayList();
        Iterator<TimeSpeedModelExtension> it2 = hca2.iterator();
        while (it2.hasNext()) {
            SimpleEffect effectInfo2 = it2.next().getEffectInfo();
            if (effectInfo2 != null && (publishTime = effectInfo2.getPublishTime()) != null) {
                arrayList2.add(publishTime);
            }
        }
        EffectDataTransport effectDataTransport = new EffectDataTransport(LLD, arrayList2);
        creativeModel.getClass();
        creativeModel.effectData = effectDataTransport;
        CreativeModel creativeModel2 = shortVideoContext.creativeModel;
        o.LJIIIIZZ(creativeModel2, "shortVideoContext.creativeModel");
        EditSaveLocalModel editSaveLocalModel = creativeModel2.editSaveLocalModel;
        String LIZ = C15190ih.LIZ();
        editSaveLocalModel.getClass();
        editSaveLocalModel.flowId = LIZ;
        C78996UzQ.LJJIZ(intent, creativeModel2);
        intent.putExtra("workspace", workspace);
        if (shortVideoContext.LJJIJIL()) {
            intent.putExtra("music_start", shortVideoContext.cameraComponentModel.mMusicStart);
            intent.putExtra("extra_music_end", shortVideoContext.cameraComponentModel.musicEndTime);
        }
        intent.putExtra("draft_from_shoot", shortVideoContext.draftFromShoot);
        intent.putExtra("qa_permission_dialog_status", shortVideoContext.qaPermissionDialogShownStatus);
        SettingsManager.LIZLLL().getClass();
        intent.putExtra("face_beauty", SettingsManager.LJ("beauty_model", 0));
        intent.putExtra("extra_publish_stage", shortVideoContext.publishStage);
        intent.putExtra("filter_id", 0);
        String str4 = "";
        intent.putExtra("selected_filter_id", "");
        intent.putExtra("extra_record_video_selected_filter_index", shortVideoContext.mVideoRecordSelectedFilterIndex);
        intent.putExtra("extra_record_video_selected_filter_intensity", shortVideoContext.mVideoRecordSelectedFilterIntensity);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", true);
        intent.putExtra("video_segment", C79045V0n.LJIJI(LIZIZ));
        intent.putExtra("hard_encode", shortVideoContext.cameraComponentModel.mHardEncode);
        intent.putExtra("restore", shortVideoContext.cameraComponentModel.mRestoreType);
        intent.putExtra("camera", i);
        intent.putExtra("record_filter_names", shortVideoContext.cameraComponentModel.recordContext.filterLabels.toString());
        intent.putExtra("record_filter_ids", shortVideoContext.cameraComponentModel.recordContext.filterIds.toString());
        intent.putExtra("record_filter_values", shortVideoContext.cameraComponentModel.recordContext.filterValues.toString());
        intent.putExtra("record_beauty_mob_param", (Parcelable) shortVideoContext.beautyMobParam);
        intent.putExtra("filter_lables", shortVideoContext.cameraComponentModel.recordContext.filterLabels.toString());
        intent.putExtra("filter_ids", shortVideoContext.cameraComponentModel.recordContext.filterIds.toString());
        intent.putExtra("smooth_skin_labels", shortVideoContext.cameraComponentModel.recordContext.smoothSkinLabels.toString());
        intent.putExtra("smooth_reshape_labels", shortVideoContext.cameraComponentModel.recordContext.reshapeLabels.toString());
        intent.putExtra("smooth_tanning_labels", shortVideoContext.cameraComponentModel.recordContext.tanningLabels.toString());
        intent.putExtra("smooth_eyes_labels", shortVideoContext.cameraComponentModel.recordContext.eyesLables.toString());
        intent.putExtra("extra_aweme_speed", RecordScene.getSpeedStringByModel(LIZIZ));
        intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(LIZIZ));
        intent.putExtra("extra_beauty_type", shortVideoContext.cameraComponentModel.mBeautyType);
        intent.putParcelableArrayListExtra("extra_beauty_data", RecordScene.getBeautyMetadatas(LIZIZ));
        intent.putExtra("extra_video_record_metadata", C63872f1.LIZIZ(shortVideoContext.cameraComponentModel.videoRecordMetadata));
        intent.putExtra("extra_is_change_speed", RecordScene.isChangeSpeed(LIZIZ));
        intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(LIZIZ));
        intent.putExtra("sticker_info", RecordScene.getStickerInfo(LIZIZ));
        intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(LIZIZ));
        intent.putExtra("shoot_way", shortVideoContext.shootWay);
        intent.putExtra("shoot_from", shortVideoContext.mShootFrom);
        CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        C77412UZs.LJJIJIL(intent, creativeInfo);
        C43587H8t.LIZIZ(intent, new HB0(shortVideoContext), EnumC43590H8w.RECORD, EnumC43590H8w.EDIT);
        intent.putExtra("draft_to_edit_from", shortVideoContext.draftToEditFrom);
        intent.putExtra("draft_id", shortVideoContext.draftId);
        intent.putExtra("new_draft_id", shortVideoContext.newDraftId);
        intent.putExtra("max_duration", shortVideoContext.cameraComponentModel.mMaxDuration);
        intent.putExtra("wav_form", shortVideoContext.mWavFormUrl);
        intent.putExtra("origin", 1);
        if (!shortVideoContext.mIsFromDraft) {
            List<AVChallenge> list = C41658GWo.LIZLLL().LIZ;
            o.LJIIIIZZ(list, "inst().challenges");
            if (list instanceof Serializable) {
                serializable2 = (Serializable) list;
            } else {
                serializable2 = null;
            }
            intent.putExtra("challenge", serializable2);
        }
        intent.putExtra("video_title", shortVideoContext.title);
        intent.putExtra("video_title_chain", shortVideoContext.chain);
        intent.putExtra("duet_from_duet_button", shortVideoContext.mDuetFromDuetButton);
        intent.putExtra("disable_delete_title_chain", shortVideoContext.disableDeleteChain);
        List<AVTextExtraStruct> list2 = shortVideoContext.structList;
        if (list2 instanceof Serializable) {
            serializable = (Serializable) list2;
        } else {
            serializable = null;
        }
        intent.putExtra("struct_list", serializable);
        intent.putExtra("is_rivate", shortVideoContext.isPrivate);
        intent.putExtra("duet_from", shortVideoContext.cameraComponentModel.duetContext.duetFromAwemeId);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < shortVideoContext.cameraComponentModel.mDurings.size(); i2++) {
            if (!TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mDurings.get(i2).getOriginalId())) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(shortVideoContext.cameraComponentModel.mDurings.get(i2).getOriginalId());
                LIZ2.append(",");
                sb.append(X1D.LIZIZ(LIZ2));
            }
        }
        intent.putExtra("original_designer_uid_list", sb.toString());
        int i3 = 0;
        for (int i4 = 0; i4 < shortVideoContext.cameraComponentModel.mDurings.size(); i4++) {
            if (shortVideoContext.cameraComponentModel.mDurings.get(i4).getStickerInfo() != null && shortVideoContext.cameraComponentModel.mDurings.get(i4).getStickerInfo().isOriginalSticker()) {
                i3++;
            }
        }
        intent.putExtra("original_sticker_count", i3);
        if (shortVideoContext.LJJIIJ()) {
            intent.putExtra("reuse_original_sound_id", shortVideoContext.LJIILLIIL());
            intent.putExtra("reuse_original_sound_url", shortVideoContext.LJIJ());
            intent.putExtra("reuse_original_sound_length", shortVideoContext.LJIIZILJ());
        }
        intent.putExtra("duet_author", shortVideoContext.duetFromUser);
        intent.putExtra("duet_hash_tag", shortVideoContext.cameraComponentModel.duetContext.duetFromChallengeName);
        intent.putExtra("record_bgm_delay", shortVideoContext.recordBGMDelay);
        intent.putExtra("edit_loudness_param", (Parcelable) shortVideoContext.loudnessBalanceParam);
        if (shortVideoContext.LJJJI()) {
            DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
            o.LJIIIIZZ(duetContext, "shortVideoContext.duetContext");
            String str5 = duetContext.duetVideoPath;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = duetContext.duetAudioPath;
            if (str6 != null) {
                str4 = str6;
            }
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) new DuetExtraInfo(str5, str4, duetContext.duetVideoWidth, duetContext.duetVideoHeight, duetContext.duetLayoutMode, duetContext.layoutDirection));
        }
        intent.putExtra("shout_out_data", shortVideoContext.mShoutOutsData);
        intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.creativeFlowData);
        intent.putExtra("shoot_mode", shortVideoContext.shootMode);
        intent.putExtra("shooted_shoot_mode", shortVideoContext.shootedShootMode);
        intent.putExtra("duration_mode", shortVideoContext.cameraComponentModel.mCurrentDurationMode);
        intent.putExtra("record_mode", shortVideoContext.cameraComponentModel.recordMode);
        intent.putExtra("record_game_score", shortVideoContext.gameScore);
        intent.putExtra("duet_green_srceen", shortVideoContext.isDuetGreenSrceen);
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        if (cameraComponentModel.isMuted && cameraComponentModel.recordMode != 1) {
            z = true;
        } else {
            z = false;
        }
        intent.putExtra("is_muted", z);
        intent.putExtra("music_origin", shortVideoContext.LJIIL());
        intent.putExtra("extract_model", shortVideoContext.cameraComponentModel.extractFramesModel);
        intent.putExtra("micro_app_info", shortVideoContext.microAppModel);
        intent.putExtra("enter_record_from_other_platform", shortVideoContext.mFromOtherPlatform);
        if (shortVideoContext.microAppModel == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        intent.putExtra("back_to_main_after_publish", z2);
        C43597H9d c43597H9d = c43598H9e.LIZ;
        intent.putExtra("extra_import_compile_cost_time", c43597H9d.LJLIL - c43597H9d.LJLILLLLZI);
        intent.putExtra("extra_start_enter_edit_page", c43598H9e.LIZ.LJLILLLLZI);
        intent.putExtra("extra_start_enter_edit_reason", c43598H9e.LIZ.LJLJI);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<TimeSpeedModelExtension> it3 = shortVideoContext.LIZIZ().iterator();
        while (it3.hasNext()) {
            TimeSpeedModelExtension next = it3.next();
            if (next.getBubbleTexts() != null) {
                linkedHashSet.addAll(next.getBubbleTexts());
            }
            if (next.getARTexts() != null) {
                linkedHashSet2.addAll(next.getARTexts());
                if (linkedHashSet.size() == 0) {
                    linkedHashSet.addAll(next.getARTexts());
                }
            }
        }
        shortVideoContext.messageBubbleTexts.addAll(linkedHashSet);
        shortVideoContext.arTextList.addAll(linkedHashSet2);
        if (!C77413UZt.LJIILL(shortVideoContext.arTextList)) {
            intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.arTextList);
        }
        if (!C77413UZt.LJIILL(shortVideoContext.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.messageBubbleTexts);
        }
        if (!C77413UZt.LJIILL(shortVideoContext.countDownModes)) {
            intent.putIntegerArrayListExtra("extra_countdown_mode", shortVideoContext.countDownModes);
        }
        AVETParameter LIZLLL = shortVideoContext.LIZLLL();
        if (LIZLLL != null) {
            if (o.LJ(LIZLLL.getContentType(), "photo_canvas")) {
                contentType = "video";
            } else {
                contentType = LIZLLL.getContentType();
            }
            LIZLLL.setContentType(contentType);
        } else {
            LIZLLL = null;
        }
        intent.putExtra("av_et_parameter", LIZLLL);
        ExtraMentionUserModel extraMentionUserModel = shortVideoContext.mentionUserModel;
        if (extraMentionUserModel != null) {
            intent.putExtra("extra_mention_user_model", extraMentionUserModel);
        }
        intent.putExtra("enter_from", shortVideoContext.enterFrom);
        intent.putExtra("send_to_user_head", shortVideoContext.sendToUserHead);
        DraftEditTransferModel draftEditTransferModel = shortVideoContext.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        ClientCherEffectParam clientCherEffectParam = shortVideoContext.cameraComponentModel.veCherEffectParam;
        if (clientCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
        }
        StringBuilder sb2 = new StringBuilder();
        if (!C77413UZt.LJIILL(shortVideoContext.pic2VideoSourceList)) {
            Iterator<String> it4 = shortVideoContext.pic2VideoSourceList.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (!TextUtils.isEmpty(sb2)) {
                    sb2.append(",");
                }
                sb2.append(next2);
            }
        }
        intent.putExtra("picture_source", sb2.toString());
        Iterator<TimeSpeedModelExtension> it5 = shortVideoContext.cameraComponentModel.mDurings.iterator();
        while (true) {
            if (it5.hasNext()) {
                if (it5.next().getBackgroundVideo() != null) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        intent.putExtra("contain_backgroundvideo", z3);
        Iterator<TimeSpeedModelExtension> it6 = shortVideoContext.cameraComponentModel.mDurings.iterator();
        while (true) {
            if (it6.hasNext()) {
                if (it6.next().getDiyPropVideo() != null) {
                    z4 = true;
                    break;
                }
            } else {
                z4 = false;
                break;
            }
        }
        intent.putExtra("contain_diy_prop_video", z4);
        shortVideoContext.pic2VideoSource = 0;
        intent.putExtra("use_music_before_edit", shortVideoContext.LJJIJIL());
        if (shortVideoContext.LJIILL() == null) {
            Iterator<TimeSpeedModelExtension> it7 = LIZIZ.iterator();
            while (it7.hasNext()) {
                TimeSpeedModelExtension segment = it7.next();
                o.LJIIIIZZ(segment, "segment");
                if (C76917UGr.LJJJJJ(segment) && !segment.isSupportRetake()) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        intent.putExtra("support_retake", z5);
        intent.putExtra("extra_duet_layout", shortVideoContext.cameraComponentModel.duetContext.duetLayout);
        intent.putExtra("duet_video_duration", shortVideoContext.duetVideoDuration);
        intent.putExtra("extra_tts_voice_model", (Serializable) shortVideoContext.ttsVoiceModel);
        intent.putExtra("extra_success_enable_aec", shortVideoContext.cameraComponentModel.duetContext.successEnableAEC);
        intent.putExtra("comment_video_model", shortVideoContext.commentVideoModel);
        intent.putExtra("question_answer_video_model", shortVideoContext.qaStruct);
        QAStickerModel qAStickerModel = shortVideoContext.qaStickerModel;
        if (!(qAStickerModel instanceof Parcelable)) {
            qAStickerModel = null;
        }
        intent.putExtra("question_answer_video_model_new", (Parcelable) qAStickerModel);
        LibraryMaterialInfoSv libraryMaterialInfoSv = shortVideoContext.libraryContext.libraryMaterialInfo;
        if (libraryMaterialInfoSv != null && !libraryMaterialInfoSv.isLibraryMaterialConsumed()) {
            intent.putExtra("library_video_model", (Serializable) shortVideoContext.libraryContext.libraryMaterialInfo);
        }
        intent.putExtra("extra_event_params", shortVideoContext.extraEventParams);
        intent.putExtra("auto_selected_anchor", shortVideoContext.mAutoSelectedAnchor);
        intent.putExtra("open_platform_client_key", shortVideoContext.openPlatformClientKey);
        intent.putStringArrayListExtra("extra_camera_lens_info", RecordScene.getCameraLensInfoList(LIZIZ));
        if (shortVideoContext.LJJIJIIJI()) {
            StitchParams stitchParams = shortVideoContext.stitchContext.stitchParams;
            if (!(stitchParams instanceof Parcelable)) {
                stitchParams = null;
            }
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
            StitchParams stitchParams2 = shortVideoContext.stitchContext.stitchParams;
            if (stitchParams2 != null && stitchParams2.getMusic() != null) {
                long j = shortVideoContext.cameraComponentModel.mMusicStart;
                StitchParams stitchParams3 = shortVideoContext.stitchContext.stitchParams;
                o.LJI(stitchParams3);
                intent.putExtra("music_start", (int) Math.max(0L, j - stitchParams3.getDuration()));
            }
        }
        SharedARModel sharedARModel = shortVideoContext.sharedARModel;
        if (sharedARModel != null) {
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        if (C77413UZt.LJJ(LIZIZ)) {
            intent.putParcelableArrayListExtra("green_screen_material_list", RecordScene.getGreenScreenMaterials(LIZIZ));
        }
        intent.putExtra("draft_music_legal_param", shortVideoContext.creativeModel.musicBuzModel.isDraftMusicIllegal);
        intent.putExtra("from_prop_id", shortVideoContext.fromPropId);
        Boolean isDefaultProp = RecordScene.isDefaultProp(shortVideoContext.cameraComponentModel.mDurings, shortVideoContext.fromPropId);
        o.LJIIIIZZ(isDefaultProp, "isDefaultProp(shortVideo…tVideoContext.fromPropId)");
        intent.putExtra("is_default_prop", isDefaultProp.booleanValue());
        intent.putExtra("extra_audio_aec_delay_time", shortVideoContext.audioAecDelayTime);
        intent.putExtra("extra_current_zoom_value", shortVideoContext.currentZoomValue);
        intent.putExtra("enter_method", shortVideoContext.enterMethod);
        intent.putExtra("upload_next_method", shortVideoContext.albumPreviewNextMethod);
        intent.putExtra("duet_mode_type", shortVideoContext.duetModeType);
        String str7 = shortVideoContext.publishRetainType;
        if (str7 == null) {
            str7 = "NULL";
        }
        intent.putExtra("publish_retain_type", str7);
        HCA LIZIZ2 = shortVideoContext.LIZIZ();
        if (LIZIZ2 != null) {
            timeSpeedModelExtension = (TimeSpeedModelExtension) ORZ.LJLLLL(LIZIZ2);
        } else {
            timeSpeedModelExtension = null;
        }
        int i5 = shortVideoContext.firstPropOrder;
        if (shortVideoContext.retainFirstEffect == null || timeSpeedModelExtension == null || (stickerId = timeSpeedModelExtension.getStickerId()) == null || stickerId.length() == 0) {
            shortVideoContext.firstPropOrder = 0;
        } else {
            if (timeSpeedModelExtension != null) {
                str = timeSpeedModelExtension.getStickerId();
            } else {
                str = null;
            }
            Effect effect = shortVideoContext.retainFirstEffect;
            if (effect != null) {
                str2 = effect.getEffectId();
            } else {
                str2 = null;
            }
            if (o.LJ(str, str2)) {
                shortVideoContext.firstPropOrder = Math.max(1, i5);
            } else {
                shortVideoContext.firstPropOrder = 0;
            }
        }
        intent.putExtra("order", shortVideoContext.firstPropOrder);
        V16.LJJJLL(intent, shortVideoContext);
        return intent;
    }
}
