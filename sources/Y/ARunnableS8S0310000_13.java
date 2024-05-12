package Y;

import X.C32433Co9;
import X.C76930UHe;
import X.C78072UkW;
import X.C78074UkY;
import X.C78368UpI;
import X.C78391Upf;
import X.InterfaceC65784Pro;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class ARunnableS8S0310000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS8S0310000_13 aRunnableS8S0310000_13) {
        boolean LIZ;
        try {
            ((ArrayList) ((C76930UHe) aRunnableS8S0310000_13.l0).LJLJJLL).remove((ViewPropertyAnimator) aRunnableS8S0310000_13.l1);
            if (!aRunnableS8S0310000_13.z3) {
                ((View) aRunnableS8S0310000_13.l2).setVisibility(8);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S0310000_13 aRunnableS8S0310000_13) {
        boolean LIZ;
        try {
            C78074UkY.LIZ((List) aRunnableS8S0310000_13.l0, aRunnableS8S0310000_13.z3, (C78072UkW) aRunnableS8S0310000_13.l1);
            C32433Co9.LIZJ((C78072UkW) aRunnableS8S0310000_13.l1, aRunnableS8S0310000_13.z3);
            ((InterfaceC65784Pro) aRunnableS8S0310000_13.l2).invoke();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S0310000_13 aRunnableS8S0310000_13) {
        ((C78391Upf) aRunnableS8S0310000_13.l0).LJI((C78368UpI) aRunnableS8S0310000_13.l1, aRunnableS8S0310000_13.z3, (List) aRunnableS8S0310000_13.l2);
    }

    public ARunnableS8S0310000_13(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
    }
}
