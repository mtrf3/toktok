package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes14.dex */
public final class V23 {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, V24.INSTANCE);

    public static final long LIZ(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return C1DF.LIZIZ(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return C10430b1.LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC16010k1 LIZIZ(android.graphics.drawable.Drawable r3, X.InterfaceC24520xk r4) {
        /*
            r0 = 859108326(0x3334f3e6, float:4.213134E-8)
            r4.LJJIIJ(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.LJJIIJ(r0)
            boolean r0 = r4.LJIJJ(r3)
            java.lang.Object r2 = r4.LJIILL()
            if (r0 != 0) goto L1f
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r2 != r0) goto L26
        L1f:
            if (r3 != 0) goto L2f
            X.V25 r2 = X.V25.LJLJJLL
        L23:
            r4.LJJIII(r2)
        L26:
            r4.LJJIJIIJIL()
            X.0k1 r2 = (X.AbstractC16010k1) r2
            r4.LJJIJIIJIL()
            return r2
        L2f:
            boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L49
            X.1Ul r2 = new X.1Ul
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r1 = r3.getBitmap()
            java.lang.String r0 = "drawable.bitmap"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.1QV r0 = new X.1QV
            r0.<init>(r1)
            r2.<init>(r0)
            goto L23
        L49:
            boolean r0 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L5d
            X.1Um r2 = new X.1Um
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r0 = r3.getColor()
            long r0 = X.C78897Uxp.LIZLLL(r0)
            r2.<init>(r0)
            goto L23
        L5d:
            X.V27 r2 = new X.V27
            android.graphics.drawable.Drawable r1 = r3.mutate()
            java.lang.String r0 = "drawable.mutate()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V23.LIZIZ(android.graphics.drawable.Drawable, X.0xk):X.0k1");
    }
}
