package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.UcQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77570UcQ extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }
}
