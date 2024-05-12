package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.E2b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35769E2b implements InterfaceC35770E2c {
    public static final C35769E2b LIZ = new C35769E2b();
    public static final C93833mF LIZIZ = C113554cx.LJJJLIIL();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    @Override // X.InterfaceC35770E2c
    public final java.util.Map<String, Object> LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        C93833mF c93833mF = LIZIZ;
        ?? r0 = (java.util.Map) LIZLLL.LJIIIIZZ("ecom_common_spark_setting", java.util.Map.class, c93833mF);
        if (r0 != 0) {
            c93833mF = r0;
        }
        o.LJIIIIZZ(c93833mF, "SettingsManager.getInsta…g::class.java) ?: DEFAULT");
        return c93833mF;
    }
}
