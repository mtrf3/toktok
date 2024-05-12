package X;

import Y.ARunnableS40S0100000_4;
import android.animation.Animator;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.96s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2315096s extends C77869UhF {
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    public final void LIZIZ() {
        this.LJLILLLLZI = false;
        cancelAnimation();
        getBreathAnimator().cancel();
        setScaleY(1.0f);
        setScaleX(1.0f);
        setProgress(0.0f);
    }

    private final Animator.AnimatorListener getAnimatorListener() {
        return (Animator.AnimatorListener) this.LJLIL.getValue();
    }

    private final Animator getBreathAnimator() {
        return (Animator) this.LJLJJI.getValue();
    }

    public final Interpolator getEase() {
        return (Interpolator) this.LJLJI.getValue();
    }

    public final void LIZ() {
        if (!getBreathAnimator().isRunning()) {
            pause();
            getBreathAnimator().start();
        }
        this.LJLILLLLZI = true;
    }

    @Override // X.C77869UhF, X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void pause() {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            LIZIZ();
        } else {
            C1DH.LJJIJIIJI(new ARunnableS40S0100000_4(this, 91));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2315096s(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1040));
        this.LJLJI = C221108m2.LIZIZ(C2314996r.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1041));
        setAnimation("story_breathing_ring_lottie.json");
        addAnimatorListener(getAnimatorListener());
    }
}
