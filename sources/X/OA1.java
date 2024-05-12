package X;

import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OA1 extends LynxViewClient {
    public final /* synthetic */ OA0 LIZ;
    public final /* synthetic */ SparkContext LIZIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        OA0 oa0 = this.LIZ;
        OA2 oa2 = oa0.LJLL;
        if (oa2 != null) {
            String str = oa0.LJLJLJ;
            boolean z = oa0.LJLILLLLZI;
            if (oa2.LIZIZ == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis() - oa2.LIZ;
            long currentTimeMillis2 = System.currentTimeMillis() - oa2.LIZIZ;
            C05630Jz.LJI(jSONObject, "event_name", "first_screen_show");
            C05630Jz.LJFF(jSONObject2, "event_duration", currentTimeMillis2);
            C05630Jz.LJFF(jSONObject2, "event_duration_all", currentTimeMillis);
            C05630Jz.LJFF(jSONObject3, "event_duration", currentTimeMillis2);
            C05630Jz.LJFF(jSONObject3, "event_duration_all", currentTimeMillis);
            oa2.LIZ(jSONObject3);
            C05630Jz.LIZ(z ? 1 : 0, "is_precreate", jSONObject3);
            if (!TextUtils.isEmpty(str)) {
                C05630Jz.LJI(jSONObject3, "lynx_url", str);
            }
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_lynx_show", jSONObject, jSONObject2, jSONObject4);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        C37942Euo c37942Euo;
        SparkContext sparkContext = this.LIZIZ;
        if (sparkContext != null && (c37942Euo = (C37942Euo) sparkContext.LIZIZ(C37942Euo.class)) != null) {
            Iterator it = new ArrayList().iterator();
            while (it.hasNext()) {
                c37942Euo.LJIILJJIL((C38236EzY) it.next());
            }
        }
    }

    public OA1(OA0 oa0, SparkContext sparkContext) {
        this.LIZ = oa0;
        this.LIZIZ = sparkContext;
    }
}
