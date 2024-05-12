package Y;

import X.C09970aH;
import X.C64028PAy;
import X.C65905Ptl;
import X.C66059PwF;
import X.EGD;
import X.PHK;
import X.PN9;
import X.X1D;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.network.NetworkComponent;

/* loaded from: classes12.dex */
public class ARunnableS0S1000100_11 implements Runnable {
    public final int $t;
    public long j1;
    public String s0;

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

    public final void LIZ$0() {
        try {
            String str = this.s0;
            if (str.contains("!")) {
                str = str.split("!")[1];
            }
            String replaceAll = str.replaceAll("\\(.*\\)", "").replaceAll(" ", "");
            if (replaceAll.length() == 0 && C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("traceId is empty, bytes=");
                LIZ.append(this.j1);
                C64028PAy.LIZLLL("JniDelegate", X1D.LIZIZ(LIZ));
            }
            PHK phk = EGD.LIZ;
            long j = this.j1;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sk__");
            LIZ2.append(replaceAll);
            phk.LJIIIIZZ(j, replaceAll, X1D.LIZIZ(LIZ2), null, null, null);
        } catch (Throwable unused) {
        }
    }

    public static final void run$0(ARunnableS0S1000100_11 aRunnableS0S1000100_11) {
        boolean LIZ;
        try {
            aRunnableS0S1000100_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1000100_11 aRunnableS0S1000100_11) {
        boolean LIZ;
        try {
            PN9.LIZ(aRunnableS0S1000100_11.j1, aRunnableS0S1000100_11.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1000100_11 aRunnableS0S1000100_11) {
        boolean LIZ;
        NetworkConfig networkConfig;
        try {
            SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
            if (settings != null && (networkConfig = settings.networkConfig) != null && C65905Ptl.LIZ(networkConfig.costTimeSampleRate)) {
                ApmEvent LJ = ApmEvent.LJ(aRunnableS0S1000100_11.j1, aRunnableS0S1000100_11.s0);
                LJ.LJLIL = true;
                C66059PwF.LIZIZ(LJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1000100_11(long j, String str, int i) {
        this.$t = i;
        this.j1 = j;
        this.s0 = str;
    }
}
