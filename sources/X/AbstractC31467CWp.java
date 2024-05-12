package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CWp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31467CWp {
    public final Context LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public Runnable LJ;
    public boolean LJFF;

    public abstract void LIZLLL(Canvas canvas, Paint paint);

    public abstract int LJ(Paint paint);

    public AbstractC31467CWp(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = -1;
        this.LIZJ = context.getResources().getDimensionPixelSize(R.dimen.afk);
        this.LIZLLL = 8;
    }

    public final int LIZIZ(Paint paint) {
        o.LJIIIZ(paint, "paint");
        if (this.LIZIZ < 0) {
            this.LIZIZ = LJ(paint);
        }
        return this.LIZIZ;
    }

    public final void LIZ(Canvas canvas, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        LIZLLL(canvas, paint);
        if (!this.LJFF) {
            this.LJFF = true;
            Runnable runnable = this.LJ;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public int LIZJ(Paint paint, Paint.FontMetricsInt fontMetricsInt) {
        o.LJIIIZ(paint, "paint");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i2 = this.LIZJ / 2;
            int i3 = i / 4;
            int i4 = i2 - i3;
            int i5 = -(i2 + i3);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = i4;
            fontMetricsInt.descent = i4;
        }
        if (this.LIZIZ < 0) {
            this.LIZIZ = LJ(paint);
        }
        return this.LIZIZ;
    }
}
