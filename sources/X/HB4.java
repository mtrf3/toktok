package X;

import android.content.SharedPreferences;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HB4 {
    public static int LIZ() {
        return F9J.LIZIZ(C60903NvH.LJ, 0, "publish").getInt("checkpoint_scene", 3);
    }

    public static RecordScene LIZIZ() {
        RecordScene recordScene = new RecordScene();
        SharedPreferences LIZIZ = F9J.LIZIZ(C60903NvH.LJ, 0, "publish");
        Keva repo = Keva.getRepo("publish");
        recordScene.musicPath = LIZIZ.getString("music_path", "");
        recordScene.musicStart = LIZIZ.getInt("music_start", 0);
        recordScene.videoSegments = CameraComponentModel.LJIIJJI(LIZIZ.getString("segment_video", ""));
        recordScene.faceBeauty = LIZIZ.getInt("face_beauty", 0);
        recordScene.hardEncode = LIZIZ.getInt("hard_encode", 0);
        recordScene.mp4Path = LIZIZ.getString("mp4_path", "");
        recordScene.maxDuration = LIZIZ.getLong("max_duration", LivePlayEnforceIntervalSetting.DEFAULT);
        recordScene.duetAudioPath = LIZIZ.getString("duet_audio_path", "");
        recordScene.duetVideoPath = LIZIZ.getString("duet_video_path", "");
        recordScene.shootMode = LIZIZ.getInt("shoot_mode", 0);
        recordScene.shootWay = LIZIZ.getString("shoot_way", "");
        recordScene.shootedShootMode = LIZIZ.getInt("shooted_shoot_mode", -1);
        recordScene.fromItemId = LIZIZ.getString("from_item_id", "");
        recordScene.followUpFirstItemId = LIZIZ.getString("follow_up_first_item_id", "");
        recordScene.followUpItemIdGroups = LIZIZ.getString("follow_up_item_id_groups", "");
        recordScene.enterRecordFromFeed = LIZIZ.getBoolean("enter_record_from_feed", false);
        recordScene.recordOriginalSoundWithBGM = LIZIZ.getBoolean("record_original_sound_with_bgm", false);
        recordScene.recordIsMuted = repo.getBoolean("record_original_sound_is_muted", false);
        String string = LIZIZ.getString("creation_id", "");
        if (string == null || string.length() == 0) {
            string = C44384HbQ.LJJJJIZL();
        }
        recordScene.creativeInfo = new CreativeInfo(string, LIZIZ.getInt("creative_version", 0), LIZIZ.getString("session_id", null));
        recordScene.recordBGMDelay = LIZIZ.getInt("record_bgm_delay", 0);
        LoudnessBalanceParam loudnessBalanceParam = recordScene.loudnessBalanceParam;
        if (loudnessBalanceParam != null) {
            loudnessBalanceParam.setBgmLoudness(LIZIZ.getFloat("edit_bgm_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setPeakLoudness(LIZIZ.getFloat("edit_peak_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setAvgLoudness(LIZIZ.getFloat("edit_avg_loudness", 0.0f));
        }
        recordScene.recordMode = LIZIZ.getInt("record_mode", 0);
        recordScene.filterLabels = LIZIZ.getString("filter_labels", "");
        recordScene.filterIds = LIZIZ.getString("filter_ids", "");
        recordScene.filterValues = LIZIZ.getString("filter_values", "");
        recordScene.challengeStr = LIZIZ.getString("challenge", "");
        recordScene.sharedARModel = RecordScene.string2SharedARModel(LIZIZ.getString("shared_ar", ""));
        recordScene.commentVideoModel = RecordScene.string2CommentVideoModel(LIZIZ.getString("comment_video_moodel", ""));
        recordScene.isShoutout = LIZIZ.getBoolean("shoutout_params", false);
        recordScene.stitchParams = RecordScene.string2StitchParams(LIZIZ.getString("stitch_params", ""));
        recordScene.extractFramesModel = ExtractFramesModelExtKt.string2Model(LIZIZ.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(LIZIZ.getString("ve_cher_effect_param", ""));
        recordScene.videoRecordMetadata = C63872f1.LIZ(LIZIZ.getString("video_record_metadata", ""));
        try {
            if (C69162nY.LIZ()) {
                recordScene.mobileEffectsModel2 = (MobileEffectsModel2) C60903NvH.LJIIJJI().LIZ().LJI(repo.getString("ame_drafts_2", ""), MobileEffectsModel2.class);
            } else {
                recordScene.mobileEffectsModel = (MobileEffectsModel) C60903NvH.LJIIJJI().LIZ().LJI(repo.getString("ame_drafts", ""), MobileEffectsModel.class);
            }
            recordScene.musicModel = C78934UyQ.LJLIL.getMusicService().transformNewAVMusic(LIZIZ.getString("music_model", ""));
        } catch (Throwable unused) {
        }
        return recordScene;
    }

    public static int LIZJ() {
        return F9J.LIZIZ(C60903NvH.LJ, 0, "publish").getInt("shoot_mode", 0);
    }

    public static void LIZLLL() {
        H7B.LIZ("PublishSharedPref reset");
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putString("music_path", "");
        edit.putString("music_model", "");
        edit.putInt("music_start", 0);
        edit.putInt("face_beauty", 0);
        edit.putString("segment_video", "");
        edit.putInt("hard_encode", 0);
        edit.putString("mp4_path", "");
        edit.putString("duet_video_path", "");
        edit.putBoolean("shoutout_params", false);
        edit.putString("duet_audio_path", "");
        edit.putString("creation_id", "");
        edit.putInt("creative_version", 0);
        edit.putInt("record_mode", 0);
        edit.putString("challenge", "");
        edit.putString("comment_video_moodel", "");
        edit.putString("from_item_id", "");
        edit.putString("follow_up_first_item_id", "");
        edit.putString("follow_up_item_id_groups", "");
        edit.putBoolean("enter_record_from_feed", false);
        edit.putString("shoot_way", "");
        edit.putBoolean("record_original_sound_with_bgm", false);
        edit.putInt("checkpoint_scene", 3);
        WX6.LIZ(edit);
        Keva.getRepo("publish").storeBoolean("record_original_sound_is_muted", false);
        C41025G8f.LIZ("normal").LJII();
    }

    public static void LJ(int i) {
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putInt("checkpoint_scene", i);
        WX6.LIZ(edit);
    }

    public static void LJFF(CreativeInfo creativeInfo) {
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        o.LJIIIZ(edit, "<this>");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        String creationId = creativeInfo.getCreationId();
        int version = creativeInfo.getVersion();
        String sessionId = creativeInfo.getSessionId();
        o.LJIIIZ(creationId, "creationId");
        if (creationId.length() <= 0) {
            creationId = C44384HbQ.LJJJJIZL();
        }
        edit.putString("creation_id", creationId);
        edit.putInt("creative_version", version);
        edit.putString("session_id", sessionId);
        WX6.LIZ(edit);
    }

    public static void LJI(Boolean bool) {
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putBoolean("enter_record_from_feed", bool.booleanValue());
        WX6.LIZ(edit);
    }

    public static void LJIIIIZZ(boolean z) {
        Keva.getRepo("publish").storeBoolean("record_original_sound_is_muted", z);
    }

    public static void LJIIIZ(int i) {
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putInt("shoot_mode", i);
        WX6.LIZ(edit);
    }

    public static void LJII(String str, AVMusic aVMusic, int i) {
        String LJLILLLLZI;
        SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
        edit.putString("music_path", str);
        if (aVMusic != null) {
            try {
                LJLILLLLZI = C78880UxY.LJLILLLLZI(aVMusic);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                if (aVMusic.getMusicWaveData() != null) {
                    for (float f : aVMusic.getMusicWaveData()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(f);
                        LIZ.append(",");
                        sb.append(X1D.LIZIZ(LIZ));
                    }
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("music id:");
                LIZ2.append(aVMusic.getMusicId());
                LIZ2.append("; music name:");
                LIZ2.append(aVMusic.getName());
                LIZ2.append("; music wave data:");
                LIZ2.append(sb.toString());
                H7B.LIZ(X1D.LIZIZ(LIZ2));
                throw e;
            }
        } else {
            LJLILLLLZI = "";
        }
        edit.putString("music_model", LJLILLLLZI);
        edit.putInt("music_start", i);
        WX6.LIZ(edit);
    }
}
