package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.K9p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51253K9p {
    public static KAO LIZIZ;
    public static final C51253K9p LIZ = new C51253K9p();
    public static final Gson LIZJ = GsonHolder.LIZLLL().LIZ();
    public static int LIZLLL = 1;

    public final void LIZIZ() {
        KAO kao = LIZIZ;
        if (kao != null && kao.LJI != 0 && kao.LJII == 0) {
            kao.LJII = System.currentTimeMillis() - kao.LJI;
        }
    }

    public final void LIZJ() {
        Long l;
        KAO kao = LIZIZ;
        if (kao != null) {
            long currentTimeMillis = System.currentTimeMillis();
            kao.LJI = currentTimeMillis;
            kao.LJFF = currentTimeMillis - kao.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("triggerRecommendRequestCost:");
            KAO kao2 = LIZIZ;
            if (kao2 != null) {
                l = Long.valueOf(kao2.LJFF);
            } else {
                l = null;
            }
            LIZ2.append(l);
            X1D.LIZIZ(LIZ2);
        }
    }

    public static HashMap LIZ(Boolean bool) {
        KAO kao = LIZIZ;
        if (kao == null) {
            return new HashMap();
        }
        if (kao.LIZ == 0) {
            return new HashMap();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_use_cache", kao.LIZIZ);
        jSONObject.put("is_spark", 1);
        jSONObject.put("start_time", kao.LIZ);
        jSONObject.put("preload_cost", 0L);
        jSONObject.put("get_schema_cost", 0L);
        jSONObject.put("create_page_cost", kao.LJIIIZ);
        jSONObject.put("create_container_cost", kao.LJIIL);
        jSONObject.put("trigger_recommend_request_cost", kao.LJFF);
        jSONObject.put("page_resume_cost", kao.LJIIJ);
        jSONObject.put("recommend_request_cost", kao.LJII);
        jSONObject.put("history_update_time", kao.LJIILJJIL);
        jSONObject.put("recommend_update_time", kao.LJIILIIL);
        jSONObject.put("is_cold_start", kao.LIZLLL);
        jSONObject.put("enter_type", kao.LIZJ);
        jSONObject.put("is_suggest_cache", C51258K9u.LIZJ ? 1 : 0);
        if (o.LJ(bool, Boolean.TRUE)) {
            LIZIZ = null;
        }
        try {
            Object fromJson = GsonProtectorUtils.fromJson(LIZJ, jSONObject.toString(), (Class<Object>) HashMap.class);
            o.LJIIIIZZ(fromJson, "{\n            gson.fromJ…ap::class.java)\n        }");
            return (HashMap) fromJson;
        } catch (s unused) {
            return new HashMap();
        }
    }

    public final void LIZLLL(EnumC51264KAa enumC51264KAa) {
        KAO kao;
        Long l;
        if (LIZIZ == null) {
            KAO kao2 = new KAO();
            LIZIZ = kao2;
            kao2.LIZ = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("start time:");
            KAO kao3 = LIZIZ;
            if (kao3 != null) {
                l = Long.valueOf(kao3.LIZ);
            } else {
                l = null;
            }
            LIZ2.append(l);
            X1D.LIZIZ(LIZ2);
            KAO kao4 = LIZIZ;
            if (kao4 != null) {
                kao4.LIZLLL = LIZLLL;
            }
            LIZLLL = 0;
        }
        if (enumC51264KAa == null || (kao = LIZIZ) == null) {
            return;
        }
        kao.LIZJ = enumC51264KAa.getValue();
    }
}
