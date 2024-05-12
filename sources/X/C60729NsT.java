package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.LynxViewClient;
import org.json.JSONObject;

/* renamed from: X.NsT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60729NsT extends LynxViewClient {
    public final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public final /* synthetic */ SparkContext LIZIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        Long l;
        String str;
        long j;
        String str2;
        boolean z;
        Boolean bool;
        InterfaceC60730NsU interfaceC60730NsU = (InterfaceC60730NsU) this.LIZIZ.LIZIZ(InterfaceC60730NsU.class);
        if (interfaceC60730NsU != null) {
            interfaceC60730NsU.LIZ(this.LIZ);
        }
        this.LIZ.LLD = System.currentTimeMillis();
        C60728NsS c60728NsS = (C60728NsS) this.LIZIZ.LIZIZ(C60728NsS.class);
        if (c60728NsS != null && (l = c60728NsS.LIZJ) != null) {
            long longValue = l.longValue();
            long currentTimeMillis = System.currentTimeMillis() - longValue;
            SparkContext sparkContext = this.LIZIZ;
            Boolean bool2 = null;
            if (sparkContext != null) {
                str = sparkContext.containerId;
            } else {
                str = null;
            }
            C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_lynx_first_screen_duration");
            c79605VMb.LIZIZ = sparkContext.bid;
            c79605VMb.LIZ = this.LIZ.LLFF;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("res_memory", c60728NsS.LIZ);
            c79605VMb.LIZLLL = jSONObject;
            c79605VMb.LJ = Q7K.LIZLLL("duration", currentTimeMillis);
            FD5.LJ(str, c79605VMb.LIZ());
            Long l2 = c60728NsS.LJ;
            if (l2 != null) {
                j = l2.longValue() + longValue;
            } else {
                j = 0;
            }
            SparkContext sparkContext2 = this.LIZIZ;
            if (sparkContext2 != null) {
                str2 = sparkContext2.containerId;
            } else {
                str2 = null;
            }
            C79605VMb c79605VMb2 = new C79605VMb("hybrid_monitor_lynx_timeline");
            c79605VMb2.LIZIZ = sparkContext2.bid;
            c79605VMb2.LIZ = this.LIZ.LLFF;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("res_memory", c60728NsS.LIZ);
            InterfaceC60710NsA interfaceC60710NsA = this.LIZIZ.hybridParams;
            if (interfaceC60710NsA != null) {
                z = interfaceC60710NsA.LIZJ();
            } else {
                z = false;
            }
            jSONObject2.put("is_forest", z);
            jSONObject2.put("jsb_optimize", this.LIZIZ.jsbOptimize);
            jSONObject2.put("jsb_optimize_v2", this.LIZIZ.jsbOptimizeV2);
            SparkSchemaParam sparkSchemaParam = this.LIZ.LJLLJ;
            if (sparkSchemaParam != null) {
                bool = sparkSchemaParam.getEnableMemoryCache();
            } else {
                bool = null;
            }
            jSONObject2.put("enable_memory_cache", bool);
            SparkSchemaParam sparkSchemaParam2 = this.LIZ.LJLLJ;
            if (sparkSchemaParam2 != null) {
                bool2 = Boolean.valueOf(sparkSchemaParam2.getParallelFetchResource());
            }
            jSONObject2.put("parallel_fetch_resource", bool2);
            c79605VMb2.LIZLLL = jSONObject2;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("init_to_start_render", c60728NsS.LJ);
            jSONObject3.put("lynx_render", this.LIZ.LLD - j);
            jSONObject3.put("resource_load", c60728NsS.LJIIJJI);
            jSONObject3.put("render_template_main", c60728NsS.LJFF);
            jSONObject3.put("read_template", c60728NsS.LJI);
            jSONObject3.put("create_view_component", c60728NsS.LJII);
            c79605VMb2.LJ = jSONObject3;
            FD5.LJ(str2, c79605VMb2.LIZ());
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILJJIL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getHybridKitType());
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        InterfaceC60730NsU interfaceC60730NsU;
        if (this.LIZ.LLI && (interfaceC60730NsU = (InterfaceC60730NsU) this.LIZIZ.LIZIZ(InterfaceC60730NsU.class)) != null) {
            interfaceC60730NsU.LIZIZ(this.LIZ);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(java.util.Map<String, Object> map) {
        Object obj;
        super.onTimingSetup(map);
        if (map != null && (obj = map.get("setup_timing")) != null) {
            java.util.Map map2 = (java.util.Map) obj;
            if (map2.containsKey("draw_end")) {
                Object obj2 = map2.get("draw_end");
                if (obj2 != null) {
                    FD5.LJII("hybrid_log_report", C113554cx.LJJL(new OSZ(WM7.SCENE_SERVICE, "lynx_start_to_draw_end"), new OSZ("schema", this.LIZIZ.LJIILLIIL()), new OSZ("duration", Long.valueOf(((Long) obj2).longValue() - this.LIZ.LJZL))));
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
            }
        }
    }

    public C60729NsT(SparkContext sparkContext, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LIZIZ = sparkContext;
    }
}
