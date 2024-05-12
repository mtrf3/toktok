package Y;

import X.C35150Dqs;
import X.C36152EGu;
import X.C39082FVm;
import X.C86801Y4v;
import X.DPN;
import X.EBB;
import X.EG1;
import X.EVK;
import X.EVL;
import X.FJD;
import X.FWX;
import X.G2F;
import X.X1D;
import com.bytedance.pitaya.cep_engine.timer.Timer;
import com.bytedance.pitaya.cep_package.util.AndroidUtility;

/* loaded from: classes7.dex */
public class ARunnableS8S0000100_6 implements Runnable {
    public final int $t;
    public long j0;

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
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long j = this.j0 / 100;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("client_local_flag_experiment_exposed_");
        LIZ.append(j);
        LIZ.append("_android");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (G2F.LIZ.contains(G2F.LIZIZ)) {
            G2F.LIZ(G2F.LJ, LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("hybrid_ab_experiment_exposed_");
        LIZ2.append(j);
        LIZ2.append("_android");
        G2F.LIZIZ(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("client_general_experiment_exposed_");
        LIZ3.append(j);
        LIZ3.append("_android");
        G2F.LIZIZ(X1D.LIZIZ(LIZ3));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("absdk_experiment_exposed_");
        LIZ4.append(j);
        LIZ4.append("_android");
        G2F.LIZIZ(X1D.LIZIZ(LIZ4));
    }

    public static final void run$0(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        AndroidUtility.m84async$lambda5(aRunnableS8S0000100_6.j0);
    }

    public static final void run$1(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        AndroidUtility.m85async$lambda7(aRunnableS8S0000100_6.j0);
    }

    public static final void run$2(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        try {
            EG1.LIZ().LLLLIL(aRunnableS8S0000100_6.j0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        try {
            EVK LIZJ = EVK.LIZJ();
            if (LIZJ != null) {
                long j = aRunnableS8S0000100_6.j0;
                synchronized (LIZJ) {
                    EVL evl = LIZJ.LIZIZ;
                    if (evl != null) {
                        evl.LIZJ(j);
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        try {
            EVK LIZJ = EVK.LIZJ();
            if (LIZJ != null) {
                long j = aRunnableS8S0000100_6.j0;
                synchronized (LIZJ) {
                    EVL evl = LIZJ.LIZIZ;
                    if (evl != null) {
                        evl.LIZ(j);
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        long j;
        try {
            if ((C36152EGu.LJ() && DPN.LIZ()) || C35150Dqs.LIZ() || ((Boolean) C86801Y4v.LIZ.getValue()).booleanValue()) {
                if (((Boolean) C86801Y4v.LIZJ.getValue()).booleanValue()) {
                    j = aRunnableS8S0000100_6.j0 * 2;
                } else {
                    j = aRunnableS8S0000100_6.j0;
                }
                EBB.LIZ(j);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        try {
            FWX.LIZLLL(aRunnableS8S0000100_6.j0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        try {
            Object obj = C39082FVm.LJFF;
            long j = aRunnableS8S0000100_6.j0;
            synchronized (obj) {
                if (j > C39082FVm.LJI) {
                    FJD.LIZ(C39082FVm.LIZLLL.LIZ);
                    C39082FVm.LJI = j;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        boolean LIZ;
        try {
            aRunnableS8S0000100_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS8S0000100_6 aRunnableS8S0000100_6) {
        Timer.m81timer$lambda1(aRunnableS8S0000100_6.j0);
    }

    public ARunnableS8S0000100_6(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 9:
                this.j0 = j;
                return;
            default:
                this.j0 = j;
                return;
        }
    }
}
