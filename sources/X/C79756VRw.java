package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* renamed from: X.VRw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79756VRw extends MetricAffectingSpan {
    public final Typeface LJLIL;

    public final int hashCode() {
        Typeface typeface = this.LJLIL;
        if (typeface == null) {
            return 0;
        }
        return typeface.hashCode();
    }

    public C79756VRw(Typeface typeface) {
        this.LJLIL = typeface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C79756VRw.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.LJLIL, ((C79756VRw) obj).LJLIL);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.LJLIL;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        Typeface typeface = this.LJLIL;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
