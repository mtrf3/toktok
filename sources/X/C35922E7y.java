package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.HybridLogReportModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.E7y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35922E7y extends AbstractC65781Prl implements InterfaceC88471Ynr<String, java.util.Map<String, ? extends Object>, C76800UCe> {
    public static final C35922E7y LJLIL = new C35922E7y();

    public C35922E7y() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, java.util.Map<String, ? extends Object> map) {
        String eventName = str;
        java.util.Map<String, ? extends Object> params = map;
        o.LJIIIZ(eventName, "eventName");
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
                } else if (value instanceof Integer) {
                    String key3 = entry.getKey();
                    Object value4 = entry.getValue();
                    o.LJII(value4, "null cannot be cast to non-null type kotlin.Int");
                    c188727au.LIZLLL(((Integer) value4).intValue(), key3);
                } else if (value instanceof Double) {
                    String key4 = entry.getKey();
                    Object value5 = entry.getValue();
                    o.LJII(value5, "null cannot be cast to non-null type kotlin.Double");
                    c188727au.LIZJ(key4, ((Double) value5).doubleValue());
                } else if (value instanceof Float) {
                    String key5 = entry.getKey();
                    Object value6 = entry.getValue();
                    o.LJII(value6, "null cannot be cast to non-null type kotlin.Float");
                    c188727au.LIZIZ(((Float) value6).floatValue(), key5);
                }
            }
            FMX.LJIIL(eventName, c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
