package com.lynx.tasm.behavior.ui.utils;

import X.C207798Dn;
import X.C79660VOe;
import X.C79712VQe;
import X.EnumC122894s1;
import X.EnumC79725VQr;
import X.EnumC79730VQw;
import X.VJJ;
import X.VNU;
import X.VQ5;
import X.VQ9;
import X.VQQ;
import X.VR1;
import X.VR7;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes15.dex */
public class BackgroundDrawable extends Drawable {
    public final VQ9 LIZ;
    public VQ9 LIZJ;
    public VQ9 LIZLLL;
    public EnumC79725VQr[] LJ;
    public PathEffect LJFF;
    public C79712VQe LJI;
    public C79712VQe LJII;
    public Map<EnumC79730VQw, C79712VQe> LJIIIIZZ;
    public Path LJIIIZ;
    public Path LJIIJ;
    public PointF LJIIJJI;
    public PointF LJIIL;
    public PointF LJIILIIL;
    public PointF LJIILJJIL;
    public final VQ5 LJIJJLI;
    public VQQ LJIL;
    public final VNU LJJ;
    public VR7 LJJI;
    public final Rect LJIILL = new Rect();
    public final Rect LJIILLIIL = new Rect();
    public boolean LJIIZILJ = true;
    public final Paint LJIJ = new Paint(1);
    public int LJIJI = 0;
    public int LJIJJ = 255;
    public final VQ9 LIZIZ = new VQ9();

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final RectF LJFF() {
        float LIZ = this.LIZ.LIZ(1);
        float LIZ2 = this.LIZ.LIZ(3);
        float LIZ3 = this.LIZ.LIZ(0);
        float LIZ4 = this.LIZ.LIZ(2);
        Rect bounds = getBounds();
        float f = LIZ3 + LIZ4;
        if (f > bounds.width() && bounds.width() >= 1) {
            float width = bounds.width() / f;
            LIZ3 *= width;
            LIZ4 *= width;
        }
        float f2 = LIZ + LIZ2;
        if (f2 > bounds.height() && bounds.height() >= 1) {
            float height = bounds.height() / f2;
            LIZ *= height;
            LIZ2 *= height;
        }
        return new RectF(LIZ3, LIZ, LIZ4, LIZ2);
    }

    public final Path LJII() {
        C79712VQe c79712VQe;
        if (this.LJIL != null && LJIIZILJ() && (c79712VQe = this.LJI) != null) {
            return c79712VQe.LIZJ;
        }
        return null;
    }

