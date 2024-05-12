package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1N9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1N9 implements C0V0 {
    public final C34361Wm LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final C0XR LIZLLL;
    public final CharSequence LJ;
    public final List<C10390ax> LJFF;
    public final C5H3 LJI;

    @Override // X.C0V0
    public final float LIZJ() {
        return this.LIZLLL.LIZIZ(0);
    }

    @Override // X.C0V0
    public final float LJFF() {
        return this.LIZLLL.LIZIZ(r1.LJ - 1);
    }

    @Override // X.C0V0
    public final float getHeight() {
        return this.LIZLLL.LIZ();
    }

    @Override // X.C0V0
    public final float getWidth() {
        return C23360vs.LJII(this.LIZJ);
    }

    @Override // X.C0V0
    public final List<C10390ax> LJIJJ() {
        return this.LJFF;
    }

    @Override // X.C0V0
    public final EnumC22040tk LIZ(int i) {
        if (this.LIZLLL.LIZLLL.getParagraphDirection(this.LIZLLL.LIZLLL(i)) == 1) {
            return EnumC22040tk.Ltr;
        }
        return EnumC22040tk.Rtl;
    }

    @Override // X.C0V0
    public final float LIZIZ(int i) {
        return this.LIZLLL.LJ(i);
    }

    @Override // X.C0V0
    public final int LIZLLL(int i) {
        return this.LIZLLL.LIZLLL.getLineStart(i);
    }

    @Override // X.C0V0
    public final C10390ax LJ(int i) {
        if (i >= 0 && i <= this.LJ.length()) {
            float LJFF = this.LIZLLL.LJFF(i, false);
            int LIZLLL = this.LIZLLL.LIZLLL(i);
            return new C10390ax(LJFF, this.LIZLLL.LJ(LIZLLL), LJFF, this.LIZLLL.LIZJ(LIZLLL));
        }
        StringBuilder LJ = C7MY.LJ("offset(", i, ") is out of bounds (0,");
        LJ.append(this.LJ.length());
        throw new AssertionError(X1D.LIZIZ(LJ));
    }

    @Override // X.C0V0
    public final int LJI(int i) {
        return this.LIZLLL.LIZLLL(i);
    }

    @Override // X.C0V0
    public final C10390ax LJII(int i) {
        boolean z;
        float LJI;
        float LJI2;
        C0XR c0xr = this.LIZLLL;
        int LIZLLL = c0xr.LIZLLL(i);
        float LJ = c0xr.LJ(LIZLLL);
        float LIZJ = c0xr.LIZJ(LIZLLL);
        if (c0xr.LIZLLL.getParagraphDirection(LIZLLL) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = c0xr.LIZLLL.isRtlCharAt(i);
        if (z) {
            if (!isRtlCharAt) {
                LJI = c0xr.LJFF(i, false);
                LJI2 = c0xr.LJFF(i + 1, true);
            } else {
                LJI2 = c0xr.LJI(i, false);
                LJI = c0xr.LJI(i + 1, true);
            }
        } else if (isRtlCharAt) {
            LJI2 = c0xr.LJFF(i, false);
            LJI = c0xr.LJFF(i + 1, true);
        } else {
            LJI = c0xr.LJI(i, false);
            LJI2 = c0xr.LJI(i + 1, true);
        }
        RectF rectF = new RectF(LJI, LJ, LJI2, LIZJ);
        return new C10390ax(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r0 != (-1)) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // X.C0V0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIZ(int r6) {
        /*
            r5 = this;
            X.5H3 r0 = r5.LJI
            java.lang.Object r3 = r0.getValue()
            X.0ZK r3 = (X.C0ZK) r3
            X.0ZM r0 = r3.LIZ
            r0.LIZ(r6)
            java.text.BreakIterator r0 = r0.LIZLLL
            int r1 = r0.preceding(r6)
            X.0ZM r0 = r3.LIZ
            boolean r0 = r0.LJ(r1)
            r2 = -1
            if (r0 == 0) goto Laf
            X.0ZM r3 = r3.LIZ
            r3.LIZ(r6)
            r0 = r6
        L22:
            if (r0 == r2) goto L32
            boolean r1 = r3.LJ(r0)
            if (r1 == 0) goto La4
            boolean r1 = r3.LIZJ(r0)
            if (r1 != 0) goto La4
        L30:
            if (r0 != r2) goto L33
        L32:
            r0 = r6
        L33:
            X.5H3 r1 = r5.LJI
            java.lang.Object r4 = r1.getValue()
            X.0ZK r4 = (X.C0ZK) r4
            X.0ZM r1 = r4.LIZ
            r1.LIZ(r6)
            java.text.BreakIterator r1 = r1.LIZLLL
            int r3 = r1.following(r6)
            X.0ZM r1 = r4.LIZ
            boolean r1 = r1.LIZJ(r3)
            if (r1 == 0) goto L75
            X.0ZM r4 = r4.LIZ
            r4.LIZ(r6)
            r1 = r6
        L54:
            if (r1 == r2) goto L64
            boolean r3 = r4.LJ(r1)
            if (r3 != 0) goto L6b
            boolean r3 = r4.LIZJ(r1)
            if (r3 == 0) goto L6b
        L62:
            if (r1 != r2) goto L69
        L64:
            long r0 = X.C17N.LIZLLL(r0, r6)
            return r0
        L69:
            r6 = r1
            goto L64
        L6b:
            r4.LIZ(r1)
            java.text.BreakIterator r3 = r4.LIZLLL
            int r1 = r3.following(r1)
            goto L54
        L75:
            X.0ZM r3 = r4.LIZ
            r3.LIZ(r6)
            boolean r1 = r3.LIZIZ(r6)
            if (r1 == 0) goto L97
            java.text.BreakIterator r1 = r3.LIZLLL
            boolean r1 = r1.isBoundary(r6)
            if (r1 == 0) goto L8e
            boolean r1 = r3.LIZLLL(r6)
            if (r1 == 0) goto L95
        L8e:
            java.text.BreakIterator r1 = r3.LIZLLL
            int r1 = r1.following(r6)
            goto L62
        L95:
            r1 = r6
            goto L62
        L97:
            boolean r1 = r3.LIZLLL(r6)
            if (r1 == 0) goto L64
            java.text.BreakIterator r1 = r3.LIZLLL
            int r1 = r1.following(r6)
            goto L62
        La4:
            r3.LIZ(r0)
            java.text.BreakIterator r1 = r3.LIZLLL
            int r0 = r1.preceding(r0)
            goto L22
        Laf:
            X.0ZM r1 = r3.LIZ
            r1.LIZ(r6)
            boolean r0 = r1.LIZLLL(r6)
            if (r0 == 0) goto Ld3
            java.text.BreakIterator r0 = r1.LIZLLL
            boolean r0 = r0.isBoundary(r6)
            if (r0 == 0) goto Lc8
            boolean r0 = r1.LIZIZ(r6)
            if (r0 == 0) goto Ld0
        Lc8:
            java.text.BreakIterator r0 = r1.LIZLLL
            int r0 = r0.preceding(r6)
            goto L30
        Ld0:
            r0 = r6
            goto L30
        Ld3:
            boolean r0 = r1.LIZIZ(r6)
            if (r0 == 0) goto L32
            java.text.BreakIterator r0 = r1.LIZLLL
            int r0 = r0.preceding(r6)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1N9.LJIIIZ(int):long");
    }

    @Override // X.C0V0
    public final int LJIIJ(long j) {
        float f;
        C0XR c0xr = this.LIZLLL;
        int lineForVertical = c0xr.LIZLLL.getLineForVertical(c0xr.LJFF + ((int) C10370av.LJ(j)));
        C0XR c0xr2 = this.LIZLLL;
        float LIZLLL = C10370av.LIZLLL(j);
        Layout layout = c0xr2.LIZLLL;
        float f2 = -1;
        if (lineForVertical == c0xr2.LJ - 1) {
            f = c0xr2.LJII + c0xr2.LJIIIIZZ;
        } else {
            f = 0.0f;
        }
        return C16880lQ.LLLLLLL(layout, lineForVertical, (f * f2) + LIZLLL);
    }

    @Override // X.C0V0
    public final int LJIIL(float f) {
        C0XR c0xr = this.LIZLLL;
        return c0xr.LIZLLL.getLineForVertical(c0xr.LJFF + ((int) f));
    }

    @Override // X.C0V0
    public final float LJIILIIL(int i) {
        float f;
        C0XR c0xr = this.LIZLLL;
        float lineLeft = c0xr.LIZLLL.getLineLeft(i);
        if (i == c0xr.LJ - 1) {
            f = c0xr.LJII;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    @Override // X.C0V0
    public final float LJIILL(int i) {
        return this.LIZLLL.LIZJ(i);
    }

    @Override // X.C0V0
    public final float LJIILLIIL(int i) {
        float f;
        C0XR c0xr = this.LIZLLL;
        float lineRight = c0xr.LIZLLL.getLineRight(i);
        if (i == c0xr.LJ - 1) {
            f = c0xr.LJIIIIZZ;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    @Override // X.C0V0
    public final EnumC22040tk LJIJI(int i) {
        if (this.LIZLLL.LIZLLL.isRtlCharAt(i)) {
            return EnumC22040tk.Rtl;
        }
        return EnumC22040tk.Ltr;
    }

    public final void LJIL(InterfaceC11750d9 interfaceC11750d9) {
        Canvas canvas = ((C1QR) interfaceC11750d9).LIZ;
        if (this.LIZLLL.LIZJ) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        C0XR c0xr = this.LIZLLL;
        c0xr.getClass();
        o.LJIIIZ(canvas, "canvas");
        int i = c0xr.LJFF;
        if (i != 0) {
            canvas.translate(0.0f, i);
        }
        C0XQ c0xq = c0xr.LJIILIIL;
        c0xq.getClass();
        c0xq.LIZ = canvas;
        c0xr.LIZLLL.draw(c0xr.LJIILIIL);
        int i2 = c0xr.LJFF;
        if (i2 != 0) {
            canvas.translate(0.0f, (-1) * i2);
        }
        if (this.LIZLLL.LIZJ) {
            canvas.restore();
        }
    }

    @Override // X.C0V0
    public final int LJIIJJI(int i, boolean z) {
        if (z) {
            C0XR c0xr = this.LIZLLL;
            if (c0xr.LIZLLL.getEllipsisStart(i) == 0) {
                return c0xr.LIZLLL.getLineVisibleEnd(i);
            }
            return c0xr.LIZLLL.getEllipsisStart(i) + c0xr.LIZLLL.getLineStart(i);
        }
        C0XR c0xr2 = this.LIZLLL;
        if (c0xr2.LIZLLL.getEllipsisStart(i) == 0) {
            return c0xr2.LIZLLL.getLineEnd(i);
        }
        return c0xr2.LIZLLL.getText().length();
    }

    @Override // X.C0V0
    public final C1QX LJIIZILJ(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= this.LJ.length()) {
            Path path = new Path();
            C0XR c0xr = this.LIZLLL;
            c0xr.getClass();
            c0xr.LIZLLL.getSelectionPath(i, i2, path);
            if (c0xr.LJFF != 0 && !path.isEmpty()) {
                path.offset(0.0f, c0xr.LJFF);
            }
            return new C1QX(path);
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("Start(", i, ") or End(", i2, ") is out of Range(0..");
        LIZJ.append(this.LJ.length());
        LIZJ.append("), or start > end!");
        throw new AssertionError(X1D.LIZIZ(LIZJ));
    }

    @Override // X.C0V0
    public final float LJIJ(int i, boolean z) {
        if (z) {
            return this.LIZLLL.LJFF(i, false);
        }
        return this.LIZLLL.LJI(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0114 A[LOOP:1: B:76:0x0112->B:77:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<X.0ax>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1N9(X.C34361Wm r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1N9.<init>(X.1Wm, int, boolean, long):void");
    }

    @Override // X.C0V0
    public final void LJIIIIZZ(InterfaceC11750d9 interfaceC11750d9, long j, C11770dB c11770dB, C22080to c22080to) {
        C17650mf c17650mf = this.LIZ.LJFF;
        c17650mf.LIZIZ(j);
        c17650mf.LIZJ(c11770dB);
        c17650mf.LIZLLL(c22080to);
        LJIL(interfaceC11750d9);
    }

    @Override // X.C0V0
    public final void LJIILJJIL(InterfaceC11750d9 interfaceC11750d9, AbstractC11740d8 abstractC11740d8, float f, C11770dB c11770dB, C22080to c22080to, QZV qzv) {
        boolean z;
        Paint.Join join;
        Paint.Cap cap;
        C17650mf c17650mf = this.LIZ.LJFF;
        c17650mf.LIZ(abstractC11740d8, C1DF.LIZIZ(getWidth(), getHeight()), f);
        c17650mf.LIZJ(c11770dB);
        c17650mf.LIZLLL(c22080to);
        if (qzv != null && !o.LJ(c17650mf.LJ, qzv)) {
            c17650mf.LJ = qzv;
            if (o.LJ(qzv, C43031mV.LIZ)) {
                c17650mf.setStyle(Paint.Style.FILL);
            } else if (qzv instanceof C43041mW) {
                c17650mf.setStyle(Paint.Style.STROKE);
                C43041mW c43041mW = (C43041mW) qzv;
                c17650mf.setStrokeWidth(c43041mW.LIZ);
                c17650mf.setStrokeMiter(c43041mW.LIZIZ);
                int i = c43041mW.LIZLLL;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                c17650mf.setStrokeJoin(join);
                int i2 = c43041mW.LIZJ;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                c17650mf.setStrokeCap(cap);
                c17650mf.setPathEffect(null);
            }
        }
        LJIL(interfaceC11750d9);
    }

    public final C0XR LJIJJLI(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        C0V8 c0v8;
        CharSequence charSequence = this.LJ;
        float width = getWidth();
        C34361Wm c34361Wm = this.LIZ;
        C17650mf c17650mf = c34361Wm.LJFF;
        int i8 = c34361Wm.LJIIIZ;
        C0XI c0xi = c34361Wm.LJII;
        C08370Un c08370Un = c34361Wm.LIZ;
        o.LJIIIZ(c08370Un, "<this>");
        C0VB c0vb = c08370Un.LIZJ;
        if (c0vb != null && (c0v8 = c0vb.LIZIZ) != null) {
            z = c0v8.LIZ;
        } else {
            z = true;
        }
        return new C0XR(charSequence, width, c17650mf, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, c0xi);
    }
}
