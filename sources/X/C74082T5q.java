package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* renamed from: X.T5q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74082T5q {
    public Paint LIZ;
    public RectF LIZIZ;
    public Path LIZJ;
    public Path LIZLLL;
    public Xfermode LJ;
    public float[] LJFF;
    public float LJI = -1.0f;
    public View LJII;

    public final void LIZ(Canvas canvas) {
        if (this.LJI <= 0.0f) {
            return;
        }
        this.LIZ.reset();
        this.LIZJ.reset();
        this.LIZ.setAntiAlias(true);
        this.LIZ.setStyle(Paint.Style.FILL);
        this.LIZ.setXfermode(this.LJ);
        this.LIZJ.addRoundRect(this.LIZIZ, this.LJFF, Path.Direction.CCW);
        if (Build.VERSION.SDK_INT >= 23) {
            this.LIZLLL.reset();
            this.LIZLLL.addRect(this.LIZIZ, Path.Direction.CCW);
            this.LIZLLL.op(this.LIZJ, Path.Op.DIFFERENCE);
            canvas.drawPath(this.LIZLLL, this.LIZ);
        } else {
            canvas.drawPath(this.LIZJ, this.LIZ);
        }
        this.LIZ.setXfermode(null);
        canvas.restore();
    }

    public final void LIZIZ(View view) {
        PorterDuff.Mode mode;
        if ((view instanceof ViewGroup) && view.getBackground() == null) {
            view.setBackgroundColor(ColorProtector.parseColor("#00000000"));
        }
        this.LJII = view;
        this.LJFF = new float[8];
        this.LIZ = new Paint();
        this.LIZIZ = new RectF();
        this.LIZJ = new Path();
        this.LIZLLL = new Path();
        if (Build.VERSION.SDK_INT >= 23) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        this.LJ = new PorterDuffXfermode(mode);
    }

    public final void LIZJ(float f) {
        this.LJI = f;
        float[] fArr = this.LJFF;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f;
        fArr[2] = f;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        View view = this.LJII;
        if (view != null) {
            view.invalidate();
        }
    }
}
