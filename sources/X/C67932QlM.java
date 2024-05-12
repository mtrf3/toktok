package X;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.QlM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67932QlM {
    public static C67932QlM LIZIZ;
    public static final RootTelemetryConfiguration LIZJ = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration LIZ;

    public static synchronized C67932QlM LIZ() {
        C67932QlM c67932QlM;
        synchronized (C67932QlM.class) {
            if (LIZIZ == null) {
                LIZIZ = new C67932QlM();
            }
            c67932QlM = LIZIZ;
        }
        return c67932QlM;
    }
}
