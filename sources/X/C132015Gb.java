package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132015Gb extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C1551667c LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ NLETrackSlot LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ float LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C132015Gb(C1551667c c1551667c, long j, NLETrackSlot nLETrackSlot, float f, float f2, int i, float f3) {
        super(0);
        this.LJLIL = c1551667c;
        this.LJLILLLLZI = j;
        this.LJLJI = nLETrackSlot;
        this.LJLJJI = f;
        this.LJLJJL = f2;
        this.LJLJJLL = i;
        this.LJLJL = f3;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        float f;
        float f2;
        float f3;
        boolean z;
        SpannableStringBuilder LIZ;
        C1551667c c1551667c = this.LJLIL;
        if (c1551667c != null) {
            long j = this.LJLILLLLZI;
            NLETrackSlot nLETrackSlot = this.LJLJI;
            float f4 = this.LJLJJI;
            float f5 = this.LJLJJL;
            int i = this.LJLJJLL;
            float f6 = this.LJLJL;
            if (j < nLETrackSlot.getStartTime() || j > nLETrackSlot.getEndTime()) {
                c1551667c.setVisibility(8);
            } else {
                c1551667c.setVisibility(0);
            }
            String extra = nLETrackSlot.getExtra("text_wrap_list");
            if (extra != null && extra.length() != 0) {
                o.LJIIIIZZ(nLETrackSlot.getExtra("font_size"), "slot.getExtra(KEY_FONT_SIZE_FOR_SLOT)");
                if (!ujb.o.LJJJJJL(r0)) {
                    String extra2 = nLETrackSlot.getExtra("font_size");
                    o.LJIIIIZZ(extra2, "slot.getExtra(KEY_FONT_SIZE_FOR_SLOT)");
                    f = CastFloatProtector.parseFloat(extra2);
                } else {
                    f = 28.0f;
                }
                o.LJIIIIZZ(nLETrackSlot.getExtra("lineSpacingExtra"), "slot.getExtra(KEY_LINE_SPACING_EXTRA)");
                if (!ujb.o.LJJJJJL(r0)) {
                    String extra3 = nLETrackSlot.getExtra("lineSpacingExtra");
                    o.LJIIIIZZ(extra3, "slot.getExtra(KEY_LINE_SPACING_EXTRA)");
                    f2 = CastFloatProtector.parseFloat(extra3);
                } else {
                    f2 = C1545664u.LLJJIJI;
                }
                if (f4 > 0.0f) {
                    f3 = f4;
                } else {
                    f3 = 1.0f;
                }
                c1551667c.setRealFontSize(f);
                c1551667c.LJI(f2, (int) (nLETrackSlot.getScale() * (((f * f5) / f3) / i)));
                String extra4 = nLETrackSlot.getExtra("text_wrap_list");
                o.LJIIIIZZ(extra4, "slot.getExtra(\n         …OT,\n                    )");
                List LIZJ = C132815Jd.LIZJ(extra4);
                String extra5 = nLETrackSlot.getExtra("text_inline_styles");
                o.LJIIIIZZ(extra5, "slot.getExtra(KEY_TEXT_INLINE_STYLES)");
                List<InlineRichTextStyleData> LIZ2 = C152425yY.LIZ(extra5);
                if ((!LIZ2.isEmpty()) && (LIZ = C157136Er.LIZ((TextStickerTextWrap) ORZ.LJLLJ(LIZJ), LIZ2)) != null) {
                    c1551667c.LJIIIZ(LIZ.length(), LIZ);
                } else {
                    String LJFF = C68W.LJFF(LIZJ);
                    c1551667c.LJIIIZ(LJFF.length(), LJFF);
                }
                String extra6 = nLETrackSlot.getExtra("font_type");
                if (extra6 != null && extra6.length() != 0) {
                    Typeface LJIIL = C68M.LJIIJ().LJIIL(nLETrackSlot.getExtra("font_type"));
                    if (LJIIL == null) {
                        LJIIL = Typeface.DEFAULT_BOLD;
                    }
                    c1551667c.setFontType(LJIIL);
                }
                String extra7 = nLETrackSlot.getExtra("color");
                if (extra7 == null || extra7.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String extra8 = nLETrackSlot.getExtra("color");
                    o.LJIIIIZZ(extra8, "slot.getExtra(KEY_COLOR_FOR_SLOT)");
                    c1551667c.setTextColor(CastIntegerProtector.parseInt(extra8));
                }
                String extra9 = nLETrackSlot.getExtra("align");
                if (extra9 != null && extra9.length() != 0) {
                    String extra10 = nLETrackSlot.getExtra("align");
                    o.LJIIIIZZ(extra10, "slot.getExtra(KEY_ALIGN_FOR_SLOT)");
                    c1551667c.setAligin(CastIntegerProtector.parseInt(extra10));
                }
                String extra11 = nLETrackSlot.getExtra("bg_mode");
                if (extra11 != null && extra11.length() != 0) {
                    int LIZ3 = C64504PTg.LIZ(nLETrackSlot, "bg_mode", "slot.getExtra(KEY_BG_MODE_FOR_SLOT)");
                    String extra12 = nLETrackSlot.getExtra("color");
                    o.LJIIIIZZ(extra12, "slot.getExtra(KEY_COLOR_FOR_SLOT)");
                    c1551667c.LJIIIIZZ(LIZ3, CastIntegerProtector.parseInt(extra12));
                }
                c1551667c.setRotation(nLETrackSlot.getRotation());
                c1551667c.setScaleX(f4);
                c1551667c.setScaleY(f4);
                c1551667c.setTranslationX(nLETrackSlot.getTransformX() * f5);
                c1551667c.setTranslationY(nLETrackSlot.getTransformY() * f6);
            }
        }
        return C76800UCe.LIZ;
    }
}
