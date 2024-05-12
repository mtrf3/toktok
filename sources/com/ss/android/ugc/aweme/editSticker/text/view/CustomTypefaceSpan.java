package com.ss.android.ugc.aweme.editSticker.text.view;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CustomTypefaceSpan extends TypefaceSpan {
    public final String fontType;
    public final Typeface newTypeface;

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setTypeface(this.newTypeface);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        o.LJIIIZ(paint, "paint");
        paint.setTypeface(this.newTypeface);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(Typeface typeface, String fontType) {
        super((String) null);
        o.LJIIIZ(fontType, "fontType");
        o.LJIIIZ(typeface, "typeface");
        this.fontType = fontType;
        this.newTypeface = typeface;
    }
}
