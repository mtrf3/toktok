package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: X.03P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03P {
    public final CompoundButton LIZ;
    public ColorStateList LIZIZ;
    public PorterDuff.Mode LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ() {
        Drawable LIZ = C07N.LIZ(this.LIZ);
        if (LIZ != null) {
            if (this.LIZLLL || this.LJ) {
                Drawable mutate = C07840Sm.LJFF(LIZ).mutate();
                if (this.LIZLLL) {
                    C07820Sk.LJII(mutate, this.LIZIZ);
                }
                if (this.LJ) {
                    C07820Sk.LJIIIIZZ(mutate, this.LIZJ);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.LIZ.getDrawableState());
                }
                this.LIZ.setButtonDrawable(mutate);
            }
        }
    }

    public C03P(CompoundButton compoundButton) {
        this.LIZ = compoundButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0057, B:11:0x005e, B:12:0x0067, B:14:0x006e, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0030, B:9:0x0057, B:11:0x005e, B:12:0x0067, B:14:0x006e, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.CompoundButton r0 = r11.LIZ
            android.content.Context r2 = r0.getContext()
            r1 = 4
            int[] r0 = new int[r1]
            r0 = {x0086: FILL_ARRAY_DATA , data: [16843015, 2130969486, 2130969496, 2130969497} // fill-array
            r4 = 0
            r8 = r12
            r10 = r13
            X.033 r3 = X.AnonymousClass033.LJIILIIL(r2, r8, r0, r10, r4)
            android.widget.CompoundButton r5 = r11.LIZ
            android.content.Context r6 = r5.getContext()
            int[] r7 = new int[r1]
            r7 = {x0092: FILL_ARRAY_DATA , data: [16843015, 2130969486, 2130969496, 2130969497} // fill-array
            android.content.res.TypedArray r9 = r3.LIZIZ
            o3.h0.LJIJ(r5, r6, r7, r8, r9, r10)
            r1 = 1
            boolean r0 = r3.LJIIJJI(r1)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L3e
            int r2 = r3.LJIIIIZZ(r1, r4)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L3e
            android.widget.CompoundButton r1 = r11.LIZ     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L81
            android.content.Context r0 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L81
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L81
            r1.setButtonDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L81
            goto L57
        L3e:
            boolean r0 = r3.LJIIJJI(r4)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L57
            int r2 = r3.LJIIIIZZ(r4, r4)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L57
            android.widget.CompoundButton r1 = r11.LIZ     // Catch: java.lang.Throwable -> L81
            android.content.Context r0 = r1.getContext()     // Catch: java.lang.Throwable -> L81
            android.graphics.drawable.Drawable r0 = X.C20110qd.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L81
            r1.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L81
        L57:
            r2 = 2
            boolean r0 = r3.LJIIJJI(r2)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L67
            android.widget.CompoundButton r1 = r11.LIZ     // Catch: java.lang.Throwable -> L81
            android.content.res.ColorStateList r0 = r3.LIZIZ(r2)     // Catch: java.lang.Throwable -> L81
            X.C07L.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L81
        L67:
            r1 = 3
            boolean r0 = r3.LJIIJJI(r1)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7d
            android.widget.CompoundButton r2 = r11.LIZ     // Catch: java.lang.Throwable -> L81
            r0 = -1
            int r1 = r3.LJII(r1, r0)     // Catch: java.lang.Throwable -> L81
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C03D.LIZLLL(r1, r0)     // Catch: java.lang.Throwable -> L81
            X.C07L.LIZLLL(r2, r0)     // Catch: java.lang.Throwable -> L81
        L7d:
            r3.LJIILJJIL()
            return
        L81:
            r0 = move-exception
            r3.LJIILJJIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03P.LIZIZ(android.util.AttributeSet, int):void");
    }
}
