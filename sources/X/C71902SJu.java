package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.SJu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71902SJu extends Drawable {
    public int LIZLLL;
    public float[] LJI;
    public final Paint LJII;
    public Shader LJIIIIZZ;
    public EnumC71900SJs LJIIIZ;
    public EnumC71803SFz LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public final C71904SJw LIZ = new C71904SJw(this);
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public float LJ = 1.0f;
    public float LJFF = 1.0f;

    public static int LIZJ(float f, int i) {
        return (((int) (f * 255.0f)) << 24) | (i & 16777215);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int LIZ() {
        int i = this.LJIILJJIL;
        if (i <= 0) {
            return getBounds().height();
        }
        return i;
    }

    public final int LIZIZ() {
        int i = this.LJIILIIL;
        if (i <= 0) {
            return getBounds().width();
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (Build.VERSION.SDK_INT <= 23) {
            return this.LIZ;
        }
        return null;
    }

    public C71902SJu() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJII = paint;
        this.LJIIIZ = EnumC71900SJs.LINEAR;
        this.LJIIJ = EnumC71803SFz.VERTICAL;
        this.LJIIL = 1.0f;
        this.LJIILIIL = -1;
        this.LJIILJJIL = -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LIZIZ;
    }

    public final void LIZLLL(int i) {
        this.LJ = ((i >> 24) & 255) / 255.0f;
        this.LIZLLL = LIZJ(1.0f, i);
        invalidateSelf();
    }

    public final void LJ(EnumC71900SJs value) {
        float f;
        int i;
        int i2;
        float LIZ;
        o.LJIIIZ(value, "value");
        if (this.LJIIIZ != value) {
            this.LJIIIIZZ = null;
            if (value == EnumC71900SJs.LINEAR) {
                this.LJIIIZ = value;
            } else {
                float[] fArr = new float[20];
                C71903SJv c71903SJv = new C71903SJv(value.getX0(), value.getY0(), value.getX1(), value.getY1());
                int i3 = 0;
                do {
                    float f2 = i3 / 19;
                    float f3 = 0.0f;
                    if (f2 > 0.0f) {
                        float f4 = 1.0f;
                        if (f2 < 1.0f) {
                            while (true) {
                                f = (f3 + f4) / 2;
                                if (c71903SJv.LJ.containsKey(Float.valueOf(f))) {
                                    Float f5 = c71903SJv.LJ.get(Float.valueOf(f));
                                    o.LJI(f5);
                                    LIZ = f5.floatValue();
                                    i2 = 3;
                                    i = 1;
                                } else {
                                    float f6 = 3;
                                    float f7 = 1 - f;
                                    i = 1;
                                    i2 = 3;
                                    LIZ = C06490Nh.LIZ(f6, c71903SJv.LIZJ, f7, f, f, c71903SJv.LIZ * f6 * f7 * f7 * f) + (f * f * f);
                                    c71903SJv.LJ.put(Float.valueOf(f), Float.valueOf(LIZ));
                                }
                                if (Math.abs(f2 - LIZ) < 0.001f) {
                                    break;
                                } else if (LIZ < f2) {
                                    f3 = f;
                                } else {
                                    f4 = f;
                                }
                            }
                            float f8 = i2;
                            float f9 = i - f;
                            f2 = (f * f * f) + C06490Nh.LIZ(f8, c71903SJv.LIZLLL, f9, f, f, c71903SJv.LIZIZ * f8 * f9 * f9 * f);
                        }
                    }
                    fArr[i3] = f2;
                    i3++;
                } while (i3 < 20);
                this.LJI = fArr;
                this.LJIIIZ = value;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float width;
        float f;
        Shader linearGradient;
        float width2;
        float f2;
        o.LJIIIZ(canvas, "canvas");
        int width3 = getBounds().width();
        int height = getBounds().height();
        if (LIZIZ() <= 0 || LIZ() <= 0) {
            setBounds(getBounds().left, getBounds().top, getBounds().left + width3, getBounds().top + height);
        } else {
            setBounds(((width3 - LIZIZ()) / 2) + getBounds().left, ((height - LIZ()) / 2) + getBounds().top, ((LIZIZ() + width3) / 2) + getBounds().left, ((LIZ() + height) / 2) + getBounds().top);
        }
        if (this.LJIIIIZZ == null) {
            float f3 = this.LJ * this.LJFF;
            if (this.LJIIIZ == EnumC71900SJs.LINEAR) {
                int LIZJ = LIZJ(this.LJIIJJI * f3, this.LIZLLL);
                int LIZJ2 = LIZJ(this.LJIIL * f3, this.LIZLLL);
                EnumC71803SFz enumC71803SFz = this.LJIIJ;
                EnumC71803SFz enumC71803SFz2 = EnumC71803SFz.VERTICAL;
                if (enumC71803SFz == enumC71803SFz2 || enumC71803SFz == EnumC71803SFz.HORIZONTAL) {
                    if (enumC71803SFz == enumC71803SFz2) {
                        width2 = 0.0f;
                    } else {
                        width2 = getBounds().width();
                    }
                    if (this.LJIIJ == enumC71803SFz2) {
                        f2 = getBounds().height();
                    } else {
                        f2 = 0.0f;
                    }
                    linearGradient = new LinearGradient(0.0f, 0.0f, width2, f2, LIZJ, LIZJ2, Shader.TileMode.CLAMP);
                } else {
                    float min = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
                    linearGradient = new RadialGradient(min, min, min, LIZJ, LIZJ2, Shader.TileMode.CLAMP);
                }
            } else {
                int[] iArr = new int[20];
                float f4 = this.LJIIL - this.LJIIJJI;
                int i = 0;
                do {
                    float f5 = this.LJIIJJI;
                    float[] fArr = this.LJI;
                    if (fArr != null) {
                        iArr[i] = LIZJ(C1I1.LIZ(fArr[i], f4, f5, f3), this.LIZLLL);
                        i++;
                    } else {
                        o.LJIJI("bezierNums");
                        throw null;
                    }
                } while (i < 20);
                EnumC71803SFz enumC71803SFz3 = this.LJIIJ;
                EnumC71803SFz enumC71803SFz4 = EnumC71803SFz.VERTICAL;
                if (enumC71803SFz3 == enumC71803SFz4 || enumC71803SFz3 == EnumC71803SFz.HORIZONTAL) {
                    if (enumC71803SFz3 == enumC71803SFz4) {
                        width = 0.0f;
                    } else {
                        width = getBounds().width();
                    }
                    if (this.LJIIJ == enumC71803SFz4) {
                        f = getBounds().height();
                    } else {
                        f = 0.0f;
                    }
                    linearGradient = new LinearGradient(0.0f, 0.0f, width, f, iArr, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    float min2 = Math.min(getBounds().width(), getBounds().height()) / 2.0f;
                    linearGradient = new RadialGradient(min2, min2, min2, iArr, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
            this.LJIIIIZZ = linearGradient;
            this.LJII.setShader(linearGradient);
        }
        Rect rect = new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        EnumC71803SFz enumC71803SFz5 = this.LJIIJ;
        if (enumC71803SFz5 == EnumC71803SFz.VERTICAL || enumC71803SFz5 == EnumC71803SFz.HORIZONTAL) {
            canvas.drawRect(rect, this.LJII);
            return;
        }
        int width4 = getBounds().width();
        int height2 = getBounds().height();
        float min3 = Math.min(width4, height2);
        float f6 = min3 / 2.0f;
        if (width4 != height2 && width4 > 0 && height2 > 0 && f6 > 0.0f) {
            float f7 = width4;
            float f8 = height2;
            canvas.scale(f7 / min3, f8 / min3);
            canvas.drawCircle(getBounds().left + f6, getBounds().top + f6, f6, this.LJII);
            canvas.scale(min3 / f7, min3 / f8);
            return;
        }
        canvas.drawCircle(getBounds().left + f6, getBounds().top + f6, f6, this.LJII);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        o.LJIIIZ(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.LJIIIIZZ = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJFF = i / 255.0f;
        this.LJIIIIZZ = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJII.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
