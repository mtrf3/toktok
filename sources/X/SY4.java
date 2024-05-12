package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SY4 extends TuxTextView {
    public final boolean LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public CharSequence LJZ;
    public final C113524cu LJZI;
    public Integer LJZL;
    public boolean LL;
    public int LLD;
    public boolean LLF;
    public InterfaceC88472Yns<? super SY4, C76800UCe> LLFF;
    public int LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public final SY3 LLIFFJFJJ;
    public boolean LLII;
    public final java.util.Map<Integer, View> LLIIII;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SY4(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SY4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    private final void setButtonVariantInner$___ob_twin___(int i) {
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIII;
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

    @Override // android.view.View
    public final boolean performClick() {
        this.LLII = true;
        return super.performClick();
    }

    public final void LJJJJL() {
        int i;
        if (!this.LJLLLL) {
            return;
        }
        int i2 = 0;
        if (this.LLI) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            C113524cu c113524cu = this.LJZI;
            if (c113524cu != null) {
                Integer num = this.LJZL;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -16777216;
                }
                c113524cu.LJ(i);
            }
            int i3 = this.LLIFFJFJJ.LIZJ;
            int i4 = width - i3;
            if (i4 < 0) {
                i4 = 0;
            }
            int LJJIIZ = O6R.LJJIIZ(i4 / 2.0f);
            C113524cu c113524cu2 = this.LJZI;
            if (c113524cu2 != null) {
                c113524cu2.setBounds(LJJIIZ, 0, i3 + LJJIIZ, this.LLIFFJFJJ.LIZIZ);
            }
            setCompoundDrawables(this.LJZI, null, null, null);
            return;
        }
        if (!TextUtils.isEmpty(getText())) {
            i2 = C278817o.LIZ(4.0f);
        }
        this.LLIFFJFJJ.LIZJ(i2);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    private final int getPaddingLeftValue() {
        if (getPaddingLeft() > 0) {
            return getPaddingLeft();
        }
        return C278817o.LIZ(8.0f);
    }

    private final int getPaddingRightValue() {
        if (getPaddingRight() > 0) {
            return getPaddingRight();
        }
        return C278817o.LIZ(8.0f);
    }

    public final void LJJJJ() {
        int i;
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            if (this.LLF) {
                i = 200;
            } else {
                i = this.LLD;
            }
            float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(i));
            ((GradientDrawable) background).setCornerRadius(LJIIZILJ);
            C78897Uxp.LJJJJJL(this, LJIIZILJ);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C113524cu c113524cu = this.LJZI;
        if (c113524cu != null) {
            c113524cu.LJIIIZ();
        }
    }

    public final boolean getSupportClickWhenDisable() {
        return this.LLFZ;
    }

    private final void setButtonSize$___ob_twin___(int i) {
        this.LJLLLLLL = i;
    }

    private final void setButtonVariantInner(int i) {
        SY7 sy7;
        setButtonVariantInner$___ob_twin___(i);
        if (i == 3) {
            return;
        }
        float f = 1.0f;
        if (i == -1) {
            setBackground(null);
            setAlpha(1.0f);
            return;
        }
        int i2 = R.attr.eb;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    } else {
                        if (!isEnabled()) {
                            i2 = R.attr.gp;
                        }
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cu);
                        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
                        c110614Vt.LJFF = Integer.valueOf(i2);
                        sy7 = new SY7(i2, c110614Vt, i2);
                    }
                } else {
                    C110614Vt c110614Vt2 = new C110614Vt();
                    c110614Vt2.LIZIZ = Integer.valueOf(R.attr.db);
                    sy7 = new SY7(R.attr.dj, c110614Vt2, R.attr.dj);
                }
            }
            C110614Vt c110614Vt3 = new C110614Vt();
            c110614Vt3.LIZIZ = Integer.valueOf(R.attr.cf);
            sy7 = new SY7(R.attr.go, c110614Vt3, R.attr.go);
        } else {
            C110614Vt c110614Vt4 = new C110614Vt();
            c110614Vt4.LIZIZ = Integer.valueOf(R.attr.eb);
            sy7 = new SY7(R.attr.dj, c110614Vt4, R.attr.dj);
        }
        Context ctx = getContext();
        setTextColorRes(sy7.LJLIL);
        if (!isEnabled()) {
            f = 0.4f;
        }
        setAlpha(f);
        setDefaultTintColorRes$tux_theme_release(sy7.LJLJI);
        C110614Vt c110614Vt5 = sy7.LJLILLLLZI;
        o.LJIIIIZZ(ctx, "ctx");
        setBackground(c110614Vt5.LIZ(ctx));
        LJJJJ();
    }

    public final void LJJJIL(boolean z) {
        if (!z) {
            setMinTextSize(-1.0f);
        } else {
            if (getMinTextSize() > 0) {
                return;
            }
            setMinTextSize(10.0f);
        }
    }

    public final void LJJJJJ(Integer num) {
        SY3 sy3 = this.LLIFFJFJJ;
        sy3.LJI = sy3.LIZIZ(num);
        SY3 sy32 = this.LLIFFJFJJ;
        sy32.LJII = sy32.LIZIZ(null);
        LJJJJL();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLFZ && !isEnabled() && isClickable() && motionEvent != null && motionEvent.getAction() == 1 && motionEvent.getX() <= getWidth() && motionEvent.getY() <= getHeight()) {
            performClick();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setButtonEndIcon(Integer num) {
        SY3 sy3 = this.LLIFFJFJJ;
        sy3.LJII = sy3.LIZIZ(num);
        LJJJJL();
    }

    public final void setButtonSize(int i) {
        SY5 sy5;
        setButtonSize$___ob_twin___(i);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        sy5 = new SY5(163, Integer.MAX_VALUE, 44, 42, 20, 20, 8);
                    }
                } else {
                    sy5 = new SY5(88, 122, 36, 52, 20, 20, 6);
                }
            } else {
                sy5 = new SY5(88, LiveTryModeCountDownThresholdSetting.DEFAULT, 28, 52, 16, 16, 5);
            }
        } else {
            sy5 = new SY5(64, 100, 24, 72, 12, 12, 4);
        }
        setMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(sy5.LJLIL))));
        int i2 = sy5.LJLILLLLZI;
        int i3 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            i3 = C7MY.LIZIZ(i2);
        }
        setMaxWidth(i3);
        setMinHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(sy5.LJLJI))));
        setTuxFont(sy5.LJLJJI);
        setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(sy5.LJLJJL))));
        setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(sy5.LJLJJLL))));
        this.LLD = sy5.LJLJL;
        LJJJJ();
    }

    public final void setButtonStartIcon(Integer num) {
        SY3 sy3 = this.LLIFFJFJJ;
        sy3.LJI = sy3.LIZIZ(num);
        LJJJJL();
    }

    public void setButtonVariant(int i) {
        this.LJLZ = i;
        setButtonVariantInner(i);
        InterfaceC88472Yns<? super SY4, C76800UCe> interfaceC88472Yns = this.LLFF;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this);
        }
    }

    public final void setDefaultTintColorRes$tux_theme_release(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            this.LJZL = Integer.valueOf(intValue);
            if (!this.LL) {
                this.LLIFFJFJJ.LIZLLL = Integer.valueOf(intValue);
                LJJJJL();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.LJLLLL) {
            setButtonVariant(this.LJLZ);
        }
        if (!z) {
            setLoading(false);
        }
    }

    public void setIconHeight(int i) {
        this.LLIFFJFJJ.LIZIZ = i;
        C113524cu c113524cu = this.LJZI;
        if (c113524cu != null) {
            c113524cu.LIZLLL(i);
        }
        LJJJJL();
    }

    public void setIconTintColor(int i) {
        this.LL = true;
        this.LLIFFJFJJ.LIZLLL = Integer.valueOf(i);
        LJJJJL();
    }

    public void setIconTintColorRes(int i) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            setIconTintColor(LJI.intValue());
        }
    }

    public void setIconWidth(int i) {
        this.LLIFFJFJJ.LIZJ = i;
        C113524cu c113524cu = this.LJZI;
        if (c113524cu != null) {
            c113524cu.LJI(i);
        }
        LJJJJL();
    }

    public final void setLoading(boolean z) {
        if (z != this.LLI) {
            this.LLI = z;
            if (z) {
                CharSequence text = getText();
                o.LJIIIIZZ(text, "text");
                this.LJZ = text;
                setText("");
                C113524cu c113524cu = this.LJZI;
                if (c113524cu != null) {
                    c113524cu.LJIIIIZZ();
                    return;
                }
                return;
            }
            C113524cu c113524cu2 = this.LJZI;
            if (c113524cu2 != null) {
                c113524cu2.LJIIIZ();
            }
            setText(this.LJZ);
        }
    }

    public final void setSupportClickWhenDisable(boolean z) {
        this.LLFZ = z;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        boolean z = true;
        if (layoutParams == null || layoutParams.width != -2 || getMinWidth() <= 0) {
            z = false;
        }
        LJJIJLIJ(z);
        super.onMeasure(i, i2);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.LLI) {
            if (charSequence != null && charSequence.length() > 0) {
                this.LJZ = charSequence;
            }
            charSequence = "";
        }
        super.setText(charSequence, bufferType);
        LJJJJL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SY4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIIII = C62850Ola.LJFF(context, "context");
        this.LJLLLLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJLZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJZ = "";
        this.LLFII = Integer.MAX_VALUE;
        this.LJLLLL = true;
        SY3 sy3 = new SY3(this);
        this.LLIFFJFJJ = sy3;
        sy3.LIZ(attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.p2, R.attr.bq8, R.attr.bq9, R.attr.bq_, R.attr.bqb, R.attr.bro, R.attr.brp, R.attr.bs0, R.attr.bs2, R.attr.bue}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…xButton, defStyleAttr, 0)");
        this.LJLLLLLL = obtainStyledAttributes.getInt(3, -1);
        this.LJLZ = obtainStyledAttributes.getInt(4, LiveLayoutPreloadThreadPriority.DEFAULT);
        this.LLF = obtainStyledAttributes.getBoolean(2, false);
        LJJJIL(obtainStyledAttributes.getBoolean(1, false));
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.LJZI = new C113524cu(context, resourceId);
        }
        obtainStyledAttributes.recycle();
        this.LLFFF = getMinWidth();
        this.LLFII = getMaxWidth();
        setPadding(getPaddingLeftValue(), 0, getPaddingRightValue(), 0);
        setGravity(17);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Float.valueOf(4.0f))));
        setButtonSize(this.LJLLLLLL);
        setButtonVariant(this.LJLZ);
        float f = sy3.LJ;
        if (f > 0.0f) {
            sy3.LIZJ = (int) f;
        }
        float f2 = sy3.LJFF;
        if (f2 > 0.0f) {
            sy3.LIZIZ = (int) f2;
        }
        LJJJJL();
        int i2 = this.LLFII;
        if (i2 < Integer.MAX_VALUE) {
            setMaxWidth(i2);
        }
        int i3 = this.LLFFF;
        if (i3 > 0) {
            setMinWidth(i3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SY4(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r4 & 4
            if (r0 == 0) goto L10
            r0 = 2130968868(0x7f040124, float:1.7546402E38)
        Lc:
            r1.<init>(r2, r3, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SY4.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJJJJL();
    }
}
