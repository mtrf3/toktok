package X;

import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.5Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134385Pe extends View {
    public static final float LLIIIJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(1));
    public static final float LLIIIL = C7MY.LIZIZ(3);
    public static final float LLIIIZ = C7MY.LIZIZ(20);
    public static final int LLIIJI = C7MY.LIZIZ(30);
    public static final int LLIIJLIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(50));
    public static final int LLIIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(50));
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final Paint LJLJI;
    public final int LJLJJI;
    public OSZ<Integer, Integer> LJLJJL;
    public OSZ<Integer, Integer> LJLJJLL;
    public OSZ<Integer, Integer> LJLJL;
    public Rect LJLJLJ;
    public final RectF LJLJLLL;
    public final Rect LJLL;
    public final Rect LJLLI;
    public final Path LJLLILLLL;
    public final Path LJLLJ;
    public final Path LJLLL;
    public final Path LJLLLL;
    public final Path LJLLLLLL;
    public final Region LJLZ;
    public final Region LJZ;
    public final Region LJZI;
    public final Region LJZL;
    public final Region LL;
    public final Region LLD;
    public final Region LLF;
    public final Region LLFF;
    public C5PL LLFFF;
    public EnumC134395Pf LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public final ValueAnimator LLIFFJFJJ;
    public InterfaceC134405Pg LLII;
    public float LLIIII;
    public Rect LLIIIILZ;

    private final RectF getCurrentRectF() {
        this.LJLJLLL.set(this.LJLJLJ);
        return this.LJLJLLL;
    }

    private final OSZ<Integer, Integer> getMinWidthHeight() {
        if (this.LJLJL.getFirst().intValue() <= 0 || this.LJLJL.getSecond().intValue() <= 0) {
            LIZ();
        }
        return this.LJLJL;
    }

    public final void LIZ() {
        OSZ<Integer, Integer> osz;
        C5PL c5pl = this.LLFFF;
        if (c5pl == C5PL.FREE) {
            osz = new OSZ<>(Integer.valueOf(LLIIJLIL), Integer.valueOf(LLIIL));
        } else if (LIZJ(c5pl) >= 1.0f) {
            int i = LLIIJLIL;
            osz = new OSZ<>(Integer.valueOf(i), Integer.valueOf((int) (i / LIZJ(this.LLFFF))));
        } else {
            int i2 = LLIIL;
            osz = new OSZ<>(Integer.valueOf((int) (LIZJ(this.LLFFF) * i2)), Integer.valueOf(i2));
        }
        this.LJLJL = osz;
    }

    public final Rect getDeltaLeftTopRightBottom() {
        int i;
        int height;
        int i2;
        int i3;
        Rect rect = this.LJLLI;
        float f = (rect.right - rect.left) / (rect.bottom - rect.top);
        if (f >= getWidth() / getHeight()) {
            i2 = this.LJLLI.left;
            i3 = getWidth() - this.LJLLI.right;
            C5PL c5pl = this.LLFFF;
            if (c5pl != C5PL.FREE) {
                f = LIZJ(c5pl);
            }
            int height2 = (getHeight() / 2) - ((int) ((getWidth() / f) / 2.0f));
            int height3 = (getHeight() / 2) + ((int) ((getWidth() / f) / 2.0f));
            Rect rect2 = this.LJLLI;
            i = rect2.top - height2;
            height = height3 - rect2.bottom;
        } else {
            i = this.LJLLI.top;
            height = getHeight() - this.LJLLI.bottom;
            C5PL c5pl2 = this.LLFFF;
            if (c5pl2 != C5PL.FREE) {
                f = LIZJ(c5pl2);
            }
            int width = (getWidth() / 2) - ((int) ((getHeight() * f) / 2.0f));
            int width2 = (getWidth() / 2) + ((int) ((getHeight() * f) / 2.0f));
            Rect rect3 = this.LJLLI;
            i2 = rect3.left - width;
            i3 = width2 - rect3.right;
        }
        return new Rect(i2, i, i3, height);
    }

    public final Rect getRect() {
        return new Rect(this.LJLJLJ);
    }

    public final void LJ() {
        int intValue = getMinWidthHeight().getSecond().intValue();
        Rect rect = this.LJLJLJ;
        int i = rect.bottom;
        int i2 = rect.top;
        if (i < i2 + intValue) {
            rect.bottom = i2 + intValue;
        }
        if (rect.bottom > getHeight()) {
            this.LJLJLJ.bottom = getHeight();
        }
        Rect rect2 = this.LLIIIILZ;
        if (rect2 != null) {
            Rect rect3 = this.LJLJLJ;
            int i3 = rect3.bottom;
            int i4 = rect2.bottom;
            if (i3 > i4) {
                rect3.bottom = i4;
            }
        }
    }

    public final void LJFF() {
        int intValue = getMinWidthHeight().getFirst().intValue();
        Rect rect = this.LJLJLJ;
        int i = rect.left;
        int i2 = rect.right;
        if (i > i2 - intValue) {
            rect.left = i2 - intValue;
        }
        if (rect.left < 0) {
            rect.left = 0;
        }
        Rect rect2 = this.LLIIIILZ;
        if (rect2 != null) {
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                rect.left = i4;
            }
        }
    }

    public final void LJI() {
        int intValue = getMinWidthHeight().getFirst().intValue();
        Rect rect = this.LJLJLJ;
        int i = rect.right;
        int i2 = rect.left;
        if (i < i2 + intValue) {
            rect.right = i2 + intValue;
        }
        if (rect.right > getWidth()) {
            this.LJLJLJ.right = getWidth();
        }
        Rect rect2 = this.LLIIIILZ;
        if (rect2 != null) {
            Rect rect3 = this.LJLJLJ;
            int i3 = rect3.right;
            int i4 = rect2.right;
            if (i3 > i4) {
                rect3.right = i4;
            }
        }
    }

    public final void LJII() {
        int intValue = getMinWidthHeight().getSecond().intValue();
        Rect rect = this.LJLJLJ;
        int i = rect.top;
        int i2 = rect.bottom;
        if (i > i2 - intValue) {
            rect.top = i2 - intValue;
        }
        if (rect.top < 0) {
            rect.top = 0;
        }
        Rect rect2 = this.LLIIIILZ;
        if (rect2 != null) {
            int i3 = rect.top;
            int i4 = rect2.top;
            if (i3 < i4) {
                rect.top = i4;
            }
        }
    }

    public final C5PL getCropMode() {
        return this.LLFFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C134385Pe(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        Paint paint2 = new Paint(1);
        this.LJLILLLLZI = paint2;
        Paint paint3 = new Paint(1);
        this.LJLJI = paint3;
        this.LJLJJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLJJL = new OSZ<>(0, 0);
        this.LJLJJLL = new OSZ<>(0, 0);
        this.LJLJL = new OSZ<>(0, 0);
        this.LJLJLJ = new Rect();
        this.LJLJLLL = new RectF();
        this.LJLL = new Rect();
        this.LJLLI = new Rect();
        this.LJLLILLLL = new Path();
        this.LJLLJ = new Path();
        this.LJLLL = new Path();
        this.LJLLLL = new Path();
        this.LJLLLLLL = new Path();
        this.LJLZ = new Region();
        this.LJZ = new Region();
        this.LJZI = new Region();
        this.LJZL = new Region();
        this.LL = new Region();
        this.LLD = new Region();
        this.LLF = new Region();
        this.LLFF = new Region();
        this.LLFFF = C5PL.FREE;
        this.LLFII = EnumC134395Pf.OUT_OF_BOUNDS;
        this.LLFZ = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLIFFJFJJ = ofFloat;
        this.LLIIII = -1.0f;
        paint.setColor(-1);
        float f = LLIIIJ;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setColor(-2130706433);
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(LLIIIL);
        paint3.setStyle(Paint.Style.STROKE);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 40));
    }

    public final Rect LIZIZ(C5PL mode) {
        o.LJIIIZ(mode, "mode");
        Rect rect = new Rect();
        if (LIZJ(mode) < getWidth() / getHeight()) {
            rect.top = 0;
            rect.bottom = getHeight();
            int LIZJ = (int) (LIZJ(mode) * getHeight());
            int width = (getWidth() - LIZJ) / 2;
            rect.left = width;
            rect.right = width + LIZJ;
        } else {
            rect.left = 0;
            rect.right = getWidth();
            int width2 = (int) (getWidth() / LIZJ(mode));
            int height = (getHeight() - width2) / 2;
            rect.top = height;
            rect.bottom = height + width2;
        }
        return rect;
    }

    public final float LIZJ(C5PL mode) {
        o.LJIIIZ(mode, "mode");
        int i = C5PP.LIZ[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 1.0f;
                }
                if (i != 4) {
                    if (i != 5) {
                        Rect rect = this.LJLJLJ;
                        return ((rect.right - rect.left) * 1.0f) / (rect.bottom - rect.top);
                    }
                    return 1.7777778f;
                }
                return 1.3333334f;
            }
            return 0.75f;
        }
        return 0.5625f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        int save = canvas.save();
        try {
            this.LJLLLLLL.reset();
            this.LJLLLLLL.addRect(getCurrentRectF(), Path.Direction.CW);
            this.LJLLLLLL.setFillType(Path.FillType.INVERSE_WINDING);
            canvas.clipPath(this.LJLLLLLL);
            canvas.drawColor(this.LJLJJI);
            canvas.restoreToCount(save);
            Rect rect = this.LJLJLJ;
            float f = (rect.right - rect.left) / 3.0f;
            float f2 = (rect.bottom - rect.top) / 3.0f;
            int i = 1;
            do {
                int i2 = this.LJLJLJ.left;
                float f3 = i;
                float f4 = f3 * f;
                canvas.drawLine(i2 + f4, r6.top, f4 + i2, r6.bottom, this.LJLILLLLZI);
                Rect rect2 = this.LJLJLJ;
                float f5 = rect2.left;
                int i3 = rect2.top;
                float f6 = f3 * f2;
                canvas.drawLine(f5, i3 + f6, rect2.right, i3 + f6, this.LJLILLLLZI);
                i++;
            } while (i < 3);
            Rect rect3 = this.LJLJLJ;
            float f7 = rect3.left;
            int i4 = rect3.top;
            float f8 = LLIIIJ;
            float f9 = 2;
            canvas.drawLine(f7, i4 + (f8 / f9), rect3.right, (f8 / f9) + i4, this.LJLIL);
            int i5 = this.LJLJLJ.left;
            canvas.drawLine(i5 + (f8 / f9), r3.top, (f8 / f9) + i5, r3.bottom, this.LJLIL);
            int i6 = this.LJLJLJ.right;
            canvas.drawLine(i6 - (f8 / f9), r3.top, i6 - (f8 / f9), r3.bottom, this.LJLIL);
            Rect rect4 = this.LJLJLJ;
            float f10 = rect4.left;
            int i7 = rect4.bottom;
            canvas.drawLine(f10, i7 - (f8 / f9), rect4.right, i7 - (f8 / f9), this.LJLIL);
            Region region = this.LJLZ;
            Rect rect5 = this.LJLJLJ;
            int i8 = rect5.left;
            int i9 = LLIIJI;
            int i10 = rect5.top;
            region.set(i8 - i9, i10 - i9, i8 + i9, i10 + i9);
            Region region2 = this.LJZ;
            Rect rect6 = this.LJLJLJ;
            int i11 = rect6.left;
            int i12 = rect6.bottom;
            region2.set(i11 - i9, i12 - i9, i11 + i9, i12 + i9);
            Region region3 = this.LJZI;
            Rect rect7 = this.LJLJLJ;
            int i13 = rect7.right;
            int i14 = rect7.top;
            region3.set(i13 - i9, i14 - i9, i13 + i9, i14 + i9);
            Region region4 = this.LJZL;
            Rect rect8 = this.LJLJLJ;
            int i15 = rect8.right;
            int i16 = rect8.bottom;
            region4.set(i15 - i9, i16 - i9, i15 + i9, i16 + i9);
            Region region5 = this.LL;
            Rect rect9 = this.LJLJLJ;
            int i17 = rect9.left;
            region5.set(i17 - i9, rect9.top + i9 + 1, i17 + i9, (rect9.bottom - i9) - 1);
            Region region6 = this.LLD;
            Rect rect10 = this.LJLJLJ;
            int i18 = rect10.left + i9 + 1;
            int i19 = rect10.top;
            region6.set(i18, i19 - i9, (rect10.right - i9) - 1, i19 + i9);
            Region region7 = this.LLF;
            Rect rect11 = this.LJLJLJ;
            int i20 = rect11.right;
            region7.set(i20 - i9, rect11.top + i9 + 1, i20 + i9, (rect11.bottom - i9) - 1);
            Region region8 = this.LLFF;
            Rect rect12 = this.LJLJLJ;
            int i21 = rect12.left + i9 + 1;
            int i22 = rect12.bottom;
            region8.set(i21, i22 - i9, (rect12.right - i9) - 1, i22 + i9);
            this.LJLLILLLL.reset();
            Path path = this.LJLLILLLL;
            Rect rect13 = this.LJLJLJ;
            float f11 = rect13.left;
            float f12 = LLIIIL;
            float f13 = rect13.top;
            float f14 = LLIIIZ;
            path.moveTo((f12 / f9) + f11, (f12 / f9) + f13 + f14);
            Path path2 = this.LJLLILLLL;
            Rect rect14 = this.LJLJLJ;
            path2.lineTo((f12 / f9) + rect14.left, (f12 / f9) + rect14.top);
            Path path3 = this.LJLLILLLL;
            Rect rect15 = this.LJLJLJ;
            path3.lineTo((f12 / f9) + rect15.left + f14, (f12 / f9) + rect15.top);
            canvas.drawPath(this.LJLLILLLL, this.LJLJI);
            this.LJLLJ.reset();
            Path path4 = this.LJLLJ;
            Rect rect16 = this.LJLJLJ;
            path4.moveTo((f12 / f9) + rect16.left + f14, rect16.bottom - (f12 / f9));
            Path path5 = this.LJLLJ;
            Rect rect17 = this.LJLJLJ;
            path5.lineTo((f12 / f9) + rect17.left, rect17.bottom - (f12 / f9));
            Path path6 = this.LJLLJ;
            Rect rect18 = this.LJLJLJ;
            path6.lineTo((f12 / f9) + rect18.left, (rect18.bottom - f14) - (f12 / f9));
            canvas.drawPath(this.LJLLJ, this.LJLJI);
            this.LJLLL.reset();
            Path path7 = this.LJLLL;
            Rect rect19 = this.LJLJLJ;
            path7.moveTo((rect19.right - f14) - (f12 / f9), (f12 / f9) + rect19.top);
            Path path8 = this.LJLLL;
            Rect rect20 = this.LJLJLJ;
            path8.lineTo(rect20.right - (f12 / f9), (f12 / f9) + rect20.top);
            Path path9 = this.LJLLL;
            Rect rect21 = this.LJLJLJ;
            path9.lineTo(rect21.right - (f12 / f9), (f12 / f9) + rect21.top + f14);
            canvas.drawPath(this.LJLLL, this.LJLJI);
            this.LJLLLL.reset();
            Path path10 = this.LJLLLL;
            Rect rect22 = this.LJLJLJ;
            path10.moveTo((rect22.right - f14) - (f12 / f9), rect22.bottom - (f12 / f9));
            Path path11 = this.LJLLLL;
            Rect rect23 = this.LJLJLJ;
            path11.lineTo(rect23.right - (f12 / f9), rect23.bottom - (f12 / f9));
            Path path12 = this.LJLLLL;
            Rect rect24 = this.LJLJLJ;
            path12.lineTo(rect24.right - (f12 / f9), (rect24.bottom - f14) - (f12 / f9));
            canvas.drawPath(this.LJLLLL, this.LJLJI);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r1 != 3) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134385Pe.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCropListener(InterfaceC134405Pg l) {
        o.LJIIIZ(l, "l");
        this.LLII = l;
    }

    public final void setCropMode(C5PL mode) {
        o.LJIIIZ(mode, "mode");
        if (this.LLFFF != mode) {
            this.LLFFF = mode;
            this.LJLJLJ = LIZIZ(mode);
            LIZ();
            invalidate();
        }
    }

    public final void setFreeModeCropRect(float f) {
        this.LLIIII = f;
        if (getWidth() != 0 && getHeight() != 0) {
            if (f > 0.0f) {
                if (f > getWidth() / getHeight()) {
                    Rect rect = this.LJLJLJ;
                    rect.left = 0;
                    rect.right = getWidth();
                    int width = (int) (getWidth() / f);
                    this.LJLJLJ.top = (getHeight() - width) / 2;
                    Rect rect2 = this.LJLJLJ;
                    rect2.bottom = rect2.top + width;
                } else {
                    Rect rect3 = this.LJLJLJ;
                    rect3.top = 0;
                    rect3.bottom = getHeight();
                    int height = (int) (getHeight() * f);
                    this.LJLJLJ.left = (getWidth() - height) / 2;
                    Rect rect4 = this.LJLJLJ;
                    rect4.right = rect4.left + height;
                }
            }
            invalidate();
        }
    }

    public final void setLimitRect(Rect limitRect) {
        o.LJIIIZ(limitRect, "limitRect");
        this.LLIIIILZ = limitRect;
    }

    public final void setRect(Rect rect) {
        o.LJIIIZ(rect, "rect");
        this.LJLJLJ = rect;
        invalidate();
    }

    public final boolean LIZLLL(int i, int i2) {
        if (this.LJLZ.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.LEFT_TOP;
            return true;
        }
        if (this.LJZI.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.RIGHT_TOP;
            return true;
        }
        if (this.LJZ.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.LEFT_BOTTOM;
            return true;
        }
        if (this.LJZL.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.RIGHT_BOTTOM;
            return true;
        }
        if (this.LL.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.LEFT;
            return true;
        }
        if (this.LLD.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.TOP;
            return true;
        }
        if (this.LLF.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.RIGHT;
            return true;
        }
        if (this.LLFF.contains(i, i2)) {
            this.LLFII = EnumC134395Pf.BOTTOM;
            return true;
        }
        this.LLFII = EnumC134395Pf.OUT_OF_BOUNDS;
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            i3 = View.MeasureSpec.getSize(i);
        } else {
            i3 = LLIIJLIL;
        }
        if (mode2 == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        } else {
            i4 = LLIIL;
        }
        C5PL c5pl = this.LLFFF;
        if (c5pl != C5PL.FREE) {
            float f = i3;
            float f2 = i4;
            if (LIZJ(c5pl) < f / f2) {
                Rect rect = this.LJLJLJ;
                rect.top = 0;
                rect.bottom = i4;
                int LIZJ = (int) (LIZJ(this.LLFFF) * f2);
                Rect rect2 = this.LJLJLJ;
                int i5 = (i3 - LIZJ) / 2;
                rect2.left = i5;
                rect2.right = i5 + LIZJ;
            } else {
                Rect rect3 = this.LJLJLJ;
                rect3.left = 0;
                rect3.right = i3;
                int LIZJ2 = (int) (f / LIZJ(this.LLFFF));
                Rect rect4 = this.LJLJLJ;
                int i6 = (i4 - LIZJ2) / 2;
                rect4.top = i6;
                rect4.bottom = i6 + LIZJ2;
            }
        } else {
            float f3 = this.LLIIII;
            if (f3 > 0.0f) {
                float f4 = i3;
                float f5 = i4;
                if (f3 > f4 / f5) {
                    Rect rect5 = this.LJLJLJ;
                    rect5.left = 0;
                    rect5.right = i3;
                    int i7 = (int) (f4 / f3);
                    int i8 = (i4 - i7) / 2;
                    rect5.top = i8;
                    rect5.bottom = i8 + i7;
                } else {
                    Rect rect6 = this.LJLJLJ;
                    rect6.top = 0;
                    rect6.bottom = i4;
                    int i9 = (int) (f5 * f3);
                    int i10 = (i3 - i9) / 2;
                    rect6.left = i10;
                    rect6.right = i10 + i9;
                }
            }
        }
        setMeasuredDimension(i3, i4);
    }
}
