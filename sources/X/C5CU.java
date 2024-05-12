package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5CU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CU extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final float LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public final int LJLJLJ;
    public final RectF LJLJLLL;

    public final int getMaxProgress() {
        return this.LJLJLJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        RectF rectF = this.LJLJLLL;
        float f = this.LJLJJL;
        float f2 = 2;
        rectF.set(f / f2, f / f2, getWidth() - (this.LJLJJL / f2), getHeight() - (this.LJLJJL / f2));
        this.LJLIL.setColor(this.LJLJI);
        canvas.drawArc(this.LJLJLLL, -90.0f, (this.LJLJJLL / this.LJLJLJ) * 360, false, this.LJLIL);
        this.LJLIL.setColor(this.LJLJJI);
        canvas.drawArc(this.LJLJLLL, -90.0f, 360.0f, false, this.LJLIL);
        canvas.drawText(this.LJLJL, getWidth() / 2.0f, (Math.abs(this.LJLILLLLZI.descent() + this.LJLILLLLZI.ascent()) / f2) + (getHeight() / 2), this.LJLILLLLZI);
    }

    public final void setProgress(int i) {
        this.LJLJJLL = i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        this.LJLJL = X1D.LIZIZ(LIZ);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5CU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        Paint paint = new Paint();
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        this.LJLILLLLZI = paint2;
        int color = getResources().getColor(R.color.rd);
        this.LJLJI = color;
        this.LJLJJI = getResources().getColor(R.color.rc);
        float LIZ = C134855Qz.LIZ(2.0f);
        this.LJLJJL = LIZ;
        this.LJLJJLL = 40;
        this.LJLJL = "100%";
        this.LJLJLJ = 100;
        this.LJLJLLL = new RectF();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(LIZ);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(C134855Qz.LIZ(11.0f));
        paint2.setColor(color);
    }
}
