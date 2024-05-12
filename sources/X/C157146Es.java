package X;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TypefaceStyle;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.editSticker.text.view.CustomTypefaceSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157146Es {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C19K LIZ;

    public final void LIZ() {
        Editable editableText = this.LIZ.getEditableText();
        o.LJIIIIZZ(editableText, "editText.editableText");
        C157136Er.LIZIZ(editableText);
    }

    public final List<InlineRichTextStyleData> LJ() {
        C157166Eu c157166Eu;
        Editable editableText = this.LIZ.getEditableText();
        o.LJIIIIZZ(editableText, "editText.editableText");
        ArrayList arrayList = new ArrayList();
        Object[] spans = editableText.getSpans(0, editableText.length(), ForegroundColorSpan.class);
        o.LJIIIIZZ(spans, "spannable.getSpans(0, sp…undColorSpan::class.java)");
        for (Object obj : spans) {
            ForegroundColorSpan foregroundColorSpan = (ForegroundColorSpan) obj;
            arrayList.add(new InlineRichTextStyleData(editableText.getSpanStart(foregroundColorSpan), editableText.getSpanEnd(foregroundColorSpan), new ForegroundColorStyle(foregroundColorSpan.getForegroundColor())));
        }
        Object[] spans2 = editableText.getSpans(0, editableText.length(), CustomTypefaceSpan.class);
        o.LJIIIIZZ(spans2, "spannable.getSpans(0, sp…TypefaceSpan::class.java)");
        for (Object obj2 : spans2) {
            CustomTypefaceSpan customTypefaceSpan = (CustomTypefaceSpan) obj2;
            int spanStart = editableText.getSpanStart(customTypefaceSpan);
            int spanEnd = editableText.getSpanEnd(customTypefaceSpan);
            String str = customTypefaceSpan.fontType;
            TextFontStyleData LJIIIIZZ = C68M.LJIIJ().LJIIIIZZ(str);
            if (LJIIIIZZ != null) {
                c157166Eu = new C157166Eu(LJIIIIZZ.LIZJ.getEffectId(), LJIIIIZZ.LIZJ.getResourceId(), LJIIIIZZ.LIZJ.getUnzipPath());
            } else {
                c157166Eu = new C157166Eu("", "", "");
            }
            arrayList.add(new InlineRichTextStyleData(spanStart, spanEnd, new TypefaceStyle(str, (String) c157166Eu.LJLIL, (String) c157166Eu.LJLILLLLZI, (String) c157166Eu.LJLJI)));
        }
        return arrayList;
    }

    public C157146Es(C65A editText) {
        o.LJIIIZ(editText, "editText");
        this.LIZ = editText;
    }

    public final void LIZIZ(List<? extends InlineRichTextStyleData> list) {
        if (list == null) {
            return;
        }
        Editable editableText = this.LIZ.getEditableText();
        o.LJIIIIZZ(editableText, "editText.editableText");
        for (InlineRichTextStyleData inlineRichTextStyleData : list) {
            editableText.setSpan(inlineRichTextStyleData.inlineStyle.LIZ(), inlineRichTextStyleData.start, inlineRichTextStyleData.end, 34);
        }
    }

    public final boolean LIZJ(int i) {
        if (this.LIZ.getSelectionStart() == this.LIZ.getSelectionEnd()) {
            LIZ();
            return false;
        }
        this.LIZ.getEditableText().setSpan(new ForegroundColorSpan(i), this.LIZ.getSelectionStart(), this.LIZ.getSelectionEnd(), 34);
        return true;
    }

    public final boolean LIZLLL(Typeface typeface, String fontName) {
        o.LJIIIZ(fontName, "fontName");
        o.LJIIIZ(typeface, "typeface");
        if (this.LIZ.getSelectionStart() == this.LIZ.getSelectionEnd()) {
            Editable editableText = this.LIZ.getEditableText();
            o.LJIIIIZZ(editableText, "editText.editableText");
            C157136Er.LIZJ(editableText);
            return false;
        }
        this.LIZ.getEditableText().setSpan(new CustomTypefaceSpan(typeface, fontName), this.LIZ.getSelectionStart(), this.LIZ.getSelectionEnd(), 34);
        return true;
    }
}
