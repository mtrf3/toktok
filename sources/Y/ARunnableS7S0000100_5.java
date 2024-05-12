package Y;

import X.BZI;
import X.C0NB;
import X.C16880lQ;
import X.C18230nb;
import X.C28787BRn;
import X.C29697Bl7;
import X.C29702BlC;
import X.C32147CjX;
import X.C78840Uwu;
import X.CN1;
import X.InterfaceC06390Mx;
import X.X1D;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.NegativeTestExperiment;
import com.bytedance.android.livesdkapi.host.IHostResource;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS7S0000100_5 implements Runnable {
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j = 0;
        while (!C16880lQ.LLLLIIIILLL().isInterrupted()) {
            if (j >= Long.MAX_VALUE) {
                j = 0;
            }
            j++;
            if (elapsedRealtime2 - elapsedRealtime < NegativeTestExperiment.INSTANCE.getCyclePeriod() - this.j0) {
                elapsedRealtime2 = SystemClock.elapsedRealtime();
            } else {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("sleep ");
                    LIZ.append(this.j0);
                    LIZ.append("ms then set preTime and curTime");
                    C0NB.LJIIIZ("negative_test", X1D.LIZIZ(LIZ));
                    Thread.sleep(this.j0);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("sleep ");
                    LIZ2.append(this.j0);
                    LIZ2.append("ms end");
                    C0NB.LJIIIZ("negative_test", X1D.LIZIZ(LIZ2));
                } catch (InterruptedException unused) {
                    C0NB.LJIIIZ("negative_test", "interceptor!!---> exit dead loop");
                    return;
                } catch (Exception e) {
                    C0NB.LJIIIZ("negative_test", e.toString());
                    return;
                }
            }
        }
    }

    public final void LIZ$1() {
        BZI LIZ = C28787BRn.LIZ("livesdk_game_partnership_pre_card_save_time");
        LIZ.LJIJJ(Long.valueOf(this.j0), "save_time");
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IHostResource.class);
        o.LJIIIIZZ(LIZ2, "getService(IHostResource::class.java)");
        LIZ.LJIJJ(Boolean.valueOf(((IHostResource) LIZ2).Br0("tiktok_live_interaction_gamepad_watch_live")), "exist");
        LIZ.LJJIIJZLJL();
    }

    public static final void run$0(ARunnableS7S0000100_5 aRunnableS7S0000100_5) {
        boolean LIZ;
        try {
            aRunnableS7S0000100_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0000100_5 aRunnableS7S0000100_5) {
        boolean LIZ;
        try {
            C29697Bl7.LJIIIZ(aRunnableS7S0000100_5.j0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0000100_5 aRunnableS7S0000100_5) {
        boolean LIZ;
        try {
            C29702BlC LIZ2 = C18230nb.LIZ("ttlive_broadcast_created_all");
            LIZ2.LJI(Long.valueOf(aRunnableS7S0000100_5.j0 - C29697Bl7.LIZ), "duration");
            C78840Uwu.LJIIIIZZ(LIZ2);
            LIZ2.LJIIIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S0000100_5 aRunnableS7S0000100_5) {
        boolean LIZ;
        try {
            aRunnableS7S0000100_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S0000100_5 aRunnableS7S0000100_5) {
        boolean LIZ;
        try {
            C32147CjX.LIZ.remove(Long.valueOf(aRunnableS7S0000100_5.j0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0000100_5(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
