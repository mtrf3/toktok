package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C8HI;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MobileEffectUtilKt$showCountWithFormat$1 extends ForegroundColorSpan {
    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        o.LJIIIZ(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        textPaint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
    }
}
