package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass636;
import X.C025908h;
import X.C132005Ga;
import X.C132815Jd;
import X.C145995oB;
import X.C152425yY;
import X.C1539662m;
import X.C1551667c;
import X.C168716jj;
import X.C169076kJ;
import X.C169096kL;
import X.C3C5;
import X.C41663GWt;
import X.C43814HHm;
import X.C44172HVg;
import X.C47261Igj;
import X.C5Z2;
import X.C64504PTg;
import X.C76800UCe;
import X.C78685UuP;
import X.FMX;
import X.GLI;
import X.H8F;
import X.InterfaceC88473Ynt;
import X.NDG;
import X.X1D;
import X.XJL;
import X.XKS;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class IDqS181S0200000_2 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS181S0200000_2(XKS xks, C169076kJ c169076kJ, int i) {
        super(3);
        this.$t = i;
        this.l0 = xks;
        this.l1 = c169076kJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS181S0200000_2(AwemeDraft awemeDraft, XKS xks, int i) {
        super(3);
        this.$t = i;
        this.l0 = awemeDraft;
        this.l1 = xks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS181S0200000_2(EditorProScene editorProScene, C132005Ga c132005Ga, int i) {
        super(3);
        this.$t = i;
        this.l0 = editorProScene;
        this.l1 = c132005Ga;
    }

    public static final Object invoke$0(IDqS181S0200000_2 iDqS181S0200000_2, Object obj, Object obj2, Object obj3) {
        String str;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        InlineCaptionModel inlineCaptionModel;
        NLETrackSlot slot = (NLETrackSlot) obj;
        Integer num = (Integer) obj3;
        o.LJIIIZ(slot, "slot");
        EditorProScene editorProScene = (EditorProScene) iDqS181S0200000_2.l0;
        editorProScene.currentInEditTextSlot = slot;
        editorProScene.currentInEditTextView = (C1551667c) obj2;
        boolean LJIIL = AnonymousClass636.LJIIL(slot);
        C1539662m textStickerEditLayout = ((EditorProScene) iDqS181S0200000_2.l0).getTextStickerEditLayout();
        String extra = slot.getExtra("text_wrap_list");
        o.LJIIIIZZ(extra, "slot.getExtra(KEY_TEXT_WRAP_LIST_FOR_SLOT)");
        List<TextStickerTextWrap> LIZJ = C132815Jd.LIZJ(extra);
        String extra2 = slot.getExtra("text_inline_styles");
        o.LJIIIIZZ(extra2, "slot.getExtra(KEY_TEXT_INLINE_STYLES)");
        List<InlineRichTextStyleData> LIZ = C152425yY.LIZ(extra2);
        int LIZ2 = C64504PTg.LIZ(slot, "bg_mode", "slot.getExtra(KEY_BG_MODE_FOR_SLOT)");
        int LIZ3 = C64504PTg.LIZ(slot, "color", "slot.getExtra(KEY_COLOR_FOR_SLOT)");
        int LIZ4 = C64504PTg.LIZ(slot, "align", "slot.getExtra(KEY_ALIGN_FOR_SLOT)");
        String extra3 = slot.getExtra("font_type");
        int LIZ5 = C64504PTg.LIZ(slot, "font_size", "slot.getExtra(KEY_FONT_SIZE_FOR_SLOT)");
        String uuid = slot.getUUID();
        o.LJIIIIZZ(uuid, "slot.uuid");
        if (LJIIL && (videoPublishEditModel = ((C132005Ga) iDqS181S0200000_2.l1).LJLLLLLL) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (inlineCaptionModel = creativeModel.inlineCaptionModel) != null) {
            str = inlineCaptionModel.selectLanguageCode;
        } else {
            str = null;
        }
        String extra4 = slot.getExtra("is_editorpro_adjust_text_style");
        o.LJIIIIZZ(extra4, "slot.getExtra(KEY_ADJUST_TEXT_STYLE)");
        String extra5 = slot.getExtra("is_editorpro_adjust_text_paragraph");
        o.LJIIIIZZ(extra5, "slot.getExtra(KEY_ADJUST_TEXT_PARAGRAPH)");
        String extra6 = slot.getExtra("is_editorpro_adjust_text_font");
        o.LJIIIIZZ(extra6, "slot.getExtra(KEY_ADJUST_TEXT_FONT)");
        String extra7 = slot.getExtra("is_editorpro_adjust_text_color");
        o.LJIIIIZZ(extra7, "slot.getExtra(KEY_ADJUST_TEXT_COLOR)");
        String extra8 = slot.getExtra("is_editorpro_adjust_text_position");
        o.LJIIIIZZ(extra8, "slot.getExtra(KEY_ADJUST_TEXT_POSITION)");
        String extra9 = slot.getExtra("is_editorpro_trim_text_length");
        o.LJIIIIZZ(extra9, "slot.getExtra(KEY_IS_EDITORPRO_TRIM_TEXT_LENGTH)");
        String extra10 = slot.getExtra("is_editorpro_text");
        o.LJIIIIZZ(extra10, "slot.getExtra(KEY_IS_EDITORPRO_TEXT)");
        String extra11 = slot.getExtra("is_editorpro_copy_text");
        o.LJIIIIZZ(extra11, "slot.getExtra(KEY_IS_EDITORPRO_COPY_TEXT)");
        String extra12 = slot.getExtra("is_editorpro_tts");
        o.LJIIIIZZ(extra12, "slot.getExtra(KEY_IS_EDITORPRO_TTS)");
        String extra13 = slot.getExtra("editorpro_tts_tone_id");
        o.LJIIIIZZ(extra13, "slot.getExtra(KEY_EDITORPRO_TTS_TONE_ID)");
        String extra14 = slot.getExtra("is_editorpro_captions");
        o.LJIIIIZZ(extra14, "slot.getExtra(KEY_IS_EDITORPRO_CAPTION_TEXT)");
        boolean parseBoolean = Boolean.parseBoolean(slot.getExtra("is_use_auto_size"));
        boolean parseBoolean2 = Boolean.parseBoolean(slot.getExtra("font_size_changed"));
        boolean parseBoolean3 = Boolean.parseBoolean(slot.getExtra("use_dropper_color"));
        boolean parseBoolean4 = Boolean.parseBoolean(slot.getExtra("use_adjust_text_roll_bar"));
        String extra15 = slot.getExtra("lineSpacingExtra");
        o.LJIIIIZZ(extra15, "slot.getExtra(KEY_LINE_SPACING_EXTRA)");
        textStickerEditLayout.LJ(LIZJ, LIZ, LIZ2, LIZ3, LIZ4, extra3, false, LIZ5, uuid, LJIIL, str, extra4, extra5, extra6, extra7, extra8, extra9, extra10, extra11, extra12, extra13, extra14, parseBoolean, parseBoolean2, num, parseBoolean3, parseBoolean4, CastFloatProtector.parseFloat(extra15));
        H8F.LJJIIZI(((C132005Ga) iDqS181S0200000_2.l1).LJLLLLLL, "click_button", 0, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS181S0200000_2 iDqS181S0200000_2, Object obj, Object obj2, Object obj3) {
        Integer num;
        int i;
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        if (((XJL) iDqS181S0200000_2.l0).isActive()) {
            if (!booleanValue2) {
                AVMusic aVMusic = ((AwemeDraft) ((C169076kJ) iDqS181S0200000_2.l1).LIZ.LIZLLL).LIZLLL;
                if (aVMusic != null && aVMusic.isPgc()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                C169096kL c169096kL = ((C169076kJ) iDqS181S0200000_2.l1).LIZ;
                AwemeDraft awemeDraft = (AwemeDraft) c169096kL.LIZJ;
                IDraftListener iDraftListener = (IDraftListener) c169096kL.LJ;
                C41663GWt.LIZ(awemeDraft);
                C44172HVg.LJJ.LJJJI().LJFF().LIZ(new NDG(awemeDraft, new GLI("DraftEditHelper", 2)));
                if (iDraftListener != null) {
                    iDraftListener.onUpdated(new IDraftListener.UpdateParams(awemeDraft, false));
                }
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "enter_personal_homepage");
                c145995oB.LJI("creation_id", awemeDraft.LIZ());
                c145995oB.LJI("user_id", C44172HVg.LJIJ.getCurrentUser().getUid());
                c145995oB.LIZ(i2, "delete_cause");
                FMX.LJIIL("delete_draft_unavailable_sound", c145995oB.LIZ);
                C41663GWt.LIZ((AwemeDraft) ((C169076kJ) iDqS181S0200000_2.l1).LIZ.LIZLLL);
                AwemeDraft awemeDraft2 = (AwemeDraft) ((C169076kJ) iDqS181S0200000_2.l1).LIZ.LIZLLL;
                o.LJIIIZ(awemeDraft2, "<this>");
                ((Keva) C43814HHm.LIZIZ.getValue()).storeBoolean(awemeDraft2.LIZ(), false);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C169076kJ) iDqS181S0200000_2.l1).LIZIZ);
            LIZ.append(" ; restore done ... ; isMusicLegal : ");
            LIZ.append(booleanValue2);
            LIZ.append(" ; errorMsg : ");
            LIZ.append(str);
            C5Z2.LIZ(X1D.LIZIZ(LIZ));
            XJL xjl = (XJL) iDqS181S0200000_2.l0;
            DraftFileRestoreResult[] draftFileRestoreResultArr = new DraftFileRestoreResult[1];
            C169076kJ c169076kJ = (C169076kJ) iDqS181S0200000_2.l1;
            RuntimeException runtimeException = null;
            if (!booleanValue2) {
                num = Integer.valueOf(R.string.ezf);
            } else {
                num = null;
            }
            boolean z = !booleanValue;
            if (booleanValue2) {
                i = 0;
            } else {
                i = -3000;
            }
            if (str != null && str.length() != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                runtimeException = new RuntimeException(C025908h.LIZIZ(LIZ2, ((C169076kJ) iDqS181S0200000_2.l1).LIZIZ, " ; restoreFailed , ", str, LIZ2));
            }
            DraftFileRestoreException draftFileRestoreException = new DraftFileRestoreException(i, runtimeException);
            c169076kJ.getClass();
            draftFileRestoreResultArr[0] = C168716jj.LIZ(c169076kJ, num, z, draftFileRestoreException);
            ArrayList LJII = C47261Igj.LJII(draftFileRestoreResultArr);
            C3C5.m7constructorimpl(LJII);
            xjl.resumeWith(LJII);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS181S0200000_2 iDqS181S0200000_2, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        String str = (String) obj3;
        if (((Boolean) obj2).booleanValue() && C78685UuP.LJJJZ(str)) {
            ((AwemeDraft) iDqS181S0200000_2.l0).LJIIJ = str;
        }
        XJL xjl = (XJL) iDqS181S0200000_2.l1;
        DraftFileRestoreResult draftFileRestoreResult = new DraftFileRestoreResult(4, 1000, null, false, null, 28, null);
        C3C5.m7constructorimpl(draftFileRestoreResult);
        xjl.resumeWith(draftFileRestoreResult);
        return C76800UCe.LIZ;
    }
}
