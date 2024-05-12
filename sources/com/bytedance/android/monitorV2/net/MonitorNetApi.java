package com.bytedance.android.monitorV2.net;

import X.E8M;
import X.EJ6;
import X.EKC;
import X.InterfaceC195727mC;
import X.InterfaceC195767mG;
import X.InterfaceC37276Ek4;
import com.google.gson.m;
import java.util.List;

/* loaded from: classes7.dex */
public interface MonitorNetApi {
    @E8M("/monitor_web/settings/hybrid-settings")
    @EKC({"Content-Type: application/json"})
    InterfaceC37276Ek4<String> doPost(@InterfaceC195767mG List<EJ6> list, @InterfaceC195727mC m mVar);
}
