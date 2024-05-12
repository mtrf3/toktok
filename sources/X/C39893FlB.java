package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.service.ISSPService;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import kotlin.jvm.internal.o;
import ql1.IDbS496S0100000_6;
import ujb.s;

/* renamed from: X.FlB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39893FlB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SparkSchemaParam sparkSchemaParam, SparkContext sparkContext, Context context) {
        AbstractC60673NrZ bootSSPLifecycle;
        o.LJIIJ(sparkContext, "sparkContext");
        o.LJIIJ(context, "context");
        if (sparkContext.defaultParams.get("ssp_config") == null && !s.LJJJLZIJ(sparkContext.url, "ssp_config", false)) {
            return;
        }
        if (sparkContext.hasBootSSP) {
            C37682Eqc.LIZIZ(sparkContext, "SspLifeCycle", "has boot ssp");
            return;
        }
        sparkContext.hasBootSSP = true;
        if (sparkSchemaParam == null) {
            SparkContext sparkContext2 = new SparkContext();
            sparkContext2.LJJIJLIJ(sparkContext.url);
            sparkSchemaParam = sparkContext2.LJIIZILJ(-1);
            if (sparkSchemaParam == null) {
                return;
            }
        }
        if (sparkSchemaParam.getSspConfig() <= 0) {
            return;
        }
        C60792NtU.LIZ.getClass();
        String LIZIZ = C60792NtU.LIZIZ(sparkContext, sparkSchemaParam);
        if (LIZIZ != null) {
            C60828Nu4 c60828Nu4 = C37724ErI.LIZIZ;
            String str = sparkContext.url;
            c60828Nu4.getClass();
            if (C60828Nu4.LIZLLL(context, str, LIZIZ)) {
                return;
            }
        }
        C61483OBb.LIZJ.getClass();
        ISSPService iSSPService = (ISSPService) C61484OBc.LIZIZ().LIZIZ(ISSPService.class, sparkContext.bidFrom);
        if (iSSPService != null && (bootSSPLifecycle = iSSPService.bootSSPLifecycle(context, sparkContext, sparkSchemaParam)) != null) {
            sparkContext.LJJI(new IDbS496S0100000_6(bootSSPLifecycle, 0));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("boot success, url:");
            LIZ2.append(sparkContext.url);
            C37682Eqc.LIZIZ(sparkContext, "SspLifeCycle", X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("boot failed, url:");
        LIZ3.append(sparkContext.url);
        C37682Eqc.LIZIZ(sparkContext, "SspLifeCycle", X1D.LIZIZ(LIZ3));
    }
}
