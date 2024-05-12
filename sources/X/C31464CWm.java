package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.o;

/* renamed from: X.CWm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31464CWm extends C31465CWn {
    public final int LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;

    public C31464CWm(AbstractC31467CWp abstractC31467CWp, boolean z) {
        super(abstractC31467CWp);
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = z;
    }

    @Override // X.C31465CWn, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.LJLJI + this.LJLJJI;
    }

    @Override // X.C31465CWn, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        canvas.save();
        if (this.LJLJJL) {
            i6 = this.LJLJJI;
        } else {
            i6 = this.LJLJI;
        }
        canvas.translate(i6, 0.0f);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        canvas.restore();
    }
}
