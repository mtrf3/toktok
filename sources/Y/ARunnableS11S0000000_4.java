package Y;

import X.C25644A4q;
import X.C25645A4r;
import X.C35810E3q;
import X.C36505EUj;
import X.C36546EVy;
import X.C38855FMt;
import X.C92J;
import X.C96F;
import X.C96H;
import X.C96I;
import X.C96J;
import X.C96K;
import X.C96L;
import X.FA3;
import X.FB0;
import X.IPH;
import X.InterfaceC2302291u;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* loaded from: classes5.dex */
public class ARunnableS11S0000000_4 implements Runnable {
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
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            default:
                return;
        }
    }

    public ARunnableS11S0000000_4(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        ((InterfaceC2302291u) ServiceManager.get().getService(InterfaceC2302291u.class)).LJJJI();
    }

    public static final void run$1(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        boolean LIZ;
        try {
            C35810E3q.LJFF = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        boolean LIZ;
        try {
            FA3.LIZIZ();
            FA3.LJI = C96F.LIZ;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        boolean LIZ;
        try {
            if (C35810E3q.LIZLLL < 2) {
                FB0.LIZ = false;
            }
            C35810E3q.LIZLLL--;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        boolean LIZ;
        try {
            C38855FMt c38855FMt = C92J.LIZ;
            int i = c38855FMt.LIZJ;
            if (i == 1) {
                if (C96J.LIZ) {
                    c38855FMt.LIZIZ(LiveExchangeConfirmThreshold.DEFAULT, C96K.LIZ, C25645A4r.LIZ);
                }
            } else if (i == 2) {
                if (C96I.LIZ) {
                    c38855FMt.LIZIZ(LiveExchangeConfirmThreshold.DEFAULT, C96L.LIZ, C25644A4q.LIZ);
                }
            } else if (i == 3 && C96H.LIZ) {
                c38855FMt.LIZIZ(LiveExchangeConfirmThreshold.DEFAULT, 0, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        boolean LIZ;
        try {
            if (C35810E3q.LIZJ < 2) {
                DoFrameController.LIZIZ = 0;
            }
            C35810E3q.LIZJ--;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS11S0000000_4 aRunnableS11S0000000_4) {
        boolean LIZ;
        try {
            C36546EVy.LIZ();
            C36505EUj.LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS11S0000000_4(String str, IPH iph, int i) {
        this.$t = i;
    }
}
