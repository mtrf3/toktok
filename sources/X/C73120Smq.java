package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Smq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73120Smq extends ConstraintLayout implements InterfaceC73122Sms {
    public final C40883G2t LJLIL;

    @Override // X.InterfaceC73122Sms
    public final void LJJJLIIL() {
        invalidate();
    }

    @Override // X.InterfaceC73122Sms
    public final void LJI(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C73121Smr c73121Smr = (C73121Smr) this.LJLIL.LIZ;
        if (canvas == null) {
            c73121Smr.getClass();
            return;
        }
        if (c73121Smr.LIZIZ == 0 && c73121Smr.LIZLLL == 0 && c73121Smr.LIZJ == 0 && c73121Smr.LJ == 0) {
            c73121Smr.LIZ.LJI(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(c73121Smr.LJFF, c73121Smr.LJIIIIZZ);
        c73121Smr.LJII.reset();
        c73121Smr.LJII.addRoundRect(c73121Smr.LJFF, c73121Smr.LJI, Path.Direction.CW);
        canvas.drawPath(c73121Smr.LJII, c73121Smr.LJIIIIZZ);
        c73121Smr.LJIIIIZZ.setXfermode(c73121Smr.LJIIIZ);
        canvas.saveLayer(c73121Smr.LJFF, c73121Smr.LJIIIIZZ);
        c73121Smr.LIZ.LJI(canvas);
        c73121Smr.LJIIIIZZ.setXfermode(null);
        c73121Smr.LJIIIIZZ.setColorFilter(null);
        canvas.restoreToCount(saveLayer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C73120Smq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73120Smq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View view;
        a1.LJFF(context, "context");
        C40883G2t c40883G2t = new C40883G2t(this);
        this.LJLIL = c40883G2t;
        C73121Smr c73121Smr = (C73121Smr) c40883G2t.LIZ;
        c73121Smr.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bo3, R.attr.boy, R.attr.boz, R.attr.bpb, R.attr.bpc}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…nerView, defStyleAttr, 0)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        c73121Smr.LIZIZ = dimensionPixelSize2;
        c73121Smr.LIZJ = dimensionPixelSize3;
        c73121Smr.LIZLLL = dimensionPixelSize4;
        c73121Smr.LJ = dimensionPixelSize5;
        float[] fArr = c73121Smr.LJI;
        float f = dimensionPixelSize2;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = dimensionPixelSize4;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = dimensionPixelSize5;
        fArr[4] = f3;
        fArr[5] = f3;
        float f4 = dimensionPixelSize3;
        fArr[6] = f4;
        fArr[7] = f4;
        if (dimensionPixelSize3 > 0 || dimensionPixelSize2 > 0 || dimensionPixelSize4 > 0 || dimensionPixelSize5 > 0) {
            Object obj = c73121Smr.LIZ;
            if ((obj instanceof ViewGroup) && (view = (View) obj) != null) {
                view.setWillNotDraw(false);
            }
        }
        c73121Smr.LIZ.LJJJLIIL();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C40883G2t c40883G2t = this.LJLIL;
        int width = getWidth();
        int height = getHeight();
        C73121Smr c73121Smr = (C73121Smr) c40883G2t.LIZ;
        if ((c73121Smr.LIZIZ == 0 && c73121Smr.LIZLLL == 0 && c73121Smr.LJ == 0 && c73121Smr.LIZJ == 0) || width == 0 || height == 0) {
            return;
        }
        c73121Smr.LJFF.set(0.0f, 0.0f, width, height);
    }
}
