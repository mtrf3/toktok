package X;

import Y.ARunnableS38S0100000_2;
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
import defpackage.a1;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Cc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156466Cc extends FrameLayout implements AnonymousClass671 {
    public RectF LJLIL;
    public final int LJLILLLLZI;
    public final Paint LJLJI;
    public final DashPathEffect LJLJJI;
    public final float LJLJJL;
    public int LJLJJLL;
    public RectF LJLJL;
    public final Vibrator LJLJLJ;
    public int LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;

    @Override // X.AnonymousClass671
    public final void LIZ() {
    }

    @Override // X.AnonymousClass671
    public final void LJIIIZ(float f, float f2, float f3) {
    }

    @Override // X.AnonymousClass671
    public final void LJIIJJI() {
        LJIILLIIL(false);
        LJIILIIL(false);
        LJIJ(false);
        LJIILL(false);
        LJIJJLI(false);
        LJIILJJIL(false);
        LJIJJ(false);
        LJIIZILJ(false);
        LJIJI(false);
        InterfaceC156486Ce mFakeFeedView = getMFakeFeedView();
        if (mFakeFeedView != null) {
            mFakeFeedView.LIZJ(false);
        }
        InterfaceC156486Ce mFakeFeedView2 = getMFakeFeedView();
        if (mFakeFeedView2 != null) {
            mFakeFeedView2.LIZ(false);
        }
        InterfaceC156486Ce mFakeFeedView3 = getMFakeFeedView();
        if (mFakeFeedView3 != null) {
            mFakeFeedView3.LIZIZ(false);
        }
    }

    @Override // X.AnonymousClass671
    public View getContentView() {
        return this;
    }

    private final InterfaceC156486Ce getMFakeFeedView() {
        return (InterfaceC156486Ce) this.LJLL.getValue();
    }

    public final void LJIL() {
        Vibrator vibrator = this.LJLJLJ;
        if (vibrator != null) {
            try {
                vibrator.vibrate(30L);
            } catch (Throwable unused) {
            }
        }
    }

    private final float getLeftViewXMargin() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C74275TDb.LJFF(context)) {
            return this.LJLILLLLZI;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        return C74275TDb.LIZIZ(context2, 8.0f);
    }

    private final float getRightViewXMargin() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C74275TDb.LJFF(context)) {
            float width = getWidth();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            return width - C74275TDb.LIZIZ(context2, 8.0f);
        }
        return getWidth() - this.LJLILLLLZI;
    }

    public final void LJIIL() {
        LJIIJJI();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.LJLIL = new RectF(getLeftViewXMargin(), 0.0f, getRightViewXMargin(), getHeight() - this.LJLJJL);
    }

    public final int getDeltaX() {
        return this.LJLJJLL;
    }

    public boolean getEnableFakeFeedView() {
        return this.LJLLI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C156466Cc(Context context) {
        super(context, null);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLJI = paint;
        this.LJLJL = new RectF();
        this.LJLL = C221108m2.LIZIZ(new AqS149S0200000_2(context, this, 110));
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 1.5f);
        this.LJLILLLLZI = (int) C74275TDb.LIZIZ(context, 56.0f);
        paint.setColor(-16717825);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(LIZIZ);
        setWillNotDraw(false);
        this.LJLJJL = C74275TDb.LIZIZ(context, 201.0f);
        this.LJLJJI = new DashPathEffect(new float[]{C74275TDb.LIZIZ(context, 2.0f), C74275TDb.LIZIZ(context, 1.0f)}, 0.0f);
        Object LLILL = C16880lQ.LLILL(context, "vibrator");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
        this.LJLJLJ = (Vibrator) LLILL;
        post(new ARunnableS38S0100000_2(this, 204));
        this.LJLLI = true;
    }

    @Override // X.AnonymousClass671
    public final PointF LIZJ(PointF[] pointFArr) {
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        LJIILJJIL.offset(0.0f, 0.0f);
        PointF pointF = new PointF();
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        float f = LJIILJJIL.right;
        RectF rectF = this.LJLIL;
        o.LJI(rectF);
        if (f - rectF.right > 0.0f) {
            RectF rectF2 = this.LJLIL;
            o.LJI(rectF2);
            pointF.x = rectF2.right - LJIILJJIL.right;
        }
        float f2 = LJIILJJIL.left;
        RectF rectF3 = this.LJLIL;
        o.LJI(rectF3);
        if (f2 - rectF3.left < 0.0f) {
            RectF rectF4 = this.LJLIL;
            o.LJI(rectF4);
            pointF.x = rectF4.left - LJIILJJIL.left;
        }
        float f3 = LJIILJJIL.bottom;
        RectF rectF5 = this.LJLIL;
        o.LJI(rectF5);
        if (f3 - rectF5.bottom > 0.0f) {
            RectF rectF6 = this.LJLIL;
            o.LJI(rectF6);
            pointF.y = rectF6.bottom - LJIILJJIL.bottom;
        }
        return pointF;
    }

    @Override // X.AnonymousClass671
    public final RectF LJ(RectF rectF) {
        return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // X.AnonymousClass671
    public final float LJIIJ(float f) {
        if (Math.abs(f - 0.0f) < 1.0f) {
            return 0.0f;
        }
        if (Math.abs(Math.abs(f) - 90.0f) < 1.0f) {
            return 90.0f;
        }
        if (Math.abs(f - 45.0f) < 1.0f) {
            return 45.0f;
        }
        if (Math.abs(f - (-45.0f)) < 1.0f) {
            return -45.0f;
        }
        return f;
    }

    public final void LJIILIIL(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 64) != 64) {
                LJIL();
            }
            i = this.LJLJLLL | 64;
        } else {
            i = this.LJLJLLL & (-65);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIILJJIL(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 8) != 8) {
                LJIL();
            }
            i = this.LJLJLLL | 8;
        } else {
            i = this.LJLJLLL & (-9);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIILL(boolean z) {
        int i;
        if (z) {
            i = this.LJLJLLL | 32;
        } else {
            i = this.LJLJLLL & (-33);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIILLIIL(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 256) != 256) {
                LJIL();
            }
            i = this.LJLJLLL | 256;
        } else {
            i = this.LJLJLLL & (-257);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIIZILJ(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 2) != 2) {
                LJIL();
            }
            i = this.LJLJLLL | 2;
        } else {
            i = this.LJLJLLL & (-3);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIJ(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 128) != 128) {
                LJIL();
            }
            i = this.LJLJLLL | 128;
        } else {
            i = this.LJLJLLL & (-129);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIJI(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 1) != 1) {
                LJIL();
            }
            i = this.LJLJLLL | 1;
        } else {
            i = this.LJLJLLL & (-2);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIJJ(boolean z) {
        int i;
        if (z) {
            if ((this.LJLJLLL & 4) != 4) {
                LJIL();
            }
            i = this.LJLJLLL | 4;
        } else {
            i = this.LJLJLLL & (-5);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    public final void LJIJJLI(boolean z) {
        int i;
        if (z) {
            i = this.LJLJLLL | 16;
        } else {
            i = this.LJLJLLL & (-17);
        }
        this.LJLJLLL = i;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        RectF rectF;
        RectF rectF2;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        this.LJLJI.setPathEffect(null);
        if ((this.LJLJLLL & 256) == 256) {
            canvas.drawLine(getLeftViewXMargin(), 0.0f, getLeftViewXMargin(), getHeight(), this.LJLJI);
        }
        if ((this.LJLJLLL & 128) == 128) {
            canvas.drawLine(getRightViewXMargin(), 0.0f, getRightViewXMargin(), getHeight(), this.LJLJI);
        }
        if ((this.LJLJLLL & 64) == 64) {
            canvas.drawLine(0.0f, getHeight() - this.LJLJJL, getWidth(), getHeight() - this.LJLJJL, this.LJLJI);
        }
        if ((this.LJLJLLL & 32) == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.drawLine(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, this.LJLJI);
        }
        if ((this.LJLJLLL & 16) == 16) {
            canvas.drawLine(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, getHeight(), this.LJLJI);
        }
        this.LJLJI.setPathEffect(this.LJLJJI);
        if ((this.LJLJLLL & 8) == 8 && (rectF2 = this.LJLJL) != null) {
            float centerY = rectF2.centerY();
            float width = getWidth();
            RectF rectF3 = this.LJLJL;
            o.LJI(rectF3);
            canvas.drawLine(0.0f, centerY, width, rectF3.centerY(), this.LJLJI);
        }
        if ((this.LJLJLLL & 4) == 4 && (rectF = this.LJLJL) != null) {
            float centerX = rectF.centerX();
            RectF rectF4 = this.LJLJL;
            o.LJI(rectF4);
            canvas.drawLine(centerX, 0.0f, rectF4.centerX(), getHeight(), this.LJLJI);
        }
        if ((this.LJLJLLL & 2) == 2 && this.LJLJL != null) {
            float height = getHeight();
            float height2 = getHeight();
            RectF rectF5 = this.LJLJL;
            o.LJI(rectF5);
            float centerY2 = height2 - rectF5.centerY();
            RectF rectF6 = this.LJLJL;
            o.LJI(rectF6);
            float centerX2 = height - (rectF6.centerX() + centerY2);
            RectF rectF7 = this.LJLJL;
            o.LJI(rectF7);
            float centerX3 = rectF7.centerX();
            float height3 = getHeight();
            RectF rectF8 = this.LJLJL;
            o.LJI(rectF8);
            canvas.drawLine(0.0f, centerX2, (height3 - rectF8.centerY()) + centerX3, getHeight(), this.LJLJI);
        }
        if ((this.LJLJLLL & 1) == 1 && this.LJLJL != null) {
            float width2 = getWidth();
            float height4 = getHeight();
            float width3 = getWidth();
            RectF rectF9 = this.LJLJL;
            o.LJI(rectF9);
            float centerX4 = width3 - rectF9.centerX();
            float height5 = getHeight();
            RectF rectF10 = this.LJLJL;
            o.LJI(rectF10);
            float centerY3 = height4 - ((height5 - rectF10.centerY()) + centerX4);
            float width4 = getWidth();
            float width5 = getWidth();
            RectF rectF11 = this.LJLJL;
            o.LJI(rectF11);
            float centerX5 = width5 - rectF11.centerX();
            float height6 = getHeight();
            RectF rectF12 = this.LJLJL;
            o.LJI(rectF12);
            canvas.drawLine(width2, centerY3, width4 - ((height6 - rectF12.centerY()) + centerX5), getHeight(), this.LJLJI);
        }
    }

    public final void setDeltaX(int i) {
        this.LJLJJLL = i;
    }

    @Override // X.AnonymousClass671
    public void setEnableFakeFeedView(boolean z) {
        this.LJLLI = z;
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
        RectF rectF = this.LJLIL;
        o.LJI(rectF);
        return rectF.contains(LJIILJJIL);
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
        RectF rectF = this.LJLIL;
        o.LJI(rectF);
        return rectF.contains(LJIILJJIL);
    }

    @Override // X.AnonymousClass671
    public final PointF LIZLLL(PointF[] pointFArr, float f, float f2) {
        RectF LJIILJJIL = C1E4.LJIILJJIL(pointFArr);
        LJIILJJIL.offset(f, 0.0f);
        PointF pointF = new PointF();
        pointF.x = f;
        pointF.y = f2;
        float f3 = 2;
        if (Math.abs(((Math.abs(LJIILJJIL.bottom - LJIILJJIL.top) / f3) + LJIILJJIL.top) - (getHeight() / 2.0f)) < 1.0f) {
            float f4 = LJIILJJIL.bottom;
            float f5 = LJIILJJIL.top;
            pointF.y = (getHeight() / 2.0f) - (((f4 - f5) / f3) + f5);
        }
        if (Math.abs(((Math.abs(LJIILJJIL.right - LJIILJJIL.left) / f3) + LJIILJJIL.left) - (getWidth() / 2.0f)) < 1.0f) {
            float f6 = LJIILJJIL.right;
            float f7 = LJIILJJIL.left;
            pointF.x = (getWidth() / 2.0f) - (((f6 - f7) / f3) + f7);
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (java.lang.Math.abs(r1 - r0.left) < 2.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b0, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        if (java.lang.Math.abs(r1 - r0.right) < 2.0f) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018f  */
    @Override // X.AnonymousClass671
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(android.graphics.PointF[] r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156466Cc.LJFF(android.graphics.PointF[], boolean, boolean, boolean, boolean, boolean):int");
    }
}
