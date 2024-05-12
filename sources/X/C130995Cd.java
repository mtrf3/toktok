package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130995Cd extends View {
    public final int LJLIL;
    public Animator LJLILLLLZI;
    public final Paint LJLJI;
    public final Paint LJLJJI;
    public final Paint LJLJJL;
    public final Rect LJLJJLL;
    public final int LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public Boolean LJLLLLLL;
    public boolean LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public final C62822Ol8 LLFF;
    public final int LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public final int LLI;
    public final int LLIFFJFJJ;
    public final int LLII;
    public final int LLIIII;
    public final Bitmap LLIIIILZ;
    public final Rect LLIIIJ;
    public final RectF LLIIIL;
    public final float LLIIIZ;
    public final boolean LLIIJI;
    public final boolean LLIIJLIL;
    public final boolean LLIIL;
    public final int LLIILII;
    public final float LLIILZL;
    public boolean LLIIZ;
    public final ArrayList<Float> LLIL;
    public InterfaceC131005Ce LLILII;
    public final C62822Ol8 LLILIL;

    public static /* synthetic */ void getEaseOut$annotations() {
    }

    public final Bitmap getSelectBitmap() {
        GradientDrawable LIZIZ = T28.LIZIZ(1);
        LIZIZ.setColor(this.LLII);
        LIZIZ.setStroke(this.LLIFFJFJJ, this.LLI);
        int i = (this.LLIFFJFJJ + this.LLIIII) * 2;
        if (i <= 0) {
            i = C134855Qz.LIZ(15.0f);
        }
        LIZIZ.setSize(i, i);
        Bitmap mutableBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mutableBitmap);
        LIZIZ.setBounds(0, 0, i, i);
        LIZIZ.draw(canvas);
        o.LJIIIIZZ(mutableBitmap, "mutableBitmap");
        return mutableBitmap;
    }

    private final InterfaceC1283852c getHapticFeedback() {
        return (InterfaceC1283852c) this.LLILIL.getValue();
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLFF.getValue()).booleanValue();
    }

    public final float getHandleRadius() {
        return this.LLIIII + this.LLIFFJFJJ;
    }

    private final Interpolator getEaseOut() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.54f, 0.0f, 0.94f, 0.74f);
        o.LJIIIIZZ(LIZIZ, "create(0.54F, 0F, 0.94F, 0.74F)");
        return LIZIZ;
    }

    public final float LIZIZ() {
        if (LIZLLL()) {
            return (this.LJLJLJ - (this.LJLLI * this.LJLLILLLL)) - getMeasuredWidth();
        }
        return this.LJLJLJ + (this.LJLLI * this.LJLLILLLL);
    }

    public final boolean getEnableSliding() {
        return this.LLIIZ;
    }

    public final float getHandleCenterRelativeY() {
        return this.LJLL;
    }

    public final Boolean getSlideAble() {
        return this.LJLLLLLL;
    }

    public final int LIZ(int i) {
        float f = 100;
        int i2 = (int) (this.LLIILZL * f);
        int size = this.LLIL.size();
        if (i < i2) {
            return i2;
        }
        if (i2 > 0 && i2 <= i && i < 201) {
            return i;
        }
        int i3 = size - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            int i6 = i5 * 100;
            if (i4 * 100 <= i && i <= i6) {
                float floatValue = ((Number) ListProtector.get(this.LLIL, i5)).floatValue();
                Object obj = ListProtector.get(this.LLIL, i4);
                o.LJIIIIZZ(obj, "dividerList[i]");
                return ((int) (((Number) ListProtector.get(this.LLIL, i4)).floatValue() * f)) + ((int) ((i - r4) * (floatValue - ((Number) obj).floatValue())));
            }
            i4 = i5;
        }
        Iterator<Float> it = this.LLIL.iterator();
        if (it.hasNext()) {
            float floatValue2 = it.next().floatValue();
            while (it.hasNext()) {
                floatValue2 = Math.max(floatValue2, it.next().floatValue());
            }
            return (int) (floatValue2 * f);
        }
        throw new NoSuchElementException();
    }

    public final int LIZJ(float f) {
        int size;
        double ceil;
        int i = (int) (this.LLIILZL * 100);
        if (LIZLLL()) {
            float f2 = this.LJLJLLL;
            float f3 = this.LJLJLJ;
            float f4 = i;
            float f5 = this.LJLLI;
            if (f <= f3 - (f4 * f5) && f2 <= f) {
                ceil = Math.ceil(Math.abs(f3 - f) / this.LJLLI);
                return (int) ceil;
            }
            if (f > f3 - (f4 * f5)) {
                return i;
            }
            size = this.LLIL.size();
            return (size - 1) * 100;
        }
        float f6 = this.LJLJLJ;
        float f7 = i;
        float f8 = this.LJLLI;
        float f9 = (f7 * f8) + f6;
        if (f <= this.LJLJLLL && f9 <= f) {
            ceil = Math.ceil((f - f6) / f8);
            return (int) ceil;
        }
        if (f < (f7 * f8) + f6) {
            return i;
        }
        size = this.LLIL.size();
        return (size - 1) * 100;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float LIZ;
        int i;
        float floatValue;
        float f2;
        Object valueOf;
        float f3;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        if (LIZLLL()) {
            f = this.LJLJLJ - (this.LJLLI * this.LJLLILLLL);
        } else {
            f = this.LJLJLJ + (this.LJLLI * this.LJLLILLLL);
        }
        String LIZIZ = C63144OqK.LIZIZ(new Object[]{Float.valueOf((this.LJLLJ / 10) / 10.0f)}, 1, Locale.ENGLISH, "%.1fx", "format(locale, format, *args)");
        this.LJLJJI.getTextBounds(LIZIZ, 0, LIZIZ.length(), this.LJLJJLL);
        float width = (f - (this.LJLJJLL.width() / 2.0f)) - C134855Qz.LIZ(1.0f);
        float f4 = (this.LJLL - this.LLIIIZ) - this.LJLIL;
        if (this.LJLLLL && this.LLIIJI) {
            canvas.drawText(LIZIZ, width, f4, this.LJLJJI);
        }
        if (!this.LLIL.isEmpty()) {
            int size = this.LLIL.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (LIZLLL()) {
                    float f5 = this.LJLJLJ;
                    LIZ = f5 - ((Math.abs(this.LJLJLLL - f5) / (size - 1)) * i2);
                } else {
                    float f6 = this.LJLJLJ;
                    LIZ = C43881HKb.LIZ(this.LJLJLLL - f6, size - 1, i2, f6);
                }
                int i3 = this.LLFZ;
                int i4 = size - 1;
                int i5 = 9;
                if (i3 == 9) {
                    i = (i3 * i4) + i4;
                } else {
                    i = (i3 * i4) + size;
                }
                float abs = Math.abs(this.LJLJLLL - this.LJLJLJ) / i;
                int i6 = this.LLFZ;
                int i7 = i6 + 1;
                if (i2 == 0) {
                    if (i6 != 9) {
                        i5 = i7;
                    }
                    if (LIZLLL()) {
                        LIZ -= (this.LLIILZL * 100) * this.LJLLI;
                    } else {
                        LIZ = (this.LLIILZL * 100 * this.LJLLI) + LIZ;
                    }
                } else if (i2 == i4) {
                    i5 = 1;
                } else {
                    i5 = i7;
                }
                int i8 = this.LJZI;
                this.LJLJI.setStrokeWidth(this.LL);
                this.LJLJI.setColor(this.LLFII);
                float f7 = LIZ;
                for (int i9 = 0; i9 < i5; i9++) {
                    if (i9 == 1) {
                        i8 = this.LJZ;
                        this.LJLJI.setStrokeWidth(this.LJZL);
                        this.LJLJI.setColor(this.LLFFF);
                    }
                    float f8 = f7 - (this.LLD / 2);
                    float f9 = this.LJLL;
                    float f10 = i8 / 2;
                    canvas.drawLine(f8, f9 - f10, f8, f9 + f10, this.LJLJI);
                    if (LIZLLL()) {
                        f7 -= abs;
                    } else {
                        f7 += abs;
                    }
                }
                if (this.LLIILII == 1) {
                    floatValue = (int) (((Number) ListProtector.get(this.LLIL, i2)).floatValue() * 10);
                    f2 = 10.0f;
                } else {
                    floatValue = (int) (((Number) ListProtector.get(this.LLIL, i2)).floatValue() * 100);
                    f2 = 100.0f;
                }
                float f11 = floatValue / f2;
                StringBuilder LIZ2 = X1D.LIZ();
                int i10 = (int) f11;
                if (i10 == f11) {
                    valueOf = Integer.valueOf(i10);
                } else {
                    valueOf = Float.valueOf(f11);
                }
                LIZ2.append(valueOf);
                LIZ2.append('x');
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                this.LJLJJL.getTextBounds(LIZIZ2, 0, LIZIZ2.length(), this.LJLJJLL);
                float width2 = (LIZ - (this.LJLJJLL.width() / 2.0f)) - C134855Qz.LIZ(1.0f);
                if (this.LLIIL) {
                    f3 = this.LJLL + this.LLF + (this.LJZI / 2) + this.LJLJJLL.height();
                } else {
                    f3 = (this.LJLL - this.LLF) - (this.LJZI / 2);
                }
                canvas.drawText(LIZIZ2, width2, f3, this.LJLJJL);
            }
        }
        RectF rectF = this.LLIIIL;
        float f12 = this.LLIIIZ;
        float f13 = this.LJLL;
        rectF.set(f - f12, f13 - f12, f + f12, f13 + f12);
        canvas.drawBitmap(this.LLIIIILZ, this.LLIIIJ, this.LLIIIL, (Paint) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        if (r1 <= r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
    
        r5 = r8.LLIIIZ;
        r0 = r8.LJLJL;
        r1 = (r6 - r5) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
    
        if (r7 > ((r6 + r5) + r0)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        if (r1 > r7) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        if (LJ(r9.getX(), 0) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        r8.LJLLL = true;
        r8.LJLLLL = true;
        r1 = r8.LLILII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        r1.LJ(LIZIZ(), 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011e, code lost:
    
        if (r1 <= r5) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130995Cd.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCurrPosition(int i) {
        this.LJLLJ = i;
        float f = 100;
        int i2 = (int) (this.LLIILZL * f);
        int size = this.LLIL.size();
        if (i2 < 0 || i >= i2) {
            int i3 = size - 1;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    int floatValue = (int) (((Number) ListProtector.get(this.LLIL, i4)).floatValue() * f);
                    int i5 = i4 + 1;
                    int floatValue2 = (int) (((Number) ListProtector.get(this.LLIL, i5)).floatValue() * f);
                    if (floatValue <= i && i <= floatValue2) {
                        float floatValue3 = ((Number) ListProtector.get(this.LLIL, i5)).floatValue();
                        Object obj = ListProtector.get(this.LLIL, i4);
                        o.LJIIIIZZ(obj, "dividerList[i]");
                        i = ((int) ((i - floatValue) / (floatValue3 - ((Number) obj).floatValue()))) + (i4 * 100);
                        break;
                    }
                    i4 = i5;
                } else {
                    i = (this.LLIL.size() - 1) * 100;
                    break;
                }
            }
        }
        this.LJLLILLLL = i;
        this.LJLLI = Math.abs(this.LJLJLLL - this.LJLJLJ) / ((this.LLIL.size() - 1) * 100);
        invalidate();
    }

    public final void setEnableSliding(boolean z) {
        this.LLIIZ = z;
    }

    public final void setOnSliderChangeListener(InterfaceC131005Ce listener) {
        o.LJIIIZ(listener, "listener");
        this.LLILII = listener;
    }

    public final void setSlideAble(Boolean bool) {
        this.LJLLLLLL = bool;
    }

    public final void setSpeedRange(ArrayList<Float> dividerValueList) {
        o.LJIIIZ(dividerValueList, "dividerValueList");
        this.LLIL.clear();
        this.LLIL.addAll(dividerValueList);
        invalidate();
    }

    public final void setTextTypeface(Typeface font) {
        o.LJIIIZ(font, "font");
        this.LJLJJL.setTypeface(font);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130995Cd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C134855Qz.LIZ(12.5f);
        Paint paint = new Paint(1);
        this.LJLJI = paint;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.LJLJJI = paint3;
        Paint paint4 = new Paint(1);
        this.LJLJJL = paint4;
        ColorProtector.parseColor("#CCFFFFFF");
        float LIZ = C134855Qz.LIZ(11.0f);
        this.LJLJJLL = new Rect();
        this.LJLJL = C134855Qz.LIZ(10.0f);
        this.LJLLI = 1.0f;
        this.LJLLILLLL = 10;
        this.LJLLJ = 10;
        this.LJLLLLLL = Boolean.TRUE;
        this.LJZ = C134855Qz.LIZ(4.6f);
        this.LJZI = C134855Qz.LIZ(11.0f);
        this.LJZL = C134855Qz.LIZ(1.0f);
        this.LL = C134855Qz.LIZ(1.0f);
        this.LLD = C134855Qz.LIZ(1.0f);
        this.LLF = C134855Qz.LIZ(25.0f);
        this.LLFF = C221108m2.LIZIZ(new AqS152S0100000_2(context, 0));
        this.LLFFF = ColorProtector.parseColor("#D8D8D8");
        this.LLFII = ColorProtector.parseColor("#D8D8D8");
        this.LLFZ = 9;
        this.LLI = -1;
        this.LLIFFJFJJ = C134855Qz.LIZ(3.0f);
        this.LLII = ColorProtector.parseColor("#181718");
        this.LLIIII = C134855Qz.LIZ(9.0f);
        this.LLIIIL = new RectF();
        this.LLIIJI = true;
        this.LLIIJLIL = true;
        this.LLIIL = true;
        this.LLIILII = 1;
        this.LLIILZL = 0.1f;
        this.LLIIZ = true;
        this.LLIL = C47261Igj.LJII(Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(100.0f));
        this.LLILIL = C221108m2.LIZIZ(C56Y.LJLIL);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yq, R.attr.yr, R.attr.ys, R.attr.a_n, R.attr.a_o, R.attr.aeq, R.attr.aij, R.attr.anx, R.attr.b1z, R.attr.b20, R.attr.bbp, R.attr.bbq, R.attr.bbr, R.attr.bbs, R.attr.bby, R.attr.bbz, R.attr.bc0, R.attr.bc1});
        int color = obtainStyledAttributes.getColor(3, ColorProtector.parseColor("#CCFFFFFF"));
        this.LJZL = obtainStyledAttributes.getDimensionPixelSize(13, C134855Qz.LIZ(1.0f));
        this.LJZ = obtainStyledAttributes.getDimensionPixelSize(11, C134855Qz.LIZ(4.6f));
        this.LLFFF = obtainStyledAttributes.getColor(10, ColorProtector.parseColor("#D8D8D8"));
        this.LL = obtainStyledAttributes.getDimensionPixelSize(2, C134855Qz.LIZ(1.0f));
        this.LJZI = obtainStyledAttributes.getDimensionPixelSize(1, C134855Qz.LIZ(11.0f));
        this.LLFII = obtainStyledAttributes.getColor(0, ColorProtector.parseColor("#D8D8D8"));
        this.LLF = obtainStyledAttributes.getDimensionPixelSize(4, C134855Qz.LIZ(25.0f));
        this.LLFZ = obtainStyledAttributes.getInteger(12, 9);
        this.LLII = obtainStyledAttributes.getColor(14, ColorProtector.parseColor("#181718"));
        this.LLIIII = obtainStyledAttributes.getDimensionPixelSize(15, C134855Qz.LIZ(9.0f));
        this.LLI = obtainStyledAttributes.getColor(16, C04330Ez.LIZIZ(context, C1291054w.LIZJ().LIZ));
        this.LLIFFJFJJ = obtainStyledAttributes.getDimensionPixelSize(17, C134855Qz.LIZ(3.0f));
        this.LLIIJI = obtainStyledAttributes.getBoolean(9, true);
        this.LLIIJLIL = obtainStyledAttributes.getBoolean(8, true);
        this.LLIIL = obtainStyledAttributes.getBoolean(6, true);
        this.LLIILII = obtainStyledAttributes.getInteger(5, 1);
        this.LLIILZL = obtainStyledAttributes.getFloat(7, 0.1f);
        obtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setShadowLayer(C134855Qz.LIZ(1.0f), 0.0f, 0.0f, 1073741824);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setShadowLayer(C134855Qz.LIZ(3.0f), 0.0f, 0.0f, 1073741824);
        paint3.setColor(color);
        paint3.setAntiAlias(true);
        paint3.setTextSize(LIZ);
        paint4.setColor(color);
        paint4.setAntiAlias(true);
        paint4.setTextSize(LIZ);
        Bitmap selectBitmap = getSelectBitmap();
        this.LLIIIILZ = selectBitmap;
        this.LLIIIJ = new Rect(0, 0, selectBitmap.getWidth(), selectBitmap.getHeight());
        this.LLIIIZ = ((selectBitmap.getHeight() + selectBitmap.getWidth()) - 2) / 4.0f;
    }

    public final boolean LJ(float f, int i) {
        InterfaceC131005Ce interfaceC131005Ce;
        int LIZJ = LIZJ(f);
        int LIZ = LIZ(LIZJ);
        this.LJLLJ = LIZ;
        if (this.LJLLILLLL != LIZJ) {
            if (this.LLIIJLIL) {
                Iterator<Float> it = this.LLIL.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Float next = it.next();
                    if (((int) (next.floatValue() * 100)) == LIZ) {
                        if (next != null) {
                            getHapticFeedback().LIZ(this, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                        }
                    }
                }
            }
            InterfaceC131005Ce interfaceC131005Ce2 = this.LLILII;
            if (interfaceC131005Ce2 != null && !interfaceC131005Ce2.LIZLLL()) {
                this.LJLLLLLL = Boolean.FALSE;
            } else {
                this.LJLLILLLL = LIZJ;
                InterfaceC131005Ce interfaceC131005Ce3 = this.LLILII;
                if (interfaceC131005Ce3 != null) {
                    interfaceC131005Ce3.LIZ();
                }
                if (i == 2 && (interfaceC131005Ce = this.LLILII) != null) {
                    interfaceC131005Ce.LJ(LIZIZ(), 2, this.LJLLJ);
                }
                this.LJLLLLLL = Boolean.TRUE;
            }
        }
        Boolean bool = this.LJLLLLLL;
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            r8 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto Lc8
            if (r0 == 0) goto Lb9
            if (r0 == r3) goto Lc8
            r5 = 0
        L10:
            int r4 = android.view.View.MeasureSpec.getSize(r11)
            android.graphics.Paint r7 = r9.LJLJJI
            android.graphics.Rect r6 = r9.LJLJJLL
            java.lang.String r1 = "100x"
            r0 = 4
            r7.getTextBounds(r1, r8, r0, r6)
            float r1 = r9.LLIIIZ
            android.graphics.Rect r0 = r9.LJLJJLL
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = r9.LJLIL
            float r0 = (float) r0
            float r1 = r1 + r0
            r0 = 2
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r9.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r9.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            if (r0 == r2) goto Lb4
            if (r0 == r3) goto L43
            r4 = r1
        L43:
            r9.setMeasuredDimension(r5, r4)
            float r1 = r9.LLIIIZ
            android.graphics.Rect r0 = r9.LJLJJLL
            int r0 = r0.width()
            float r0 = (float) r0
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r3
            float r2 = java.lang.Math.max(r1, r0)
            boolean r0 = r9.LIZLLL()
            if (r0 == 0) goto Lad
            int r1 = r9.getMeasuredWidth()
            int r0 = X.V2B.LJIIIZ(r9)
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 - r2
        L67:
            r9.LJLJLJ = r0
            boolean r0 = r9.LIZLLL()
            if (r0 == 0) goto La1
            int r0 = X.V2B.LJIIJ(r9)
            float r0 = (float) r0
            float r0 = r0 + r2
        L75:
            r9.LJLJLLL = r0
            int r0 = r9.getMeasuredHeight()
            float r0 = (float) r0
            float r0 = r0 / r3
            r9.LJLL = r0
            java.util.ArrayList<java.lang.Float> r0 = r9.LLIL
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto La0
            float r1 = r9.LJLJLLL
            float r0 = r9.LJLJLJ
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            java.util.ArrayList<java.lang.Float> r0 = r9.LLIL
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 * 100
            float r0 = (float) r0
            float r1 = r1 / r0
            r9.LJLLI = r1
        La0:
            return
        La1:
            int r1 = r9.getMeasuredWidth()
            int r0 = X.V2B.LJIIIZ(r9)
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 - r2
            goto L75
        Lad:
            int r0 = X.V2B.LJIIJ(r9)
            float r0 = (float) r0
            float r0 = r0 + r2
            goto L67
        Lb4:
            int r4 = java.lang.Math.min(r1, r4)
            goto L43
        Lb9:
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r5 = X.C134855Qz.LIZIZ(r1)
            goto L10
        Lc8:
            int r5 = android.view.View.MeasureSpec.getSize(r10)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130995Cd.onMeasure(int, int):void");
    }
}
