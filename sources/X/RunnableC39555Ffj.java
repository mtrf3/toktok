package X;

import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.pumbaa.ruler.adapter.RuleEngineServiceImpl;
import com.bytedance.ruler.base.models.RuleModel;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Ffj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39555Ffj implements Runnable {
    public final /* synthetic */ RuleEngineServiceImpl LJLIL;
    public final /* synthetic */ Q11 LJLILLLLZI;
    public final /* synthetic */ Q11 LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ java.util.Map LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public RunnableC39555Ffj(RuleEngineServiceImpl ruleEngineServiceImpl, Q11 q11, Q11 q112, String str, java.util.Map map, boolean z) {
        this.LJLIL = ruleEngineServiceImpl;
        this.LJLILLLLZI = q11;
        this.LJLJI = q112;
        this.LJLJJI = str;
        this.LJLJJL = map;
        this.LJLJJLL = z;
    }

    public final void LIZ() {
        boolean z;
        String str;
        String str2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C39522FfC> it = this.LJLILLLLZI.LJI.iterator();
        while (it.hasNext()) {
            RuleModel ruleModel = it.next().LIZJ;
            if (ruleModel != null && ((str2 = ruleModel.key) != null || (str2 = ruleModel.title) != null)) {
                linkedHashSet.add(str2);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<C39522FfC> it2 = this.LJLJI.LJI.iterator();
        while (it2.hasNext()) {
            RuleModel ruleModel2 = it2.next().LIZJ;
            if (ruleModel2 != null && ((str = ruleModel2.key) != null || (str = ruleModel2.title) != null)) {
                linkedHashSet2.add(str);
            }
        }
        int size = linkedHashSet.size();
        int size2 = linkedHashSet2.size();
        if (size == 0 && size2 == 0) {
            return;
        }
        int size3 = ORZ.LJZI(linkedHashSet, linkedHashSet2).size();
        if (size == size2 && size == size3) {
            z = true;
        } else {
            z = false;
        }
        ApmEvent apmEvent = new ApmEvent("rule_engine_execute_result");
        apmEvent.LIZ(Boolean.valueOf(z), "match");
        apmEvent.LIZJ(Long.valueOf(size2), "new_detect_count");
        apmEvent.LIZJ(Long.valueOf(size), "old_detect_count");
        apmEvent.LIZIZ(this.LJLJJI, "source");
        apmEvent.LIZIZ(this.LJLJJL, "params");
        RuleEngineServiceImpl ruleEngineServiceImpl = this.LJLIL;
        Q11 q11 = this.LJLILLLLZI;
        ruleEngineServiceImpl.getClass();
        apmEvent.LIZIZ(RuleEngineServiceImpl.LJIILJJIL(q11), "cel_result");
        apmEvent.LIZIZ(Boolean.valueOf(this.LJLJJLL), "params_consent");
        if (!z) {
            RuleEngineServiceImpl ruleEngineServiceImpl2 = this.LJLIL;
            Q11 q112 = this.LJLJI;
            ruleEngineServiceImpl2.getClass();
            apmEvent.LIZIZ(RuleEngineServiceImpl.LJIILJJIL(q112), "ttm_result");
        }
        C66059PwF.LIZIZ(apmEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
