package X;

import com.ss.android.ugc.aweme.creative.model.audio.TTSExtraModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.5cT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138735cT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJFF(ShortVideoCommonParams params) {
        o.LJIIIZ(params, "params");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", params.shootWay);
        c145995oB.LJI("content_source", params.contentSource);
        c145995oB.LJI("content_type", params.contentType);
        c145995oB.LJI("creation_id", params.creationId);
        FMX.LJIIL("text_reading_bubble_show", c145995oB.LIZ);
    }

    public static void LIZIZ(ShortVideoCommonParams params, String str) {
        o.LJIIIZ(params, "params");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", params.shootWay);
        c145995oB.LJI("content_source", params.contentSource);
        c145995oB.LJI("content_type", params.contentType);
        c145995oB.LJI("creation_id", params.creationId);
        c145995oB.LJI("text_add_type", str);
        FMX.LJIIL("click_change_voice", c145995oB.LIZ);
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, Effect effect) {
        if (videoPublishEditModel == null || effect == null) {
            return;
        }
        java.util.Map<String, TTSExtraModel> map = videoPublishEditModel.creativeModel.ttsModel.ttsExtraMap;
        String LJJJLIIL = OUP.LJJJLIIL(effect);
        TTSExtraModel tTSExtraModel = new TTSExtraModel(null, null, null, 7, null);
        tTSExtraModel.speakerId = OUP.LJJJLIIL(effect);
        tTSExtraModel.effectId = effect.getEffectId();
        tTSExtraModel.extra = effect.getExtra();
        map.put(LJJJLIIL, tTSExtraModel);
    }

    public static void LIZ(ShortVideoCommonParams params, String isEditorPro, String enterMethod, int i) {
        if ((i & 2) != 0) {
            isEditorPro = CardStruct.IStatusCode.DEFAULT;
        }
        if ((i & 4) != 0) {
            enterMethod = "";
        }
        o.LJIIIZ(params, "params");
        o.LJIIIZ(isEditorPro, "isEditorPro");
        o.LJIIIZ(enterMethod, "enterMethod");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", params.shootWay);
        c145995oB.LJI("content_source", params.contentSource);
        c145995oB.LJI("content_type", params.contentType);
        c145995oB.LJI("enter_method", enterMethod);
        c145995oB.LJI("creation_id", params.creationId);
        c145995oB.LJI("is_editor_pro", isEditorPro);
        FMX.LJIIL("cancel_text_reading", c145995oB.LIZ);
    }

    public static void LIZLLL(ShortVideoCommonParams shortVideoCommonParams, String str, String str2, String isEditorPro, String applyStatus) {
        String str3;
        String str4;
        o.LJIIIZ(isEditorPro, "isEditorPro");
        o.LJIIIZ(applyStatus, "applyStatus");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", shortVideoCommonParams.shootWay);
        c145995oB.LJI("content_source", shortVideoCommonParams.contentSource);
        c145995oB.LJI("content_type", shortVideoCommonParams.contentType);
        c145995oB.LJI("creation_id", shortVideoCommonParams.creationId);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        c145995oB.LJI("tone_id", str3);
        if (str == null) {
            str = "";
        }
        c145995oB.LJI("tone_list", str);
        if (str2 == null) {
            str2 = "";
        }
        c145995oB.LJI("tone_name", str2);
        if (SpeakerCenter.LJFF()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_open_apply", str4);
        c145995oB.LJI("is_editor_pro", isEditorPro);
        c145995oB.LJI("apply_status", applyStatus);
        FMX.LJIIL("text_reading_complete", c145995oB.LIZ);
    }

    public static void LIZJ(ShortVideoCommonParams params, String toneChoose, String enterMethod, String textAddType, String isEditorPro, int i) {
        if ((i & 2) != 0) {
            toneChoose = "";
        }
        if ((i & 4) != 0) {
            enterMethod = "";
        }
        if ((i & 8) != 0) {
            textAddType = "user_click";
        }
        if ((i & 16) != 0) {
            isEditorPro = CardStruct.IStatusCode.DEFAULT;
        }
        o.LJIIIZ(params, "params");
        o.LJIIIZ(toneChoose, "toneChoose");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(textAddType, "textAddType");
        o.LJIIIZ(isEditorPro, "isEditorPro");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", params.shootWay);
        c145995oB.LJI("content_source", params.contentSource);
        c145995oB.LJI("content_type", params.contentType);
        c145995oB.LJI("tone_choice_method", toneChoose);
        if (o.LJ(enterMethod, "text_edit_panel") && C69C.LIZIZ()) {
            enterMethod = "small_icon";
        }
        c145995oB.LJI("enter_method", enterMethod);
        c145995oB.LJI("creation_id", params.creationId);
        c145995oB.LJI("is_editor_pro", isEditorPro);
        c145995oB.LJI("text_add_type", textAddType);
        FMX.LJIIL("click_text_reading", c145995oB.LIZ);
    }

    public static void LJII(String speakerID, VideoPublishEditModel model, String isEditorPro, String str, int i, String voiceId, String tabName, String tabId, int i2) {
        String from;
        String panel = null;
        if ((i2 & 4) != 0) {
            from = "video_edit_page";
        } else {
            from = null;
        }
        if ((i2 & 8) != 0) {
            isEditorPro = CardStruct.IStatusCode.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            str = "";
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        if ((i2 & 512) != 0) {
            panel = "speaking-voice";
        }
        o.LJIIIZ(speakerID, "speakerID");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(from, "from");
        o.LJIIIZ(isEditorPro, "isEditorPro");
        o.LJIIIZ(voiceId, "voiceId");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(tabId, "tabId");
        o.LJIIIZ(panel, "panel");
        C145995oB c145995oB = new C145995oB();
        Q8U.LIZJ(c145995oB, "tone_list", speakerID, model, "creation_id");
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(model));
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("enter_from", from);
        c145995oB.LJI("is_editor_pro", isEditorPro);
        c145995oB.LJI("tts_voice_origin", str);
        c145995oB.LIZ(i, "is_self_tts_voice");
        c145995oB.LJI("tab_id", tabId);
        c145995oB.LJI("tab_name", tabName);
        c145995oB.LJI("panel", panel);
        c145995oB.LJI("voice_id", voiceId);
        FMX.LJIIL("text_reading_voice_show", c145995oB.LIZ);
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, String str, int i, String isEditorPro, String str2, int i2, String voiceId, String tabName, String tabId, int i3) {
        String from;
        if ((i3 & 8) != 0) {
            isEditorPro = CardStruct.IStatusCode.DEFAULT;
        }
        String panelId = null;
        if ((i3 & 16) != 0) {
            from = "video_edit_page";
        } else {
            from = null;
        }
        if ((i3 & 32) != 0) {
            str2 = "";
        }
        if ((i3 & 64) != 0) {
            i2 = 0;
        }
        if ((i3 & 1024) != 0) {
            panelId = "speaking-voice";
        }
        o.LJIIIZ(isEditorPro, "isEditorPro");
        o.LJIIIZ(from, "from");
        o.LJIIIZ(voiceId, "voiceId");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(tabId, "tabId");
        o.LJIIIZ(panelId, "panelId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("tone_list", str);
        if (videoPublishEditModel != null) {
            c145995oB.LIZLLL("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LIZLLL("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LIZLLL("shoot_way", videoPublishEditModel.mShootWay);
        }
        c145995oB.LJI("enter_from", from);
        c145995oB.LJI("is_editor_pro", isEditorPro);
        c145995oB.LJI("tts_voice_origin", str2);
        c145995oB.LIZ(i2, "is_self_tts_voice");
        c145995oB.LIZ(i, "is_auto");
        c145995oB.LJI("tab_id", tabId);
        c145995oB.LJI("tab_name", tabName);
        c145995oB.LJI("panel", panelId);
        c145995oB.LJI("voice_id", voiceId);
        FMX.LJIIL("text_reading_voice_click", c145995oB.LIZ);
    }
}
