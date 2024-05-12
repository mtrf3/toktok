package com.bytedance.helios.cache;

import X.C0MA;
import X.C66030Pvm;
import X.C66031Pvn;
import X.C66050Pw6;
import X.C66051Pw7;
import X.C66273Pzh;
import X.InterfaceC66045Pw1;
import X.InterfaceC66049Pw5;
import android.app.Application;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.cache.config.CacheConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CacheComponent implements InterfaceC66049Pw5 {
    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        o.LJIIIZ(newSettings, "newSettings");
        C66273Pzh.LIZ((CacheConfig) GsonProtectorUtils.fromJson(new Gson(), (j) newSettings.cacheConfig, CacheConfig.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC66049Pw5
    public final void init(Application application, InterfaceC66045Pw1 proxy, Map<String, Object> map) {
        o.LJIIIZ(application, "application");
        o.LJIIIZ(proxy, "proxy");
        Object orDefault = ((C0MA) map).getOrDefault("debug", null);
        if (orDefault != null) {
            ((Boolean) orDefault).booleanValue();
        }
        C66273Pzh.LIZ = new C66051Pw7(proxy);
        C66273Pzh.LIZIZ = new C66050Pw6(proxy);
        C66031Pvn LJFF = proxy.LJFF();
        o.LJIIIIZZ(LJFF, "proxy.dataProxy");
        C66273Pzh.LIZ((CacheConfig) GsonProtectorUtils.fromJson(new Gson(), (j) new C66030Pvm(LJFF).LIZ().cacheConfig, CacheConfig.class));
    }
}
