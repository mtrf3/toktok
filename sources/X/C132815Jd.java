package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132815Jd {
    public static TextStickerData LIZIZ(String str) {
        Object fromJson = GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), str, (Class<Object>) TextStickerData.class);
        o.LJIIIIZZ(fromJson, "getAPI().getGson().fromJ…tStickerData::class.java)");
        return (TextStickerData) fromJson;
    }

    public static List LIZJ(String str) {
        List list = (List) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), str, new TypeToken<List<? extends TextStickerTextWrap>>() { // from class: X.5Je
        }.getType());
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public static String LIZLLL(TextStickerData textStickerData) {
        o.LJIIIZ(textStickerData, "textStickerData");
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData);
        o.LJIIIIZZ(json, "getAPI().getGson().toJson(textStickerData)");
        return json;
    }

    public static String LJ(List textWrapList) {
        o.LJIIIZ(textWrapList, "textWrapList");
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textWrapList);
        o.LJIIIIZZ(json, "getAPI().getGson().toJson(textWrapList)");
        return json;
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, TextStickerData stickerData, EnumC132095Gj addType, int i, int i2, EditorProContext editorContext, boolean z) {
        o.LJIIIZ(stickerData, "stickerData");
        o.LJIIIZ(addType, "addType");
        o.LJIIIZ(editorContext, "editorContext");
        if (nLETrackSlot == null) {
            return;
        }
        nLETrackSlot.LJIIL(new NLESegmentTextSticker());
        if (C132125Gm.LIZ[addType.ordinal()] == 1) {
            nLETrackSlot.setTransformX((stickerData.getX() / i) - 0.5f);
            nLETrackSlot.setTransformY((stickerData.getY() / i2) - 0.5f);
            nLETrackSlot.setRotation(stickerData.getRotation());
            nLETrackSlot.setScale(stickerData.getScale());
            long j = 1000;
            nLETrackSlot.setStartTime(stickerData.getStartTime() * j);
            nLETrackSlot.setEndTime(stickerData.getEndTime() * j);
            if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                long LIZLLL = C124574uj.LIZLLL(C79057V0z.LJJI(editorContext));
                if (nLETrackSlot.getEndTime() <= LIZLLL) {
                    LIZLLL = nLETrackSlot.getEndTime();
                }
                nLETrackSlot.setEndTime(LIZLLL);
            }
        }
        if (z) {
            int i3 = 0;
            if (nLETrackSlot.hasExtra("text_tts_id") && nLETrackSlot.hasExtra("text_tts_content") && nLETrackSlot.hasExtra("text_tts_duration") && nLETrackSlot.hasExtra("tts_audio_path") && nLETrackSlot.hasExtra("text_tts_speaker")) {
                String extra = nLETrackSlot.getExtra("text_tts_id");
                o.LJIIIIZZ(extra, "slot.getExtra(KEY_TTS_ID)");
                stickerData.setNleUuid(extra);
                stickerData.setAudioText(nLETrackSlot.getExtra("text_tts_content"));
                String extra2 = nLETrackSlot.getExtra("text_tts_duration");
                o.LJIIIIZZ(extra2, "slot.getExtra(KEY_TTS_DURATION)");
                Integer LJJIL = C38350F3i.LJJIL(extra2);
                if (LJJIL != null) {
                    i3 = LJJIL.intValue();
                }
                stickerData.setAudioTrackDuration(i3);
                stickerData.setAudioTrackFilePath(nLETrackSlot.getExtra("tts_audio_path"));
                stickerData.setSpeakerID(nLETrackSlot.getExtra("text_tts_speaker"));
            }
        }
        nLETrackSlot.setExtra("text_sticker_data", LIZLLL(stickerData));
        nLETrackSlot.setExtra("color", String.valueOf(stickerData.getColor()));
        nLETrackSlot.setExtra("text_wrap_list", LJ(stickerData.getTextWrapList()));
        List<InlineRichTextStyleData> inlineTextStyles = stickerData.getInlineTextStyles();
        o.LJIIIZ(inlineTextStyles, "<this>");
        String json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), inlineTextStyles);
        o.LJIIIIZZ(json, "getAPI().getGson().toJson(this)");
        nLETrackSlot.setExtra("text_inline_styles", json);
        String fontType = stickerData.getFontType();
        String str = "";
        if (fontType == null) {
            fontType = "";
        }
        nLETrackSlot.setExtra("font_type", fontType);
        nLETrackSlot.setExtra("align", String.valueOf(stickerData.getAlign()));
        nLETrackSlot.setExtra("bg_mode", String.valueOf(stickerData.getBgMode()));
        nLETrackSlot.setExtra("font_size", String.valueOf(stickerData.getFontSize()));
        nLETrackSlot.setExtra("lineSpacingExtra", String.valueOf(stickerData.getLineSpacingExtra()));
        nLETrackSlot.setExtra("text", C68W.LJII(stickerData.getTextWrapList()));
        nLETrackSlot.setExtra("is_use_auto_size", String.valueOf(stickerData.isUseAutoTextSize()));
        nLETrackSlot.setExtra("font_size_changed", String.valueOf(stickerData.getHasChangedFontSize()));
        nLETrackSlot.setExtra("slot_add_order", String.valueOf(stickerData.getTextSlotAddOrder()));
        nLETrackSlot.setExtra("is_editorpro_adjust_text_color", stickerData.getAdjustTextColorInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_font", stickerData.getAdjustTextFontInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_paragraph", stickerData.getAdjustTextParagraph());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_style", stickerData.getAdjustTextStyleInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_position", stickerData.getAdjustTextPositionInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_captions", stickerData.isEditorProCaption());
        nLETrackSlot.setExtra("is_editorpro_trim_text_length", stickerData.isEditorProTrimLength());
        nLETrackSlot.setExtra("is_editorpro_text", stickerData.isEditorProText());
        nLETrackSlot.setExtra("is_editorpro_copy_text", stickerData.isEditorProCopyText());
        if (o.LJ(stickerData.isEditorProCaption(), "1")) {
            nLETrackSlot.setExtra("edit_captions_duration", String.valueOf(stickerData.getEditInEPDuration()));
        } else {
            nLETrackSlot.setExtra("adjust_text_content_duration", String.valueOf(stickerData.getEditInEPDuration()));
        }
        nLETrackSlot.setExtra("is_editorpro_tts", stickerData.isEditorProTTS());
        nLETrackSlot.setExtra("editorpro_tts_tone_id", stickerData.getEditorProTTSID());
        nLETrackSlot.setExtra("use_dropper_color", String.valueOf(stickerData.isUseColorDropper()));
        nLETrackSlot.setExtra("use_adjust_text_roll_bar", String.valueOf(stickerData.isAdjustTextRollbar()));
        if (!TextUtils.isEmpty(stickerData.getNleUuid())) {
            nLETrackSlot.setExtra("text_tts_id", stickerData.getNleUuid());
            String audioText = stickerData.getAudioText();
            if (audioText == null) {
                audioText = "";
            }
            nLETrackSlot.setExtra("text_tts_content", audioText);
            nLETrackSlot.setExtra("text_tts_duration", String.valueOf(stickerData.getAudioTrackDuration()));
            String audioTrackFilePath = stickerData.getAudioTrackFilePath();
            if (audioTrackFilePath == null) {
                audioTrackFilePath = "";
            }
            nLETrackSlot.setExtra("tts_audio_path", audioTrackFilePath);
            String speakerID = stickerData.getSpeakerID();
            if (speakerID != null) {
                str = speakerID;
            }
            nLETrackSlot.setExtra("text_tts_speaker", str);
        }
    }
}
