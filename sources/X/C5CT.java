package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5CT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CT extends View {
    public Paint LJLIL;
    public Paint LJLILLLLZI;
    public Paint LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public RectF LJLJL;
    public int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public int LJLLI;
    public int LJLLILLLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (this.LJLJL == null) {
            RectF rectF = new RectF();
            this.LJLJL = rectF;
            int i = (int) (this.LJLJJLL * 2);
            rectF.set((this.LJLLI - i) / 2, (this.LJLLILLLL - i) / 2, r2 + i, i + r1);
        }
        RectF rectF2 = this.LJLJL;
        o.LJI(rectF2);
        Paint paint = this.LJLILLLLZI;
        o.LJI(paint);
        canvas.drawArc(rectF2, -90.0f, 360.0f, false, paint);
        RectF rectF3 = this.LJLJL;
        o.LJI(rectF3);
        Paint paint2 = this.LJLIL;
        o.LJI(paint2);
        canvas.drawArc(rectF3, -90.0f, (this.LJLJLJ / this.LJLL) * 360, false, paint2);
        if (this.LJLJLJ < this.LJLJLLL) {
            invalidate();
        }
        StringBuilder LIZ = X1D.LIZ();
        String LIZJ = b0.LIZJ(LIZ, this.LJLJLJ, '%', LIZ);
        float f = this.LJLLI / 2;
        float f2 = (this.LJLLILLLL / 2) + this.LJLJJL;
        Paint paint3 = this.LJLJI;
        o.LJI(paint3);
        canvas.drawText(LIZJ, f, f2, paint3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LJLJJI = 10.0f;
        this.LJLJJL = 10.0f / 2;
        this.LJLJJLL = 60.0f;
        this.LJLJLLL = 100;
        this.LJLL = 100;
        Paint paint = new Paint();
        this.LJLIL = paint;
        paint.setColor(-1);
        Paint paint2 = this.LJLIL;
        if (paint2 != null) {
            paint2.setAntiAlias(true);
        }
        Paint paint3 = this.LJLIL;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.STROKE);
        }
        Paint paint4 = this.LJLIL;
        if (paint4 != null) {
            paint4.setStrokeWidth(10.0f);
        }
        Paint paint5 = new Paint();
        this.LJLILLLLZI = paint5;
        paint5.setColor(getResources().getColor(R.color.zx));
        Paint paint6 = this.LJLILLLLZI;
        if (paint6 != null) {
            paint6.setAntiAlias(true);
        }
        Paint paint7 = this.LJLILLLLZI;
        if (paint7 != null) {
            paint7.setStyle(Paint.Style.STROKE);
        }
        Paint paint8 = this.LJLILLLLZI;
        if (paint8 != null) {
            paint8.setStrokeWidth(10.0f);
        }
        Paint paint9 = new Paint();
        this.LJLJI = paint9;
        paint9.setColor(-1);
        Paint paint10 = this.LJLJI;
        if (paint10 != null) {
            paint10.setAntiAlias(true);
        }
        Paint paint11 = this.LJLJI;
        if (paint11 != null) {
            paint11.setTextSize(30.0f);
        }
        Paint paint12 = this.LJLJI;
        if (paint12 == null) {
            return;
        }
        paint12.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            size = (int) ((this.LJLJJLL * 2) + this.LJLJJI);
        }
        this.LJLLI = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            size2 = (int) ((this.LJLJJLL * 2) + this.LJLJJI);
        }
        this.LJLLILLLL = size2;
        setMeasuredDimension(this.LJLLI, size2);
    }
}
