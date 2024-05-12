package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHP extends View {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final Bitmap LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public final Paint LJLJLLL;
    public final int LJLL;
    public boolean LJLLI;

    public final float getProgress() {
        return this.LJLJLJ;
    }

    public final float getSeekBarTotalLength() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WHP(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        this.LJLIL = J7C.LIZ(context, 120.0f);
        float LIZ = J7C.LIZ(context, 1.5f);
        this.LJLILLLLZI = J7C.LIZ(context, 16.0f);
        this.LJLJI = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.azw);
        this.LJLJJI = J7C.LIZ(context, 11.5f);
        this.LJLJJL = J7C.LIZ(context, 8.5f);
        this.LJLJLJ = 0.5f;
        Paint paint = new Paint();
        this.LJLJLLL = paint;
        this.LJLL = 10;
        paint.setColor(-1);
        paint.setStrokeWidth(LIZ);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.LJLJL;
        float f2 = this.LJLJLJ;
        float f3 = this.LJLIL;
        float f4 = this.LJLILLLLZI;
        double d = ((0.5d - f2) * (f3 - (2 * f4))) + f;
        float f5 = this.LJLJJL;
        float LIZIZ = C06420Na.LIZIZ(this.LJLJJI, f5, f2, f5);
        if (this.LJLLI) {
            float f6 = (float) d;
            double d2 = f - (f3 * 0.5d);
            float f7 = f6 - f4;
            if (f7 > d2) {
                float f8 = this.LJLJJLL;
                canvas.drawLine(f8, f7, f8, (float) d2, this.LJLJLLL);
            }
            double d3 = (this.LJLIL * 0.5d) + this.LJLJL;
            float f9 = f6 + this.LJLILLLLZI;
            if (d3 > f9) {
                float f10 = this.LJLJJLL;
                canvas.drawLine(f10, (float) d3, f10, f9, this.LJLJLLL);
            }
        }
        float f11 = this.LJLJJLL;
        double d4 = LIZIZ;
        double d5 = d + d4;
        Bitmap mIconBitmap = this.LJLJI;
        o.LJIIIIZZ(mIconBitmap, "mIconBitmap");
        int width = mIconBitmap.getWidth();
        Bitmap mIconBitmap2 = this.LJLJI;
        o.LJIIIIZZ(mIconBitmap2, "mIconBitmap");
        canvas.drawBitmap(this.LJLJI, new Rect(0, 0, width, mIconBitmap2.getHeight()), new Rect((int) (f11 - LIZIZ), (int) (d - d4), (int) (f11 + LIZIZ), (int) d5), this.LJLJLLL);
    }

    public final void setProgress(float f) {
        float f2 = ((f / this.LJLL) / this.LJLIL) + this.LJLJLJ;
        if (f2 > 1) {
            this.LJLJLJ = 1.0f;
        } else if (f2 < 0) {
            this.LJLJLJ = 0.0f;
        } else {
            this.LJLJLJ = f2;
        }
        this.LJLLI = true;
        invalidate();
    }
}
