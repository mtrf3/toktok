package com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.tabicon;

import X.AbstractC55918Lx4;
import X.ActivityC45651qj;
import X.C45804HyK;
import android.animation.AnimatorSet;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class VSABaseTabIconAnim extends AbstractC55918Lx4 {
    public AnimatorSet LIZIZ;

    @Override // X.AbstractC55918Lx4
    public final void LIZIZ() {
        try {
            AnimatorSet animatorSet = this.LIZIZ;
            if (animatorSet != null && animatorSet.isRunning()) {
                animatorSet.end();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJFF(Context context) {
        final AnimatorSet animatorSet;
        final ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (animatorSet = this.LIZIZ) != null) {
            LJJIFFI.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.tabicon.VSABaseTabIconAnim$bindActivityLifeCycle$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    AnimatorSet animatorSet2;
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_DESTROY && (animatorSet2 = VSABaseTabIconAnim.this.LIZIZ) != null && animatorSet2.isRunning()) {
                        try {
                            animatorSet.cancel();
                        } catch (Throwable unused) {
                        }
                        LJJIFFI.getLifecycle().removeObserver(this);
                    }
                }
            });
        }
    }
}
