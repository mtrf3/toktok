package com.bytedance.apm.config;

import X.AnonymousClass028;
import X.C09970aH;
import X.C16880lQ;
import X.C17N;
import X.C61491OBj;
import X.C64100PDs;
import X.F9U;
import X.InterfaceC58333Muv;
import X.InterfaceC64073PCr;
import X.InterfaceC64103PDv;
import X.SharedPreferencesC37314Ekg;
import X.X1D;
import Y.IDBReceiverS6S0100000_6;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.slardar.config.IConfigManager;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SlardarConfigManagerImpl implements IConfigManager {
    public C64100PDs mSlardarConfigFetcher = new C64100PDs();

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void fetchConfig() {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        boolean LJIIIZ = c64100PDs.LJIIIZ();
        if (C09970aH.LJIIIIZZ()) {
            if (c64100PDs.LJLLILLLL > System.currentTimeMillis()) {
                LJIIIZ = true;
            }
            c64100PDs.LJI(LJIIIZ);
        }
    }

    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.LJLL;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.LJLIL;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public String queryConfig() {
        return this.mSlardarConfigFetcher.LJFF();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject getConfigJSON(String str) {
        JSONObject jSONObject;
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        c64100PDs.getClass();
        if (TextUtils.isEmpty(str) || (jSONObject = c64100PDs.LJLL) == null) {
            return new JSONObject();
        }
        return jSONObject.optJSONObject(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getLogTypeSwitch(String str) {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        c64100PDs.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(str, "block_monitor")) {
            str = "caton_monitor";
        }
        if (TextUtils.equals(str, "core_exception_monitor")) {
            return c64100PDs.LJLILLLLZI;
        }
        if (c64100PDs.LJLJI == null || c64100PDs.LJLJI.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getMetricTypeSwitch(String str) {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        if (c64100PDs.LJLJJI == null || TextUtils.isEmpty(str) || c64100PDs.LJLJJI.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getServiceSwitch(String str) {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        if (c64100PDs.LJLJJL == null || TextUtils.isEmpty(str) || c64100PDs.LJLJJL.optInt(str) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getSwitch(String str) {
        JSONObject jSONObject;
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        c64100PDs.getClass();
        if (TextUtils.isEmpty(str) || (jSONObject = c64100PDs.LJLL) == null) {
            return false;
        }
        return jSONObject.optBoolean(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerConfigListener(InterfaceC64103PDv interfaceC64103PDv) {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        if (interfaceC64103PDv == null) {
            c64100PDs.getClass();
            return;
        }
        if (c64100PDs.LJZI == null) {
            c64100PDs.LJZI = new CopyOnWriteArrayList();
        }
        if (!((CopyOnWriteArrayList) c64100PDs.LJZI).contains(interfaceC64103PDv)) {
            ((CopyOnWriteArrayList) c64100PDs.LJZI).add(interfaceC64103PDv);
        }
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addConfigListener, mReady=");
            LIZ.append(c64100PDs.LJLIL);
            X1D.LIZIZ(LIZ);
        }
        if (!c64100PDs.LJLIL) {
            return;
        }
        interfaceC64103PDv.LJ(c64100PDs.LJLL, c64100PDs.LJLLI);
        interfaceC64103PDv.LIZ();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerResponseConfigListener(InterfaceC64073PCr interfaceC64073PCr) {
        if (interfaceC64073PCr == null) {
            return;
        }
        if (C61491OBj.LJLJLJ == null) {
            C61491OBj.LJLJLJ = new CopyOnWriteArrayList();
        }
        if (((CopyOnWriteArrayList) C61491OBj.LJLJLJ).contains(interfaceC64073PCr)) {
            return;
        }
        ((CopyOnWriteArrayList) C61491OBj.LJLJLJ).add(interfaceC64073PCr);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterConfigListener(InterfaceC64103PDv interfaceC64103PDv) {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        if (interfaceC64103PDv == null) {
            c64100PDs.getClass();
            return;
        }
        List<InterfaceC64103PDv> list = c64100PDs.LJZI;
        if (list == null) {
            return;
        }
        ((CopyOnWriteArrayList) list).remove(interfaceC64103PDv);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterResponseConfigListener(InterfaceC64073PCr interfaceC64073PCr) {
        List list;
        if (interfaceC64073PCr == null || (list = C61491OBj.LJLJLJ) == null) {
            return;
        }
        ((CopyOnWriteArrayList) list).remove(interfaceC64073PCr);
    }

    public void forceUpdateFromRemote(InterfaceC58333Muv interfaceC58333Muv, List<String> list) {
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        c64100PDs.LJIIIZ();
        if (interfaceC58333Muv != null) {
            c64100PDs.LJLJLLL = interfaceC58333Muv;
        }
        if (!C17N.LJJIIZI(list)) {
            c64100PDs.LJLJJLL = new ArrayList(list);
        }
        c64100PDs.LJI(true);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public int getConfigInt(String str, int i) {
        JSONObject jSONObject;
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        c64100PDs.getClass();
        if (TextUtils.isEmpty(str) || (jSONObject = c64100PDs.LJLL) == null) {
            return i;
        }
        return jSONObject.optInt(str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public void initParams(boolean z, InterfaceC58333Muv interfaceC58333Muv, List<String> list) {
        ?? emptyList;
        C64100PDs c64100PDs = this.mSlardarConfigFetcher;
        c64100PDs.LJLLLLLL = z;
        c64100PDs.LJLZ = C09970aH.LJIIIIZZ();
        if (c64100PDs.LJLJLJ == null) {
            synchronized (c64100PDs) {
                if (c64100PDs.LJLJLJ == null) {
                    c64100PDs.LJLJLJ = SharedPreferencesC37314Ekg.LIZIZ(C09970aH.LIZ, "monitor_config");
                }
            }
        }
        c64100PDs.LJLJLLL = interfaceC58333Muv;
        if (!C17N.LJJIIZI(list)) {
            if (!C17N.LJJIIZI(list)) {
                emptyList = new ArrayList(2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    String host = new URL((String) ListProtector.get(list, i)).getHost();
                    if (!TextUtils.isEmpty(host) && host.indexOf(46) > 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("https://");
                        LIZ.append(host);
                        LIZ.append("/monitor/appmonitor/v4/settings");
                        emptyList.add(X1D.LIZIZ(LIZ));
                    }
                }
                c64100PDs.LJLJJLL = emptyList;
            }
            emptyList = Collections.emptyList();
            c64100PDs.LJLJJLL = emptyList;
        }
        if (!c64100PDs.LJLLLL) {
            c64100PDs.LJLLLL = true;
            if (c64100PDs.LJLZ || c64100PDs.LJLLLLLL) {
                F9U.LIZ.LIZ(c64100PDs);
            }
            IntentFilter LIZ2 = AnonymousClass028.LIZ("com.apm.setting.update.action");
            IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6 = new IDBReceiverS6S0100000_6(c64100PDs, 7);
            Context context = C09970aH.LIZ;
            if (context != null) {
                C16880lQ.LJJLIIIJILLIZJL(iDBReceiverS6S0100000_6, context, LIZ2);
            }
        }
    }
}
