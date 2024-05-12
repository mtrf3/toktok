package Y;

import X.C26045AKb;
import android.app.Activity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ARunnableS13S1000000_7 implements Runnable {
    public final int $t;
    public String s0;

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

    public static final void run$0(ARunnableS13S1000000_7 aRunnableS13S1000000_7) {
        boolean LIZ;
        try {
            if (ActivityStack.getValidTopActivity() != null) {
                C26045AKb c26045AKb = new C26045AKb(ActivityStack.getValidTopActivity());
                c26045AKb.LJIIIZ(aRunnableS13S1000000_7.s0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS13S1000000_7 aRunnableS13S1000000_7) {
        boolean LIZ;
        try {
            if (ActivityStack.getValidTopActivity() != null) {
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                o.LJIIIIZZ(validTopActivity, "getValidTopActivity()");
                C26045AKb c26045AKb = new C26045AKb(validTopActivity);
                c26045AKb.LJIIIZ(aRunnableS13S1000000_7.s0);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS13S1000000_7(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
