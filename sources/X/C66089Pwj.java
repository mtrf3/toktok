package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pwj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66089Pwj implements InterfaceC66094Pwo {
    public static boolean LIZ;
    public static final C66089Pwj LIZIZ = new C66089Pwj();

    @Override // X.InterfaceC66094Pwo
    public final String type() {
        return "rule_engine";
    }

    public static List LIZIZ(String engineType) {
        o.LJIIIZ(engineType, "engineType");
        int hashCode = engineType.hashCode();
        if (hashCode != -802829083) {
            if (hashCode == -267421691 && engineType.equals("decision_engine")) {
                return C47261Igj.LJJIJ(C66114Px8.LIZ);
            }
        } else if (engineType.equals("rule_engine")) {
            return C47261Igj.LJJIJ(C66112Px6.LIZIZ);
        }
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        o.LJIIIZ(newSettings, "newSettings");
        long currentTimeMillis = System.currentTimeMillis();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        Iterator it = LIZIZ(heliosEnvImpl.LJIIJ.engineType).iterator();
        while (it.hasNext()) {
            ((InterfaceC66032Pvo) it.next()).onNewSettings(newSettings);
            LIZ = true;
        }
        C65929Pu9.LIZ(currentTimeMillis, "EngineManager.onNewSettings", true);
    }

    @Override // X.InterfaceC66094Pwo
    public final boolean LIZ(C66120PxE event, boolean z) {
        String str;
        String str2;
        o.LJIIIZ(event, "event");
        if (!LIZ) {
            return false;
        }
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        boolean z2 = false;
        for (InterfaceC66094Pwo interfaceC66094Pwo : LIZIZ(heliosEnvImpl.LJIIJ.engineType)) {
            long nanoTime = System.nanoTime();
            if (interfaceC66094Pwo.LIZ(event, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            if (o.LJ(interfaceC66094Pwo.type(), "decision_engine")) {
                str = "decision";
            } else {
                str = "rule";
            }
            LIZ2.append(str);
            if (z) {
                str2 = "F";
            } else {
                str2 = "G";
            }
            C65929Pu9.LIZIZ(JBR.LJFF(LIZ2, str2, "EngineExecute", LIZ2), nanoTime, null);
        }
        return z2;
    }
}
