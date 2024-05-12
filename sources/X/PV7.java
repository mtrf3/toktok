package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.net.model.UnexpectedConfig;
import com.ss.android.ugc.aweme.net.model.UnexpectedNetworkMonitorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PV7 implements Runnable {
    public static final PV7 LJLIL = new PV7();

    public static void LIZ() {
        UnexpectedConfig[] unexpectedConfigArr;
        UnexpectedConfig[] unexpectedConfigArr2;
        System.currentTimeMillis();
        try {
            SettingsManager.LIZLLL().getClass();
            String LJI = SettingsManager.LJI("unexpected_network_monitor_config", "");
            o.LJIIIIZZ(LJI, "getInstance()\n          …nfigSettings::class.java)");
            if (!ujb.o.LJJJJJL(LJI)) {
                UnexpectedNetworkMonitorConfig unexpectedNetworkMonitorConfig = (UnexpectedNetworkMonitorConfig) C75792yF.LIZ(LJI, UnexpectedNetworkMonitorConfig.class);
                if (unexpectedNetworkMonitorConfig == null) {
                    unexpectedConfigArr = null;
                } else {
                    unexpectedConfigArr = unexpectedNetworkMonitorConfig.getUrls();
                }
                List LIZIZ = PYR.LIZIZ(unexpectedConfigArr);
                if (unexpectedNetworkMonitorConfig != null) {
                    unexpectedConfigArr2 = unexpectedNetworkMonitorConfig.getResponses();
                } else {
                    unexpectedConfigArr2 = null;
                }
                List LIZIZ2 = PYR.LIZIZ(unexpectedConfigArr2);
                synchronized (PY7.LIZIZ) {
                    CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = PY7.LJ;
                    ArrayList arrayList = new ArrayList();
                    Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC58286MuA next = it.next();
                        if (next instanceof PYE) {
                            arrayList.add(next);
                        }
                    }
                    PY7.LJ.removeAll(arrayList);
                    if ((!LIZIZ.isEmpty()) || (!LIZIZ2.isEmpty())) {
                        PYR.LIZ(new PYE(LIZIZ, LIZIZ2));
                    }
                }
            }
        } catch (Exception e) {
            PYR.LJFF(null, "addUnexpectedNetworkMonitor", e);
        }
        System.currentTimeMillis();
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
