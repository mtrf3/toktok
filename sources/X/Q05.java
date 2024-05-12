package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.cep_engine.CepEngineManager;
import com.bytedance.pns.pns_ttmachine_adapter.TTMAdapter;
import com.bytedance.pns.pns_ttmachine_adapter.TTMStateExecutionTimeStatistics;
import com.bytedance.pns.pns_ttmachine_adapter.TTMStatePreprocessTimeStatistics;
import com.bytedance.pns.pns_ttmachine_adapter.TTMachineExecuteResult;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.ruler.adapter.api.RuleEngineConfig;
import com.bytedance.ruler.base.models.RuleModel;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.tiktok.ttm.TTMParamData;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q05 implements IRuleEngineService {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static volatile boolean LIZIZ;
    public static final C212608Wa LIZJ;
    public static final Q05 LIZLLL;

    static {
        TBV tbv = new TBV(Q05.class, "isKidsMode", "isKidsMode()Z", 0);
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbv};
        LIZLLL = new Q05();
        LIZJ = new C212608Wa();
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Object LIZJ(String valueName) {
        o.LJIIIZ(valueName, "valueName");
        return null;
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZ(PQ5 pq5) {
        TTMAdapter.addFunction(pq5.LIZ, new Q06(pq5));
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final void LIZIZ(FTR<?> ftr) {
        TTMAdapter.addFunction(ftr.name(), new Q07(ftr));
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final List LJFF(List list) {
        if (((Number) C34211Dbj.LIZ.getValue()).intValue() == 0) {
            return C47261Igj.LJJIJIL("unable_ttm");
        }
        CepEngineManager.INSTANCE.init();
        long nanoTime = System.nanoTime();
        ArrayList arrayList = (ArrayList) list;
        TTMParamData[] tTMParamDataArr = new TTMParamData[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tTMParamDataArr[i] = new TTMParamData((java.util.Map<String, Object>) ListProtector.get(list, i));
        }
        ArrayList arrayList2 = new ArrayList();
        TTMachineExecuteResult hitRules = TTMAdapter.attribution("attribution", tTMParamDataArr);
        o.LJIIIIZZ(hitRules, "hitRules");
        int length = hitRules.getPolicyConfig().length;
        for (int i2 = 0; i2 < length; i2++) {
            j LJJIJ = ((m) GsonProtectorUtils.fromJson(new Gson(), hitRules.getPolicyConfig()[i2], m.class)).LJJIJ("title");
            o.LJIIIIZZ(LJJIJ, "ruleModelJsonObject.get(\"title\")");
            String LJJIFFI = LJJIJ.LJJIFFI();
            o.LJIIIIZZ(LJJIFFI, "ruleModelJsonObject.get(\"title\").asString");
            arrayList2.add(LJJIFFI);
        }
        C64396PPc.LIZ("attribution", "attribution", "attribution_total_cost", ((float) (System.nanoTime() - nanoTime)) / 1000000);
        return arrayList2;
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final List LJIIIZ(int i) {
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Q11 LIZLLL(java.util.Map<String, ?> map, java.util.Map<String, ? extends PQ5> functions) {
        o.LJIIIZ(functions, "functions");
        Object obj = ((LinkedHashMap) map).get("source");
        if (obj != null) {
            return LJIIJJI((String) obj, map, functions);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService
    public final Q11 LJIIJJI(String str, java.util.Map map, java.util.Map functions) {
        String str2;
        int i;
        o.LJIIIZ(functions, "functions");
        if (!LIZIZ) {
            return new Q11(0, null, null, null, null, 255);
        }
        long nanoTime = System.nanoTime();
        TTMachineExecuteResult hitRules = TTMAdapter.validate3(str, new TTMParamData((java.util.Map<String, Object>) map));
        long nanoTime2 = System.nanoTime();
        ArrayList arrayList = new ArrayList();
        o.LJIIIIZZ(hitRules, "hitRules");
        int length = hitRules.getPolicyConfig().length;
        for (int i2 = 0; i2 < length; i2++) {
            m mVar = (m) GsonProtectorUtils.fromJson(new Gson(), hitRules.getPolicyConfig()[i2], m.class);
            j LJJIJ = mVar.LJJIJ("title");
            o.LJIIIIZZ(LJJIJ, "ruleModelJsonObject.get(\"title\")");
            String LJJIFFI = LJJIJ.LJJIFFI();
            j LJJIJ2 = mVar.LJJIJ("conf");
            j LJJIJ3 = mVar.LJJIJ("key");
            o.LJIIIIZZ(LJJIJ3, "ruleModelJsonObject.get(\"key\")");
            RuleModel ruleModel = new RuleModel(LJJIFFI, LJJIJ2, "", LJJIJ3.LJJIFFI());
            arrayList.add(new C39522FfC(0, null, ruleModel, null, ruleModel.conf, hitRules.getResults()[i2], 10));
        }
        long nanoTime3 = System.nanoTime();
        TTMStateExecutionTimeStatistics timeStatistics = hitRules.getExecutionTimeStatistics();
        if (((Boolean) LIZJ.LIZ(this, LIZ[0])).booleanValue()) {
            str2 = "kids_both";
        } else {
            str2 = "both";
        }
        float f = 1000000;
        o.LJIIIIZZ(timeStatistics, "timeStatistics");
        float f2 = 1000;
        C64396PPc.LIZIZ(str2, str, hitRules.getSignature(), C113554cx.LJJL(new OSZ("ttm_total_cost", Float.valueOf(((float) (nanoTime3 - nanoTime)) / f)), new OSZ("ttm_jni_cost", Float.valueOf(((float) (nanoTime2 - nanoTime)) / f)), new OSZ("ttm_result_adapter_cost", Float.valueOf(((float) (nanoTime3 - nanoTime2)) / f)), new OSZ("ttm_c_runEngineTotalTime", Float.valueOf(timeStatistics.getRunEngineTotalTime() / f2)), new OSZ("ttm_c_callBdiTotalTime", Float.valueOf(timeStatistics.getCallBdiTotalTime() / f2)), new OSZ("ttm_c_callUsrBdiTotalTime", Float.valueOf(timeStatistics.getCallUsrBdiTotalTime() / f2)), new OSZ("ttm_c_callJniMethodTime", Float.valueOf(timeStatistics.getCallJniMethodTime() / f2))));
        String[] strategyName = hitRules.getStrategyName();
        o.LJIIIIZZ(strategyName, "hitRules.strategyName");
        if (strategyName.length == 0) {
            i = 309;
        } else {
            i = 0;
        }
        String[] strategyName2 = hitRules.getStrategyName();
        o.LJIIIIZZ(strategyName2, "hitRules.strategyName");
        return new Q11(i, null, C61898ORa.LJIILL(strategyName2), null, arrayList, 118);
    }

    public final void LJIILIIL(C65935PuF c65935PuF, Q08 proxy, InterfaceC65784Pro interfaceC65784Pro) {
        C65983Pv1 c65983Pv1;
        boolean z;
        String str;
        o.LJIIIZ(proxy, "proxy");
        Object obj = proxy.LJLIL;
        o.LJI(obj);
        for (Map.Entry<String, InterfaceC65784Pro<Boolean>> entry : ((C66226Pyw) obj).LJLJLJ.entrySet()) {
            LIZLLL.LIZIZ(new C38940FQa(entry.getKey(), Boolean.TYPE, new AqS151S0100000_1(entry, 798)));
        }
        if (interfaceC65784Pro != null) {
            c65983Pv1 = (C65983Pv1) interfaceC65784Pro.invoke();
        } else {
            c65983Pv1 = null;
        }
        o.LJI(c65983Pv1);
        RuleEngineConfig ruleEngineConfig = c65983Pv1.LJLIL;
        o.LJI(ruleEngineConfig);
        if (!ruleEngineConfig.enableRuleEngine) {
            return;
        }
        Object obj2 = proxy.LJLIL;
        o.LJI(obj2);
        InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = ((C66226Pyw) obj2).LJLJLJ.get("is_kids_mode");
        if (interfaceC65784Pro2 != null && interfaceC65784Pro2.invoke().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        C212608Wa c212608Wa = LIZJ;
        InterfaceC74236TBo[] interfaceC74236TBoArr = LIZ;
        c212608Wa.LIZIZ(interfaceC74236TBoArr[0], this, Boolean.valueOf(z));
        if (((Boolean) c212608Wa.LIZ(this, interfaceC74236TBoArr[0])).booleanValue()) {
            str = "kids_ruler_config_ttm.json";
        } else {
            str = "ruler_config_ttm.json";
        }
        InputStream open = c65935PuF.LJLIL.getAssets().open(str);
        o.LJIIIIZZ(open, "assetManager.open(configFileName)");
        TTMStatePreprocessTimeStatistics timeStatistics = TTMAdapter.init(C77321UWf.LJIILJJIL(new BufferedReader(new InputStreamReader(open))));
        CepEngineManager.INSTANCE.init();
        LIZIZ = true;
        o.LJIIIIZZ(timeStatistics, "timeStatistics");
        float f = 1000;
        C64396PPc.LIZIZ("both", "init", null, C113554cx.LJJL(new OSZ("preprocessTotalTime", Float.valueOf(timeStatistics.getPreprocessTotalTime() / f)), new OSZ("decodeTotalTime", Float.valueOf(timeStatistics.getDecodeTotalTime() / f)), new OSZ("bindBdiSymbolTotalTime", Float.valueOf(timeStatistics.getBindBdiSymbolTotalTime() / f))));
    }

    @Override // com.bytedance.pumbaa.base.ICommonService
    public final /* bridge */ /* synthetic */ void init(C65935PuF c65935PuF, Object obj, Object obj2, Object obj3) {
        LJIILIIL(c65935PuF, (Q08) obj, (InterfaceC65784Pro) obj2);
    }
}
