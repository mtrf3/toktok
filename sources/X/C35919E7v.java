package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.HybridLogReportModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.E7v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35919E7v implements InterfaceC35921E7x {
    public static final C35919E7v LIZ = new C35919E7v();

    @Override // X.InterfaceC35921E7x
    public final void LIZ(String str, java.util.Map<String, ? extends Object> params) {
        o.LJIIIZ(params, "params");
        C35920E7w.LIZ.getClass();
        HybridLogReportModel hybridLogReportModel = (HybridLogReportModel) SettingsManager.LIZLLL().LJIIIIZZ("Hybrid_log_report", HybridLogReportModel.class, C35920E7w.LIZIZ);
        if (hybridLogReportModel != null && hybridLogReportModel.enable) {
            C188727au c188727au = new C188727au();
            for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String key = entry.getKey();
                    Object value2 = entry.getValue();
                    o.LJII(value2, "null cannot be cast to non-null type kotlin.String");
                    c188727au.LJI(key, (String) value2);
                } else if (value instanceof Long) {
                    String key2 = entry.getKey();
                    Object value3 = entry.getValue();
                    o.LJII(value3, "null cannot be cast to non-null type kotlin.Long");
                    c188727au.LJ(((Long) value3).longValue(), key2);
                }
            }
            FMX.LJIIL(str, c188727au.LIZ);
        }
    }
}
