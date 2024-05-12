package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import kotlin.jvm.internal.o;

/* renamed from: X.7aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC188397aN extends ClickableSpan {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public boolean LJLJI;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        int i;
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        if (this.LJLJI) {
            i = this.LJLILLLLZI;
        } else {
            i = this.LJLIL;
        }
        ds.setColor(i);
        ds.setUnderlineText(false);
    }

    public AbstractC188397aN(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
