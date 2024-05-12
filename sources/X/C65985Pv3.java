package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.signal.Signal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pv3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65985Pv3 {
    public static final boolean[][] LIZ;
    public static final java.util.Map<EnumC65997PvF, InterfaceC65981Puz> LIZIZ;

    static {
        boolean[][] zArr = new boolean[2];
        int i = 0;
        do {
            zArr[i] = new boolean[8];
            i++;
        } while (i < 2);
        LIZ = zArr;
        LIZIZ = new LinkedHashMap();
    }

    public static void LIZ(EnumC65997PvF enumC65997PvF, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int hashCode = str.hashCode();
            boolean[][] zArr = LIZ;
            switch (hashCode) {
                case -1349088399:
                    if (!str.equals("custom")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][7] = true;
                        break;
                    }
                case 96801:
                    if (!str.equals("app")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][2] = true;
                        break;
                    }
                case 114381:
                    if (!str.equals("sys")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][4] = true;
                        break;
                    }
                case 2997059:
                    if (!str.equals("alog")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][5] = true;
                        break;
                    }
                case 3030378:
                    if (!str.equals("bpea")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][6] = true;
                        break;
                    }
                case 12807694:
                    if (!str.equals("sysMethod")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][0] = true;
                        break;
                    }
                case 98705061:
                    if (!str.equals("guard")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][3] = true;
                        break;
                    }
                case 202190770:
                    if (!str.equals("customMethod")) {
                        break;
                    } else {
                        zArr[enumC65997PvF.ordinal()][1] = true;
                        break;
                    }
            }
        }
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static void LIZIZ(EnumC66029Pvl type, EnumC65997PvF enumC65997PvF, Signal signal) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(enumC65997PvF, OHQ.LIZ);
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        if (!heliosEnvImpl.LJIIJ.signalConfig.enable || !LIZ[enumC65997PvF.ordinal()][type.ordinal()]) {
            return;
        }
        if (signal.getTime() == 0) {
            signal.setTime(System.currentTimeMillis());
        }
        InterfaceC65981Puz interfaceC65981Puz = (InterfaceC65981Puz) ((LinkedHashMap) LIZIZ).get(enumC65997PvF);
        if (interfaceC65981Puz == null) {
            return;
        }
        interfaceC65981Puz.LIZ(signal);
    }
}
