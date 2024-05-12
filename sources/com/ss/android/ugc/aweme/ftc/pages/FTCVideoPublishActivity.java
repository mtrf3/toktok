package com.ss.android.ugc.aweme.ftc.pages;

import X.C119244m8;
import X.C16880lQ;
import X.C1B3;
import X.C41727GZf;
import X.C42326GjK;
import X.C42662Gok;
import X.C43212Gxc;
import X.C43587H8t;
import X.C63872f1;
import X.C65803Ps7;
import X.C77412UZs;
import X.C78996UzQ;
import X.C79004UzY;
import X.C86298Xtu;
import X.C8HI;
import X.EnumC43590H8w;
import X.GBO;
import X.GGS;
import X.H78;
import X.H7R;
import X.H83;
import X.OHQ;
import X.U1F;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.views.IDlS63S0100000_7;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FTCVideoPublishActivity extends GBO {
    public VideoPublishEditModel LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.GBO, X.GB7, X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.GBO
    public final C43212Gxc LLFII() {
        GGS.LIZ.getClass();
        return GGS.LIZJ;
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        U1F.LIZJ(this, 1);
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FTCVideoPublishFragment fTCVideoPublishFragment;
        String str;
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        Serializable serializable4;
        if (getIntent().getIntExtra("fromDraft", 0) == 1) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            Fragment LJJJI = supportFragmentManager.LJJJI(R.id.dm7);
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = null;
            if ((LJJJI instanceof FTCVideoPublishFragment) && (fTCVideoPublishFragment = (FTCVideoPublishFragment) LJJJI) != null) {
                VideoPublishEditModel videoPublishEditModel = fTCVideoPublishFragment.LJLIL;
                if (videoPublishEditModel != null) {
                    Intent intent = new Intent();
                    intent.putExtra("draft_to_edit_from", this.LJLJJL);
                    intent.putExtra("workspace", C41727GZf.LIZ(videoPublishEditModel));
                    StickerChallenge stickerChallenge = videoPublishEditModel.stickerChallenge;
                    if (!(stickerChallenge instanceof Parcelable)) {
                        stickerChallenge = null;
                    }
                    intent.putExtra("sticker_challenge", (Parcelable) stickerChallenge);
                    CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                    C77412UZs.LJJIJIL(intent, creativeInfo);
                    CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                    o.LJIIIIZZ(creativeModel, "model.creativeModel");
                    C78996UzQ.LJJIZ(intent, creativeModel);
                    intent.putExtra("face_beauty", videoPublishEditModel.mFaceBeauty);
                    intent.putExtra("face_beauty_open", videoPublishEditModel.faceBeautyOpen);
                    if (videoPublishEditModel.mBeautyMetadatas != null && (!r0.isEmpty())) {
                        intent.putParcelableArrayListExtra("extra_beauty_data", videoPublishEditModel.mBeautyMetadatas);
                    }
                    intent.putExtra("filter_id", videoPublishEditModel.mSelectedId);
                    intent.putExtra("selected_filter_id", videoPublishEditModel.mSelectedFilterId);
                    intent.putExtra("extra_selected_filter_intensity", videoPublishEditModel.mSelectedFilterIntensity);
                    intent.putExtra("camera", videoPublishEditModel.mCameraPosition);
                    intent.putExtra("filter_lables", videoPublishEditModel.mCurFilterLabels);
                    intent.putExtra("filter_ids", videoPublishEditModel.mCurFilterIds);
                    intent.putExtra("smooth_skin_labels", videoPublishEditModel.mSmoothSkinLabels);
                    intent.putExtra("smooth_reshape_labels", videoPublishEditModel.mReshapeLabels);
                    intent.putExtra("smooth_eyes_labels", videoPublishEditModel.mEyesLabels);
                    intent.putExtra("smooth_tanning_labels", videoPublishEditModel.mTanningLabels);
                    intent.putExtra("extra_aweme_speed", videoPublishEditModel.videoSpeed);
                    intent.putExtra("extra_av_camera_ids", videoPublishEditModel.cameraIds);
                    intent.putExtra("extra_beauty_type", videoPublishEditModel.beautyType);
                    intent.putExtra("extra_video_record_metadata", C63872f1.LIZIZ(videoPublishEditModel.metadataMap));
                    intent.putExtra("music_start", videoPublishEditModel.getMMusicStart());
                    intent.putExtra("extra_music_end", videoPublishEditModel.getMMusicEnd());
                    intent.putExtra("max_duration", videoPublishEditModel.maxDuration);
                    intent.putExtra("wav_form", videoPublishEditModel.audioTrack);
                    intent.putExtra("video_segment", videoPublishEditModel.mVideoSegmentsDesc);
                    intent.putExtra("content_type", H7R.LJIIIZ(videoPublishEditModel));
                    if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || videoPublishEditModel.isMvThemeVideoType()) {
                        str = "upload";
                    } else {
                        str = "shoot";
                    }
                    intent.putExtra("content_source", str);
                    intent.putExtra("hard_encode", videoPublishEditModel.mHardEncode);
                    intent.putExtra("sticker_path", videoPublishEditModel.mStickerPath);
                    intent.putExtra("sticker_id", videoPublishEditModel.mStickerID);
                    intent.putExtra("first_sticker_music_ids", videoPublishEditModel.mFirstStickerMusicIdsJson);
                    intent.putExtra("draft_id", videoPublishEditModel.draftId);
                    intent.putExtra("isFromDraft", true);
                    intent.putExtra("videoCoverStartTm", videoPublishEditModel.mVideoCoverStartTm);
                    CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
                    if (!(coverPublishModel instanceof Parcelable)) {
                        coverPublishModel = null;
                    }
                    intent.putExtra("cover_publish_model", (Parcelable) coverPublishModel);
                    intent.putExtra("extra_video_canvas_width", videoPublishEditModel.mVideoCanvasWidth);
                    intent.putExtra("extra_video_canvas_height", videoPublishEditModel.mVideoCanvasHeight);
                    intent.putExtra("origin", videoPublishEditModel.mOrigin);
                    intent.putExtra("extra_import_video_info_list", videoPublishEditModel.importInfoList);
                    intent.putExtra("extra_video_count", videoPublishEditModel.videoCount);
                    intent.putExtra("extra_photo_count", videoPublishEditModel.photoCount);
                    List<AVChallenge> list = videoPublishEditModel.challenges;
                    if (list instanceof Serializable) {
                        serializable = (Serializable) list;
                    } else {
                        serializable = null;
                    }
                    intent.putExtra("challenge", serializable);
                    intent.putExtra("shoot_way", videoPublishEditModel.mShootWay);
                    intent.putExtra("video_title", videoPublishEditModel.title);
                    intent.putExtra("video_title_chain", videoPublishEditModel.getChain());
                    intent.putExtra("disable_delete_title_chain", videoPublishEditModel.isDisableDeleteChain());
                    List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
                    if (structList instanceof Serializable) {
                        serializable2 = (Serializable) structList;
                    } else {
                        serializable2 = null;
                    }
                    intent.putExtra("struct_list", serializable2);
                    intent.putExtra("is_rivate", videoPublishEditModel.isPrivate);
                    List<User> list2 = videoPublishEditModel.excludeUserList;
                    if (list2 instanceof Serializable) {
                        serializable3 = (Serializable) list2;
                    } else {
                        serializable3 = null;
                    }
                    intent.putExtra("exclude_user_list", serializable3);
                    intent.putExtra("allow_recommend", videoPublishEditModel.allowRecommend);
                    if (!C79004UzY.LJJIFFI(videoPublishEditModel.geofencingSetting)) {
                        List<String> list3 = videoPublishEditModel.geofencingSetting;
                        if (list3 instanceof Serializable) {
                            serializable4 = (Serializable) list3;
                        } else {
                            serializable4 = null;
                        }
                        intent.putExtra("geo_fencing", serializable4);
                    }
                    intent.putExtra("comment_setting", videoPublishEditModel.commentSetting);
                    intent.putExtra("duet_setting", videoPublishEditModel.reactDuetSetting);
                    intent.putExtra("stitch_setting", videoPublishEditModel.stitchSetting);
                    intent.putExtra("edit_loudness_param", (Parcelable) videoPublishEditModel.loudnessBalanceParam);
                    intent.putExtra("duet_author", videoPublishEditModel.getDuetAuthor());
                    intent.putExtra("duet_hash_tag", videoPublishEditModel.getDuetHashTag());
                    intent.putExtra("fromMultiCut", videoPublishEditModel.mFromMultiCut);
                    intent.putExtra("fromCut", videoPublishEditModel.mFromCut);
                    intent.putExtra("shoot_mode", videoPublishEditModel.mShootMode);
                    intent.putExtra("duration_mode", videoPublishEditModel.mDurationMode);
                    intent.putExtra("contain_backgroundvideo", videoPublishEditModel.containBackgroundVideo);
                    intent.putExtra("contain_diy_prop_video", videoPublishEditModel.containDiyPropVideo);
                    intent.putExtra("upload_video_type", videoPublishEditModel.mIsMultiVideo);
                    intent.putExtra("record_mode", videoPublishEditModel.recordMode);
                    intent.putExtra("is_muted", videoPublishEditModel.isMuted);
                    intent.putExtra("music_volume", videoPublishEditModel.musicVolume);
                    intent.putExtra("music_origin", videoPublishEditModel.getMusicOriginWithCheck());
                    intent.putExtra("voice_volume", videoPublishEditModel.voiceVolume);
                    ClientCherEffectParam clientCherEffectParam = videoPublishEditModel.veCherEffectParam;
                    if (clientCherEffectParam != null) {
                        intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
                    }
                    AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
                    if (audioEffectParam != null) {
                        intent.putExtra("extra_ve_audio_effect_param", (Parcelable) audioEffectParam);
                    }
                    AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
                    if (audioRecorderParam != null) {
                        intent.putExtra("audio_record_param", (Parcelable) audioRecorderParam);
                    }
                    C43587H8t.LIZIZ(getIntent(), H83.LIZ(videoPublishEditModel), EnumC43590H8w.PUBLISH, EnumC43590H8w.EDIT);
                    intent.putExtra("extract_model", videoPublishEditModel.extractFramesModel);
                    InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                    if (!(infoStickerModel instanceof Parcelable)) {
                        infoStickerModel = null;
                    }
                    intent.putExtra("infosticker_model", (Parcelable) infoStickerModel);
                    intent.putExtra("download_setting", videoPublishEditModel.allowDownloadSetting);
                    if (videoPublishEditModel.isMvThemeVideoType()) {
                        intent.putExtra("key_mv_theme_data", videoPublishEditModel.mvCreateVideoData);
                    }
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = videoPublishEditModel.multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData2 instanceof Parcelable) {
                        multiEditVideoStatusRecordData = multiEditVideoStatusRecordData2;
                    }
                    intent.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
                    intent.putExtra("extra_av_is_fast_import", videoPublishEditModel.isFastImport);
                    EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                    if (previewInfo != null) {
                        intent.putExtra("extra_edit_preview_info", (Parcelable) previewInfo);
                    }
                    DraftEditTransferModel draftEditTransferModel = videoPublishEditModel.draftEditTransferModel;
                    if (draftEditTransferModel != null) {
                        intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
                    }
                    if (!C79004UzY.LJJIFFI(videoPublishEditModel.messageBubbleTexts)) {
                        intent.putStringArrayListExtra("extra_sticker_text", videoPublishEditModel.messageBubbleTexts);
                    }
                    intent.putExtra("picture_source", videoPublishEditModel.pic2VideoSource);
                    intent.putExtra("use_music_before_edit", videoPublishEditModel.isUseMusicBeforeEdit());
                    intent.putExtra("sticker_info", videoPublishEditModel.stickerInfo);
                    intent.putStringArrayListExtra("extra_camera_lens_info", videoPublishEditModel.cameraLensInfo);
                    intent.putExtra("extra_photo_mv_mode", videoPublishEditModel.isPhotoMvMode);
                    intent.putExtra("NLE", videoPublishEditModel.nleData);
                    Boolean isSoundLoop = videoPublishEditModel.getIsSoundLoop();
                    o.LJIIIIZZ(isSoundLoop, "model.isSoundLoop");
                    intent.putExtra("extra_is_sound_loop", isSoundLoop.booleanValue());
                    C42662Gok.LJ(this, C16880lQ.LLJJIJI(intent));
                    finish();
                    return;
                }
                o.LJIJI("mModel");
                throw null;
            }
            throw new IllegalStateException("Empty VideoPublishEditModel in FTC Publish Page.");
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C42326GjK.LIZ.getClass();
        C42326GjK.LIZ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", true);
        U1F.LJFF(this, 1);
        super.onCreate(bundle);
        setContentView(R.layout.eb);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        Intent intent = getIntent();
        c42326GjK.getClass();
        C42326GjK.LIZJ(this, intent, bundle);
        this.LJLJI = H7R.LJIIJ(getIntent());
        if (getIntent().getIntExtra("fromDraft", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        this.LJLJJI = getIntent().getBooleanExtra("enter_record_from_other_platform", false);
        this.LJLJJLL = getIntent().getBooleanExtra("extra_enter_from_live", false);
        this.LJLJJL = getIntent().getIntExtra("draft_to_edit_from", 0);
        if (this.LJLJI == null) {
            H78.LIZJ("VideoPublishActivity onCreate error, model == null");
            finish();
        } else {
            Bundle bundle2 = new Bundle();
            VideoPublishEditModel videoPublishEditModel = this.LJLJI;
            o.LJII(videoPublishEditModel, "null cannot be cast to non-null type java.io.Serializable");
            bundle2.putSerializable("args", videoPublishEditModel);
            bundle2.putInt("music_rec_type", getIntent().getIntExtra("music_rec_type", -1));
            bundle2.putBoolean("enter_record_from_other_platform", this.LJLJJI);
            bundle2.putBoolean("extra_enter_from_live", this.LJLJJLL);
            bundle2.putBoolean("edit_publish_session_end_together", getIntent().getBooleanExtra("edit_publish_session_end_together", false));
            bundle2.putBoolean("fromDraft", this.LJLJL);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            Fragment LJJJI = supportFragmentManager.LJJJI(R.id.dm7);
            if (!(LJJJI instanceof FTCVideoPublishFragment) || LJJJI == null) {
                FTCVideoPublishFragment fTCVideoPublishFragment = new FTCVideoPublishFragment();
                fTCVideoPublishFragment.setArguments(bundle2);
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIIIZZ(R.id.dm7, 1, fTCVideoPublishFragment, null);
                c1b3.LJIILJJIL();
            }
            C16880lQ.LJJJIL((C119244m8) _$_findCachedViewById(R.id.aeg), new IDlS63S0100000_7(this, 16));
            Typeface LIZLLL = C8HI.LIZJ().LIZLLL("bold");
            if (LIZLLL != null) {
                ((TextView) _$_findCachedViewById(R.id.lx1)).setTypeface(LIZLLL);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishActivity", "onCreate", false);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        C42326GjK c42326GjK = C42326GjK.LIZ;
        getIntent();
        c42326GjK.getClass();
        C42326GjK.LJI(this, outState);
    }

    @Override // X.GB7, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        Fragment LJJJI = supportFragmentManager.LJJJI(R.id.dm7);
        if ((LJJJI instanceof FTCVideoPublishFragment) && LJJJI != null && LJJJI.isAdded()) {
            LJJJI.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        C86298Xtu.LIZIZ(this, i, grantResults);
        super.onRequestPermissionsResult(i, strArr, grantResults);
    }
}
