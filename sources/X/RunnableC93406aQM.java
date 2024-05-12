package X;

import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;

/* renamed from: X.aQM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93406aQM implements Runnable {
    public static final RunnableC93406aQM LJLIL = new RunnableC93406aQM();

    public static void LIZ() {
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("cke_technology_loading_watch", C113554cx.LJJL(new OSZ("stage", C93407aQN.LIZJ), new OSZ("keep_time", String.valueOf(System.currentTimeMillis() - C93407aQN.LIZIZ)), new OSZ("flag", "loading")));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
