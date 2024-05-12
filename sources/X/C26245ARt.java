package X;

import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ARt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26245ARt extends ASB {
    public static final int LJLL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public static final InterpolatorC216808f6 LJLLI = new InterpolatorC216808f6(0.25f, 0.1f, 0.25f, 1.0f);
    public final InterfaceC26269ASr LJLJJI;
    public final AS3 LJLJJL;
    public final ViewGroup LJLJJLL;
    public final ViewGroup LJLJL;
    public AnimatorSet LJLJLJ;
    public InterfaceC65784Pro<C76800UCe> LJLJLLL;

    @Override // X.ASG
    public final void LIZ(View v) {
        int i;
        C18Z c18z;
        int i2;
        Context context;
        o.LJIIIZ(v, "v");
        AnimatorSet animatorSet = this.LJLJLJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(0f, 1f)");
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 29));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        o.LJIIIIZZ(ofFloat2, "ofFloat(1f, 0f)");
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new AUListenerS93S0100000_4(this, 31));
        int i3 = LJLL;
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, 0);
        o.LJIIIIZZ(ofInt, "ofInt(XOFFSET, 0)");
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 33));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, -i3);
        o.LJIIIIZZ(ofInt2, "ofInt(0, -XOFFSET)");
        ofInt2.setDuration(300L);
        ofInt2.addUpdateListener(new AUListenerS93S0100000_4(this, 35));
        ViewGroup viewGroup = this.LJLJL;
        o.LJI(viewGroup);
        ViewGroup viewGroup2 = this.LJLJJLL;
        o.LJI(viewGroup2);
        ValueAnimator ofInt3 = ValueAnimator.ofInt(viewGroup.getMeasuredHeight(), viewGroup2.getMeasuredHeight());
        o.LJIIIIZZ(ofInt3, "ofInt(mSecondaryLayout!!…onsView!!.measuredHeight)");
        ofInt3.setDuration(300L);
        ofInt3.addUpdateListener(new AUListenerS93S0100000_4(this, 37));
        ViewGroup viewGroup3 = this.LJLJL;
        ViewGroup.LayoutParams layoutParams = null;
        if (viewGroup3 != null) {
            layoutParams = viewGroup3.getLayoutParams();
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i4 = marginLayoutParams.topMargin;
        ViewGroup viewGroup4 = this.LJLJJLL;
        int[] iArr = new int[2];
        if (viewGroup4 != null) {
            viewGroup4.getLocationOnScreen(iArr);
        }
        if (FCD.LJII()) {
            int i5 = iArr[1];
            if (viewGroup4 != null && (context = viewGroup4.getContext()) != null) {
                i2 = C63081OpJ.LJJJJLI(context);
            } else {
                i2 = 0;
            }
            i = i5 - i2;
        } else {
            i = iArr[1];
        }
        new C26246ARu(marginLayoutParams, i, i4, this).setDuration(200L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.LJLJLJ = animatorSet2;
        animatorSet2.setInterpolator(LJLLI);
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofInt3);
        animatorSet2.start();
        this.LJLJLLL.invoke();
        Object obj = this.LJLJJL;
        if ((obj instanceof ATB) && (c18z = (C18Z) obj) != null) {
            c18z.findViewById(R.id.hht).setPadding(0, O6R.LJJIIZ(KL2.LIZJ(c18z.getContext(), 8.0f)), 0, 0);
        }
    }

    @Override // X.ASG
    public final void LIZIZ(View v) {
        o.LJIIIZ(v, "v");
        LIZ(v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26245ARt(InterfaceC26269ASr actionsManager, AS3 as3) {
        super(actionsManager, as3);
        ViewGroup viewGroup;
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
        this.LJLJJL = as3;
        if (as3 != null) {
            viewGroup = as3.LJIIIZ();
        } else {
            viewGroup = null;
        }
        this.LJLJJLL = viewGroup;
        this.LJLJL = as3 != null ? as3.LJII() : null;
        this.LJLJLLL = new AqS154S0100000_4(this, 1122);
    }
}
