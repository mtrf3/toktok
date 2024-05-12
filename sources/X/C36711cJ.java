package X;

import Y.IDRunnableS65S0000000;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveHarConfig;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.1cJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36711cJ implements InterfaceC20960s0, FQK {
    public static long LIZJ;
    public static boolean LJ;
    public static boolean LJFF;
    public static ScheduledFuture<?> LJI;
    public static final C36711cJ LIZ = new C36711cJ();
    public static final C5H3 LIZIZ = C78996UzQ.LJJIJIIJI(C27Y.LJLIL);
    public static final LiveHarConfig LIZLLL = LiveClientAISettings.INSTANCE.aiServices().liveHarConfig;
    public static final IDRunnableS65S0000000 LJII = new IDRunnableS65S0000000(13);

    public static FQE LJFF() {
        return (FQE) LIZIZ.getValue();
    }

    public static final void LJI() {
        if (LJFF || !LIZLLL.enable) {
            return;
        }
        LJFF = true;
        o.LJIIIZ(-1, "value");
        C19660pu.LIZ.put("livesdk_har_status", -1);
        FQE LJFF2 = LJFF();
        if (LJFF2 != null) {
            LJFF2.LJI();
        }
    }

    @Override // X.InterfaceC20960s0
    public final int LIZIZ() {
        FQE LJFF2;
        if (!LJFF || (LJFF2 = LJFF()) == null) {
            return -1;
        }
        return LJFF2.LJII();
    }

    @Override // X.InterfaceC20960s0
    public final void LIZLLL() {
        if (!LJFF) {
            return;
        }
        FQE LJFF2 = LJFF();
        if (LJFF2 != null) {
            LJFF2.LJIILJJIL();
        }
        C1VD c1vd = C1VD.LIZ;
        C34921Yq c34921Yq = C34921Yq.LIZ;
        synchronized (c1vd) {
            try {
                Iterator<InterfaceC17120lo> it = C1VD.LIZIZ.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next(), c34921Yq)) {
                        it.remove();
                    }
                }
                if (C1VD.LIZIZ.isEmpty()) {
                    BZJ.LIZ.getClass();
                    BU1.LIZIZ.remove(c1vd);
                    C1VD.LIZJ = false;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        LIZJ(false);
    }

    @Override // X.InterfaceC20960s0
    public final boolean LJ() {
        return LIZLLL.timerTriggerEnable;
    }

    public final void LJII() {
        if (!LJFF) {
            return;
        }
        FQE LJFF2 = LJFF();
        if (LJFF2 != null) {
            LJFF2.LJIILIIL(this);
        }
        if (LIZLLL.timerTriggerEnable) {
            C1VD.LIZ.LIZIZ(C34921Yq.LIZ);
        }
    }

    public final void LJIIIIZZ() {
        if (!LJFF) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LIZJ >= LIZLLL.minTriggerInterval) {
            C0NB.LIZIZ("LiveHarService", "triggerSmartHarPredict start");
            FQE LJFF2 = LJFF();
            if (LJFF2 != null && LJFF2.LJ()) {
                C012403c.LJ("triggerSmartHarPredict result: ", LIZIZ(), "LiveHarService");
                LIZJ = currentTimeMillis;
            }
        }
    }

    @Override // X.InterfaceC20960s0
    public final boolean isEnable() {
        return LIZLLL.enable;
    }

    @Override // X.InterfaceC20960s0
    public final boolean LJJZZIII() {
        FQE LJFF2 = LJFF();
        if (LJFF2 != null) {
            return LJFF2.LJIIIZ();
        }
        return false;
    }

    @Override // X.InterfaceC20960s0
    public final void LIZJ(boolean z) {
        if (!LJFF) {
            return;
        }
        LiveHarConfig liveHarConfig = LIZLLL;
        if (liveHarConfig.timerTriggerEnable && liveHarConfig.enable) {
            StringBuilder LJI2 = JBR.LJI("timerTriggerSmartHarPredict start:", z, ", timerPredictRunning:");
            C19U.LIZJ(LJI2, LJ, LJI2, "LiveHarService");
            if (z) {
                if (!LJ) {
                    LJ = true;
                    LJI = C38016Ew0.LIZLLL.schedule(LJII, liveHarConfig.timerTriggerInterval, TimeUnit.MILLISECONDS);
                    if (LIZJ == 0) {
                        LJIIIIZZ();
                        return;
                    }
                    return;
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = LJI;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                LJI = null;
            }
            LJ = false;
        }
    }

    @Override // X.FQK
    public final void LIZ(java.util.Map map, int i, boolean z) {
        if (!LJFF) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onHARPredictChanged :: [success == ");
        LIZ2.append(z);
        LIZ2.append(", harStatus == ");
        LIZ2.append(i);
        LIZ2.append(", statusMap == ");
        LIZ2.append(map);
        LIZ2.append(']');
        C0NB.LIZIZ("LiveHarService", X1D.LIZIZ(LIZ2));
        Integer value = Integer.valueOf(i);
        o.LJIIIZ(value, "value");
        C19660pu.LIZ.put("livesdk_har_status", value);
    }
}
