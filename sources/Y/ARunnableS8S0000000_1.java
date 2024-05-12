package Y;

import X.C16880lQ;
import X.C26045AKb;
import X.C2NK;
import X.C2NZ;
import X.C58282Qm;
import X.C62622d0;
import X.C84763XOl;
import X.V0Q;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ARunnableS8S0000000_1 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        NewUserProgressBarManager.LJFF.postDelayed(this, V0Q.Default.nextLong(60000L, 120001L));
        C2NZ c2nz = NewUserProgressBarManager.LIZJ;
        if (c2nz != null && C2NK.LIZ() < 100) {
            String string = c2nz.getContext().getString(R.string.p87);
            o.LJIIIIZZ(string, "context.getString(R.stri…ressPush_FYP_widget_body)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{Integer.valueOf(C2NK.LIZ())}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c2nz.setText(LLLZ);
        }
    }

    public ARunnableS8S0000000_1(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS8S0000000_1 aRunnableS8S0000000_1) {
        C62622d0.LIZ().LIZIZ(null, 3);
    }

    public static final void run$1(ARunnableS8S0000000_1 aRunnableS8S0000000_1) {
        boolean LIZ;
        try {
            SpecActServiceImpl.LJJJIL().LJFF();
            SpecActServiceImpl.LJJJIL().LJJIJLIJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S0000000_1 aRunnableS8S0000000_1) {
        boolean LIZ;
        try {
            aRunnableS8S0000000_1.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S0000000_1 aRunnableS8S0000000_1) {
        boolean LIZ;
        try {
            C58282Qm.LIZ(R.string.abc);
            C58282Qm.LIZ(R.string.a_o);
            C58282Qm.LIZ(R.string.a_p);
            C58282Qm.LIZ(R.string.a_n);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S0000000_1 aRunnableS8S0000000_1) {
        boolean LIZ;
        try {
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                C26045AKb c26045AKb = new C26045AKb(LJIIIIZZ);
                c26045AKb.LJIIIIZZ(R.string.glx);
                c26045AKb.LIZLLL(5000L);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS8S0000000_1(Aweme aweme, int i) {
        this.$t = i;
    }
}
