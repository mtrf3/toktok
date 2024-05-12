package com.ss.android.ugc.aweme.plugin;

import X.AbstractC73391SrD;
import X.AbstractC73672Svk;
import X.C0RN;
import X.C113554cx;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C32I;
import X.C35628Dya;
import X.C35674DzK;
import X.C35759E1r;
import X.C35833E4n;
import X.C35837E4r;
import X.C35840E4u;
import X.C35841E4v;
import X.C35846E5a;
import X.C35847E5b;
import X.C35848E5c;
import X.C35849E5d;
import X.C35850E5e;
import X.C35851E5f;
import X.C38302F1m;
import X.C38987FRv;
import X.C38995FSd;
import X.C39687Fhr;
import X.C39690Fhu;
import X.C47135Ieh;
import X.C47261Igj;
import X.C51029K0z;
import X.C58096Mr6;
import X.C5H3;
import X.C61878OQg;
import X.C64797Pbt;
import X.C68322mC;
import X.C77800Ug8;
import X.C78685UuP;
import X.E4G;
import X.E4Q;
import X.E5J;
import X.E5L;
import X.E5P;
import X.E5Q;
import X.E5R;
import X.E5S;
import X.E5T;
import X.E5U;
import X.E5V;
import X.E5X;
import X.E5Y;
import X.E5Z;
import X.E61;
import X.E72;
import X.E7F;
import X.EAB;
import X.EF7;
import X.EFJ;
import X.EnumC35839E4t;
import X.FH1;
import X.FH5;
import X.FMX;
import X.HG3;
import X.InterfaceC35760E1s;
import X.InterfaceC35860E5o;
import X.InterfaceC64989Pez;
import X.InterfaceC65349Pkn;
import X.InterfaceC79713Ax;
import X.KMP;
import X.ORZ;
import X.RBX;
import X.X1D;
import Y.AObserverS70S0200000_6;
import Y.AObserverS74S0100000_6;
import Y.ARunnableS10S0400000_6;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.clienttrigger.ConditionalStateMachine;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor;
import com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.b0;
import defpackage.s1;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes7.dex */
public final class PluginService implements IPluginService, InterfaceC35760E1s, InterfaceC35860E5o {
    public static final C35850E5e Companion = new C35850E5e();
    public final PluginApi api;
    public IPluginService.ClientTriggerConfig clientTriggerConfig;
    public final AtomicBoolean didCompleteLoad;
    public final AtomicBoolean didLoad;
    public final C5H3 eventInterceptor$delegate;
    public final C5H3 firstInstallVersion$delegate;
    public final C5H3 initListeners$delegate;
    public final C5H3 initialRequestResultLiveData$delegate;
    public final Keva keva;
    public final C5H3 pluginABManager$delegate;
    public Map<Long, C35833E4n> pluginMap;
    public final MutableLiveData<Map<Long, C35833E4n>> plugins;
    public RealtimeFeedbackInterceptor realtimeFeedbackInterceptor;
    public final C5H3 ssaid$delegate;
    public Map<Integer, ConditionalStateMachine> stateMachineMap;

    /* loaded from: classes7.dex */
    public interface PluginApi {
        @E4Q("tiktok/v1/plugin/config/")
        AbstractC73672Svk<C64797Pbt<IPluginService.PluginConfigResponse>> getPluginConfig(@InterfaceC64989Pez("has_previous_did") Boolean bool, @InterfaceC64989Pez("is_new_signup_user") Boolean bool2, @InterfaceC64989Pez("is_multiaccount_user") Boolean bool3, @InterfaceC64989Pez("first_install_version") String str, @InterfaceC64989Pez("cached_plugins") String str2, @InterfaceC64989Pez("cached_state_machines") String str3, @InterfaceC64989Pez("skip_cache") Boolean bool4, @InterfaceC64989Pez("ssaid") String str4, @InterfaceC64989Pez("is_first_launch") Boolean bool5, @InterfaceC64989Pez("mock_is_reinstall") Boolean bool6, @InterfaceC64989Pez("pre_did_req_cnt") Integer num, @InterfaceC64989Pez("need_cdid_ab") Integer num2, @InterfaceC64989Pez("android_device_reinstall_check") Integer num3, @InterfaceC64989Pez("vv_count") Integer num4, @InterfaceC64989Pez("mock_hybridab_id") String str5, @InterfaceC64989Pez("memory_size") Long l, @InterfaceC64989Pez("screen_dp") Double d);

