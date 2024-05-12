package com.bytedance.helios.nativeaudio;

import X.C0BU;
import X.C36836Ecy;
import X.C65972Puq;
import X.C65976Puu;
import X.C65977Puv;
import X.HandlerThreadC64418PPy;
import X.InterfaceC66045Pw1;
import android.app.Application;
import com.bytedance.helios.api.HeliosService;
import com.bytedance.helios.api.config.SettingsModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class NativeAudioService implements HeliosService {
    public Application mContext;

    public static /* synthetic */ void lambda$semisugar$startMonitor$0(AudioMonitorImpl audioMonitorImpl) {
        audioMonitorImpl.LIZJ();
    }

    @Override // X.InterfaceC66032Pvo
    public void onNewSettings(SettingsModel settingsModel) {
    }

    public void stop() {
    }

    @Override // com.bytedance.helios.api.HeliosService
    public void start() {
        C65976Puu c65976Puu = (C65976Puu) ((LinkedHashMap) C65972Puq.LIZJ).get("nar");
        if (c65976Puu == null) {
            C65977Puv c65977Puv = C65972Puq.LIZIZ;
            if (c65977Puv == null) {
                return;
            } else {
                c65976Puu = c65977Puv.LJLJL;
            }
        }
        if (c65976Puu == null) {
            return;
        }
        if ((!c65976Puu.LJLIL && !c65976Puu.LJLILLLLZI) || !C36836Ecy.LIZIZ(this.mContext)) {
            return;
        }
        AudioMonitorImpl audioMonitorImpl = new AudioMonitorImpl();
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.postDelayed(new C0BU(4, audioMonitorImpl), 5000L);
    }

    @Override // X.InterfaceC66049Pw5
    public void init(Application application, InterfaceC66045Pw1 interfaceC66045Pw1, Map<String, Object> map) {
        this.mContext = application;
    }
}
