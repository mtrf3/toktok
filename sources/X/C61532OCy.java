package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.IGeckoGlobalInit;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.policy.v4.UpdateModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import defpackage.i0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OCy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61532OCy {
    public final java.util.Set<String> LIZ;
    public final java.util.Map<String, java.util.Map<String, OptionCheckUpdateParams.CustomValue>> LIZIZ;
    public Common LIZJ;
    public Context LIZLLL;
    public GeckoGlobalConfig LJ;
    public OD4 LJFF;
    public OD0 LJI;
    public final AtomicBoolean LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public volatile C61276O3c LJIIJJI;
    public C61560OEa LJIIL;
    public final java.util.Map<String, List<String>> LJIILIIL;
    public final java.util.Map<String, List<String>> LJIILJJIL;

    public final synchronized void LIZIZ() {
        IGeckoGlobalInit iGeckoGlobalInit;
        GeckoGlobalConfig LIZ;
        if (!this.LJII.get() && (iGeckoGlobalInit = (IGeckoGlobalInit) ServiceManager.get().getServiceForReal(IGeckoGlobalInit.class)) != null && (LIZ = iGeckoGlobalInit.LIZ()) != null) {
            LJI(LIZ);
        }
    }

    public final synchronized void LIZJ() {
        if (this.LJFF == null) {
            this.LJFF = new OD4(this.LJ);
            C61531OCx c61531OCx = new C61531OCx(this);
            OD4 od4 = this.LJFF;
            if (od4 != null) {
                C61575OEp c61575OEp = od4.LIZLLL;
                if (((List) c61575OEp.LJLIL) == null) {
                    c61575OEp.LJLIL = new CopyOnWriteArrayList();
                }
                ((List) c61575OEp.LJLIL).add(c61531OCx);
            }
        }
    }

    public final Common LIZLLL() {
        if (this.LIZJ == null) {
            LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = this.LJ;
            Common common = new Common(geckoGlobalConfig.getAppId(), geckoGlobalConfig.getAppVersion(), geckoGlobalConfig.getDeviceId(), geckoGlobalConfig.getRegion());
            this.LIZJ = common;
            common.appName = C61588OFc.LIZ(geckoGlobalConfig.getContext());
        }
        return this.LIZJ;
    }

    public final C61276O3c LJ() {
        if (this.LJIIJJI == null) {
            LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = this.LJ;
            if (geckoGlobalConfig == null) {
                return null;
            }
            O2T o2t = new O2T(geckoGlobalConfig.getContext());
            o2t.LIZJ(geckoGlobalConfig.getAppId());
            o2t.LJII = geckoGlobalConfig.getAppVersion();
            o2t.LJIIIIZZ = geckoGlobalConfig.getDeviceId();
            o2t.LIZ = geckoGlobalConfig.getNetWork();
            o2t.LJ = geckoGlobalConfig.getStatisticMonitor();
            o2t.LJIIIZ = geckoGlobalConfig.getHost();
            o2t.LIZ("gecko");
            o2t.LIZIZ("gecko");
            this.LJIIJJI = new C61276O3c(o2t);
        }
        return this.LJIIJJI;
    }

    public final void LJIIJJI() {
        C61560OEa c61560OEa = this.LJIIL;
        if (c61560OEa == null) {
            return;
        }
        c61560OEa.getClass();
        OC6.LIZ("gecko-debug-tag", "gecko update resume");
        c61560OEa.LIZ.set(false);
        synchronized (c61560OEa.LIZIZ) {
            c61560OEa.LIZIZ.notifyAll();
        }
    }

    public C61532OCy() {
        new HashMap();
        this.LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJII = new AtomicBoolean(false);
        this.LJIIIZ = false;
        this.LJIIJ = true;
        this.LJIILIIL = new HashMap();
        this.LJIILJJIL = new HashMap();
        this.LIZIZ = new ConcurrentHashMap();
    }

    public final GlobalConfigSettings LJFF() {
        LIZIZ();
        if (this.LJ == null) {
            return null;
        }
        LIZJ();
        OD4 od4 = this.LJFF;
        if (od4 == null) {
            return null;
        }
        return od4.LIZJ;
    }

    public final boolean LJII() {
        boolean z;
        GlobalConfigSettings LJFF = LJFF();
        if (LJFF != null && LJFF.getReqMeta() != null) {
            if (this.LJIIJ && LJFF.getReqMeta().getEnable() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJ = z;
        }
        OC6.LIZ("gecko-debug-tag", "gecko update enable:", Boolean.valueOf(this.LJIIJ));
        return this.LJIIJ;
    }

    public final void LIZ(String str) {
        java.util.Map<String, List<GlobalConfigSettings.SyncItem>> map;
        java.util.Map<String, List<GlobalConfigSettings.SyncItem>> map2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OD0 od0 = this.LJI;
        if (od0 != null && (map2 = od0.LJ) != null) {
            OC6.LIZ("gecko-debug-tag", i0.LJFF("cancel trigger update,occasion:", str), ((ConcurrentHashMap) map2).remove(str));
        }
        OD0 od02 = this.LJI;
        HashMap hashMap = null;
        if (od02 == null) {
            map = null;
        } else {
            map = od02.LIZJ;
        }
        if (this.LJIIL == null || map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<GlobalConfigSettings.SyncItem>> entry : map.entrySet()) {
            if (str.equals(entry.getKey())) {
                List<GlobalConfigSettings.SyncItem> value = entry.getValue();
                if (value == null || value.isEmpty()) {
                    return;
                }
                hashMap = new HashMap();
                for (GlobalConfigSettings.SyncItem syncItem : value) {
                    hashMap.put(syncItem.getAccessKey(), syncItem.getGroup());
                }
            }
        }
        if (hashMap == null) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "cancel update task,accessKey and group", hashMap);
        OAP oap = OAR.LIZ;
        if (oap.LIZJ == null) {
            oap.LIZJ = new OAW();
        }
        OEZ oez = oap.LIZJ.LJLILLLLZI;
        Iterator it = ((PriorityBlockingQueue) oez.LIZ).iterator();
        while (it.hasNext()) {
            Runnable runnable = (Runnable) it.next();
            if (!(runnable instanceof OER)) {
                return;
            }
            OER oer = (OER) runnable;
            String str2 = oer.LJLILLLLZI.LIZIZ;
            if (hashMap.keySet().contains(str2) && ((List) hashMap.get(str2)).contains(oer.LJLILLLLZI.LIZJ)) {
                OES oes = oer.LJLILLLLZI;
                if (7 == oes.LIZ) {
                    OC6.LIZ("gecko-debug-tag", "cancel update task in queue", oes);
                    ((PriorityBlockingQueue) oez.LIZ).remove(oer);
                }
            }
        }
    }

    public final void LJI(GeckoGlobalConfig geckoGlobalConfig) {
        int i;
        this.LJII.set(true);
        this.LJ = geckoGlobalConfig;
        Context context = geckoGlobalConfig.getContext();
        this.LIZLLL = context;
        if (context != null) {
            V3N.LJLIL = context;
        }
        C61521OCn c61521OCn = C61528OCu.LIZ;
        c61521OCn.getClass();
        OC6.LIZ("gecko-debug-tag", "loop manager init");
        C61532OCy c61532OCy = EBC.LIZ;
        c61521OCn.LIZ = c61532OCy.LJ();
        C61555ODv c61555ODv = C61573OEn.LIZ;
        if (c61555ODv.LIZJ.compareAndSet(false, true)) {
            c61555ODv.LIZ = c61532OCy.LJ();
            c61555ODv.LIZIZ = System.currentTimeMillis();
        }
        this.LJIIIIZZ = System.currentTimeMillis();
        ODP.LIZ();
        O5C o5c = C61318O4s.LIZ;
        Context context2 = geckoGlobalConfig.getContext();
        o5c.getClass();
        GeckoGlobalConfig.IMonitorConfig monitorConfig = geckoGlobalConfig.getMonitorConfig();
        if (monitorConfig != null && o5c.LIZIZ.compareAndSet(false, true)) {
            if (monitorConfig.isOversea()) {
                i = 3261;
            } else {
                i = 3262;
            }
            String valueOf = String.valueOf(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", geckoGlobalConfig.getDeviceId());
                jSONObject.put("host_aid", geckoGlobalConfig.getAppId());
                jSONObject.put("sdk_version", "3.4.2.2-bugfix");
                jSONObject.put("app_version", geckoGlobalConfig.getAppVersion());
                String channel = monitorConfig.getChannel();
                if (!TextUtils.isEmpty(channel)) {
                    jSONObject.put("channel", channel);
                }
                String updateVersionCode = monitorConfig.getUpdateVersionCode();
                if (!TextUtils.isEmpty(updateVersionCode)) {
                    jSONObject.put("update_version_code", updateVersionCode);
                }
                String packageId = monitorConfig.getPackageId();
                if (!TextUtils.isEmpty(packageId)) {
                    jSONObject.put("package_name", packageId);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(monitorConfig.getMonitorHost());
                LIZ.append("/monitor/collect/");
                SDKMonitorUtils.LJ(valueOf, Collections.singletonList(X1D.LIZIZ(LIZ)));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(monitorConfig.getMonitorHost());
                LIZ2.append("/monitor/appmonitor/v2/settings");
                SDKMonitorUtils.LIZLLL(valueOf, Collections.singletonList(X1D.LIZIZ(LIZ2)));
                SDKMonitorUtils.LIZJ(C16880lQ.LLLLL(context2), valueOf, jSONObject, new OD3(monitorConfig, geckoGlobalConfig));
                o5c.LIZ = SDKMonitorUtils.LIZIZ(valueOf);
            } catch (JSONException e) {
                OC6.LIZ("gecko-debug-tag", "monitor init failed", e);
            }
        }
        this.LJIIL = new C61560OEa();
        Context context3 = this.LIZLLL;
        o.LJIIJ(context3, "context");
        if (C61510OCc.LIZ == null) {
            C61510OCc.LIZ = context3;
        }
    }

    public final void LJIIIIZZ(long... jArr) {
        C61560OEa c61560OEa = this.LJIIL;
        if (c61560OEa == null) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "gecko update pause");
        c61560OEa.LIZ.set(true);
        if (jArr.length > 0) {
            OE5 oe5 = C61572OEm.LIZ;
            oe5.LIZ(8);
            oe5.LIZIZ(new OEO(this), jArr[0] * 1000);
        }
    }

    public final void LJIILIIL(String str) {
        List<GlobalConfigSettings.SyncItem> LIZIZ;
        OD0 od0 = this.LJI;
        if (od0 == null || (LIZIZ = od0.LIZIZ(str, false)) == null || LIZIZ.isEmpty()) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "trigger update occasion lately");
        if (od0.LIZLLL.get() == 0) {
            od0.LIZ(7, 0, LIZIZ);
            return;
        }
        if (od0.LJ == null) {
            od0.LJ = new ConcurrentHashMap();
        }
        List list = (List) ((ConcurrentHashMap) od0.LJ).get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
        }
        list.addAll(LIZIZ);
        ((ConcurrentHashMap) od0.LJ).put(str, list);
    }

    public final void LJIIIZ(String str, java.util.Map<String, OptionCheckUpdateParams.CustomValue> map) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("gecko register custom params,accessKey:", str, ",custom params:");
        LIZIZ.append(map.keySet());
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZIZ));
        java.util.Map<String, java.util.Map<String, OptionCheckUpdateParams.CustomValue>> map2 = this.LIZIZ;
        if (TextUtils.isEmpty(str) || map.isEmpty()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map2;
        java.util.Map map3 = (java.util.Map) concurrentHashMap.get(str);
        if (map3 != null) {
            map3.putAll(map);
        } else {
            concurrentHashMap.put(str, map);
        }
    }

    public final void LJIIL(int i, String str) {
        List<GlobalConfigSettings.SyncItem> LIZIZ;
        int i2;
        OD0 od0 = this.LJI;
        if (od0 == null || (LIZIZ = od0.LIZIZ(str, true)) == null || LIZIZ.isEmpty()) {
            return;
        }
        if (str.startsWith("occasion_gecko_register")) {
            i2 = 0;
        } else {
            i2 = 7;
        }
        od0.LIZ(i2, i, LIZIZ);
    }

    public static void LJIIJ(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (list == null || list.isEmpty()) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            if (OD0.LJFF == null) {
                OD0.LJFF = new ConcurrentHashMap();
            }
            OC6.LIZ("gecko-debug-tag", i0.LJFF("register accessKey update occasion:", str), str2);
            java.util.Map map = (java.util.Map) ((ConcurrentHashMap) OD0.LJFF).get(str);
            if (map == null) {
                Hashtable hashtable = new Hashtable();
                hashtable.put(str2, new UpdateModel());
                ((ConcurrentHashMap) OD0.LJFF).put(str, hashtable);
                return;
            }
            map.put(str2, new UpdateModel());
            return;
        }
        if (OD0.LJFF == null) {
            OD0.LJFF = new ConcurrentHashMap();
        }
        OC6.LIZ("gecko-debug-tag", i0.LJFF("register group update occasion:", str), str2, list);
        java.util.Map map2 = (java.util.Map) ((ConcurrentHashMap) OD0.LJFF).get(str);
        if (map2 == null) {
            Hashtable hashtable2 = new Hashtable();
            hashtable2.put(str2, new UpdateModel(new CopyOnWriteArrayList(list), null));
            ((ConcurrentHashMap) OD0.LJFF).put(str, hashtable2);
            return;
        }
        UpdateModel updateModel = (UpdateModel) map2.get(str2);
        if (updateModel == null) {
            map2.put(str2, new UpdateModel(new CopyOnWriteArrayList(list), null));
            return;
        }
        if (updateModel.getGroups() == null && updateModel.getChannels() == null) {
            return;
        }
        if (updateModel.getGroups() == null) {
            updateModel.setGroups(new CopyOnWriteArrayList(list));
        } else {
            updateModel.getGroups().addAll(list);
        }
    }
}
