package X;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS37S0301000_7;
import kotlin.jvm.internal.AqS45S0110000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.H7c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43544H7c implements InterfaceC42119Gfz {
    public static int LJIILL = 40;
    public static int LJIILLIIL = 80;
    public final Activity LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public XKQ LIZLLL;
    public C42278GiY LJ;
    public int LJFF;
    public C5W8 LJI;
    public List<? extends VideoSegment> LJII;
    public final C62822Ol8 LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;

    public final void LJIILJJIL() {
        C145995oB c145995oB = new C145995oB();
        long j = this.LJIIJJI;
        long j2 = 0;
        if (j > 60000) {
            j = 0;
        }
        c145995oB.LIZIZ(j, "fetch_music");
        long j3 = this.LJIIL;
        if (j3 <= 60000) {
            j2 = j3;
        }
        c145995oB.LIZIZ(j2, "fetch_algorithm");
        GXR.LIZ("tool_performance_ai_clip", c145995oB.LIZ);
    }

    @Override // X.InterfaceC42119Gfz
    public final void dismissDialog() {
        C42278GiY c42278GiY = this.LJ;
        if (c42278GiY != null) {
            c42278GiY.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LJIIL(List list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it.next();
            int i = videoSegment.width;
            int i2 = videoSegment.height;
            int LIZIZ = videoSegment.LIZIZ();
            int LIZLLL = videoSegment.LIZLLL();
            String LJII = videoSegment.LJII(true);
            LJII.toString();
            long j = videoSegment.duration;
            long LJ = videoSegment.LJ() - videoSegment.LJIIIZ();
            String str = videoSegment.mDescription;
            String str2 = videoSegment.mMusicId;
            int LJI = videoSegment.LJI();
            float LJIIIIZZ = videoSegment.LJIIIIZZ();
            String LJII2 = videoSegment.LJII(false);
            LJII2.toString();
            arrayList.add(new ImportVideoInfo(i, i2, LIZIZ, LIZLLL, LJII, j, LJ, str, str2, LJI, LJIIIIZZ, LJII2, videoSegment.originPath, videoSegment.fastImportDependHW, null, 16384, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    public static void LJIILIIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutOptimizedVideoChosenHandler:");
        LIZ.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC42119Gfz
    public final void LIZIZ(int i) {
        C43045Guv.LIZLLL(new AqS107S0101000_7(this, i, 1), 0L);
    }

    public final void LJFF(List list) {
        boolean z;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (!z) {
            if (list.size() == 1) {
                i2 = 1003;
            } else {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MediaModel) it.next()).LJ()) {
                        if (i != -1) {
                            i2 = 1005;
                        }
                    } else {
                        i++;
                    }
                }
                i2 = 1004;
            }
        }
        this.LJFF = i2;
    }

    public final void LJIJJ(String str) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("cancel_from", str);
        c145995oB.LIZIZ(System.currentTimeMillis() - this.LJIIJ, "time_elapsed");
        FMX.LJIIL("click_cancel_loading_content", c145995oB.LIZ);
    }

    public final void LJJII(int i) {
        C43045Guv.LIZLLL(new AqS107S0101000_7(this, i, 2), 0L);
    }

    public static VideoSegment LJIIJJI(MediaModel mediaModel, java.util.Map map) {
        VEUtils.VEVideoFileInfo LIZIZ;
        VideoSegment videoSegment = new VideoSegment(mediaModel);
        if (map.get(mediaModel.fileLocalUriPath) != null) {
            LIZIZ = (VEUtils.VEVideoFileInfo) map.get(mediaModel.fileLocalUriPath);
            H8A.LIZ(LIZIZ);
        } else {
            String str = mediaModel.fileLocalUriPath;
            o.LJIIIIZZ(str, "model.fileLocalUriPath");
            LIZIZ = H8A.LIZIZ(str);
        }
        if (LIZIZ != null) {
            videoSegment.width = LIZIZ.width;
            videoSegment.height = LIZIZ.height;
            videoSegment.fps = LIZIZ.fps;
            videoSegment.bitRate = LIZIZ.bitrate;
            videoSegment.gop = LIZIZ.keyFrameCount;
            videoSegment.codecId = LIZIZ.codec;
        }
        return videoSegment;
    }

    public static void LJJ(Activity activity, String str) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(str);
        C78915Uy7.LJJIIZI(activity, 3009, creativeToastBuilder);
    }

    @Override // X.InterfaceC42119Gfz
    public final void LJ(int i, boolean z) {
        if (!this.LIZ.isFinishing()) {
            C42278GiY c42278GiY = this.LJ;
            if (c42278GiY != null && c42278GiY.isShowing()) {
                return;
            }
            C42279GiZ c42279GiZ = C42279GiZ.LIZ;
            Activity activity = this.LIZ;
            int i2 = this.LJFF;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(true);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            String string = this.LIZ.getString(R.string.rjz);
            o.LJIIIIZZ(string, "activity.getString(R.string.ss_loading)");
            creativeLoadingDialogBuilder.loadingMessage(string);
            creativeLoadingDialogBuilder.clickCancelListener(new AqS45S0110000_2(this, z, 3));
            C42278GiY c42278GiY2 = (C42278GiY) c42279GiZ.createLoadingDialog(activity, i2, creativeLoadingDialogBuilder);
            this.LJ = c42278GiY2;
            c42278GiY2.show();
            this.LJIIIZ = i;
            LJJII(i);
        }
    }

    public C43544H7c(Activity activity, long j, long j2) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LJFF = -1;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 212));
        this.LJIILJJIL = "";
    }

    public static ArrayList LJIIIIZZ(C43544H7c c43544H7c, List list, C142185i2 c142185i2) {
        c43544H7c.getClass();
        ArrayList arrayList = new ArrayList();
        if (C32151Nz.LJJIIZI(list)) {
            ArrayList arrayList2 = (ArrayList) list;
            int i = 0;
            if (arrayList2.size() == 1) {
                if (C44694HgQ.LJIJJ((MediaModel) ListProtector.get(list, 0))) {
                    arrayList.add(new VideoSegment((MediaModel) ListProtector.get(list, 0)));
                } else {
                    arrayList.add(LJIIJJI((MediaModel) ListProtector.get(list, 0), c142185i2));
                }
            } else {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    VideoSegment videoSegment = new VideoSegment((MediaModel) it.next());
                    videoSegment.videoIndex = i;
                    arrayList.add(videoSegment);
                    i++;
                }
            }
        }
        return arrayList;
    }

    public static void LJIILL(long j, String str, boolean z) {
        FMX.LJIILL("mix_editor_download_info", new OSZ(str, "step"), new OSZ(Boolean.valueOf(z), "result"), new OSZ(Long.valueOf(j), "duration"));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.5Om] */
    public static void LJJIFFI(Intent intent, NLETemplateModel nLETemplateModel, final CreativeModel creativeModel) {
        boolean z;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        String LIZJ;
        if (nLETemplateModel == null) {
            return;
        }
        final NLEModel nleModel = NLETemplateModel.saveToDraft(nLETemplateModel);
        o.LJIIIIZZ(nleModel, "nleModel");
        final C5WP LIZ = C172656q5.LIZ();
        VideoPublishEditModel LIZIZ2 = new Object(nleModel, LIZ, creativeModel) { // from class: X.5Om
            public final NLEModel LIZ;
            public final C5WP LIZIZ;
            public final CreativeModel LIZJ;
            public long LIZLLL;

            /* JADX WARN: Code restructure failed: missing block: B:286:0x03f0, code lost:
            
                if (X.C76800UCe.LIZ == null) goto L114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:320:0x04b5, code lost:
            
                if (r3 == null) goto L152;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0055. Please report as an issue. */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel LIZIZ() {
                /*
                    Method dump skipped, instructions count: 3198
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C134205Om.LIZIZ():com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
            }

            public static void LIZJ(String str) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("UgcTemplateConsumer not found ep model in cache:  ");
                LIZ2.append(str);
                H78.LJII(X1D.LIZIZ(LIZ2));
            }

            {
                o.LJIIIZ(LIZ, "epModelCache");
                o.LJIIIZ(creativeModel, "creativeModel");
                this.LIZ = nleModel;
                this.LIZIZ = LIZ;
                this.LIZJ = creativeModel;
                this.LIZLLL = -1L;
            }

            public static void LIZ(VideoPublishEditModel videoPublishEditModel, StickerItemModel stickerItemModel, TextStickerData textStickerData) {
                stickerItemModel.extra = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
                videoPublishEditModel.infoStickerModel.stickers.add(stickerItemModel);
            }
        }.LIZIZ();
        VecNLETrackSPtr tracks = nleModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (next.LJIIZILJ() == EnumC123864ta.VIDEO) {
                LIZ2.add(next);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILL(), arrayList);
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                NLEResourceAV LJIILL2 = NLEResourceAV.LJIILL(((NLETrackSlot) it3.next()).LJI().LIZIZ());
                if (LJIILL2 != null && LJIILL2.LJIIZILJ()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        intent.putExtra("extra_av_is_fast_import", z);
        VecNLETrackSPtr tracks2 = nleModel.getTracks();
        o.LJIIIIZZ(tracks2, "nleModel.tracks");
        Iterator<NLETrack> it4 = tracks2.iterator();
        do {
            nLETrack = null;
            if (!it4.hasNext()) {
                break;
            } else {
                nLETrack = it4.next();
            }
        } while (!o.LJ(nLETrack.getExtra("biz_extra_type"), "bgm"));
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack2.LJIILL())) != null && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null && (LIZJ = LIZIZ.LIZJ()) != null) {
            intent.putExtra("path", LIZJ);
        }
        intent.putExtra("template_id", LIZIZ2.templateId);
        intent.putExtra("sticker_challenge", (Parcelable) LIZIZ2.stickerChallenge);
        intent.putExtra("face_beauty", LIZIZ2.mFaceBeauty);
        intent.putExtra("face_beauty_open", LIZIZ2.faceBeautyOpen);
        ArrayList<BeautyMetadata> arrayList2 = LIZIZ2.mBeautyMetadatas;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            intent.putParcelableArrayListExtra("extra_beauty_data", LIZIZ2.mBeautyMetadatas);
        }
        intent.putExtra("filter_id", LIZIZ2.mSelectedId);
        intent.putExtra("selected_filter_id", LIZIZ2.mSelectedFilterId);
        intent.putExtra("selected_filter_name", LIZIZ2.mSelectedFilterLabel);
        intent.putExtra("selected_filter_res_id", LIZIZ2.mSelectedFilterResId);
        intent.putExtra("extra_selected_filter_intensity", LIZIZ2.mSelectedFilterIntensity);
        intent.putExtra("camera", LIZIZ2.mCameraPosition);
        intent.putExtra("record_filter_names", LIZIZ2.mRecordFilterLabels);
        intent.putExtra("record_filter_values", LIZIZ2.mRecordFilterValues);
        intent.putExtra("record_beauty_mob_param", (Parcelable) LIZIZ2.mBeautyMobParam);
        intent.putExtra("record_filter_ids", LIZIZ2.mRecordFilterIds);
        intent.putExtra("filter_lables", LIZIZ2.mCurFilterLabels);
        intent.putExtra("filter_ids", LIZIZ2.mCurFilterIds);
        intent.putExtra("smooth_skin_labels", LIZIZ2.mSmoothSkinLabels);
        intent.putExtra("smooth_reshape_labels", LIZIZ2.mReshapeLabels);
        intent.putExtra("smooth_eyes_labels", LIZIZ2.mEyesLabels);
        intent.putExtra("smooth_tanning_labels", LIZIZ2.mTanningLabels);
        intent.putExtra("extra_aweme_speed", LIZIZ2.videoSpeed);
        intent.putExtra("extra_av_camera_ids", LIZIZ2.cameraIds);
        intent.putExtra("extra_beauty_type", LIZIZ2.beautyType);
        intent.putExtra("extra_video_record_metadata", C63872f1.LIZIZ(LIZIZ2.metadataMap));
        intent.putExtra("max_duration", LIZIZ2.maxDuration);
        intent.putExtra("wav_form", LIZIZ2.audioTrack);
        intent.putExtra("video_segment", LIZIZ2.mVideoSegmentsDesc);
        intent.putExtra("hard_encode", LIZIZ2.mHardEncode);
        intent.putExtra("sticker_path", LIZIZ2.mStickerPath);
        intent.putExtra("sticker_id", LIZIZ2.mStickerID);
        intent.putExtra("first_sticker_music_ids", LIZIZ2.mFirstStickerMusicIdsJson);
        intent.putExtra("draft_id", LIZIZ2.draftId);
        intent.putExtra("new_draft_id", LIZIZ2.newDraftId);
        intent.putExtra("videoCoverStartTm", LIZIZ2.mVideoCoverStartTm);
        intent.putExtra("cover_publish_model", (Parcelable) LIZIZ2.getCoverPublishModel());
        intent.putExtra("extra_video_canvas_width", LIZIZ2.mVideoCanvasWidth);
        intent.putExtra("extra_video_canvas_height", LIZIZ2.mVideoCanvasHeight);
        intent.putExtra("photo_mode_heading", LIZIZ2.heading);
        intent.putExtra("video_title_chain", LIZIZ2.getChain());
        intent.putExtra("disable_delete_title_chain", LIZIZ2.isDisableDeleteChain());
        intent.putExtra("exclude_user_list", (Serializable) LIZIZ2.excludeUserList);
        intent.putExtra("allow_recommend", LIZIZ2.allowRecommend);
        if (!C78886Uxe.LJJIJ(LIZIZ2.geofencingSetting)) {
            intent.putExtra("geo_fencing", (Serializable) LIZIZ2.geofencingSetting);
        }
        intent.putExtra("comment_setting", LIZIZ2.commentSetting);
        intent.putExtra("duet_setting", LIZIZ2.reactDuetSetting);
        intent.putExtra("stitch_setting", LIZIZ2.stitchSetting);
        intent.putExtra("duet_from", LIZIZ2.getDuetFrom());
        intent.putExtra("duet_author", LIZIZ2.getDuetAuthor());
        intent.putExtra("duet_hash_tag", LIZIZ2.getDuetHashTag());
        intent.putExtra("edit_video_length", LIZIZ2.mCropVideo);
        intent.putExtra("duet_video_duration", LIZIZ2.duetVideoDuration);
        intent.putExtra("shoot_mode", LIZIZ2.mShootMode);
        intent.putExtra("shooted_shoot_mode", LIZIZ2.mShootedShootMode);
        intent.putExtra("duration_mode", LIZIZ2.mDurationMode);
        intent.putExtra("contain_backgroundvideo", LIZIZ2.containBackgroundVideo);
        intent.putExtra("record_mode", LIZIZ2.recordMode);
        intent.putExtra("record_game_score", LIZIZ2.gameScore);
        intent.putExtra("extra_auto_enhance_state", LIZIZ2.autoEnhanceOn);
        intent.putExtra("extra_auto_enhance_type", LIZIZ2.autoEnhanceType);
        intent.putExtra("is_muted", LIZIZ2.isMuted);
        intent.putExtra("music_volume", LIZIZ2.musicVolume);
        intent.putExtra("record_bgm_delay", LIZIZ2.recordBgmDelay);
        intent.putExtra("edit_loudness_param", (Parcelable) LIZIZ2.loudnessBalanceParam);
        intent.putExtra("voice_volume", LIZIZ2.voiceVolume);
        ClientCherEffectParam clientCherEffectParam = LIZIZ2.veCherEffectParam;
        if (clientCherEffectParam != null) {
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
        }
        AudioEffectParam audioEffectParam = LIZIZ2.veAudioEffectParam;
        if (audioEffectParam != null) {
            intent.putExtra("extra_ve_audio_effect_param", (Parcelable) audioEffectParam);
        }
        AudioRecorderParam audioRecorderParam = LIZIZ2.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            intent.putExtra("audio_record_param", (Parcelable) audioRecorderParam);
        }
        C43587H8t.LIZIZ(intent, H83.LIZ(LIZIZ2), EnumC43590H8w.PUBLISH, EnumC43590H8w.EDIT);
        intent.putExtra("extract_model", LIZIZ2.extractFramesModel);
        intent.putExtra("infosticker_model", (Parcelable) LIZIZ2.infoStickerModel);
        intent.putExtra("download_setting", LIZIZ2.allowDownloadSetting);
        if (LIZIZ2.isMvThemeVideoType()) {
            intent.putExtra("key_mv_theme_data", LIZIZ2.mvCreateVideoData);
        }
        SharedARModel sharedARModel = LIZIZ2.getSharedARModel();
        if (sharedARModel != null) {
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        DraftEditTransferModel draftEditTransferModel = LIZIZ2.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        if (!C78886Uxe.LJJIJ(LIZIZ2.messageBubbleTexts)) {
            intent.putStringArrayListExtra("extra_sticker_text", LIZIZ2.messageBubbleTexts);
        }
        intent.putExtra("picture_source", LIZIZ2.pic2VideoSource);
        intent.putExtra("use_music_before_edit", LIZIZ2.isUseMusicBeforeEdit());
        C1536161d.LJIIJJI = false;
        intent.putExtra("sticker_info", LIZIZ2.stickerInfo);
        intent.putStringArrayListExtra("extra_camera_lens_info", LIZIZ2.cameraLensInfo);
        if (LIZIZ2.isStitchMode()) {
            intent.putExtra("stitch_params", (Parcelable) LIZIZ2.getStitchParams());
        }
        intent.putParcelableArrayListExtra("library_material_info", LIZIZ2.libraryMaterialList);
        intent.putExtra("extra_audio_aec_delay_time", LIZIZ2.audioAecDelayTime);
        intent.putExtra("enter_edit_page_method", "click_back_button");
        intent.putExtra("extra_current_zoom_value", LIZIZ2.currentZoomValue);
        intent.putExtra("is_west_window_exist", LIZIZ2.isWestWindowExistStr);
        CanvasVideoData canvasVideoData = LIZIZ2.canvasVideoData;
        if (canvasVideoData != null) {
            intent.putExtra("photo_canvas_data", canvasVideoData);
        }
        if (!C78886Uxe.LJJIJ(LIZIZ2.tagUserList)) {
            intent.putExtra("extra_social_video_tag_list", LIZIZ2.tagUserList);
        }
        AudioEnhanceParam audioEnhanceParam = LIZIZ2.audioEnhanceParam;
        o.LJII(audioEnhanceParam, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("audio_enhance_param", (Parcelable) audioEnhanceParam);
        intent.putExtra("edit_music_sync_mode", LIZIZ2.editMusicSyncMode);
        intent.putExtra("creation_mode", LIZIZ2.creationMode);
        intent.putExtra("extra_apply_voice_to_all_text", LIZIZ2.getApplyVoiceToAllTextSwitch());
        intent.putExtra("extra_has_multi_audio_loudness_normalization", LIZIZ2.hasMultiAudioLoudnessNormalization);
        intent.putExtra("publish_retain_type", LIZIZ2.publishRetainType);
        intent.putExtra("order", LIZIZ2.propOrder);
        intent.putExtra("NLE", LIZIZ2.nleData);
        intent.putExtra("ugc_template_from_anchor", true);
    }

    @Override // X.InterfaceC42119Gfz
    public final int LIZJ(List<? extends MediaModel> selectedMediaList, CreativeInfo creativeInfo, boolean z) {
        boolean z2;
        o.LJIIIZ(selectedMediaList, "selectedMediaList");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        Iterator it = C43547H7f.LIZ(selectedMediaList, false, null, 14).iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it.next();
            if (z) {
                C5W8 c5w8 = this.LJI;
                if (c5w8 == null) {
                    c5w8 = C60903NvH.LJIIJJI().LJJIJIL().LIZ(creativeInfo);
                    this.LJI = c5w8;
                }
                OSZ<Integer, Integer> LIZ = c5w8.LIZ(z);
                if (videoSegment.width * videoSegment.height > LIZ.getSecond().intValue() * LIZ.getFirst().intValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (C1DH.LIZIZ(videoSegment) && !z2) {
                }
                z3 = true;
            } else if (!C1DH.LIZIZ(videoSegment)) {
                z3 = true;
            }
        }
        LJIILL = 100;
        ArrayList arrayList = (ArrayList) selectedMediaList;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((MediaModel) it2.next()).LJ()) {
                    LJIILL -= 10;
                    break;
                }
            }
        }
        if (z3) {
            LJIILLIIL = 50;
            LJIILL -= 50;
        } else {
            LJIILLIIL = 0;
        }
        return LJIILL;
    }

    public final void LJIL(MediaModel mediaModel, Intent intent, AqS157S0100000_7 aqS157S0100000_7) {
        this.LJIIJ = System.currentTimeMillis();
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJIIIZ = 0;
        this.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5W6(mediaModel, this, intent, aqS157S0100000_7, null), 2);
    }

    @Override // X.InterfaceC42119Gfz
    public final void LIZ(List<? extends MediaModel> selectedMediaList, Intent data, Intent intent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        long j;
        ShortVideoContext shortVideoContext;
        o.LJIIIZ(selectedMediaList, "selectedMediaList");
        o.LJIIIZ(data, "data");
        LJFF(selectedMediaList);
        this.LJIIJ = System.currentTimeMillis();
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        if (selectedMediaList.isEmpty()) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        InterfaceC42669Gor albumService = C60903NvH.LJIIJJI().LJJIII().getAlbumService();
        Activity activity = this.LIZ;
        if (C42117Gfx.LJ()) {
            j = 0;
        } else {
            j = this.LIZIZ;
        }
        OSJ<Boolean, Integer, Long> checkMediaDurationValid = albumService.checkMediaDurationValid(activity, selectedMediaList, j, this.LIZJ);
        boolean booleanValue = checkMediaDurationValid.getFirst().booleanValue();
        long longValue = checkMediaDurationValid.getThird().longValue();
        if (!booleanValue) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        boolean z = false;
        this.LJIIIZ = 0;
        CreativeModel LJIILL2 = C78996UzQ.LJIILL(intent);
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(data, "editor_pro_anchor_type");
        C34K c34k = new C34K();
        Parcelable parcelableExtra = data.getParcelableExtra("key_short_video_context");
        if ((parcelableExtra instanceof ShortVideoContext) && (shortVideoContext = (ShortVideoContext) parcelableExtra) != null) {
            EditorProModel editorProModel = shortVideoContext.creativeFlowData.getEditorProModel();
            if (editorProModel != null && editorProModel.getFromEditorProEntranceInAlbum()) {
                z = true;
            }
            c34k.element = z;
        }
        if (HOA.LIZ() && LJIILL2.uploadPreviewClipModel.hasMediaClipped) {
            this.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5W3(selectedMediaList, data, intent, this, interfaceC65784Pro, LLJJIJIIJIL, c34k, longValue, null), 2);
        } else {
            this.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5W5(intent, data, selectedMediaList, this, LJIILL2, interfaceC65784Pro, LLJJIJIIJIL, c34k, longValue, null), 2);
        }
    }

    @Override // X.InterfaceC42119Gfz
    public final void LIZLLL(List list, Intent data, boolean z, AqS37S0301000_7 aqS37S0301000_7) {
        boolean z2;
        long j;
        int i;
        Object obj;
        o.LJIIIZ(data, "data");
        LJFF(list);
        this.LJIIJ = System.currentTimeMillis();
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        if (list.isEmpty()) {
            aqS37S0301000_7.invoke();
            return;
        }
        if (C6KD.LIZ() && (!C6KD.LIZIZ.isEmpty())) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C6KD.LIZIZ.contains(((MediaModel) obj).fileLocalUriPath)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MediaModel mediaModel = (MediaModel) obj;
            if (mediaModel != null && C6KC.LIZJ(this.LIZ, mediaModel.fileLocalUriPath, "video_upload", true, 16)) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((MediaModel) obj2).LJ()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == list.size()) {
            z2 = true;
        } else {
            z2 = false;
            InterfaceC42669Gor albumService = C60903NvH.LJIIJJI().LJJIII().getAlbumService();
            Activity activity = this.LIZ;
            if (C42117Gfx.LJ()) {
                j = 0;
            } else {
                j = this.LIZIZ;
            }
            if (!albumService.checkMediaDurationValid(activity, list, j, this.LIZJ).getFirst().booleanValue()) {
                aqS37S0301000_7.invoke();
                return;
            }
        }
        if (this.LJIIIZ == 0) {
            i = 80;
        } else {
            i = 50;
        }
        LJIILLIIL = i;
        this.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C5W4(list, data, this, z2, aqS37S0301000_7, z, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[PHI: r10
      0x002c: PHI (r10v9 java.lang.Object) = (r10v7 java.lang.Object), (r10v0 java.lang.Object) binds: [B:32:0x012e, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r30, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r31, android.content.Intent r32, boolean r33, X.InterfaceC67352kd<? super X.OSJ<java.lang.Boolean, ? extends java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.AVMusic>, java.lang.Long>> r34) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43544H7c.LJIIIZ(java.lang.String, java.util.List, android.content.Intent, boolean, X.2kd):java.lang.Object");
    }

    public final void LJIILLIIL(int i, long j, long j2, String str, String str2) {
        List<? extends VideoSegment> list = this.LJII;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            int i2 = 0;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((VideoSegment) it.next()).isImageType && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            int size = arrayList.size() - i2;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("template_id", this.LJIILJJIL);
            if (j < j2) {
                j = j2;
            }
            c145995oB.LIZIZ(j, "duration");
            c145995oB.LJI("shoot_way", str);
            c145995oB.LIZ(i2, "pic_cnt");
            c145995oB.LIZ(size, "video_cnt");
            c145995oB.LIZ(i, "error_code");
            c145995oB.LJI("error_msg", str2);
            FMX.LJIIL("ugc_template_import_material", c145995oB.LIZ);
        }
    }

    public final void LJIJ(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        C145995oB LIZIZ = GFJ.LIZIZ(i, "status");
        LIZIZ.LIZIZ(System.currentTimeMillis() - this.LJIIJ, "time_elapsed");
        List<? extends VideoSegment> list = this.LJII;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            int i2 = 0;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((VideoSegment) it.next()).isImageType && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            int size = arrayList.size() - i2;
            LIZIZ.LIZ(i2, "pic_cnt");
            LIZIZ.LIZ(size, "video_cnt");
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ.LJI("is_from_editor_pro", str);
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                j += ((VideoSegment) it2.next()).duration;
            }
            LIZIZ.LIZIZ(j, "total_import_duration");
            LIZIZ.LIZ(z2 ? 1 : 0, "is_use_sound_sync");
            LIZIZ.LIZ(z4 ? 1 : 0, "is_ugc_template_from_anchor");
            LIZIZ.LIZ(z3 ? 1 : 0, "is_music_pre_download_success");
        }
        FMX.LJIIL("tools_performance_pre_cut_opt_process", LIZIZ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r26, boolean r27, boolean r28, android.content.Intent r29, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r30, X.InterfaceC67352kd<? super X.OSJ<java.lang.Boolean, ? extends com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.lang.Long>> r31) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43544H7c.LJIIJ(java.lang.String, boolean, boolean, android.content.Intent, java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (X.C45771Hxn.LIZIZ == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r2
      0x0024: PHI (r2v8 java.lang.Object) = (r2v7 java.lang.Object), (r2v0 java.lang.Object) binds: [B:20:0x00ba, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(com.ss.android.ugc.aweme.creative.CreativeInfo r10, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r11, boolean r12, boolean r13, boolean r14, X.InterfaceC67352kd<? super X.OSZ<java.lang.Boolean, java.lang.Long>> r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43544H7c.LJIJJLI(com.ss.android.ugc.aweme.creative.CreativeInfo, java.util.List, boolean, boolean, boolean, X.2kd):java.lang.Object");
    }

    public static void LJIIZILJ(C43544H7c c43544H7c, String str, int i, String str2, int i2, String str3, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            str3 = "";
        }
        if (c43544H7c.LJIILIIL) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", str);
        c145995oB.LJI("template_id", c43544H7c.LJIILJJIL);
        c145995oB.LIZIZ(System.currentTimeMillis() - c43544H7c.LJIIJ, "duration");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str2);
        c145995oB.LJI("server_log_id", str3);
        c145995oB.LIZ(i2, "final_status");
        FMX.LJIIL("ugc_template_next_concat", c145995oB.LIZ);
        c43544H7c.LJIILIIL = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0102 -> B:11:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.ss.android.ugc.aweme.creative.CreativeInfo r26, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, X.InterfaceC67352kd<? super X.OSJ<java.lang.Boolean, java.lang.Boolean, java.lang.Long>> r33) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43544H7c.LJI(com.ss.android.ugc.aweme.creative.CreativeInfo, java.util.List, boolean, boolean, boolean, boolean, boolean, X.2kd):java.lang.Object");
    }

    public final void LJJI(Intent intent, List<? extends VideoSegment> list, List<? extends AVMusic> list2, ArrayList<ImportVideoInfo> arrayList, Cut2EditTransferModel cut2EditTransferModel, String str, boolean z, int i) {
        boolean z2;
        AVMusic aVMusic;
        String LLJJIJIIJIL;
        boolean z3;
        Workspace LIZ = HU5.LIZ(C77412UZs.LJIJI(intent));
        C43585H8r c43585H8r = new C43585H8r();
        c43585H8r.LJIIIZ = LIZ;
        C43586H8s.LIZ(c43585H8r, intent);
        if (list.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C43558H7q c43558H7q = new C43558H7q(list, 0L, z2, false, null, null);
        EditPreviewInfo LIZ2 = C6ZR.LIZ(true, LIZ, list, new long[]{-1, -1});
        LIZ2.setPreviewVideoLength(i);
        C42315Gj9.LIZ = i;
        MultiEditVideoRecordData LJIIIZ = C46104I7o.LJIIIZ(LIZ2.getVideoList());
        if (LJIIIZ == null) {
            return;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        Iterator<? extends VideoSegment> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().duration;
        }
        LJIIIZ.endTime = Math.min(j, HEL.LIZ());
        if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
            if (LJIIIZ.segmentDataList.size() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJIIIZ.isSingleVideo = z3;
            multiEditVideoStatusRecordData.originMultiEditRecordData = LJIIIZ.cloneData();
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = LJIIIZ;
        Intent LIZIZ = C43586H8s.LIZIZ(new Intent(intent), c43585H8r, c43558H7q, this.LJIIJ, true);
        LIZIZ.putExtra("workspace", LIZ);
        CreativeModel LJIILL2 = C78996UzQ.LJIILL(LIZIZ);
        if (!LJIILL2.ugcTemplateData.isUgcTemplateFromAnchor) {
            LIZIZ.putExtra("extra_av_is_fast_import", true);
        }
        LIZIZ.putExtra("extra_edit_preview_info", (Parcelable) LIZ2);
        LIZIZ.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
        o.LJII(cut2EditTransferModel, "null cannot be cast to non-null type android.os.Parcelable");
        LIZIZ.putExtra("cut_to_edit_transfer_model", (Parcelable) cut2EditTransferModel);
        if (!arrayList.isEmpty()) {
            LIZIZ.putParcelableArrayListExtra("extra_import_video_info_list", arrayList);
        }
        if (C140065ec.LIZ() && MusicBeanUtilKt.extractAVMusic(LJIILL2.musicBuzModel) != null && !c43558H7q.LIZJ && !LJIILL2.ugcTemplateData.isUgcTemplateFromAnchor) {
            LIZIZ.putExtra("voice_volume", 0.0f);
        }
        if (cut2EditTransferModel.getMusicSyncMode() || C78685UuP.LJJJZ(C16880lQ.LLJJIJIIJIL(LIZIZ, "extra_edit_effect_uid"))) {
            if (list2 != null) {
                aVMusic = (AVMusic) ListProtector.get(list2, 0);
            } else {
                aVMusic = null;
            }
            String LJ = C45771Hxn.LJ(aVMusic);
            if (LJ == null) {
                LJ = "";
            }
            LIZ.LLILLL(LJ);
        }
        if (C78685UuP.LJJJZ(str) || z) {
            LIZIZ.putExtra("editor_pro_anchor_type", str);
            Activity activity = this.LIZ;
            o.LJIIIZ(activity, "activity");
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
            VideoPublishEditModel videoPublishEditModel = C41384GMa.LJIIIZ(LIZIZ, activityC45651qj).LIZ;
            C60903NvH.LJIIJJI().LJIJ();
            Application application = activityC45651qj.getApplication();
            o.LJIIIIZZ(application, "activity.application");
            C170746n0.LIZ(application);
            if (videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum()) {
                LLJJIJIIJIL = null;
            } else {
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(LIZIZ, "editor_pro_anchor_type");
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = EnumC1289754j.GENERAL.getType();
                }
            }
            videoPublishEditModel.getEditorProModel().setEditorProAnchorType(LLJJIJIIJIL);
            videoPublishEditModel.getEditorProModel().setFromEditorProAnchor(C78685UuP.LJJJZ(LLJJIJIIJIL));
            C42662Gok.LJ(activity, C16880lQ.LLJJIJI(LIZIZ));
            C5QW.LJIILIIL(videoPublishEditModel, false, false, C78685UuP.LJJJZ(LLJJIJIIJIL), videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum(), false, 32);
            C5QW.LJJIIJ(videoPublishEditModel, false, false, C78685UuP.LJJJZ(LLJJIJIIJIL), videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum(), false, 32);
            return;
        }
        C43550H7i.LIZ(this.LIZ, LIZIZ, c43585H8r.LJIJJ, C78929UyL.LJIILL(c43585H8r));
    }

    public static /* synthetic */ Object LJII(C43544H7c c43544H7c, CreativeInfo creativeInfo, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, InterfaceC67352kd interfaceC67352kd, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = false;
        }
        return c43544H7c.LJI(creativeInfo, list, z, z2, z3, z4, z5, interfaceC67352kd);
    }
}
