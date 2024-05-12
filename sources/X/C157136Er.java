package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.view.CustomTypefaceSpan;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157136Er {
    public static boolean LIZIZ(Spannable spannable) {
        int i = 0;
        Object[] spans = spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class);
        o.LJIIIIZZ(spans, "spannable.getSpans(0, sp…undColorSpan::class.java)");
        int length = spans.length;
        boolean z = false;
        while (i < length) {
            spannable.removeSpan(spans[i]);
            i++;
            z = true;
        }
        return z;
    }

    public static boolean LIZJ(Spannable spannable) {
        int i = 0;
        Object[] spans = spannable.getSpans(0, spannable.length(), CustomTypefaceSpan.class);
        o.LJIIIIZZ(spans, "spannable.getSpans(0, sp…TypefaceSpan::class.java)");
        int length = spans.length;
        boolean z = false;
        while (i < length) {
            spannable.removeSpan(spans[i]);
            i++;
            z = true;
        }
        return z;
    }

    public static SpannableStringBuilder LIZ(TextStickerTextWrap textStickerTextWrap, List inlineTextStyles) {
        o.LJIIIZ(textStickerTextWrap, "textStickerTextWrap");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
        if (inlineTextStyles.isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textStickerTextWrap.getText());
        Iterator it = inlineTextStyles.iterator();
        while (it.hasNext()) {
            InlineRichTextStyleData inlineRichTextStyleData = (InlineRichTextStyleData) it.next();
            spannableStringBuilder.setSpan(inlineRichTextStyleData.inlineStyle.LIZ(), inlineRichTextStyleData.start, inlineRichTextStyleData.end, 34);
        }
        return spannableStringBuilder;
    }
}
