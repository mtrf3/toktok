package com.ss.android.ugc.aweme.compliance.common.serviceimpl;

import X.ActivityC45651qj;
import X.C199777sj;
import X.C36583EXj;
import X.C40466FuQ;
import X.C78685UuP;
import X.InterfaceC62927Omp;
import X.PYG;
import com.bytedance.poplayer.core.PopupManager;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.RuleConfig;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes11.dex */
public final class ComplianceMonitorServiceImpl implements IComplianceMonitorService {
    public volatile InterfaceControlSettings LIZIZ;
    public final Object LIZ = new Object();
    public final List<InterfaceC62927Omp> LIZJ = new ArrayList();

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void LIZ() {
        this.LIZIZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final InterfaceControlSettings LIZIZ() {
        String LIZIZ;
        List<InterfaceControlRule> rules;
        Set<String> value;
        if (this.LIZIZ == null) {
            synchronized (this.LIZ) {
                if (this.LIZIZ != null) {
                    return this.LIZIZ;
                }
                if (C36583EXj.LIZJ()) {
                    LIZIZ = KidsSettingsServiceImpl.LJIIJJI().LIZIZ();
                } else {
                    LIZIZ = a.LJIIZILJ().LIZIZ();
                }
                Exception e = null;
                this.LIZIZ = new InterfaceControlSettings(null, null, null, null, 15, null);
                if (C78685UuP.LJJJZ(LIZIZ)) {
                    try {
                        this.LIZIZ = (InterfaceControlSettings) new Gson().LJI(LIZIZ, InterfaceControlSettings.class);
                        InterfaceControlSettings interfaceControlSettings = this.LIZIZ;
                        if (interfaceControlSettings != null && (rules = interfaceControlSettings.getRules()) != null) {
                            Iterator<InterfaceControlRule> it = rules.iterator();
                            while (it.hasNext()) {
                                List<RuleConfig> ruleThens = it.next().getRuleThens();
                                if (ruleThens != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (RuleConfig ruleConfig : ruleThens) {
                                        RuleConfig ruleConfig2 = ruleConfig;
                                        if (o.LJ(ruleConfig2.getType(), ConfigTypeEnum.PARAM_REPLACE.getType()) && (value = ruleConfig2.getValue()) != null && !value.isEmpty()) {
                                            arrayList.add(ruleConfig);
                                        }
                                    }
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        RuleConfig ruleConfig3 = (RuleConfig) it2.next();
                                        Set<String> value2 = ruleConfig3.getValue();
                                        if (value2 != null) {
                                            Iterator<String> it3 = value2.iterator();
                                            while (it3.hasNext()) {
                                                List LJLJJL = s.LJLJJL(it3.next(), new String[]{":"}, 0, 6);
                                                ruleConfig3.getReplaceMap().put(LJLJJL.get(0), LJLJJL.get(1));
                                            }
                                        }
                                        Set<String> value3 = ruleConfig3.getValue();
                                        if (value3 != null) {
                                            value3.clear();
                                        }
                                        Set<String> value4 = ruleConfig3.getValue();
                                        if (value4 != null) {
                                            value4.addAll(ruleConfig3.getReplaceMap().keySet());
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                Iterator it4 = ((ArrayList) this.LIZJ).iterator();
                while (it4.hasNext()) {
                    ((InterfaceC62927Omp) it4.next()).LIZJ(LIZIZ, this.LIZIZ, e);
                }
            }
        }
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void LIZJ(PYG pyg) {
        ((ArrayList) this.LIZJ).add(pyg);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService
    public final void LIZLLL(ActivityC45651qj activity) {
        AdPersonalitySettings LJII;
        o.LJIIIZ(activity, "activity");
        if (!a.LJIIJ().LJIIL() && a.LJIIJ().LJJI() && a.LJIIJ().LJIJJ()) {
            PipServiceImpl.LJJII().LJIILJJIL();
            PopupManager.LJIIL(new C199777sj(activity));
        }
        if (!a.LJIIJ().LJIIL() && (LJII = a.LJIIZILJ().LJII()) != null && o.LJ(LJII.getNeedPopUp(), Boolean.TRUE)) {
            PipServiceImpl.LJJII().LJIILJJIL();
            PopupManager.LJIIL(new C40466FuQ(activity));
        }
    }
}
