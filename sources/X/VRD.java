package X;

import android.os.Build;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes15.dex */
public final class VRD extends CharacterStyle {
    public final C79729VQv LIZ;

    public VRD(C79729VQv c79729VQv) {
        this.LIZ = c79729VQv;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float f = this.LIZ.LIZLLL;
        if (Build.VERSION.SDK_INT <= 23) {
            f = Math.min(Math.max(0.0f, f), 25.0f);
        }
        C79729VQv c79729VQv = this.LIZ;
        textPaint.setShadowLayer(f, c79729VQv.LIZIZ, c79729VQv.LIZJ, c79729VQv.LIZ);
    }
}
