package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5On */
/* loaded from: classes3.dex */
public final class C134215On {
    public static final C134215On LIZ = new C134215On();

    public static void LIZIZ(NLETrackSlot nLETrackSlot, EditorProContext editorProContext) {
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("text_tts_id")) {
            String name = nLETrackSlot.getExtra("text_tts_id");
            if (editorProContext != null) {
                NLEModel LJJI = C79057V0z.LJJI(editorProContext);
                o.LJIIIIZZ(name, "name");
                NLETrack trackBySlot = C79057V0z.LJJI(editorProContext).getTrackBySlot(SFS.LJIJJ(LJJI, name));
                if (trackBySlot != null) {
                    C79057V0z.LJJI(editorProContext).removeTrack(trackBySlot);
                }
            }
            String extra = nLETrackSlot.getExtra("text_sticker_data");
            o.LJIIIIZZ(extra, "textStickerSlot.getExtra…XT_STICKER_DATA_FOR_SLOT)");
            TextStickerData LIZIZ = C132815Jd.LIZIZ(extra);
            LIZIZ.setNleUuid("");
            LIZIZ.setAudioText("");
            LIZIZ.setAudioTrackFilePath("");
            LIZIZ.setAudioTrackDuration(0);
            LIZIZ.setSpeakerID("");
            LIZIZ.setHasReadTextAudio(false);
            nLETrackSlot.setExtra("text_sticker_data", C132815Jd.LIZLLL(LIZIZ));
            nLETrackSlot.removeExtraWithKey("tts_audio_path");
            nLETrackSlot.removeExtraWithKey("text_tts_id");
        }
    }

    public final void LIZ(NLETrackSlot nLETrackSlot, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("text_tts_id") && nLETrackSlot.hasExtra("text_tts_duration") && nLETrackSlot.hasExtra("tts_audio_path") && nLETrackSlot.hasExtra("text_tts_speaker") && nLETrackSlot.hasExtra("text")) {
            String duration = nLETrackSlot.getExtra("text_tts_duration");
            String path = nLETrackSlot.getExtra("tts_audio_path");
            String speaker = nLETrackSlot.getExtra("text_tts_speaker");
            String text = nLETrackSlot.getExtra("text");
            String name = nLETrackSlot.getExtra("text_tts_id");
            NLEModel LJJI = C79057V0z.LJJI(editorContext);
            o.LJIIIIZZ(name, "name");
            NLETrack trackBySlot = C79057V0z.LJJI(editorContext).getTrackBySlot(SFS.LJIJJ(LJJI, name));
            if (trackBySlot != null) {
                C79057V0z.LJJI(editorContext).removeTrack(trackBySlot);
            }
            nLETrackSlot.removeExtraWithKey("text_tts_id");
            o.LJIIIIZZ(text, "text");
            o.LJIIIIZZ(speaker, "speaker");
            o.LJIIIIZZ(path, "path");
            o.LJIIIIZZ(duration, "duration");
            LIZLLL(this, editorContext, nLETrackSlot, text, speaker, path, CastIntegerProtector.parseInt(duration));
        }
    }

    public static NLETrackSlot LIZJ(EditorProContext editorProContext, NLETrackSlot textStickerSlot, String text, String speaker, String filePath, int i, ReadTextEffectBean readTextEffectBean) {
        InterfaceC125004vQ editor;
        NLETrackSlot LJJJJLI;
        o.LJIIIZ(textStickerSlot, "textStickerSlot");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(speaker, "speaker");
        o.LJIIIZ(filePath, "filePath");
        String str = null;
        if (editorProContext == null || (editor = editorProContext.getEditor()) == null || (LJJJJLI = editor.LJJJJLI(new C124844vA(text, filePath, i0.LJFF(text, "id"), textStickerSlot.getStartTime(), 0L, false, false, 0L, ((ArrayList) C124574uj.LJII(C79057V0z.LJJI(editorProContext))).size(), true, null, null, 13296), EnumC124724uy.COMMIT)) == null) {
            return null;
        }
        LJJJJLI.setExtra("is_editor_pro_tts_used", "true");
        NLETrack LJJIIJZLJL = C124574uj.LJJIIJZLJL(C79057V0z.LJJI(editorProContext), LJJJJLI.getUUID());
        if (LJJIIJZLJL != null) {
            LJJIIJZLJL.setExtra("AudioTrackType", "TEXT_SPEAK");
            LJJIIJZLJL.setExtra("add_tts_from_editor_pro", "true");
        }
        textStickerSlot.setExtra("text_tts_id", LJJJJLI.getUUID());
        textStickerSlot.setExtra("text_tts_content", text);
        textStickerSlot.setExtra("text_tts_duration", String.valueOf(i));
        textStickerSlot.setExtra("tts_audio_path", filePath);
        textStickerSlot.setExtra("text_tts_speaker", speaker);
        String extra = textStickerSlot.getExtra("text_sticker_data");
        o.LJIIIIZZ(extra, "textStickerSlot.getExtra…XT_STICKER_DATA_FOR_SLOT)");
        TextStickerData LIZIZ = C132815Jd.LIZIZ(extra);
        LIZIZ.setAudioText(text);
        String uuid = LJJJJLI.getUUID();
        o.LJIIIIZZ(uuid, "it.uuid");
        LIZIZ.setNleUuid(uuid);
        LIZIZ.setAudioTrackFilePath(filePath);
        LIZIZ.setAudioTrackDuration(i);
        LIZIZ.setSpeakerID(speaker);
        LIZIZ.setHasReadTextAudio(true);
        if (readTextEffectBean != null) {
            LIZIZ.setSpeakerName(readTextEffectBean.mSpeaker.speakerName);
            LIZIZ.setVoiceAnchorName(readTextEffectBean.mSpeaker.ttsAnchorName);
            LIZIZ.setVoiceEffectId(readTextEffectBean.effect.getEffect_id());
            LIZIZ.setVoiceEffectIconUrl((String) ORZ.LJLLLL(readTextEffectBean.effect.getIcon_url().getUrl_list()));
            LIZIZ.setVoiceEffectResourceId(readTextEffectBean.effect.getResource_id());
            LIZIZ.setVoiceCreatorUserId(readTextEffectBean.mSpeaker.voiceCreatorUserId);
            LIZIZ.setVoiceCreatorUserName(readTextEffectBean.mSpeaker.voiceCreatorUserName);
            LIZIZ.setCreatorVoice(readTextEffectBean.mSpeaker.isCreatorVoice);
            LIZIZ.setTtsAnchorReleaseDate(readTextEffectBean.mSpeaker.ttsAnchorReleaseDate);
            LIZIZ.setTtsReleaseDate(readTextEffectBean.mSpeaker.ttsReleaseDate);
            List<String> challenge = readTextEffectBean.effect.getChallenge();
            if (challenge == null) {
                challenge = C61878OQg.INSTANCE;
            }
            LIZIZ.setTtsAudioBean(new TTSAudioBean(challenge));
            LIZIZ.getTtsExtraMap().put("tts_tab_id", readTextEffectBean.category.id);
            LIZIZ.getTtsExtraMap().put("tts_tab_name", readTextEffectBean.category.name);
            Effect effect = readTextEffectBean.effect;
            if (effect != null) {
                str = effect.getEffect_id();
            }
            textStickerSlot.setExtra("tts_effect_id", str);
            String extra2 = readTextEffectBean.effect.getExtra();
            if (extra2 == null) {
                extra2 = "";
            }
            textStickerSlot.setExtra("tts_effect_extra", extra2);
        }
        textStickerSlot.setExtra("text_sticker_data", C132815Jd.LIZLLL(LIZIZ));
        editorProContext.getPlayer().seek(editorProContext.getPlayer().H9());
        return LJJJJLI;
    }

    public static /* synthetic */ void LIZLLL(C134215On c134215On, EditorProContext editorProContext, NLETrackSlot nLETrackSlot, String str, String str2, String str3, int i) {
        c134215On.getClass();
        LIZJ(editorProContext, nLETrackSlot, str, str2, str3, i, null);
    }
}
