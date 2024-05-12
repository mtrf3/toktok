package Y;

import X.AbstractC87863Ye3;
import X.C15280iq;
import X.C15380j0;
import X.C87772Yca;
import X.C87818YdK;
import X.C87822YdO;
import X.C87827YdT;
import com.bytedance.android.alog.Alog;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public class ARunnableS52S0100000_16 implements Runnable {
    public final int $t;
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
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS52S0100000_16 aRunnableS52S0100000_16) {
        boolean LIZ;
        try {
            C87772Yca c87772Yca = (C87772Yca) aRunnableS52S0100000_16.l0;
            int i = c87772Yca.LIZ;
            String str = c87772Yca.LIZIZ;
            String str2 = c87772Yca.LIZJ;
            long j = c87772Yca.LIZLLL;
            long j2 = c87772Yca.LJ;
            Alog alog = C15280iq.LIZ;
            if (alog != null) {
                alog.LJIIL(i, j, j2, str, str2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS52S0100000_16 aRunnableS52S0100000_16) {
        boolean LIZ;
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) aRunnableS52S0100000_16.l0;
            if (networkChangeNotifierAutoDetect.LJIIL) {
                networkChangeNotifierAutoDetect.LJIIL = false;
            } else {
                networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS52S0100000_16 aRunnableS52S0100000_16) {
        boolean LIZ;
        try {
            NetworkChangeNotifier networkChangeNotifier = (NetworkChangeNotifier) aRunnableS52S0100000_16.l0;
            networkChangeNotifier.LIZJ(networkChangeNotifier.LIZLLL, networkChangeNotifier.getCurrentDefaultNetId());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS52S0100000_16 aRunnableS52S0100000_16) {
        boolean LIZ;
        try {
            ((AbstractC87863Ye3) aRunnableS52S0100000_16.l0).LIZIZ();
            ((AbstractC87863Ye3) aRunnableS52S0100000_16.l0).LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS52S0100000_16 aRunnableS52S0100000_16) {
        boolean LIZ;
        try {
            ((C87822YdO) aRunnableS52S0100000_16.l0).LIZIZ.LJFF = C15380j0.LIZIZ(R.color.ca);
            C87822YdO c87822YdO = (C87822YdO) aRunnableS52S0100000_16.l0;
            C87818YdK c87818YdK = c87822YdO.LIZIZ;
            if (c87818YdK.LJIILJJIL == null) {
                c87822YdO.LIZJ.setCardBackgroundColor(c87818YdK.LJFF);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS52S0100000_16 aRunnableS52S0100000_16) {
        boolean LIZ;
        try {
            ((C87827YdT) aRunnableS52S0100000_16.l0).LIZIZ.LJFF = C15380j0.LIZIZ(R.color.ca);
            C87827YdT c87827YdT = (C87827YdT) aRunnableS52S0100000_16.l0;
            C87818YdK c87818YdK = c87827YdT.LIZIZ;
            if (c87818YdK.LJIILJJIL == null) {
                c87827YdT.LIZJ.setCardBackgroundColor(c87818YdK.LJFF);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS52S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
