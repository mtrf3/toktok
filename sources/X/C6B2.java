package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Vibrator;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.nows.ui.NowsEditActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6B2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B2 extends FrameLayout implements AnonymousClass671 {
    public RectF LJLIL;
    public final int LJLILLLLZI;
    public final Paint LJLJI;
    public final DashPathEffect LJLJJI;
    public final int LJLJJL;
    public int LJLJJLL;
    public RectF LJLJL;
    public final Vibrator LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public float LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public final int LJLLLL;
    public C6B3 LJLLLLLL;
    public int LJLZ;
    public long LJZ;
    public boolean LJZI;

    @Override // X.AnonymousClass671
    public final void LJIIJJI() {
        LJIILLIIL(false);
        LJIJJ(false);
        LJIILIIL(false);
        LJIJ(false);
        LJIILL(false);
        LJIL(false);
        LJIILJJIL(false);
        LJIJJLI(false);
        LJIIZILJ(false);
        LJIJI(false);
        C6B3 c6b3 = this.LJLLLLLL;
        if (c6b3 != null && this.LJZI) {
            c6b3.LIZJ(false);
            this.LJLLLLLL.LIZ(false);
            this.LJLLLLLL.LIZIZ(false);
        }
    }

    @Override // X.AnonymousClass671
    public View getContentView() {
        return this;
    }

    @Override // X.AnonymousClass671
    public final void LIZ() {
        int i = this.LJLLL & (-49);
        this.LJLLL = i;
        this.LJLLJ = i & this.LJLLJ;
        invalidate();
    }

    public static int getTbMargin() {
        return (int) KL2.LIZJ(C5L7.LIZ(), 201.0f);
    }

    public final void LJJ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJZ > 200) {
            this.LJZ = currentTimeMillis;
            Vibrator vibrator = this.LJLJLJ;
            if (vibrator != null) {
                try {
                    vibrator.vibrate(30L);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public float getLeftViewXMargin() {
        if (C173636rf.LIZIZ(getContext())) {
            return this.LJLILLLLZI;
        }
        return KL2.LIZJ(getContext(), 32.0f);
    }

    public float getRightViewXMargin() {
        if (C173636rf.LIZIZ(getContext())) {
            return C81184Vtc.LJ(getContext()) - KL2.LIZJ(getContext(), 32.0f);
        }
        return C81184Vtc.LJ(getContext()) - this.LJLILLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int LIZJ;
        super.onAttachedToWindow();
        LJIIJJI();
        Context context = getContext();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C81184Vtc.LJ(getContext()), LJIIL(getContext()));
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        if (this.LJLIL != null) {
            return;
        }
        float leftViewXMargin = getLeftViewXMargin();
        if (context instanceof NowsEditActivity) {
            LIZJ = 0;
        } else {
            LIZJ = (int) KL2.LIZJ(context, 88.0f);
        }
        this.LJLIL = new RectF(leftViewXMargin, LIZJ, getRightViewXMargin(), LJIIL(context) - this.LJLJJL);
    }

    public int getDeltaX() {
        return this.LJLJJLL;
    }

    public boolean getEnableFakeFeedView() {
        return this.LJZI;
    }

    public C6B2(Context context) {
        super(context, null);
        Paint paint = new Paint();
        this.LJLJI = paint;
        this.LJLJL = new RectF();
        this.LJLJLLL = 1.0f;
        this.LJLL = 1.0f;
        this.LJLLI = 1.0f;
        this.LJLLILLLL = 1.0f;
        this.LJLLJ = 0;
        this.LJLLL = -1;
        this.LJLLLL = 0;
        this.LJLZ = 100;
        this.LJZ = 0L;
        this.LJZI = true;
        int LIZJ = (int) KL2.LIZJ(context, 1.5f);
        this.LJLILLLLZI = (int) KL2.LIZJ(context, 56.0f);
        this.LJLLLL = (int) KL2.LIZJ(context, 32.0f);
        Integer LJI = C79045V0n.LJI(R.attr.eg, context);
        if (LJI != null) {
            paint.setColor(LJI.intValue());
        }
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(LIZJ);
        paint.setShadowLayer(10.0f, 0.0f, 0.0f, -7829368);
        setWillNotDraw(false);
        this.LJLJJL = (int) KL2.LIZJ(context, 201.0f);
        this.LJLJJI = new DashPathEffect(new float[]{KL2.LIZJ(context, 2.0f), KL2.LIZJ(context, 1.0f)}, 0.0f);
        this.LJLJLJ = (Vibrator) C16880lQ.LLILL(context, "vibrator");
    }

    public static int LJIIL(Context context) {
        int i;
        if (context instanceof NowsEditActivity) {
            return (int) (C81184Vtc.LJ(context) / 0.75f);
        }
        C6FB c6fb = AnonymousClass699.LIZJ;
        if (c6fb != null) {
            i = c6fb.LIZ();
        } else {
            i = 0;
        }
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ.LJFF();
        }
        return C81184Vtc.LIZIZ(context) - i;
    }

    private void setLinePaintShadowRadius(float f) {
        this.LJLJI.setShadowLayer(f * 10.0f, 0.0f, 0.0f, -7829368);
    }

    @Override // X.AnonymousClass671
    public final PointF LIZJ(PointF[] pointFArr) {
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        LJIILJJIL.offset(this.LJLJJLL, 0.0f);
        PointF pointF = new PointF();
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        float f = LJIILJJIL.right;
        RectF rectF = this.LJLIL;
        float f2 = rectF.right;
        if (f - f2 > 0.0f) {
            pointF.x = f2 - f;
        }
        float f3 = LJIILJJIL.left;
        float f4 = rectF.left;
        if (f3 - f4 < 0.0f) {
            pointF.x = f4 - f3;
        }
        float f5 = LJIILJJIL.bottom;
        float f6 = rectF.bottom;
        if (f5 - f6 > 0.0f) {
            pointF.y = f6 - f5;
        }
        return pointF;
    }

    @Override // X.AnonymousClass671
    public final RectF LJ(RectF rectF) {
        float f;
        this.LJLZ--;
        float LIZJ = KL2.LIZJ(getContext(), 5.0f);
        float f2 = rectF.left;
        RectF rectF2 = this.LJLIL;
        float f3 = rectF2.left;
        float f4 = 0.0f;
        if (f2 < f3) {
            f = (f3 - f2) + LIZJ;
        } else {
            float f5 = rectF.right;
            float f6 = rectF2.right;
            if (f5 > f6) {
                f = (f6 - f5) - LIZJ;
            } else {
                f = 0.0f;
            }
        }
        float f7 = rectF.top;
        float f8 = rectF2.top;
        if (f7 < f8) {
            f4 = (f8 - f7) + LIZJ;
        } else {
            float f9 = rectF.bottom;
            float f10 = rectF2.bottom;
            if (f9 > f10) {
                f4 = (f10 - f9) - LIZJ;
            }
        }
        RectF rectF3 = new RectF(rectF);
        rectF3.offset(f, f4);
        if (this.LJLIL.contains(rectF3) || this.LJLZ < 0) {
            this.LJLZ = 100;
            return rectF3;
        }
        RectF rectF4 = new RectF(rectF3);
        float centerX = rectF4.centerX();
        float centerY = rectF4.centerY();
        rectF4.left *= 0.9f;
        rectF4.right *= 0.9f;
        rectF4.top *= 0.9f;
        rectF4.bottom *= 0.9f;
        rectF4.offsetTo(centerX - (rectF4.width() / 2.0f), centerY - (rectF4.height() / 2.0f));
        return LJ(rectF4);
    }

    @Override // X.AnonymousClass671
    public final float LJIIJ(float f) {
        if (Math.abs(f - 0.0f) < 0.01f) {
            return 0.0f;
        }
        if (Math.abs(Math.abs(f) - 90.0f) < 0.01f) {
            return 90.0f;
        }
        if (Math.abs(f - 45.0f) < 0.01f) {
            return 45.0f;
        }
        if (Math.abs(f - (-45.0f)) < 0.01f) {
            return -45.0f;
        }
        return f;
    }

    public final void LJIILIIL(boolean z) {
        if (z) {
            this.LJLLJ |= 64;
        } else {
            this.LJLLJ &= -65;
        }
        invalidate();
    }

    public final void LJIILJJIL(boolean z) {
        if (z) {
            if ((this.LJLLJ & 8) != 8) {
                LJJ();
            }
            this.LJLLJ |= 8;
        } else {
            this.LJLLJ &= -9;
        }
        postInvalidate();
    }

    public final void LJIILL(boolean z) {
        if (z) {
            if ((this.LJLLJ & 32) != 32) {
                LJJ();
            }
            this.LJLLJ |= 32;
        } else {
            this.LJLLJ &= -33;
        }
        postInvalidate();
    }

    public final void LJIILLIIL(boolean z) {
        if (z) {
            this.LJLLJ |= 256;
        } else {
            this.LJLLJ &= -257;
        }
        invalidate();
    }

    public final void LJIIZILJ(boolean z) {
        if (z) {
            if ((this.LJLLJ & 2) != 2) {
                LJJ();
            }
            this.LJLLJ |= 2;
        } else {
            this.LJLLJ &= -3;
        }
        postInvalidate();
    }

    public final void LJIJ(boolean z) {
        if (z) {
            this.LJLLJ |= 128;
        } else {
            this.LJLLJ &= -129;
        }
        invalidate();
    }

    public final void LJIJI(boolean z) {
        if (z) {
            if ((this.LJLLJ & 1) != 1) {
                LJJ();
            }
            this.LJLLJ |= 1;
        } else {
            this.LJLLJ &= -2;
        }
        postInvalidate();
    }

    public final void LJIJJ(boolean z) {
        if (z) {
            this.LJLLJ |= 512;
        } else {
            this.LJLLJ &= -513;
        }
        invalidate();
    }

    public final void LJIJJLI(boolean z) {
        if (z) {
            if ((this.LJLLJ & 4) != 4) {
                LJJ();
            }
            this.LJLLJ |= 4;
        } else {
            this.LJLLJ &= -5;
        }
        postInvalidate();
    }

    public final void LJIL(boolean z) {
        if (z) {
            if ((this.LJLLJ & 16) != 16) {
                LJJ();
            }
            this.LJLLJ |= 16;
        } else {
            this.LJLLJ &= -17;
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        RectF rectF;
        RectF rectF2;
        super.onDraw(canvas);
        this.LJLJI.setPathEffect(null);
        this.LJLJI.setAlpha(255);
        setLinePaintShadowRadius(1.0f);
        if ((this.LJLLJ & 512) == 512) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LJLJI.setAlpha((int) (this.LJLJLLL * 255.0f));
            float f = this.LJLJLLL;
            if (f > 0.5d) {
                setLinePaintShadowRadius(f);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            RectF rectF3 = this.LJLIL;
            if (rectF3 != null) {
                canvas.drawLine(0.0f, rectF3.top, getWidth(), this.LJLIL.top, this.LJLJI);
            }
        }
        if ((this.LJLLJ & 256) == 256) {
            this.LJLJI.setAlpha((int) (this.LJLL * 255.0f));
            float f2 = this.LJLL;
            if (f2 > 0.5d) {
                setLinePaintShadowRadius(f2);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            float f3 = this.LJLIL.left;
            canvas.drawLine(f3, 0.0f, f3, getHeight(), this.LJLJI);
        }
        if ((this.LJLLJ & 128) == 128) {
            this.LJLJI.setAlpha((int) (this.LJLLI * 255.0f));
            float f4 = this.LJLLI;
            if (f4 > 0.5d) {
                setLinePaintShadowRadius(f4);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            float f5 = this.LJLIL.right;
            canvas.drawLine(f5, 0.0f, f5, getHeight(), this.LJLJI);
        }
        if ((this.LJLLJ & 64) == 64) {
            this.LJLJI.setAlpha((int) (this.LJLLILLLL * 255.0f));
            float f6 = this.LJLLILLLL;
            if (f6 > 0.5d) {
                setLinePaintShadowRadius(f6);
            } else {
                setLinePaintShadowRadius(0.0f);
            }
            canvas.drawLine(0.0f, this.LJLIL.bottom, getWidth(), this.LJLIL.bottom, this.LJLJI);
        }
        this.LJLJI.setAlpha(255);
        if ((this.LJLLJ & 32) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            canvas.drawLine(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, this.LJLJI);
        }
        if ((this.LJLLJ & 16) == 16) {
            canvas.drawLine(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, getHeight(), this.LJLJI);
        }
        this.LJLJI.setPathEffect(this.LJLJJI);
        if ((this.LJLLJ & 8) == 8 && (rectF2 = this.LJLJL) != null) {
            canvas.drawLine(0.0f, rectF2.centerY(), getWidth(), this.LJLJL.centerY(), this.LJLJI);
        }
        if ((this.LJLLJ & 4) == 4 && (rectF = this.LJLJL) != null) {
            canvas.drawLine(rectF.centerX(), 0.0f, this.LJLJL.centerX(), getHeight(), this.LJLJI);
        }
        if ((this.LJLLJ & 2) == 2 && this.LJLJL != null) {
            canvas.drawLine(0.0f, getHeight() - (this.LJLJL.centerX() + (getHeight() - this.LJLJL.centerY())), (getHeight() - this.LJLJL.centerY()) + this.LJLJL.centerX(), getHeight(), this.LJLJI);
        }
        if ((this.LJLLJ & 1) == 1 && this.LJLJL != null) {
            canvas.drawLine(getWidth(), getHeight() - ((getHeight() - this.LJLJL.centerY()) + (getWidth() - this.LJLJL.centerX())), getWidth() - ((getHeight() - this.LJLJL.centerY()) + (getWidth() - this.LJLJL.centerX())), getHeight(), this.LJLJI);
        }
    }

    public void setDeltaX(int i) {
        this.LJLJJLL = i;
    }

    @Override // X.AnonymousClass671
    public void setEnableFakeFeedView(boolean z) {
        this.LJZI = z;
    }

    @Override // X.AnonymousClass671
    public final boolean LIZIZ(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        if (LJIILJJIL.isEmpty()) {
            return true;
        }
        LJIILJJIL.offset(this.LJLJJLL, 0.0f);
        if (this.LJLIL == null) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f, LJIILJJIL.centerX(), LJIILJJIL.centerY());
        matrix.mapRect(LJIILJJIL);
        return this.LJLIL.contains(LJIILJJIL);
    }

    @Override // X.AnonymousClass671
    public final int LJI(PointF[] pointFArr, boolean z) {
        return LJFF(pointFArr, z, false, false, false, false);
    }

    @Override // X.AnonymousClass671
    public final boolean LJIIIIZZ(PointF[] pointFArr, float f) {
        if (pointFArr == null) {
            return true;
        }
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        if (LJIILJJIL.isEmpty()) {
            return true;
        }
        LJIILJJIL.offset(this.LJLJJLL, 0.0f);
        if (this.LJLIL == null || f < 1.0f) {
            return true;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f, LJIILJJIL.centerX(), LJIILJJIL.centerY());
        matrix.mapRect(LJIILJJIL);
        return this.LJLIL.contains(LJIILJJIL);
    }

    @Override // X.AnonymousClass671
    public final PointF LIZLLL(PointF[] pointFArr, float f, float f2) {
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        LJIILJJIL.offset(this.LJLJJLL, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        if (Math.abs(((Math.abs(LJIILJJIL.bottom - LJIILJJIL.top) / 2.0f) + LJIILJJIL.top) - (getHeight() / 2.0f)) < 1.0f) {
            float f3 = LJIILJJIL.bottom;
            float f4 = LJIILJJIL.top;
            pointF.y = (getHeight() / 2.0f) - (((f3 - f4) / 2.0f) + f4);
        }
        if (Math.abs(((Math.abs(LJIILJJIL.right - LJIILJJIL.left) / 2.0f) + LJIILJJIL.left) - (getWidth() / 2.0f)) < 1.0f) {
            float f5 = LJIILJJIL.right;
            float f6 = LJIILJJIL.left;
            pointF.x = (getWidth() / 2.0f) - (((f5 - f6) / 2.0f) + f6);
        }
        return pointF;
    }

    @Override // X.AnonymousClass671
    public final boolean LJII(PointF[] pointFArr, float f, float f2) {
        if (pointFArr == null) {
            return true;
        }
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        if (LJIILJJIL.isEmpty()) {
            return true;
        }
        LJIILJJIL.offset(this.LJLJJLL + f, f2);
        RectF rectF = this.LJLIL;
        if (rectF == null) {
            return true;
        }
        return rectF.contains(LJIILJJIL);
    }

    @Override // X.AnonymousClass671
    public final void LJIIIZ(float f, float f2, float f3) {
        if (f == Float.MIN_VALUE) {
            f = -getHeight();
        }
        if (f2 == Float.MIN_VALUE) {
            f2 = getRightViewXMargin();
        }
        if (f3 == Float.MIN_VALUE) {
            f3 = LJIIL(getContext()) - this.LJLJJL;
        }
        this.LJLIL = new RectF(0.0f, f, f2, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b2, code lost:
    
        if (java.lang.Math.abs(r5 - r1) >= (r12.LJLLLL + 2)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012d, code lost:
    
        if (java.lang.Math.abs(r5 - r1) >= (r12.LJLLLL + 2)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02b6, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    @Override // X.AnonymousClass671
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(android.graphics.PointF[] r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6B2.LJFF(android.graphics.PointF[], boolean, boolean, boolean, boolean, boolean):int");
    }
}
