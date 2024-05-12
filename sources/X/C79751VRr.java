package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.VRr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79751VRr extends MetricAffectingSpan {
    public final int LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public boolean LJLJJI;

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }

    public final int hashCode() {
        return this.LJLIL + 31;
    }

    public C79751VRr(int i) {
        this.LJLIL = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C79751VRr) || this.LJLIL != ((C79751VRr) obj).LJLIL) {
            return false;
        }
        return true;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (!this.LJLJJI) {
            textPaint.setStyle(Paint.Style.FILL);
            textPaint.setColor(this.LJLIL);
        } else {
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(this.LJLJI);
            textPaint.setColor(this.LJLILLLLZI);
            textPaint.bgColor = 0;
        }
    }
}
