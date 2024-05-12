package X;

import com.ss.android.ugc.aweme.commercialize.measurement.exposure.ExposureMeasurementConfig;

/* renamed from: X.2Tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58992Tf {
    public static final C58992Tf LIZ = new C58992Tf();
    public static final ExposureMeasurementConfig LIZIZ = new ExposureMeasurementConfig(false, null, 3, null);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C59002Tg.LJLIL);

    public static final boolean LIZ(String str) {
        LIZ.getClass();
        C62822Ol8 c62822Ol8 = LIZJ;
        if (((ExposureMeasurementConfig) c62822Ol8.getValue()).exposureAll || ((ExposureMeasurementConfig) c62822Ol8.getValue()).exposureEventTypes.contains(str)) {
            return true;
        }
        return false;
    }
}
