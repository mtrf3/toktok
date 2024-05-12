package X;

/* renamed from: X.QDw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66652QDw {
    public static volatile C66652QDw LIZIZ;
    public boolean LIZ;

    public static C66652QDw LIZ() {
        if (LIZIZ == null) {
            synchronized (C66652QDw.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66652QDw();
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZIZ(int i) {
        C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
        LIZIZ2.getClass();
        if (QE0.LIZ().loggerDebug()) {
            QE0 LIZ = QE0.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onEffectiveConnectionTypeChanged type = ");
            LIZ2.append(i);
            LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
        }
        try {
            Object obj = LIZIZ2.LIZ;
            if (obj != null) {
                new C36598EXy(obj).LIZJ("onEffectiveConnectionTypeChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZJ(int i) {
        C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
        LIZIZ2.getClass();
        if (QE0.LIZ().loggerDebug()) {
            QE0 LIZ = QE0.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkQualityLevelChanged, nql: ");
            LIZ2.append(i);
            LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
        }
        try {
            Object obj = LIZIZ2.LIZ;
            if (obj != null) {
                new C36598EXy(obj).LIZJ("onNetworkQualityLevelChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZLLL(int i, int i2, int i3) {
        C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
        LIZIZ2.getClass();
        if (QE0.LIZ().loggerDebug()) {
            QE0 LIZ = QE0.LIZ();
            StringBuilder LIZJ = C06460Ne.LIZJ("onNetworkQualityRttAndThroughputNotified, effectiveHrttMs: ", i, ", effectiveTrttMs: ", i2, ", effectiveRxThroughputKbps: ");
            LIZJ.append(i3);
            LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZJ));
        }
        try {
            Object obj = LIZIZ2.LIZ;
            if (obj != null) {
                C36598EXy c36598EXy = new C36598EXy(obj);
                Class<?> cls = Integer.TYPE;
                c36598EXy.LIZJ("onNetworkQualityRttAndThroughputNotified", new Class[]{cls, cls, cls}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJFF(int i, int i2, int i3) {
        C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
        LIZIZ2.getClass();
        if (QE0.LIZ().loggerDebug()) {
            QE0 LIZ = QE0.LIZ();
            StringBuilder LIZJ = C06460Ne.LIZJ("onRTTOrThroughputEstimatesComputed httpRtt = ", i, ", transportRttMs = ", i2, ",downstreamThroughputKbps = ");
            LIZJ.append(i3);
            LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZJ));
        }
        try {
            Object obj = LIZIZ2.LIZ;
            if (obj != null) {
                C36598EXy c36598EXy = new C36598EXy(obj);
                Class<?> cls = Integer.TYPE;
                c36598EXy.LIZJ("onRTTOrThroughputEstimatesComputed", new Class[]{cls, cls, cls}, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Throwable unused) {
        }
    }

    public static void LJ(int i, double d, double d2, double d3, double d4) {
        C66653QDx LIZIZ2 = C66653QDx.LIZIZ();
        LIZIZ2.getClass();
        if (QE0.LIZ().loggerDebug()) {
            QE0 LIZ = QE0.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPacketLossComputed protocol = ");
            LIZ2.append(i);
            LIZ2.append(", upstreamLossRate = ");
            LIZ2.append(d);
            LIZ2.append(", upstreamLossRateVariance = ");
            LIZ2.append(d2);
            LIZ2.append(", downstreamLossRate = ");
            LIZ2.append(d3);
            LIZ2.append(", downstreamLossRateVariance = ");
            LIZ2.append(d4);
            LIZ.loggerD("CronetAppProviderManager", X1D.LIZIZ(LIZ2));
        }
        try {
            Object obj = LIZIZ2.LIZ;
            if (obj != null) {
                C36598EXy c36598EXy = new C36598EXy(obj);
                Class<?> cls = Double.TYPE;
                c36598EXy.LIZJ("onPacketLossComputed", new Class[]{Integer.TYPE, cls, cls, cls, cls}, Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4));
            }
        } catch (Throwable unused) {
        }
    }
}
