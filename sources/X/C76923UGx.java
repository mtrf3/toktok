package X;

import Y.ARunnableS19S0000000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UGx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76923UGx extends View {
    public static Drawable LLJJIJI;
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public final int LJLLLL;
    public final Paint LJLLLLLL;
    public final Paint LJLZ;
    public final Paint LJZ;
    public final Paint LJZI;
    public final Paint LJZL;
    public final Paint LL;
    public final RectF LLD;
    public final RectF LLF;
    public final RectF LLFF;
    public int LLFFF;
    public int LLFII;
    public String LLFZ;
    public float LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final Context LLIIII;
    public boolean LLIIIILZ;
    public final Rect LLIIIJ;
    public C76925UGz LLIIIL;
    public String LLIIIZ;
    public final float LLIIJI;
    public final float LLIIJLIL;
    public final float LLIIL;
    public final float LLIILII;
    public int LLIILZL;
    public final float LLIIZ;
    public final float LLIL;
    public final int LLILII;
    public final boolean LLILIL;
    public final float LLILL;
    public final int LLILLIZIL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public Boolean LLILZLL;
    public boolean LLIZ;
    public ValueAnimator LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public final RunnableC76924UGy LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public float LLJILLL;
    public final Handler LLJJ;
    public final ARunnableS19S0000000_13 LLJJI;
    public InterfaceC75226Tfi LLJJIII;

    public void setIsTwoWayMode(boolean z) {
    }

    public final boolean LIZIZ() {
        int i;
        if (this.LLILZ != 0 || ((i = this.LLILZIL) != 0 && i != 100)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        this.LJLLILLLL = this.LJLIL / 2;
        if (this.LJLJJL) {
            this.LJLLJ = C15380j0.LIZ(32.0f);
        } else {
            this.LJLLJ = ((int) (this.LJLILLLLZI - this.LJLL)) / 2;
        }
        this.LJLLL = (this.LJLIL - (this.LLILL * 2.0f)) / this.LLILLJJLI;
        this.LLIIIILZ = true;
        invalidate();
    }

    public final void LJ() {
        if (!this.LJLJJL) {
            return;
        }
        removeCallbacks(this.LLJIJIL);
        if (this.LLJ || TextUtils.isEmpty(this.LLFZ)) {
            return;
        }
        ValueAnimator valueAnimator = this.LLIZLLLIL;
        if (valueAnimator != null) {
            C16880lQ.LJLJL(valueAnimator);
            this.LLIZLLLIL.cancel();
        }
        this.LL.setShadowLayer(C15380j0.LIZ(3.0f), 0.0f, 0.0f, this.LJLLI);
        setTextAlpha(255);
        this.LLJ = true;
        invalidate();
    }

    @Override // android.view.View
    public final void buildDrawingCache() {
        if (Build.VERSION.SDK_INT >= 23 || getWidth() * getHeight() * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    public int getPercent() {
        return this.LLFFF;
    }

    public final int LIZ(int i) {
        int i2;
        int i3;
        int i4 = this.LLILLIZIL;
        if (i4 > 1) {
            if (i % i4 >= i4 / 2.0f) {
                i3 = (i / i4) + 1;
            } else {
                i3 = i / i4;
            }
            i = i3 * i4;
        }
        if (i > this.LLILLJJLI) {
            i2 = this.LLILLL;
        } else if (i <= 0) {
            i2 = this.LLILZ;
        } else {
            i2 = i + this.LLILZ;
        }
        if (LIZIZ()) {
            int i5 = this.LLILZIL;
            if (i2 > i5 - 1 && i2 < i5 + 1) {
                return i5;
            }
            return i2;
        }
        return i2;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z) {
        if (Build.VERSION.SDK_INT >= 23 || getWidth() * getHeight() * 4 < 838860800) {
            super.buildDrawingCache(z);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i;
        int i2;
        super.onDraw(canvas);
        if (!this.LLIIIILZ) {
            return;
        }
        int i3 = this.LLFFF;
        int i4 = this.LLILZ;
        float f = this.LLILL;
        float f2 = this.LJLLL;
        float f3 = ((i3 - i4) * f2) + f;
        float f4 = ((this.LLILZIL - i4) * f2) + f;
        int i5 = this.LJLLJ;
        this.LLF.set((int) f, i5, (int) (this.LJLIL - f), i5 + this.LJLL);
        RectF rectF = this.LLF;
        float f5 = this.LJLJLLL;
        canvas.drawRoundRect(rectF, f5, f5, this.LJLZ);
        if (this.LLILZLL.booleanValue()) {
            RectF rectF2 = this.LLD;
            float f6 = this.LLILL;
            int i6 = this.LJLLJ;
            rectF2.set(f6, i6, f3, i6 + this.LJLL);
            RectF rectF3 = this.LLD;
            float f7 = this.LJLJLLL;
            canvas.drawRoundRect(rectF3, f7, f7, this.LJLLLLLL);
        } else {
            RectF rectF4 = this.LLD;
            int i7 = this.LJLLJ;
            rectF4.set(f3, i7, f4, i7 + this.LJLL);
            canvas.drawRect(this.LLD, this.LJLLLLLL);
        }
        this.LJZ.setAlpha(255);
        this.LJZI.setAlpha(255);
        this.LL.setAlpha(255);
        this.LJZL.setAlpha(255);
        if (this.LLILIL) {
            canvas.drawCircle(f3, (this.LJLL / 2.0f) + this.LJLLJ, this.LLIIJLIL, this.LJZ);
            int i8 = this.LLILZIL;
            if (i8 >= this.LLILZ && i8 <= this.LLILLL && LIZIZ()) {
                canvas.drawCircle(f4, (this.LJLL / 2.0f) + this.LJLLJ, C15380j0.LIZ(4.0f), this.LJZI);
            }
        } else {
            RectF rectF5 = this.LLFF;
            float f8 = this.LLIIL;
            int i9 = this.LJLLJ;
            float f9 = this.LLIILII;
            float f10 = this.LJLL;
            rectF5.set(f3 - (f8 / 2.0f), i9 - ((f9 - f10) / 2.0f), (f8 / 2.0f) + f3, ((f9 + f10) / 2.0f) + i9);
            RectF rectF6 = this.LLFF;
            float f11 = this.LLIIJLIL;
            canvas.drawRoundRect(rectF6, f11, f11, this.LJZ);
            int i10 = this.LLILZIL;
            if (i10 >= this.LLILZ && i10 <= this.LLILLL && LIZIZ()) {
                float f12 = this.LLIIZ;
                int i11 = this.LJLLJ;
                canvas.drawRect(f4 - (f12 / 2.0f), i11, (f12 / 2.0f) + f4, i11 + this.LLIL, this.LJZI);
            }
        }
        int i12 = this.LLJI;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.LLFFF;
        }
        if (this.LJLJJL) {
            if (this.LLJILLL == 0.0f) {
                str = String.valueOf(i12);
            } else {
                str = this.LLJILJILJ;
                if (str == null) {
                    str = "";
                }
            }
            if (TextUtils.isEmpty(this.LLIIIZ) || TextUtils.isEmpty(str)) {
                this.LLFZ = str;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                this.LLFZ = C025908h.LIZIZ(LIZ, this.LLIIIZ, " ", str, LIZ);
            }
            if (TextUtils.isEmpty(this.LLFZ)) {
                return;
            }
            if (this.LLIZ) {
                paint = this.LL;
            } else {
                paint = this.LJZL;
            }
            Paint paint2 = this.LJZL;
            String str2 = this.LLFZ;
            paint2.getTextBounds(str2, 0, str2.length(), this.LLIIIJ);
            int width = this.LLIIIJ.width();
            int LIZ2 = C15380j0.LIZ(14.0f);
            if (this.LLIZ) {
                i = this.LJLLILLLL;
            } else {
                i = (int) f3;
            }
            int LIZ3 = (i - (width / 2)) - C15380j0.LIZ(1.0f);
            int i13 = this.LJLLJ - LIZ2;
            Drawable drawable = LLJJIJI;
            if (!this.LLIZ && drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int max = Math.max(width, intrinsicWidth);
                float f13 = this.LLJILLL;
                if (f13 == 1.0f) {
                    i2 = this.LLJILJIL;
                    max += intrinsicWidth;
                } else if (f13 > 0.0f) {
                    max = (int) ((intrinsicWidth * f13) + ((int) (((max - intrinsicWidth) * f13) + r1)));
                    i2 = 255;
                } else {
                    i2 = this.LLJILJIL;
                }
                float LIZ4 = this.LJLLJ - C15380j0.LIZ(57.0f);
                drawable.setAlpha(i2);
                drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
                canvas.save();
                canvas.translate(i - (max / 2.0f), LIZ4);
                drawable.draw(canvas);
                canvas.restore();
            }
            if (CCJ.LIZ(this.LLIIII)) {
                paint.setTextScaleX(-1.0f);
                LIZ3 += C15380j0.LIZ(1.0f) + width;
            } else {
                paint.setTextScaleX(1.0f);
            }
            float f14 = this.LLJILLL;
            if (f14 > 0.0f && f14 < 1.0f) {
                int alpha = paint.getAlpha();
                paint.setAlpha((int) (this.LLJILLL * 255.0f));
                canvas.drawText(this.LLFZ, LIZ3, i13, paint);
                paint.setAlpha(alpha);
                return;
            }
            canvas.drawText(this.LLFZ, LIZ3, i13, paint);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0164, code lost:
    
        if (java.lang.Math.abs(r9 - r10.LJLLJ) <= (r10.LJLJI * 2.5d)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c6, code lost:
    
        if (java.lang.Math.abs(r9 - r10.LJLLJ) <= r10.LLIILII) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76923UGx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setLevelAdjustBarTitle(String str) {
        this.LLIIIZ = str;
    }

    public void setOnLevelChangeListener(UH1 uh1) {
        this.LLIIIL = new C76925UGz(this, uh1);
    }

    public void setPercent(int i) {
        this.LLFFF = i;
        invalidate();
    }

    public void setTextAlpha(int i) {
        this.LLJILJIL = i;
        this.LL.setAlpha(i);
        this.LJZL.setAlpha(i);
    }

    public void setTextInCenter(boolean z) {
        this.LLIZ = z;
    }

    public void setUpUiColor(boolean z) {
        this.LJLLLLLL.setColor(this.LJLJL);
        if (z) {
            this.LJLLLLLL.setShadowLayer(C15380j0.LIZ(1.0f), 0.0f, 0.0f, this.LJLLI);
        }
        this.LJLZ.setColor(this.LJLJLJ);
        if (z) {
            this.LJLZ.setShadowLayer(C15380j0.LIZ(1.0f), 0.0f, 0.0f, this.LJLLI);
        }
        this.LJZ.setColor(this.LLIILZL);
        if (z) {
            this.LJZ.setShadowLayer(C15380j0.LIZ(3.0f), 0.0f, 0.0f, this.LJLLI);
        }
        this.LJZI.setColor(this.LLILII);
        this.LJZL.setColor(this.LJLLLL);
        this.LL.setColor(this.LJLJL);
        setTextAlpha(this.LLJILJIL);
        if (LLJJIJI == null) {
            LLJJIJI = getResources().getDrawable(R.drawable.ckc);
        }
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        InterfaceC75226Tfi interfaceC75226Tfi = this.LLJJIII;
        if (interfaceC75226Tfi != null) {
            interfaceC75226Tfi.LJIJJ(visibility, i);
        }
    }

    public void setVisibilityListener(InterfaceC75226Tfi interfaceC75226Tfi) {
        this.LLJJIII = interfaceC75226Tfi;
    }

    public C76923UGx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C15380j0.LIZ(9.0f);
        this.LJLJJI = C15380j0.LIZ(10.0f);
        this.LJLJJL = true;
        this.LJLJJLL = true;
        this.LJLL = 0.0f;
        this.LLD = new RectF();
        this.LLF = new RectF();
        this.LLFF = new RectF();
        this.LLII = true;
        this.LLIIIILZ = false;
        this.LLIIIJ = new Rect();
        this.LLIIIZ = null;
        this.LLIIJI = 0.0f;
        this.LLIIJLIL = 0.0f;
        this.LLIIL = 0.0f;
        this.LLIILII = 0.0f;
        this.LLIILZL = 0;
        this.LLIIZ = 0.0f;
        this.LLIL = 0.0f;
        this.LLILII = 0;
        this.LLILIL = true;
        this.LLILL = C15380j0.LIZ(40.0f);
        this.LLILZLL = Boolean.TRUE;
        this.LLIZ = false;
        this.LLJ = true;
        this.LLJI = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LLJIJIL = new RunnableC76924UGy(this);
        this.LLJILJIL = 0;
        this.LLJILLL = 0.1f;
        this.LLJJ = new Handler(C16880lQ.LLJJJJ());
        this.LLJJI = new ARunnableS19S0000000_13(0);
        this.LLIIII = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bo7, R.attr.bo8, R.attr.bo9, R.attr.bo_, R.attr.boa, R.attr.boc, R.attr.bod, R.attr.boe, R.attr.bof, R.attr.bog, R.attr.bpd, R.attr.bpe, R.attr.bpf, R.attr.bpg, R.attr.bph, R.attr.bpi, R.attr.bpl, R.attr.bpm, R.attr.bpn, R.attr.bpo});
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 13);
            this.LLIIIZ = LLLZLZ == null ? "" : LLLZLZ;
            obtainStyledAttributes.getColor(14, -16777216);
            this.LLIIJI = obtainStyledAttributes.getDimension(15, C15380j0.LIZ(14.0f));
            this.LLILL = obtainStyledAttributes.getDimension(3, C15380j0.LIZ(40.0f));
            this.LLIIJLIL = obtainStyledAttributes.getDimension(18, C15380j0.LIZ(9.0f));
            this.LLIIL = obtainStyledAttributes.getDimension(19, C15380j0.LIZ(9.0f));
            this.LLIILII = obtainStyledAttributes.getDimension(17, C15380j0.LIZ(9.0f));
            this.LLIILZL = obtainStyledAttributes.getColor(16, C15380j0.LIZIZ(R.color.abc));
            obtainStyledAttributes.getDimension(8, C15380j0.LIZ(9.0f));
            this.LLIIZ = obtainStyledAttributes.getDimension(9, C15380j0.LIZ(9.0f));
            this.LLIL = obtainStyledAttributes.getDimension(7, C15380j0.LIZ(9.0f));
            this.LLILII = obtainStyledAttributes.getColor(6, C15380j0.LIZIZ(R.color.abc));
            this.LLILIL = obtainStyledAttributes.getBoolean(5, true);
            this.LJLL = obtainStyledAttributes.getDimension(1, C15380j0.LIZ(4.0f));
            this.LLILLIZIL = obtainStyledAttributes.getInt(11, 1);
            this.LJLJL = obtainStyledAttributes.getColor(0, C15380j0.LIZIZ(R.color.abc));
            this.LJLJLJ = obtainStyledAttributes.getColor(2, C15380j0.LIZIZ(R.color.abd));
            this.LJLJLLL = obtainStyledAttributes.getDimension(4, C15380j0.LIZ(3.0f));
            this.LJLJJL = obtainStyledAttributes.getBoolean(10, true);
            this.LJLJJLL = obtainStyledAttributes.getBoolean(12, true);
            obtainStyledAttributes.recycle();
        }
        setLayerType(1, null);
        this.LJLLI = 1073741824;
        C15380j0.LIZIZ(R.color.cz);
        this.LJLLLL = C15380j0.LIZIZ(R.color.abc);
        Paint paint = new Paint();
        this.LJLLLLLL = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.LJLZ = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.LJZ = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.LJZI = paint4;
        paint4.setStyle(Paint.Style.FILL);
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint();
        this.LJZL = paint5;
        paint5.setTextSize(this.LLIIJI);
        paint5.setAntiAlias(true);
        Paint paint6 = new Paint();
        this.LL = paint6;
        paint6.setTextSize(this.LLIIJI);
        paint6.setAntiAlias(true);
        if (CCJ.LIZ(context)) {
            setScaleX(-1.0f);
        }
        setUpUiColor(true);
    }

    public final void LIZJ(int i, int i2, int i3, boolean z) {
        this.LLILLL = i;
        this.LLILZ = i2;
        if (i3 <= i && i3 >= i2) {
            this.LLILZIL = i3;
        } else {
            this.LLILZIL = i;
        }
        this.LLILLJJLI = i - i2;
        this.LLILZLL = Boolean.valueOf(z);
        if (this.LJLIL > 0 && this.LJLILLLLZI > 0) {
            LIZLLL();
        }
        invalidate();
        this.LLJILJILJ = null;
        this.LLJILLL = 0.0f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI != getMeasuredHeight() || this.LJLIL != getMeasuredWidth()) {
            this.LJLIL = getMeasuredWidth();
            this.LJLILLLLZI = getMeasuredHeight();
            LIZLLL();
        }
    }
}
