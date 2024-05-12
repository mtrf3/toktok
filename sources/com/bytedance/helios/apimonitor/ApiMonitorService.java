package com.bytedance.helios.apimonitor;

import X.C66129PxN;
import X.C66170Py2;
import X.InterfaceC66045Pw1;
import android.app.Application;
import com.bytedance.helios.api.HeliosService;
import com.bytedance.helios.api.config.SettingsModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class ApiMonitorService implements HeliosService {
    public final C66129PxN mDetectionManager = C66129PxN.LIZLLL;

    @Override // X.InterfaceC66032Pvo
    public void onNewSettings(SettingsModel settingsModel) {
    }

    public void stop() {
    }

    @Override // com.bytedance.helios.api.HeliosService
    public void start() {
        this.mDetectionManager.getClass();
    }

    @Override // X.InterfaceC66049Pw5
    public void init(Application application, InterfaceC66045Pw1 interfaceC66045Pw1, Map<String, Object> map) {
        C66129PxN instance = this.mDetectionManager;
        C66170Py2.LIZIZ.getClass();
        o.LJIIIZ(instance, "instance");
        C66170Py2.LIZ = instance;
    }
}
