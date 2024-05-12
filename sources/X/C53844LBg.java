package X;

import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LBg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53844LBg extends View {
    public final Path LJLIL;
    public final RectF LJLILLLLZI;
    public final RectF LJLJI;
    public final RectF LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final long LJLLJ;
    public boolean LJLLL;
    public final Handler LJLLLL;
    public InterfaceC53843LBf LJLLLLLL;
    public final int LJLZ;
    public final Paint LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public final ARunnableS45S0100000_9 LL;

    public final float getMaxCount() {
        return this.LJLJJL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.LJZI) {
            return;
        }
        RectF rectF = this.LJLILLLLZI;
        float f = this.LJLLI;
        float f2 = this.LJLJL;
        float f3 = this.LJLLILLLL;
        rectF.set(f, f, f2 - f3, this.LJLJLJ - f3);
        float f4 = this.LJLJL / 2;
        this.LJLIL.reset();
        this.LJLIL.addRoundRect(this.LJLILLLLZI, f4, f4, Path.Direction.CCW);
        this.LJZ.setColor(this.LJLZ);
        this.LJZ.setAlpha(51);
        this.LJZ.setStyle(Paint.Style.STROKE);
        this.LJZ.setStrokeWidth(C32151Nz.LJIIZILJ(Float.valueOf(1.0f)));
        canvas.drawPath(this.LJLIL, this.LJZ);
        canvas.save();
        canvas.clipPath(this.LJLIL);
        float f5 = this.LJLJJLL / this.LJLJJL;
        if (this.LJZL) {
            RectF rectF2 = this.LJLJI;
            int i = this.LJLJL;
            rectF2.set((1 - f5) * i, 0.0f, i, this.LJLJLJ);
        } else {
            RectF rectF3 = this.LJLJI;
            float f6 = this.LJLLI;
            rectF3.set(f6, f6, this.LJLJL * f5, this.LJLJLJ);
        }
        this.LJZ.setColor(this.LJLZ);
        this.LJZ.setAlpha(51);
        this.LJZ.setStyle(Paint.Style.FILL);
        canvas.drawRect(this.LJLJI, this.LJZ);
        canvas.restore();
        canvas.save();
        if (this.LJZL) {
            this.LJLJJI.set(this.LJLJI.left, 0.0f, this.LJLJL, this.LJLJLJ);
        } else {
            this.LJLJJI.set(0.0f, 0.0f, this.LJLJI.right, this.LJLJLJ);
        }
        canvas.clipRect(this.LJLJJI);
        this.LJZ.setColor(this.LJLZ);
        this.LJZ.setAlpha(102);
        this.LJZ.setStyle(Paint.Style.STROKE);
        this.LJZ.setStrokeWidth(C32151Nz.LJIIZILJ(Float.valueOf(1.0f)));
        canvas.drawPath(this.LJLIL, this.LJZ);
        canvas.restore();
    }

    public final void setCurrentCount(float f) {
        float f2 = this.LJLJJL;
        if (f > f2) {
            f = f2;
        }
        this.LJLJJLL = f;
        invalidate();
    }

    public final void setMaxCount(float f) {
        this.LJLJJL = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53844LBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        new LinkedHashMap();
        this.LJLIL = new Path();
        this.LJLILLLLZI = new RectF();
        this.LJLJI = new RectF();
        this.LJLJJI = new RectF();
        this.LJLJJL = 100.0f;
        this.LJLLI = 1.0f;
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = 50L;
        this.LJLLLL = new Handler(C16880lQ.LLJJJJ());
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.dj, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        this.LJLZ = i;
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setStyle(Paint.Style.FILL);
        this.LJZ = LIZIZ;
        this.LJZI = true;
        this.LL = new ARunnableS45S0100000_9((Object) this, 245);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJL = getMeasuredWidth();
        this.LJLJLJ = getMeasuredHeight();
    }
}
