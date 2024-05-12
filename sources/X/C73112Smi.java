package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Smi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73112Smi {
    public final InterfaceC73114Smk LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final RectF LJFF;
    public final float[] LJI;
    public final Path LJII;
    public final Paint LJIIIIZZ;
    public final PorterDuffXfermode LJIIIZ;

    public C73112Smi(InterfaceC73114Smk view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LJFF = new RectF();
        this.LJI = new float[8];
        this.LJII = new Path();
        this.LJIIIIZZ = new Paint(1);
        this.LJIIIZ = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    }

    public final void LIZ(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        if (this.LIZIZ == 0 && this.LIZLLL == 0 && this.LIZJ == 0 && this.LJ == 0) {
            this.LIZ.LJI(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(this.LJFF, this.LJIIIIZZ);
        this.LJII.reset();
        this.LJII.addRoundRect(this.LJFF, this.LJI, Path.Direction.CW);
        canvas.drawPath(this.LJII, this.LJIIIIZZ);
        this.LJIIIIZZ.setXfermode(this.LJIIIZ);
        canvas.saveLayer(this.LJFF, this.LJIIIIZZ);
        this.LIZ.LJI(canvas);
        this.LJIIIIZZ.setXfermode(null);
        this.LJIIIIZZ.setColorFilter(null);
        canvas.restoreToCount(saveLayer);
    }

    public final void LIZJ(int i, int i2) {
        if ((this.LIZIZ == 0 && this.LIZLLL == 0 && this.LJ == 0 && this.LIZJ == 0) || i == 0 || i2 == 0) {
            return;
        }
        this.LJFF.set(0.0f, 0.0f, i, i2);
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet, int i) {
        View view;
        o.LJIIIZ(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bo3, R.attr.boy, R.attr.boz, R.attr.bpb, R.attr.bpc}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…nerView, defStyleAttr, 0)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.LIZIZ = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        this.LIZJ = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.LJ = dimensionPixelSize2;
        float[] fArr = this.LJI;
        float f = this.LIZIZ;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = this.LIZLLL;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = dimensionPixelSize2;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = this.LIZJ;
        fArr[6] = f4;
        fArr[7] = f4;
        obtainStyledAttributes.recycle();
        if (this.LIZJ > 0 || this.LIZIZ > 0 || this.LIZLLL > 0 || this.LJ > 0) {
            Object obj = this.LIZ;
            if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
                view.setWillNotDraw(false);
            }
        }
    }
}
