package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class KHZ extends KLD implements KLY {
    public float LLIILZL;
    public KLU LLIIZ;
    public int LLIL;
    public int LLILII;
    public final float[] LLILIL;
    public boolean LLILL;

    @Override // X.KLD
    public final void LJIIJ(RectF rect) {
        o.LJIIIZ(rect, "rect");
    }

    @Override // X.KLD
    public RectF getPhotoDisplayRect() {
        KLU klu = this.LLIIZ;
        if (klu != null) {
            klu.LIZJ();
            return klu.LJ(klu.LJLLL);
        }
        return null;
    }

    @Override // X.KLD
    public final void LJIIIZ() {
        RectF containerRect = getContainerRect();
        containerRect.left = getLeft();
        containerRect.top = getTop();
        containerRect.right = getRight();
        containerRect.bottom = this.LLIL;
    }

    public final boolean getCanDrag() {
        return this.LLILL;
    }

    public final int getCanvasHeight() {
        return this.LLIL;
    }

    public final int getCanvasWidth() {
        return this.LLILII;
    }

    @Override // X.KLY
    public final void LIZ(float f) {
        float f2;
        KLU klu = this.LLIIZ;
        if (klu != null) {
            Matrix matrix = klu.LJLLL;
            if (matrix == null) {
                f2 = 0.0f;
            } else {
                matrix.getValues(this.LLILIL);
                f2 = this.LLILIL[5];
            }
            if (f2 == this.LLIILZL) {
                return;
            }
            this.LLIILZL = f2;
            invalidate();
        }
    }

    @Override // X.KLD
    public final float LJI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        return event.getY() - this.LLIILZL;
    }

    public final String LJIIL(RectF rectF) {
        o.LJIIIZ(rectF, "rectF");
        try {
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            int i = this.LLILII;
            int i2 = this.LLIL;
            float f5 = f2 / i2;
            float f6 = f4 / i2;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(f / i);
            LIZ.append(',');
            LIZ.append(f5);
            LIZ.append(',');
            LIZ.append(f3 / i);
            LIZ.append(',');
            LIZ.append(f6);
            return X1D.LIZIZ(LIZ);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // X.KLD, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.translate(0.0f, this.LLIILZL);
        super.onDraw(canvas);
    }

    public final void setAttacher(KLU klu) {
        Matrix matrix;
        this.LLIIZ = klu;
        if (klu == null || (matrix = klu.LJLLL) == null) {
            return;
        }
        matrix.getValues(this.LLILIL);
        this.LLIILZL = this.LLILIL[5];
    }

    public final void setCanDrag(boolean z) {
        this.LLILL = z;
    }

    public final void setCanvasHeight(int i) {
        this.LLIL = i;
    }

    public final void setCanvasWidth(int i) {
        this.LLILII = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KHZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLILIL = new float[9];
    }

    public static RectF LJIIJJI(int i, int i2, String detection) {
        o.LJIIIZ(detection, "detection");
        RectF rectF = new RectF();
        try {
            List LJLJJL = s.LJLJJL(detection, new String[]{","}, 0, 6);
            float parseFloat = CastFloatProtector.parseFloat((String) ListProtector.get(LJLJJL, 0));
            float parseFloat2 = CastFloatProtector.parseFloat((String) ListProtector.get(LJLJJL, 1));
            float parseFloat3 = CastFloatProtector.parseFloat((String) ListProtector.get(LJLJJL, 2));
            float parseFloat4 = CastFloatProtector.parseFloat((String) ListProtector.get(LJLJJL, 3));
            float f = i;
            float f2 = i2;
            rectF.left = parseFloat * f;
            rectF.top = parseFloat2 * f2;
            rectF.right = parseFloat3 * f;
            rectF.bottom = parseFloat4 * f2;
        } catch (Exception unused) {
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = 0.0f;
            rectF.bottom = 0.0f;
        }
        return rectF;
    }
}
