package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: X.896, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass896 extends ClickableSpan {
    public boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (this.LJLIL) {
            i = this.LJLJI;
        } else {
            i = this.LJLILLLLZI;
        }
        textPaint.setColor(i);
        textPaint.setUnderlineText(false);
    }

    public AnonymousClass896(int i, int i2) {
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
