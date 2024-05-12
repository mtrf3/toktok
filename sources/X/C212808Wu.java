package X;

import Y.AUListenerS92S0100000_3;
import Y.IDAListenerS1S0110000_3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Wu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212808Wu extends FrameLayout {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLJJI;
    public ValueAnimator LJLJJL;
    public final C212818Wv LJLJJLL;
    public final C62822Ol8 LJLJL;

    static {
        TBV tbv = new TBV(C212808Wu.class, "_isShowing", "get_isShowing()Z", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbv};
    }

    private final boolean get_isShowing() {
        return LIZ(this, LJLJLJ[0]).booleanValue();
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        return (ViewGroup.MarginLayoutParams) this.LJLJL.getValue();
    }

    public final void LIZ() {
        if (get_isShowing()) {
            set_isShowing(false);
            LIZJ(getMarginLayoutParams().bottomMargin, (-getHeight()) - this.LJLJI);
        }
    }

    public final void LIZIZ() {
        if (!get_isShowing()) {
            set_isShowing(true);
            LIZJ(getMarginLayoutParams().bottomMargin, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJJL.cancel();
    }

    public final int getAdjustMargin() {
        return this.LJLJI;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getVisibilityChangeListener() {
        return this.LJLJJI;
    }

    private final void set_isShowing(boolean z) {
        LIZIZ(LJLJLJ[0], this, Boolean.valueOf(z));
    }

    public final void setAdjustMargin(int i) {
        this.LJLJI = i;
        getMarginLayoutParams().bottomMargin = (-getLayoutParams().height) - i;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + i);
        requestLayout();
    }

    public final void setAnimating(boolean z) {
        this.LJLIL = z;
    }

    public final void setClosing(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setInitValue(int i) {
        if (get_isShowing()) {
            return;
        }
        getMarginLayoutParams().bottomMargin = (-i) - this.LJLJI;
        requestLayout();
    }

    public final void setVisibilityChangeListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLJJI = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8Wv] */
    public C212808Wu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJL = new ValueAnimator();
        final Boolean bool = Boolean.FALSE;
        this.LJLJJLL = new AbstractC214518bP<Boolean>(bool) { // from class: X.8Wv
            @Override // X.AbstractC214518bP
            public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool2, Boolean bool3) {
                o.LJIIIZ(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                InterfaceC88472Yns<Boolean, C76800UCe> visibilityChangeListener = this.getVisibilityChangeListener();
                if (visibilityChangeListener != null) {
                    visibilityChangeListener.invoke(Boolean.valueOf(booleanValue));
                }
                C2U8.LIZ(new C1794572n(booleanValue));
            }
        };
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1617));
    }

    public final void LIZJ(int i, int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJL.cancel();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.LJLJJL = valueAnimator;
        valueAnimator.setIntValues(i, i2);
        this.LJLJJL.setInterpolator(new SJI());
        this.LJLJJL.setDuration(350L);
        this.LJLJJL.addListener(new IDAListenerS1S0110000_3(this, z, 2));
        this.LJLJJL.addUpdateListener(new AUListenerS92S0100000_3(this, 10));
        this.LJLJJL.start();
    }
}
