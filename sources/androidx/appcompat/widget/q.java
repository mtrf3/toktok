package androidx.appcompat.widget;

import X.C012102z;
import X.C03D;
import X.C03R;
import X.C07R;
import X.C20110qd;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class q {
    public final ImageView LIZ;
    public C012102z LIZIZ;
    public C012102z LIZJ;
    public int LIZLLL;

    public final void LIZ() {
        Drawable drawable = this.LIZ.getDrawable();
        if (drawable != null) {
            C03D.LIZIZ(drawable);
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.LIZJ == null) {
                    this.LIZJ = new C012102z();
                }
                C012102z c012102z = this.LIZJ;
                c012102z.LIZ = null;
                c012102z.LIZLLL = false;
                c012102z.LIZIZ = null;
                c012102z.LIZJ = false;
                ColorStateList LIZ = C07R.LIZ(this.LIZ);
                if (LIZ != null) {
                    c012102z.LIZLLL = true;
                    c012102z.LIZ = LIZ;
                }
                PorterDuff.Mode LIZIZ = C07R.LIZIZ(this.LIZ);
                if (LIZIZ != null) {
                    c012102z.LIZJ = true;
                    c012102z.LIZIZ = LIZIZ;
                }
                if (c012102z.LIZLLL || c012102z.LIZJ) {
                    C03R.LJ(drawable, c012102z, this.LIZ.getDrawableState());
                    return;
                }
            }
            C012102z c012102z2 = this.LIZIZ;
            if (c012102z2 != null) {
                C03R.LJ(drawable, c012102z2, this.LIZ.getDrawableState());
            }
        }
    }

    public q(ImageView imageView) {
        this.LIZ = imageView;
    }

    public final void LIZJ(int i) {
        if (i != 0) {
            Drawable LIZ = C20110qd.LIZ(this.LIZ.getContext(), i);
            if (LIZ != null) {
                C03D.LIZIZ(LIZ);
            }
            this.LIZ.setImageDrawable(LIZ);
        } else {
            this.LIZ.setImageDrawable(null);
        }
        LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0023, B:5:0x002c, B:7:0x0033, B:9:0x003f, B:10:0x0047, B:12:0x004e, B:13:0x0057, B:15:0x005e, B:17:0x0072, B:19:0x0078, B:21:0x007e, B:23:0x0084, B:24:0x008b, B:29:0x0044), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0023, B:5:0x002c, B:7:0x0033, B:9:0x003f, B:10:0x0047, B:12:0x004e, B:13:0x0057, B:15:0x005e, B:17:0x0072, B:19:0x0078, B:21:0x007e, B:23:0x0084, B:24:0x008b, B:29:0x0044), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.ImageView r0 = r10.LIZ
            android.content.Context r2 = r0.getContext()
            r3 = 4
            int[] r1 = new int[r3]
            r1 = {x0098: FILL_ARRAY_DATA , data: [16843033, 2130971332, 2130971591, 2130971592} // fill-array
            r0 = 0
            r7 = r11
            r9 = r12
            X.033 r2 = X.AnonymousClass033.LJIILIIL(r2, r7, r1, r9, r0)
            android.widget.ImageView r4 = r10.LIZ
            android.content.Context r5 = r4.getContext()
            int[] r6 = new int[r3]
            r6 = {x00a4: FILL_ARRAY_DATA , data: [16843033, 2130971332, 2130971591, 2130971592} // fill-array
            android.content.res.TypedArray r8 = r2.LIZIZ
            o3.h0.LJIJ(r4, r5, r6, r7, r8, r9)
            android.widget.ImageView r0 = r10.LIZ     // Catch: java.lang.Throwable -> L92
            android.graphics.drawable.Drawable r1 = r0.getDrawable()     // Catch: java.lang.Throwable -> L92
            r4 = -1
            if (r1 != 0) goto L44
            r0 = 1
            int r1 = r2.LJIIIIZZ(r0, r4)     // Catch: java.lang.Throwable -> L92
            if (r1 == r4) goto L47
            android.widget.ImageView r0 = r10.LIZ     // Catch: java.lang.Throwable -> L92
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L92
            android.graphics.drawable.Drawable r1 = X.C20110qd.LIZ(r0, r1)     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L47
            android.widget.ImageView r0 = r10.LIZ     // Catch: java.lang.Throwable -> L92
            r0.setImageDrawable(r1)     // Catch: java.lang.Throwable -> L92
        L44:
            X.C03D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L92
        L47:
            r3 = 2
            boolean r0 = r2.LJIIJJI(r3)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L57
            android.widget.ImageView r1 = r10.LIZ     // Catch: java.lang.Throwable -> L92
            android.content.res.ColorStateList r0 = r2.LIZIZ(r3)     // Catch: java.lang.Throwable -> L92
            X.C07S.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L92
        L57:
            r1 = 3
            boolean r0 = r2.LJIIJJI(r1)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8e
            android.widget.ImageView r3 = r10.LIZ     // Catch: java.lang.Throwable -> L92
            int r1 = r2.LJII(r1, r4)     // Catch: java.lang.Throwable -> L92
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C03D.LIZLLL(r1, r0)     // Catch: java.lang.Throwable -> L92
            X.C07R.LIZLLL(r3, r0)     // Catch: java.lang.Throwable -> L92
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L92
            r0 = 21
            if (r1 != r0) goto L8e
            android.graphics.drawable.Drawable r1 = r3.getDrawable()     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L8e
            android.content.res.ColorStateList r0 = X.C07R.LIZ(r3)     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8e
            boolean r0 = r1.isStateful()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8b
            int[] r0 = r3.getDrawableState()     // Catch: java.lang.Throwable -> L92
            r1.setState(r0)     // Catch: java.lang.Throwable -> L92
        L8b:
            r3.setImageDrawable(r1)     // Catch: java.lang.Throwable -> L92
        L8e:
            r2.LJIILJJIL()
            return
        L92:
            r0 = move-exception
            r2.LJIILJJIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q.LIZIZ(android.util.AttributeSet, int):void");
    }
}
