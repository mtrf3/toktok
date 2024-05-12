package com.bytedance.tux.input;

import X.C0NY;
import X.C221108m2;
import X.C278817o;
import X.C32151Nz;
import X.C48690J9a;
import X.C52637KlF;
import X.C61589OFd;
import X.C62822Ol8;
import X.C62850Ola;
import X.C79045V0n;
import X.C7MY;
import X.C8FU;
import X.O6R;
import X.T5R;
import X.T5V;
import X.T5Y;
import X.UYR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TuxTextView extends AppCompatTextView {
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final Map<Integer, View> LJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxTextView(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public View LJJIJIL(int i) {
        Map<Integer, View> map = this.LJLLL;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    private final T5Y getAutoSizeHelper() {
        return (T5Y) this.LJLLI.getValue();
    }

    public final void LJJIL() {
        int i = this.LJLJLJ;
        int i2 = this.LJLJLLL;
        boolean z = false;
        if (1 <= i2 && i2 < i) {
            T5Y autoSizeHelper = getAutoSizeHelper();
            int i3 = this.LJLJLLL;
            int i4 = this.LJLJLJ;
            autoSizeHelper.getClass();
            if (i3 > 0) {
                if (i4 > i3) {
                    autoSizeHelper.LIZJ = i3;
                    autoSizeHelper.LIZLLL = i4;
                    int i5 = 1;
                    while (true) {
                        i3 += autoSizeHelper.LJ;
                        if (i3 > autoSizeHelper.LIZLLL) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    int[] iArr = new int[i5];
                    int i6 = autoSizeHelper.LIZJ;
                    for (int i7 = 0; i7 < i5; i7++) {
                        iArr[i7] = i6;
                        i6 += autoSizeHelper.LJ;
                    }
                    autoSizeHelper.LJI = iArr;
                    autoSizeHelper.LIZIZ = true;
                    autoSizeHelper.LIZ(1);
                    z = true;
                } else {
                    String LJIIJJI = C48690J9a.LJIIJJI("Maximum auto-size text size ( ", i4, " px) is less or equal to minimum auto-size text size ( ", i3, " px)");
                    LJIIJJI.toString();
                    throw new IllegalArgumentException(LJIIJJI);
                }
            } else {
                String LIZIZ = C0NY.LIZIZ("Minimum auto-size text size ( ", i3, " px) is less or equal to (0px)");
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
        } else {
            T5Y autoSizeHelper2 = getAutoSizeHelper();
            autoSizeHelper2.LIZJ = -1;
            autoSizeHelper2.LIZLLL = -1;
            autoSizeHelper2.LJI = new int[0];
            autoSizeHelper2.LIZIZ = false;
        }
        this.LJLL = z;
    }

    public final void LJJJI() {
        setText(getText());
    }

    public final int getMinTextSize() {
        return this.LJLJLLL;
    }

    private final void setTuxFont$___ob_twin___(int i) {
        LJJIL();
        LJJJI();
    }

    public final void LJJIJLIJ(boolean z) {
        this.LJLLILLLL = z;
        getAutoSizeHelper().LJIIIIZZ = z;
    }

    public final void LJJJ(float f) {
        setTextSize(1, f);
        this.LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f + 4)));
        this.LJLJLJ = (int) getTextSize();
        LJJIL();
        LJJJI();
    }

    public final void setMinTextSize(float f) {
        this.LJLJLLL = C278817o.LIZ(f);
        LJJIL();
        LJJJI();
    }

    public final void setMinTextSizePx(int i) {
        this.LJLJLLL = i;
        LJJIL();
        LJJJI();
    }

    public final void setTextColorRes(int i) {
        Integer LJI;
        Context context = getContext();
        if (context != null && (LJI = C79045V0n.LJI(i, context)) != null) {
            setTextColor(LJI.intValue());
        }
    }

    public final void setTuxFont(int i) {
        boolean z;
        if (!((Boolean) C52637KlF.LIZ.getValue()).booleanValue()) {
            Object tag = getTag(R.id.ku4);
            if (tag == null || o.LJ(tag, Boolean.TRUE)) {
                z = true;
            } else {
                z = false;
            }
            T5V LIZIZ = UYR.LIZIZ(i, z);
            setTextSize(1, LIZIZ.LJLIL);
            Typeface LIZIZ2 = C61589OFd.LIZIZ(LIZIZ.LJLJI);
            if (LIZIZ2 != null) {
                setTypeface(LIZIZ2);
            }
            this.LJLJLJ = C7MY.LIZIZ(LIZIZ.LJLIL);
            this.LJLJL = C7MY.LIZIZ(LIZIZ.LJLILLLLZI);
            setLetterSpacing(LIZIZ.LJLJJI);
            setTuxFont$___ob_twin___(i);
        }
    }

    public final void setMinTextSize(int i) {
        this.LJLJLLL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.LJLL
            if (r0 == 0) goto L12
            boolean r0 = r6.LJLLILLLL
            if (r0 != 0) goto L12
            android.text.TextPaint r1 = r6.getPaint()
            int r0 = r6.LJLJLJ
            float r0 = (float) r0
            r1.setTextSize(r0)
        L12:
            boolean r0 = r6.LJLLJ
            if (r0 == 0) goto L72
            kotlin.jvm.internal.AqS18S0102000_12 r4 = new kotlin.jvm.internal.AqS18S0102000_12
            r0 = 0
            r4.<init>(r7, r8, r6, r0)
            r5 = 0
            java.lang.Class<android.text.DynamicLayout> r1 = android.text.DynamicLayout.class
            java.lang.String r0 = "sStaticLayout"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L59
            r3 = 1
            if (r0 == 0) goto L5c
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L59
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = "null cannot be cast to non-null type android.text.StaticLayout"
            kotlin.jvm.internal.o.LJII(r2, r0)     // Catch: java.lang.Exception -> L59
            android.text.StaticLayout r2 = (android.text.StaticLayout) r2     // Catch: java.lang.Exception -> L59
            if (r2 == 0) goto L5d
            java.lang.Class<android.text.StaticLayout> r1 = android.text.StaticLayout.class
            java.lang.String r0 = "mMaximumVisibleLineCount"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L5d
            if (r1 == 0) goto L55
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L5d
            int r0 = r1.getInt(r2)     // Catch: java.lang.Exception -> L5d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L5d
            int r0 = r6.getMaxLines()     // Catch: java.lang.Exception -> L56
            r1.setInt(r2, r0)     // Catch: java.lang.Exception -> L56
            goto L56
        L55:
            r1 = r5
        L56:
            r0 = r5
            r5 = r1
            goto L5e
        L59:
            r2 = r5
            r0 = r5
            goto L5e
        L5c:
            r2 = r5
        L5d:
            r0 = r5
        L5e:
            r4.invoke()
            if (r5 == 0) goto L75
            if (r0 == 0) goto L66
            goto L6a
        L66:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L6e
        L6a:
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L75
        L6e:
            r5.setInt(r2, r0)     // Catch: java.lang.Exception -> L75
            goto L75
        L72:
            super.onMeasure(r7, r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.input.TuxTextView.onMeasure(int, int):void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        SpannableString t5r;
        C8FU c8fu;
        Integer valueOf;
        if (charSequence instanceof T5R) {
            t5r = (SpannableString) charSequence;
        } else {
            t5r = new T5R(charSequence);
        }
        int i = this.LJLJL;
        if (i > 0) {
            C8FU[] spans = (C8FU[]) t5r.getSpans(0, t5r.length(), C8FU.class);
            o.LJIIIIZZ(spans, "spans");
            ArrayList arrayList = new ArrayList();
            for (C8FU c8fu2 : spans) {
                if (true ^ c8fu2.LJLJI) {
                    arrayList.add(c8fu2);
                }
            }
            Iterator it = arrayList.iterator();
            Object obj = null;
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int i2 = ((C8FU) obj).LJLIL;
                    do {
                        Object next = it.next();
                        int i3 = ((C8FU) next).LJLIL;
                        if (i2 < i3) {
                            obj = next;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            }
            C8FU c8fu3 = (C8FU) obj;
            if (c8fu3 == null || (valueOf = Integer.valueOf(c8fu3.LJLIL)) == null || valueOf.intValue() <= 0) {
                c8fu = new C8FU(i);
                c8fu.LJLJI = true;
            } else {
                c8fu = new C8FU(valueOf.intValue());
            }
            for (C8FU c8fu4 : spans) {
                t5r.removeSpan(c8fu4);
            }
            t5r.setSpan(c8fu, 0, t5r.length(), 17);
        } else {
            t5r.getClass();
        }
        super.setText(t5r, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TuxTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLLL = C62850Ola.LJFF(context, "context");
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 80));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqy, R.attr.bsm}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "ctx.obtainStyledAttribut…extView, defStyleAttr, 0)");
        this.LJLJLLL = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        int i2 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
        setTuxFont(i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TuxTextView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r4 & 4
            if (r0 == 0) goto L10
            r0 = 2130968911(0x7f04014f, float:1.754649E38)
        Lc:
            r1.<init>(r2, r3, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.input.TuxTextView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void LJJIZ(float f, int i, Typeface typeface, float f2) {
        setTextSize(1, f);
        this.LJLJLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(f)));
        setTypeface(typeface);
        this.LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
        setLetterSpacing(f2);
        LJJIL();
        LJJJI();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.LJLL) {
            getAutoSizeHelper().LIZ(2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LJLL) {
            getAutoSizeHelper().LIZ(3);
        }
    }
}