        /* loaded from: classes7.dex */
        public static final class CachedPlugin {

            @InterfaceC65349Pkn("cached_time")
            public final long cacheTime;

            @InterfaceC65349Pkn("id")
            public final int id;

            @InterfaceC65349Pkn("instance_id")
            public final Integer instanceId;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CachedPlugin)) {
                    return false;
                }
                CachedPlugin cachedPlugin = (CachedPlugin) obj;
                return this.id == cachedPlugin.id && o.LJ(this.instanceId, cachedPlugin.instanceId) && this.cacheTime == cachedPlugin.cacheTime;
            }

            public final int hashCode() {
                int i = this.id * 31;
                Integer num = this.instanceId;
                return C16880lQ.LLJIJIL(this.cacheTime) + ((i + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CachedPlugin(id=");
                LIZ.append(this.id);
                LIZ.append(", instanceId=");
                LIZ.append(this.instanceId);
                LIZ.append(", cacheTime=");
                return C47135Ieh.LIZIZ(LIZ, this.cacheTime, ')', LIZ);
            }

            public CachedPlugin(int i, Integer num, long j) {
                this.id = i;
                this.instanceId = num;
                this.cacheTime = j;
            }
        }

        /* loaded from: classes7.dex */
        public static final class CachedStateMachine {

            @InterfaceC65349Pkn("id")
            public final int id;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CachedStateMachine) && this.id == ((CachedStateMachine) obj).id;
            }

            public final int hashCode() {
                return this.id;
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CachedStateMachine(id=");
                return b0.LIZJ(LIZ, this.id, ')', LIZ);
            }

            public CachedStateMachine(int i) {
                this.id = i;
            }
        }
    }

    private final C35759E1r getEventInterceptor() {
        return (C35759E1r) this.eventInterceptor$delegate.getValue();
    }

    private final List<E5J> getInitListeners() {
        return (List) this.initListeners$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public List<E4G> getCurrentPluginList() {
        Collection<C35833E4n> values = this.pluginMap.values();
        ArrayList arrayList = new ArrayList();
        for (C35833E4n c35833E4n : values) {
            if (o.LJ(c35833E4n.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                arrayList.add(c35833E4n);
            }
        }
        return ORZ.LLJI(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public List<IPluginService.PluginData> getCurrentPluginListPluginData() {
        Collection<C35833E4n> values = this.pluginMap.values();
        ArrayList arrayList = new ArrayList(C32I.LJJL(values, 10));
        Iterator<C35833E4n> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZIZ);
        }
        return ORZ.LLJI(arrayList);
    }

    public final String getFirstInstallVersion() {
        return (String) this.firstInstallVersion$delegate.getValue();
    }

    public final MutableLiveData<E5L> getInitialRequestResultLiveData() {
        return (MutableLiveData) this.initialRequestResultLiveData$delegate.getValue();
    }

    public final Long getMemorySize() {
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            return Long.valueOf(C39687Fhr.LJIILL(EF7.LIZIZ()));
        }
        return null;
    }

    public final C35840E4u getPluginABManager() {
        return (C35840E4u) this.pluginABManager$delegate.getValue();
    }

    public final Double getScreenDp() {
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            C39690Fhu LJIIL = C39687Fhr.LJIIL(EF7.LIZIZ());
            double d = LJIIL.LIZ;
            int i = LJIIL.LIZJ;
            if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                return Double.valueOf((i * 160.0f) / d);
            }
        }
        return null;
    }

    public final String getSsaid() {
        return (String) this.ssaid$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void initRealtimeFeedbackInterceptor() {
        RealtimeFeedbackInterceptor realtimeFeedbackInterceptor;
        if (new E61().LIZ()) {
            realtimeFeedbackInterceptor = C35851E5f.LIZ;
        } else {
            realtimeFeedbackInterceptor = null;
        }
        this.realtimeFeedbackInterceptor = realtimeFeedbackInterceptor;
        if (realtimeFeedbackInterceptor != null) {
            realtimeFeedbackInterceptor.LIZLLL = this;
            FMX.LIZ(realtimeFeedbackInterceptor);
        }
    }

    @Override // X.InterfaceC35860E5o
    public void onComplete() {
        RealtimeFeedbackInterceptor realtimeFeedbackInterceptor = this.realtimeFeedbackInterceptor;
        if (realtimeFeedbackInterceptor == null || FMX.LIZIZ == null) {
            return;
        }
        FMX.LIZIZ.remove(realtimeFeedbackInterceptor);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void tryInit() {
        int i;
        if (this.didLoad.compareAndSet(false, true)) {
            Map<Long, C35833E4n> initCachedPlugins = initCachedPlugins();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Loaded cached plugins, total in cache: ");
            if (initCachedPlugins != null) {
                i = initCachedPlugins.size();
            } else {
                i = -1;
            }
            LIZ.append(i);
            LIZ.append('.');
            X1D.LIZIZ(LIZ);
            loadClientTriggerConfig();
            if (!o.LJ(this.clientTriggerConfig.enable, Boolean.FALSE)) {
                FMX.LIZ(getEventInterceptor());
                if (initCachedPlugins == null) {
                    initCachedPlugins = C113554cx.LJJJLIIL();
                }
                initUserSegmentation(initCachedPlugins);
            }
            synchronized (getInitListeners()) {
                this.didCompleteLoad.set(true);
                Iterator<E5J> it = getInitListeners().iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
                getInitListeners().clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluginService() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        this.api = (PluginApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, PluginApi.class);
        this.pluginMap = C113554cx.LJJJLIIL();
        this.plugins = new MutableLiveData<>();
        this.initialRequestResultLiveData$delegate = C221108m2.LIZIZ(C35847E5b.LJLIL);
        this.stateMachineMap = new HashMap();
        this.didLoad = new AtomicBoolean(false);
        this.didCompleteLoad = new AtomicBoolean(false);
        this.initListeners$delegate = C221108m2.LIZIZ(C35628Dya.LJLIL);
        this.pluginABManager$delegate = C221108m2.LIZIZ(C35841E4v.LJLIL);
        this.clientTriggerConfig = new IPluginService.ClientTriggerConfig(Boolean.TRUE, 50, 30000L, null, 8, null == true ? 1 : 0);
        this.keva = Keva.getRepo("plugin_repo");
        this.eventInterceptor$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 66));
        this.firstInstallVersion$delegate = C221108m2.LIZIZ(new AqS156S0100000_6(this, 67));
        this.ssaid$delegate = C221108m2.LIZIZ(E72.LJLIL);
    }

    private final Map<Long, C35833E4n> initCachedPlugins() {
        String string;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        LinkedHashMap linkedHashMap = null;
        try {
            string = this.keva.getString("plugin_list", "");
        } catch (Exception e) {
            onParseException(e);
        }
        if (TextUtils.isEmpty(string)) {
            updatePlugins(C113554cx.LJJJLIIL());
            return null;
        }
        try {
            try {
                Type type = new E5X().getType();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Object LJII = LIZ.LJII(string, type);
                o.LJIIIIZZ(LJII, "gson.fromJson<Map<Long, …luginMapAsJson, itemType)");
                for (Map.Entry entry : ((Map) LJII).entrySet()) {
                    C35833E4n LIZ2 = C35837E4r.LIZ((IPluginService.PluginData) entry.getValue());
                    if (LIZ2 != null) {
                        linkedHashMap2.put(entry.getKey(), LIZ2);
                    }
                }
                linkedHashMap = linkedHashMap2;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Object LJII2 = LIZ.LJII(string, new E5Y().getType());
            o.LJIIIIZZ(LJII2, "gson.fromJson(pluginMapAsJson, itemType)");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) LJII2).iterator();
            while (it.hasNext()) {
                C35833E4n LIZ3 = C35837E4r.LIZ((IPluginService.PluginData) it.next());
                if (LIZ3 != null) {
                    arrayList.add(LIZ3);
                }
            }
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(arrayList, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(LJJIIZ);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                C35833E4n c35833E4n = (C35833E4n) next;
                linkedHashMap3.put(Long.valueOf(getPluginIdentifier(c35833E4n.LIZ.getValue(), Integer.valueOf(c35833E4n.LIZ()))), next);
            }
            linkedHashMap = linkedHashMap3;
        }
        if (linkedHashMap != null) {
            updatePlugins(linkedHashMap);
        }
        return linkedHashMap;
    }

    private final void loadClientTriggerConfig() {
        IPluginService.ClientTriggerConfig clientTriggerConfig;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        String string = this.keva.getString("ctconfig", "");
        if (C78685UuP.LJJJZ(string)) {
            try {
                Object LJII = LIZ.LJII(string, new C35848E5c().getType());
                o.LJIIIIZZ(LJII, "{\n                gson.f…ConfigType)\n            }");
                clientTriggerConfig = (IPluginService.ClientTriggerConfig) LJII;
            } catch (Exception unused) {
                clientTriggerConfig = this.clientTriggerConfig;
            }
            this.clientTriggerConfig = clientTriggerConfig;
        }
    }

    public final String getMockHybridAbIdForDebug() {
        String mockHybridABId;
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if (localTestApi != null && (mockHybridABId = localTestApi.getMockHybridABId()) != null && C78685UuP.LJJJZ(mockHybridABId)) {
            return localTestApi.getMockHybridABId();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void runClientExperimentUploadTask() {
    }

    public static IPluginService createIPluginServicebyMonsterPlugin(boolean z) {
        Object LIZ = C58096Mr6.LIZ(IPluginService.class, z);
        if (LIZ != null) {
            return (IPluginService) LIZ;
        }
        if (C58096Mr6.R3 == null) {
            synchronized (IPluginService.class) {
                if (C58096Mr6.R3 == null) {
                    C58096Mr6.R3 = new PluginService();
                }
            }
        }
        return C58096Mr6.R3;
    }

    private final String getConditionalStateMachineKey(int i) {
        return KMP.LJ("did_user_segment__", i);
    }

    private final Map<Long, C35833E4n> getMergedList(List<IPluginService.PluginData> list) {
        String str;
        String str2;
        Map<Long, C35833E4n> map = this.pluginMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        for (IPluginService.PluginData pluginData : list) {
            C35833E4n LIZ = C35837E4r.LIZ(pluginData);
            if (LIZ != null) {
                long pluginIdentifier = getPluginIdentifier(LIZ.LIZ.getValue(), Integer.valueOf(LIZ.LIZ()));
                C35833E4n c35833E4n = map.get(Long.valueOf(pluginIdentifier));
                if (c35833E4n != null) {
                    long j = pluginData.timestamp;
                    IPluginService.PluginData pluginData2 = c35833E4n.LIZIZ;
                    if (j <= pluginData2.timestamp) {
                        Boolean bool = pluginData2.showConfig.shouldShow;
                        Boolean bool2 = Boolean.TRUE;
                        if (o.LJ(bool, bool2) && !o.LJ(pluginData.showConfig.shouldShow, bool2)) {
                            ArrayList arrayList = new ArrayList();
                            String str3 = c35833E4n.LIZIZ.abExposeVid;
                            if (str3 != null) {
                                arrayList.add(str3);
                            }
                            IPluginService.AutoExposureConfig autoExposureConfig = c35833E4n.LIZIZ.autoExposureConfig;
                            if (autoExposureConfig != null && (str2 = autoExposureConfig.preciseExposureVid) != null) {
                                arrayList.add(str2);
                            }
                            IPluginService.AutoExposureConfig autoExposureConfig2 = c35833E4n.LIZIZ.autoExposureConfig;
                            if (autoExposureConfig2 != null && (str = autoExposureConfig2.fullExposureVid) != null) {
                                arrayList.add(str);
                            }
                            String LLD = ORZ.LLD(arrayList, ",", null, null, null, 62);
                            if (LLD.length() > 0 && (!ujb.o.LJJJJJL(LLD))) {
                                FH5.LIZIZ().getClass();
                                FH1 fh1 = FH1.LJI;
                                fh1.getClass();
                                E7F LJI = FH1.LJI();
                                LJI.getClass();
                                List<String> LIZIZ = E7F.LIZIZ(LLD);
                                if (LIZIZ != null) {
                                    LJI.LIZJ.LJ(LIZIZ);
                                    EAB LIZ2 = LJI.LIZ();
                                    if (LIZ2 != null) {
                                        LIZ2.LJ(LIZIZ);
                                    }
                                }
                                fh1.getClass();
                                FH1.LIZLLL();
                            }
                        }
                    }
                }
                pluginData.LIZ = System.currentTimeMillis();
                linkedHashMap.put(Long.valueOf(pluginIdentifier), LIZ);
            }
        }
        return linkedHashMap;
    }

    private final String getUserKey(E5V e5v) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new_user_");
        LIZ.append(e5v.LIZ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initUserSegmentation(Map<Long, C35833E4n> map) {
        Integer num;
        String string;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        try {
            String string2 = this.keva.getString("user_segment_list", "");
            if (!TextUtils.isEmpty(string2)) {
                Object LJII = LIZ.LJII(string2, new E5Z().getType());
                o.LJIIIIZZ(LJII, "gson.fromJson<ArrayList<…hineListAsJson, itemType)");
                Iterator it = ((Iterable) LJII).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    try {
                        string = this.keva.getString(getConditionalStateMachineKey(intValue), "");
                    } catch (Exception e) {
                        onParseException(e);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        Type type = new C35846E5a().getType();
                        Map<Integer, ConditionalStateMachine> map2 = this.stateMachineMap;
                        Integer valueOf = Integer.valueOf(intValue);
                        Object LJII2 = LIZ.LJII(string, type);
                        o.LJIIIIZZ(LJII2, "gson.fromJson(stateMachi…ditionalStateMachineType)");
                        map2.put(valueOf, LJII2);
                    } else {
                        z = true;
                    }
                }
                if (z) {
                    this.keva.storeString("user_segment_list", LIZ.LJIILL(this.stateMachineMap.keySet().toArray(new Integer[0])));
                }
            }
        } catch (Exception e2) {
            onParseException(e2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Collection<C35833E4n> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (C35833E4n c35833E4n : values) {
            IPluginService.ShowConfig showConfig = c35833E4n.LIZIZ.showConfig;
            if (showConfig.shouldShow == null) {
                IPluginService.ShowType showType = showConfig.showType;
                IPluginService.ShowType.ShowTypeEnum showTypeEnum = null;
                if (showType != null) {
                    showTypeEnum = showType.type;
                }
                if (showTypeEnum == IPluginService.ShowType.ShowTypeEnum.CONDITIONAL_SHOW && showType != null && showType.conditionalStateMachineId != null) {
                    arrayList.add(c35833E4n);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C35833E4n c35833E4n2 = (C35833E4n) it2.next();
            long pluginIdentifier = getPluginIdentifier(c35833E4n2.LIZ.getValue(), Integer.valueOf(c35833E4n2.LIZ()));
            IPluginService.ShowType showType2 = c35833E4n2.LIZIZ.showConfig.showType;
            if (showType2 != null && (num = showType2.conditionalStateMachineId) != null) {
                int intValue2 = num.intValue();
                Integer valueOf2 = Integer.valueOf(intValue2);
                List list = (List) linkedHashMap.get(Integer.valueOf(intValue2));
                if (list != null) {
                    list.add(Long.valueOf(pluginIdentifier));
                } else {
                    list = C47261Igj.LJJIJIL(Long.valueOf(pluginIdentifier));
                }
                linkedHashMap.put(valueOf2, list);
            }
        }
        getEventInterceptor().LIZ(ORZ.LLJI(this.stateMachineMap.values()), !C38987FRv.LIZLLL().booleanValue(), linkedHashMap);
    }

    private final void onParseException(Exception exc) {
        if ((exc instanceof JSONException) || (exc instanceof C38302F1m)) {
            C188727au c188727au = new C188727au();
            String localizedMessage = exc.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            c188727au.LJIIIZ("fail_info", localizedMessage);
            FMX.LJIIL("ct_json_exception", c188727au.LIZ);
            return;
        }
        if (exc instanceof NullPointerException) {
        } else {
            throw exc;
        }
    }

    private final void updatePlugins(Map<Long, C35833E4n> map) {
        this.pluginMap = map;
        this.plugins.postValue(map);
        try {
            Gson LIZ = GsonHolder.LIZLLL().LIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Long, C35833E4n> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().LIZIZ);
            }
            this.keva.storeString("plugin_list", LIZ.LJIILL(linkedHashMap));
        } catch (Exception e) {
            onParseException(e);
        }
    }

    public final Boolean cacheUserAndCheckIfNewSignup(E5V e5v) {
        if (e5v == null) {
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                this.keva.storeString("prev_user", "");
                return null;
            }
            String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
            Keva keva = this.keva;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("new_user_");
            LIZ.append(curSecUserId);
            return Boolean.valueOf(keva.getBoolean(X1D.LIZIZ(LIZ), false));
        }
        this.keva.storeString("prev_user", e5v.LIZ);
        String userKey = getUserKey(e5v);
        if (this.keva.contains(userKey)) {
            return Boolean.valueOf(this.keva.getBoolean(userKey, false));
        }
        this.keva.storeBoolean(userKey, e5v.LIZIZ);
        if (e5v.LIZIZ) {
            TooltipApplicabilityService.LJII().LJFF(e5v.LIZ);
            NewUserProgressBarManager.LIZJ().LIZIZ(e5v.LIZ);
        }
        return Boolean.valueOf(e5v.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public InterfaceC79713Ax observeInitialLaunchRequestResultForever(Observer<E5L> observer) {
        o.LJIIIZ(observer, "observer");
        synchronized (getInitialRequestResultLiveData()) {
            E5L value = getInitialRequestResultLiveData().getValue();
            if (value != null) {
                observer.onChanged(value);
                return new C35849E5d();
            }
            getInitialRequestResultLiveData().observeForever(observer);
            return new E5U(this, observer);
        }
    }

    @Override // X.InterfaceC35760E1s
    public void onUpdateState(ConditionalStateMachine updatedModel) {
        o.LJIIIZ(updatedModel, "updatedModel");
        try {
            this.keva.storeString(getConditionalStateMachineKey(updatedModel.id), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), updatedModel));
        } catch (Exception e) {
            onParseException(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void subscribeInit(E5J listener) {
        o.LJIIIZ(listener, "listener");
        if (this.didCompleteLoad.get()) {
            listener.LIZ();
            return;
        }
        synchronized (getInitListeners()) {
            getInitListeners().add(listener);
        }
    }

    public final void updateClientTriggerConfig(IPluginService.ClientTriggerConfig clientTriggerConfig) {
        String str = clientTriggerConfig.vid;
        if (str != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str);
        }
        this.clientTriggerConfig = clientTriggerConfig;
        try {
            this.keva.storeString("ctconfig", GsonHolder.LIZLLL().LIZ().LJIILL(clientTriggerConfig));
        } catch (Exception unused) {
        }
    }

    private final long getPluginIdentifier(int i, Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        return (i * 10000000000L) + i2;
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public InterfaceC79713Ax backgroundThreadObserveAll(EnumC35839E4t id, Observer<List<E4G>> observer) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(observer, "observer");
        C68322mC c68322mC = new C68322mC();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0400000_6(c68322mC, id, observer, this, 0));
        return new E5P(c68322mC, this);
    }

    public InterfaceC79713Ax backgroundThreadObserveAllPluginData(EnumC35839E4t id, Observer<List<IPluginService.PluginData>> observer) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(observer, "observer");
        C68322mC c68322mC = new C68322mC();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0400000_6(c68322mC, id, observer, this, 1));
        return new E5Q(c68322mC, this);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public InterfaceC79713Ax backgroundThreadObserveFirst(EnumC35839E4t id, Observer<E4G> observer) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(observer, "observer");
        C68322mC c68322mC = new C68322mC();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0400000_6(c68322mC, id, observer, this, 2));
        return new E5R(c68322mC, this);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public InterfaceC79713Ax backgroundThreadObserveFirstPluginData(EnumC35839E4t id, Observer<IPluginService.PluginData> observer) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(observer, "observer");
        C68322mC c68322mC = new C68322mC();
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS10S0400000_6(c68322mC, id, observer, this, 3));
        return new E5S(c68322mC, this);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void observeInitialLaunchRequestResult(LifecycleOwner owner, AbstractC73391SrD<E5L> observer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        getInitialRequestResultLiveData().observe(owner, new AObserverS74S0100000_6(observer, 5));
    }

    @Override // X.InterfaceC35760E1s
    public void onCompleted(ConditionalStateMachine completedStateMachine, List<Long> completedPluginsIdentifiers) {
        IPluginService.ShowType showType;
        IPluginService.ShowType.ApplyAction applyAction;
        int i;
        o.LJIIIZ(completedStateMachine, "completedStateMachine");
        o.LJIIIZ(completedPluginsIdentifiers, "completedPluginsIdentifiers");
        Map<Long, C35833E4n> value = this.plugins.getValue();
        if (value == null) {
            value = C113554cx.LJJJLIIL();
        }
        Iterator<Long> it = completedPluginsIdentifiers.iterator();
        while (it.hasNext()) {
            C35833E4n c35833E4n = value.get(Long.valueOf(it.next().longValue()));
            if (c35833E4n != null && (showType = c35833E4n.LIZIZ.showConfig.showType) != null && (applyAction = showType.applyAction) != null && ((i = C35674DzK.LIZ[applyAction.ordinal()]) == 1 || i == 2)) {
                logUserSegmentActivationET(c35833E4n.LIZIZ, completedStateMachine.id, true);
                c35833E4n.LIZIZ.showConfig.shouldShow = Boolean.TRUE;
            }
        }
        updatePlugins(value);
        onUpdateState(completedStateMachine);
    }

    public final synchronized void updateRepo(List<IPluginService.PluginData> list, List<ConditionalStateMachine> list2) {
        Integer num;
        IPluginService.ShowType.ShowTypeEnum showTypeEnum;
        Integer num2;
        IPluginService.ShowType showType;
        IPluginService.ShowType.ApplyAction applyAction;
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        Map<Long, C35833E4n> mergedList = getMergedList(list);
        if (!o.LJ(this.clientTriggerConfig.enable, Boolean.FALSE)) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (list2 != null) {
                for (ConditionalStateMachine conditionalStateMachine : list2) {
                    ConditionalStateMachine conditionalStateMachine2 = this.stateMachineMap.get(Integer.valueOf(conditionalStateMachine.id));
                    if (conditionalStateMachine2 == null) {
                        this.stateMachineMap.put(Integer.valueOf(conditionalStateMachine.id), conditionalStateMachine);
                        arrayList.add(conditionalStateMachine);
                        this.keva.storeString(getConditionalStateMachineKey(conditionalStateMachine.id), GsonProtectorUtils.toJson(LIZ, conditionalStateMachine));
                    } else {
                        Boolean bool = conditionalStateMachine2.isComplete;
                        Boolean bool2 = Boolean.TRUE;
                        if (o.LJ(bool, bool2) && !o.LJ(conditionalStateMachine.shouldDisable, bool2)) {
                            linkedHashSet.add(Integer.valueOf(conditionalStateMachine2.id));
                        } else if (o.LJ(conditionalStateMachine2.shouldDisable, bool2)) {
                            C61878OQg c61878OQg = C61878OQg.INSTANCE;
                            o.LJIIIZ(c61878OQg, "<set-?>");
                            conditionalStateMachine2.nodes = c61878OQg;
                            this.keva.storeString(getConditionalStateMachineKey(conditionalStateMachine.id), GsonProtectorUtils.toJson(LIZ, conditionalStateMachine));
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.keva.storeString("user_segment_list", GsonProtectorUtils.toJson(LIZ, this.stateMachineMap.keySet().toArray(new Integer[0])));
            }
            for (C35833E4n c35833E4n : mergedList.values()) {
                IPluginService.ShowType showType2 = c35833E4n.LIZIZ.showConfig.showType;
                if (showType2 != null && (num2 = showType2.conditionalStateMachineId) != null) {
                    int intValue = num2.intValue();
                    if (linkedHashSet.contains(Integer.valueOf(intValue)) && (showType = c35833E4n.LIZIZ.showConfig.showType) != null && (applyAction = showType.applyAction) != null && C35674DzK.LIZ[applyAction.ordinal()] == 1) {
                        logUserSegmentActivationET(c35833E4n.LIZIZ, intValue, false);
                        c35833E4n.LIZIZ.showConfig.shouldShow = Boolean.TRUE;
                    }
                }
            }
            Collection<C35833E4n> values = mergedList.values();
            ArrayList arrayList2 = new ArrayList();
            for (C35833E4n c35833E4n2 : values) {
                IPluginService.ShowConfig showConfig = c35833E4n2.LIZIZ.showConfig;
                if (showConfig.shouldShow == null) {
                    IPluginService.ShowType showType3 = showConfig.showType;
                    if (showType3 != null) {
                        showTypeEnum = showType3.type;
                    } else {
                        showTypeEnum = null;
                    }
                    if (showTypeEnum == IPluginService.ShowType.ShowTypeEnum.CONDITIONAL_SHOW && showType3 != null && showType3.conditionalStateMachineId != null) {
                        arrayList2.add(c35833E4n2);
                    }
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C35833E4n c35833E4n3 = (C35833E4n) it.next();
                long pluginIdentifier = getPluginIdentifier(c35833E4n3.LIZ.getValue(), Integer.valueOf(c35833E4n3.LIZ()));
                IPluginService.ShowType showType4 = c35833E4n3.LIZIZ.showConfig.showType;
                if (showType4 != null && (num = showType4.conditionalStateMachineId) != null) {
                    int intValue2 = num.intValue();
                    Integer valueOf = Integer.valueOf(intValue2);
                    List list3 = (List) linkedHashMap.get(Integer.valueOf(intValue2));
                    if (list3 != null) {
                        list3.add(Long.valueOf(pluginIdentifier));
                    } else {
                        list3 = C47261Igj.LJJIJIL(Long.valueOf(pluginIdentifier));
                    }
                    linkedHashMap.put(valueOf, list3);
                }
            }
            getEventInterceptor().LIZ(ORZ.LLJI(this.stateMachineMap.values()), true, linkedHashMap);
        }
        updatePlugins(mergedList);
    }

    private final void logUserSegmentActivationET(IPluginService.PluginData pluginData, int i, boolean z) {
        int i2;
        C188727au LIZJ = C0RN.LIZJ(i, "state_machine_id", z ? 1 : 0, "is_realtime_trigger");
        LIZJ.LIZLLL(pluginData.id, "plugin_id");
        Integer num = pluginData.instanceId;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        LIZJ.LIZLLL(i2, "instance_id");
        Object obj = pluginData.abExposeVid;
        if (obj == null) {
            obj = -1;
        }
        LIZJ.LJFF(obj, "ab_expose_vid");
        FMX.LJIIL("enter_user_segment", LIZJ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void observe(EnumC35839E4t id, LifecycleOwner owner, AbstractC73391SrD<E4G> observer) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        this.plugins.observe(owner, new AObserverS70S0200000_6(id, observer, 6));
    }

    public void observeAll(EnumC35839E4t id, LifecycleOwner owner, AbstractC73391SrD<List<E4G>> observer) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        this.plugins.observe(owner, new AObserverS70S0200000_6(id, observer, 7));
    }

    @Override // com.ss.android.ugc.aweme.plugin.IPluginService
    public void startPluginRequest(Boolean bool, E5V e5v, Boolean bool2, Boolean bool3, boolean z, int i) {
        C38995FSd.LIZIZ().submit(new E5T(this, bool, e5v, bool2, bool3, z, i));
    }
}
