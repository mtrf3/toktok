package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.3iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC91353iF extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(0);
        ds.setUnderlineText(false);
    }
}
