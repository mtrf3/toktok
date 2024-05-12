package X;

import Y.ALAdapterS1S0100000_2;
import Y.AUListenerS91S0100000_2;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131015Cf extends View {
    public static final int LLIIIZ = C134855Qz.LIZ(2.5f);
    public int LJLIL;
    public Animator LJLILLLLZI;
    public int LJLJI;
    public C56A LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public final Paint LJLJL;
    public final Paint LJLJLJ;
    public final Paint LJLJLLL;
    public final Paint LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final boolean LJLLJ;
    public final float LJLLL;
    public final int LJLLLL;
    public final Rect LJLLLLLL;
    public final int LJLZ;
    public float LJZ;
    public float LJZI;
    public float LJZL;
    public float LL;
    public float LLD;
    public int LLF;
    public boolean LLFF;
    public int LLFFF;
    public final float LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final boolean LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;

    public final void setOnSliderChangeListener(AbstractC131035Ch listener) {
        o.LJIIIZ(listener, "listener");
    }

    public final float getHandleRadius() {
        return this.LLFII + this.LJLLL;
    }

    private final Interpolator getEaseOut() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.54f, 0.0f, 0.94f, 0.74f);
        o.LJIIIIZZ(LIZIZ, "create(0.54F, 0F, 0.94F, 0.74F)");
        return LIZIZ;
    }

    public final int getCurrPosition() {
        return this.LLFFF;
    }

    public final int getDefaultPosition() {
        return this.LLF;
    }

    public final boolean getDrawDefaultPoint() {
        return this.LLFF;
    }

    public final boolean getEnableSliding() {
        return this.LLI;
    }

    public final float getHandleCenterRelativeY() {
        return this.LJZL;
    }

    public final int getMax() {
        return this.LLIIIJ;
    }

    public final int getMaxValue() {
        return this.LLIIIJ;
    }

    public final int getMinValue() {
        return this.LLIIIL;
    }

    private final void setMaxValue(int i) {
        this.LLIIIJ = i;
    }

    private final void setMinValue(int i) {
        this.LLIIIL = i;
    }

    public final int LIZ(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = this.LJZ;
        if (x <= this.LJZI && f <= x) {
            return (int) Math.ceil(((x - f) / this.LL) + this.LLIIIL);
        }
        if (x < f) {
            return this.LLIIIL;
        }
        return this.LLIIIJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.LJZ = getPaddingLeft() + this.LLD + this.LJLLL;
        this.LJZI = ((getMeasuredWidth() - getPaddingRight()) - this.LLD) - this.LJLLL;
        this.LJZL = getMeasuredHeight() / 2.0f;
        float f4 = this.LJZI;
        float f5 = this.LJZ;
        float f6 = f4 - f5;
        float f7 = this.LLIIIJ - this.LLIIIL;
        this.LL = f6 / f7;
        float LIZ = C43881HKb.LIZ(this.LLFFF - r2, f7, f6, f5);
        this.LJLJL.setColor(this.LJLJJL);
        if (this.LJLJJLL) {
            this.LJLJL.setStrokeCap(Paint.Cap.ROUND);
        }
        float f8 = this.LJZ;
        canvas.drawLine(f8, this.LJZL, Math.max(f8, LIZ - this.LLFII), this.LJZL, this.LJLJL);
        float min = Math.min(this.LJZI, this.LLFII + LIZ);
        float f9 = this.LJZL;
        canvas.drawLine(min, f9, this.LJZI, f9, this.LJLJL);
        if (this.LLFF) {
            int i = this.LLIIIL;
            int i2 = this.LLIIIJ;
            int i3 = this.LLF;
            if (i <= i3 && i3 <= i2) {
                this.LJLJL.setColor(this.LJLLLL);
                float f10 = ((this.LLF - this.LLIIIL) * this.LL) + this.LJZ;
                float f11 = this.LJLZ / 2.0f;
                float f12 = this.LJZL;
                canvas.drawLine(f10, f12 - f11, f10, f12 + f11, this.LJLJL);
            }
        }
        int i4 = this.LLIIIL;
        if (this.LLIIIJ >= 0) {
            if (i4 <= 0) {
                f = ((-i4) * this.LL) + this.LJZ;
            }
            f = this.LJZ;
        } else {
            if (i4 <= 0) {
                f = this.LJZI;
            }
            f = this.LJZ;
        }
        if (this.LLIFFJFJJ) {
            Paint paint = this.LJLL;
            if (paint != null) {
                paint.setColor(this.LJLJI);
            } else {
                paint = this.LJLJL;
                paint.setColor(this.LJLJI);
            }
            if (this.LJLJJLL) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            }
            float f13 = this.LJZL;
            float f14 = this.LLFII;
            if (LIZ > f + f14) {
                f3 = LIZ - f14;
            } else if (LIZ < f - f14) {
                f3 = f14 + LIZ;
            } else {
                f3 = f;
            }
            canvas.drawLine(f, f13, f3, f13, paint);
        }
        if (this.LJLLJ) {
            if (this.LJLLL != 0.0f) {
                this.LJLJLJ.setColor(this.LJLLI);
                this.LJLJLJ.setStyle(Paint.Style.STROKE);
                canvas.drawCircle(LIZ, this.LJZL, (this.LJLLL / 2) + this.LLFII, this.LJLJLJ);
            }
            this.LJLJLJ.setColor(this.LJLLILLLL);
            this.LJLJLJ.setStyle(Paint.Style.FILL);
            canvas.drawCircle(LIZ, this.LJZL, this.LLFII, this.LJLJLJ);
        }
        if (this.LLII && this.LLIIII) {
            String valueOf = String.valueOf(this.LLFFF);
            this.LJLJLLL.getTextBounds(valueOf, 0, valueOf.length(), this.LJLLLLLL);
            float width = LIZ - (this.LJLLLLLL.width() / 2.0f);
            if (this.LJLJJI == C56A.UP) {
                f2 = (this.LJZL - this.LLFII) - this.LJLIL;
            } else {
                f2 = this.LJZL + this.LLFII + this.LJLIL;
            }
            canvas.drawText(valueOf, width, f2, this.LJLJLLL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int LIZ;
        if (motionEvent == null || !this.LJLLJ) {
            return false;
        }
        motionEvent.getAction();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        if (this.LLFZ) {
                            this.LLFZ = false;
                        }
                    }
                } else if (this.LLFZ && this.LLFFF != (LIZ = LIZ(motionEvent))) {
                    setCurrPosition(LIZ);
                }
            } else {
                if (this.LLFZ) {
                    this.LLFZ = false;
                    int LIZ2 = LIZ(motionEvent);
                    if (this.LLFFF != LIZ2) {
                        setCurrPosition(LIZ2);
                    }
                    if (this.LLIIIILZ) {
                        int i = this.LLFFF;
                        int i2 = this.LLIIIL;
                        int i3 = this.LLIIIJ;
                        float f = (i - i2) / (i3 - i2);
                        if (f < 0.05f) {
                            setCurrPosition(i2);
                        } else if (f > 0.95f) {
                            setCurrPosition(i3);
                        }
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat.addUpdateListener(new AUListenerS91S0100000_2(this, 26));
                    ofFloat.addListener(new ALAdapterS1S0100000_2(this, 16));
                    ofFloat.setInterpolator(getEaseOut());
                    ofFloat.setDuration(2000L);
                    ofFloat.start();
                    this.LJLILLLLZI = ofFloat;
                }
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (this.LLI) {
            float y = motionEvent.getY();
            float measuredHeight = getMeasuredHeight() / 2.0f;
            this.LJZL = measuredHeight;
            float f2 = this.LLFII + LLIIIZ;
            float f3 = measuredHeight - f2;
            if (y > measuredHeight + f2 || f3 > y) {
                return false;
            }
            Animator animator = this.LJLILLLLZI;
            if (animator != null) {
                animator.cancel();
            }
            int LIZ3 = LIZ(motionEvent);
            if (this.LLFFF != LIZ3) {
                setCurrPosition(LIZ3);
            }
            this.LLFZ = true;
            this.LLII = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            C132105Gk.LIZIZ(R.string.fpm);
            return true;
        }
        invalidate();
        return true;
    }

    public final void setCurrPosition(int i) {
        if (this.LLFFF != i) {
            this.LLFFF = Math.max(Math.min(i, this.LLIIIJ), this.LLIIIL);
            invalidate();
        }
    }

    public final void setDefaultPosition(int i) {
        this.LLF = i;
    }

    public final void setDrawColorProgress(boolean z) {
        this.LLIFFJFJJ = z;
        invalidate();
    }

    public final void setDrawDefaultPoint(boolean z) {
        this.LLFF = z;
    }

    public final void setDrawProgressText(boolean z) {
        this.LLIIII = z;
        invalidate();
    }

    public final void setEnableSliding(boolean z) {
        this.LLI = z;
    }

    public final void setProcessLineColor(int i) {
        this.LJLJI = i;
        postInvalidate();
    }

    public final void setProcessTextPosition(C56A position) {
        o.LJIIIZ(position, "position");
        this.LJLJJI = position;
        if (position == C56A.DOWN) {
            this.LJLIL = C134855Qz.LIZ(10.5f);
        }
        postInvalidate();
    }

    public final void setTextTypeface(Typeface font) {
        o.LJIIIZ(font, "font");
        this.LJLJLLL.setTypeface(font);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131015Cf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float f;
        a1.LJFF(context, "context");
        this.LJLIL = C134855Qz.LIZ(5.5f);
        this.LJLJI = 1073741824;
        this.LJLJJI = C56A.UP;
        this.LJLJJL = ColorProtector.parseColor("#66FFFFFF");
        Paint paint = new Paint(1);
        this.LJLJL = paint;
        Paint paint2 = new Paint(1);
        this.LJLJLJ = paint2;
        Paint paint3 = new Paint(1);
        this.LJLJLLL = paint3;
        int parseColor = ColorProtector.parseColor("#FFFFFF");
        this.LJLLI = -1;
        this.LJLLILLLL = -1;
        this.LJLLJ = true;
        this.LJLLLL = ColorProtector.parseColor("#363636");
        float LIZ = C134855Qz.LIZ(10.0f);
        this.LJLLLLLL = new Rect();
        this.LJLZ = C134855Qz.LIZ(6.0f);
        this.LL = 1.0f;
        this.LLF = -1;
        this.LLFF = true;
        this.LLI = true;
        this.LLIFFJFJJ = true;
        this.LLII = true;
        this.LLIIII = true;
        this.LLIIIJ = 100;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aa0, R.attr.aa2, R.attr.ad4, R.attr.adg, R.attr.afb, R.attr.afc, R.attr.afd, R.attr.afe, R.attr.aof, R.attr.aoh, R.attr.aol, R.attr.b1y, R.attr.b60, R.attr.ba1});
        this.LJLJI = obtainStyledAttributes.getColor(8, ColorProtector.parseColor("#fe2c55"));
        int color = obtainStyledAttributes.getColor(4, -1);
        this.LJLLILLLL = color;
        this.LJLLI = obtainStyledAttributes.getColor(5, -1);
        this.LLFF = obtainStyledAttributes.getBoolean(0, true);
        this.LJLJJL = obtainStyledAttributes.getColor(9, ColorProtector.parseColor("#66FFFFFF"));
        boolean z = obtainStyledAttributes.getBoolean(11, true);
        this.LJLLJ = z;
        if (z) {
            f = obtainStyledAttributes.getDimensionPixelSize(6, C134855Qz.LIZ(7.5f));
        } else {
            f = 0.0f;
        }
        this.LLFII = f;
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, C134855Qz.LIZ(2.0f));
        this.LJLLL = dimensionPixelSize;
        int color2 = obtainStyledAttributes.getColor(13, 1073741824);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(10, C134855Qz.LIZ(2.0f));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(12, C134855Qz.LIZ(2.0f));
        this.LLIIIILZ = obtainStyledAttributes.getBoolean(2, false);
        this.LJLJJLL = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(dimensionPixelSize2);
        paint.setShadowLayer(C134855Qz.LIZ(1.0f), 0.0f, 0.0f, color2);
        if (dimensionPixelSize3 > 0 && dimensionPixelSize3 != dimensionPixelSize2) {
            Paint paint4 = new Paint(1);
            paint4.setStyle(Paint.Style.FILL_AND_STROKE);
            paint4.setStrokeWidth(dimensionPixelSize3);
            paint4.setColor(this.LJLJI);
            this.LJLL = paint4;
        }
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(color);
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setShadowLayer(C134855Qz.LIZ(3.0f), 0.0f, 0.0f, color2);
        paint3.setColor(parseColor);
        paint3.setTextSize(LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
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
            if (r0 == r2) goto L76
            if (r0 == 0) goto L68
            if (r0 == r3) goto L76
            r5 = 0
        L10:
            int r4 = android.view.View.MeasureSpec.getSize(r11)
            int r0 = r9.LLIIIL
            java.lang.String r7 = java.lang.String.valueOf(r0)
            android.graphics.Paint r6 = r9.LJLJLLL
            int r1 = r7.length()
            android.graphics.Rect r0 = r9.LJLLLLLL
            r6.getTextBounds(r7, r8, r1, r0)
            android.graphics.Rect r0 = r9.LJLLLLLL
            int r0 = r0.height()
            float r1 = r9.LLFII
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
            if (r0 == r2) goto L63
            if (r0 == r3) goto L4a
            r4 = r1
        L4a:
            r9.setMeasuredDimension(r5, r4)
            boolean r0 = r9.LLIIIILZ
            if (r0 == 0) goto L55
            r0 = 0
        L52:
            r9.LLD = r0
            return
        L55:
            float r1 = r9.LLFII
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = X.C134855Qz.LIZ(r0)
            float r0 = (float) r0
            float r0 = java.lang.Math.max(r1, r0)
            goto L52
        L63:
            int r4 = java.lang.Math.min(r1, r4)
            goto L4a
        L68:
            android.content.Context r1 = r9.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r5 = X.C134855Qz.LIZIZ(r1)
            goto L10
        L76:
            int r5 = android.view.View.MeasureSpec.getSize(r10)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131015Cf.onMeasure(int, int):void");
    }
}
