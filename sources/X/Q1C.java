package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ruler.base.models.RuleModel;
import com.google.gson.Gson;
import com.google.gson.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q1C extends AbstractC65781Prl implements InterfaceC88472Yns<C66322Q1e, C76800UCe> {
    public final /* synthetic */ java.util.Map LJLIL;
    public final /* synthetic */ Q11 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1C(long j, Q11 q11, String str, java.util.Map map) {
        super(1);
        this.LJLIL = map;
        this.LJLILLLLZI = q11;
        this.LJLJI = str;
        this.LJLJJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C66322Q1e c66322Q1e) {
        JSONObject jSONObject;
        boolean z;
        boolean z2;
        String str;
        String str2;
        C39522FfC c39522FfC;
        j jVar;
        j LJJIJ;
        C39522FfC c39522FfC2;
        j jVar2;
        j LJJIJ2;
        C66322Q1e receiver = c66322Q1e;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZ = "rule_engine_execute_result";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Gson gson = new Gson();
        for (Map.Entry entry : this.LJLIL.entrySet()) {
            if ((entry.getValue() instanceof Number) || (entry.getValue() instanceof String)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("rule_engine_");
                LIZ.append((String) entry.getKey());
                linkedHashMap.put(X1D.LIZIZ(LIZ), entry.getValue());
            } else if (entry.getValue() instanceof Boolean) {
                if (o.LJ(entry.getValue(), Boolean.TRUE)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("rule_engine_");
                    LIZ2.append((String) entry.getKey());
                    linkedHashMap.put(X1D.LIZIZ(LIZ2), 1);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("rule_engine_");
                    LIZ3.append((String) entry.getKey());
                    linkedHashMap.put(X1D.LIZIZ(LIZ3), 0);
                }
            }
        }
        receiver.LIZIZ = new JSONObject();
        String str3 = null;
        if (this.LJLILLLLZI.LIZ == 0 && (!r1.LJI.isEmpty())) {
            ArrayList<C39522FfC> arrayList = this.LJLILLLLZI.LJI;
            if (arrayList != null && (c39522FfC2 = (C39522FfC) ListProtector.get(arrayList, 0)) != null && (jVar2 = c39522FfC2.LJ) != null && (LJJIJ2 = jVar2.LJIIZILJ().LJJIJ("action")) != null) {
                str2 = LJJIJ2.LJJIFFI();
            } else {
                str2 = null;
            }
            JSONObject jSONObject2 = receiver.LIZIZ;
            if (jSONObject2 != null) {
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject2.put("action", str2);
            }
            ArrayList<C39522FfC> arrayList2 = this.LJLILLLLZI.LJI;
            if (arrayList2 != null && (c39522FfC = (C39522FfC) ListProtector.get(arrayList2, 0)) != null && (jVar = c39522FfC.LJ) != null && (LJJIJ = jVar.LJIIZILJ().LJJIJ("reason")) != null) {
                str3 = LJJIJ.LJJIFFI();
            }
            JSONObject jSONObject3 = receiver.LIZIZ;
            if (jSONObject3 != null) {
                jSONObject3.put("reason", str3);
            }
        } else {
            JSONObject jSONObject4 = receiver.LIZIZ;
            if (jSONObject4 != null) {
                jSONObject4.put("engine_error_code", this.LJLILLLLZI.LIZ);
            }
            JSONObject jSONObject5 = receiver.LIZIZ;
            if (jSONObject5 != null) {
                jSONObject5.put("engine_error_msg", this.LJLILLLLZI.LIZIZ);
            }
        }
        JSONObject jSONObject6 = receiver.LIZIZ;
        if (jSONObject6 != null) {
            String str4 = this.LJLJI;
            if (str4 == null) {
                str4 = "unkown";
            }
            jSONObject6.put("rule_engine_source", str4);
        }
        JSONObject jSONObject7 = receiver.LIZIZ;
        if (jSONObject7 != null) {
            Q11 q11 = this.LJLILLLLZI;
            q11.getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator<C39522FfC> it = q11.LJI.iterator();
            while (it.hasNext()) {
                C39522FfC next = it.next();
                JSONObject jSONObject8 = new JSONObject();
                RuleModel ruleModel = next.LIZJ;
                if (ruleModel == null || ((str = ruleModel.key) == null && (str = ruleModel.title) == null)) {
                    str = "unknown";
                }
                jSONObject8.put(str, next.LJ);
                jSONArray.put(jSONObject8);
            }
            String jSONArray2 = jSONArray.toString();
            o.LJFF(jSONArray2, "jsonArray.toString()");
            jSONObject7.put("result", jSONArray2);
        }
        JSONObject jSONObject9 = receiver.LIZIZ;
        if (jSONObject9 != null) {
            Q19 q19 = Q1A.LIZIZ;
            if (q19 != null) {
                z2 = q19.LJIIJJI;
            } else {
                z2 = false;
            }
            jSONObject9.put("enable_strategy_select_cache", z2);
        }
        JSONObject jSONObject10 = receiver.LIZIZ;
        if (jSONObject10 != null) {
            Q19 q192 = Q1A.LIZIZ;
            if (q192 != null) {
                z = q192.LJIILIIL;
            } else {
                z = false;
            }
            jSONObject10.put("enable_simplify_set_select", z);
        }
        JSONObject jSONObject11 = receiver.LIZIZ;
        if (jSONObject11 != null) {
            jSONObject11.put("strategy_select_from_cache", this.LJLILLLLZI.LIZLLL.LJLILLLLZI);
        }
        JSONObject jSONObject12 = receiver.LIZIZ;
        if (jSONObject12 != null) {
            jSONObject12.put("enable_fff", Q1A.LJIILIIL);
        }
        String str5 = Q1A.LJIIJ;
        if (str5 != null && str5.length() != 0 && (jSONObject = receiver.LIZIZ) != null) {
            jSONObject.put("ab_tag", Q1A.LJIIJ);
        }
        JSONObject jSONObject13 = new JSONObject();
        receiver.LIZLLL = jSONObject13;
        jSONObject13.put("cost", this.LJLJJI);
        JSONObject jSONObject14 = receiver.LIZLLL;
        if (jSONObject14 != null) {
            jSONObject14.put("net_cost", this.LJLJJI - this.LJLILLLLZI.LIZLLL.LJLIL);
        }
        JSONObject jSONObject15 = receiver.LIZLLL;
        if (jSONObject15 != null) {
            jSONObject15.put("scene_select_cost", this.LJLILLLLZI.LIZLLL.LJLJI / 1000);
        }
        JSONObject jSONObject16 = receiver.LIZLLL;
        if (jSONObject16 != null) {
            jSONObject16.put("strategy_select_cost", this.LJLILLLLZI.LIZLLL.LJLJJI / 1000);
        }
        JSONObject jSONObject17 = receiver.LIZLLL;
        if (jSONObject17 != null) {
            jSONObject17.put("rule_build_cost", this.LJLILLLLZI.LIZLLL.LJLJJL / 1000);
        }
        JSONObject jSONObject18 = receiver.LIZLLL;
        if (jSONObject18 != null) {
            jSONObject18.put("rule_exec_cost", this.LJLILLLLZI.LIZLLL.LJLJJLL / 1000);
        }
        JSONObject jSONObject19 = receiver.LIZLLL;
        if (jSONObject19 != null) {
            jSONObject19.put("key", GsonProtectorUtils.toJson(gson, this.LJLILLLLZI.LIZJ));
        }
        receiver.LIZJ = new JSONObject(linkedHashMap);
        return C76800UCe.LIZ;
    }
}
