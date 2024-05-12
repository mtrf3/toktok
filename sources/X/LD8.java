package X;

import Y.AUListenerS71S0101000_9;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class LD8 extends ValueAnimator {
    public static final /* synthetic */ int LJLJJI = 0;
    public final int LJLIL;
    public final AUListenerS71S0101000_9 LJLILLLLZI;
    public final ArrayList<ValueAnimator.AnimatorUpdateListener> LJLJI;

    public LD8() {
        int LIZ;
        if (C53152KtY.LIZ() <= 0) {
            LIZ = 1;
        } else {
            LIZ = C53152KtY.LIZ();
        }
        this.LJLIL = LIZ;
        this.LJLILLLLZI = new AUListenerS71S0101000_9(this, 6);
        this.LJLJI = new ArrayList<>();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        this.LJLJI.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            if (this.LJLJI.size() == 0) {
                super.addUpdateListener(this.LJLILLLLZI);
            }
            this.LJLJI.add(animatorUpdateListener);
        }
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        if (animatorUpdateListener != null) {
            this.LJLJI.remove(animatorUpdateListener);
            if (this.LJLJI.size() == 0) {
                super.removeUpdateListener(this.LJLILLLLZI);
            }
        }
    }
}
