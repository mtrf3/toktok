package X;

import Y.ALAdapterS5S0000000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.ValueAnimator;

/* renamed from: X.UGy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class RunnableC76924UGy implements Runnable {
    public final /* synthetic */ C76923UGx LJLIL;

    public final void LIZ() {
        C76923UGx c76923UGx = this.LJLIL;
        if (!c76923UGx.LLJ) {
            return;
        }
        ValueAnimator valueAnimator = c76923UGx.LLIZLLLIL;
        if (valueAnimator != null) {
            C16880lQ.LJLJL(valueAnimator);
            this.LJLIL.LLIZLLLIL.cancel();
        }
        C76923UGx c76923UGx2 = this.LJLIL;
        c76923UGx2.LL.setShadowLayer(0.0f, 0.0f, 0.0f, c76923UGx2.LJLLI);
        this.LJLIL.LLIZLLLIL = ValueAnimator.ofFloat(1.0f);
        this.LJLIL.LLIZLLLIL.addUpdateListener(new AUListenerS100S0100000_13(this, 53));
        this.LJLIL.LLIZLLLIL.addListener(new ALAdapterS5S0000000_13(1));
        this.LJLIL.LLIZLLLIL.setDuration(300L);
        this.LJLIL.LLIZLLLIL.start();
        this.LJLIL.LLJ = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC76924UGy(C76923UGx c76923UGx) {
        this.LJLIL = c76923UGx;
    }
}
