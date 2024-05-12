package X;

import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ALAdapterS10S0200000_13;
import Y.ALAdapterS4S0110000_13;
import Y.AUListenerS4S0100001_13;
import Y.AUListenerS79S0300000_13;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UZa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC77394UZa implements UZX {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public final C77395UZb LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;

    public abstract void LIZIZ();

    public void LIZLLL() {
        if (!this.LJLLI && this.LJLLJ) {
            this.LJLIL.setVisibility(0);
            if (this.LJLLILLLL) {
                this.LJLILLLLZI.setVisibility(8);
                this.LJLJI.setVisibility(0);
            } else {
                this.LJLILLLLZI.setVisibility(0);
                this.LJLJI.setVisibility(8);
            }
        }
    }

    public final void LIZJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LJLLI && this.LJLLJ && this.LJLLILLLL) {
            this.LJLLILLLL = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new ALAdapterS10S0200000_13(this, interfaceC65784Pro, 24));
            animatorSet.playSequentially(LJ(true), LJFF(true), LJI(true));
            animatorSet.start();
        }
    }

    public final Animator LJ(boolean z) {
        ValueAnimator ofFloat;
        float f;
        ObjectAnimator ofFloat2;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        C56K c56k = new C56K();
        if (z) {
            f = 0.0f;
        } else {
            f = -this.LJLJLJ;
        }
        c56k.element = f;
        C56K c56k2 = new C56K();
        c56k2.element = this.LJLJLJ;
        ofFloat.addListener(new ALAdapterS4S0110000_13(z, this, 3));
        ofFloat.addUpdateListener(new AUListenerS79S0300000_13(this, c56k, c56k2, 5));
        ofFloat.setDuration(200L);
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(this.LJLJJI, "alpha", 1.0f, 0.0f);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(this.LJLJJI, "alpha", 0.0f, 1.0f);
        }
        ofFloat2.setDuration(150L);
        if (z) {
            animatorSet.playSequentially(ofFloat2, ofFloat);
        } else {
            animatorSet.playSequentially(ofFloat, ofFloat2);
        }
        return animatorSet;
    }

    public final ValueAnimator LJFF(boolean z) {
        float translationX;
        ValueAnimator ofFloat;
        C56K c56k = new C56K();
        if (z) {
            translationX = -this.LJLJL;
        } else {
            translationX = this.LJLIL.getTranslationX();
        }
        c56k.element = translationX;
        C56K c56k2 = new C56K();
        c56k2.element = this.LJLJLLL + this.LJLJL;
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ofFloat.addUpdateListener(new AUListenerS79S0300000_13(this, c56k, c56k2, 6));
        ofFloat.addListener(new ALAdapterS4S0110000_13(z, this, 4));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public final Animator LJI(boolean z) {
        float translationX;
        ValueAnimator ofFloat;
        ObjectAnimator ofFloat2;
        if (z) {
            translationX = this.LJLJLLL;
        } else {
            translationX = this.LJLIL.getTranslationX();
        }
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f);
        } else {
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        }
        ofFloat.addUpdateListener(new AUListenerS4S0100001_13(this, translationX, 1));
        ofFloat.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            ofFloat2 = ObjectAnimator.ofFloat(this.LJLJJI, "alpha", 0.0f, 1.0f);
        } else {
            ofFloat2 = ObjectAnimator.ofFloat(this.LJLJJI, "alpha", 1.0f, 0.0f);
        }
        ofFloat2.setDuration(150L);
        ofFloat2.addListener(new ALAdapterS4S0110000_13(z, this, 5));
        animatorSet.playTogether(ofFloat2, ofFloat);
        return animatorSet;
    }

    public AbstractC77394UZa(Context context, View view, View view2, View view3, View view4, View view5, C77395UZb c77395UZb) {
        o.LJIIIZ(context, "context");
        this.LJLIL = view;
        this.LJLILLLLZI = view2;
        this.LJLJI = view3;
        this.LJLJJI = view4;
        this.LJLJJL = view5;
        this.LJLJJLL = c77395UZb;
        this.LJLJL = KL2.LIZJ(context, 90.0f);
        this.LJLJLJ = KL2.LIZJ(context, 36.0f);
        this.LJLJLLL = KL2.LIZJ(context, 10.0f);
        this.LJLL = c77395UZb.LIZ;
        view5.findViewById(R.id.b4f);
        view5.findViewById(R.id.b4d);
        KL2.LIZJ(context, 22.0f);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c77395UZb.LIZIZ;
        if (interfaceC65784Pro != null) {
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(interfaceC65784Pro, 192), view2);
            C16880lQ.LJIIJ(new ACListenerS33S0100000_13(interfaceC65784Pro, 193), view3);
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = c77395UZb.LIZJ;
        if (interfaceC65784Pro2 != null) {
            C16880lQ.LJIIJ(new ACListenerS47S0200000_13(interfaceC65784Pro2, this, 52), view4);
        }
        view5.setVisibility(8);
    }
}
