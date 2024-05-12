package com.bytedance.helios.network.skynet.impl;

import X.C65905Ptl;
import X.C65949PuT;
import X.C65951PuV;
import X.C65952PuW;
import X.HandlerThreadC64418PPy;
import X.HandlerThreadC65936PuG;
import Y.ARunnableS10S0210000_11;
import Y.ARunnableS17S0110000_11;
import android.content.Context;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.SkynetConfig;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.service.ISkynetService;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SkynetServiceImpl implements ISkynetService {
    public static final C65951PuV Companion = new C65951PuV();

    private final void initDNSCallback() {
        C65949PuT.LIZ.LJLILLLLZI = C65952PuW.LIZ;
    }

    @Override // com.bytedance.helios.network.api.service.ISkynetService
    public void initDNSControl(Context context) {
        NetworkConfig networkConfig;
        SkynetConfig skynetConfig;
        o.LJIIIZ(context, "context");
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings == null || (networkConfig = settings.networkConfig) == null || (skynetConfig = networkConfig.skynetConfig) == null || !skynetConfig.enabled) {
            return;
        }
        boolean LIZ = C65905Ptl.LIZ(skynetConfig.sampleRate);
        initDNS(context, LIZ);
        initDNSCallback();
        initDNSGuard(context, LIZ);
    }

    private final void initDNS(Context context, boolean z) {
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS17S0110000_11(context, z, 2));
    }

    private final void initDNSGuard(Context context, boolean z) {
        NetworkConfig networkConfig;
        SkynetConfig skynetConfig;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null && (skynetConfig = networkConfig.skynetConfig) != null) {
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.postDelayed(new ARunnableS10S0210000_11(context, skynetConfig, z, 1), skynetConfig.analyzeDelayTime);
        }
    }
}
