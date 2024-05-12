package com.bytedance.android.livesdkapi.host;

import X.CGB;
import X.InterfaceC06390Mx;
import X.PMC;
import X.PMR;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IHostPerformanceMonitor extends InterfaceC06390Mx {
    void Cj();

    Map<String, String> Fk(Context context);

    PMC IW(String str);

    double IZ();

    void Ve();

    CGB aD();

    PMR dt0();

    void ed0();

    HashMap<String, Double> getCpuRate();

    HashMap<String, Long> getMemory();
}