    public final boolean LJIILIIL() {
        EnumC79725VQr[] enumC79725VQrArr = this.LJ;
        if (enumC79725VQrArr == null) {
            return true;
        }
        EnumC79725VQr enumC79725VQr = enumC79725VQrArr[8];
        EnumC79725VQr enumC79725VQr2 = enumC79725VQrArr[0];
        if (enumC79725VQr2 == null) {
            enumC79725VQr2 = enumC79725VQr;
        }
        EnumC79725VQr enumC79725VQr3 = enumC79725VQrArr[2];
        if (enumC79725VQr3 == null) {
            enumC79725VQr3 = enumC79725VQr;
        }
        if (enumC79725VQr3 != enumC79725VQr2) {
            return false;
        }
        EnumC79725VQr enumC79725VQr4 = enumC79725VQrArr[1];
        if (enumC79725VQr4 == null) {
            enumC79725VQr4 = enumC79725VQr;
        }
        if (enumC79725VQr4 != enumC79725VQr2) {
            return false;
        }
        EnumC79725VQr enumC79725VQr5 = enumC79725VQrArr[3];
        if (enumC79725VQr5 != null) {
            enumC79725VQr = enumC79725VQr5;
        }
        if (enumC79725VQr != enumC79725VQr2) {
            return false;
        }
        if (enumC79725VQr2 == null || enumC79725VQr2.isSolidDashedOrDotted()) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL() {
        if (this.LJIL != null) {
            Rect bounds = getBounds();
            VQQ vqq = this.LJIL;
            if (vqq.LIZJ != 0) {
                vqq.LIZJ = 0;
                vqq.LJ = null;
            }
            vqq.LJ(bounds.width(), bounds.height());
        }
    }

    public final boolean LJIIZILJ() {
        float[] fArr;
        if (this.LJIL == null) {
            return false;
        }
        if (!this.LJIIZILJ) {
            return true;
        }
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return false;
        }
        this.LJIIZILJ = false;
        RectF LJFF = LJFF();
        LJIILLIIL();
        VQQ vqq = this.LJIL;
        if (vqq != null) {
            fArr = vqq.LIZ();
        } else {
            fArr = null;
        }
        if (this.LJI == null) {
            this.LJI = new C79712VQe();
        }
        this.LJI.LIZJ(bounds, fArr, LJFF, 1.0f, false);
        if (this.LJII == null) {
            this.LJII = new C79712VQe();
        }
        this.LJII.LIZJ(bounds, fArr, LJFF, 0.0f, false);
        VQQ vqq2 = this.LJIL;
        if (vqq2 != null && vqq2.LIZJ()) {
            LJIILJJIL(EnumC79730VQw.CENTER, bounds, fArr, LJFF);
            if (this.LJ != null) {
                int i = 0;
                boolean z = false;
                boolean z2 = false;
                do {
                    EnumC79725VQr enumC79725VQr = this.LJ[i];
                    if (enumC79725VQr != null) {
                        if (enumC79725VQr == EnumC79725VQr.DOUBLE) {
                            z = true;
                        } else if (enumC79725VQr == EnumC79725VQr.GROOVE || enumC79725VQr == EnumC79725VQr.RIDGE) {
                            z2 = true;
                        }
                    }
                    i++;
                } while (i <= 8);
                if (z) {
                    LJIILJJIL(EnumC79730VQw.INNER3, bounds, fArr, LJFF);
                    LJIILJJIL(EnumC79730VQw.OUTER3, bounds, fArr, LJFF);
                }
                if (z2) {
                    LJIILJJIL(EnumC79730VQw.INNER2, bounds, fArr, LJFF);
                    LJIILJJIL(EnumC79730VQw.OUTER2, bounds, fArr, LJFF);
                }
            }
        }
        Path path = this.LJIIIZ;
        if (path == null) {
            this.LJIIIZ = new Path();
        } else {
            path.reset();
        }
        this.LJIIIZ.addRoundRect(new RectF(bounds), C79712VQe.LIZIZ(fArr, LJFF, -0.5f), Path.Direction.CW);
        C79712VQe c79712VQe = this.LJI;
        RectF rectF = c79712VQe.LIZ;
        RectF rectF2 = this.LJII.LIZ;
        float[] fArr2 = c79712VQe.LIZIZ;
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new PointF();
        }
        PointF pointF = this.LJIIJJI;
        RectF rectF3 = this.LJI.LIZ;
        pointF.x = rectF3.left;
        pointF.y = rectF3.top;
        double d = rectF.left;
        double d2 = rectF.top;
        LJI(d, d2, (fArr2[0] * 2.0f) + r2, (fArr2[1] * 2.0f) + r1, rectF2.left, rectF2.top, d, d2, pointF);
        if (this.LJIILJJIL == null) {
            this.LJIILJJIL = new PointF();
        }
        PointF pointF2 = this.LJIILJJIL;
        float f = rectF.left;
        pointF2.x = f;
        float f2 = rectF.bottom;
        pointF2.y = f2;
        double d3 = f;
        double d4 = f2;
        LJI(d3, f2 - (fArr2[6] * 2.0f), (fArr2[7] * 2.0f) + f, d4, rectF2.left, rectF2.bottom, d3, d4, pointF2);
        if (this.LJIIL == null) {
            this.LJIIL = new PointF();
        }
        PointF pointF3 = this.LJIIL;
        float f3 = rectF.right;
        pointF3.x = f3;
        float f4 = rectF.top;
        pointF3.y = f4;
        double d5 = f4;
        double d6 = f3;
        LJI(f3 - (fArr2[2] * 2.0f), d5, d6, (fArr2[3] * 2.0f) + f4, rectF2.right, rectF2.top, d6, d5, pointF3);
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new PointF();
        }
        PointF pointF4 = this.LJIILIIL;
        float f5 = rectF.right;
        pointF4.x = f5;
        float f6 = rectF.bottom;
        pointF4.y = f6;
        double d7 = f5;
        double d8 = f6;
        LJI(f5 - (fArr2[4] * 2.0f), f6 - (fArr2[5] * 2.0f), d7, d8, rectF2.right, rectF2.bottom, d7, d8, pointF4);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int LIZ = C79660VOe.LIZ(this.LJIJI, this.LJIJJ) >>> 24;
        if (LIZ == 255) {
            return -1;
        }
        if (LIZ == 0) {
            return -2;
        }
        return -3;
    }

    public final void LJIILL() {
        Rect bounds = getBounds();
        this.LJIILL.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        RectF LJFF = LJFF();
        Rect rect = this.LJIILL;
        int i = (int) (rect.left + LJFF.left);
        rect.left = i;
        int i2 = (int) (rect.top + LJFF.top);
        rect.top = i2;
        int i3 = (int) (rect.right - LJFF.right);
        rect.right = i3;
        int i4 = (int) (rect.bottom - LJFF.bottom);
        rect.bottom = i4;
        this.LJIILLIIL.set(i, i2, i3, i4);
        VQ9 vq9 = this.LIZIZ;
        if (vq9 != null) {
            this.LJIILLIIL.left = (int) (vq9.LIZ(0) + r2.left);
            this.LJIILLIIL.top = (int) (this.LIZIZ.LIZ(1) + r3.top);
            this.LJIILLIIL.right = (int) (r3.right - this.LIZIZ.LIZ(2));
            this.LJIILLIIL.bottom = (int) (r3.bottom - this.LIZIZ.LIZ(3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJIJJ;
    }

    public static int LIZ(float f) {
        if (f > 0.1f && f < 1.0f) {
            return 1;
        }
        return Math.round(f);
    }

    public static boolean LJIIIZ(EnumC79725VQr enumC79725VQr) {
        if (enumC79725VQr == EnumC79725VQr.DASHED || enumC79725VQr == EnumC79725VQr.DOTTED || enumC79725VQr == EnumC79725VQr.HIDDEN) {
            return true;
        }
        return false;
    }

    public final int LIZJ(int i) {
        float f;
        float f2;
        VQ9 vq9 = this.LIZJ;
        if (vq9 != null) {
            f = vq9.LIZ(i);
        } else {
            f = 0.0f;
        }
        VQ9 vq92 = this.LIZLLL;
        if (vq92 != null) {
            f2 = vq92.LIZ(i);
        } else {
            f2 = 255.0f;
        }
        return ((((int) f2) << 24) & (-16777216)) | (((int) f) & 16777215);
    }

    public final EnumC79725VQr LIZLLL(int i) {
        EnumC79725VQr[] enumC79725VQrArr;
        if (i > 8 || i < 0 || (enumC79725VQrArr = this.LJ) == null) {
            return null;
        }
        EnumC79725VQr enumC79725VQr = enumC79725VQrArr[i];
        if (enumC79725VQr != null) {
            return enumC79725VQr;
        }
        return enumC79725VQrArr[8];
    }

    public final EnumC79725VQr LJ(int i) {
        EnumC79725VQr[] enumC79725VQrArr = this.LJ;
        if (enumC79725VQrArr != null) {
            EnumC79725VQr enumC79725VQr = enumC79725VQrArr[i];
            if (enumC79725VQr != null) {
                return enumC79725VQr;
            }
            EnumC79725VQr enumC79725VQr2 = enumC79725VQrArr[8];
            if (enumC79725VQr2 != null) {
                return enumC79725VQr2;
            }
        }
        if (this.LJJ.LJ().LJIILIIL) {
            return EnumC79725VQr.NONE;
        }
        return EnumC79725VQr.SOLID;
    }

    public final C79712VQe LJIIIIZZ(EnumC79730VQw enumC79730VQw) {
        Map<EnumC79730VQw, C79712VQe> map = this.LJIIIIZZ;
        if (map == null) {
            return null;
        }
        return (C79712VQe) ((HashMap) map).get(enumC79730VQw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0736, code lost:
    
        if (r21 > r15) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x06ff, code lost:
    
        if (r21 < r15) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0701, code lost:
    
        r2 = r14 * r15;
        r21 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x063a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0715  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r61) {
        /*
            Method dump skipped, instructions count: 2505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Path path;
        if (this.LJIL != null && LJIIZILJ() && (path = this.LJIIIZ) != null) {
            outline.setConvexPath(path);
        } else {
            outline.setRect(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LJIIZILJ = true;
        Iterator it = ((ArrayList) this.LJIJJLI.LJLIL).iterator();
        while (it.hasNext()) {
            ((VR1) it.next()).LJFF(rect.width(), rect.height());
        }
        LJIILL();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.LJIJJ) {
            this.LJIJJ = i;
            invalidateSelf();
        }
    }

    public void setColor(int i) {
        this.LJIJI = i;
        invalidateSelf();
    }

    public BackgroundDrawable(VNU vnu, float f) {
        this.LJIJJLI = null;
        this.LJJ = vnu;
        this.LJIJJLI = new VQ5(vnu, this);
        if (vnu.LJ().LJIILIIL) {
            this.LIZ = new VQ9(EnumC122894s1.MEIDIUM.getValue());
        } else {
            this.LIZ = new VQ9();
        }
    }

    public final void LJIIJ(float f, int i) {
        if (!VJJ.LIZ(this.LIZIZ.LIZ[i], f)) {
            this.LIZIZ.LIZIZ(f, i);
            this.LJIIZILJ = true;
            LJIILL();
            invalidateSelf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r4 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(X.EnumC79730VQw r11, android.graphics.Rect r12, float[] r13, android.graphics.RectF r14) {
        /*
            r10 = this;
            r3 = 4
            java.util.Map<X.VQw, X.VQe> r0 = r10.LJIIIIZZ     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L22
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L4f
            java.lang.Object r4 = r0.get(r11)     // Catch: java.lang.Exception -> L4f
            X.VQe r4 = (X.C79712VQe) r4     // Catch: java.lang.Exception -> L4f
            if (r4 != 0) goto L1b
        Lf:
            X.VQe r4 = new X.VQe     // Catch: java.lang.Exception -> L4f
            r4.<init>()     // Catch: java.lang.Exception -> L4f
            java.util.Map<X.VQw, X.VQe> r0 = r10.LJIIIIZZ     // Catch: java.lang.Exception -> L4f
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L4f
            r0.put(r11, r4)     // Catch: java.lang.Exception -> L4f
        L1b:
            int r1 = r11.ordinal()     // Catch: java.lang.Exception -> L4f
            if (r1 == 0) goto L45
            goto L2a
        L22:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Exception -> L4f
            r0.<init>()     // Catch: java.lang.Exception -> L4f
            r10.LJIIIIZZ = r0     // Catch: java.lang.Exception -> L4f
            goto Lf
        L2a:
            r0 = 1
            if (r1 == r0) goto L42
            r0 = 2
            if (r1 == r0) goto L3f
            r0 = 3
            if (r1 == r0) goto L3b
            if (r1 == r3) goto L37
            r8 = 0
            goto L47
        L37:
            r8 = 1042983595(0x3e2aaaab, float:0.16666667)
            goto L47
        L3b:
            r8 = 1062557013(0x3f555555, float:0.8333333)
            goto L47
        L3f:
            r8 = 1048576000(0x3e800000, float:0.25)
            goto L47
        L42:
            r8 = 1061158912(0x3f400000, float:0.75)
            goto L47
        L45:
            r8 = 1056964608(0x3f000000, float:0.5)
        L47:
            r9 = 1
            r6 = r13
            r7 = r14
            r5 = r12
            r4.LIZJ(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L4f
            goto L69
        L4f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "updateCachePath exception:"
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "BackgroundDrawable"
            com.lynx.tasm.base.LLog.LIZLLL(r3, r0, r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.LJIILJJIL(X.VQw, android.graphics.Rect, float[], android.graphics.RectF):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r17 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r17 != 2) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(float r15, float r16, int r17, int r18, android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.utils.BackgroundDrawable.LJIIJJI(float, float, int, int, android.graphics.Canvas):void");
    }

    public final void LJIIL(Canvas canvas, int i, float f, int i2, int i3, boolean z) {
        int i4;
        EnumC79730VQw enumC79730VQw;
        EnumC79730VQw enumC79730VQw2;
        this.LJIJ.setPathEffect(null);
        this.LJIJ.setStyle(Paint.Style.STROKE);
        this.LJIJ.setStrokeWidth(f);
        boolean z2 = true;
        if (i != 1 && i != 0) {
            z2 = false;
        }
        Paint paint = this.LJIJ;
        if (z2) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        paint.setColor(C79660VOe.LIZ(i4, this.LJIJJ));
        if (z) {
            enumC79730VQw = EnumC79730VQw.OUTER3;
        } else {
            enumC79730VQw = EnumC79730VQw.OUTER2;
        }
        C79712VQe LJIIIIZZ = LJIIIIZZ(enumC79730VQw);
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZ(canvas, this.LJIJ);
        }
        Paint paint2 = this.LJIJ;
        if (!z2) {
            i2 = i3;
        }
        paint2.setColor(C79660VOe.LIZ(i2, this.LJIJJ));
        if (z) {
            enumC79730VQw2 = EnumC79730VQw.INNER3;
        } else {
            enumC79730VQw2 = EnumC79730VQw.INNER2;
        }
        C79712VQe LJIIIIZZ2 = LJIIIIZZ(enumC79730VQw2);
        if (LJIIIIZZ2 != null) {
            LJIIIIZZ2.LIZ(canvas, this.LJIJ);
        }
    }

    public static void LJI(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double LIZ = C207798Dn.LIZ(d16, d13, d13, d15);
        double d17 = 2.0d * abs * abs * d14 * d13;
        double d18 = (-(d16 * ((d14 * d14) - d15))) / LIZ;
        double d19 = LIZ * 2.0d;
        double sqrt = ((-d17) / d19) - Math.sqrt(Math.pow(d17 / d19, 2.0d) + d18);
        double d20 = (d13 * sqrt) + d14;
        double d21 = sqrt + d9;
        double d22 = d20 + d10;
        if (!Double.isNaN(d21) && !Double.isNaN(d22)) {
            pointF.x = (float) d21;
            pointF.y = (float) d22;
        }
    }

    public final void LIZIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        if (z) {
            C79712VQe c79712VQe = this.LJII;
            if (c79712VQe != null) {
                canvas.clipPath(c79712VQe.LIZJ, Region.Op.INTERSECT);
            }
            C79712VQe c79712VQe2 = this.LJI;
            if (c79712VQe2 != null) {
                canvas.clipPath(c79712VQe2.LIZJ, Region.Op.DIFFERENCE);
            }
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new Path();
        }
        this.LJIIJ.reset();
        this.LJIIJ.moveTo(f, f2);
        this.LJIIJ.lineTo(f3, f4);
        this.LJIIJ.lineTo(f5, f6);
        this.LJIIJ.lineTo(f7, f8);
        this.LJIIJ.lineTo(f, f2);
        canvas.clipPath(this.LJIIJ);
    }
}
