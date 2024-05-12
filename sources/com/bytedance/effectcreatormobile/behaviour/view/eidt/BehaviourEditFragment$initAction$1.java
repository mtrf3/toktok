package com.bytedance.effectcreatormobile.behaviour.view.eidt;

import X.AbstractC03490Bt;
import X.C1CS;
import X.C68322mC;
import X.C93443aQx;
import X.C93447aR1;
import X.C94191ad1;
import Y.IDUListenerS265S0100000_42;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class BehaviourEditFragment$initAction$1 extends C1CS {
    public final /* synthetic */ BehaviourEditFragment LJLIL;

    public BehaviourEditFragment$initAction$1(BehaviourEditFragment behaviourEditFragment) {
        this.LJLIL = behaviourEditFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.animation.ValueAnimator] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // X.C1CS, X.InterfaceC03480Bs
    public final void LIZIZ(AbstractC03490Bt transition) {
        ?? r2;
        LinearLayout linearLayout;
        o.LJIIIZ(transition, "transition");
        if (this.LJLIL.getView() == null) {
            return;
        }
        final C68322mC c68322mC = new C68322mC();
        C94191ad1 c94191ad1 = (C94191ad1) this.LJLIL.Al();
        if (c94191ad1 != null && (linearLayout = c94191ad1.LJLJJL) != null) {
            r2 = C93443aQx.LIZ(linearLayout, true);
        } else {
            r2 = 0;
        }
        c68322mC.element = r2;
        if (r2 != 0) {
            r2.addUpdateListener(new IDUListenerS265S0100000_42(this, 0));
        }
        Animator animator = (Animator) c68322mC.element;
        if (animator != null) {
            animator.addListener(new C93447aR1(c68322mC, c68322mC));
        }
        ObjectAnimator objectAnimator = (ObjectAnimator) c68322mC.element;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        LifecycleOwner viewLifecycleOwner = this.LJLIL.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        viewLifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment$initAction$1$onTransitionStart$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ValueAnimator valueAnimator = (ValueAnimator) C68322mC.this.element;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    C68322mC.this.element = null;
                }
            }
        });
    }

    @Override // X.C1CS, X.InterfaceC03480Bs
    public final void LIZJ(AbstractC03490Bt transition) {
        o.LJIIIZ(transition, "transition");
        this.LJLIL.Nl();
    }
}
