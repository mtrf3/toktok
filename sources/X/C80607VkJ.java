package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.VkJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80607VkJ extends View {
    public static final int LLILLL = Color.rgb(0, 150, 136);
    public static final int LLILZ = Color.rgb(0, 150, 136);
    public static final int LLILZIL = Color.rgb(255, 255, 255);
    public int LJLIL;
    public int LJLILLLLZI;
    public TextPaint LJLJI;
    public TextPaint LJLJJI;
    public TextPaint LJLJJL;
    public Paint LJLJJLL;
    public Rect LJLJL;
    public C80608VkK[] LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public float LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public int LJZI;
    public String LJZL;
    public int LL;
    public float LLD;
    public int[] LLF;
    public int LLFF;
    public int LLFFF;
    public RectF LLFII;
    public Rect LLFZ;
    public int LLI;
    public Scroller LLIFFJFJJ;
    public Scroller LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public boolean LLIIL;
    public VelocityTracker LLIILII;
    public InterfaceC80609VkL LLIILZL;
    public java.util.Set<String> LLIIZ;
    public int LLIL;
    public final float LLILII;
    public String[] LLILIL;
    public boolean LLILL;
    public int LLILLIZIL;
    public boolean LLILLJJLI;

    public final void LIZ() {
        Scroller scroller = this.LLII;
        o.LJI(scroller);
        if (scroller.isFinished()) {
            this.LLIIIL = 0;
            o.LJI(getMTextYAxisArray()[0]);
            int round = (Math.round((r0.LIZIZ - this.LJLJLLL) / this.LLIIJLIL) * this.LLIIJLIL) + this.LJLJLLL;
            C80608VkK c80608VkK = getMTextYAxisArray()[0];
            o.LJI(c80608VkK);
            int i = round - c80608VkK.LIZIZ;
            if (i != 0) {
                Scroller scroller2 = this.LLII;
                o.LJI(scroller2);
                scroller2.startScroll(0, 0, 0, i, 300);
            }
        }
    }

    public final void LIZJ() {
        int i = 0;
        if (this.LLILL) {
            this.LLILLIZIL = getMTextYAxisArray().length / 2;
            int length = getMTextYAxisArray().length;
            while (i < length) {
                getMTextYAxisArray()[i] = new C80608VkK((this.LLFF - 3) + i, (this.LLIIJLIL * i) + this.LJLJLLL);
                i++;
            }
            return;
        }
        int length2 = getMTextYAxisArray().length;
        while (i < length2) {
            C80608VkK c80608VkK = new C80608VkK((this.LLFF - 3) + i, (this.LLIIJLIL * i) + this.LJLJLLL);
            if (c80608VkK.LIZ > getMNumberArray().length - 1) {
                c80608VkK.LIZ -= getMNumberArray().length;
            } else {
                int i2 = c80608VkK.LIZ;
                if (i2 < 0) {
                    c80608VkK.LIZ = i2 + getMNumberArray().length;
                }
            }
            getMTextYAxisArray()[i] = c80608VkK;
            i++;
        }
    }

    public final void LJFF() {
        int i = this.LJLLL;
        if (i >= 0 && this.LJLLLL >= 0) {
            if (i > this.LJLLLL) {
                this.LJLLLL = i;
            }
            if (this.LJLLLLLL < i) {
                this.LJLLLLLL = i;
            }
            int i2 = this.LJLLLLLL;
            int i3 = this.LJLLLL;
            if (i2 > i3) {
                this.LJLLLLLL = i3;
            }
            setMNumberArray(new int[(i3 - i) + 1]);
            int length = getMNumberArray().length;
            for (int i4 = 0; i4 < length; i4++) {
                getMNumberArray()[i4] = this.LJLLL + i4;
            }
            this.LLFF = this.LJLLLLLL - this.LJLLL;
            return;
        }
        "number can not be negative".toString();
        throw new IllegalArgumentException("number can not be negative");
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.LLIFFJFJJ;
        o.LJI(scroller);
        if (scroller.isFinished()) {
            scroller = this.LLII;
            o.LJI(scroller);
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        int currY = scroller.getCurrY();
        this.LLIIIZ = currY;
        int i = currY - this.LLIIIL;
        this.LLIIJI = i;
        LIZIZ(i);
        invalidate();
        this.LLIIIL = this.LLIIIZ;
    }

    public final int[] getMNumberArray() {
        int[] iArr = this.LLF;
        if (iArr != null) {
            return iArr;
        }
        o.LJIJI("mNumberArray");
        throw null;
    }

    public final C80608VkK[] getMTextYAxisArray() {
        C80608VkK[] c80608VkKArr = this.LJLJLJ;
        if (c80608VkKArr != null) {
            return c80608VkKArr;
        }
        o.LJIJI("mTextYAxisArray");
        throw null;
    }

    public final int getEndNumber() {
        return this.LJLLLL;
    }

    public final Scroller getMAdjustScroller() {
        return this.LLII;
    }

    public final int getMBackgroundColor() {
        return this.LLIIIJ;
    }

    public final boolean getMCanScroll() {
        return this.LLIIL;
    }

    public final int getMCurrNumIndex() {
        return this.LLFF;
    }

    public final int getMCurrTextYAxisIndex() {
        return this.LLILLIZIL;
    }

    public final int getMCurrY() {
        return this.LLIIIZ;
    }

    public final int getMCurrentNumber() {
        return this.LJLLLLLL;
    }

    public final int getMDividerColor() {
        return this.LJLLILLLL;
    }

    public final float getMDividerLength() {
        return this.LJZ;
    }

    public final Paint getMDividerLinePaint() {
        return this.LJLJJLL;
    }

    public final float getMDividerStroke() {
        return this.LJLZ;
    }

    public final java.util.Set<String> getMDrawedText() {
        return this.LLIIZ;
    }

    public final int getMEndNumber() {
        return this.LJLLLL;
    }

    public final int getMEndYPos() {
        return this.LJLL;
    }

    public final String getMFlagText() {
        return this.LJZL;
    }

    public final int getMFlagTextColor() {
        return this.LL;
    }

    public final TextPaint getMFlagTextPaint() {
        return this.LJLJJI;
    }

    public final float getMFlagTextSize() {
        return this.LLD;
    }

    public final Scroller getMFlingScroller() {
        return this.LLIFFJFJJ;
    }

    public final int getMHeight() {
        return this.LJLILLLLZI;
    }

    public final RectF getMHighLightRect() {
        return this.LLFII;
    }

    public final int getMOffsetY() {
        return this.LLIIJI;
    }

    public final InterfaceC80609VkL getMOnValueChangeListener() {
        return this.LLIILZL;
    }

    public final int getMRowNumber() {
        return this.LLIL;
    }

    public final int getMSpacing() {
        return this.LLIIJLIL;
    }

    public final int getMStartNumber() {
        return this.LJLLL;
    }

    public final int getMStartY() {
        return this.LLIIIL;
    }

    public final int getMStartYPos() {
        return this.LJLJLLL;
    }

    public final String[] getMTextArray() {
        return this.LLILIL;
    }

    public final Rect getMTextBounds() {
        return this.LJLJL;
    }

    public final Rect getMTextBoundsFlag() {
        return this.LLFZ;
    }

    public final int getMTextColor() {
        return this.LJLLI;
    }

    public final TextPaint getMTextPaint() {
        return this.LJLJI;
    }

    public final TextPaint getMTextShadowPaint() {
        return this.LJLJJL;
    }

    public final float getMTextSize() {
        return this.LJLLJ;
    }

    public final int getMTouchAction() {
        return this.LLI;
    }

    public final int getMVerticalSpacing() {
        return this.LJZI;
    }

    public final int getMWidth() {
        return this.LJLIL;
    }

    public final int getStartNumber() {
        return this.LJLLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0177, code lost:
    
        if (r0.LIZ >= (getMNumberArray().length - 1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0030, code lost:
    
        if (r0.LIZ <= 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r7) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80607VkJ.LIZIZ(int):void");
    }

    public final void LIZLLL(int i) {
        this.LJLLLLLL = i;
        LJFF();
        LIZJ();
        invalidate();
    }

    public final void LJ(int i) {
        this.LJLLLL = i;
        LJFF();
        LIZJ();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80607VkJ.onDraw(android.graphics.Canvas):void");
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
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80607VkJ.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMAdjustScroller(Scroller scroller) {
        this.LLII = scroller;
    }

    public final void setMBackgroundColor(int i) {
        this.LLIIIJ = i;
    }

    public final void setMCanScroll(boolean z) {
        this.LLIIL = z;
    }

    public final void setMCurrNumIndex(int i) {
        this.LLFF = i;
    }

    public final void setMCurrTextYAxisIndex(int i) {
        this.LLILLIZIL = i;
    }

    public final void setMCurrY(int i) {
        this.LLIIIZ = i;
    }

    public final void setMCurrentNumber(int i) {
        this.LJLLLLLL = i;
    }

    public final void setMDividerColor(int i) {
        this.LJLLILLLL = i;
    }

    public final void setMDividerLength(float f) {
        this.LJZ = f;
    }

    public final void setMDividerLinePaint(Paint paint) {
        this.LJLJJLL = paint;
    }

    public final void setMDividerStroke(float f) {
        this.LJLZ = f;
    }

    public final void setMDrawedText(java.util.Set<String> set) {
        o.LJIIIZ(set, "<set-?>");
        this.LLIIZ = set;
    }

    public final void setMEndNumber(int i) {
        this.LJLLLL = i;
    }

    public final void setMEndYPos(int i) {
        this.LJLL = i;
    }

    public final void setMFlagText(String str) {
        this.LJZL = str;
    }

    public final void setMFlagTextColor(int i) {
        this.LL = i;
    }

    public final void setMFlagTextPaint(TextPaint textPaint) {
        this.LJLJJI = textPaint;
    }

    public final void setMFlagTextSize(float f) {
        this.LLD = f;
    }

    public final void setMFlingScroller(Scroller scroller) {
        this.LLIFFJFJJ = scroller;
    }

    public final void setMHeight(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setMHighLightRect(RectF rectF) {
        this.LLFII = rectF;
    }

    public final void setMNumberArray(int[] iArr) {
        o.LJIIIZ(iArr, "<set-?>");
        this.LLF = iArr;
    }

    public final void setMOffsetY(int i) {
        this.LLIIJI = i;
    }

    public final void setMOnValueChangeListener(InterfaceC80609VkL interfaceC80609VkL) {
        this.LLIILZL = interfaceC80609VkL;
    }

    public final void setMRowNumber(int i) {
        this.LLIL = i;
    }

    public final void setMSpacing(int i) {
        this.LLIIJLIL = i;
    }

    public final void setMStartNumber(int i) {
        this.LJLLL = i;
    }

    public final void setMStartY(int i) {
        this.LLIIIL = i;
    }

    public final void setMStartYPos(int i) {
        this.LJLJLLL = i;
    }

    public final void setMTextArray(String[] strArr) {
        this.LLILIL = strArr;
    }

    public final void setMTextBounds(Rect rect) {
        this.LJLJL = rect;
    }

    public final void setMTextBoundsFlag(Rect rect) {
        this.LLFZ = rect;
    }

    public final void setMTextColor(int i) {
        this.LJLLI = i;
    }

    public final void setMTextPaint(TextPaint textPaint) {
        this.LJLJI = textPaint;
    }

    public final void setMTextShadowPaint(TextPaint textPaint) {
        this.LJLJJL = textPaint;
    }

    public final void setMTextSize(float f) {
        this.LJLLJ = f;
    }

    public final void setMTextYAxisArray(C80608VkK[] c80608VkKArr) {
        o.LJIIIZ(c80608VkKArr, "<set-?>");
        this.LJLJLJ = c80608VkKArr;
    }

    public final void setMTouchAction(int i) {
        this.LLI = i;
    }

    public final void setMVerticalSpacing(int i) {
        this.LJZI = i;
    }

    public final void setMWidth(int i) {
        this.LJLIL = i;
    }

    public final void setNonRecurrent(boolean z) {
        this.LLILL = z;
        LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80607VkJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLI = 3;
        this.LLIIZ = new HashSet();
        float f = getResources().getDisplayMetrics().density;
        this.LLILII = f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.x5, R.attr.x9, R.attr.a8m, R.attr.a97, R.attr.a98, R.attr.a_c, R.attr.a_h, R.attr.a_m, R.attr.abm, R.attr.ad9, R.attr.ad_, R.attr.ada, R.attr.aia, R.attr.b9h, R.attr.bek, R.attr.bw6}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…rPicker, defStyleAttr, 0)");
        int i = LLILLL;
        this.LJLLI = obtainStyledAttributes.getColor(3, i);
        this.LJLLJ = obtainStyledAttributes.getDimension(4, 32.0f * f);
        this.LJLLILLLL = obtainStyledAttributes.getColor(5, i);
        this.LJLLL = obtainStyledAttributes.getInteger(14, 0);
        this.LJLLLL = obtainStyledAttributes.getInteger(8, 0);
        this.LJLLLLLL = obtainStyledAttributes.getInteger(2, 0);
        this.LJZI = (int) obtainStyledAttributes.getDimension(15, 16 * f);
        this.LJZL = C16880lQ.LLLZLZ(obtainStyledAttributes, 9);
        this.LL = obtainStyledAttributes.getColor(10, LLILZ);
        this.LLD = obtainStyledAttributes.getDimension(11, 12.0f * f);
        this.LLIIIJ = obtainStyledAttributes.getColor(1, LLILZIL);
        this.LLIL = obtainStyledAttributes.getInteger(13, 5);
        this.LJLZ = obtainStyledAttributes.getDimension(7, 2 * f);
        this.LJZ = obtainStyledAttributes.getDimension(6, 0.0f);
        obtainStyledAttributes.recycle();
        LJFF();
        TextPaint textPaint = new TextPaint();
        this.LJLJI = textPaint;
        textPaint.setTextSize(this.LJLLJ);
        TextPaint textPaint2 = this.LJLJI;
        o.LJI(textPaint2);
        textPaint2.setColor(this.LJLLI);
        TextPaint textPaint3 = this.LJLJI;
        o.LJI(textPaint3);
        textPaint3.setFlags(1);
        TextPaint textPaint4 = this.LJLJI;
        o.LJI(textPaint4);
        textPaint4.setTextAlign(Paint.Align.CENTER);
        TextPaint textPaint5 = new TextPaint(this.LJLJI);
        this.LJLJJL = textPaint5;
        textPaint5.setAlpha(77);
        TextPaint textPaint6 = new TextPaint();
        this.LJLJJI = textPaint6;
        textPaint6.setTextSize(this.LLD);
        TextPaint textPaint7 = this.LJLJJI;
        o.LJI(textPaint7);
        textPaint7.setColor(this.LL);
        TextPaint textPaint8 = this.LJLJJI;
        o.LJI(textPaint8);
        textPaint8.setFlags(1);
        TextPaint textPaint9 = this.LJLJJI;
        o.LJI(textPaint9);
        textPaint9.setTextAlign(Paint.Align.LEFT);
        Paint paint = new Paint();
        this.LJLJJLL = paint;
        paint.setColor(this.LJLLILLLL);
        Paint paint2 = this.LJLJJLL;
        o.LJI(paint2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.LJLJJLL;
        o.LJI(paint3);
        paint3.setStrokeWidth(this.LJLZ);
        this.LJLJL = new Rect();
        this.LLFZ = new Rect();
        int length = String.valueOf(this.LJLLLL).length();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        TextPaint textPaint10 = this.LJLJI;
        o.LJI(textPaint10);
        textPaint10.getTextBounds(sb2, 0, sb2.length(), this.LJLJL);
        if (this.LJZL != null) {
            TextPaint textPaint11 = this.LJLJJI;
            o.LJI(textPaint11);
            String str = this.LJZL;
            o.LJI(str);
            textPaint11.getTextBounds(str, 0, str.length(), this.LLFZ);
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LLFFF = viewConfiguration.getScaledPagingTouchSlop();
        this.LLIIII = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLIIIILZ = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.LLIFFJFJJ = new Scroller(getContext(), null);
        this.LLII = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        setMTextYAxisArray(new C80608VkK[this.LLIL + 4]);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            Rect rect = this.LJLJL;
            o.LJI(rect);
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            Rect rect2 = this.LLFZ;
            o.LJI(rect2);
            size = rect2.width() + paddingRight + 6;
        }
        this.LJLIL = size;
        if (mode2 != 1073741824) {
            int i3 = this.LLIL;
            Rect rect3 = this.LJLJL;
            o.LJI(rect3);
            size2 = getPaddingTop() + ((this.LLIL - 1) * this.LJZI) + (rect3.height() * i3) + getPaddingBottom();
        }
        this.LJLILLLLZI = size2;
        setMeasuredDimension(this.LJLIL, size2);
        if (this.LLFII == null) {
            RectF rectF = new RectF();
            this.LLFII = rectF;
            rectF.left = 0.0f;
            RectF rectF2 = this.LLFII;
            o.LJI(rectF2);
            rectF2.right = this.LJLIL;
            RectF rectF3 = this.LLFII;
            o.LJI(rectF3);
            int i4 = this.LJLILLLLZI;
            o.LJI(this.LJLJL);
            rectF3.top = ((i4 - r0.height()) - this.LJZI) / 2;
            RectF rectF4 = this.LLFII;
            o.LJI(rectF4);
            int i5 = this.LJLILLLLZI;
            Rect rect4 = this.LJLJL;
            o.LJI(rect4);
            int height = rect4.height() + i5;
            int i6 = this.LJZI;
            rectF4.bottom = (height + i6) / 2;
            Rect rect5 = this.LJLJL;
            o.LJI(rect5);
            int height2 = rect5.height() + i6;
            this.LLIIJLIL = height2;
            int i7 = this.LJLILLLLZI;
            this.LJLJLLL = (i7 / 2) - (height2 * 3);
            this.LJLL = (height2 * 3) + (i7 / 2);
            LIZJ();
        }
    }
}
