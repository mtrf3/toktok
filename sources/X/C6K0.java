package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6K0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6K0 extends View {
    public ArrayList<Integer> LJLIL;
    public ArrayList<Boolean> LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public Integer LJLJJL;
    public Integer LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public final Paint LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public OverScroller LLFII;
    public VelocityTracker LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public C6K5 LLII;
    public QZV LLIIII;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0025, code lost:
    
        if (r0 <= 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r8 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r8.LJLIL
            java.lang.String r7 = "selectorItemIndices"
            r6 = 0
            if (r0 == 0) goto L7d
            r0.clear()
            java.util.ArrayList<java.lang.Boolean> r0 = r8.LJLILLLLZI
            java.lang.String r5 = "selectorItemValidStatus"
            if (r0 == 0) goto L79
            r0.clear()
            java.lang.Integer r0 = r8.LJLJJLL
            r4 = 0
            if (r0 == 0) goto L23
            kotlin.jvm.internal.o.LJI(r0)
            int r1 = r0.intValue()
            int r0 = r8.LJLJI
            if (r1 >= r0) goto L5a
        L23:
            int r0 = r8.LJLJI
            if (r0 > 0) goto L28
        L27:
            r0 = 0
        L28:
            r8.LJLL = r0
            int r3 = r8.LJLLILLLL
        L2c:
            if (r4 >= r3) goto L78
            int r1 = r8.LJLL
            int r0 = r8.LJLJL
            int r2 = r4 - r0
            int r2 = r2 + r1
            boolean r0 = r8.LJLLI
            if (r0 == 0) goto L3d
            int r2 = r8.LIZJ(r2)
        L3d:
            java.util.ArrayList<java.lang.Integer> r1 = r8.LJLIL
            if (r1 == 0) goto L74
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.add(r0)
            java.util.ArrayList<java.lang.Boolean> r1 = r8.LJLILLLLZI
            if (r1 == 0) goto L70
            boolean r0 = r8.LJFF(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.add(r0)
            int r4 = r4 + 1
            goto L2c
        L5a:
            java.lang.Integer r0 = r8.LJLJJLL
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.intValue()
            if (r0 > 0) goto L66
            goto L27
        L66:
            java.lang.Integer r0 = r8.LJLJJLL
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.intValue()
            goto L28
        L70:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L74:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r6
        L78:
            return
        L79:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r6
        L7d:
            kotlin.jvm.internal.o.LJIJI(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6K0.LJ():void");
    }

    public final String getCurrentItem() {
        return LIZIZ(this.LJLL);
    }

    public final String getMaxValue() {
        QZV qzv = this.LLIIII;
        if (qzv != null) {
            o.LJI(qzv);
            return qzv.LJIILIIL(this.LJLJJI);
        }
        return String.valueOf(this.LJLJJI);
    }

    public final String getMinValue() {
        QZV qzv = this.LLIIII;
        if (qzv != null) {
            o.LJI(qzv);
            return qzv.LJIILIIL(this.LJLJI);
        }
        return String.valueOf(this.LJLJI);
    }

    private final int getGapHeight() {
        int itemHeight = getItemHeight();
        Paint.FontMetricsInt fontMetricsInt = this.LLD.getFontMetricsInt();
        return itemHeight - Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
    }

    private final int getItemHeight() {
        return getHeight() / (this.LJLLILLLL - 2);
    }

    public final void LIZLLL() {
        this.LJZI = getItemHeight();
        Paint.FontMetricsInt fontMetricsInt = this.LLD.getFontMetricsInt();
        this.LJZL = Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
        this.LJZ = getGapHeight();
        int i = this.LJZI;
        int i2 = (((this.LJZL + i) / 2) + (this.LJLJLJ * i)) - (i * this.LJLJL);
        this.LJLZ = i2;
        this.LJLLLLLL = i2;
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.LLFII;
        o.LJI(overScroller);
        if (overScroller.computeScrollOffset()) {
            OverScroller overScroller2 = this.LLFII;
            o.LJI(overScroller2);
            int currX = overScroller2.getCurrX();
            OverScroller overScroller3 = this.LLFII;
            o.LJI(overScroller3);
            int currY = overScroller3.getCurrY();
            if (this.LL == 0) {
                OverScroller overScroller4 = this.LLFII;
                o.LJI(overScroller4);
                this.LL = overScroller4.getStartY();
            }
            scrollBy(currX, currY - this.LL);
            this.LL = currY;
            invalidate();
            return;
        }
        if (this.LJLLLL) {
            return;
        }
        this.LL = 0;
        int i = this.LJLZ - this.LJLLLLLL;
        int abs = Math.abs(i);
        int i2 = this.LJZI;
        if (abs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        if (i == 0) {
            return;
        }
        OverScroller overScroller5 = this.LLFII;
        o.LJI(overScroller5);
        overScroller5.startScroll(getScrollX(), getScrollY(), 0, i, 800);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        if (this.LJLLJ > 0) {
            return Math.max(suggestedMinimumWidth, ((int) KL2.LIZJ(getContext(), 38.0f)) * this.LJLLJ);
        }
        return suggestedMinimumWidth;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int measureText;
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        if (this.LJLLJ > 0) {
            this.LLD.setTextSize(this.LLFFF * 1.3f);
            if (this.LLIIII != null) {
                measureText = this.LJLJLLL;
            } else {
                measureText = (int) this.LLD.measureText(String.valueOf(this.LJLJI));
                int measureText2 = (int) this.LLD.measureText(String.valueOf(this.LJLJJI));
                this.LLD.setTextSize(this.LLFFF * 1.0f);
                if (measureText <= measureText2) {
                    measureText = measureText2;
                }
            }
            return Math.max(suggestedMinimumHeight, measureText);
        }
        return suggestedMinimumHeight;
    }

    public final int getCurrentPosition() {
        return this.LJLL;
    }

    public final boolean getWrapSelectorPick() {
        return this.LJLLI;
    }

    public final String LIZIZ(int i) {
        QZV qzv = this.LLIIII;
        if (qzv != null) {
            return qzv.LJIILIIL(i);
        }
        if (!this.LJLLI) {
            if (i > this.LJLJJI || i < this.LJLJI) {
                return "";
            }
            if (i <= 9) {
                return C169696lJ.LIZIZ('0', i);
            }
            return String.valueOf(i);
        }
        int LIZJ = LIZJ(i);
        if (LIZJ <= 9) {
            return C169696lJ.LIZIZ('0', LIZJ);
        }
        return String.valueOf(LIZJ);
    }

    public final int LIZJ(int i) {
        int i2 = this.LJLJJI;
        if (i > i2) {
            int i3 = this.LJLJI;
            return (((i - i2) % ((i2 - i3) + 1)) + i3) - 1;
        }
        int i4 = this.LJLJI;
        if (i < i4) {
            return (i2 - ((i4 - i) % ((i2 - i4) + 1))) + 1;
        }
        return i;
    }

    public final boolean LJFF(int i) {
        Integer num = this.LJLJJLL;
        if (num != null) {
            o.LJI(num);
            if (i < num.intValue()) {
                return false;
            }
        }
        Integer num2 = this.LJLJJL;
        if (num2 != null) {
            o.LJI(num2);
            if (i > num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    public final void LJI(int i) {
        if (this.LJLL == i) {
            return;
        }
        this.LJLL = i;
        ArrayList<Integer> arrayList = this.LJLIL;
        if (arrayList != null) {
            arrayList.clear();
            int i2 = this.LJLLILLLL;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (i3 - this.LJLJL) + this.LJLL;
                if (this.LJLLI) {
                    i4 = LIZJ(i4);
                }
                ArrayList<Integer> arrayList2 = this.LJLIL;
                if (arrayList2 != null) {
                    arrayList2.add(Integer.valueOf(i4));
                } else {
                    o.LJIJI("selectorItemIndices");
                    throw null;
                }
            }
            invalidate();
            return;
        }
        o.LJIJI("selectorItemIndices");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r2 > r0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.LJLLI
            if (r0 != 0) goto L3d
            java.lang.Integer r0 = r1.LJLJJL
            if (r0 != 0) goto Le
            int r0 = r1.LJLJJI
            if (r2 <= r0) goto L21
        Lc:
            r2 = r0
        Ld:
            return r2
        Le:
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.intValue()
            if (r2 <= r0) goto L21
            java.lang.Integer r0 = r1.LJLJJL
            kotlin.jvm.internal.o.LJI(r0)
            int r2 = r0.intValue()
            goto Ld
        L21:
            java.lang.Integer r0 = r1.LJLJJLL
            if (r0 != 0) goto L2a
            int r0 = r1.LJLJI
            if (r2 >= r0) goto Ld
            goto Lc
        L2a:
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.intValue()
            if (r2 >= r0) goto Ld
            java.lang.Integer r0 = r1.LJLJJLL
            kotlin.jvm.internal.o.LJI(r0)
            int r2 = r0.intValue()
            goto Ld
        L3d:
            int r2 = r1.LIZJ(r2)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6K0.LJII(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6K0.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Integer num;
        o.LJIIIZ(event, "event");
        if (this.LLFZ == null) {
            this.LLFZ = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LLFZ;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        if (this.LJLLLL) {
                            this.LJLLLL = false;
                        }
                        VelocityTracker velocityTracker2 = this.LLFZ;
                        if (velocityTracker2 != null) {
                            velocityTracker2.recycle();
                        }
                        this.LLFZ = null;
                    }
                } else {
                    float y = event.getY() - this.LJLLL;
                    if (!this.LJLLLL && Math.abs(y) > this.LLI) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        if (y > 0.0f) {
                            y -= this.LLI;
                        } else {
                            y += this.LLI;
                        }
                        this.LJLLLL = true;
                    }
                    if (this.LJLLLL) {
                        scrollBy(0, (int) y);
                        invalidate();
                        this.LJLLL = event.getY();
                    }
                }
            } else if (this.LJLLLL) {
                this.LJLLLL = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.LLFZ;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(1000, this.LLIFFJFJJ);
                }
                VelocityTracker velocityTracker4 = this.LLFZ;
                if (velocityTracker4 != null) {
                    num = Integer.valueOf((int) velocityTracker4.getYVelocity());
                } else {
                    num = null;
                }
                this.LL = 0;
                OverScroller overScroller = this.LLFII;
                if (overScroller != null) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    o.LJI(num);
                    overScroller.fling(scrollX, scrollY, 0, num.intValue(), 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, 0, (int) (getItemHeight() * 0.7d));
                }
                postInvalidateOnAnimation();
                VelocityTracker velocityTracker5 = this.LLFZ;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                }
                this.LLFZ = null;
            } else {
                int y2 = (((int) event.getY()) / this.LJZI) - this.LJLJLJ;
                this.LL = 0;
                OverScroller overScroller2 = this.LLFII;
                o.LJI(overScroller2);
                overScroller2.startScroll(0, 0, 0, (-this.LJZI) * y2, 300);
                invalidate();
            }
        } else {
            OverScroller overScroller3 = this.LLFII;
            o.LJI(overScroller3);
            if (!overScroller3.isFinished()) {
                OverScroller overScroller4 = this.LLFII;
                o.LJI(overScroller4);
                overScroller4.forceFinished(true);
            }
            this.LJLLL = event.getY();
        }
        return true;
    }

    public final void setMaxValidValue(Integer num) {
        this.LJLJJL = num;
    }

    public final void setMaxValue(int i) {
        this.LJLJJI = i;
    }

    public final void setMaxWidth(int i) {
        this.LJLJLLL = i;
    }

    public final void setMinValidValue(Integer num) {
        this.LJLJJLL = num;
    }

    public final void setMinValue(int i) {
        this.LJLJI = i;
    }

    public final void setOnValueChangedListener(C6K5 onValueChangeListener) {
        o.LJIIIZ(onValueChangeListener, "onValueChangeListener");
        this.LLII = onValueChangeListener;
    }

    public final void setPickerItemCount(int i) {
        int i2 = i + 2;
        this.LJLLILLLL = i2;
        this.LJLJL = (i2 - 1) / 2;
        int i3 = i2 - 2;
        this.LJLLJ = i3;
        this.LJLJLJ = (i3 - 1) / 2;
        this.LJLIL = new ArrayList<>(this.LJLLILLLL);
        this.LJLILLLLZI = new ArrayList<>(this.LJLLILLLL);
        LJ();
        LIZLLL();
        invalidate();
        invalidate();
    }

    public final void setSelectedTextColor(int i) {
        this.LLF = C04330Ez.LIZIZ(getContext(), i);
        invalidate();
    }

    public final void setTextAlign(Paint.Align align) {
        o.LJIIIZ(align, "align");
        this.LLD.setTextAlign(align);
    }

    public final void setTypeface(Typeface typeface) {
        o.LJIIIZ(typeface, "typeface");
        this.LLD.setTypeface(typeface);
    }

    public final void setUnselectedTextColor(int i) {
        this.LLFF = i;
    }

    public final void setValue(String value) {
        o.LJIIIZ(value, "value");
        QZV qzv = this.LLIIII;
        int i = 0;
        if (qzv != null) {
            qzv.LJIIJJI(value);
            i = LJII(0);
        } else {
            try {
                i = LJII(CastIntegerProtector.parseInt(value));
            } catch (NumberFormatException unused) {
            }
        }
        LJI(i);
    }

    public final void setWrapSelectorWheel(boolean z) {
        this.LJLLI = z;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6K0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        int i;
        int i2;
        int i3;
        int i4;
        new LinkedHashMap();
        this.LJLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        Paint paint = new Paint();
        this.LLD = paint;
        boolean z = false;
        if (context != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b07, R.attr.b0h, R.attr.b0x, R.attr.b12, R.attr.b_v, R.attr.bia, R.attr.bil, R.attr.bx3, R.attr.by3}, 0, 0);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            i = typedArray.getInt(7, 5);
        } else {
            i = 5;
        }
        int i5 = i + 2;
        this.LJLLILLLL = i5;
        this.LJLJL = (i5 - 1) / 2;
        int i6 = i5 - 2;
        this.LJLLJ = i6;
        this.LJLJLJ = (i6 - 1) / 2;
        this.LJLIL = new ArrayList<>(this.LJLLILLLL);
        this.LJLILLLLZI = new ArrayList<>(this.LJLLILLLL);
        if (typedArray != null) {
            i2 = typedArray.getInt(2, LiveLayoutPreloadThreadPriority.DEFAULT);
        } else {
            i2 = 0;
        }
        this.LJLJI = i2;
        if (typedArray != null) {
            i3 = typedArray.getInt(0, Integer.MAX_VALUE);
        } else {
            i3 = 0;
        }
        this.LJLJJI = i3;
        if (typedArray != null) {
            if (typedArray.hasValue(1)) {
                this.LJLJJL = Integer.valueOf(typedArray.getInt(1, 0));
            }
            if (typedArray != null) {
                if (typedArray.hasValue(3)) {
                    this.LJLJJLL = Integer.valueOf(typedArray.getInt(3, 0));
                }
                z = typedArray.getBoolean(8, false);
            }
        }
        this.LJLLI = z;
        this.LLFII = new OverScroller(context, new DecelerateInterpolator(2.5f));
        o.LJI(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLI = viewConfiguration.getScaledTouchSlop();
        this.LLIFFJFJJ = viewConfiguration.getScaledMaximumFlingVelocity() / 4;
        viewConfiguration.getScaledMinimumFlingVelocity();
        int i7 = R.color.b5;
        if (typedArray != null) {
            i4 = typedArray.getColor(4, AnonymousClass636.LJIIIIZZ(R.attr.d4, context));
        } else {
            i4 = R.color.b5;
        }
        this.LLF = i4;
        this.LLFF = typedArray != null ? typedArray.getColor(5, AnonymousClass636.LJIIIIZZ(R.attr.d4, context)) : i7;
        this.LLFFF = typedArray != null ? typedArray.getDimensionPixelSize(6, 80) : 80;
        paint.setAntiAlias(true);
        paint.setAntiAlias(true);
        paint.setTextSize(paint.getTextSize());
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setTextAlign(Paint.Align.CENTER);
        if (typedArray != null) {
            typedArray.recycle();
        }
        LJ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int LIZ = LIZ(getSuggestedMinimumWidth(), layoutParams.width, i);
        int LIZ2 = LIZ(getSuggestedMinimumHeight(), layoutParams.height, i2);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + LIZ, getPaddingBottom() + getPaddingTop() + LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1 <= r0.intValue()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r1 >= r0.intValue()) goto L43;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void scrollBy(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6K0.scrollBy(int, int):void");
    }

    public static int LIZ(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(View.MeasureSpec.getMode(i3));
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    return 0;
                }
                return size;
            }
            if (i2 != -2 && i2 != -1) {
                i = i2;
            }
        } else {
            if (i2 != -2) {
                if (i2 == -1) {
                    return size;
                }
                if (i2 > size) {
                    i2 = size;
                }
                return i2;
            }
            if (i > size) {
                i = size;
            }
        }
        return i;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            LIZLLL();
        }
    }
}
