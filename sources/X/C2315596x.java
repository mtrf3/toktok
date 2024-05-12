package X;

import Y.AUListenerS93S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.96x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2315596x extends FrameLayout implements InterfaceC78981UzB {
    public final C62822Ol8 LJLIL;
    public InterfaceC56930MVy LJLILLLLZI;
    public InterfaceC2315796z LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View LIZIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    private final AnimatorSet getAnimatorSet() {
        return (AnimatorSet) this.LJLIL.getValue();
    }

    @Override // X.InterfaceC78981UzB
    public final void LIZJ() {
        InterfaceC56930MVy interfaceC56930MVy = this.LJLILLLLZI;
        if (interfaceC56930MVy != null) {
            interfaceC56930MVy.LIZJ();
        }
    }

    @Override // X.InterfaceC78981UzB
    public final void LIZ() {
        if (getAnimatorSet().isRunning()) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ValueAnimator ofInt = ValueAnimator.ofInt(getHeight(), 0);
        ofInt.setInterpolator(C55953Lxd.LIZIZ());
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS93S0100000_4(this, 13));
        getAnimatorSet().play(ofInt).with(ofFloat);
        getAnimatorSet().start();
    }

    @Override // X.InterfaceC78981UzB
    public C2S9 getNegativeButton() {
        C2S9 negative_button = (C2S9) LIZIZ(R.id.gyj);
        o.LJIIIIZZ(negative_button, "negative_button");
        return negative_button;
    }

    @Override // X.InterfaceC78981UzB
    public C2S9 getPositiveButton() {
        C2S9 positive_button = (C2S9) LIZIZ(R.id.hy_);
        o.LJIIIIZZ(positive_button, "positive_button");
        return positive_button;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2315796z interfaceC2315796z = this.LJLJI;
        if (interfaceC2315796z != null) {
            interfaceC2315796z.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2315796z interfaceC2315796z = this.LJLJI;
        if (interfaceC2315796z != null) {
            interfaceC2315796z.onDetachedFromWindow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2315596x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(C2315696y.LJLIL);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.tg, this, true);
    }
}
