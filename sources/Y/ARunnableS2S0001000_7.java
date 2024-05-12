package Y;

import X.C26045AKb;
import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ARunnableS2S0001000_7 implements Runnable {
    public final int $t;
    public int i0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS2S0001000_7 aRunnableS2S0001000_7) {
        boolean LIZ;
        try {
            if (ActivityStack.getValidTopActivity() != null) {
                C26045AKb c26045AKb = new C26045AKb(ActivityStack.getValidTopActivity());
                c26045AKb.LJIIIIZZ(aRunnableS2S0001000_7.i0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0001000_7 aRunnableS2S0001000_7) {
        boolean LIZ;
        try {
            if (ActivityStack.getValidTopActivity() != null) {
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                o.LJIIIIZZ(validTopActivity, "getValidTopActivity()");
                C26045AKb c26045AKb = new C26045AKb(validTopActivity);
                c26045AKb.LJIIIIZZ(aRunnableS2S0001000_7.i0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0001000_7(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
