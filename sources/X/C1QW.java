package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.1QW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QW implements InterfaceC11550cp {
    public final Paint LIZ = new Paint(7);
    public int LIZIZ = 3;
    public Shader LIZJ;
    public C11890dN LIZLLL;

    @Override // X.InterfaceC11550cp
    public final float LIZ() {
        o.LJIIIZ(this.LIZ, "<this>");
        return r1.getAlpha() / 255.0f;
    }

    @Override // X.InterfaceC11550cp
    public final long LIZJ() {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        return C78897Uxp.LIZLLL(paint.getColor());
    }

    @Override // X.InterfaceC11550cp
    public final int LJIIJJI() {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return 0;
        }
        return 1;
    }

    public final int LJIIL() {
        int i;
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap != null && (i = C11580cs.LIZ[strokeCap.ordinal()]) != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
        }
        return 0;
    }

    public final int LJIILIIL() {
        int i;
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin != null && (i = C11580cs.LIZIZ[strokeJoin.ordinal()]) != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 1;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    public final float LJIILJJIL() {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public final float LJIILL() {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        return paint.getStrokeWidth();
    }

    @Override // X.InterfaceC11550cp
    public final C11890dN LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC11550cp
    public final Paint LJII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC11550cp
    public final Shader LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC11550cp
    public final int LJIIIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC11550cp
    public final void LIZLLL(long j) {
        Paint setNativeColor = this.LIZ;
        o.LJIIIZ(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(C78897Uxp.LJJJZ(j));
    }

    @Override // X.InterfaceC11550cp
    public final void LJ(C11890dN c11890dN) {
        ColorFilter colorFilter;
        this.LIZLLL = c11890dN;
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        if (c11890dN != null) {
            colorFilter = c11890dN.LIZ;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // X.InterfaceC11550cp
    public final void LJFF(int i) {
        this.LIZIZ = i;
        Paint setNativeBlendMode = this.LIZ;
        o.LJIIIZ(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C12030db.LIZ(setNativeBlendMode, i);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(C44384HbQ.LLILZ(i)));
        }
    }

    @Override // X.InterfaceC11550cp
    public final void LJI(int i) {
        boolean z;
        Paint setNativeFilterQuality = this.LIZ;
        o.LJIIIZ(setNativeFilterQuality, "$this$setNativeFilterQuality");
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setNativeFilterQuality.setFilterBitmap(!z);
    }

    @Override // X.InterfaceC11550cp
    public final void LJIIJ(Shader shader) {
        this.LIZJ = shader;
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        paint.setShader(shader);
    }

    public final void LJIILLIIL(C39579Fg7 c39579Fg7) {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        paint.setPathEffect(null);
    }

    public final void LJIIZILJ(int i) {
        Paint.Cap cap;
        Paint setNativeStrokeCap = this.LIZ;
        o.LJIIIZ(setNativeStrokeCap, "$this$setNativeStrokeCap");
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        setNativeStrokeCap.setStrokeCap(cap);
    }

    public final void LJIJ(int i) {
        Paint.Join join;
        Paint setNativeStrokeJoin = this.LIZ;
        o.LJIIIZ(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        setNativeStrokeJoin.setStrokeJoin(join);
    }

    public final void LJIJI(float f) {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public final void LJIJJ(float f) {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public final void LJIJJLI(int i) {
        Paint.Style style;
        Paint setNativeStyle = this.LIZ;
        o.LJIIIZ(setNativeStyle, "$this$setNativeStyle");
        if (i == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        setNativeStyle.setStyle(style);
    }

    @Override // X.InterfaceC11550cp
    public final void setAlpha(float f) {
        Paint paint = this.LIZ;
        o.LJIIIZ(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }
}
