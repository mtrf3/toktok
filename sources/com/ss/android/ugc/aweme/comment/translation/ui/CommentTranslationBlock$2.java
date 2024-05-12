package com.ss.android.ugc.aweme.comment.translation.ui;

import X.T5S;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

/* loaded from: classes4.dex */
public class CommentTranslationBlock$2 extends ForegroundColorSpan {
    public CommentTranslationBlock$2() {
        throw null;
    }

    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        textPaint.setTypeface(t5s.getTypeface());
        textPaint.setUnderlineText(false);
    }
}
