package X;

import java.util.Map;

/* renamed from: X.2hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65542hi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, java.util.Map map) {
        C188727au c188727au = new C188727au();
        for (Map.Entry entry : map.entrySet()) {
            c188727au.LJI((String) entry.getKey(), (String) entry.getValue());
        }
        FMX.LJIIL(str, c188727au.LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FundSafetyMonitor error: ");
        LIZ2.append(str);
        LIZ2.append(": ");
        LIZ2.append(map);
        H78.LJI(X1D.LIZIZ(LIZ2));
    }
}
