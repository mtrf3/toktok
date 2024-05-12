package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Fv1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40503Fv1 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends AppLogDualReportSettings.EventConfig>> {
    public static final C40503Fv1 LJLIL = new C40503Fv1();

    public C40503Fv1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends AppLogDualReportSettings.EventConfig> invoke() {
        try {
            Gson LIZ = GsonHolder.LIZLLL().LIZ();
            Object LIZLLL = LIZ.LIZLLL(LIZ.LJIJJLI((java.util.Map) SettingsManager.LIZLLL().LJIIIIZZ("app_log_dual_report_settings", java.util.Map.class, null)), new C40504Fv2().getType());
            o.LJIIIIZZ(LIZLLL, "{\n            val gson =…,\n            )\n        }");
            return (java.util.Map) LIZLLL;
        } catch (Throwable unused) {
            return C113554cx.LJJJLIIL();
        }
    }
}
