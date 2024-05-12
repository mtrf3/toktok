package X;

import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import kotlin.jvm.internal.o;

/* renamed from: X.IeB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC47103IeB implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C47102IeA LJLJJI;

    public final void LIZ() {
        EnginePreloader enginePreloader = this.LJLJJI.LIZ;
        long j = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        enginePreloader.getClass();
        if (j > 0 && j2 > 0) {
            enginePreloader.LJIJJLI.getExperiment().enableRealTimeSpeedMonitor();
        }
        int i = this.LJLIL;
        if (i == 2) {
            EnginePreloader enginePreloader2 = this.LJLJJI.LIZ;
            long j3 = this.LJLILLLLZI;
            long j4 = this.LJLJI;
            enginePreloader2.getClass();
            if (j3 > 0) {
                Object value = IZ8.d0.getValue();
                o.LJIIIIZZ(value, "<get-openInternetSpeedFilterSwitch>(...)");
                if (((Boolean) value).booleanValue()) {
                    Object value2 = IZ8.e0.getValue();
                    o.LJIIIIZZ(value2, "<get-internetSpeedFilterMinValue>(...)");
                    if (j3 < ((Number) value2).longValue() || j3 > 20971520) {
                        return;
                    }
                }
                if (j4 <= 0) {
                    return;
                }
                if (enginePreloader2.LJIJJLI.getExperiment().VideoNetworkSpeedAlgorithmExperiment() == 2) {
                    enginePreloader2.LJIJJLI.getSpeedManager().LIZ();
                    return;
                }
                double d = j3;
                enginePreloader2.LJIJJLI.getSpeedManager().monitorVideoSpeed((8.0d * d) / (j4 / 1000.0d), d, j4);
                Integer LIZ = enginePreloader2.LJIJJLI.getMLServiceSpeedModel().LIZ();
                if (LIZ == null) {
                    return;
                }
                if (enginePreloader2.LJII == null) {
                    enginePreloader2.LJII = new C47107IeF(enginePreloader2.LJIJJLI.getSpeedManager(), LIZ.intValue());
                }
                enginePreloader2.LJII.LIZ();
                return;
            }
            return;
        }
        if (i != 20) {
            return;
        }
        EnginePreloader enginePreloader3 = this.LJLJJI.LIZ;
        long j5 = this.LJLILLLLZI;
        long j6 = this.LJLJI;
        enginePreloader3.getClass();
        if (j5 <= 0 || j6 <= 0) {
            return;
        }
        if (enginePreloader3.LJFF == null) {
            enginePreloader3.LJFF = new C47111IeJ();
        }
        enginePreloader3.LJFF.getClass();
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

    public RunnableC47103IeB(C47102IeA c47102IeA, int i, long j, long j2) {
        this.LJLJJI = c47102IeA;
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }
}
