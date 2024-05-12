package Y;

import X.AbstractC32698CsQ;
import X.C0A2;
import X.C30896CAq;
import X.C32676Cs4;
import X.C32681Cs9;
import X.C68322mC;
import X.C72242sW;
import X.CJ1;
import X.RunnableC31065CHd;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public class ARunnableS6S0301000_5 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        LinearLayoutManager linearLayoutManager;
        C32676Cs4 c32676Cs4 = (C32676Cs4) this.l0;
        if (c32676Cs4.LLL == 1) {
            C32681Cs9 c32681Cs9 = c32676Cs4.LJZ;
            if (c32681Cs9 != null) {
                c32681Cs9.LJLZ((LinkedList) ((C68322mC) this.l1).element);
            }
        } else {
            C32681Cs9 c32681Cs92 = c32676Cs4.LJZ;
            if (c32681Cs92 != null) {
                c32681Cs92.LJZ((LinkedList) ((C68322mC) this.l1).element);
            }
        }
        if (this.i3 != -1) {
            ((C32676Cs4) this.l0).LJJL();
            RunnableC31065CHd runnableC31065CHd = ((C32676Cs4) this.l0).LJLZ;
            C0A2 c0a2 = null;
            if (runnableC31065CHd != null) {
                c0a2 = runnableC31065CHd.getLayoutManager();
            }
            if ((c0a2 instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) c0a2) != null) {
                linearLayoutManager.LJFF(this.i3, 0);
            }
        }
        C32676Cs4 c32676Cs42 = (C32676Cs4) this.l0;
        c32676Cs42.LJJJJLI(c32676Cs42.LJJIL(Long.valueOf(((C72242sW) this.l2).element)));
    }

    public static final void run$0(ARunnableS6S0301000_5 aRunnableS6S0301000_5) {
        boolean LIZ;
        try {
            aRunnableS6S0301000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0301000_5 aRunnableS6S0301000_5) {
        boolean LIZ;
        try {
            CJ1 cj1 = (CJ1) aRunnableS6S0301000_5.l0;
            cj1.LIZ(cj1.LJIIIIZZ, (View) aRunnableS6S0301000_5.l1, aRunnableS6S0301000_5.i3, (EmoteModel) aRunnableS6S0301000_5.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S0301000_5(Object obj, C32676Cs4 c32676Cs4, C68322mC<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> c68322mC, int i, C72242sW c72242sW) {
        this.$t = c72242sW;
        this.l0 = obj;
        this.l1 = c32676Cs4;
        this.i3 = c68322mC;
        this.l2 = i;
    }
}
