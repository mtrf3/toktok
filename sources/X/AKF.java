package X;

import Y.ACListenerS24S0100000_4;
import Y.ACListenerS39S0200000_4;
import Y.IDLListenerS58S0200000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AKF extends LinearLayout {
    public final AttributeSet LJLIL;
    public final int LJLILLLLZI;
    public A21 LJLJI;
    public final float LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final InterfaceC65784Pro<C76800UCe> getDismiss() {
        return this.LJLJJL;
    }

    public final void LIZIZ(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        float f4 = 0.0f;
        if (z) {
            f2 = this.LJLJJI;
            f = 0.0f;
        } else {
            f = this.LJLJJI;
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "translationY", f2, f).setDuration(348L);
        o.LJIIIIZZ(duration, "ofFloat(\n            thi…       ).setDuration(348)");
        duration.setInterpolator(new InterpolatorC227028va());
        float[] fArr = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr[1] = f4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
        if (z) {
            j = 150;
        } else {
            j = 100;
        }
        ObjectAnimator duration2 = ofFloat.setDuration(j);
        o.LJIIIIZZ(duration2, "ofFloat(\n            thi…n(if (isIn) 150 else 100)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration);
        animatorSet.start();
    }

    public final void LIZJ(A21 bundle) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        CharSequence charSequence;
        o.LJIIIZ(bundle, "bundle");
        this.LJLJI = bundle;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(this.LJLIL, new int[]{R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.pr, R.attr.ps, R.attr.pt, R.attr.pu, R.attr.r7, R.attr.ta, R.attr.tb}, R.attr.jz, this.LJLILLLLZI);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…   defStyleAttr\n        )");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        int color = obtainStyledAttributes.getColor(11, 0);
        int i5 = obtainStyledAttributes.getInt(10, 0);
        int i6 = obtainStyledAttributes.getInt(9, 0);
        int color2 = obtainStyledAttributes.getColor(4, 0);
        int i7 = obtainStyledAttributes.getInt(3, 0);
        int i8 = obtainStyledAttributes.getInt(1, 0);
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        int color3 = obtainStyledAttributes.getColor(8, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        int color4 = obtainStyledAttributes.getColor(6, 0);
        obtainStyledAttributes.recycle();
        C16880lQ.LLLZIIL(R.layout.bw, C16880lQ.LLZIL(getContext()), this);
        ViewGroup viewGroup = (ViewGroup) LIZ(R.id.ajh);
        viewGroup.setBackground(drawable);
        viewGroup.setLayoutMode(1);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "context");
        layoutParams.width = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() + Math.min(C63081OpJ.LJJJJL(context) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(430)));
        viewGroup.setLayoutParams(layoutParams);
        View floating_notice_layout = LIZ(R.id.dj7);
        o.LJIIIIZZ(floating_notice_layout, "floating_notice_layout");
        C26338AVi.LJIIIZ(floating_notice_layout, null, null, null, Integer.valueOf(bundle.LJIIIIZZ), 23);
        if (bundle.LJIIIZ == 1) {
            View content_layout = LIZ(R.id.btt);
            o.LJIIIIZZ(content_layout, "content_layout");
            C78897Uxp.LJJJJJL(content_layout, C32151Nz.LJIIZILJ(12));
            C16880lQ.LJIJ((RelativeLayout) LIZ(R.id.btt), new ACListenerS39S0200000_4(bundle, this, 7));
        }
        View LIZ = LIZ(R.id.kdl);
        InterfaceC88472Yns<? super FrameLayout, C76800UCe> interfaceC88472Yns = bundle.LIZ;
        if (interfaceC88472Yns == null) {
            i = 8;
        } else {
            o.LJIIIIZZ(LIZ, "this");
            interfaceC88472Yns.invoke(LIZ);
            i = 0;
        }
        LIZ.setVisibility(i);
        CharSequence charSequence2 = bundle.LIZLLL;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = !z;
        CharSequence charSequence3 = bundle.LJ;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = !z2;
        TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.title);
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        if (z4) {
            tuxTextView.setTextDirection(5);
            tuxTextView.setTuxFont(i5);
            tuxTextView.setTextColor(color);
            tuxTextView.setText(bundle.LIZLLL);
        }
        if (!z5) {
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.LJJIJIL(R.id.title).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.addRule(15);
            tuxTextView.LJJIJIL(R.id.title).setLayoutParams(layoutParams3);
        }
        TuxTextView tuxTextView2 = (TuxTextView) LIZ(R.id.ghd);
        CharSequence charSequence4 = bundle.LJ;
        if (z5) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        tuxTextView2.setVisibility(i3);
        if (z5) {
            tuxTextView2.setTextDirection(5);
            tuxTextView2.setTuxFont(i7);
            CharSequence charSequence5 = bundle.LIZLLL;
            if (charSequence5 != null && charSequence5.length() > 0) {
                color = color2;
            }
            tuxTextView2.setTextColor(color);
            tuxTextView2.setText(charSequence4);
            tuxTextView2.setMovementMethod(AnonymousClass898.LIZ);
            tuxTextView2.setClickable(false);
            tuxTextView2.setLongClickable(false);
        }
        CharSequence charSequence6 = bundle.LJFF;
        if (charSequence6 == null || charSequence6.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = !z3;
        SY4 sy4 = (SY4) LIZ(R.id.h3x);
        if (z6) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        sy4.setVisibility(i4);
        if (z6) {
            sy4.setButtonSize(i8);
            Integer num = bundle.LJII;
            if (num != null) {
                sy4.setButtonVariant(num.intValue());
            }
            sy4.setText(bundle.LJFF);
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(bundle, 16));
            if (bundle.LJI > 0) {
                ViewGroup.LayoutParams layoutParams4 = sy4.getLayoutParams();
                layoutParams4.width = bundle.LJI;
                sy4.setLayoutParams(layoutParams4);
            }
        }
        TuxIconView initView$lambda$8 = (TuxIconView) LIZ(R.id.cwh);
        if (bundle.LJIIIZ == 1) {
            initView$lambda$8.setIconRes(resourceId2);
            initView$lambda$8.setTintColor(color4);
        } else {
            initView$lambda$8.setIconRes(resourceId);
            initView$lambda$8.setTintColor(color3);
            C16880lQ.LJJJ(initView$lambda$8, new ACListenerS24S0100000_4(this, 17));
        }
        o.LJIIIIZZ(initView$lambda$8, "initView$lambda$8");
        C78897Uxp.LJJJJLI(initView$lambda$8, null);
        InterfaceC88471Ynr<? super TuxTextView, ? super TuxTextView, Integer> interfaceC88471Ynr = bundle.LJIILJJIL;
        if (interfaceC88471Ynr != null) {
            LIZ(R.id.dj7).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(this, interfaceC88471Ynr, 0));
        } else if (bundle.LJIIIZ == 1) {
            setEndAlignment(15);
        } else if (!z6) {
            LIZ(R.id.dj7).getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(this, AKG.LJLIL, 0));
        }
        A21 a21 = this.LJLJI;
        if (a21 != null) {
            if (a21.LIZ == null || (charSequence = a21.LJFF) == null || charSequence.length() == 0) {
                return;
            }
            int LIZIZ = C7MY.LIZIZ(52);
            int LIZIZ2 = C7MY.LIZIZ(36);
            int LIZIZ3 = C7MY.LIZIZ(4);
            A21 a212 = this.LJLJI;
            if (a212 != null) {
                int LIZJ = C47959Irz.LIZJ(8, a212.LJI);
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                int LJJJJL = C63081OpJ.LJJJJL(context2) - ((((LIZIZ + LIZIZ2) + LIZIZ3) + LIZJ) + LJJIIZ);
                TextPaint textPaint = new TextPaint();
                A21 a213 = this.LJLJI;
                if (a213 != null) {
                    T5R t5r = new T5R(a213.LIZLLL);
                    A21 a214 = this.LJLJI;
                    if (a214 != null) {
                        T5R t5r2 = new T5R(a214.LJ);
                        TextView title = (TextView) LIZ(R.id.title);
                        o.LJIIIIZZ(title, "title");
                        StaticLayout LJJIIJ = C1A7.LJJIIJ(title, t5r, textPaint, LJJJJL, null);
                        TextView message = (TextView) LIZ(R.id.ghd);
                        o.LJIIIIZZ(message, "message");
                        StaticLayout LJJIIJ2 = C1A7.LJJIIJ(message, t5r2, textPaint, LJJJJL, null);
                        if (LJJIIJ.getLineCount() <= 3 && LJJIIJ2.getLineCount() <= 3) {
                            return;
                        }
                        LIZ(R.id.kdl).setVisibility(8);
                        TextView title2 = (TextView) LIZ(R.id.title);
                        o.LJIIIIZZ(title2, "title");
                        if (C1A7.LJJIIJ(title2, t5r, textPaint, LJJJJL, null).getLineCount() <= 3 && LJJIIJ2.getLineCount() <= 3) {
                            return;
                        }
                        ((TuxTextView) LIZ(R.id.title)).setTuxFont(i6);
                        return;
                    }
                    o.LJIJI("bundle");
                    throw null;
                }
                o.LJIJI("bundle");
                throw null;
            }
            o.LJIJI("bundle");
            throw null;
        }
        o.LJIJI("bundle");
        throw null;
    }

    public final void setDismiss(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJL = interfaceC65784Pro;
    }

    public final void setEndAlignment(int i) {
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.j2_).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(i);
        LIZ(R.id.j2_).setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        this.LJLIL = attributeSet;
        this.LJLILLLLZI = 0;
        this.LJLJJI = C32151Nz.LJIIZILJ(20);
    }

    public final boolean LIZLLL(int i, int i2) {
        int[] iArr = new int[2];
        LIZ(R.id.btt).getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int measuredWidth = LIZ(R.id.btt).getMeasuredWidth() + i3;
        int measuredHeight = LIZ(R.id.btt).getMeasuredHeight() + i4;
        if (i4 > i2 || i2 > measuredHeight || i3 > i || i > measuredWidth) {
            return false;
        }
        return true;
    }
}
