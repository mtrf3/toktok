package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ReplacementSpan;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208368Fs extends ReplacementSpan {
    public final Context LJLIL;
    public final C208378Ft LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    public C208368Fs(Context context, C208378Ft c208378Ft) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = c208378Ft;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(text, "text");
        int measureText = (int) paint.measureText(text.subSequence(i, i2).toString());
        C208378Ft c208378Ft = this.LJLILLLLZI;
        return measureText + c208378Ft.LIZLLL + c208378Ft.LJI;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        int measureText = (int) paint.measureText(text.subSequence(i, i2).toString());
        C208378Ft c208378Ft = this.LJLILLLLZI;
        int i6 = measureText + c208378Ft.LIZLLL + c208378Ft.LJI;
        canvas.save();
        int i7 = (int) f;
        this.LJLJI = i7;
        this.LJLJJI = i7 + i6;
        C208378Ft c208378Ft2 = this.LJLILLLLZI;
        int i8 = i5 - i3;
        int i9 = (i8 - c208378Ft2.LIZIZ) / 2;
        int i10 = i3 + i9;
        int i11 = i5 - i9;
        int i12 = c208378Ft2.LIZJ;
        if (i12 > 0) {
            int i13 = (i8 - i12) / 2;
            this.LJLJJL = i3 + i13;
            this.LJLJJLL = i5 - i13;
        } else {
            this.LJLJJL = i10;
            this.LJLJJLL = i11;
        }
        GradientDrawable LIZIZ = T28.LIZIZ(0);
        LIZIZ.setCornerRadius(this.LJLILLLLZI.LJFF);
        LIZIZ.setColor(this.LJLILLLLZI.LJII);
        LIZIZ.setBounds(new Rect(this.LJLJI, i10, this.LJLJJI, i11));
        LIZIZ.draw(canvas);
        float LIZIZ2 = this.LJLJI + C7MY.LIZIZ(8);
        float f2 = i4;
        canvas.drawText(text.toString(), i, i2, LIZIZ2, f2, paint);
        canvas.restore();
        canvas.save();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(paint.measureText(text, i, i2) + LIZIZ2 + C7MY.LIZIZ(2), ((((fontMetrics.descent + f2) + f2) + fontMetrics.ascent) / 2) - (this.LJLILLLLZI.LJ / 2));
        SY9 sy9 = new SY9(this.LJLIL, R.raw.icon_x_mark);
        C208378Ft c208378Ft3 = this.LJLILLLLZI;
        sy9.setBounds(new Rect(0, 0, c208378Ft3.LIZLLL, c208378Ft3.LJ));
        Context context = this.LJLIL;
        int i14 = R.attr.gv;
        Integer LJI = C79045V0n.LJI(R.attr.gv, context);
        if (LJI != null) {
            i14 = LJI.intValue();
        }
        sy9.LJ(i14);
        sy9.draw(canvas);
        canvas.restore();
    }
}
