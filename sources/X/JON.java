package X;

import Y.AUListenerS90S0100000_1;
import Y.IDAListenerS72S0100000_3;
import Y.IDAListenerS76S0100000_8;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JON extends ViewGroup {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final TuxIconView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public AnimatorSet LJLJI;
    public InterfaceC1795472w LJLJJI;
    public EnumC48916JHs LJLJJL;

    private final int getIconMeasuredHeight() {
        return this.LJLILLLLZI.getMeasuredHeight();
    }

    public final EnumC48916JHs getState() {
        return this.LJLJJL;
    }

    public final void setAnimator(InterfaceC1795472w provider) {
        o.LJIIIZ(provider, "provider");
        this.LJLJJI = provider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JON(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = new InterfaceC1795472w() { // from class: X.72u
            @Override // X.InterfaceC1795472w
            public final AnimatorSet LIZ(TuxIconView viewToShow, TuxIconView viewToHide) {
                o.LJIIIZ(viewToShow, "viewToShow");
                o.LJIIIZ(viewToHide, "viewToHide");
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setInterpolator(new Interpolator() { // from class: X.72v
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        return (float) ((Math.sin(((f - (3.642f / 4)) * 6.283185307179586d) / 3.642f) * Math.pow(2.0d, (-10) * f)) + 1);
                    }
                });
                ofFloat.setDuration(343L);
                ofFloat.addListener(new IDAListenerS72S0100000_3(viewToShow, 35));
                ofFloat.addListener(new IDAListenerS72S0100000_3(viewToShow, 34));
                ofFloat.addUpdateListener(new AUListenerS90S0100000_1(viewToShow, 20));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
                ofFloat2.setDuration(200L);
                ofFloat2.addListener(new IDAListenerS72S0100000_3(viewToHide, 37));
                ofFloat2.addListener(new IDAListenerS72S0100000_3(viewToHide, 36));
                ofFloat2.addUpdateListener(new AUListenerS90S0100000_1(viewToHide, 19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                return animatorSet;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.yt, R.attr.yu, R.attr.yv, R.attr.yw, R.attr.yx});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.BinaryStateIcon)");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = obtainStyledAttributes.getResourceId(1, 0);
        c2068389v.LIZLLL = Integer.valueOf(obtainStyledAttributes.getColor(2, -16777216));
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = obtainStyledAttributes.getResourceId(3, 0);
        c2068389v2.LIZLLL = Integer.valueOf(obtainStyledAttributes.getColor(4, -65536));
        JHK jhk = EnumC48916JHs.Companion;
        EnumC48916JHs enumC48916JHs = EnumC48916JHs.OFF;
        int i = obtainStyledAttributes.getInt(0, enumC48916JHs.getValue());
        jhk.getClass();
        EnumC48916JHs LIZ = JHK.LIZ(i);
        this.LJLJJL = LIZ != null ? LIZ : enumC48916JHs;
        obtainStyledAttributes.recycle();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setLayoutParams(generateDefaultLayoutParams());
        tuxIconView.setTuxIcon(c2068389v);
        this.LJLILLLLZI = tuxIconView;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setLayoutParams(generateDefaultLayoutParams());
        tuxIconView2.setTuxIcon(c2068389v2);
        this.LJLIL = tuxIconView2;
        addView(tuxIconView);
        addView(tuxIconView2);
        LIZ(this.LJLJJL, false);
    }

    public final void LIZ(EnumC48916JHs state, boolean z) {
        AnimatorSet LIZ;
        AnimatorSet animatorSet;
        o.LJIIIZ(state, "state");
        AqS155S0200000_8 aqS155S0200000_8 = new AqS155S0200000_8(state, this, 20);
        if (z) {
            AnimatorSet animatorSet2 = this.LJLJI;
            if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LJLJI) != null) {
                animatorSet.cancel();
            }
            int i = C48917JHt.LIZ[state.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    LIZ = this.LJLJJI.LIZ(this.LJLIL, this.LJLILLLLZI);
                } else {
                    throw new C162476Zf();
                }
            } else {
                LIZ = this.LJLJJI.LIZ(this.LJLILLLLZI, this.LJLIL);
            }
            this.LJLJI = LIZ;
            if (LIZ != null) {
                LIZ.addListener(new IDAListenerS76S0100000_8(aqS155S0200000_8, 0));
            }
            AnimatorSet animatorSet3 = this.LJLJI;
            if (animatorSet3 != null) {
                animatorSet3.start();
                return;
            }
            return;
        }
        aqS155S0200000_8.invoke();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i3 = (size - paddingLeft) - paddingRight;
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        this.LJLILLLLZI.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        this.LJLIL.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        setMeasuredDimension(ViewGroup.resolveSize(getIconMeasuredHeight() + paddingLeft + paddingRight, i), ViewGroup.resolveSize(getIconMeasuredHeight() + paddingLeft + paddingRight, i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iconMeasuredHeight = getIconMeasuredHeight() + paddingLeft;
        int iconMeasuredHeight2 = getIconMeasuredHeight() + paddingTop;
        this.LJLILLLLZI.layout(paddingLeft, paddingTop, iconMeasuredHeight, iconMeasuredHeight2);
        this.LJLIL.layout(paddingLeft, paddingTop, iconMeasuredHeight, iconMeasuredHeight2);
    }
}
