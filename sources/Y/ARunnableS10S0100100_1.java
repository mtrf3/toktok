package Y;

import X.C16880lQ;
import X.C26045AKb;
import X.C45804HyK;
import X.C4EG;
import X.C4EH;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public class ARunnableS10S0100100_1 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

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

    public static final void run$0(ARunnableS10S0100100_1 aRunnableS10S0100100_1) {
        boolean LIZ;
        String string;
        Activity LJIJJ;
        try {
            Context context = (Context) aRunnableS10S0100100_1.l0;
            if (context != null && (string = context.getString(R.string.pxv, Long.valueOf(aRunnableS10S0100100_1.j1))) != null && (LJIJJ = C45804HyK.LJIJJ((Context) aRunnableS10S0100100_1.l0)) != null && !LJIJJ.isFinishing()) {
                C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                c26045AKb.LJIIIZ(string);
                c26045AKb.LJIIJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S0100100_1 aRunnableS10S0100100_1) {
        boolean LIZ;
        ViewGroup viewGroup;
        try {
            if (aRunnableS10S0100100_1.j1 == ((C4EH) aRunnableS10S0100100_1.l0).getLastShowTime()) {
                C4EH c4eh = (C4EH) aRunnableS10S0100100_1.l0;
                if (c4eh.getParent() != null) {
                    ViewParent parent = c4eh.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C16880lQ.LJLLL(c4eh, viewGroup);
                    }
                }
                ((TuxTextView) c4eh.LIZ(R.id.bst)).setText("");
                c4eh.setTipState(C4EG.DEFAULT);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS10S0100100_1(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
