package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VkN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80611VkN extends View {
    public static final int LLILL = Color.rgb(0, 150, 136);
    public int LJLIL;
    public int LJLILLLLZI;
    public TextPaint LJLJI;
    public T5S LJLJJI;
    public T5S LJLJJL;
    public Rect LJLJJLL;
    public C80615VkR[] LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public float LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public String LJLZ;
    public int LJZ;
    public float LJZI;
    public int[] LJZL;
    public int LL;
    public int LLD;
    public RectF LLF;
    public Rect LLFF;
    public int LLFFF;
    public Scroller LLFII;
    public Scroller LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public VelocityTracker LLIIJI;
    public InterfaceC80617VkT LLIIJLIL;
    public InterfaceC80616VkS LLIIL;
    public java.util.Set<String> LLIILII;
    public int LLIILZL;
    public final float LLIIZ;
    public String[] LLIL;
    public boolean LLILII;
    public int LLILIL;

    public final void LIZ() {
        Scroller scroller = this.LLFZ;
        o.LJI(scroller);
        if (scroller.isFinished()) {
            this.LLIIII = 0;
            o.LJI(getMTextYAxisArray()[0]);
            int round = (Math.round((r0.LIZIZ - this.LJLJLJ) / this.LLIIIL) * this.LLIIIL) + this.LJLJLJ;
            C80615VkR c80615VkR = getMTextYAxisArray()[0];
            o.LJI(c80615VkR);
            int i = round - c80615VkR.LIZIZ;
            if (i != 0) {
                Scroller scroller2 = this.LLFZ;
                o.LJI(scroller2);
                scroller2.startScroll(0, 0, 0, i, 300);
            }
        }
    }

    public final void LIZLLL() {
        T5S t5s = new T5S();
        this.LJLJJI = t5s;
        t5s.LIZ(this.LJLLILLLL);
        T5S t5s2 = this.LJLJJI;
        o.LJI(t5s2);
        t5s2.setTextSize(this.LJLLI);
        T5S t5s3 = this.LJLJJI;
        o.LJI(t5s3);
        t5s3.setColor(this.LJLL);
        T5S t5s4 = this.LJLJJI;
        o.LJI(t5s4);
        t5s4.setFlags(1);
        T5S t5s5 = this.LJLJJI;
        o.LJI(t5s5);
        t5s5.setTextAlign(Paint.Align.CENTER);
        T5S t5s6 = new T5S();
        this.LJLJJL = t5s6;
        t5s6.LIZ(this.LJLLILLLL);
        T5S t5s7 = this.LJLJJL;
        o.LJI(t5s7);
        t5s7.setTextSize(this.LJLLI);
        T5S t5s8 = this.LJLJJL;
        o.LJI(t5s8);
        t5s8.setColor(this.LJLL);
        T5S t5s9 = this.LJLJJL;
        o.LJI(t5s9);
        t5s9.setFlags(1);
        T5S t5s10 = this.LJLJJL;
        o.LJI(t5s10);
        t5s10.setTextAlign(Paint.Align.CENTER);
        T5S t5s11 = this.LJLJJL;
        o.LJI(t5s11);
        t5s11.setAlpha(127);
        TextPaint textPaint = new TextPaint();
        this.LJLJI = textPaint;
        textPaint.setTextSize(this.LJZI);
        TextPaint textPaint2 = this.LJLJI;
        o.LJI(textPaint2);
        textPaint2.setColor(this.LJZ);
        TextPaint textPaint3 = this.LJLJI;
        o.LJI(textPaint3);
        textPaint3.setFlags(1);
        TextPaint textPaint4 = this.LJLJI;
        o.LJI(textPaint4);
        textPaint4.setTextAlign(Paint.Align.LEFT);
    }

    public final void LJ() {
        int i = 0;
        if (this.LLILII) {
            this.LLILIL = getMTextYAxisArray().length / 2;
            int length = getMTextYAxisArray().length;
            while (i < length) {
                getMTextYAxisArray()[i] = new C80615VkR((this.LL - 3) + i, (this.LLIIIL * i) + this.LJLJLJ);
                i++;
            }
            return;
        }
        int length2 = getMTextYAxisArray().length;
        while (i < length2) {
            C80615VkR c80615VkR = new C80615VkR((this.LL - 3) + i, (this.LLIIIL * i) + this.LJLJLJ);
            if (c80615VkR.LIZ > getMNumberArray().length - 1) {
                c80615VkR.LIZ -= getMNumberArray().length;
            } else {
                int i2 = c80615VkR.LIZ;
                if (i2 < 0) {
                    c80615VkR.LIZ = i2 + getMNumberArray().length;
                }
            }
            getMTextYAxisArray()[i] = c80615VkR;
            i++;
        }
    }

    public final void LJI() {
        int i = this.LJLLJ;
        if (i >= 0 && this.LJLLL >= 0) {
            if (i > this.LJLLL) {
                this.LJLLL = i;
            }
            if (this.LJLLLL < i) {
                this.LJLLLL = i;
            }
            int i2 = this.LJLLLL;
            int i3 = this.LJLLL;
            if (i2 > i3) {
                this.LJLLLL = i3;
            }
            setMNumberArray(new int[(i3 - i) + 1]);
            int length = getMNumberArray().length;
            for (int i4 = 0; i4 < length; i4++) {
                getMNumberArray()[i4] = this.LJLLJ + i4;
            }
            this.LL = this.LJLLLL - this.LJLLJ;
            return;
        }
        "number can not be negative".toString();
        throw new IllegalArgumentException("number can not be negative");
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.LLFII;
        o.LJI(scroller);
        if (scroller.isFinished()) {
            scroller = this.LLFZ;
            o.LJI(scroller);
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.LLIIIILZ = currY;
        int i = currY - this.LLIIII;
        this.LLIIIJ = i;
        LIZIZ(i);
        invalidate();
        this.LLIIII = this.LLIIIILZ;
    }

    public final int[] getMNumberArray() {
        int[] iArr = this.LJZL;
        if (iArr != null) {
            return iArr;
        }
        o.LJIJI("mNumberArray");
        throw null;
    }

    public final C80615VkR[] getMTextYAxisArray() {
        C80615VkR[] c80615VkRArr = this.LJLJL;
        if (c80615VkRArr != null) {
            return c80615VkRArr;
        }
        o.LJIJI("mTextYAxisArray");
        throw null;
    }

    public final void LIZJ() {
        LJI();
        LIZLLL();
        this.LJLJJLL = new Rect();
        this.LLFF = new Rect();
        int length = String.valueOf(this.LJLLL).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        T5S t5s = this.LJLJJI;
        o.LJI(t5s);
        t5s.getTextBounds(sb2, 0, sb2.length(), this.LJLJJLL);
        if (this.LJLZ != null) {
            TextPaint textPaint = this.LJLJI;
            o.LJI(textPaint);
            String str = this.LJLZ;
            o.LJI(str);
            textPaint.getTextBounds(str, 0, str.length(), this.LLFF);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LLD = viewConfiguration.getScaledPagingTouchSlop();
        this.LLI = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLIFFJFJJ = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.LLFII = new Scroller(getContext(), null);
        this.LLFZ = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
    }

    public final Scroller getMAdjustScroller() {
        return this.LLFZ;
    }

    public final int getMBackgroundColor() {
        return this.LLII;
    }

    public final boolean getMCanScroll() {
        return this.LLIIIZ;
    }

    public final int getMCurrNumIndex() {
        return this.LL;
    }

    public final int getMCurrTextYAxisIndex() {
        return this.LLILIL;
    }

    public final int getMCurrY() {
        return this.LLIIIILZ;
    }

    public final java.util.Set<String> getMDrawedText() {
        return this.LLIILII;
    }

    public final int getMEndNumber() {
        return this.LJLLL;
    }

    public final int getMEndYPos() {
        return this.LJLJLLL;
    }

    public final String getMFlagText() {
        return this.LJLZ;
    }

    public final int getMFlagTextColor() {
        return this.LJZ;
    }

    public final TextPaint getMFlagTextPaint() {
        return this.LJLJI;
    }

    public final float getMFlagTextSize() {
        return this.LJZI;
    }

    public final Scroller getMFlingScroller() {
        return this.LLFII;
    }

    public final int getMFont() {
        return this.LJLLILLLL;
    }

    public final int getMHeight() {
        return this.LJLILLLLZI;
    }

    public final int getMOffsetY() {
        return this.LLIIIJ;
    }

    public final InterfaceC80616VkS getMOnRecurrentLoopListener() {
        return this.LLIIL;
    }

    public final InterfaceC80617VkT getMOnValueChangeListener() {
        return this.LLIIJLIL;
    }

    public final int getMRowNumber() {
        return this.LLIILZL;
    }

    public final int getMSpacing() {
        return this.LLIIIL;
    }

    public final int getMStartNumber() {
        return this.LJLLJ;
    }

    public final int getMStartY() {
        return this.LLIIII;
    }

    public final int getMStartYPos() {
        return this.LJLJLJ;
    }

    public final String[] getMTextArray() {
        return this.LLIL;
    }

    public final Rect getMTextBounds() {
        return this.LJLJJLL;
    }

    public final Rect getMTextBoundsFlag() {
        return this.LLFF;
    }

    public final int getMTextColor() {
        return this.LJLL;
    }

    public final float getMTextSize() {
        return this.LJLLI;
    }

    public final int getMTouchAction() {
        return this.LLFFF;
    }

    public final T5S getMTuxPaint() {
        return this.LJLJJI;
    }

    public final T5S getMTuxShadowPaint() {
        return this.LJLJJL;
    }

    public final int getMVerticalSpacing() {
        return this.LJLLLLLL;
    }

    public final int getMWidth() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80611VkN(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LLFFF = 3;
        this.LLIILII = new HashSet();
        float f = getResources().getDisplayMetrics().density;
        this.LLIIZ = f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.x9, R.attr.aia, R.attr.b2s, R.attr.b2t, R.attr.b2u, R.attr.b2v, R.attr.b2w, R.attr.b2x, R.attr.b2y, R.attr.b2z, R.attr.b30, R.attr.b31, R.attr.bqy}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…lPicker, defStyleAttr, 0)");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.go, typedValue, true);
        this.LJLL = obtainStyledAttributes.getColor(10, typedValue.data);
        this.LJLLI = obtainStyledAttributes.getDimension(11, 17.0f * f);
        this.LJLLJ = obtainStyledAttributes.getInteger(4, 0);
        this.LJLLL = obtainStyledAttributes.getInteger(3, 0);
        this.LJLLLL = obtainStyledAttributes.getInteger(2, 0);
        this.LJLLLLLL = (int) obtainStyledAttributes.getDimension(9, 40 * f);
        this.LJLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 5);
        this.LJZ = obtainStyledAttributes.getColor(6, LLILL);
        this.LJZI = obtainStyledAttributes.getDimension(7, f * 12.0f);
        this.LLIILZL = obtainStyledAttributes.getInteger(8, 5);
        this.LJLLILLLL = obtainStyledAttributes.getInt(12, 31);
        obtainStyledAttributes.recycle();
        LIZJ();
        setMTextYAxisArray(new C80615VkR[this.LLIILZL + 4]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x017d, code lost:
    
        if (r0.LIZ >= (getMNumberArray().length - 1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0030, code lost:
    
        if (r0.LIZ <= 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r7) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80611VkN.LIZIZ(int):void");
    }

    public final void LJFF(int i) {
        this.LJLLLL = i;
        LJI();
        LJ();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80611VkN.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r0.isFinished() == false) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80611VkN.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMAdjustScroller(Scroller scroller) {
        this.LLFZ = scroller;
    }

    public final void setMBackgroundColor(int i) {
        this.LLII = i;
    }

    public final void setMCanScroll(boolean z) {
        this.LLIIIZ = z;
    }

    public final void setMCurrNumIndex(int i) {
        this.LL = i;
    }

    public final void setMCurrTextYAxisIndex(int i) {
        this.LLILIL = i;
    }

    public final void setMCurrY(int i) {
        this.LLIIIILZ = i;
    }

    public final void setMDrawedText(java.util.Set<String> set) {
        o.LJIIIZ(set, "<set-?>");
        this.LLIILII = set;
    }

    public final void setMEndNumber(int i) {
        this.LJLLL = i;
    }

    public final void setMEndYPos(int i) {
        this.LJLJLLL = i;
    }

    public final void setMFlagText(String str) {
        this.LJLZ = str;
    }

    public final void setMFlagTextColor(int i) {
        this.LJZ = i;
    }

    public final void setMFlagTextPaint(TextPaint textPaint) {
        this.LJLJI = textPaint;
    }

    public final void setMFlagTextSize(float f) {
        this.LJZI = f;
    }

    public final void setMFlingScroller(Scroller scroller) {
        this.LLFII = scroller;
    }

    public final void setMFont(int i) {
        this.LJLLILLLL = i;
    }

    public final void setMHeight(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setMNumberArray(int[] iArr) {
        o.LJIIIZ(iArr, "<set-?>");
        this.LJZL = iArr;
    }

    public final void setMOffsetY(int i) {
        this.LLIIIJ = i;
    }

    public final void setMOnRecurrentLoopListener(InterfaceC80616VkS interfaceC80616VkS) {
        this.LLIIL = interfaceC80616VkS;
    }

    public final void setMOnValueChangeListener(InterfaceC80617VkT interfaceC80617VkT) {
        this.LLIIJLIL = interfaceC80617VkT;
    }

    public final void setMRowNumber(int i) {
        this.LLIILZL = i;
    }

    public final void setMSpacing(int i) {
        this.LLIIIL = i;
    }

    public final void setMStartNumber(int i) {
        this.LJLLJ = i;
    }

    public final void setMStartY(int i) {
        this.LLIIII = i;
    }

    public final void setMStartYPos(int i) {
        this.LJLJLJ = i;
    }

    public final void setMTextArray(String[] strArr) {
        this.LLIL = strArr;
    }

    public final void setMTextBounds(Rect rect) {
        this.LJLJJLL = rect;
    }

    public final void setMTextBoundsFlag(Rect rect) {
        this.LLFF = rect;
    }

    public final void setMTextColor(int i) {
        this.LJLL = i;
    }

    public final void setMTextSize(float f) {
        this.LJLLI = f;
    }

    public final void setMTextYAxisArray(C80615VkR[] c80615VkRArr) {
        o.LJIIIZ(c80615VkRArr, "<set-?>");
        this.LJLJL = c80615VkRArr;
    }

    public final void setMTouchAction(int i) {
        this.LLFFF = i;
    }

    public final void setMTuxPaint(T5S t5s) {
        this.LJLJJI = t5s;
    }

    public final void setMTuxShadowPaint(T5S t5s) {
        this.LJLJJL = t5s;
    }

    public final void setMVerticalSpacing(int i) {
        this.LJLLLLLL = i;
    }

    public final void setMWidth(int i) {
        this.LJLIL = i;
    }

    public final void setNonRecurrent(boolean z) {
        this.LLILII = z;
        LJ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            Rect rect = this.LJLJJLL;
            o.LJI(rect);
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            Rect rect2 = this.LLFF;
            o.LJI(rect2);
            size = rect2.width() + paddingRight + 6;
        }
        this.LJLIL = size;
        if (mode2 != 1073741824) {
            int i3 = this.LLIILZL;
            Rect rect3 = this.LJLJJLL;
            o.LJI(rect3);
            size2 = getPaddingTop() + ((this.LLIILZL - 1) * this.LJLLLLLL) + (rect3.height() * i3) + getPaddingBottom();
        }
        this.LJLILLLLZI = size2;
        setMeasuredDimension(this.LJLIL, size2);
        if (this.LLF == null) {
            RectF rectF = new RectF();
            this.LLF = rectF;
            rectF.left = 0.0f;
            RectF rectF2 = this.LLF;
            o.LJI(rectF2);
            rectF2.right = this.LJLIL;
            RectF rectF3 = this.LLF;
            o.LJI(rectF3);
            int i4 = this.LJLILLLLZI;
            o.LJI(this.LJLJJLL);
            rectF3.top = ((i4 - r0.height()) - this.LJLLLLLL) / 2;
            RectF rectF4 = this.LLF;
            o.LJI(rectF4);
            int i5 = this.LJLILLLLZI;
            Rect rect4 = this.LJLJJLL;
            o.LJI(rect4);
            int height = rect4.height() + i5;
            int i6 = this.LJLLLLLL;
            rectF4.bottom = (height + i6) / 2;
            Rect rect5 = this.LJLJJLL;
            o.LJI(rect5);
            int height2 = rect5.height() + i6;
            this.LLIIIL = height2;
            int i7 = this.LJLILLLLZI;
            this.LJLJLJ = (i7 / 2) - (height2 * 3);
            this.LJLJLLL = (height2 * 3) + (i7 / 2);
            LJ();
        }
    }
}
