package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

/* renamed from: X.VQs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79726VQs {
    public EnumC79725VQr LIZ = EnumC79725VQr.NONE;
    public Integer LIZIZ = -16777216;
    public float LIZJ;
    public Rect LIZLLL;
    public Paint LJ;
    public Path LJFF;

    public final void LIZIZ(Canvas canvas) {
        Rect rect;
        int round;
        int i;
        EnumC79725VQr enumC79725VQr = this.LIZ;
        if (enumC79725VQr == null || enumC79725VQr.equals(EnumC79725VQr.NONE) || this.LIZ.equals(EnumC79725VQr.HIDDEN) || this.LIZJ < 0.001d || (rect = this.LIZLLL) == null || rect.width() < 1 || this.LIZLLL.height() < 1) {
            return;
        }
        int save = canvas.save();
        Rect rect2 = this.LIZLLL;
        int i2 = rect2.left;
        int i3 = rect2.top;
        int width = rect2.width();
        int height = rect2.height();
        float f = this.LIZJ;
        if (f < 1.0f) {
            round = 1;
        } else {
            round = Math.round(f);
        }
        Paint paint = new Paint();
        this.LJ = paint;
        paint.setAntiAlias(false);
        this.LJ.setStyle(Paint.Style.STROKE);
        Integer num = this.LIZIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -16777216;
        }
        float f2 = i2;
        float f3 = i3;
        float f4 = i2 - round;
        float f5 = i3 - round;
        int i4 = i2 + width;
        float f6 = i4 + round;
        float f7 = i4;
        float f8 = round;
        float f9 = f8 * 0.5f;
        float f10 = f3 - f9;
        canvas.save();
        LIZ(canvas, f2, f3, f4, f5, f6, f5, f7, f3);
        int i5 = round * 2;
        float f11 = width + i5;
        this.LIZ.strokeBorderLine(canvas, this.LJ, 1, this.LIZJ, i, f4, f10, f6, f10, f11, f8);
        canvas.restore();
        int i6 = i3 + height;
        float f12 = i6;
        float f13 = i6 + round;
        float f14 = f7 + f9;
        canvas.save();
        LIZ(canvas, f7, f3, f7, f12, f6, f13, f6, f5);
        float f15 = height + i5;
        int i7 = i;
        this.LIZ.strokeBorderLine(canvas, this.LJ, 2, this.LIZJ, i7, f14, f5, f14, f13, f15, f8);
        canvas.restore();
        float f16 = f12 + f9;
        canvas.save();
        LIZ(canvas, f2, f12, f7, f12, f6, f13, f4, f13);
        this.LIZ.strokeBorderLine(canvas, this.LJ, 3, this.LIZJ, i7, f6, f16, f4, f16, f11, f8);
        canvas.restore();
        float f17 = f2 - f9;
        canvas.save();
        LIZ(canvas, f2, f3, f4, f5, f4, f13, f2, f12);
        this.LIZ.strokeBorderLine(canvas, this.LJ, 0, this.LIZJ, i7, f17, f13, f17, f5, f15, f8);
        canvas.restore();
        this.LJ.setAntiAlias(true);
        canvas.restoreToCount(save);
    }

    public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (this.LJFF == null) {
            this.LJFF = new Path();
        }
        this.LJFF.reset();
        this.LJFF.moveTo(f, f2);
        this.LJFF.lineTo(f3, f4);
        this.LJFF.lineTo(f5, f6);
        this.LJFF.lineTo(f7, f8);
        this.LJFF.lineTo(f, f2);
        canvas.clipPath(this.LJFF);
    }
}
