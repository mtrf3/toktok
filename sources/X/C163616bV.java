package X;

import Y.IDCListenerS46S0200000_2;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6bV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163616bV {
    public static final /* synthetic */ int LIZ = 0;

    public static Intent LIZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel model) {
        List<AVChallenge> challenges;
        AudioEffectParam audioEffectParam;
        List<AVChallenge> challenges2;
        Workspace workspace;
        o.LJIIIZ(model, "model");
        RecordScene scene = new RecordScene();
        scene.musicPath(model.getMMusicPath());
        scene.musicStart(model.getMMusicStart());
        scene.videoSegment(model.mVideoSegmentsDesc);
        scene.hardEncode(model.mHardEncode);
        scene.mp4Path(model.videoPath());
        scene.maxDuration(model.maxDuration);
        scene.audioTrack(model.audioTrack);
        C41658GWo.LIZLLL().LJII = scene;
        o.LJIIIIZZ(scene, "scene");
        if (!scene.isSegmentsNotValid() || (H7R.LJJJLZIJ(model) && model.getOriginal() == 1)) {
            Intent intent = new Intent();
            HZV.LIZ().LJIJJ(activityC45651qj, intent);
            intent.putExtra("shoot_way", model.mShootWay);
            C136695Yb c136695Yb = C132385Hm.LIZ;
            if (c136695Yb != null) {
                intent.putExtra("draft_to_edit_from", c136695Yb.LIZ);
            }
            ClientCherEffectParam clientCherEffectParam = model.veCherEffectParam;
            if (clientCherEffectParam != null) {
                intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
            }
            if (model.isReuseOriginalSound()) {
                intent.putExtra("reuse_original_sound_id", model.getReuseOriginalSoundId());
                intent.putExtra("reuse_original_sound_length", model.getReuseOriginalSoundLength());
                intent.putExtra("reuse_original_sound_url", model.getReuseOriginalSoundUrls());
            }
            intent.putExtra("restore", 1);
            C136695Yb c136695Yb2 = C132385Hm.LIZ;
            if (c136695Yb2 != null && (workspace = c136695Yb2.LJFF) != null) {
                intent.putExtra("workspace", workspace);
            }
            intent.putExtra("translation_type", 3);
            intent.putExtra("video_edit_model", (Serializable) model);
            intent.putExtra("path", model.getMMusicPath());
            CreativeInfo creativeInfo = model.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            C77412UZs.LJJIJIL(intent, creativeInfo);
            CreativeModel creativeModel = model.creativeModel;
            o.LJIIIIZZ(creativeModel, "model.creativeModel");
            C78996UzQ.LJJIZ(intent, creativeModel);
            intent.putExtra("draft_id", model.draftId);
            intent.putExtra("new_draft_id", model.newDraftId);
            intent.putExtra("fromDraft", model.mIsFromDraft);
            intent.putExtra("extra_publish_stage", model.publishStage);
            List<InteractStickerStruct> LJI = C164826dS.LJI(model.getMainBusinessContext(), 12, EnumC164816dR.TRACK_PAGE_EDIT);
            if (LJI != null && LJI.size() > 0) {
                model.qaStruct = ((InteractStickerStruct) ListProtector.get(LJI, 0)).getQaStruct();
            }
            Collection<AVChallenge> values = new C137965bE(model).LIZIZ().getStickerToChallenge().values();
            o.LJIIIIZZ(values, "stickerChallenge.stickerToChallenge.values");
            model.removeChallengeFromTitleAndStruct(values);
            AudioEffectParam audioEffectParam2 = model.veAudioEffectParam;
            if (audioEffectParam2 != null && audioEffectParam2.getChallenge() != null) {
                AudioEffectParam audioEffectParam3 = model.veAudioEffectParam;
                o.LJI(audioEffectParam3);
                model.removeAudioEffectChallengeFromTitleAndStruct(audioEffectParam3.getChallenge());
            }
            AudioEffectParam audioEffectParam4 = model.veAudioEffectParam;
            if (audioEffectParam4 != null && (challenges = audioEffectParam4.getChallenges()) != null && (!challenges.isEmpty()) && (audioEffectParam = model.veAudioEffectParam) != null && (challenges2 = audioEffectParam.getChallenges()) != null) {
                Iterator<AVChallenge> it = challenges2.iterator();
                while (it.hasNext()) {
                    model.removeAudioEffectChallengeFromTitleAndStruct(it.next());
                }
            }
            intent.putExtra("video_title", model.title);
            intent.putExtra("video_title_chain", model.getChain());
            intent.putExtra("disable_delete_title_chain", model.isDisableDeleteChain());
            intent.putExtra("struct_list", (Serializable) model.getStructList());
            intent.putExtra("is_rivate", model.isPrivate);
            intent.putExtra("exclude_user_list", (Serializable) model.excludeUserList);
            intent.putExtra("allow_recommend", model.allowRecommend);
            intent.putExtra("comment_setting", model.commentSetting);
            intent.putExtra("download_setting", model.allowDownloadSetting);
            intent.putExtra("extra_publish_stage", model.publishStage);
            if (model.isStitchMode()) {
                intent.putExtra("stitch_params", (Parcelable) model.getStitchParams());
            }
            if (model.hasRetake()) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
                o.LJIIIIZZ(multiEditVideoStatusRecordData, "model.multiEditVideoRecordData");
                intent.putParcelableArrayListExtra("original_segments", multiEditVideoStatusRecordData.originalSegments);
                intent.putExtra("original_music_start", multiEditVideoStatusRecordData.originalMusicStart);
                intent.putExtra("retake_shoot_mode", 2);
            }
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) model.draftDuetExtraInfo);
            intent.putExtra("extra_duet_layout", model.duetLayout);
            intent.putExtra("duet_from", model.getDuetFrom());
            intent.putExtra("music_origin", model.getMusicOrigin());
            return intent;
        }
        if (H7R.LJJJLZIJ(model)) {
            LIZIZ(R.string.tod, R.string.dsg, activityC45651qj, model);
            return null;
        }
        LIZIZ(R.string.toc, R.string.grs, activityC45651qj, model);
        return null;
    }

    public static void LIZIZ(int i, int i2, ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        C62905OmT c62905OmT = new C62905OmT(activityC45651qj);
        c62905OmT.LIZ(i);
        c62905OmT.LJII(R.string.cg_, null);
        c62905OmT.LJIIJJI(i2, new IDCListenerS46S0200000_2(activityC45651qj, videoPublishEditModel, 1), false);
        C279017q.LIZLLL(c62905OmT);
    }
}
