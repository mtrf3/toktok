package X;

import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.helios.api.consumer.ReportParam;
import com.bytedance.ruler.base.models.RuleModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Pth, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65901Pth extends F9E {
    public C65922Pu2 LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public C65938PuI LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public java.util.Set<String> LJLL;
    public transient java.util.Map<String, Object> LJLLI;
    public java.util.Set<String> LJLLILLLL;
    public java.util.Set<String> LJLLJ;
    public java.util.Map<String, Object> LJLLL;
    public List<ReportParam> LJLLLL;
    public List<RuleModel> LJLLLLLL;
    public List<OperateHistory> LJLZ;
    public final long LJZ;
    public C64709PaT LJZI;
    public final String LJZL;
    public String LL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, Boolean.valueOf(this.LJLJLLL), this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL, this.LJLLLLLL, this.LJLZ, Long.valueOf(this.LJZ), this.LJZI, this.LJZL, this.LL};
    }

    public /* synthetic */ C65901Pth() {
        this(new C65922Pu2(0), "", "", "", "", new C65938PuI(15), "", "", false, new LinkedHashSet(), new LinkedHashMap(), new LinkedHashSet(), new LinkedHashSet(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), System.currentTimeMillis(), new C64709PaT(), "5.2.0-rc.4", null);
    }

    public static C65901Pth L(C65901Pth c65901Pth) {
        C65922Pu2 invokeContext = c65901Pth.LJLIL;
        String eventType = c65901Pth.LJLILLLLZI;
        String eventSource = c65901Pth.LJLJI;
        String settingsVersion = c65901Pth.LJLJJI;
        String userRegion = c65901Pth.LJLJJL;
        C65938PuI sampleRateModel = c65901Pth.LJLJJLL;
        String currentPage = c65901Pth.LJLJL;
        String currentRegion = c65901Pth.LJLJLJ;
        boolean z = c65901Pth.LJLJLLL;
        java.util.Set<String> appScenes = c65901Pth.LJLL;
        java.util.Map<String, Object> extraInfo = c65901Pth.LJLLI;
        java.util.Set<String> monitorScenes = c65901Pth.LJLLILLLL;
        java.util.Set<String> reportTags = c65901Pth.LJLLJ;
        java.util.Map<String, Object> engineParams = c65901Pth.LJLLL;
        List<ReportParam> reportParams = c65901Pth.LJLLLL;
        List<RuleModel> hitRules = c65901Pth.LJLLLLLL;
        List<OperateHistory> operateHistory = c65901Pth.LJLZ;
        long j = c65901Pth.LJZ;
        C64709PaT handleResult = c65901Pth.LJZI;
        String sdkVersion = c65901Pth.LJZL;
        String str = c65901Pth.LL;
        c65901Pth.getClass();
        o.LJIIIZ(invokeContext, "invokeContext");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(eventSource, "eventSource");
        o.LJIIIZ(settingsVersion, "settingsVersion");
        o.LJIIIZ(userRegion, "userRegion");
        o.LJIIIZ(sampleRateModel, "sampleRateModel");
        o.LJIIIZ(currentPage, "currentPage");
        o.LJIIIZ(currentRegion, "currentRegion");
        o.LJIIIZ(appScenes, "appScenes");
        o.LJIIIZ(extraInfo, "extraInfo");
        o.LJIIIZ(monitorScenes, "monitorScenes");
        o.LJIIIZ(reportTags, "reportTags");
        o.LJIIIZ(engineParams, "engineParams");
        o.LJIIIZ(reportParams, "reportParams");
        o.LJIIIZ(hitRules, "hitRules");
        o.LJIIIZ(operateHistory, "operateHistory");
        o.LJIIIZ(handleResult, "handleResult");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        return new C65901Pth(invokeContext, eventType, eventSource, settingsVersion, userRegion, sampleRateModel, currentPage, currentRegion, z, appScenes, extraInfo, monitorScenes, reportTags, engineParams, reportParams, hitRules, operateHistory, j, handleResult, sdkVersion, str);
    }

    public final void M(C65922Pu2 originalInvokeContext) {
        o.LJIIIZ(originalInvokeContext, "originalInvokeContext");
        this.LJLIL = originalInvokeContext;
        this.LJLLI = new LinkedHashMap();
        this.LJLLJ = new LinkedHashSet();
        this.LJLLILLLL = new LinkedHashSet();
        java.util.Map<String, Object> map = this.LJLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (o.LJ(entry.getKey(), "webview_channel") || o.LJ(entry.getKey(), "webview_url")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.LJLLL = C113554cx.LJJLIL(linkedHashMap);
        List<ReportParam> list = this.LJLLLL;
        ArrayList arrayList = new ArrayList();
        for (ReportParam reportParam : list) {
            if (reportParam.isRemain()) {
                arrayList.add(reportParam);
            }
        }
        this.LJLLLL = ORZ.LLJILJILJ(arrayList);
        this.LJLLLLLL = new ArrayList();
        this.LJLZ = new ArrayList();
        this.LJZI = new C64709PaT();
    }

    public C65901Pth(C65922Pu2 invokeContext, String eventType, String eventSource, String settingsVersion, String userRegion, C65938PuI sampleRateModel, String currentPage, String currentRegion, boolean z, java.util.Set<String> appScenes, java.util.Map<String, Object> extraInfo, java.util.Set<String> monitorScenes, java.util.Set<String> reportTags, java.util.Map<String, Object> engineParams, List<ReportParam> reportParams, List<RuleModel> hitRules, List<OperateHistory> operateHistory, long j, C64709PaT handleResult, String sdkVersion, String str) {
        o.LJIIIZ(invokeContext, "invokeContext");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(eventSource, "eventSource");
        o.LJIIIZ(settingsVersion, "settingsVersion");
        o.LJIIIZ(userRegion, "userRegion");
        o.LJIIIZ(sampleRateModel, "sampleRateModel");
        o.LJIIIZ(currentPage, "currentPage");
        o.LJIIIZ(currentRegion, "currentRegion");
        o.LJIIIZ(appScenes, "appScenes");
        o.LJIIIZ(extraInfo, "extraInfo");
        o.LJIIIZ(monitorScenes, "monitorScenes");
        o.LJIIIZ(reportTags, "reportTags");
        o.LJIIIZ(engineParams, "engineParams");
        o.LJIIIZ(reportParams, "reportParams");
        o.LJIIIZ(hitRules, "hitRules");
        o.LJIIIZ(operateHistory, "operateHistory");
        o.LJIIIZ(handleResult, "handleResult");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        this.LJLIL = invokeContext;
        this.LJLILLLLZI = eventType;
        this.LJLJI = eventSource;
        this.LJLJJI = settingsVersion;
        this.LJLJJL = userRegion;
        this.LJLJJLL = sampleRateModel;
        this.LJLJL = currentPage;
        this.LJLJLJ = currentRegion;
        this.LJLJLLL = z;
        this.LJLL = appScenes;
        this.LJLLI = extraInfo;
        this.LJLLILLLL = monitorScenes;
        this.LJLLJ = reportTags;
        this.LJLLL = engineParams;
        this.LJLLLL = reportParams;
        this.LJLLLLLL = hitRules;
        this.LJLZ = operateHistory;
        this.LJZ = j;
        this.LJZI = handleResult;
        this.LJZL = sdkVersion;
        this.LL = str;
    }
}
