package com.bytedance.helios.binder.impl;

import X.C66030Pvm;
import X.C66031Pvn;
import X.C66059PwF;
import X.C66074PwU;
import X.C66126PxK;
import X.C66196PyS;
import X.InterfaceC65994PvC;
import X.InterfaceC66045Pw1;
import android.app.Application;
import android.content.Context;
import com.bytedance.helios.api.HeliosService;
import com.bytedance.helios.api.config.BinderConfig;
import com.bytedance.helios.api.config.SettingsModel;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class BinderService implements HeliosService {
    public BinderConfig mBinderConfig;
    public Context mContext;

    public void stop() {
    }

    @Override // com.bytedance.helios.api.HeliosService
    public void start() {
        if (this.mBinderConfig != null && this.mContext != null) {
            BinderMonitor binderMonitor = BinderMonitor.get();
            C66126PxK c66126PxK = new C66126PxK(this.mContext);
            binderMonitor.getClass();
            if (!((CopyOnWriteArrayList) binderMonitor.LIZ).contains(c66126PxK)) {
                ((CopyOnWriteArrayList) binderMonitor.LIZ).add(c66126PxK);
            }
            C66074PwU.LIZ(this.mBinderConfig);
            binderMonitor.LIZIZ(this.mBinderConfig, this.mContext);
        }
    }

    private void setExceptionMonitor(InterfaceC65994PvC monitor) {
        C66196PyS c66196PyS = new C66196PyS();
        o.LJIIIZ(monitor, "monitor");
        c66196PyS.LIZ = monitor;
        C66059PwF.LJ.LIZ(c66196PyS);
    }

    @Override // X.InterfaceC66032Pvo
    public void onNewSettings(SettingsModel settingsModel) {
        if (!settingsModel.binderConfig.equals(this.mBinderConfig)) {
            this.mBinderConfig = settingsModel.binderConfig;
            BinderMonitor.get().LIZIZ(this.mBinderConfig, this.mContext);
            C66074PwU.LIZ(this.mBinderConfig);
        }
    }

    @Override // X.InterfaceC66049Pw5
    public void init(Application application, InterfaceC66045Pw1 interfaceC66045Pw1, Map<String, Object> map) {
        setExceptionMonitor(interfaceC66045Pw1.LIZIZ());
        this.mContext = application;
        C66031Pvn LJFF = interfaceC66045Pw1.LJFF();
        LJFF.getClass();
        this.mBinderConfig = new C66030Pvm(LJFF).LIZ().binderConfig;
    }
}
