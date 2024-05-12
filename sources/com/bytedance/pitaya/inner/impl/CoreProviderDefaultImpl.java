package com.bytedance.pitaya.inner.impl;

import com.bytedance.pitaya.api.CoreProvider;
import com.bytedance.pitaya.api.IPitayaCore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class CoreProviderDefaultImpl implements CoreProvider {
    public static final CoreProviderDefaultImpl INSTANCE = new CoreProviderDefaultImpl();
    public static final Map<String, IPitayaCore> coreMap = new LinkedHashMap();

    @Override // com.bytedance.pitaya.api.CoreProvider
    public IPitayaCore getCore(String aid) {
        IPitayaCore iPitayaCore;
        o.LJIIJ(aid, "aid");
        Map<String, IPitayaCore> map = coreMap;
        synchronized (map) {
            iPitayaCore = map.get(aid);
            if (iPitayaCore == null) {
                iPitayaCore = new CoreDefaultImpl(false, aid);
                map.put(aid, iPitayaCore);
            }
        }
        return iPitayaCore;
    }

    public final void injectHost$pitaya_i18nTocRelease(String hostAid, IPitayaCore hostCore) {
        o.LJIIJ(hostAid, "hostAid");
        o.LJIIJ(hostCore, "hostCore");
        coreMap.put(hostAid, hostCore);
    }
}
