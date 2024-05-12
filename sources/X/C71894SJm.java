package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SJm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71894SJm extends AbstractC72772ShE {
    public static final List<C37721ErF> LJZ = C47261Igj.LJJIJ(new C37721ErF(1.0f));
    public static final C49532JcG LJZI;
    public List<? extends AbstractC37717ErB> LJLLL;
    public C49532JcG LJLLLL;
    public List<Float> LJLLLLLL;
    public final Rect LJLZ;

    static {
        Paint paint = new Paint();
        paint.setTextSize(15.0f);
        LJZI = new C49532JcG(paint, 18.0f);
    }

    public final C49532JcG LJFF() {
        C49532JcG c49532JcG = this.LJLLLL;
        if (c49532JcG == null) {
            TextView LJIIJ = C78996UzQ.LJIIJ(this);
            if (LJIIJ != null) {
                TextPaint paint = LJIIJ.getPaint();
                o.LJIIIIZZ(paint, "paint");
                return new C49532JcG(paint, LJIIJ.getLineHeight());
            }
            return LJZI;
        }
        return c49532JcG;
    }

    public final C49532JcG getFontConfig() {
        return this.LJLLLL;
    }

    public final List<AbstractC37717ErB> getPlaceholderConfig() {
        return this.LJLLL;
    }

    public final void setFontConfig(C49532JcG c49532JcG) {
        this.LJLLLL = c49532JcG;
        requestLayout();
    }

    public final void setPlaceholderConfig(List<? extends AbstractC37717ErB> value) {
        o.LJIIIZ(value, "value");
        this.LJLLL = value;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71894SJm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLL = LJZ;
        this.LJLLLLLL = C61878OQg.INSTANCE;
        this.LJLZ = new Rect();
        setPlaceholderConfig(new C37716ErA("100%,20dp,'hello skeleton',40%").LIZIZ());
        TypedArray _init_$lambda$1 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bti}, 0, 0);
        o.LJIIIIZZ(_init_$lambda$1, "_init_$lambda$1");
        if (_init_$lambda$1.hasValue(0)) {
            C1E4.LJI(_init_$lambda$1, 0);
            String LLLZLZ = C16880lQ.LLLZLZ(_init_$lambda$1, 0);
            if (LLLZLZ != null) {
                setPlaceholderConfig(new C37716ErA(LLLZLZ).LIZIZ());
            } else {
                "Attribute value could not be coerced to String.".toString();
                throw new IllegalStateException("Attribute value could not be coerced to String.");
            }
        }
        _init_$lambda$1.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float measureText;
        float f;
        float f2;
        if (!LIZJ()) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        C49532JcG LJFF = LJFF();
        int i3 = 0;
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        List<? extends AbstractC37717ErB> list = this.LJLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (AbstractC37717ErB abstractC37717ErB : list) {
            if (abstractC37717ErB instanceof C37720ErE) {
                f2 = ((C37720ErE) abstractC37717ErB).LIZIZ;
            } else {
                if (abstractC37717ErB instanceof C37721ErF) {
                    f = ((C37721ErF) abstractC37717ErB).LIZIZ;
                    measureText = max;
                } else if (abstractC37717ErB instanceof C37719ErD) {
                    C37719ErD c37719ErD = (C37719ErD) abstractC37717ErB;
                    measureText = LJFF.LIZ.measureText(c37719ErD.LIZIZ);
                    f = c37719ErD.LIZJ;
                } else {
                    throw new C162476Zf();
                }
                f2 = f * measureText;
            }
            arrayList.add(Float.valueOf(f2));
        }
        this.LJLLLLLL = arrayList;
        if (mode != 1073741824) {
            Iterator it = arrayList.iterator();
            float f3 = 0.0f;
            while (it.hasNext()) {
                float floatValue = ((Number) it.next()).floatValue();
                if (floatValue > f3) {
                    f3 = floatValue;
                }
            }
            max = (int) Math.ceil(f3);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + max;
        if (mode2 != 1073741824) {
            if (this.LJLLLLLL.isEmpty()) {
                paddingTop = 0;
            } else {
                int size3 = (this.LJLLLLLL.size() - 1) * ((int) LJFF.LIZIZ);
                Paint.FontMetricsInt fontMetricsInt = LJFF.LIZ.getFontMetricsInt();
                paddingTop = (fontMetricsInt.bottom - fontMetricsInt.top) + size3;
            }
        }
        setMeasuredDimension(paddingRight, getPaddingBottom() + getPaddingTop() + paddingTop);
        LJ(this.LJLLLLLL.size());
        int paddingLeft = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        C49532JcG LJFF2 = LJFF();
        Paint.FontMetrics fontMetrics = LJFF2.LIZ.getFontMetrics();
        float min = Math.min(LJFF2.LIZ.getTextSize(), LJFF2.LIZIZ - C7MY.LIZIZ(2));
        for (Float f4 : this.LJLLLLLL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                float floatValue2 = f4.floatValue();
                Rect rect = this.LJLZ;
                int i5 = (int) ((i3 * LJFF2.LIZIZ) + (fontMetrics.ascent - fontMetrics.top) + paddingTop2);
                rect.top = i5;
                rect.bottom = (int) (i5 + min);
                if (C26338AVi.LIZLLL(this)) {
                    Rect rect2 = this.LJLZ;
                    rect2.right = measuredWidth;
                    rect2.left = (int) (measuredWidth - floatValue2);
                } else {
                    Rect rect3 = this.LJLZ;
                    rect3.left = paddingLeft;
                    rect3.right = (int) (paddingLeft + floatValue2);
                }
                ((Drawable) ListProtector.get(getPlaceholders(), i3)).setBounds(this.LJLZ);
                i3 = i4;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
