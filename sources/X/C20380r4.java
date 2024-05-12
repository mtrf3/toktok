package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.0r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20380r4 extends CharacterStyle implements UpdateAppearance {
    public final AbstractC32681Qa LJLIL;
    public final float LJLILLLLZI;
    public C10430b1 LJLJI;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C10430b1 c10430b1 = this.LJLJI;
            if (c10430b1 != null) {
                textPaint.setShader(this.LJLIL.LIZIZ(c10430b1.LIZ));
            }
            C78688UuS.LJJLIIIJILLIZJL(textPaint, this.LJLILLLLZI);
        }
    }

    public C20380r4(AbstractC32681Qa abstractC32681Qa, float f) {
        this.LJLIL = abstractC32681Qa;
        this.LJLILLLLZI = f;
    }
}
