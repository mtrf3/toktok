package X;

import Y.ALAdapterS11S0100000_14;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VuJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81227VuJ extends View {
    public static final /* synthetic */ int LLILLL = 0;
    public Context LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public boolean LJLLI;
    public float LJLLILLLL;
    public float LJLLJ;
    public String LJLLL;
    public int LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public Paint LLI;
    public Paint LLIFFJFJJ;
    public Paint LLII;
    public Paint LLIIII;
    public Paint LLIIIILZ;
    public Paint LLIIIJ;
    public Paint LLIIIL;
    public String LLIIIZ;
    public int LLIIJI;
    public Rect LLIIJLIL;
    public boolean LLIIL;
    public Drawable LLIILII;
    public Drawable LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public final C62822Ol8 LLILLIZIL;
    public C81230VuM LLILLJJLI;

    public final C81229VuL getMPercentCalculator() {
        return (C81229VuL) this.LLILLIZIL.getValue();
    }

    public void LJ() {
        this.LLI.setStyle(Paint.Style.FILL);
        this.LLI.setStrokeWidth(this.LJZ);
        this.LLI.setStrokeCap(Paint.Cap.ROUND);
        this.LLI.setAntiAlias(true);
        this.LLIFFJFJJ.setStyle(Paint.Style.FILL);
        this.LLIFFJFJJ.setStrokeWidth(this.LJZ);
        this.LLIFFJFJJ.setStrokeCap(Paint.Cap.ROUND);
        this.LLIFFJFJJ.setAntiAlias(true);
    }

    public void LJI() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LLILL = (int) C74275TDb.LIZIZ(context, 32.0f);
        this.LJLL = (this.LLILII - (this.LJZI * 2)) / this.LJLJJI;
        this.LLIL = true;
        invalidate();
    }

    public final float getMAttrsBarPadding() {
        return this.LJZI;
    }

    public final float getMAttrsLineWidth() {
        return this.LJZ;
    }

    public final float getMAttrsSlideRadius() {
        return this.LJLZ;
    }

    public final String getMAttrsText() {
        return this.LJLLL;
    }

    public final int getMAttrsTextColor() {
        return this.LJLLLL;
    }

    public final float getMAttrsTextSize() {
        return this.LJLLLLLL;
    }

    public final int getMBarLocationY() {
        return this.LLILL;
    }

    public final int getMColorBlack() {
        return this.LLD;
    }

    public final int getMColorBlackHint() {
        return this.LLF;
    }

    public final int getMColorCircle() {
        return this.LLFII;
    }

    public final int getMColorText() {
        return this.LLFZ;
    }

    public final int getMColorTextShadow() {
        return this.LLFF;
    }

    public final int getMColorTransparent() {
        return this.LLFFF;
    }

    public final int getMColorWhite() {
        return this.LJZL;
    }

    public final int getMColorWhiteHint() {
        return this.LL;
    }

    public final Context getMContext() {
        return this.LJLIL;
    }

    public final int getMCurSelectPercent() {
        return this.LJLJJLL;
    }

    public final float getMCurSelectPoint() {
        return this.LJLLJ;
    }

    public final float getMCurTouchPoint() {
        return this.LJLLILLLL;
    }

    public final int getMDefaultPercent() {
        return this.LJLJLJ;
    }

    public final boolean getMHasInit() {
        return this.LLIL;
    }

    public final int getMMaxPercent() {
        return this.LJLJI;
    }

    public final int getMMinPercent() {
        return this.LJLILLLLZI;
    }

    public final boolean getMNeedShowSuggestPercentCircle() {
        return this.LJLLI;
    }

    public final int getMOriginPercent() {
        return this.LJLJJL;
    }

    public final Paint getMPaintBar() {
        return this.LLI;
    }

    public final Paint getMPaintBarHint() {
        return this.LLIFFJFJJ;
    }

    public final Paint getMPaintCircle() {
        return this.LLII;
    }

    public final Paint getMPaintDefaultCircle() {
        return this.LLIIII;
    }

    public final Paint getMPaintSuggestCircle() {
        return this.LLIIIL;
    }

    public final Paint getMPaintTextCenter() {
        return this.LLIIIJ;
    }

    public final Paint getMPaintTextFollow() {
        return this.LLIIIILZ;
    }

    public final int getMPercentRange() {
        return this.LJLJJI;
    }

    public final float getMPercentStep() {
        return this.LJLJLLL;
    }

    public final float getMPercentStepLength() {
        return this.LJLL;
    }

    public final int getMSuggestPercent() {
        return this.LJLJL;
    }

    public final String getMText() {
        return this.LLIIIZ;
    }

    public final int getMTextAlpha() {
        return this.LLIIJI;
    }

    public final Rect getMTextBounds() {
        return this.LLIIJLIL;
    }

    public final boolean getMTouchable() {
        return this.LLIIZ;
    }

    public final boolean getMUseBlackUi() {
        return this.LLIIL;
    }

    public final int getMViewHeight() {
        return this.LLILIL;
    }

    public final int getMViewWidth() {
        return this.LLILII;
    }

    public final int getMaxPercent() {
        return this.LJLJI;
    }

    public final int getMinPercent() {
        return this.LJLILLLLZI;
    }

    public final int getPercent() {
        return this.LJLJJLL;
    }

    public final Drawable getSTextBlackBg() {
        return this.LLIILZL;
    }

    public final Drawable getSTextWhiteBg() {
        return this.LLIILII;
    }

    public final int getSuggestPercent() {
        return this.LJLJL;
    }

    private final void setCurrentPercent(int i) {
        setPercent(i);
        invalidate();
        sendAccessibilityEvent(4);
    }

    private final void setTextAlpha(int i) {
        this.LLIIJI = i;
        this.LLIIIJ.setAlpha(i);
        this.LLIIIILZ.setAlpha(i);
    }

    public final void LJII(boolean z) {
        this.LLI.setColor(this.LJZL);
        if (z) {
            Paint paint = this.LLI;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            paint.setShadowLayer(C74275TDb.LIZIZ(context, 1.0f), 0.0f, 0.0f, this.LLFF);
        }
        this.LLIFFJFJJ.setColor(this.LL);
        if (z) {
            Paint paint2 = this.LLIFFJFJJ;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            paint2.setShadowLayer(C74275TDb.LIZIZ(context2, 1.0f), 0.0f, 0.0f, this.LLFF);
        }
        this.LLII.setColor(this.LLFII);
        if (z) {
            Paint paint3 = this.LLII;
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            paint3.setShadowLayer(C74275TDb.LIZIZ(context3, 3.0f), 0.0f, 0.0f, this.LLFF);
        }
        this.LLIIII.setColor(this.LJZL);
        this.LLIIIL.setColor(getResources().getColor(R.color.white));
        this.LLIIIILZ.setColor(this.LLFZ);
        this.LLIIIJ.setColor(this.LJZL);
        setTextAlpha(this.LLIIJI);
        this.LLIIL = false;
        if (this.LLIILII == null) {
            this.LLIILII = getResources().getDrawable(com.zhiliaoapp.musically.R.drawable.q8);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.LLIL) {
            return;
        }
        float LIZ = getMPercentCalculator().LIZ(this.LJLJJLL);
        float LIZ2 = getMPercentCalculator().LIZ(this.LJLJLJ);
        float LIZ3 = getMPercentCalculator().LIZ(this.LJLJL);
        getMPercentCalculator().LIZ(this.LJLJJL);
        LIZ(LIZ, canvas);
        LIZJ(LIZ, canvas);
        this.LLII.setAlpha(255);
        this.LLIIII.setAlpha(255);
        this.LLIIIL.setAlpha(255);
        this.LLIIIJ.setAlpha(255);
        this.LLIIIILZ.setAlpha(255);
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        int i3 = this.LJLJLJ;
        if (i <= i3 && i2 >= i3 && (i != 0 || (i3 != i && i3 != i2))) {
            float f = this.LLILL;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            canvas.drawCircle(LIZ2, f, C74275TDb.LIZIZ(context, 2.0f), this.LLIIII);
        }
        int i4 = this.LJLILLLLZI;
        int i5 = this.LJLJI;
        int i6 = this.LJLJL;
        if (i4 <= i6 && i5 >= i6 && this.LJLLI) {
            float f2 = this.LLILL;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            canvas.drawCircle(LIZ3, f2, C74275TDb.LIZIZ(context2, 3.0f), this.LLIIIL);
        }
        LIZIZ(LIZ, canvas);
        String valueOf = String.valueOf(this.LJLJJLL);
        if (!TextUtils.isEmpty(this.LJLLL) && !TextUtils.isEmpty(valueOf)) {
            StringBuilder LIZ4 = X1D.LIZ();
            valueOf = C0MT.LIZ(LIZ4, this.LJLLL, ' ', valueOf, LIZ4);
        }
        this.LLIIIZ = valueOf;
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        Paint paint = this.LLIIIILZ;
        String str = this.LLIIIZ;
        paint.getTextBounds(str, 0, str.length(), this.LLIIJLIL);
        int width = this.LLIIJLIL.width();
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context3, 14.0f);
        int i7 = (int) LIZ;
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        int LIZIZ2 = (i7 - (width / 2)) - ((int) C74275TDb.LIZIZ(context4, 1.0f));
        int i8 = this.LLILL - LIZIZ;
        if (this.LLIIL) {
            drawable = this.LLIILZL;
        } else {
            drawable = this.LLIILII;
        }
        if (drawable != null) {
            int max = Math.max(width, drawable.getIntrinsicWidth());
            int i9 = this.LLIIJI;
            float f3 = i7 - (max / 2.0f);
            float f4 = this.LLILL;
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "context");
            float LIZIZ3 = f4 - C74275TDb.LIZIZ(context5, 57.0f);
            drawable.setAlpha(i9);
            drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
            canvas.save();
            canvas.translate(f3, LIZIZ3);
            drawable.draw(canvas);
            canvas.restore();
        }
        LIZLLL(canvas, LIZIZ2, i8, paint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        if (Build.VERSION.SDK_INT >= 24) {
            info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        }
        if (isEnabled()) {
            if (this.LJLJJLL > this.LJLILLLLZI) {
                info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (this.LJLJJLL < this.LJLJI) {
                info.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(0, this.LJLILLLLZI, this.LJLJI, this.LJLJJLL);
        o.LJIIIIZZ(obtain, "AccessibilityNodeInfo.Ra…t.toFloat()\n            )");
        info.setRangeInfo(obtain);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent event) {
        o.LJIIIZ(event, "event");
        super.onPopulateAccessibilityEvent(event);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        C81230VuM c81230VuM;
        o.LJIIIZ(event, "event");
        if (!this.LLIIZ) {
            return true;
        }
        if (event.getAction() == 0) {
            float x = event.getX();
            float f = this.LJZI;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            if (x < f - C74275TDb.LIZIZ(context, 10.0f)) {
                return false;
            }
            float x2 = event.getX();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            float LJ = C81184Vtc.LJ(C16880lQ.LLLLL(context2));
            float f2 = this.LJZI;
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            if (x2 > LJ - (f2 - C74275TDb.LIZIZ(context3, 10.0f))) {
                return false;
            }
            if (Math.abs(event.getY() - this.LLILL) > this.LLILIL - this.LLILL) {
                return true;
            }
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (c81230VuM = this.LLILLJJLI) != null) {
                        c81230VuM.LIZIZ(this.LJLJJLL);
                    }
                } else {
                    this.LJLLILLLL = event.getX();
                    this.LJLLJ = event.getX();
                    int LIZIZ = getMPercentCalculator().LIZIZ(this.LJLLJ);
                    if (LIZIZ != this.LJLJJLL) {
                        this.LJLJJLL = LIZIZ;
                        C81230VuM c81230VuM2 = this.LLILLJJLI;
                        if (c81230VuM2 != null) {
                            c81230VuM2.LIZ(LIZIZ);
                        }
                        invalidate();
                    }
                }
            } else {
                this.LJLLILLLL = event.getX();
                int LIZIZ2 = getMPercentCalculator().LIZIZ(this.LJLLILLLL);
                if (this.LJLJJLL != LIZIZ2) {
                    this.LJLJJLL = LIZIZ2;
                    C81230VuM c81230VuM3 = this.LLILLJJLI;
                    if (c81230VuM3 != null) {
                        c81230VuM3.LIZ(LIZIZ2);
                    }
                    int i = this.LJLJJLL;
                    this.LLIIZ = false;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setTarget(this);
                    ofFloat.addUpdateListener(new C53835LAx(i, LIZIZ2, this));
                    ofFloat.addListener(new ALAdapterS11S0100000_14(this, 21));
                    ofFloat.setDuration(50);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.start();
                }
                C81230VuM c81230VuM4 = this.LLILLJJLI;
                if (c81230VuM4 != null) {
                    c81230VuM4.LIZIZ(this.LJLJJLL);
                }
            }
        } else {
            this.LJLLILLLL = event.getX();
            C81230VuM c81230VuM5 = this.LLILLJJLI;
            if (c81230VuM5 != null) {
                c81230VuM5.LIZLLL();
            }
        }
        C81230VuM c81230VuM6 = this.LLILLJJLI;
        if (c81230VuM6 != null) {
            c81230VuM6.LIZJ();
        }
        return true;
    }

    public void setBarHeight(float f) {
        this.LLI.setStrokeWidth(f);
        this.LLIFFJFJJ.setStrokeWidth(f);
    }

    public final void setBarPadding(float f) {
        this.LJZI = f;
        LJI();
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        try {
            Field field = View.class.getDeclaredField("mContentDescription");
            o.LJIIIIZZ(field, "field");
            field.setAccessible(true);
            field.set(this, charSequence);
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
            super.setContentDescription(charSequence);
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
            super.setContentDescription(charSequence);
        }
    }

    public final void setDefaultCircleConfig(int i) {
        this.LLIIII.setColor(getResources().getColor(i));
    }

    public final void setMAttrsBarPadding(float f) {
        this.LJZI = f;
    }

    public final void setMAttrsLineWidth(float f) {
        this.LJZ = f;
    }

    public final void setMAttrsSlideRadius(float f) {
        this.LJLZ = f;
    }

    public final void setMAttrsText(String str) {
        this.LJLLL = str;
    }

    public final void setMAttrsTextColor(int i) {
        this.LJLLLL = i;
    }

    public final void setMAttrsTextSize(float f) {
        this.LJLLLLLL = f;
    }

    public final void setMBarLocationY(int i) {
        this.LLILL = i;
    }

    public final void setMColorBlack(int i) {
        this.LLD = i;
    }

    public final void setMColorBlackHint(int i) {
        this.LLF = i;
    }

    public final void setMColorCircle(int i) {
        this.LLFII = i;
    }

    public final void setMColorText(int i) {
        this.LLFZ = i;
    }

    public final void setMColorTextShadow(int i) {
        this.LLFF = i;
    }

    public final void setMColorTransparent(int i) {
        this.LLFFF = i;
    }

    public final void setMColorWhite(int i) {
        this.LJZL = i;
    }

    public final void setMColorWhiteHint(int i) {
        this.LL = i;
    }

    public final void setMContext(Context context) {
        this.LJLIL = context;
    }

    public final void setMCurSelectPercent(int i) {
        this.LJLJJLL = i;
    }

    public final void setMCurSelectPoint(float f) {
        this.LJLLJ = f;
    }

    public final void setMCurTouchPoint(float f) {
        this.LJLLILLLL = f;
    }

    public final void setMDefaultPercent(int i) {
        this.LJLJLJ = i;
    }

    public final void setMHasInit(boolean z) {
        this.LLIL = z;
    }

    public final void setMMaxPercent(int i) {
        this.LJLJI = i;
    }

    public final void setMMinPercent(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setMNeedShowSuggestPercentCircle(boolean z) {
        this.LJLLI = z;
    }

    public final void setMOriginPercent(int i) {
        this.LJLJJL = i;
    }

    public final void setMPaintBar(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLI = paint;
    }

    public final void setMPaintBarHint(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLIFFJFJJ = paint;
    }

    public final void setMPaintCircle(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLII = paint;
    }

    public final void setMPaintDefaultCircle(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLIIII = paint;
    }

    public final void setMPaintSuggestCircle(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLIIIL = paint;
    }

    public final void setMPaintTextCenter(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLIIIJ = paint;
    }

    public final void setMPaintTextFollow(Paint paint) {
        o.LJIIIZ(paint, "<set-?>");
        this.LLIIIILZ = paint;
    }

    public final void setMPercentRange(int i) {
        this.LJLJJI = i;
    }

    public final void setMPercentStep(float f) {
        this.LJLJLLL = f;
    }

    public final void setMPercentStepLength(float f) {
        this.LJLL = f;
    }

    public final void setMSuggestPercent(int i) {
        this.LJLJL = i;
    }

    public final void setMText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLIIIZ = str;
    }

    public final void setMTextAlpha(int i) {
        this.LLIIJI = i;
    }

    public final void setMTextBounds(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LLIIJLIL = rect;
    }

    public final void setMTouchable(boolean z) {
        this.LLIIZ = z;
    }

    public final void setMUseBlackUi(boolean z) {
        this.LLIIL = z;
    }

    public final void setMViewHeight(int i) {
        this.LLILIL = i;
    }

    public final void setMViewWidth(int i) {
        this.LLILII = i;
    }

    public final void setNeedShowSuggestCircle(boolean z) {
        this.LJLLI = z;
    }

    public final void setOnLevelChangeListener(InterfaceC81231VuN onLevelChangeListener) {
        o.LJIIIZ(onLevelChangeListener, "onLevelChangeListener");
        this.LLILLJJLI = new C81230VuM(onLevelChangeListener);
    }

    public final void setPercent(int i) {
        if (this.LJLJJLL != i) {
            this.LJLJJLL = i;
            C81230VuM c81230VuM = this.LLILLJJLI;
            if (c81230VuM != null) {
                c81230VuM.LIZ(i);
            }
            invalidate();
        }
    }

    public final void setSTextBlackBg(Drawable drawable) {
        this.LLIILZL = drawable;
    }

    public final void setSTextWhiteBg(Drawable drawable) {
        this.LLIILII = drawable;
    }

    public final void setSuggestCircleColor(int i) {
        this.LLIIIL.setColor(getResources().getColor(i));
    }

    public final void setSuggestPercent(int i) {
        this.LJLJL = i;
    }

    public final void setTextSize(float f) {
        this.LLIIIJ.setTextSize(f);
        this.LLIIIILZ.setTextSize(f);
    }

    public C81227VuJ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LIZ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float f2 = this.LJZI;
        int i = this.LLILL;
        canvas.drawLine(f2, i, this.LLILII - f2, i, this.LLIFFJFJJ);
    }

    public void LIZIZ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        canvas.drawCircle(f, this.LLILL, this.LJLZ, this.LLII);
    }

    public void LIZJ(float f, Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float f2 = this.LJZI;
        int i = this.LLILL;
        canvas.drawLine(f2, i, f, i, this.LLI);
    }

    public final void LJFF(int i, int i2) {
        int i3;
        this.LJLJI = i;
        this.LJLILLLLZI = i2;
        if (i2 > 0 || i < 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this.LJLJLJ = i3;
        this.LJLJJI = i - i2;
        this.LJLJJL = 0;
        if (this.LLILII > 0 && this.LLILIL > 0) {
            LJI();
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!isEnabled()) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            if (i != 16908349) {
                return super.performAccessibilityAction(i, bundle);
            }
            if (Build.VERSION.SDK_INT < 24 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            setCurrentPercent((int) bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }
        int max = Math.max(1, Math.round((this.LJLJI - this.LJLILLLLZI) / 20));
        if (i == 8192) {
            max = -max;
        }
        setCurrentPercent(this.LJLJJLL + max);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81227VuJ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        this.LJLLI = true;
        this.LJZI = C74275TDb.LIZIZ(context, 40.0f);
        this.LLI = new Paint();
        this.LLIFFJFJJ = new Paint();
        this.LLII = new Paint();
        this.LLIIII = new Paint();
        this.LLIIIILZ = new Paint();
        this.LLIIIJ = new Paint();
        this.LLIIIL = new Paint();
        this.LLIIIZ = "";
        this.LLIIJLIL = new Rect();
        this.LLIIZ = true;
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 190));
        this.LJLIL = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{com.zhiliaoapp.musically.R.attr.xz, com.zhiliaoapp.musically.R.attr.y0, com.zhiliaoapp.musically.R.attr.y1, com.zhiliaoapp.musically.R.attr.y2, com.zhiliaoapp.musically.R.attr.y3, com.zhiliaoapp.musically.R.attr.y4, com.zhiliaoapp.musically.R.attr.y5, com.zhiliaoapp.musically.R.attr.y6});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.BeautySeekBar)");
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 5);
            this.LJLLL = LLLZLZ != null ? LLLZLZ : "";
            this.LJLLLL = obtainStyledAttributes.getColor(6, -16777216);
            this.LJLLLLLL = obtainStyledAttributes.getDimension(7, C74275TDb.LIZIZ(context, 14.0f));
            this.LJZI = obtainStyledAttributes.getDimension(0, C74275TDb.LIZIZ(context, 40.0f));
            this.LJLZ = obtainStyledAttributes.getDimension(3, C74275TDb.LIZIZ(context, 9.0f));
            this.LJZ = obtainStyledAttributes.getDimension(2, C74275TDb.LIZIZ(context, 4.0f));
            this.LJLJLLL = obtainStyledAttributes.getFloat(4, 1.0f);
            this.LLFZ = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.white));
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.LJZL = R.color.white;
            this.LL = 1040187391;
            this.LLD = com.zhiliaoapp.musically.R.color.ey;
            this.LLF = com.zhiliaoapp.musically.R.color.ek;
            this.LLFF = 1073741824;
            this.LLFFF = com.zhiliaoapp.musically.R.color.yi;
            this.LLFII = R.color.white;
            LJ();
            this.LLII.setStyle(Paint.Style.FILL);
            this.LLII.setAntiAlias(true);
            this.LLIIII.setStyle(Paint.Style.FILL);
            this.LLIIII.setAntiAlias(true);
            this.LLIIIL.setStyle(Paint.Style.FILL);
            this.LLIIIL.setAntiAlias(true);
            this.LLIIIILZ.setTextSize(this.LJLLLLLL);
            this.LLIIIILZ.setAntiAlias(true);
            this.LLIIIJ.setTextSize(this.LJLLLLLL);
            this.LLIIIJ.setAntiAlias(true);
            LJII(true);
            setImportantForAccessibility(1);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setClickable(true);
            if (Build.VERSION.SDK_INT >= 26) {
                setFocusedByDefault(true);
            }
        }
        setImportantForAccessibility(1);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setFocusedByDefault(true);
        }
    }

    public void LIZLLL(Canvas canvas, float f, float f2, Paint textPaint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(textPaint, "textPaint");
        canvas.drawText(this.LLIIIZ, f, f2, textPaint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILIL != getMeasuredHeight() || this.LLILII != getMeasuredWidth()) {
            this.LLILII = getMeasuredWidth();
            this.LLILIL = getMeasuredHeight();
            LJI();
        }
    }
}
