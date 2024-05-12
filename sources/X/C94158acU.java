package X;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.acU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94158acU implements InterfaceC93409aQP {
    public C93612aTg LIZ;

    @Override // X.InterfaceC93409aQP
    public final void LIZIZ() {
        C93612aTg c93612aTg = this.LIZ;
        if (c93612aTg != null) {
            c93612aTg.setVisibility(0);
            ObjectAnimator objectAnimator = c93612aTg.LJLIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c93612aTg, "rotation", 0.0f, 360.0f);
            c93612aTg.LJLIL = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(1000L);
            }
            ObjectAnimator objectAnimator2 = c93612aTg.LJLIL;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator3 = c93612aTg.LJLIL;
            if (objectAnimator3 != null) {
                objectAnimator3.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator4 = c93612aTg.LJLIL;
            if (objectAnimator4 != null) {
                objectAnimator4.start();
            }
            c93612aTg.LJLILLLLZI = true;
        }
    }

    @Override // X.InterfaceC93409aQP
    public final void stopLoading() {
        C93612aTg c93612aTg = this.LIZ;
        if (c93612aTg != null) {
            ObjectAnimator objectAnimator = c93612aTg.LJLIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            c93612aTg.setVisibility(8);
            c93612aTg.LJLILLLLZI = false;
        }
    }

    @Override // X.InterfaceC93409aQP
    public final View LIZ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dv8, parent, true);
        if (LLLLIILL != null) {
            View childAt = ((ViewGroup) LLLLIILL).getChildAt(r1.getChildCount() - 1);
            if (childAt != null) {
                C93612aTg c93612aTg = (C93612aTg) childAt;
                this.LIZ = c93612aTg;
                return c93612aTg;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ugc.effectcreator.foundation.loading.ItemLoadingView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
