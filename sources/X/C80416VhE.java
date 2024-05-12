package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VhE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80416VhE {
    public static final /* synthetic */ int LJIIL = 0;
    public final UCH LIZ;
    public final UCH LIZIZ;
    public final UCH LIZJ;
    public final UCH LIZLLL;
    public final InterfaceC80336Vfw LJ;
    public final InterfaceC80336Vfw LJFF;
    public final InterfaceC80336Vfw LJI;
    public final InterfaceC80336Vfw LJII;
    public final C80434VhW LJIIIIZZ;
    public final C80434VhW LJIIIZ;
    public final C80434VhW LJIIJ;
    public final C80434VhW LJIIJJI;

    public C80416VhE() {
        this.LIZ = new V1D();
        this.LIZIZ = new V1D();
        this.LIZJ = new V1D();
        this.LIZLLL = new V1D();
        this.LJ = new C80323Vfj(0.0f);
        this.LJFF = new C80323Vfj(0.0f);
        this.LJI = new C80323Vfj(0.0f);
        this.LJII = new C80323Vfj(0.0f);
        this.LJIIIIZZ = new C80434VhW();
        this.LJIIIZ = new C80434VhW();
        this.LJIIJ = new C80434VhW();
        this.LJIIJJI = new C80434VhW();
    }

    public C80416VhE(C80417VhF c80417VhF) {
        this.LIZ = c80417VhF.LIZ;
        this.LIZIZ = c80417VhF.LIZIZ;
        this.LIZJ = c80417VhF.LIZJ;
        this.LIZLLL = c80417VhF.LIZLLL;
        this.LJ = c80417VhF.LJ;
        this.LJFF = c80417VhF.LJFF;
        this.LJI = c80417VhF.LJI;
        this.LJII = c80417VhF.LJII;
        this.LJIIIIZZ = c80417VhF.LJIIIIZZ;
        this.LJIIIZ = c80417VhF.LJIIIZ;
        this.LJIIJ = c80417VhF.LJIIJ;
        this.LJIIJJI = c80417VhF.LJIIJJI;
    }

    public final boolean LIZLLL(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.LJIIJJI.getClass().equals(C80434VhW.class) && this.LJIIIZ.getClass().equals(C80434VhW.class) && this.LJIIIIZZ.getClass().equals(C80434VhW.class) && this.LJIIJ.getClass().equals(C80434VhW.class)) {
            z = true;
        } else {
            z = false;
        }
        float LIZ = this.LJ.LIZ(rectF);
        if (this.LJFF.LIZ(rectF) == LIZ && this.LJII.LIZ(rectF) == LIZ && this.LJI.LIZ(rectF) == LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.LIZIZ instanceof V1D) && (this.LIZ instanceof V1D) && (this.LIZJ instanceof V1D) && (this.LIZLLL instanceof V1D)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    public final C80416VhE LJ(float f) {
        C80417VhF c80417VhF = new C80417VhF(this);
        c80417VhF.LJ = new C80323Vfj(f);
        c80417VhF.LJFF = new C80323Vfj(f);
        c80417VhF.LJI = new C80323Vfj(f);
        c80417VhF.LJII = new C80323Vfj(f);
        return new C80416VhE(c80417VhF);
    }

    public static InterfaceC80336Vfw LIZJ(TypedArray typedArray, int i, InterfaceC80336Vfw interfaceC80336Vfw) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC80336Vfw;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C80323Vfj(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C80369VgT(peekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC80336Vfw;
    }

    public static C80417VhF LIZ(Context context, int i, int i2, C80323Vfj c80323Vfj) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.a7j, R.attr.a7k, R.attr.a7l, R.attr.a7m, R.attr.a7n, R.attr.a7t, R.attr.a7u, R.attr.a7v, R.attr.a7w, R.attr.a7x});
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC80336Vfw LIZJ = LIZJ(obtainStyledAttributes, 5, c80323Vfj);
            InterfaceC80336Vfw LIZJ2 = LIZJ(obtainStyledAttributes, 8, LIZJ);
            InterfaceC80336Vfw LIZJ3 = LIZJ(obtainStyledAttributes, 9, LIZJ);
            InterfaceC80336Vfw LIZJ4 = LIZJ(obtainStyledAttributes, 7, LIZJ);
            InterfaceC80336Vfw LIZJ5 = LIZJ(obtainStyledAttributes, 6, LIZJ);
            C80417VhF c80417VhF = new C80417VhF();
            UCH LJJJJJL = V1B.LJJJJJL(i4);
            c80417VhF.LIZ = LJJJJJL;
            float LIZIZ = C80417VhF.LIZIZ(LJJJJJL);
            if (LIZIZ != -1.0f) {
                c80417VhF.LJ = new C80323Vfj(LIZIZ);
            }
            c80417VhF.LJ = LIZJ2;
            UCH LJJJJJL2 = V1B.LJJJJJL(i5);
            c80417VhF.LIZIZ = LJJJJJL2;
            float LIZIZ2 = C80417VhF.LIZIZ(LJJJJJL2);
            if (LIZIZ2 != -1.0f) {
                c80417VhF.LJFF = new C80323Vfj(LIZIZ2);
            }
            c80417VhF.LJFF = LIZJ3;
            UCH LJJJJJL3 = V1B.LJJJJJL(i6);
            c80417VhF.LIZJ = LJJJJJL3;
            float LIZIZ3 = C80417VhF.LIZIZ(LJJJJJL3);
            if (LIZIZ3 != -1.0f) {
                c80417VhF.LJI = new C80323Vfj(LIZIZ3);
            }
            c80417VhF.LJI = LIZJ4;
            UCH LJJJJJL4 = V1B.LJJJJJL(i7);
            c80417VhF.LIZLLL = LJJJJJL4;
            float LIZIZ4 = C80417VhF.LIZIZ(LJJJJJL4);
            if (LIZIZ4 != -1.0f) {
                c80417VhF.LJII = new C80323Vfj(LIZIZ4);
            }
            c80417VhF.LJII = LIZJ5;
            return c80417VhF;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static C80417VhF LIZIZ(Context context, AttributeSet attributeSet, int i, int i2) {
        C80323Vfj c80323Vfj = new C80323Vfj(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ba5, R.attr.ba8}, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return LIZ(context, resourceId, resourceId2, c80323Vfj);
    }
}
