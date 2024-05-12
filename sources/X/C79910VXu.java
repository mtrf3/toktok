package X;

import Y.ARunnableS12S0301000_12;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.VXu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79910VXu extends Drawable {
    public static final /* synthetic */ int LJIIL = 0;
    public boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final int LJI = C78688UuS.LJIILIIL(1.5f);
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final /* synthetic */ C79909VXt LJIIJJI;

    public final void LJFF() {
        C79909VXt c79909VXt = this.LJIIJJI;
        TextView textView = c79909VXt.LIZIZ;
        if (textView == null) {
            return;
        }
        if (this.LIZ) {
            int LIZIZ = c79909VXt.LIZJ.LIZIZ(textView);
            OSZ LIZJ = C79911VXv.LIZJ(LIZIZ, textView, this.LIZ);
            this.LJIIJJI.LIZJ.LIZ = ((Number) LIZJ.getSecond()).intValue();
            this.LJIIIZ = LIZIZ() + LIZLLL() + ((Number) LIZJ.getFirst()).intValue();
            this.LJIIJ = LIZJ() + LJ() + C79911VXv.LIZLLL(LIZIZ, textView, this.LIZ);
        } else {
            int LIZ = c79909VXt.LIZJ.LIZ(textView);
            OSZ LIZJ2 = C79911VXv.LIZJ(LIZ, textView, this.LIZ);
            this.LJIIJJI.LIZJ.LIZIZ = ((Number) LIZJ2.getSecond()).intValue();
            this.LJIIIZ = LIZIZ() + LIZLLL() + ((Number) LIZJ2.getFirst()).intValue();
            this.LJIIJ = LIZJ() + LJ() + C79911VXv.LIZLLL(LIZ, textView, this.LIZ);
        }
        if (this.LJ) {
            C79908VXs c79908VXs = this.LJIIJJI.LJII;
            if (c79908VXs != null) {
                c79908VXs.LIZJ(new Rect(this.LJIIJJI.LIZLLL() + this.LJIIIZ, this.LJIIJJI.LJ() + this.LJIIJ, this.LJIIJJI.LIZLLL() + this.LJIIIZ + this.LIZIZ, (this.LIZLLL * 2) + this.LJIIJJI.LJ() + this.LJIIJ + this.LIZJ));
            }
            C79909VXt c79909VXt2 = this.LJIIJJI;
            TextView textView2 = c79909VXt2.LIZIZ;
            if (textView2 == null) {
                return;
            }
            textView2.post(new ARunnableS12S0301000_12(1, c79909VXt2, textView2, this, 4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int LIZIZ() {
        Integer num;
        TextView textView = this.LJIIJJI.LIZIZ;
        if (textView != null) {
            num = Integer.valueOf(textView.getPaddingStart());
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final int LIZJ() {
        Integer num;
        TextView textView = this.LJIIJJI.LIZIZ;
        if (textView != null) {
            num = Integer.valueOf(textView.getPaddingTop());
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final int LIZLLL() {
        if (this.LIZ) {
            return -((this.LJI / 2) + (this.LIZIZ / 2));
        }
        return -((this.LIZIZ / 2) - (this.LJI / 2));
    }

    public final int LJ() {
        if (this.LIZ) {
            return this.LIZLLL * (-2);
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        o.LJIIIZ(canvas, "canvas");
        Paint paint = new Paint(1);
        paint.setColor(this.LJIIJJI.LIZLLL);
        if (this.LIZ) {
            int i = this.LIZIZ;
            int i2 = this.LJI;
            rect = new Rect((i / 2) - (i2 / 2), this.LIZLLL * 2, (i2 / 2) + (i / 2), this.LIZJ);
        } else {
            int i3 = this.LIZIZ;
            int i4 = this.LJI;
            rect = new Rect((i3 / 2) - (i4 / 2), 0, (i4 / 2) + (i3 / 2), this.LIZJ - (this.LIZLLL * 2));
        }
        canvas.drawRect(rect, paint);
        canvas.save();
        if (this.LIZ) {
            float f = this.LIZIZ / 2;
            int i5 = this.LIZLLL;
            canvas.drawCircle(f, i5, i5, paint);
        } else {
            float f2 = this.LIZIZ / 2;
            float f3 = this.LIZJ;
            int i6 = this.LIZLLL;
            canvas.drawCircle(f2, f3 - i6, i6, paint);
        }
        canvas.restore();
    }

    public final void LIZ(int i, int i2) {
        C79909VXt c79909VXt = this.LJIIJJI;
        this.LJII = c79909VXt.LIZJ.LIZIZ(c79909VXt.LIZIZ);
        C79909VXt c79909VXt2 = this.LJIIJJI;
        this.LJIIIIZZ = c79909VXt2.LIZJ.LIZ(c79909VXt2.LIZIZ);
        if (i != i2) {
            C79912VXw c79912VXw = this.LJIIJJI.LIZJ;
            c79912VXw.getClass();
            c79912VXw.LIZJ = "";
            if (this.LIZ) {
                int i3 = this.LJIIIIZZ;
                if (i > i3) {
                    C79909VXt c79909VXt3 = this.LJIIJJI;
                    C79910VXu c79910VXu = c79909VXt3.LJ;
                    if (c79910VXu != null) {
                        c79910VXu.LIZ = !c79910VXu.LIZ;
                    }
                    C79910VXu c79910VXu2 = c79909VXt3.LJFF;
                    if (c79910VXu2 != null) {
                        c79910VXu2.LIZ = !c79910VXu2.LIZ;
                    }
                    c79909VXt3.LJ = c79910VXu2;
                    c79909VXt3.LJFF = c79910VXu;
                    this.LJII = i3;
                    c79909VXt3.LJI(i3, i);
                } else {
                    this.LJIIJJI.LJI(i, -1);
                }
            } else {
                int i4 = this.LJII;
                if (i < i4) {
                    C79909VXt c79909VXt4 = this.LJIIJJI;
                    C79910VXu c79910VXu3 = c79909VXt4.LJ;
                    if (c79910VXu3 != null) {
                        c79910VXu3.LIZ = !c79910VXu3.LIZ;
                    }
                    C79910VXu c79910VXu4 = c79909VXt4.LJFF;
                    if (c79910VXu4 != null) {
                        c79910VXu4.LIZ = !c79910VXu4.LIZ;
                    }
                    c79909VXt4.LJ = c79910VXu4;
                    c79909VXt4.LJFF = c79910VXu3;
                    this.LJIIIIZZ = i4;
                    c79909VXt4.LJI(i, i4);
                } else {
                    this.LJIIJJI.LJI(i4, i);
                }
            }
            C79910VXu c79910VXu5 = this.LJIIJJI.LJ;
            if (c79910VXu5 != null) {
                c79910VXu5.LJFF();
            }
            C79910VXu c79910VXu6 = this.LJIIJJI.LJFF;
            if (c79910VXu6 != null) {
                c79910VXu6.LJFF();
            }
        }
    }

    public C79910VXu(C79909VXt c79909VXt, boolean z, int i, int i2, int i3) {
        this.LJIIJJI = c79909VXt;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
