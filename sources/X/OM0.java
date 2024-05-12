package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;

/* loaded from: classes11.dex */
public final class OM0 extends ClickableSpan {
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AdAutofillService.LJIIIIZZ().LJII(view.getContext());
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        textPaint.setUnderlineText(false);
    }
}
