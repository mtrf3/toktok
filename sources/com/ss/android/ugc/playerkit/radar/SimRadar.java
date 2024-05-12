package com.ss.android.ugc.playerkit.radar;

import X.AbstractC46689IUb;
import X.C35751E1j;
import X.C46843IZz;
import X.C46982IcE;
import X.C47047IdH;
import X.C79000UzU;
import X.ITQ;
import X.IVN;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SimRadar {
    public static final Map<String, C79000UzU> groups = new C35751E1j(10);
    public static final ITQ defaultGroup = new C46843IZz();

    public static IVN analyzer() {
        return IVN.LIZ;
    }

    public static synchronized ITQ traceGroup(String str) {
        ITQ itq;
        synchronized (SimRadar.class) {
            IRadarTransmitter LJII = C46982IcE.LJII();
            if (LJII != null) {
                LJII.tracer();
            }
            itq = defaultGroup;
        }
        return itq;
    }

    public static void keyScan(String str, String str2, Object... objArr) {
        IRadarTransmitter LJII;
        IRadarTransmitter LJII2;
        if (C47047IdH.LIZJ()) {
            String LIZLLL = C47047IdH.LIZLLL(str, str2, objArr);
            String LJIILLIIL = o.LJIILLIIL("K", "SIM-RADAR-");
            if (C47047IdH.LIZIZ() || (LJII = C46982IcE.LJII()) == null || !LJII.remoteTransmitEnabled() || (LJII2 = C46982IcE.LJII()) == null) {
                return;
            }
            LJII2.transmitI(LJIILLIIL, LIZLLL);
        }
    }

    public static void warnScan(String str, String str2, Object... objArr) {
        IRadarTransmitter LJII;
        IRadarTransmitter LJII2;
        if (C47047IdH.LIZJ()) {
            String LIZLLL = C47047IdH.LIZLLL(str, str2, objArr);
            String LJIILLIIL = o.LJIILLIIL("KE", "SIM-RADAR-");
            if (!C47047IdH.LIZIZ() && (LJII = C46982IcE.LJII()) != null && LJII.remoteTransmitEnabled() && (LJII2 = C46982IcE.LJII()) != null) {
                LJII2.transmitW(LJIILLIIL, LIZLLL);
            }
            ITQ traceGroup = traceGroup("SimError");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(":");
            LIZ.append(str2);
            traceGroup.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }

    public static void errorScan(String str, String str2, AbstractC46689IUb abstractC46689IUb, Object... objArr) {
        IRadarTransmitter LJII;
        IRadarTransmitter LJII2;
        if (C47047IdH.LIZJ()) {
            String LIZLLL = C47047IdH.LIZLLL(str, str2, objArr);
            String LJIILLIIL = o.LJIILLIIL("KE", "SIM-RADAR-");
            if (!C47047IdH.LIZIZ() && (LJII = C46982IcE.LJII()) != null && LJII.remoteTransmitEnabled() && (LJII2 = C46982IcE.LJII()) != null) {
                LJII2.transmitE(LJIILLIIL, LIZLLL, abstractC46689IUb);
            }
            ITQ traceGroup = traceGroup("SimError");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(":");
            LIZ.append(str2);
            traceGroup.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }
}
