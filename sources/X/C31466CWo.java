package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CWo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31466CWo extends ReplacementSpan {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public final Paint LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public int LJLJL;
    public final int LJLJLJ;

    public C31466CWo(Context context, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        Paint paint = new Paint(1);
        paint.setColor(C259910h.LIZIZ(R.attr.aqy, context));
        this.LJLJI = paint;
        this.LJLJJI = C5S0.LIZ(4.0f);
        this.LJLJJL = C5S0.LIZ(4.0f);
        this.LJLJJLL = C5S0.LIZ(16.0f);
        this.LJLJLJ = C259910h.LIZIZ(R.attr.ar7, context);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        C23010vJ.LIZIZ(this.LJLIL, paint, 7, 600);
        int measureText = (int) ((2 * this.LJLJJI) + paint.measureText(this.LJLILLLLZI));
        this.LJLJL = measureText;
        return measureText;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        canvas.save();
        C23010vJ.LIZIZ(this.LJLIL, paint, 7, 600);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(f, ((i5 + i3) / 2) - (this.LJLJJLL / 2));
        float f2 = this.LJLJL;
        float f3 = this.LJLJJLL;
        float f4 = this.LJLJJL;
        canvas.drawRoundRect(0.0f, 0.0f, f2, f3, f4, f4, this.LJLJI);
        canvas.translate(this.LJLJJI, 0.0f);
        paint.setColor(this.LJLJLJ);
        String str = this.LJLILLLLZI;
        float f5 = this.LJLJJLL;
        int i6 = fontMetricsInt.descent;
        canvas.drawText(str, 0.0f, ((f5 - (i6 - r1)) / 2.0f) - fontMetricsInt.ascent, paint);
        canvas.restore();
    }
}
