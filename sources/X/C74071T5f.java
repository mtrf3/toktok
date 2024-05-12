package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.util.Objects;

/* renamed from: X.T5f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74071T5f extends MetricAffectingSpan {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI));
    }

    public final void LIZ(TextPaint textPaint) {
        int i;
        Typeface typeface = textPaint.getTypeface();
        int i2 = this.LJLILLLLZI;
        boolean z = true;
        if (i2 == 1) {
            i = 700;
        } else if (i2 == 0) {
            i = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        } else {
            i = (i2 - 1) * 100;
        }
        if (this.LJLIL != 2) {
            z = false;
        }
        textPaint.setTypeface(Typeface.create(typeface, i, z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C74071T5f.class != obj.getClass()) {
            return false;
        }
        C74071T5f c74071T5f = (C74071T5f) obj;
        if (this.LJLIL == c74071T5f.LJLIL && this.LJLILLLLZI == c74071T5f.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    public C74071T5f(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
