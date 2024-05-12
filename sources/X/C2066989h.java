package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import ujb.o;
import ujb.s;

/* renamed from: X.89h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2066989h extends CharacterStyle implements UpdateAppearance {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f;
        if (textPaint == null) {
            return;
        }
        int LJJLIIIJL = s.LJJLIIIJL(this.LJLIL, this.LJLILLLLZI, 0, false, 6);
        if (!o.LJJJLIIL(this.LJLIL, this.LJLILLLLZI, false) && !kotlin.jvm.internal.o.LJ(this.LJLIL, this.LJLILLLLZI)) {
            f = textPaint.measureText(this.LJLIL, 0, LJJLIIIJL);
        } else {
            f = 0.0f;
        }
        textPaint.setShader(new LinearGradient(f, 0.0f, f + textPaint.measureText(this.LJLIL, LJJLIIIJL, this.LJLILLLLZI.length() + LJJLIIIJL), 0.0f, this.LJLJI, this.LJLJJI, Shader.TileMode.CLAMP));
    }

    public C2066989h(String str, String str2, int i, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
