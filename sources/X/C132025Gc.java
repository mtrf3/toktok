package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import kotlin.jvm.internal.o;

/* renamed from: X.5Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132025Gc {
    public static final /* synthetic */ int LIZ = 0;

    public static TextStickerData LIZIZ(StickerItemModel stickerItemModel) {
        try {
            Object LJI = C60903NvH.LJIIJJI().LIZ().LJI(stickerItemModel.extra, TextStickerData.class);
            TextStickerData textStickerData = (TextStickerData) LJI;
            textStickerData.setUiStartTime(textStickerData.getStartTime());
            textStickerData.setUiEndTime(textStickerData.getEndTime());
            return (TextStickerData) LJI;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VEVideoPublishEditActivity -> Exception: ");
            LIZ2.append(e);
            H7B.LIZJ(X1D.LIZIZ(LIZ2));
            return null;
        }
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        for (String str : C47261Igj.LJJIJIIJI("text_sticker_data", "text_wrap_list", "font_size", "lineSpacingExtra", "color", "font_type", "align", "bg_mode", "text", "text_slot_type", "text_inline_styles", "is_use_auto_size", "font_size_changed", "is_editorpro_trim_text_length", "is_editorpro_adjust_text_style", "is_editorpro_adjust_text_paragraph", "is_editorpro_adjust_text_font", "is_editorpro_adjust_text_color", "is_editorpro_adjust_text_position", "use_dropper_color", "use_adjust_text_roll_bar")) {
            String extra = nLETrackSlot2.getExtra(str);
            if (o.LJ(str, "text_slot_type") && o.LJ(extra, "AI_CAPTION")) {
                extra = "TEXT_STICKER";
            }
            nLETrackSlot.setExtra(str, extra);
        }
    }
}
